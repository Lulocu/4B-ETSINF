Java.perform(

	function(){

		// Lists all names (exports, imports and symbols) in the given module
		// if a 'needle' is given this function returns the address of the name
		// that matches the 'needle'
		function listNames(modulo, funcion) {
			var address = undefined;
			console.log("Nombres encontrados en " + modulo + ":");
			Process.enumerateModules()
				.filter(function(m){ return m["path"].toLowerCase().indexOf(modulo) != -1; })
				.forEach(function(mod) {
					mod.enumerateExports().forEach(function (entry) {
						console.log("Exportados: " + entry.name );
						if (entry.name.indexOf(funcion) != -1) address = entry.address;
					});
					mod.enumerateImports().forEach(function (entry) {
						console.log("Importados: " + entry.name );
						if (entry.name.indexOf(funcion) != -1) address = entry.address;
					});
					mod.enumerateSymbols().forEach(function (entry) {
						console.log("Nombre de símbolo: " + entry.name );
						if (entry.name.indexOf(funcion) != -1) address = entry.address;
					});
				});
			console.log("");
			return address;
		}
		
		
		function attachToStrncmp(strncmpAddress) {
			Interceptor.attach(strncmpAddress, {
				// strncmp takes 3 arguments, str1, str2, max number of characters to compare
				onEnter: function(args) {
						arg0 = args[0].readUtf8String();
						arg1 = args[1].readUtf8String();
						arg2 = args[2].toInt32();
						console.log("Invocación a strncmp (arg0: " + arg0 + ", arg1: " + arg1 + ", arg2: " + arg2)+")";
					}
				},
				onLeave: function (retval) {
				}
			});
		}
		
		var actividadPpal =  Java.use("sg.vantagepoint.uncrackable2.MainActivity");
		actividadPpal.onResume.implementation = function() {
			this.onResume();
			var addrStrNCmp = listNames('libfoo.so', 'strcmpAddress');
			attachToStrncmp(addrStrNCmp);
		};	
	}

);