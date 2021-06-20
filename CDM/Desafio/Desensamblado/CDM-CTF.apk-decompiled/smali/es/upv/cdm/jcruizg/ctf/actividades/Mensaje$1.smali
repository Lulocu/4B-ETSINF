.class Les/upv/cdm/jcruizg/ctf/actividades/Mensaje$1;
.super Ljava/lang/Object;
.source "Mensaje.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;)V
    .locals 0

    .line 30
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Mensaje$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Mensaje;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 32
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->stop()V

    .line 33
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V

    return-void
.end method
