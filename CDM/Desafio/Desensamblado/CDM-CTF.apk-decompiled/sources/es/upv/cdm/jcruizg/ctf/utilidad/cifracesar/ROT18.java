package es.upv.cdm.jcruizg.ctf.utilidad.cifracesar;

public class ROT18 extends ROT {
    public ROT18() {
        super(18);
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar, es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT
    public String decode(String str) {
        return rotate(str);
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar, es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT
    public String encode(String str) {
        return rotate(str);
    }

    /* access modifiers changed from: protected */
    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT
    public char rotateChar(char c) {
        if (Character.isDigit(c)) {
            return rotateDigit(c, 5);
        }
        return rotateLetter(c, 13);
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar
    public TipoCifra tipo() {
        return TipoCifra.ROT18;
    }
}
