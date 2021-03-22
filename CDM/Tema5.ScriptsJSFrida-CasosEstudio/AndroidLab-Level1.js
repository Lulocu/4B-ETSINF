

Java.perform(function () {
	
	
	var callmeActivity = Java.use("com.android.insecurebankv2.LoginActivity");

	callmeActivity.onCreate.implementation = function(bundle) {
				console.log('');
				console.log("> Ejecutando onCreate(...) ");
				var post = Java.use("com.android.insecureBankv2.PostLogin");
				var i = new Intent(this, PostLogin.class);
				console.log("> Invocando call:me_win() ");
				startActivity(i);
	};
		
});