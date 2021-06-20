.class public Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT5;
.super Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;
.source "ROT5.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x5

    .line 6
    invoke-direct {p0, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected rotateChar(C)C
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT5;->rotateDigit(C)C

    move-result p1

    return p1
.end method

.method public tipo()Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;
    .locals 1

    .line 13
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT5:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    return-object v0
.end method
