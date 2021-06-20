.class Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida$1;
.super Ljava/lang/Object;
.source "Bienvenida.java"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->RunAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;)V
    .locals 0

    .line 47
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 50
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 51
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;

    iget-object v0, v0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv1:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float p1, p1, v0

    .line 53
    iget-object v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;

    iget-object v1, v1, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv1:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTranslationX(F)V

    .line 54
    iget-object v1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida$1;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;

    iget-object v1, v1, Les/upv/cdm/jcruizg/ctf/actividades/Bienvenida;->tv2:Landroid/widget/TextView;

    sub-float/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTranslationX(F)V

    return-void
.end method
