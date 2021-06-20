.class Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1$1;
.super Ljava/lang/Object;
.source "Credenciales.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->processClicks()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;

.field final synthetic val$currentTimer:Landroid/os/CountDownTimer;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;Landroid/os/CountDownTimer;)V
    .locals 0

    .line 97
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1$1;->this$2:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;

    iput-object p2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1$1;->val$currentTimer:Landroid/os/CountDownTimer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 100
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1$1;->val$currentTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->onFinish()V

    .line 101
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1$1;->this$2:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-static {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->access$100(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    return-void
.end method
