.class public Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;
.super Landroid/os/AsyncTask;
.source "LoginActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/upv/cdm/jcruizg/holamundo/LoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "UserLoginTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final mEmail:Ljava/lang/String;

.field private final mPassword:Ljava/lang/String;

.field final synthetic this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 303
    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 304
    iput-object p2, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->mEmail:Ljava/lang/String;

    .line 305
    iput-object p3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->mPassword:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 6

    const-wide/16 v0, 0x7d0

    const/4 p1, 0x0

    .line 314
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    invoke-static {}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$300()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    const-string v4, ":"

    .line 320
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 321
    aget-object v4, v3, p1

    iget-object v5, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->mEmail:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    .line 323
    aget-object p1, v3, p1

    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->mPassword:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 328
    :cond_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 316
    :catch_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 298
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected onCancelled()V
    .locals 2

    .line 347
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$402(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;)Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    .line 348
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$500(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Z)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 3

    .line 333
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$402(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;)Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    .line 334
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$500(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Z)V

    .line 336
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 338
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Les/upv/cdm/jcruizg/holamundo/SegundaActividad;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 340
    :cond_0
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-static {p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$600(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)Landroid/widget/EditText;

    move-result-object p1

    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    const v1, 0x7f0d002f

    invoke-virtual {v0, v1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 341
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->this$0:Les/upv/cdm/jcruizg/holamundo/LoginActivity;

    invoke-static {p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->access$600(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 298
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
