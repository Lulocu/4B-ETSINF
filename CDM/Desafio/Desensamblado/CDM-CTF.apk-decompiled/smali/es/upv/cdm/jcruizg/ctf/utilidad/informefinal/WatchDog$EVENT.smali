.class public final enum Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;
.super Ljava/lang/Enum;
.source "WatchDog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EVENT"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum BACKDOOR_FOUND:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum BANDERA_ENCONTRADA:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum BANDERA_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum BANDERA_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum CIDE_ACTIVADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum CONTRASEÑA_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum CONTRASEÑA_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum CREDENTIALS_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum CREDENTIALS_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum MENSAJE_MOSTRADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PISTA_1:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PISTA_2:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PISTA_3:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PISTA_4:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PISTA_5:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PISTA_6:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PISTA_6_Visible:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PULSACIONES_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum PULSACIONES_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum SOLUCION:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum USUARIO_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

.field public static final enum USUARIO_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 25
    new-instance v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v1, "IN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v3, "OUT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    .line 26
    new-instance v3, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v5, "USUARIO_OK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v3, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->USUARIO_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v5, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v7, "USUARIO_KO"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v5, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->USUARIO_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v7, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v9, "CONTRASE\u00d1A_OK"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v7, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CONTRASEÑA_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v9, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v11, "CONTRASE\u00d1A_KO"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v9, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CONTRASEÑA_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    .line 27
    new-instance v11, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v13, "MENSAJE_MOSTRADO"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v11, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->MENSAJE_MOSTRADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v13, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v15, "SOLUCION"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v13, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->SOLUCION:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    .line 28
    new-instance v15, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v14, "PULSACIONES_OK"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v15, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PULSACIONES_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v14, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v12, "PULSACIONES_KO"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v14, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PULSACIONES_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v12, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v10, "BANDERA_OK"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v12, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BANDERA_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v10, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v8, "BANDERA_KO"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v10, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BANDERA_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v8, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v6, "CREDENTIALS_OK"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v8, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    .line 29
    new-instance v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v4, "CREDENTIALS_KO"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v4, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "BACKDOOR_FOUND"

    move-object/from16 v16, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v4, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BACKDOOR_FOUND:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v6, "PISTA_1"

    move-object/from16 v17, v4

    const/16 v4, 0xf

    invoke-direct {v2, v6, v4}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_1:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v4, "PISTA_2"

    move-object/from16 v18, v2

    const/16 v2, 0x10

    invoke-direct {v6, v4, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_2:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v4, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "PISTA_3"

    move-object/from16 v19, v6

    const/16 v6, 0x11

    invoke-direct {v4, v2, v6}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v4, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_3:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v6, "PISTA_4"

    move-object/from16 v20, v4

    const/16 v4, 0x12

    invoke-direct {v2, v6, v4}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_4:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    .line 30
    new-instance v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v4, "PISTA_5"

    move-object/from16 v21, v2

    const/16 v2, 0x13

    invoke-direct {v6, v4, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_5:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v4, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "PISTA_6"

    move-object/from16 v22, v6

    const/16 v6, 0x14

    invoke-direct {v4, v2, v6}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v4, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_6:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v6, "PISTA_6_Visible"

    move-object/from16 v23, v4

    const/16 v4, 0x15

    invoke-direct {v2, v6, v4}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_6_Visible:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v4, "CIDE_ACTIVADO"

    move-object/from16 v24, v2

    const/16 v2, 0x16

    invoke-direct {v6, v4, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v6, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CIDE_ACTIVADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v4, "BANDERA_ENCONTRADA"

    move-object/from16 v25, v6

    const/16 v6, 0x17

    invoke-direct {v2, v4, v6}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;-><init>(Ljava/lang/String;I)V

    sput-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BANDERA_ENCONTRADA:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const/16 v4, 0x18

    new-array v4, v4, [Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const/4 v6, 0x0

    aput-object v0, v4, v6

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v13, v4, v0

    const/16 v0, 0x8

    aput-object v15, v4, v0

    const/16 v0, 0x9

    aput-object v14, v4, v0

    const/16 v0, 0xa

    aput-object v12, v4, v0

    const/16 v0, 0xb

    aput-object v10, v4, v0

    const/16 v0, 0xc

    aput-object v8, v4, v0

    const/16 v0, 0xd

    aput-object v16, v4, v0

    const/16 v0, 0xe

    aput-object v17, v4, v0

    const/16 v0, 0xf

    aput-object v18, v4, v0

    const/16 v0, 0x10

    aput-object v19, v4, v0

    const/16 v0, 0x11

    aput-object v20, v4, v0

    const/16 v0, 0x12

    aput-object v21, v4, v0

    const/16 v0, 0x13

    aput-object v22, v4, v0

    const/16 v0, 0x14

    aput-object v23, v4, v0

    const/16 v0, 0x15

    aput-object v24, v4, v0

    const/16 v0, 0x16

    aput-object v25, v4, v0

    const/16 v0, 0x17

    aput-object v2, v4, v0

    .line 24
    sput-object v4, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->$VALUES:[Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;
    .locals 1

    .line 24
    const-class v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    return-object p0
.end method

.method public static values()[Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;
    .locals 1

    .line 24
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->$VALUES:[Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-virtual {v0}, [Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    return-object v0
.end method
