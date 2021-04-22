.class interface abstract Les/upv/cdm/jcruizg/holamundo/LoginActivity$ProfileQuery;
.super Ljava/lang/Object;
.source "LoginActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/upv/cdm/jcruizg/holamundo/LoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "ProfileQuery"
.end annotation


# static fields
.field public static final ADDRESS:I = 0x0

.field public static final IS_PRIMARY:I = 0x1

.field public static final PROJECTION:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "data1"

    const-string v1, "is_primary"

    .line 285
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Les/upv/cdm/jcruizg/holamundo/LoginActivity$ProfileQuery;->PROJECTION:[Ljava/lang/String;

    return-void
.end method
