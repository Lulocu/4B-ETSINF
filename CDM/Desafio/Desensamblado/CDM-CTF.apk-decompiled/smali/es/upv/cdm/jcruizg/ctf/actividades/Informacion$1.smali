.class Les/upv/cdm/jcruizg/ctf/actividades/Informacion$1;
.super Ljava/lang/Object;
.source "Informacion.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Informacion;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Informacion;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Informacion;)V
    .locals 0

    .line 27
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Informacion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Informacion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 29
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V

    return-void
.end method
