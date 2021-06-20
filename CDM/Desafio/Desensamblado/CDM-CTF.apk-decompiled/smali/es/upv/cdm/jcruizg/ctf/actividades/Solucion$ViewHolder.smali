.class Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;
.super Ljava/lang/Object;
.source "Solucion.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Solucion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ViewHolder"
.end annotation


# instance fields
.field bandera:Landroid/widget/TextView;

.field password:Landroid/widget/TextView;

.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

.field user:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Solucion;)V
    .locals 0

    .line 46
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->user:Landroid/widget/TextView;

    .line 48
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->password:Landroid/widget/TextView;

    .line 49
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->bandera:Landroid/widget/TextView;

    return-void
.end method
