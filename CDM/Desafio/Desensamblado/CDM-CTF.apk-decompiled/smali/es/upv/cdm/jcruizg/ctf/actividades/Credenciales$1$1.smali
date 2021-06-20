.class Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;
.super Landroid/os/CountDownTimer;
.source "Credenciales.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private oldClicks:I

.field final synthetic this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;JJ)V
    .locals 0

    .line 78
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    const/4 p1, 0x0

    .line 79
    iput p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->oldClicks:I

    return-void
.end method

.method private processClicks()V
    .locals 4

    .line 93
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->access$100(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)Landroid/app/ProgressDialog;

    move-result-object v0

    const-string v1, "Procesando..."

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->access$100(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 95
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 97
    new-instance v1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1$1;

    invoke-direct {v1, p0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;Landroid/os/CountDownTimer;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .line 89
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->access$000(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)V

    return-void
.end method

.method public onTick(J)V
    .locals 0

    .line 81
    iget p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->oldClicks:I

    iget-object p2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    iget-object p2, p2, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget p2, p2, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    if-ne p1, p2, :cond_0

    .line 82
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->cancel()V

    .line 83
    invoke-direct {p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->processClicks()V

    .line 85
    :cond_0
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    iput p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->oldClicks:I

    return-void
.end method
