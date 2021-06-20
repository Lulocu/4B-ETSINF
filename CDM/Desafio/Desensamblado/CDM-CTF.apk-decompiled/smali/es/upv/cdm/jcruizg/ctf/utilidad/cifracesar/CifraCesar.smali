.class public abstract Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;
.super Ljava/lang/Object;
.source "CifraCesar.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;
    .locals 1

    .line 10
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar$1;->$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra:[I

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 18
    :cond_0
    new-instance p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT47;

    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT47;-><init>()V

    return-object p0

    .line 16
    :cond_1
    new-instance p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT18;

    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT18;-><init>()V

    return-object p0

    .line 14
    :cond_2
    new-instance p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT13;

    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT13;-><init>()V

    return-object p0

    .line 12
    :cond_3
    new-instance p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT5;

    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT5;-><init>()V

    return-object p0
.end method

.method public static nueva(Ljava/lang/String;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;
    .locals 1

    const-string v0, "ROT5"

    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT5:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "ROT13"

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT13:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, "ROT18"

    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT18:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object p0

    return-object p0

    :cond_2
    const-string v0, "ROT47"

    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT47:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract decode(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract encode(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract tipo()Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;
.end method
