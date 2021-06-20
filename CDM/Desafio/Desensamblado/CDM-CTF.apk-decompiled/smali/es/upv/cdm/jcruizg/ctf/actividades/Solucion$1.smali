.class Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;
.super Ljava/lang/Object;
.source "Solucion.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Solucion;)V
    .locals 0

    .line 105
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 108
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->user:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->user:Ljava/lang/String;

    .line 109
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->password:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->password:Ljava/lang/String;

    .line 110
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->bandera:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->bandera:Ljava/lang/String;

    .line 112
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->user:Ljava/lang/String;

    const-string v0, "(null)"

    if-eqz p1, :cond_0

    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->user:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->user:Ljava/lang/String;

    .line 113
    :cond_1
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->password:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->password:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->password:Ljava/lang/String;

    .line 114
    :cond_3
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->bandera:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->bandera:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->bandera:Ljava/lang/String;

    .line 116
    :cond_5
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 117
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->user:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->hasFocus()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->user:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 118
    :cond_6
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->password:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->password:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 119
    :cond_7
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->bandera:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$ViewHolder;->bandera:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 122
    :cond_8
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->respuesta:Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    invoke-virtual {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$Respuesta;->androidID:Ljava/lang/String;

    .line 123
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Solucion$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Solucion;

    invoke-static {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Solucion;->access$000(Les/upv/cdm/jcruizg/ctf/actividades/Solucion;)V

    return-void
.end method
