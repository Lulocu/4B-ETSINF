.class public Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT13;
.super Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;
.source "ROT13.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xd

    .line 6
    invoke-direct {p0, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected rotate(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 15
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 18
    invoke-virtual {p0, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT13;->rotateLetter(C)C

    move-result v2

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected rotateChar(C)C
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT13;->rotateLetter(C)C

    move-result p1

    return p1
.end method

.method public tipo()Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;
    .locals 1

    .line 25
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT13:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    return-object v0
.end method
