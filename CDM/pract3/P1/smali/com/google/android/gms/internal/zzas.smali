.class Lcom/google/android/gms/internal/zzas;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaq;


# instance fields
.field private zznC:Lcom/google/android/gms/internal/zzrg;

.field private zznD:[B

.field private final zznE:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/zzas;->zznE:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzas;->reset()V

    return-void
.end method


# virtual methods
.method public reset()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzas;->zznE:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/google/android/gms/internal/zzas;->zznD:[B

    iget-object v0, p0, Lcom/google/android/gms/internal/zzas;->zznD:[B

    invoke-static {v0}, Lcom/google/android/gms/internal/zzrg;->zzA([B)Lcom/google/android/gms/internal/zzrg;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzas;->zznC:Lcom/google/android/gms/internal/zzrg;

    return-void
.end method

.method public zzac()[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzas;->zznC:Lcom/google/android/gms/internal/zzrg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzrg;->zzBG()I

    move-result v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzas;->zznD:[B

    :goto_0
    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzas;->zznD:[B

    array-length v1, v1

    sub-int v0, v1, v0

    new-array v0, v0, [B

    iget-object v1, p0, Lcom/google/android/gms/internal/zzas;->zznD:[B

    array-length v2, v0

    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public zzb(IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzas;->zznC:Lcom/google/android/gms/internal/zzrg;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzrg;->zzb(IJ)V

    return-void
.end method

.method public zzb(ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzas;->zznC:Lcom/google/android/gms/internal/zzrg;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzrg;->zzb(ILjava/lang/String;)V

    return-void
.end method
