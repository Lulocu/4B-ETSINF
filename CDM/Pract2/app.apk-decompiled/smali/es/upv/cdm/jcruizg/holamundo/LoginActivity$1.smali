.class Les/upv/cdm/jcruizg/holamundo/LoginActivity$1;
.super Ljava/lang/Object;
.source "LoginActivity.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/holamundo/LoginActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)V
    .locals 0

    .line 75
    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$1;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-eq p2, p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 79
    :cond_1
    :goto_0
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$1;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-static {p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$000(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)V

    const/4 p1, 0x1

    return p1
.end method
