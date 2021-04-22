.class public Lcom/android/insecurebankv2/LoginActivity;
.super Landroid/app/Activity;
.source "LoginActivity.java"


# static fields
.field public static final MYPREFS:Ljava/lang/String; = "mySharedPreferences"


# instance fields
.field Password_Text:Landroid/widget/EditText;

.field Username_Text:Landroid/widget/EditText;

.field createuser_buttons:Landroid/widget/Button;

.field fillData_button:Landroid/widget/Button;

.field login_buttons:Landroid/widget/Button;

.field usernameBase64ByteString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public callPreferences()V
    .locals 2

    .prologue
    .line 204
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/android/insecurebankv2/FilePrefActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 205
    .local v0, "i":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/android/insecurebankv2/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 206
    return-void
.end method

.method protected createUser()V
    .locals 3

    .prologue
    .line 117
    const-string v0, "Create User functionality is still Work-In-Progress!!"

    sget-object v1, Lcom/marcohc/toasteroid/Toasteroid$STYLES;->WARNING:Lcom/marcohc/toasteroid/Toasteroid$STYLES;

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2}, Lcom/marcohc/toasteroid/Toasteroid;->show(Landroid/app/Activity;Ljava/lang/String;Lcom/marcohc/toasteroid/Toasteroid$STYLES;I)V

    .line 120
    return-void
.end method

.method protected fillData()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/InvalidAlgorithmParameterException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;
        }
    .end annotation

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x0

    .line 129
    const-string v7, "mySharedPreferences"

    invoke-virtual {p0, v7, v8}, Lcom/android/insecurebankv2/LoginActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 130
    .local v4, "settings":Landroid/content/SharedPreferences;
    const-string v7, "EncryptedUsername"

    invoke-interface {v4, v7, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 131
    .local v5, "username":Ljava/lang/String;
    const-string v7, "superSecurePassword"

    invoke-interface {v4, v7, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 134
    .local v3, "password":Ljava/lang/String;
    if-eqz v5, :cond_1

    if-eqz v3, :cond_1

    .line 136
    invoke-static {v5, v8}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    .line 138
    .local v6, "usernameBase64Byte":[B
    :try_start_0
    new-instance v7, Ljava/lang/String;

    const-string v8, "UTF-8"

    invoke-direct {v7, v6, v8}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    iput-object v7, p0, Lcom/android/insecurebankv2/LoginActivity;->usernameBase64ByteString:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :goto_0
    const v7, 0x7f0d0078

    invoke-virtual {p0, v7}, Lcom/android/insecurebankv2/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/EditText;

    iput-object v7, p0, Lcom/android/insecurebankv2/LoginActivity;->Username_Text:Landroid/widget/EditText;

    .line 144
    const v7, 0x7f0d0079

    invoke-virtual {p0, v7}, Lcom/android/insecurebankv2/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/EditText;

    iput-object v7, p0, Lcom/android/insecurebankv2/LoginActivity;->Password_Text:Landroid/widget/EditText;

    .line 145
    iget-object v7, p0, Lcom/android/insecurebankv2/LoginActivity;->Username_Text:Landroid/widget/EditText;

    iget-object v8, p0, Lcom/android/insecurebankv2/LoginActivity;->usernameBase64ByteString:Ljava/lang/String;

    invoke-virtual {v7, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 146
    new-instance v0, Lcom/android/insecurebankv2/CryptoClass;

    invoke-direct {v0}, Lcom/android/insecurebankv2/CryptoClass;-><init>()V

    .line 147
    .local v0, "crypt":Lcom/android/insecurebankv2/CryptoClass;
    invoke-virtual {v0, v3}, Lcom/android/insecurebankv2/CryptoClass;->aesDeccryptedString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 148
    .local v1, "decryptedPassword":Ljava/lang/String;
    iget-object v7, p0, Lcom/android/insecurebankv2/LoginActivity;->Password_Text:Landroid/widget/EditText;

    invoke-virtual {v7, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 159
    .end local v0    # "crypt":Lcom/android/insecurebankv2/CryptoClass;
    .end local v1    # "decryptedPassword":Ljava/lang/String;
    .end local v6    # "usernameBase64Byte":[B
    :cond_0
    :goto_1
    return-void

    .line 139
    .restart local v6    # "usernameBase64Byte":[B
    :catch_0
    move-exception v2

    .line 141
    .local v2, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual {v2}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0

    .line 150
    .end local v2    # "e":Ljava/io/UnsupportedEncodingException;
    .end local v6    # "usernameBase64Byte":[B
    :cond_1
    if-eqz v5, :cond_0

    if-nez v3, :cond_0

    goto :goto_1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const v5, 0x7f0d006e

    .line 50
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    const v3, 0x7f04001d

    invoke-virtual {p0, v3}, Lcom/android/insecurebankv2/LoginActivity;->setContentView(I)V

    .line 52
    invoke-virtual {p0}, Lcom/android/insecurebankv2/LoginActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07004a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 53
    .local v2, "mess":Ljava/lang/String;
    const-string v3, "no"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 54
    invoke-virtual {p0, v5}, Lcom/android/insecurebankv2/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 55
    .local v0, "button_CreateUser":Landroid/view/View;
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .end local v0    # "button_CreateUser":Landroid/view/View;
    :cond_0
    const v3, 0x7f0d007b

    invoke-virtual {p0, v3}, Lcom/android/insecurebankv2/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/android/insecurebankv2/LoginActivity;->login_buttons:Landroid/widget/Button;

    .line 58
    iget-object v3, p0, Lcom/android/insecurebankv2/LoginActivity;->login_buttons:Landroid/widget/Button;

    new-instance v4, Lcom/android/insecurebankv2/LoginActivity$1;

    invoke-direct {v4, p0}, Lcom/android/insecurebankv2/LoginActivity$1;-><init>(Lcom/android/insecurebankv2/LoginActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    invoke-virtual {p0, v5}, Lcom/android/insecurebankv2/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/android/insecurebankv2/LoginActivity;->createuser_buttons:Landroid/widget/Button;

    .line 67
    iget-object v3, p0, Lcom/android/insecurebankv2/LoginActivity;->createuser_buttons:Landroid/widget/Button;

    new-instance v4, Lcom/android/insecurebankv2/LoginActivity$2;

    invoke-direct {v4, p0}, Lcom/android/insecurebankv2/LoginActivity$2;-><init>(Lcom/android/insecurebankv2/LoginActivity;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    :try_start_0
    invoke-virtual {p0}, Lcom/android/insecurebankv2/LoginActivity;->fillData()V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_6

    .line 108
    :goto_0
    return-void

    .line 78
    :catch_0
    move-exception v1

    .line 79
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0

    .line 80
    .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v1

    .line 81
    .local v1, "e":Ljava/security/InvalidKeyException;
    invoke-virtual {v1}, Ljava/security/InvalidKeyException;->printStackTrace()V

    goto :goto_0

    .line 82
    .end local v1    # "e":Ljava/security/InvalidKeyException;
    :catch_2
    move-exception v1

    .line 83
    .local v1, "e":Ljava/security/NoSuchAlgorithmException;
    invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_0

    .line 84
    .end local v1    # "e":Ljava/security/NoSuchAlgorithmException;
    :catch_3
    move-exception v1

    .line 85
    .local v1, "e":Ljavax/crypto/NoSuchPaddingException;
    invoke-virtual {v1}, Ljavax/crypto/NoSuchPaddingException;->printStackTrace()V

    goto :goto_0

    .line 86
    .end local v1    # "e":Ljavax/crypto/NoSuchPaddingException;
    :catch_4
    move-exception v1

    .line 87
    .local v1, "e":Ljava/security/InvalidAlgorithmParameterException;
    invoke-virtual {v1}, Ljava/security/InvalidAlgorithmParameterException;->printStackTrace()V

    goto :goto_0

    .line 88
    .end local v1    # "e":Ljava/security/InvalidAlgorithmParameterException;
    :catch_5
    move-exception v1

    .line 89
    .local v1, "e":Ljavax/crypto/IllegalBlockSizeException;
    invoke-virtual {v1}, Ljavax/crypto/IllegalBlockSizeException;->printStackTrace()V

    goto :goto_0

    .line 90
    .end local v1    # "e":Ljavax/crypto/IllegalBlockSizeException;
    :catch_6
    move-exception v1

    .line 91
    .local v1, "e":Ljavax/crypto/BadPaddingException;
    invoke-virtual {v1}, Ljavax/crypto/BadPaddingException;->printStackTrace()V

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 179
    invoke-virtual {p0}, Lcom/android/insecurebankv2/LoginActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0e0002

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 180
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    const/4 v2, 0x1

    .line 189
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 190
    .local v1, "id":I
    const v3, 0x7f0d009f

    if-ne v1, v3, :cond_0

    .line 191
    invoke-virtual {p0}, Lcom/android/insecurebankv2/LoginActivity;->callPreferences()V

    .line 199
    :goto_0
    return v2

    .line 193
    :cond_0
    const v3, 0x7f0d00a0

    if-ne v1, v3, :cond_1

    .line 194
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/android/insecurebankv2/LoginActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/android/insecurebankv2/LoginActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 195
    .local v0, "i":Landroid/content/Intent;
    const/high16 v3, 0x4000000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 196
    invoke-virtual {p0, v0}, Lcom/android/insecurebankv2/LoginActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 199
    .end local v0    # "i":Landroid/content/Intent;
    :cond_1
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v2

    goto :goto_0
.end method

.method protected performlogin()V
    .locals 3

    .prologue
    .line 168
    const v1, 0x7f0d0078

    invoke-virtual {p0, v1}, Lcom/android/insecurebankv2/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/android/insecurebankv2/LoginActivity;->Username_Text:Landroid/widget/EditText;

    .line 169
    const v1, 0x7f0d0079

    invoke-virtual {p0, v1}, Lcom/android/insecurebankv2/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/android/insecurebankv2/LoginActivity;->Password_Text:Landroid/widget/EditText;

    .line 170
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/android/insecurebankv2/DoLogin;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 171
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "passed_username"

    iget-object v2, p0, Lcom/android/insecurebankv2/LoginActivity;->Username_Text:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    const-string v1, "passed_password"

    iget-object v2, p0, Lcom/android/insecurebankv2/LoginActivity;->Password_Text:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 173
    invoke-virtual {p0, v0}, Lcom/android/insecurebankv2/LoginActivity;->startActivity(Landroid/content/Intent;)V

    .line 174
    return-void
.end method
