// $ adb shell pm list packages
// owasp.mstg.uncrackable1
// $ frida -U owasp.mstg.uncrackable1 -l  uncrack1_frida2.js 

Java.perform(function () { 
	console.log('it works.');
	function modulus(x, n) {
        return ((x % n) + n) % n;
    }
	function b2s(array) {
    	var result = "";
    	for (var i = 0; i < array.length; i++) {
    		result += String.fromCharCode(modulus(array[i], 256));
    	}
    	return result;
    }
	var a = Java.use('sg.vantagepoint.a.a');
// package sg.vantagepoint.uncrackable1;
// public class C0000a {
// public static byte[] m0a(byte[] bArr, byte[] bArr2) {
	a.a.implementation = function (arr1, arr2) {
		var retValue = a.a.call(this,arr1, arr2);

		console.log("Hook ! flag: "+b2s(retValue));
		return retValue;
    	}; 

});