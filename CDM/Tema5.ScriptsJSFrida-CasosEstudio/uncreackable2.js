
// owasp.mstg.uncrackable2
// $ frida -U -f owasp.mstg.uncrackable2 -l uncrackable2.js

Java.perform(

	function () { 
		console.log('');
		console.log('*************************************************************************');
		console.log('** CDM: Script para capturar el código secreto de la app UNCRACKEABLE2 **');
		console.log('*************************************************************************');
	
		var system = Java.use('java.lang.System');
		system.exit.implementation = function (arr1) {
			console.log("");
			console.log(">> [System.exit] Inhibo la llamada, con lo que la app no terminará");
		}; 		
		
		var codeCheck = Java.use('sg.vantagepoint.uncrackable2.CodeCheck');
		codeCheck.a.implementation = function (arr1) {
			console.log("");
			console.log(">> [CodeCheck.a] Verificando el string ["+arr1+"]");
			const retVal = this.a(arr1);
			console.log(">>               Pero pasando del resultado (devuelvo true siempre)");
			return retVal;
		}; 
		
		
		function attachToStrncmp() {
			Interceptor.attach(Module.getExportByName('libfoo.so', 'strncmp'), {
				// strncmp recibe 3 argument0s, str1, str2, max número de caracteres a comparar
				onEnter: function (args) {
					var numC = args[2].toInt32();
					if (numC != 23){
						return; //si no son 23 caractéres los comparados no hacemos caso a la comparación
					}
					var str1 = args[0].readUtf8String();
					var str2 = args[1].readUtf8String();
					console.log(">> [attachToStrncmp] strncmp ejecutado\n"
								  + "    - str1: " + str1 + "\n"
						          + "    - str2: " + str2 + "\n"
						          + "    - numC: " + numC + "\n");
				},
			});
		};
		
		var actividadPpal =  Java.use("sg.vantagepoint.uncrackable2.MainActivity");
		actividadPpal.onResume.implementation = function() {
			console.log(">> [MainActivity.resume] Allá vamos");
			this.onResume();
			attachToStrncmp();	
			
			var entrada23Caracteres = '01234567890123456789123';
			Java.choose("sg.vantagepoint.uncrackable2.CodeCheck", {
				onMatch : function(instance) {
					instance.a(Java.use("java.lang.String").$new(entrada23Caracteres));
					return "stop";
				},
				onComplete:function() {}
			});
			Interceptor.detachAll();			
		};	

	}


);