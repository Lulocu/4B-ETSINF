.class public Les/upv/cdm/jcruizg/ctf/actividades/Solucion;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Solucion.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;,
        Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;
    }
.end annotation


# instance fields
.field respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

.field vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 51
    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Solucion;)V

    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    .line 53
    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Solucion;)V

    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    return-void
.end method

.method static synthetic access$000(Les/upv/cdm/jcruizg/ctf/actividades/Solucion;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->procesaRespuesta()V

    return-void
.end method

.method private generaInforme()V
    .locals 6

    const-string v0, "."

    const/4 v1, 0x2

    .line 138
    :try_start_0
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Solucion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v3, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->SOLUCION:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v5, v5, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->user:Ljava/lang/String;

    .line 139
    invoke-static {v5}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->encrypt(Ljava/lang/String;)[B

    move-result-object v5

    invoke-static {v5, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v5, v5, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->password:Ljava/lang/String;

    .line 140
    invoke-static {v5}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->encrypt(Ljava/lang/String;)[B

    move-result-object v5

    invoke-static {v5, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v5, v5, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->bandera:Ljava/lang/String;

    .line 141
    invoke-static {v5}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->encrypt(Ljava/lang/String;)[B

    move-result-object v5

    invoke-static {v5, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v4, v4, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->androidID:Ljava/lang/String;

    .line 142
    invoke-static {v4}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->encrypt(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {v4, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 138
    invoke-static {v2, v3, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Error Cifrando UCBI"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    :goto_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 152
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->traza:Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "TRAZA:"

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    .line 157
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/SHA256;->computeHash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-object v3, v2

    .line 165
    :goto_1
    :try_start_2
    invoke-static {v3}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->encrypt(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {v3, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    .line 168
    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Error Cifrando digest"

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 172
    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;->ROT47:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;

    invoke-static {v1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/TipoCifra;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 176
    :try_start_3
    new-instance v1, Ljava/io/OutputStreamWriter;

    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    .line 177
    invoke-virtual {p0, v2}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 178
    invoke-virtual {v1, v0}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    const-string v0, "Ficheros"

    const-string v1, "Error al escribir el fichero de informe en memoria interna"

    .line 183
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-void
.end method

.method private notificaInformeGenerado()V
    .locals 4

    const v0, 0x7f0800aa

    .line 190
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 192
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-virtual {p0, v2}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0046

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 193
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const v0, 0x7f080024

    .line 194
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v0, "Fichero de traza generado con \u00e9xito"

    const/4 v2, 0x1

    .line 195
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 196
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 197
    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v3

    if-lez v3, :cond_0

    .line 198
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x11

    .line 199
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 201
    :cond_0
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private procesaRespuesta()V
    .locals 0

    .line 131
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->generaInforme()V

    .line 132
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->notificaInformeGenerado()V

    return-void
.end method


# virtual methods
.method public enviaEmail(Landroid/view/View;)V
    .locals 9

    const/16 p1, 0x11

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 238
    :try_start_0
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFilesDir()Ljava/io/File;

    move-result-object v3

    iget-object v4, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-virtual {p0, v4}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v3, "jcruizg@disca.upv.es"

    .line 240
    filled-new-array {v3}, [Ljava/lang/String;

    .line 242
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_0

    .line 243
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".provider"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v2}, Landroid/support/v4/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    goto :goto_0

    .line 245
    :cond_0
    iget-object v3, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-virtual {p0, v3}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p0, v3}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->writeToExternal(Landroid/content/Context;Ljava/lang/String;)V

    .line 246
    new-instance v3, Ljava/io/File;

    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    iget-object v5, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-virtual {p0, v5}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    const-string v4, "CDM-Info"

    .line 247
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string v4, "Adjunto a este mensaje tu fichero de traza.\nDebe formar parte de la memoria del proyecto que subas a PoliformaT.\nSaludos,\nJuan Carlos"

    .line 256
    new-instance v5, Landroid/content/Intent;

    const-string v6, "android.intent.action.SEND"

    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v6, "android.intent.extra.SUBJECT"

    .line 258
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Resultado CTF: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-virtual {p0, v8}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v6, "text/plain"

    .line 259
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v6, "android.intent.extra.TEXT"

    .line 260
    invoke-virtual {v5, v6, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 261
    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 v4, 0x2

    .line 262
    invoke-virtual {v5, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v4, "android.intent.extra.STREAM"

    .line 263
    invoke-virtual {v5, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v3, "CDM-URI:"

    .line 264
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v2, "Enviando TrazaCTF.jcc por email..."

    .line 268
    invoke-static {v5, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    :try_start_2
    const-string v2, "No tienes ning\u00fan cliente de email operativo."

    .line 270
    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 271
    invoke-virtual {v2}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    .line 272
    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v4

    if-lez v4, :cond_1

    .line 273
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 274
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 276
    :cond_1
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    const-string v3, "CDM-Emailing"

    const-string v4, "excepci\u00f3n"

    .line 279
    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v2, "El email no se ha podido enviar. Consulta el log de la app para m\u00e1s informaci\u00f3n"

    .line 280
    invoke-static {p0, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 282
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 283
    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v3

    if-lez v3, :cond_2

    .line 284
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 285
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 287
    :cond_2
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_1
    return-void
.end method

.method getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;
    .locals 3

    .line 56
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 57
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy_MMMM_d_hh-mm"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->androidID:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, "-"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, "-TrazaCTF.jcc"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 213
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 206
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    .line 207
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->finishAffinity()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 73
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a0021

    .line 74
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->setContentView(I)V

    .line 75
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Solucion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 77
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    const v0, 0x7f080042

    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->user:Landroid/widget/TextView;

    .line 78
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    const v0, 0x7f080041

    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->password:Landroid/widget/TextView;

    .line 79
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    const v0, 0x7f08003f

    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->bandera:Landroid/widget/TextView;

    .line 81
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "User"

    .line 82
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Password"

    .line 83
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "BD"

    const/4 v3, 0x0

    .line 84
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_1

    .line 89
    :cond_0
    new-instance v4, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;

    invoke-direct {v4, p0}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;-><init>(Landroid/content/Context;)V

    .line 90
    invoke-virtual {v4, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->checkUser(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->checkPassword(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_3

    if-nez p1, :cond_3

    :cond_2
    :goto_1
    const/4 v3, 0x1

    :cond_3
    if-eqz v3, :cond_4

    const-string v3, "\u00a1\u00a1Recuerda introducir tus credenciales y que sean correctas!!"

    .line 94
    invoke-static {p0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    const-wide/16 v2, 0x3e8

    .line 96
    :try_start_0
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    :catch_0
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-class v4, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->startActivity(Landroid/content/Intent;)V

    .line 101
    :cond_4
    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v2, v2, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->user:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->password:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_5

    .line 103
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->bandera:Landroid/widget/TextView;

    const-string v0, "Uso de puerta trasera \u00bfy la bandera?"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    const p1, 0x7f080027

    .line 105
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Solucion;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method workingDirectory()Ljava/io/File;
    .locals 2

    .line 64
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 65
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFilesDir()Ljava/io/File;

    move-result-object v0

    return-object v0

    .line 67
    :cond_0
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public writeToExternal(Landroid/content/Context;Ljava/lang/String;)V
    .locals 8

    const-string v0, ""

    .line 218
    :try_start_0
    new-instance v1, Ljava/io/File;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    iget-object v4, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-virtual {p0, v4}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 219
    new-instance v3, Ljava/io/FileInputStream;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    invoke-virtual {p0, v5}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getFileName(Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 220
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 221
    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    move-result v1

    new-array v1, v1, [B

    const-string v5, "Available "

    .line 222
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const-string v6, "Result"

    .line 224
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    invoke-virtual {v4, v1}, Ljava/io/OutputStream;->write([B)V

    .line 226
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 227
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    const-string v1, "Copying to"

    .line 228
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "Copying from"

    .line 229
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "File write failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method
