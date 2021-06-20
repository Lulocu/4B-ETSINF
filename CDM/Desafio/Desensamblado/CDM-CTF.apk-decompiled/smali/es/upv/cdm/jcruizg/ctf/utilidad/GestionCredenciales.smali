.class public Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;
.super Ljava/lang/Object;
.source "GestionCredenciales.java"


# instance fields
.field private ctx:Landroid/content/Context;

.field private password:Ljava/lang/String;

.field private res:Landroid/content/res/Resources;

.field private user:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->res:Landroid/content/res/Resources;

    .line 18
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->user:Ljava/lang/String;

    .line 19
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->password:Ljava/lang/String;

    .line 22
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->res:Landroid/content/res/Resources;

    .line 23
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->ctx:Landroid/content/Context;

    .line 24
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->InitializeCredentials()V

    return-void
.end method

.method private InitializeCredentials()V
    .locals 0

    .line 28
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->procesaCredenciales()V

    return-void
.end method

.method private procesaCredenciales()V
    .locals 6

    const/4 v0, 0x0

    .line 34
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    iget-object v3, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->ctx:Landroid/content/Context;

    .line 35
    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "credentials"

    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-direct {p0, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->processLine(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-object v0, v1

    goto :goto_1

    :catchall_1
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    :goto_0
    if-eqz v1, :cond_0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 46
    :catch_1
    :cond_0
    throw v0

    :catch_2
    nop

    :goto_1
    if-eqz v0, :cond_1

    .line 42
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_1
    :goto_2
    return-void
.end method

.method private processLine(Ljava/lang/String;)V
    .locals 2

    .line 51
    new-instance v0, Ljava/util/StringTokenizer;

    const-string v1, "&"

    invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->user:Ljava/lang/String;

    .line 53
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->password:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public checkCredentials(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 89
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->checkUser(Ljava/lang/String;)Z

    move-result p1

    .line 90
    invoke-virtual {p0, p2}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->checkPassword(Ljava/lang/String;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p1, :cond_1

    if-nez p2, :cond_0

    .line 94
    invoke-static {}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->_1()V

    return v0

    .line 97
    :cond_0
    invoke-static {}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->_3()V

    return v0

    :cond_1
    if-nez p2, :cond_2

    .line 102
    invoke-static {}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->_2()V

    return v0

    .line 105
    :cond_2
    invoke-static {}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->_4()V

    const/4 p1, 0x1

    return p1
.end method

.method public checkPassword(Ljava/lang/String;)Z
    .locals 2

    if-nez p1, :cond_0

    .line 77
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->GestorCredenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CONTRASEÑA_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    goto :goto_0

    .line 79
    :cond_0
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->password:Ljava/lang/String;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoP:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    invoke-virtual {v1, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 80
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->GestorCredenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CONTRASEÑA_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public checkUser(Ljava/lang/String;)Z
    .locals 2

    if-nez p1, :cond_0

    .line 64
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->GestorCredenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->USUARIO_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->user:Ljava/lang/String;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoU:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    invoke-virtual {v1, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 67
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->GestorCredenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->USUARIO_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->res:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
