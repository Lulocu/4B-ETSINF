package es.upv.cdm.jcruizg.ctf.utilidad.cifracesar;

public abstract class ROT extends CifraCesar {
    private int positions = 0;

    /* access modifiers changed from: protected */
    public abstract char rotateChar(char c);

    /* access modifiers changed from: protected */
    public char rotateChar(char c, int i) {
        return (char) (c + i);
    }

    public ROT(int i) {
        this.positions = i;
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar
    public String decode(String str) {
        return rotate(str);
    }

    @Override // es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar
    public String encode(String str) {
        return rotate(str);
    }

    /* access modifiers changed from: protected */
    public String rotate(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(rotateChar(str.charAt(i)));
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public char rotateDigit(char c, int i) {
        if (c < '0' || c > '4') {
            return (c < '4' || c > '9') ? c : rotateChar(c, -i);
        }
        return rotateChar(c, i);
    }

    /* access modifiers changed from: protected */
    public char rotateDigit(char c) {
        return rotateDigit(c, this.positions);
    }

    /* access modifiers changed from: protected */
    public char rotateLetter(char c, int i) {
        if (c >= 'a' && c <= 'm') {
            return rotateChar(c, i);
        }
        if (c >= 'A' && c <= 'M') {
            return rotateChar(c, i);
        }
        if (c < 'n' || c > 'z') {
            return (c < 'N' || c > 'Z') ? c : rotateChar(c, -i);
        }
        return rotateChar(c, -i);
    }

    /* access modifiers changed from: protected */
    public char rotateLetter(char c) {
        return rotateLetter(c, this.positions);
    }
}
