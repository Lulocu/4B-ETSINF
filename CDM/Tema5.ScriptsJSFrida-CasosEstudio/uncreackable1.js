
//
// owasp.mstg.uncrackable2
// $ frida -U -f vantagepoint.uncrackable1 -l uncreackable1.js
//
Java.perform(

	function () { 
		console.log('');
		console.log('*************************************************************************');
		console.log('** CDM: Script para capturar el código secreto de la app UNCRACKEABLE1 **');
		console.log('*************************************************************************');

		
		function bufferToString(buf) {
			var buffer = Java.array('byte', buf);
			var result = "";
			for(var i = 0; i < buffer.length; ++i){
				result += String.fromCharCode(buffer[i]);
			}
			return result;
		};
  
		var clase = Java.use("sg.vantagepoint.a.a");
		
		clase.a.implementation = function(ba1, ba2) {
				const retval = this.a(ba1, ba2);
				console.log('');
				console.log("> El código secreto que buscas es: [" + bufferToString(retval)+"]");
				return retval;
		};
		
		
		var verificador = Java.use("sg.vantagepoint.uncrackable1.Verificador");
		verificador.verifica_entrada.implementation = function(str1) {
				console.log('');
				console.log("> Tu código [" + str1+"] es ahora el código correcto");
				const retval = this.verifica_entrada(str1);
				return true;
		};
		
		
		var actividadPpal =  Java.use("sg.vantagepoint.uncrackable1.MainActivity");
		actividadPpal.onResume.implementation = function() {
			this.onResume();
			verificador.verifica_entrada("entrada_dummy");
		};
	}
);