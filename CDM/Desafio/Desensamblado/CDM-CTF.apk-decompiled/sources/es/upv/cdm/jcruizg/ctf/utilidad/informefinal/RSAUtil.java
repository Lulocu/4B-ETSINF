package es.upv.cdm.jcruizg.ctf.utilidad.informefinal;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSAUtil {
    private static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCDpRO/Z3GlTrfm2xHokA49px+XakY7wuFYyjUpVUqu4STbfKwvL2i9eay0MvI4bXDVJQc+X+FgCOrYPEW6fq8DEFj7ZYAdvgxr2LgtPeRrDjiu2VrEZlBl+xpqwgGNdRyffDQRvlavqM5UpzW5l6ymChE3Np/0N7OKkOa5BPEZiQIDAQAB";

    public static PublicKey getPublicKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeySpecException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] encrypt(String str, String str2) throws UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, getPublicKey(str2));
        return instance.doFinal(str.getBytes());
    }

    public static byte[] encrypt(String str) throws UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException {
        return encrypt(str, publicKey);
    }
}
