.class public final Landroid/support/v4/widget/CompoundButtonCompat;
.super Ljava/lang/Object;
.source "CompoundButtonCompat.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "CompoundButtonCompat"

.field private static sButtonDrawableField:Ljava/lang/reflect/Field;

.field private static sButtonDrawableFieldFetched:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getButtonDrawable(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;
    .locals 4
    .param p0    # Landroid/widget/CompoundButton;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 123
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 124
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    .line 127
    :cond_0
    sget-boolean v0, Landroid/support/v4/widget/CompoundButtonCompat;->sButtonDrawableFieldFetched:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 129
    :try_start_0
    const-class v1, Landroid/widget/CompoundButton;

    const-string v2, "mButtonDrawable"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Landroid/support/v4/widget/CompoundButtonCompat;->sButtonDrawableField:Ljava/lang/reflect/Field;

    .line 130
    sget-object v1, Landroid/support/v4/widget/CompoundButtonCompat;->sButtonDrawableField:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "CompoundButtonCompat"

    const-string v3, "Failed to retrieve mButtonDrawable field"

    .line 132
    invoke-static {v2, v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 134
    :goto_0
    sput-boolean v0, Landroid/support/v4/widget/CompoundButtonCompat;->sButtonDrawableFieldFetched:Z

    .line 137
    :cond_1
    sget-object v0, Landroid/support/v4/widget/CompoundButtonCompat;->sButtonDrawableField:Ljava/lang/reflect/Field;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 139
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    const-string v0, "CompoundButtonCompat"

    const-string v2, "Failed to get button drawable via reflection"

    .line 141
    invoke-static {v0, v2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 142
    sput-object v1, Landroid/support/v4/widget/CompoundButtonCompat;->sButtonDrawableField:Ljava/lang/reflect/Field;

    :cond_2
    return-object v1
.end method

.method public static getButtonTintList(Landroid/widget/CompoundButton;)Landroid/content/res/ColorStateList;
    .locals 2
    .param p0    # Landroid/widget/CompoundButton;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 72
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    .line 74
    :cond_0
    instance-of v0, p0, Landroid/support/v4/widget/TintableCompoundButton;

    if-eqz v0, :cond_1

    .line 75
    check-cast p0, Landroid/support/v4/widget/TintableCompoundButton;

    invoke-interface {p0}, Landroid/support/v4/widget/TintableCompoundButton;->getSupportButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getButtonTintMode(Landroid/widget/CompoundButton;)Landroid/graphics/PorterDuff$Mode;
    .locals 2
    .param p0    # Landroid/widget/CompoundButton;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 107
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 108
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0

    .line 110
    :cond_0
    instance-of v0, p0, Landroid/support/v4/widget/TintableCompoundButton;

    if-eqz v0, :cond_1

    .line 111
    check-cast p0, Landroid/support/v4/widget/TintableCompoundButton;

    invoke-interface {p0}, Landroid/support/v4/widget/TintableCompoundButton;->getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static setButtonTintList(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
    .locals 2
    .param p0    # Landroid/widget/CompoundButton;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 57
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 58
    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 59
    :cond_0
    instance-of v0, p0, Landroid/support/v4/widget/TintableCompoundButton;

    if-eqz v0, :cond_1

    .line 60
    check-cast p0, Landroid/support/v4/widget/TintableCompoundButton;

    invoke-interface {p0, p1}, Landroid/support/v4/widget/TintableCompoundButton;->setSupportButtonTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static setButtonTintMode(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    .locals 2
    .param p0    # Landroid/widget/CompoundButton;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 93
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 94
    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 95
    :cond_0
    instance-of v0, p0, Landroid/support/v4/widget/TintableCompoundButton;

    if-eqz v0, :cond_1

    .line 96
    check-cast p0, Landroid/support/v4/widget/TintableCompoundButton;

    invoke-interface {p0, p1}, Landroid/support/v4/widget/TintableCompoundButton;->setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    :goto_0
    return-void
.end method
