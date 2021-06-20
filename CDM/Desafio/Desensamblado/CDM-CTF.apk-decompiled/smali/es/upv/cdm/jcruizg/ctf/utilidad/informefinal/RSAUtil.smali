.class public Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;
.super Ljava/lang/Object;
.source "RSAUtil.java"


# static fields
.field private static publicKey:Ljava/lang/String; = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCDpRO/Z3GlTrfm2xHokA49px+XakY7wuFYyjUpVUqu4STbfKwvL2i9eay0MvI4bXDVJQc+X+FgCOrYPEW6fq8DEFj7ZYAdvgxr2LgtPeRrDjiu2VrEZlBl+xpqwgGNdRyffDQRvlavqM5UpzW5l6ymChE3Np/0N7OKkOa5BPEZiQIDAQAB"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static encrypt(Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/InvalidKeyException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 44
    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->publicKey:Ljava/lang/String;

    invoke-static {p0, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->encrypt(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static encrypt(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljavax/crypto/BadPaddingException;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljava/security/InvalidKeyException;,
            Ljavax/crypto/NoSuchPaddingException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    const-string v0, "RSA/ECB/PKCS1Padding"

    .line 37
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 38
    invoke-static {p1}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/RSAUtil;->getPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 39
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static getPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 2

    .line 22
    :try_start_0
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    const/4 v1, 0x2

    invoke-static {p0, v1}, Landroid/util/Base64;->decode([BI)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    const-string p0, "RSA"

    .line 25
    invoke-static {p0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p0

    .line 26
    invoke-virtual {p0, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 31
    invoke-virtual {p0}, Ljava/security/spec/InvalidKeySpecException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p0

    .line 29
    invoke-virtual {p0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
