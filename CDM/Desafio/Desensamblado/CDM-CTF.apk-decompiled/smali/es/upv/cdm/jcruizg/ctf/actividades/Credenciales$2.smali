.class Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;
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

    .line 112
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 115
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getEtUsuario()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 116
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {v0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getEtContrasenya()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 118
    iget-object v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 119
    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object v2, v2, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-static {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->access$200(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->hasFocus()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object v2, v2, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-static {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->access$200(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 120
    :cond_0
    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object v2, v2, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-static {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->access$300(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object v2, v2, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-static {v2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->access$300(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 122
    :cond_1
    iget-object v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object v1, v1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->cm:Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;

    invoke-virtual {v1, p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/GestionCredenciales;->checkCredentials(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    .line 123
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_OK:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 124
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object p1

    const v1, 0x7f070057

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 125
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 126
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "Las credenciales introducidas son correctas. Ahora DALE AL C\u00c9SAR LO QUE ES DEL C\u00c9SAR. "

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    goto :goto_0

    .line 132
    :cond_2
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Credenciales:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CREDENTIALS_KO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 133
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object p1

    const v1, 0x7f070056

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 134
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 135
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "Las credenciales introducidas son incorrectas. Int\u00e9ntalo de nuevo."

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    .line 140
    :goto_0
    invoke-virtual {p1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 141
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    if-lez v1, :cond_3

    .line 142
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0x11

    .line 143
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 145
    :cond_3
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 146
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$2;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    iget-object p1, p1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->vh:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->getIvResultado()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
