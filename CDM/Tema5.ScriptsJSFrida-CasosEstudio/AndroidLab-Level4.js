

Java.perform(function(){
	
	var sniffObj = Java.use("com.ironhackers.androidlab.Sniff");

	sniffObj.generateFlag.implementation = function(str1, str2) {
				console.log('');
				console.log("> El flag buscado es: " + str2);
				this.generateFlag(str2, str2);
	};
  
});