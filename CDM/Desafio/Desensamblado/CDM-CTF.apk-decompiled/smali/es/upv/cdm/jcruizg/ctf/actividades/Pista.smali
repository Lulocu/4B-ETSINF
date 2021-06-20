.class public Les/upv/cdm/jcruizg/ctf/actividades/Pista;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Pista.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;
    }
.end annotation


# instance fields
.field public currentCount:I

.field public tvCounter:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/16 v0, 0xa

    .line 14
    iput v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->currentCount:I

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->tvCounter:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 19
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a0020

    .line 20
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->setContentView(I)V

    .line 21
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Pista:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const p1, 0x7f0800b3

    .line 23
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p1}, Les/upv/cdm/jcruizg/ctf/utilidad/Pistas;->_5(Landroid/widget/TextView;)V

    const/16 p1, 0xa

    .line 25
    iput p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->currentCount:I

    const p1, 0x7f0800a9

    .line 26
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->tvCounter:Landroid/widget/TextView;

    .line 28
    new-instance p1, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;

    const-wide/16 v2, 0x2710

    const-wide/16 v4, 0x3e8

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Pista;JJ)V

    .line 29
    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method
