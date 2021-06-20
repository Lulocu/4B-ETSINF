.class public Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Credenciales.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;
    }
.end annotation


# instance fields
.field cm:Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;

.field numClicks:I

.field private progressDialog:Landroid/app/ProgressDialog;

.field vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->cm:Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;

    const/4 v1, 0x0

    .line 28
    iput v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    .line 55
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    return-void
.end method

.method static synthetic access$000(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->cambiaActividad()V

    return-void
.end method

.method static synthetic access$100(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)Landroid/app/ProgressDialog;
    .locals 0

    .line 26
    iget-object p0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->progressDialog:Landroid/app/ProgressDialog;

    return-object p0
.end method

.method private cambiaActividad()V
    .locals 9

    .line 191
    iget v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    const/4 v1, 0x0

    .line 192
    iput v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    .line 193
    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ImageView;->getVisibility()I

    move-result v2

    if-nez v2, :cond_5

    const/4 v2, 0x1

    const-string v3, "BD"

    const-string v4, "Password"

    const-string v5, "User"

    const/16 v6, 0x12

    if-ne v0, v6, :cond_0

    .line 195
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BACKDOOR_FOUND:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 196
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v6, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;

    invoke-direct {v0, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "324<5@@C0FD6C"

    .line 197
    invoke-virtual {v0, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "324<5@@C0A2DDH@C5"

    .line 198
    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 199
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 200
    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v1, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 201
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 203
    :cond_0
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->credencialesOK()Z

    move-result v7

    const/16 v8, 0xa

    if-ne v0, v8, :cond_1

    if-eqz v7, :cond_1

    .line 205
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PULSACIONES_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 206
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 207
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v6, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;

    invoke-direct {v0, v2, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 208
    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-static {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->access$200(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 209
    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-static {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->access$300(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 210
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 211
    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v1, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 212
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    if-eq v0, v8, :cond_2

    if-eq v0, v6, :cond_2

    .line 214
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PULSACIONES_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    :cond_2
    if-eqz v7, :cond_3

    .line 215
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 216
    :cond_3
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v3, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz v7, :cond_4

    const-string v1, "Cred"

    .line 217
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 218
    :cond_4
    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v1, v2}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 219
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->startActivity(Landroid/content/Intent;)V

    :cond_5
    :goto_0
    return-void
.end method

.method private credencialesOK()Z
    .locals 3

    .line 185
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    const v0, 0x7f070057

    .line 186
    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method


# virtual methods
.method public datosIntroducidos()Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;
    .locals 1

    .line 59
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 64
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a001c

    .line 66
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->setContentView(I)V

    .line 67
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 70
    new-instance p1, Landroid/app/ProgressDialog;

    invoke-direct {p1, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->progressDialog:Landroid/app/ProgressDialog;

    .line 71
    new-instance p1, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;

    invoke-direct {p1, p0}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->cm:Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;

    .line 72
    new-instance p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    const v0, 0x7f080042

    const v1, 0x7f080041

    const v2, 0x7f080057

    invoke-direct {p1, p0, v0, v1, v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;III)V

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    .line 73
    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 74
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object p1

    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f080025

    .line 112
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f080022

    .line 150
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 178
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    .line 179
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 180
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 181
    iput v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    return-void
.end method
