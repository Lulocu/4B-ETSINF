package es.upv.cdm.jcruizg.ctf.utilidad.cifracesar;

public class ROT13 extends ROT {
    public ROT13() {
        super(13);
    }

    /* access modifiers changed from: protected */
    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT
    public char rotateChar(char c) {
        return rotateLetter(c);
    }

    /* access modifiers changed from: protected */
    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT
    public String rotate(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            stringBuffer.append(rotateLetter(str.charAt(i)));
        }
        return stringBuffer.toString();
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar
    public TipoCifra tipo() {
        return TipoCifra.ROT13;
    }
}
