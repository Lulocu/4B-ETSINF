
Java.perform(function () {
	
	
	var atClass = Java.use("com.ironhackers.androidlab.Alwaystrue");

	atClass.imposible_check.implementation = function() {
				console.log('');
				console.log("> Ejecutando impossible_check() ");
				return true;
	};
		
});