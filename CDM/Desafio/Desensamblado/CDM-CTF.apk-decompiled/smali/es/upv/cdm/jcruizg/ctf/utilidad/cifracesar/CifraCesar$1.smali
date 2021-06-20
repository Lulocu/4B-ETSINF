.class synthetic Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar$1;
.super Ljava/lang/Object;
.source "CifraCesar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 10
    invoke-static {}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->values()[Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar$1;->$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra:[I

    :try_start_0
    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT5:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-virtual {v1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar$1;->$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra:[I

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT13:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-virtual {v1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar$1;->$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra:[I

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT18:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-virtual {v1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar$1;->$SwitchMap$es$upv$cdm$jcruizg$ctf$utilidad$cifracesar$TipoCifra:[I

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT47:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-virtual {v1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method
