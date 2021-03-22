.class Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;
.super Ljava/lang/Object;
.source "DoTransfer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;


# direct methods
.method constructor <init>(Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;)V
    .locals 0
    .param p1, "this$1"    # Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    .prologue
    .line 186
    iput-object p1, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 191
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    const-string v5, "result"

    invoke-virtual {v4, v5}, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->AsyncHttpTransferPost(Ljava/lang/String;)V

    .line 192
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer;->result:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 193
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer;->result:Ljava/lang/String;

    const-string v5, "Success"

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    .line 194
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    const-string v5, "Transfer Successful!!"

    sget-object v6, Lcom/marcohc/toasteroid/Toasteroid$STYLES;->SUCCESS:Lcom/marcohc/toasteroid/Toasteroid$STYLES;

    invoke-static {v4, v5, v6, v7}, Lcom/marcohc/toasteroid/Toasteroid;->show(Landroid/app/Activity;Ljava/lang/String;Lcom/marcohc/toasteroid/Toasteroid$STYLES;I)V

    .line 197
    :try_start_0
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    new-instance v5, Lorg/json/JSONObject;

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->result:Ljava/lang/String;

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v5, v4, Lcom/android/insecurebankv2/DoTransfer;->jsonObject:Lorg/json/JSONObject;

    .line 198
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->jsonObject:Lorg/json/JSONObject;

    const-string v6, "from"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/android/insecurebankv2/DoTransfer;->acc1:Ljava/lang/String;

    .line 199
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->jsonObject:Lorg/json/JSONObject;

    const-string v6, "to"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/android/insecurebankv2/DoTransfer;->acc2:Ljava/lang/String;

    .line 200
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Message:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->jsonObject:Lorg/json/JSONObject;

    const-string v7, "message"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " From:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->from:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " To:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->to:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " Amount:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->amount:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 201
    new-instance v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\nMessage:Success From:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->from:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " To:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->to:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " Amount:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->amount:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 204
    .local v3, "status":Ljava/lang/String;
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/Statements_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->usernameBase64ByteString:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".html"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 205
    .local v0, "MYFILE":Ljava/lang/String;
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v4, Ljava/io/FileWriter;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v5}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v2, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 206
    .local v2, "out2":Ljava/io/BufferedWriter;
    invoke-virtual {v2, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 207
    const-string v4, "<hr>"

    invoke-virtual {v2, v4}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 208
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 234
    .end local v0    # "MYFILE":Ljava/lang/String;
    .end local v2    # "out2":Ljava/io/BufferedWriter;
    .end local v3    # "status":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 209
    .restart local v3    # "status":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 210
    .local v1, "e":Ljava/io/IOException;
    :try_start_2
    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 212
    .end local v1    # "e":Ljava/io/IOException;
    .end local v3    # "status":Ljava/lang/String;
    :catch_1
    move-exception v1

    .line 214
    .local v1, "e":Lorg/json/JSONException;
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 217
    .end local v1    # "e":Lorg/json/JSONException;
    :cond_1
    iget-object v4, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v4, v4, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    const-string v5, "Transfer Failed!!"

    sget-object v6, Lcom/marcohc/toasteroid/Toasteroid$STYLES;->ERROR:Lcom/marcohc/toasteroid/Toasteroid$STYLES;

    invoke-static {v4, v5, v6, v7}, Lcom/marcohc/toasteroid/Toasteroid;->show(Landroid/app/Activity;Ljava/lang/String;Lcom/marcohc/toasteroid/Toasteroid$STYLES;I)V

    .line 220
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Message:Failure From:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->from:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " To:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->to:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " Amount:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v6, v6, Lcom/android/insecurebankv2/DoTransfer;->amount:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 221
    new-instance v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\nMessage:Failure From:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->from:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " To:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->to:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " Amount:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->amount:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 223
    .restart local v3    # "status":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/Statements_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask$1;->this$1:Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer$RequestDoTransferTask;->this$0:Lcom/android/insecurebankv2/DoTransfer;

    iget-object v5, v5, Lcom/android/insecurebankv2/DoTransfer;->usernameBase64ByteString:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".html"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 225
    .restart local v0    # "MYFILE":Ljava/lang/String;
    :try_start_3
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v4, Ljava/io/FileWriter;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v5}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v2, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 226
    .restart local v2    # "out2":Ljava/io/BufferedWriter;
    invoke-virtual {v2, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 227
    const-string v4, "<hr>"

    invoke-virtual {v2, v4}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 228
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_0

    .line 229
    .end local v2    # "out2":Ljava/io/BufferedWriter;
    :catch_2
    move-exception v1

    .line 230
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    goto/16 :goto_0
.end method
