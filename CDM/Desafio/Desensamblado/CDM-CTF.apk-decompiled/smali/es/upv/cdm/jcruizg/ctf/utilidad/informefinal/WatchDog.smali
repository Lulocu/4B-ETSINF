.class public Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;
.super Ljava/lang/Object;
.source "WatchDog.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;,
        Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;
    }
.end annotation


# static fields
.field public static final SEPARADOR_EVENTOS:Ljava/lang/String; = "^"

.field public static final SEPARADOR_PARTES:Ljava/lang/String; = "."

.field public static final classIDs:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final eventIDs:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final traza:Ljava/lang/StringBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->traza:Ljava/lang/StringBuffer;

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->classIDs:Ljava/util/HashMap;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->eventIDs:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V
    .locals 2

    .line 78
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->classIDs:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 79
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->eventIDs:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 80
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->traza:Ljava/lang/StringBuffer;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, "."

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "^"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method

.method public static addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;Ljava/lang/String;)V
    .locals 2

    .line 84
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->classIDs:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 85
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->eventIDs:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 86
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->traza:Ljava/lang/StringBuffer;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, "."

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, "^"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method

.method public static initializeHashMaps()V
    .locals 4

    .line 36
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->traza:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;

    .line 37
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->classIDs:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 38
    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->eventIDs:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 40
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Bienvenida:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "3002dbe0-4194-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "caa34f1a-3f62-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Informacion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "caa351e0-3f62-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Mensaje:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "caa356a4-3f62-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Pista:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "caa3582a-3f62-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Solucion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "caa3596a-3f62-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->GestorCredenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "f1bde382-3f6a-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Pistas:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "3002e068-4194-11e9-b210-d663bd873d93"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Test:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    const-string v3, "b2f1e9a5-279b-4f8a-bec5-4221a388b7d5"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "3002dee2-4194-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "46effecc-4195-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->USUARIO_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "a607800a-3f66-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CONTRASEÑA_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "a60783fc-3f66-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PULSACIONES_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "a6078672-3f66-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BANDERA_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "a60788ca-3f66-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "a6078e60-3f66-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BACKDOOR_FOUND:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "f1bde634-3f6a-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->USUARIO_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "1435da22-3f6c-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CONTRASEÑA_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "1435dbe4-3f6c-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "1435ddd8-3f6c-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PULSACIONES_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "1435dfcc-3f6c-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BANDERA_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "fee67806-3f6c-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->MENSAJE_MOSTRADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "fee67ad6-3f6c-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->SOLUCION:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "947cc2f8-3fef-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_1:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "f1bdf1b0-3f6a-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_2:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "f1bdf354-3f6a-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_3:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "f1bdf49e-3f6a-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_4:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "1435d658-3f6c-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_5:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "94553866-4029-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_6:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "94553b04-4029-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_6_Visible:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "944c1678-4196-11e9-b210-d663bd873d93"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CIDE_ACTIVADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "1cbd72ad-b96b-448e-9ce6-956005785383"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BANDERA_ENCONTRADA:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    const-string v2, "20c34924-193d-406c-bbc6-aa3f78213be8"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
