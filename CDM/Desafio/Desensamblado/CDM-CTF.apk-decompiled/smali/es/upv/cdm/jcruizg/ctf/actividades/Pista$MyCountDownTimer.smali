.class public Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;
.super Landroid/os/CountDownTimer;
.source "Pista.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Pista;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyCountDownTimer"
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Pista;


# direct methods
.method public constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Pista;JJ)V
    .locals 0

    .line 35
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Pista;

    .line 36
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 46
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Pista:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->OUT:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 47
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Pista;

    invoke-virtual {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->finish()V

    return-void
.end method

.method public onTick(J)V
    .locals 2

    .line 41
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Pista;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->tvCounter:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Pista;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->tvCounter:Landroid/widget/TextView;

    iget-object p2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Pista$MyCountDownTimer;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Pista;

    iget v0, p2, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->currentCount:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p2, Les/upv/cdm/jcruizg/ctf/actividades/Pista;->currentCount:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
