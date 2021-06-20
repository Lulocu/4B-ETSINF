.class Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;
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

    .line 150
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 153
    new-instance p1, Landroid/support/v7/app/AlertDialog$Builder;

    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 154
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, "<center>\n<p>.</p>\n<h2>No te rindas</h2>\n<p>Seguro que intent\u00e1ndolo un poco m\u00e1s lo consigues</p>\n<h2>\u00a1\u00a1\u00a1 \u00c1nimo !!!</h2></center>"

    .line 155
    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x1

    .line 161
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 162
    invoke-virtual {p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 163
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setCancelable(Z)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3$1;

    invoke-direct {v1, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$3;)V

    const-string v2, "Continuar"

    .line 164
    invoke-virtual {v0, v2, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 169
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object p1

    .line 170
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method
