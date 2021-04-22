.class public Les/upv/cdm/jcruizg/holamundo/LoginActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "LoginActivity.java"

# interfaces
.implements Landroid/app/LoaderManager$LoaderCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;,
        Les/upv/cdm/jcruizg/holamundo/LoginActivity$ProfileQuery;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/app/AppCompatActivity;",
        "Landroid/app/LoaderManager$LoaderCallbacks<",
        "Landroid/database/Cursor;",
        ">;"
    }
.end annotation


# static fields
.field private static final DUMMY_CREDENTIALS:[Ljava/lang/String;

.field private static final REQUEST_READ_CONTACTS:I


# instance fields
.field private mAuthTask:Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

.field private mEmailView:Landroid/widget/AutoCompleteTextView;

.field private mLoginFormView:Landroid/view/View;

.field private mPasswordView:Landroid/widget/EditText;

.field private mProgressView:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "cdm@upv.es:holamundo"

    const-string v1, "reversing@upv.es:mundohola"

    .line 52
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->DUMMY_CREDENTIALS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mAuthTask:Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    return-void
.end method

.method static synthetic access$000(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->attemptLogin()V

    return-void
.end method

.method static synthetic access$100(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)Landroid/view/View;
    .locals 0

    .line 41
    iget-object p0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mLoginFormView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$200(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)Landroid/view/View;
    .locals 0

    .line 41
    iget-object p0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mProgressView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$300()[Ljava/lang/String;
    .locals 1

    .line 41
    sget-object v0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->DUMMY_CREDENTIALS:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$402(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;)Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;
    .locals 0

    .line 41
    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mAuthTask:Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    return-object p1
.end method

.method static synthetic access$500(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Z)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->showProgress(Z)V

    return-void
.end method

.method static synthetic access$600(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)Landroid/widget/EditText;
    .locals 0

    .line 41
    iget-object p0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mPasswordView:Landroid/widget/EditText;

    return-object p0
.end method

.method private addEmailsToAutoComplete(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 276
    new-instance v0, Landroid/widget/ArrayAdapter;

    const v1, 0x109000a

    invoke-direct {v0, p0, v1, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 280
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method private attemptLogin()V
    .locals 8

    .line 148
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mAuthTask:Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    if-eqz v0, :cond_0

    return-void

    .line 153
    :cond_0
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setError(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mPasswordView:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 157
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 158
    iget-object v2, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mPasswordView:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 164
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    invoke-direct {p0, v2}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->isPasswordValid(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 165
    iget-object v3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mPasswordView:Landroid/widget/EditText;

    const v6, 0x7f0d0031

    invoke-virtual {p0, v6}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 166
    iget-object v3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mPasswordView:Landroid/widget/EditText;

    move-object v6, v3

    move v3, v5

    goto :goto_0

    :cond_1
    move-object v6, v1

    move v3, v4

    .line 171
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 172
    iget-object v3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    const v6, 0x7f0d002e

    invoke-virtual {p0, v6}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/AutoCompleteTextView;->setError(Ljava/lang/CharSequence;)V

    .line 173
    iget-object v6, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    move v3, v5

    goto :goto_1

    .line 175
    :cond_2
    invoke-direct {p0, v0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->isEmailValid(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 176
    iget-object v3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    const v6, 0x7f0d0030

    invoke-virtual {p0, v6}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/AutoCompleteTextView;->setError(Ljava/lang/CharSequence;)V

    .line 177
    iget-object v6, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    move v3, v5

    :cond_3
    :goto_1
    if-eqz v3, :cond_4

    .line 184
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    goto :goto_2

    .line 188
    :cond_4
    invoke-direct {p0, v5}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->showProgress(Z)V

    .line 189
    new-instance v3, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    invoke-direct {v3, p0, v0, v2}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;-><init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mAuthTask:Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    .line 190
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mAuthTask:Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;

    new-array v2, v5, [Ljava/lang/Void;

    check-cast v1, Ljava/lang/Void;

    aput-object v1, v2, v4

    invoke-virtual {v0, v2}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$UserLoginTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_2
    return-void
.end method

.method private isEmailValid(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "@"

    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method private isPasswordValid(Ljava/lang/String;)Z
    .locals 1

    .line 201
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x4

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private mayRequestContacts()Z
    .locals 4

    .line 107
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    const-string v0, "android.permission.READ_CONTACTS"

    .line 110
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const-string v0, "android.permission.READ_CONTACTS"

    .line 113
    invoke-virtual {p0, v0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 114
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    const v2, 0x7f0d003b

    const/4 v3, -0x2

    invoke-static {v0, v2, v3}, Landroid/support/design/widget/Snackbar;->make(Landroid/view/View;II)Landroid/support/design/widget/Snackbar;

    move-result-object v0

    const v2, 0x104000a

    new-instance v3, Les/upv/cdm/jcruizg/holamundo/LoginActivity$3;

    invoke-direct {v3, p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$3;-><init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)V

    .line 115
    invoke-virtual {v0, v2, v3}, Landroid/support/design/widget/Snackbar;->setAction(ILandroid/view/View$OnClickListener;)Landroid/support/design/widget/Snackbar;

    goto :goto_0

    :cond_2
    const-string v0, "android.permission.READ_CONTACTS"

    .line 123
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->requestPermissions([Ljava/lang/String;I)V

    :goto_0
    return v1
.end method

.method private populateAutoComplete()V
    .locals 3

    .line 99
    invoke-direct {p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mayRequestContacts()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 103
    :cond_0
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->getLoaderManager()Landroid/app/LoaderManager;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0}, Landroid/app/LoaderManager;->initLoader(ILandroid/os/Bundle;Landroid/app/LoaderManager$LoaderCallbacks;)Landroid/content/Loader;

    return-void
.end method

.method private showProgress(Z)V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0xd
    .end annotation

    .line 212
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/16 v3, 0xd

    if-lt v0, v3, :cond_4

    .line 213
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v3, 0x10e0000

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    .line 215
    iget-object v3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mLoginFormView:Landroid/view/View;

    if-eqz p1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 216
    iget-object v3, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mLoginFormView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v3, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    move v7, v3

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v7, Les/upv/cdm/jcruizg/holamundo/LoginActivity$4;

    invoke-direct {v7, p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$4;-><init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Z)V

    .line 217
    invoke-virtual {v0, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 224
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mProgressView:Landroid/view/View;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 225
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mProgressView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz p1, :cond_3

    move v3, v6

    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Les/upv/cdm/jcruizg/holamundo/LoginActivity$5;

    invoke-direct {v1, p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$5;-><init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;Z)V

    .line 226
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_4

    .line 235
    :cond_4
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mProgressView:Landroid/view/View;

    if-eqz p1, :cond_5

    move v3, v1

    goto :goto_3

    :cond_5
    move v3, v2

    :goto_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 236
    iget-object v0, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mLoginFormView:Landroid/view/View;

    if-eqz p1, :cond_6

    move v1, v2

    :cond_6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 68
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001c

    .line 69
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->setContentView(I)V

    const p1, 0x7f08003f

    .line 71
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/AutoCompleteTextView;

    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mEmailView:Landroid/widget/AutoCompleteTextView;

    .line 72
    invoke-direct {p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->populateAutoComplete()V

    const p1, 0x7f080079

    .line 74
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mPasswordView:Landroid/widget/EditText;

    .line 75
    iget-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mPasswordView:Landroid/widget/EditText;

    new-instance v0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$1;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$1;-><init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    const p1, 0x7f080041

    .line 86
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 87
    new-instance v0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$2;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity$2;-><init>(Les/upv/cdm/jcruizg/holamundo/LoginActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f080063

    .line 94
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mLoginFormView:Landroid/view/View;

    const p1, 0x7f080064

    .line 95
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->mProgressView:Landroid/view/View;

    return-void
.end method

.method public onCreateLoader(ILandroid/os/Bundle;)Landroid/content/Loader;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Landroid/content/Loader<",
            "Landroid/database/Cursor;",
            ">;"
        }
    .end annotation

    .line 242
    new-instance p1, Landroid/content/CursorLoader;

    sget-object p2, Landroid/provider/ContactsContract$Profile;->CONTENT_URI:Landroid/net/Uri;

    const-string v0, "data"

    .line 244
    invoke-static {p2, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    sget-object v3, Les/upv/cdm/jcruizg/holamundo/LoginActivity$ProfileQuery;->PROJECTION:[Ljava/lang/String;

    const-string v4, "mimetype = ?"

    const-string p2, "vnd.android.cursor.item/email_v2"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "is_primary DESC"

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Landroid/content/CursorLoader;-><init>(Landroid/content/Context;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public onLoadFinished(Landroid/content/Loader;Landroid/database/Cursor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Loader<",
            "Landroid/database/Cursor;",
            ">;",
            "Landroid/database/Cursor;",
            ")V"
        }
    .end annotation

    .line 259
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 260
    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 261
    :goto_0
    invoke-interface {p2}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 262
    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    invoke-interface {p2}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_0

    .line 266
    :cond_0
    invoke-direct {p0, p1}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->addEmailsToAutoComplete(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic onLoadFinished(Landroid/content/Loader;Ljava/lang/Object;)V
    .locals 0

    .line 41
    check-cast p2, Landroid/database/Cursor;

    invoke-virtual {p0, p1, p2}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->onLoadFinished(Landroid/content/Loader;Landroid/database/Cursor;)V

    return-void
.end method

.method public onLoaderReset(Landroid/content/Loader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Loader<",
            "Landroid/database/Cursor;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 135
    array-length p1, p3

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    aget p1, p3, p1

    if-nez p1, :cond_0

    .line 136
    invoke-direct {p0}, Les/upv/cdm/jcruizg/holamundo/LoginActivity;->populateAutoComplete()V

    :cond_0
    return-void
.end method
