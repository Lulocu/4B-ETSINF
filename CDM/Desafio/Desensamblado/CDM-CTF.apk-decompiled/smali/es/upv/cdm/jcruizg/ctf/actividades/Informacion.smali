.class public Les/upv/cdm/jcruizg/ctf/actividades/Informacion;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Informacion.java"


# instance fields
.field credentialsOK:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->credentialsOK:Z

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 3

    .line 48
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    .line 49
    iget-boolean v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->credentialsOK:Z

    if-eqz v0, :cond_0

    .line 50
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Les/upv/cdm/jcruizg/ctf/actividades/Pista;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->startActivity(Landroid/content/Intent;)V

    .line 52
    :cond_0
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Informacion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 17
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a001f

    .line 19
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->setContentView(I)V

    .line 20
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Informacion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const p1, 0x7f0800ae

    .line 23
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "\u00a1\u00a1\u00a1No te rindas e int\u00e9ntalo de nuevo!!!"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0c0001

    .line 25
    invoke-static {p0, p1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 27
    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Informacion$1;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Informacion$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Informacion;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 33
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "Cred"

    const/4 v1, 0x0

    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->credentialsOK:Z

    const p1, 0x7f0800ab

    .line 35
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 36
    iget-boolean v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->credentialsOK:Z

    if-eqz v0, :cond_0

    .line 37
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Informacion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const v0, 0x7f0d0030

    .line 38
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Informacion:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const v0, 0x7f0d002f

    .line 41
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method
