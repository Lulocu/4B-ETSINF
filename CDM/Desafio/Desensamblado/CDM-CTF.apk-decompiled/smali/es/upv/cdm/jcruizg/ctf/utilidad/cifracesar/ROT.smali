.class public abstract Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;
.super Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;
.source "ROT.java"


# instance fields
.field private positions:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 9
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->positions:I

    .line 10
    iput p1, p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->positions:I

    return-void
.end method


# virtual methods
.method public decode(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 17
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected rotate(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 28
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 29
    invoke-virtual {p0, v3}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateChar(C)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected abstract rotateChar(C)C
.end method

.method protected rotateChar(CI)C
    .locals 0

    add-int/2addr p1, p2

    int-to-char p1, p1

    return p1
.end method

.method protected rotateDigit(C)C
    .locals 1

    .line 43
    iget v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->positions:I

    invoke-virtual {p0, p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateDigit(CI)C

    move-result p1

    return p1
.end method

.method protected rotateDigit(CI)C
    .locals 2

    const/16 v0, 0x34

    const/16 v1, 0x30

    if-lt p1, v1, :cond_0

    if-gt p1, v0, :cond_0

    .line 37
    invoke-virtual {p0, p1, p2}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateChar(CI)C

    move-result p1

    goto :goto_0

    :cond_0
    if-lt p1, v0, :cond_1

    const/16 v0, 0x39

    if-gt p1, v0, :cond_1

    neg-int p2, p2

    .line 38
    invoke-virtual {p0, p1, p2}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateChar(CI)C

    move-result p1

    :cond_1
    :goto_0
    return p1
.end method

.method protected rotateLetter(C)C
    .locals 1

    .line 55
    iget v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->positions:I

    invoke-virtual {p0, p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateLetter(CI)C

    move-result p1

    return p1
.end method

.method protected rotateLetter(CI)C
    .locals 1

    const/16 v0, 0x61

    if-lt p1, v0, :cond_0

    const/16 v0, 0x6d

    if-gt p1, v0, :cond_0

    .line 47
    invoke-virtual {p0, p1, p2}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateChar(CI)C

    move-result p1

    goto :goto_0

    :cond_0
    const/16 v0, 0x41

    if-lt p1, v0, :cond_1

    const/16 v0, 0x4d

    if-gt p1, v0, :cond_1

    .line 48
    invoke-virtual {p0, p1, p2}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateChar(CI)C

    move-result p1

    goto :goto_0

    :cond_1
    const/16 v0, 0x6e

    if-lt p1, v0, :cond_2

    const/16 v0, 0x7a

    if-gt p1, v0, :cond_2

    neg-int p2, p2

    .line 49
    invoke-virtual {p0, p1, p2}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateChar(CI)C

    move-result p1

    goto :goto_0

    :cond_2
    const/16 v0, 0x4e

    if-lt p1, v0, :cond_3

    const/16 v0, 0x5a

    if-gt p1, v0, :cond_3

    neg-int p2, p2

    .line 50
    invoke-virtual {p0, p1, p2}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->rotateChar(CI)C

    move-result p1

    :cond_3
    :goto_0
    return p1
.end method
