.class public Les/upv/cdm/jcruizg/ctf/actividades/Test;
.super Landroid/support/v7/app/AppCompatActivity;
.source "Test.java"


# instance fields
.field tipoCifra:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x3

    .line 18
    iput v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Test;->tipoCifra:I

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 22
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0a0022

    .line 23
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Test;->setContentView(I)V

    .line 25
    sget-object p1, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;->Test:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;

    sget-object v0, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;->IN:Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;

    invoke-static {p1, v0}, Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog;->addTraza(Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$CLASS;Les/upv/cdm/jcruizg/ctf/utilidad/informefinal/WatchDog$EVENT;)V

    const p1, 0x7f080023

    .line 27
    invoke-virtual {p0, p1}, Les/upv/cdm/jcruizg/ctf/actividades/Test;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 28
    new-instance v0, Les/upv/cdm/jcruizg/ctf/actividades/Test$1;

    invoke-direct {v0, p0}, Les/upv/cdm/jcruizg/ctf/actividades/Test$1;-><init>(Les/upv/cdm/jcruizg/ctf/actividades/Test;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
