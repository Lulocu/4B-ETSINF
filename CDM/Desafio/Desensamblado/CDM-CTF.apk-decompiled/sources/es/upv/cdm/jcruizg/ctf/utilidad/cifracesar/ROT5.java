package es.upv.cdm.jcruizg.ctf.utilidad.cifracesar;

public class ROT5 extends ROT {
    public ROT5() {
        super(5);
    }

    /* access modifiers changed from: protected */
    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.ROT
    public char rotateChar(char c) {
        return rotateDigit(c);
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar
    public TipoCifra tipo() {
        return TipoCifra.ROT5;
    }
}
