.class Les/upv/cdm/jcruizg/holamundo/LoginActivity$3;
.super Ljava/lang/Object;
.source "LoginActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mayRequestContacts()Z
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

    .line 115
    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$3;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 119
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$3;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    const-string v0, "android.permission.READ_CONTACTS"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method
