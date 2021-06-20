.class public Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;
.super Ljava/lang/Object;
.source "Cifras.java"


# static fields
.field public static cifradoB:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

.field public static cifradoM:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

.field public static cifradoP:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

.field public static cifradoU:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT5:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object v0

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoU:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    .line 8
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT47:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object v0

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoB:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    .line 9
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT13:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object v0

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoP:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    .line 10
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT18:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object v0

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoM:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
