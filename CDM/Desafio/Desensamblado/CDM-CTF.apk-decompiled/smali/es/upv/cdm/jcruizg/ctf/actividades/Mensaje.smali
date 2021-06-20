.class public Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Mensaje.java"


# instance fields
.field private mp:Landroid/media/MediaPlayer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->mp:Landroid/media/MediaPlayer;

    return-void
.end method


# virtual methods
.method public darPista(Landroid/view/View;)V
    .locals 2

    const p1, 0x7f0800b3

    .line 39
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->_6(Landroid/widget/TextView;)V

    .line 40
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Mensaje:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->PISTA_6_Visible:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 41
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public darSolucion(Landroid/view/View;)V
    .locals 3

    .line 45
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 46
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "User"

    .line 47
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "Password"

    .line 48
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "BD"

    const/4 v2, 0x0

    .line 49
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 50
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Mensaje:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 51
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->mp:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V

    .line 52
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 19
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a001e

    .line 21
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->setContentView(I)V

    .line 22
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Mensaje:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const p1, 0x7f0800af

    .line 24
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "w2D D6CG:5@ 3:6? 2= r\u00e9D2C] w2D 2G6C:8F25@ 6= FDF2C:@ J 4@?EC2D6\u00f12 D64C6E@D] p56>\u00e1D[ 92D D23:5@ 52C 2= r\u00e9D2C =@ BF6 6D 56= r\u00e9D2C[ 6D 564:C[ 92D 4@?D68F:5@ 56E6C>:?2C 4F\u00e1?E2D G646D 923\u00ed2 BF6 AF=D2C D@3C6 DF :>286? A2C2 A@56C 4@?E:?F2C] p9@C2 D\u00f3=@ E6 72=E2 =2 32?56C2] $: ?@ =2 92D 6?4@?EC25@ J2[ A@5C\u00e1D 56D4F3C:C=2 6? =2 \u00fa?:42 24E:G:525 56 =2 2AA BF6 ?@ 6D A@D:3=6 24E:G2C 2 EC2G\u00e9D 56 DF :?E6C72K] $: 4@?D:8F6D 24E:G2C=2[ FE:=:K2 6= E6IE@ Qq2?56C2Q J @3E6?5C\u00e1D =@ BF6 E6 72=E2 A2C2 C6D@=G6C 6DE6 56D27\u00ed@]"

    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Mensaje:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->MENSAJE_MOSTRADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const/high16 p1, 0x7f0c0000

    .line 28
    invoke-static {p0, p1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object p1

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->mp:Landroid/media/MediaPlayer;

    .line 29
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 30
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->mp:Landroid/media/MediaPlayer;

    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje$1;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    return-void
.end method
