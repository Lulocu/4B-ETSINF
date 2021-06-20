.class public Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;
.super Landroid/support/v7/graphics/drawable/StateListDrawable;
.source "AnimatedStateListDrawableCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$FrameInterpolator;,
        Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;,
        Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition;,
        Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimationDrawableTransition;,
        Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatableTransition;,
        Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;
    }
.end annotation


# static fields
.field private static final ELEMENT_ITEM:Ljava/lang/String; = "item"

.field private static final ELEMENT_TRANSITION:Ljava/lang/String; = "transition"

.field private static final ITEM_MISSING_DRAWABLE_ERROR:Ljava/lang/String; = ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"

.field private static final LOGTAG:Ljava/lang/String; = "AnimatedStateListDrawableCompat"

.field private static final TRANSITION_MISSING_DRAWABLE_ERROR:Ljava/lang/String; = ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"

.field private static final TRANSITION_MISSING_FROM_TO_ID:Ljava/lang/String; = ": <transition> tag requires \'fromId\' & \'toId\' attributes"


# instance fields
.field private mMutated:Z

.field private mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

.field private mTransition:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;

.field private mTransitionFromIndex:I

.field private mTransitionToIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-direct {p0, v0, v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;-><init>(Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;Landroid/content/res/Resources;)V

    return-void
.end method

.method constructor <init>(Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;Landroid/content/res/Resources;)V
    .locals 1

    const/4 v0, 0x0

    .line 114
    invoke-direct {p0, v0}, Landroid/support/v7/graphics/drawable/StateListDrawable;-><init>(Landroid/support/v7/graphics/drawable/StateListDrawable$StateListState;)V

    const/4 v0, -0x1

    .line 103
    iput v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    .line 105
    iput v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionFromIndex:I

    .line 116
    new-instance v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    invoke-direct {v0, p1, p0, p2}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;-><init>(Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;Landroid/content/res/Resources;)V

    .line 117
    invoke-virtual {p0, v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->setConstantState(Landroid/support/v7/graphics/drawable/DrawableContainer$DrawableContainerState;)V

    .line 118
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->onStateChange([I)Z

    .line 119
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->jumpToCurrentState()V

    return-void
.end method

.method public static create(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;
    .locals 6

    const-string v0, "parser error"

    .line 137
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 139
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    .line 140
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    .line 142
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    const/4 v5, 0x1

    if-eq v3, v5, :cond_0

    goto :goto_0

    :cond_0
    if-ne v3, v4, :cond_1

    .line 149
    invoke-static {p0, v1, p1, v2, p2}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->createFromXmlInner(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;

    move-result-object p0

    return-object p0

    .line 147
    :cond_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 153
    sget-object p1, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->LOGTAG:Ljava/lang/String;

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_1
    move-exception p0

    .line 151
    sget-object p1, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->LOGTAG:Ljava/lang/String;

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static createFromXmlInner(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 170
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "animated-selector"

    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 175
    new-instance v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;

    invoke-direct {v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;-><init>()V

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    .line 176
    invoke-virtual/range {v2 .. v7}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->inflate(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-object v0

    .line 172
    :cond_0
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, ": invalid animated-selector tag "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private inflateChildElements(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 482
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 484
    :cond_0
    :goto_0
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    if-eq v2, v1, :cond_5

    .line 485
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    if-ge v3, v0, :cond_1

    const/4 v4, 0x3

    if-eq v2, v4, :cond_5

    :cond_1
    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    goto :goto_0

    :cond_2
    if-le v3, v0, :cond_3

    goto :goto_0

    .line 493
    :cond_3
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "item"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 494
    invoke-direct/range {p0 .. p5}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->parseItem(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I

    goto :goto_0

    .line 495
    :cond_4
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "transition"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 496
    invoke-direct/range {p0 .. p5}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->parseTransition(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I

    goto :goto_0

    :cond_5
    return-void
.end method

.method private init()V
    .locals 1

    .line 471
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->getState()[I

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->onStateChange([I)Z

    return-void
.end method

.method private parseItem(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 563
    sget-object v0, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableItem:[I

    invoke-static {p2, p5, p4, v0}, Landroid/support/v4/content/res/TypedArrayUtils;->obtainAttributes(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 565
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableItem_android_id:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 568
    sget v2, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableItem_android_drawable:I

    const/4 v3, -0x1

    .line 569
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-lez v2, :cond_0

    .line 571
    invoke-static {p1, v2}, Landroid/support/v7/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 573
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 574
    invoke-virtual {p0, p4}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->extractStateSet(Landroid/util/AttributeSet;)[I

    move-result-object v0

    const-string v2, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez p1, :cond_5

    .line 579
    :goto_1
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p1

    const/4 v3, 0x4

    if-ne p1, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    if-ne p1, v3, :cond_4

    .line 587
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v3, "vector"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 588
    invoke-static {p2, p3, p4, p5}, Landroid/support/graphics/drawable/VectorDrawableCompat;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/support/graphics/drawable/VectorDrawableCompat;

    move-result-object p1

    goto :goto_2

    .line 589
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt p1, v3, :cond_3

    .line 590
    invoke-static {p2, p3, p4, p5}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    .line 592
    :cond_3
    invoke-static {p2, p3, p4}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    .line 583
    :cond_4
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 584
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    if-eqz p1, :cond_6

    .line 599
    iget-object p2, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    invoke-virtual {p2, v0, p1, v1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->addStateSet([ILandroid/graphics/drawable/Drawable;I)I

    move-result p1

    return p1

    .line 596
    :cond_6
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 597
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private parseTransition(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 509
    sget-object v0, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableTransition:[I

    invoke-static {p2, p5, p4, v0}, Landroid/support/v4/content/res/TypedArrayUtils;->obtainAttributes(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 511
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableTransition_android_fromId:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 513
    sget v3, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableTransition_android_toId:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 516
    sget v4, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableTransition_android_drawable:I

    invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-lez v4, :cond_0

    .line 519
    invoke-static {p1, v4}, Landroid/support/v7/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 521
    :goto_0
    sget v5, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableTransition_android_reversible:I

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    .line 523
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    const-string v0, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez v4, :cond_5

    .line 528
    :goto_1
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    const/4 v6, 0x4

    if-ne v4, v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    if-ne v4, v6, :cond_4

    .line 536
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v6, "animated-vector"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 537
    invoke-static {p1, p2, p3, p4, p5}, Landroid/support/graphics/drawable/AnimatedVectorDrawableCompat;->createFromXmlInner(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/support/graphics/drawable/AnimatedVectorDrawableCompat;

    move-result-object v4

    goto :goto_2

    .line 539
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt p1, v4, :cond_3

    .line 540
    invoke-static {p2, p3, p4, p5}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_2

    .line 542
    :cond_3
    invoke-static {p2, p3, p4}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_2

    .line 532
    :cond_4
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 533
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    if-eqz v4, :cond_7

    if-eq v1, v2, :cond_6

    if-eq v3, v2, :cond_6

    .line 553
    iget-object p1, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    invoke-virtual {p1, v1, v3, v4, v5}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->addTransition(IILandroid/graphics/drawable/Drawable;Z)I

    move-result p1

    return p1

    .line 550
    :cond_6
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 551
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, ": <transition> tag requires \'fromId\' & \'toId\' attributes"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 546
    :cond_7
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 547
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private selectTransition(I)Z
    .locals 9

    .line 292
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransition:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 294
    iget v2, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    if-ne p1, v2, :cond_0

    return v1

    .line 297
    :cond_0
    iget v2, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionFromIndex:I

    if-ne p1, v2, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;->canReverse()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 299
    invoke-virtual {v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;->reverse()V

    .line 300
    iget v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionFromIndex:I

    iput v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    .line 301
    iput p1, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionFromIndex:I

    return v1

    .line 305
    :cond_1
    iget v2, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    .line 307
    invoke-virtual {v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;->stop()V

    goto :goto_0

    .line 309
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->getCurrentIndex()I

    move-result v2

    :goto_0
    const/4 v0, 0x0

    .line 312
    iput-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransition:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;

    const/4 v0, -0x1

    .line 313
    iput v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionFromIndex:I

    .line 314
    iput v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    .line 315
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    .line 316
    invoke-virtual {v0, v2}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->getKeyframeIdAt(I)I

    move-result v3

    .line 317
    invoke-virtual {v0, p1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->getKeyframeIdAt(I)I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    if-nez v3, :cond_3

    goto :goto_2

    .line 322
    :cond_3
    invoke-virtual {v0, v3, v4}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->indexOfTransition(II)I

    move-result v6

    if-gez v6, :cond_4

    return v5

    .line 327
    :cond_4
    invoke-virtual {v0, v3, v4}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->transitionHasReversibleFlag(II)Z

    move-result v7

    .line 329
    invoke-virtual {p0, v6}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->selectDrawable(I)Z

    .line 331
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 332
    instance-of v8, v6, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v8, :cond_5

    .line 333
    invoke-virtual {v0, v3, v4}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->isTransitionReversed(II)Z

    move-result v0

    .line 334
    new-instance v3, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimationDrawableTransition;

    check-cast v6, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v3, v6, v0, v7}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimationDrawableTransition;-><init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V

    goto :goto_1

    .line 336
    :cond_5
    instance-of v0, v6, Landroid/support/graphics/drawable/AnimatedVectorDrawableCompat;

    if-eqz v0, :cond_6

    .line 338
    new-instance v3, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition;

    check-cast v6, Landroid/support/graphics/drawable/AnimatedVectorDrawableCompat;

    invoke-direct {v3, v6}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition;-><init>(Landroid/support/graphics/drawable/AnimatedVectorDrawableCompat;)V

    goto :goto_1

    .line 339
    :cond_6
    instance-of v0, v6, Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_7

    .line 340
    new-instance v3, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatableTransition;

    check-cast v6, Landroid/graphics/drawable/Animatable;

    invoke-direct {v3, v6}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatableTransition;-><init>(Landroid/graphics/drawable/Animatable;)V

    .line 345
    :goto_1
    invoke-virtual {v3}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;->start()V

    .line 346
    iput-object v3, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransition:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;

    .line 347
    iput v2, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionFromIndex:I

    .line 348
    iput p1, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    return v1

    :cond_7
    :goto_2
    return v5
.end method

.method private updateStateFromTypedArray(Landroid/content/res/TypedArray;)V
    .locals 3

    .line 448
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    .line 450
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 451
    iget v1, v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mChangingConfigurations:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v2

    or-int/2addr v1, v2

    iput v1, v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mChangingConfigurations:I

    .line 454
    :cond_0
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableCompat_android_variablePadding:I

    iget-boolean v2, v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mVariablePadding:Z

    .line 455
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 454
    invoke-virtual {v0, v1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->setVariablePadding(Z)V

    .line 457
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableCompat_android_constantSize:I

    iget-boolean v2, v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mConstantSize:Z

    .line 458
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 457
    invoke-virtual {v0, v1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->setConstantSize(Z)V

    .line 460
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableCompat_android_enterFadeDuration:I

    iget v2, v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mEnterFadeDuration:I

    .line 461
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 460
    invoke-virtual {v0, v1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->setEnterFadeDuration(I)V

    .line 463
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableCompat_android_exitFadeDuration:I

    iget v2, v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mExitFadeDuration:I

    .line 464
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 463
    invoke-virtual {v0, v1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->setExitFadeDuration(I)V

    .line 466
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableCompat_android_dither:I

    iget-boolean v0, v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mDither:Z

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->setDither(Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic addState([ILandroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 89
    invoke-super {p0, p1, p2}, Landroid/support/v7/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public addState([ILandroid/graphics/drawable/Drawable;I)V
    .locals 1

    if-eqz p2, :cond_0

    .line 236
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->addStateSet([ILandroid/graphics/drawable/Drawable;I)I

    .line 237
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->onStateChange([I)Z

    return-void

    .line 234
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Drawable must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addTransition(IILandroid/graphics/drawable/Drawable;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/graphics/drawable/Drawable;",
            ":",
            "Landroid/graphics/drawable/Animatable;",
            ">(IITT;Z)V"
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 253
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->addTransition(IILandroid/graphics/drawable/Drawable;Z)I

    return-void

    .line 251
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Transition drawable must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->applyTheme(Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public bridge synthetic canApplyTheme()Z
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->canApplyTheme()Z

    move-result v0

    return v0
.end method

.method clearMutated()V
    .locals 1

    .line 618
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->clearMutated()V

    const/4 v0, 0x0

    .line 619
    iput-boolean v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mMutated:Z

    return-void
.end method

.method cloneConstantState()Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;
    .locals 3

    .line 613
    new-instance v0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    iget-object v1, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;-><init>(Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method bridge synthetic cloneConstantState()Landroid/support/v7/graphics/drawable/DrawableContainer$DrawableContainerState;
    .locals 1

    .line 89
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->cloneConstantState()Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic cloneConstantState()Landroid/support/v7/graphics/drawable/StateListDrawable$StateListState;
    .locals 1

    .line 89
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->cloneConstantState()Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic draw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public bridge synthetic getAlpha()I
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getAlpha()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getChangingConfigurations()I
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getChangingConfigurations()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getCurrent()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getHotspotBounds(Landroid/graphics/Rect;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getHotspotBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public bridge synthetic getIntrinsicHeight()I
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getIntrinsicWidth()I
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getMinimumHeight()I
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getMinimumHeight()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getMinimumWidth()I
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getMinimumWidth()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getOpacity()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getOutline(Landroid/graphics/Outline;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getOutline(Landroid/graphics/Outline;)V

    return-void
.end method

.method public bridge synthetic getPadding(Landroid/graphics/Rect;)Z
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public inflate(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 200
    sget-object v0, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableCompat:[I

    invoke-static {p2, p5, p4, v0}, Landroid/support/v4/content/res/TypedArrayUtils;->obtainAttributes(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 202
    sget v1, Landroid/support/v7/appcompat/R$styleable;->AnimatedStateListDrawableCompat_android_visible:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->setVisible(ZZ)Z

    .line 204
    invoke-direct {p0, v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->updateStateFromTypedArray(Landroid/content/res/TypedArray;)V

    .line 205
    invoke-virtual {p0, p2}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->updateDensity(Landroid/content/res/Resources;)V

    .line 206
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 207
    invoke-direct/range {p0 .. p5}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->inflateChildElements(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 208
    invoke-direct {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->init()V

    return-void
.end method

.method public bridge synthetic invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic isAutoMirrored()Z
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->isAutoMirrored()Z

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public jumpToCurrentState()V
    .locals 1

    .line 263
    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->jumpToCurrentState()V

    .line 264
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransition:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;

    if-eqz v0, :cond_0

    .line 265
    invoke-virtual {v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;->stop()V

    const/4 v0, 0x0

    .line 266
    iput-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransition:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;

    .line 267
    iget v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    invoke-virtual {p0, v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->selectDrawable(I)Z

    const/4 v0, -0x1

    .line 268
    iput v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionToIndex:I

    .line 269
    iput v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransitionFromIndex:I

    :cond_0
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 604
    iget-boolean v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mMutated:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v7/graphics/drawable/StateListDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 605
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    invoke-virtual {v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->mutate()V

    const/4 v0, 0x1

    .line 606
    iput-boolean v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mMutated:Z

    :cond_0
    return-object p0
.end method

.method public bridge synthetic onLayoutDirectionChanged(I)Z
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->onLayoutDirectionChanged(I)Z

    move-result p1

    return p1
.end method

.method protected onStateChange([I)Z
    .locals 2

    .line 277
    iget-object v0, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    invoke-virtual {v0, p1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;->indexOfKeyframe([I)I

    move-result v0

    .line 278
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->getCurrentIndex()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 279
    invoke-direct {p0, v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->selectTransition(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->selectDrawable(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 283
    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 285
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    return v0
.end method

.method public bridge synthetic scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 89
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/graphics/drawable/StateListDrawable;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setAlpha(I)V

    return-void
.end method

.method public bridge synthetic setAutoMirrored(Z)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setAutoMirrored(Z)V

    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method protected setConstantState(Landroid/support/v7/graphics/drawable/DrawableContainer$DrawableContainerState;)V
    .locals 1

    .line 717
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setConstantState(Landroid/support/v7/graphics/drawable/DrawableContainer$DrawableContainerState;)V

    .line 718
    instance-of v0, p1, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    if-eqz v0, :cond_0

    .line 719
    check-cast p1, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    iput-object p1, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mState:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$AnimatedStateListState;

    :cond_0
    return-void
.end method

.method public bridge synthetic setDither(Z)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setDither(Z)V

    return-void
.end method

.method public bridge synthetic setEnterFadeDuration(I)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setEnterFadeDuration(I)V

    return-void
.end method

.method public bridge synthetic setExitFadeDuration(I)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setExitFadeDuration(I)V

    return-void
.end method

.method public bridge synthetic setHotspot(FF)V
    .locals 0

    .line 89
    invoke-super {p0, p1, p2}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setHotspot(FF)V

    return-void
.end method

.method public bridge synthetic setHotspotBounds(IIII)V
    .locals 0

    .line 89
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setHotspotBounds(IIII)V

    return-void
.end method

.method public bridge synthetic setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public bridge synthetic setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 2

    .line 213
    invoke-super {p0, p1, p2}, Landroid/support/v7/graphics/drawable/StateListDrawable;->setVisible(ZZ)Z

    move-result v0

    .line 214
    iget-object v1, p0, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->mTransition:Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    if-eqz p2, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    .line 216
    invoke-virtual {v1}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat$Transition;->start()V

    goto :goto_0

    .line 219
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/graphics/drawable/AnimatedStateListDrawableCompat;->jumpToCurrentState()V

    :cond_2
    :goto_0
    return v0
.end method

.method public bridge synthetic unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 89
    invoke-super {p0, p1, p2}, Landroid/support/v7/graphics/drawable/StateListDrawable;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    return-void
.end method
