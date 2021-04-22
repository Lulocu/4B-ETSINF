.class Les/upv/cdm/jcruizg/holamundo/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/holamundo/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/holamundo/MainActivity;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/holamundo/MainActivity;)V
    .locals 0

    .line 22
    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/MainActivity$1;->this$0:Les/upv/cdm/jcruizg/holamundo/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 26
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/MainActivity$1;->this$0:Les/upv/cdm/jcruizg/holamundo/MainActivity;

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/holamundo/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1
    #mirar si es dispositivo real o simulado

    const-class v2, Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Les/upv/cdm/jcruizg/holamundo/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 28
    sget-object p1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v0, "generic"

    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "[MainActivity]"

    const-string v0, "Ejecutas el c\u00f3digo en un emulador"
    const-class v2, Les/upv/cdm/jcruizg/holamundo/SegundaActividad;

    .line 31
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string p1, "[MainActivity]"

    const-string v0, "Ejecutas el c\u00f3digo en un dispositivo real"
    const-class v2, Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    .line 35
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0

        iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/MainActivity$1;->this$0:Les/upv/cdm/jcruizg/holamundo/MainActivity;

        new-instance v0, Landroid/content/Intent;

        invoke-virtual {p1}, Les/upv/cdm/jcruizg/holamundo/MainActivity;->getApplicationContext()Landroid/content/Context;

        move-result-object v1
        #mirar si es dispositivo real o simulado



        invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

        invoke-virtual {p1, v0}, Les/upv/cdm/jcruizg/holamundo/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
