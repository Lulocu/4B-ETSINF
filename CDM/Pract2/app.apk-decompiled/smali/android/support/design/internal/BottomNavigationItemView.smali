.class public Landroid/support/design/internal/BottomNavigationItemView;
.super Landroid/widget/FrameLayout;
.source "BottomNavigationItemView.java"

# interfaces
.implements Landroid/support/v7/view/menu/MenuView$ItemView;


# annotations
.annotation build Landroid/support/annotation/RestrictTo;
    value = {
        .enum Landroid/support/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroid/support/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field private static final CHECKED_STATE_SET:[I

.field public static final INVALID_ITEM_POSITION:I = -0x1


# instance fields
.field private final defaultMargin:I

.field private icon:Landroid/widget/ImageView;

.field private iconTint:Landroid/content/res/ColorStateList;

.field private isShifting:Z

.field private itemData:Landroid/support/v7/view/menu/MenuItemImpl;

.field private itemPosition:I

.field private labelVisibilityMode:I

.field private final largeLabel:Landroid/widget/TextView;

.field private scaleDownFactor:F

.field private scaleUpFactor:F

.field private shiftAmount:F

.field private final smallLabel:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    .line 53
    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100a0

    aput v2, v0, v1

    sput-object v0, Landroid/support/design/internal/BottomNavigationItemView;->CHECKED_STATE_SET:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 73
    invoke-direct {p0, p1, v0}, Landroid/support/design/internal/BottomNavigationItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 77
    invoke-direct {p0, p1, p2, v0}, Landroid/support/design/internal/BottomNavigationItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 81
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, -0x1

    .line 66
    iput p2, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemPosition:I

    .line 82
    invoke-virtual {p0}, Landroid/support/design/internal/BottomNavigationItemView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 84
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p3, Landroid/support/design/R$layout;->design_bottom_navigation_item:I

    const/4 v0, 0x1

    invoke-virtual {p1, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 85
    sget p1, Landroid/support/design/R$drawable;->design_bottom_navigation_item_background:I

    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setBackgroundResource(I)V

    .line 86
    sget p1, Landroid/support/design/R$dimen;->design_bottom_navigation_margin:I

    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    .line 88
    sget p1, Landroid/support/design/R$id;->icon:I

    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    .line 89
    sget p1, Landroid/support/design/R$id;->smallLabel:I

    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    .line 90
    sget p1, Landroid/support/design/R$id;->largeLabel:I

    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    .line 93
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    const/4 p2, 0x2

    invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 94
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 95
    invoke-virtual {p0, v0}, Landroid/support/design/internal/BottomNavigationItemView;->setFocusable(Z)V

    .line 96
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    move-result p1

    iget-object p2, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getTextSize()F

    move-result p2

    invoke-direct {p0, p1, p2}, Landroid/support/design/internal/BottomNavigationItemView;->calculateTextScaleFactors(FF)V

    return-void
.end method

.method private calculateTextScaleFactors(FF)V
    .locals 2

    sub-float v0, p1, p2

    .line 331
    iput v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->shiftAmount:F

    const/high16 v0, 0x3f800000    # 1.0f

    mul-float v1, p2, v0

    div-float/2addr v1, p1

    .line 332
    iput v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->scaleUpFactor:F

    mul-float/2addr p1, v0

    div-float/2addr p1, p2

    .line 333
    iput p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->scaleDownFactor:F

    return-void
.end method

.method private setViewLayoutParams(Landroid/view/View;II)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 238
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 239
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 240
    iput p3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 241
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private setViewValues(Landroid/view/View;FFI)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 245
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    .line 246
    invoke-virtual {p1, p3}, Landroid/view/View;->setScaleY(F)V

    .line 247
    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public getItemData()Landroid/support/v7/view/menu/MenuItemImpl;
    .locals 1

    .line 147
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    return-object v0
.end method

.method public getItemPosition()I
    .locals 1

    .line 120
    iget v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemPosition:I

    return v0
.end method

.method public initialize(Landroid/support/v7/view/menu/MenuItemImpl;I)V
    .locals 0

    .line 101
    iput-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    .line 102
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->isCheckable()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/support/design/internal/BottomNavigationItemView;->setCheckable(Z)V

    .line 103
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->isChecked()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/support/design/internal/BottomNavigationItemView;->setChecked(Z)V

    .line 104
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->isEnabled()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroid/support/design/internal/BottomNavigationItemView;->setEnabled(Z)V

    .line 105
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/support/design/internal/BottomNavigationItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 106
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->getTitle()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/support/design/internal/BottomNavigationItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 107
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->getItemId()I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/support/design/internal/BottomNavigationItemView;->setId(I)V

    .line 108
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 109
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/support/design/internal/BottomNavigationItemView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 111
    :cond_0
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p0, p2}, Landroid/support/v7/widget/TooltipCompat;->setTooltipText(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 112
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->isVisible()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setVisibility(I)V

    return-void
.end method

.method public onCreateDrawableState(I)[I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    .line 267
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onCreateDrawableState(I)[I

    move-result-object p1

    .line 268
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/view/menu/MenuItemImpl;->isCheckable()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    invoke-virtual {v0}, Landroid/support/v7/view/menu/MenuItemImpl;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    sget-object v0, Landroid/support/design/internal/BottomNavigationItemView;->CHECKED_STATE_SET:[I

    invoke-static {p1, v0}, Landroid/support/design/internal/BottomNavigationItemView;->mergeDrawableStates([I[I)[I

    :cond_0
    return-object p1
.end method

.method public prefersCondensedTitle()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setCheckable(Z)V
    .locals 0

    .line 161
    invoke-virtual {p0}, Landroid/support/design/internal/BottomNavigationItemView;->refreshDrawableState()V

    return-void
.end method

.method public setChecked(Z)V
    .locals 7

    .line 166
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotX(F)V

    .line 167
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getBaseline()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotY(F)V

    .line 168
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotX(F)V

    .line 169
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getBaseline()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotY(F)V

    .line 171
    iget v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->labelVisibilityMode:I

    const/16 v1, 0x11

    const/high16 v2, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    const/16 v4, 0x31

    const/4 v5, 0x4

    const/high16 v6, 0x3f800000    # 1.0f

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 221
    :pswitch_0
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v2, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    invoke-direct {p0, v0, v2, v1}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 222
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_2

    :pswitch_1
    if-eqz p1, :cond_0

    .line 209
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    int-to-float v1, v1

    iget v2, p0, Landroid/support/design/internal/BottomNavigationItemView;->shiftAmount:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-direct {p0, v0, v1, v4}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 211
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6, v6, v3}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    .line 212
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->scaleUpFactor:F

    invoke-direct {p0, v0, v1, v1, v5}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    goto/16 :goto_2

    .line 214
    :cond_0
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    invoke-direct {p0, v0, v1, v4}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 215
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->scaleDownFactor:F

    invoke-direct {p0, v0, v1, v1, v5}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    .line 216
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6, v6, v3}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    goto/16 :goto_2

    :pswitch_2
    if-eqz p1, :cond_1

    .line 198
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    invoke-direct {p0, v0, v1, v4}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 199
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6, v6, v3}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    goto :goto_0

    .line 201
    :cond_1
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v3, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    invoke-direct {p0, v0, v3, v1}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 202
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2, v2, v5}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    .line 204
    :goto_0
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 173
    :pswitch_3
    iget-boolean v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->isShifting:Z

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    .line 175
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    invoke-direct {p0, v0, v1, v4}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 176
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6, v6, v3}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    goto :goto_1

    .line 178
    :cond_2
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v3, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    invoke-direct {p0, v0, v3, v1}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 179
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2, v2, v5}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    .line 181
    :goto_1
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    :cond_3
    if-eqz p1, :cond_4

    .line 184
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    int-to-float v1, v1

    iget v2, p0, Landroid/support/design/internal/BottomNavigationItemView;->shiftAmount:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-direct {p0, v0, v1, v4}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 186
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6, v6, v3}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    .line 187
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->scaleUpFactor:F

    invoke-direct {p0, v0, v1, v1, v5}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    goto :goto_2

    .line 189
    :cond_4
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->defaultMargin:I

    invoke-direct {p0, v0, v1, v4}, Landroid/support/design/internal/BottomNavigationItemView;->setViewLayoutParams(Landroid/view/View;II)V

    .line 190
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    iget v1, p0, Landroid/support/design/internal/BottomNavigationItemView;->scaleDownFactor:F

    invoke-direct {p0, v0, v1, v1, v5}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    .line 191
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-direct {p0, v0, v6, v6, v3}, Landroid/support/design/internal/BottomNavigationItemView;->setViewValues(Landroid/view/View;FFI)V

    .line 230
    :goto_2
    invoke-virtual {p0}, Landroid/support/design/internal/BottomNavigationItemView;->refreshDrawableState()V

    .line 234
    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setSelected(Z)V

    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 252
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    .line 253
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 254
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 255
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setEnabled(Z)V

    if-eqz p1, :cond_0

    .line 259
    invoke-virtual {p0}, Landroid/support/design/internal/BottomNavigationItemView;->getContext()Landroid/content/Context;

    move-result-object p1

    const/16 v0, 0x3ea

    invoke-static {p1, v0}, Landroid/support/v4/view/PointerIconCompat;->getSystemIcon(Landroid/content/Context;I)Landroid/support/v4/view/PointerIconCompat;

    move-result-object p1

    .line 258
    invoke-static {p0, p1}, Landroid/support/v4/view/ViewCompat;->setPointerIcon(Landroid/view/View;Landroid/support/v4/view/PointerIconCompat;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 261
    invoke-static {p0, p1}, Landroid/support/v4/view/ViewCompat;->setPointerIcon(Landroid/view/View;Landroid/support/v4/view/PointerIconCompat;)V

    :goto_0
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 280
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 282
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 283
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->iconTint:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTintList(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 285
    :cond_1
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setIconSize(I)V
    .locals 1

    .line 307
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 308
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 309
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 310
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->icon:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 299
    iput-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->iconTint:Landroid/content/res/ColorStateList;

    .line 300
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    if-eqz p1, :cond_0

    .line 302
    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setItemBackground(I)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 338
    :cond_0
    invoke-virtual {p0}, Landroid/support/design/internal/BottomNavigationItemView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 339
    :goto_0
    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 343
    invoke-static {p0, p1}, Landroid/support/v4/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemPosition(I)V
    .locals 0

    .line 116
    iput p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemPosition:I

    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 1

    .line 135
    iget v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->labelVisibilityMode:I

    if-eq v0, p1, :cond_1

    .line 136
    iput p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->labelVisibilityMode:I

    .line 138
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 140
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->isChecked()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setChecked(Z)V

    :cond_1
    return-void
.end method

.method public setShifting(Z)V
    .locals 1

    .line 124
    iget-boolean v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->isShifting:Z

    if-eq v0, p1, :cond_1

    .line 125
    iput-boolean p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->isShifting:Z

    .line 127
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 129
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    invoke-virtual {p1}, Landroid/support/v7/view/menu/MenuItemImpl;->isChecked()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setChecked(Z)V

    :cond_1
    return-void
.end method

.method public setShortcut(ZC)V
    .locals 0

    return-void
.end method

.method public setTextAppearanceActive(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 319
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-static {v0, p1}, Landroid/support/v4/widget/TextViewCompat;->setTextAppearance(Landroid/widget/TextView;I)V

    .line 320
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    move-result p1

    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/support/design/internal/BottomNavigationItemView;->calculateTextScaleFactors(FF)V

    return-void
.end method

.method public setTextAppearanceInactive(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 314
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-static {v0, p1}, Landroid/support/v4/widget/TextViewCompat;->setTextAppearance(Landroid/widget/TextView;I)V

    .line 315
    iget-object p1, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    move-result p1

    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/support/design/internal/BottomNavigationItemView;->calculateTextScaleFactors(FF)V

    return-void
.end method

.method public setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 325
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 326
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 152
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->smallLabel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->largeLabel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v0, p0, Landroid/support/design/internal/BottomNavigationItemView;->itemData:Landroid/support/v7/view/menu/MenuItemImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v7/view/menu/MenuItemImpl;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/design/internal/BottomNavigationItemView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public showsIcon()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
