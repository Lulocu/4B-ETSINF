.class Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;
.super Ljava/lang/Object;
.source "Credenciales.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewHolder"
.end annotation


# instance fields
.field private etContrasenya:Landroid/widget/EditText;

.field private etUsuario:Landroid/widget/EditText;

.field private ivResultado:Landroid/widget/ImageView;

.field final synthetic this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;


# direct methods
.method constructor <init>(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;III)V
    .locals 1

    .line 35
    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->this$0:Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etUsuario:Landroid/widget/EditText;

    .line 32
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etContrasenya:Landroid/widget/EditText;

    .line 33
    iput-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->ivResultado:Landroid/widget/ImageView;

    .line 36
    invoke-virtual {p1, p2}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etUsuario:Landroid/widget/EditText;

    .line 37
    invoke-virtual {p1, p3}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etContrasenya:Landroid/widget/EditText;

    .line 38
    invoke-virtual {p1, p4}, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->ivResultado:Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic access$200(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;
    .locals 0

    .line 30
    iget-object p0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etUsuario:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic access$300(Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;)Landroid/widget/EditText;
    .locals 0

    .line 30
    iget-object p0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etContrasenya:Landroid/widget/EditText;

    return-object p0
.end method


# virtual methods
.method public getEtContrasenya()Landroid/widget/EditText;
    .locals 1

    .line 46
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etContrasenya:Landroid/widget/EditText;

    return-object v0
.end method

.method public getEtUsuario()Landroid/widget/EditText;
    .locals 1

    .line 42
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->etUsuario:Landroid/widget/EditText;

    return-object v0
.end method

.method public getIvResultado()Landroid/widget/ImageView;
    .locals 1

    .line 50
    iget-object v0, p0, Les/upv/cdm/jcruizg/ctf/actividades/Credenciales$ViewHolder;->ivResultado:Landroid/widget/ImageView;

    return-object v0
.end method
