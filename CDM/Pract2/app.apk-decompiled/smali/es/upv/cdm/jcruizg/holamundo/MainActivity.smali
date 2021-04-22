.class public Les/upv/cdm/jcruizg/holamundo/MainActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "MainActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 15
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001d

    .line 16
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/MainActivity;->setContentView(I)V

    const-string p1, "MainActivity"

    const-string v0, "[OnCreate]: Ya estoy funcionando !!!"

    .line 18
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    invoke-virtual {p0}, Les/upv/cdm/jcruizg/holamundo/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "\u00a1\u00a1\u00a1 Pulsa el bot\u00f3n para autenticarte !!!"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    const p1, 0x7f080023

    .line 22
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/holamundo/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Les/upv/cdm/jcruizg/holamundo/MainActivity$1;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/holamundo/MainActivity$1;-><init>(Les/upv/cdm/jcruizg/holamundo/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
