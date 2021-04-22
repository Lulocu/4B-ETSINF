
Java.perform(function(){
  var wallet=Java.use("com.ironhackers.androidlab.Wallet");
  Java.choose('com.ironhackers.androidlab.Createme', {
    onMatch: function(instance) {
		Java.scheduleOnMainThread(function () { 
			instance.person.value.setWallet(wallet.$new(100));
	
			var textview = Java.use('android.widget.TextView');
			var balObj = instance.findViewById(2131230785); //0x7f080041 
			var balTV = Java.cast(balObj, textview);
			var string = Java.use('java.lang.String');
	        balTV.setText(string.$new('100'));
		});
    },
    onComplete: function() {
	}
  });
  
});