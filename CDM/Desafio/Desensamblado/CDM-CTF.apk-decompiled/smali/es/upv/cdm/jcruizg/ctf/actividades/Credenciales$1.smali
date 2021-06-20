.class Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;
.super Ljava/lang/Object;
.source "Credenciales.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;)V
    .locals 0

    .line 74
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 77
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    if-nez p1, :cond_0

    .line 78
    new-instance p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;

    const-wide/16 v2, 0x1770

    const-wide/16 v4, 0x1f4

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;JJ)V

    .line 106
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 108
    :cond_0
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->numClicks:I

    return-void
.end method
