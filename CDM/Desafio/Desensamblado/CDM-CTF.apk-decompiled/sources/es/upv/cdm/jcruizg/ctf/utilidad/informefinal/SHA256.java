package es.upv.cdm.jcruizg.ctf.utilidad.informefinal;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    public static String computeHash(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.reset();
        byte[] digest = instance.digest(str.getBytes("UTF-8"));
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return stringBuffer.toString();
    }
}
