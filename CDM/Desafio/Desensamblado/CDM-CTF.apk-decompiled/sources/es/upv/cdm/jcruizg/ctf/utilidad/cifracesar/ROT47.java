package es.upv.cdm.jcruizg.ctf.utilidad.cifracesar;

public class ROT47 extends ROT {
    public ROT47() {
        super(47);
    }

    /* access modifiers changed from: protected */
    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT
    public char rotateChar(char c) {
        if (c == ' ') {
            return c;
        }
        char rotateChar = rotateChar(c, 47);
        return rotateChar > '~' ? rotateChar(rotateChar, -94) : rotateChar;
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar
    public TipoCifra tipo() {
        return TipoCifra.ROT47;
    }
}
