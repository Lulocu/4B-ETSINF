.class Les/upv/cdm/jcruizg/ctf/actividades/Test$1;
.super Ljava/lang/Object;
.source "Test.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Test;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Test;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Test;)V
    .locals 0

    .line 28
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Test$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Test;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 31
    iget-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Test$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Test;

    const v0, 0x7f080040

    invoke-virtual {p1, v0}, Les/upv/cdm/jcruizg/ctf/actividades/Test;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    .line 32
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Test$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Test;

    const v1, 0x7f0800b2

    invoke-virtual {v0, v1}, Les/upv/cdm/jcruizg/ctf/actividades/Test;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 33
    iget-object v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Test$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Test;

    const v2, 0x7f080083

    invoke-virtual {v1, v2}, Les/upv/cdm/jcruizg/ctf/actividades/Test;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    .line 34
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 35
    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 36
    invoke-static {v1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->nueva(Ljava/lang/String;)Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/ROT;

    move-result-object v1

    .line 37
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Test:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v3, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->CIDE_ACTIVADO:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {v2, v3}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 39
    sget-object v2, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoB:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    const-string v3, "q2?56C2"

    invoke-virtual {v2, v3}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 40
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Test:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->BANDERA_ENCONTRADA:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    .line 41
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/Cifras;->cifradoB:Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;

    const-string v1, "rs|0a0p{{"

    invoke-virtual {p1, v1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 43
    invoke-virtual {v1, p1}, Les/upv/cdm/jcruizg/ctf/utilidad/cifracesar/CifraCesar;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method
