.class Les/upv/cdm/jcruizg/holamundo/LoginActivity$4;
.super Landroid/animation/AnimatorListenerAdapter;
.source "LoginActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/holamundo/LoginActivity;->showProgress(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

.field final synthetic val$show:Z


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Z)V
    .locals 0

    .line 217
    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$4;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    iput-boolean p2, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$4;->val$show:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 220
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$4;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-static {p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$100(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)Landroid/view/View;

    move-result-object p1

    iget-boolean v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$4;->val$show:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
