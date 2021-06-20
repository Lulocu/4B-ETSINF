package es.upv.cdm.jcruizg.ctf.utilidad.cifracesar;

public abstract class CifraCesar {
    public abstract String decode(String str);

    public abstract String encode(String str);

    public abstract TipoCifra tipo();

    /* access modifiers changed from: package-private */
    /* renamed from: es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra[] r0 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar.AnonymousClass1.$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra = r0
                es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra r1 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra.ROT5     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar.AnonymousClass1.$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra     // Catch:{ NoSuchFieldError -> 0x001d }
                es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra r1 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra.ROT13     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar.AnonymousClass1.$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra     // Catch:{ NoSuchFieldError -> 0x0028 }
                es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra r1 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra.ROT18     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar.AnonymousClass1.$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra     // Catch:{ NoSuchFieldError -> 0x0033 }
                es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra r1 = es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.TipoCifra.ROT47     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: es.upv.cdm.jcruizg.ctf.utilidad.cifracesar.CifraCesar.AnonymousClass1.<clinit>():void");
        }
    }

    public static ROT nueva(TipoCifra tipoCifra) {
        int i = AnonymousClass1.$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra[tipoCifra.ordinal()];
        if (i == 1) {
            return new ROT5();
        }
        if (i == 2) {
            return new ROT13();
        }
        if (i == 3) {
            return new ROT18();
        }
        if (i != 4) {
            return null;
        }
        return new ROT47();
    }

    public static ROT nueva(String str) {
        if (str.equalsIgnoreCase("ROT5")) {
            return nueva(TipoCifra.ROT5);
        }
        if (str.equalsIgnoreCase("ROT13")) {
            return nueva(TipoCifra.ROT13);
        }
        if (str.equalsIgnoreCase("ROT18")) {
            return nueva(TipoCifra.ROT18);
        }
        if (str.equalsIgnoreCase("ROT47")) {
            return nueva(TipoCifra.ROT47);
        }
        return null;
    }
}
