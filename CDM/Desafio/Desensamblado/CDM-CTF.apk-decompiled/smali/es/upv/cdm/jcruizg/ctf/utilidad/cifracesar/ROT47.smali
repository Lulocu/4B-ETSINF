.class public Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT47;
.super Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;
.source "ROT47.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x2f

    .line 16
    invoke-direct {p0, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected rotateChar(C)C
    .locals 1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2f

    .line 21
    invoke-virtual {p0, p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT47;->rotateChar(CI)C

    move-result p1

    const/16 v0, 0x7e

    if-le p1, v0, :cond_0

    const/16 v0, -0x5e

    .line 23
    invoke-virtual {p0, p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT47;->rotateChar(CI)C

    move-result p1

    :cond_0
    return p1
.end method

.method public tipo()Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;
    .locals 1

    .line 30
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT47:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    return-object v0
.end method
