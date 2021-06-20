.class public Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Bienvenida.java"


# instance fields
.field tv1:Landroid/widget/TextView;

.field tv2:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv1:Landroid/widget/TextView;

    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv2:Landroid/widget/TextView;

    return-void
.end method

.method private RunAnimation()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 43
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const/4 v1, -0x1

    .line 44
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 45
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0x2328

    .line 46
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 47
    new-instance v1, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida$1;

    invoke-direct {v1, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 57
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 21
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a001d

    .line 22
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->setContentView(I)V

    .line 24
    invoke-static {}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->initializeHashMaps()V

    .line 26
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Bienvenida:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 28
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/app/ActionBar;->hide()V

    const p1, 0x7f0800b0

    .line 29
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv1:Landroid/widget/TextView;

    const p1, 0x7f0800b1

    .line 30
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv2:Landroid/widget/TextView;

    .line 31
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv1:Landroid/widget/TextView;

    const-string v0, "Pulsa la pantalla para comenzar"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv2:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->inicializa(Landroid/content/Context;)V

    .line 35
    invoke-static {}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->_1()V

    .line 37
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->RunAnimation()V

    return-void
.end method

.method public start(Landroid/view/View;)V
    .locals 2

    .line 61
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Bienvenida:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 62
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
