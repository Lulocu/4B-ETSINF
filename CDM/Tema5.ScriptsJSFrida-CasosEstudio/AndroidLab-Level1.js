

Java.perform(function () {
	
	
	var callmeActivity = Java.use("com.android.insecurebankv2.LoginActivity");

	callmeActivity.performLogin.implementation = function(bundle) {
				var post = Java.use("com.android.insecureBankv2.PostLOgin");
				bundle.PostLogin.onCreate(PostLogin.$new())


				var i = new Intent(this, PostLogin.class);
				console.log("Invocando");
				startActivity(i);

	};
		
});