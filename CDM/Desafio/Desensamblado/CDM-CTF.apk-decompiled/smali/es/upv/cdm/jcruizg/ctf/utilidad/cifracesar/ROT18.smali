.class public Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT18;
.super Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;
.source "ROT18.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x12

    .line 17
    invoke-direct {p0, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;-><init>(I)V

    return-void
.end method


# virtual methods
.method public decode(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT18;->rotate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT18;->rotate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected rotateChar(C)C
    .locals 1

    .line 29
    invoke-static {p1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT18;->rotateDigit(CI)C

    move-result p1

    goto :goto_0

    :cond_0
    const/16 v0, 0xd

    .line 30
    invoke-virtual {p0, p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT18;->rotateLetter(CI)C

    move-result p1

    :goto_0
    return p1
.end method

.method public tipo()Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;
    .locals 1

    .line 35
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT18:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    return-object v0
.end method
