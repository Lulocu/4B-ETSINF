.class Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3$1;
.super Ljava/lang/Object;
.source "Credenciales.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;)V
    .locals 0

    .line 164
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 166
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3$1;->this$1:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->finish()V

    return-void
.end method
