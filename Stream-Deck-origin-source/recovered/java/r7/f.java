package r7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC2877a f32554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t7.c f32559p;

    public f(c json) {
        kotlin.jvm.internal.t.g(json, "json");
        this.f32544a = json.e().h();
        this.f32545b = json.e().i();
        this.f32546c = json.e().j();
        this.f32547d = json.e().p();
        this.f32548e = json.e().b();
        this.f32549f = json.e().l();
        this.f32550g = json.e().m();
        this.f32551h = json.e().f();
        this.f32552i = json.e().o();
        this.f32553j = json.e().d();
        this.f32554k = json.e().e();
        this.f32555l = json.e().a();
        this.f32556m = json.e().n();
        json.e().k();
        this.f32557n = json.e().g();
        this.f32558o = json.e().c();
        this.f32559p = json.a();
    }

    public final h a() {
        if (this.f32552i) {
            if (!kotlin.jvm.internal.t.c(this.f32553j, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f32554k != EnumC2877a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f32549f) {
            if (!kotlin.jvm.internal.t.c(this.f32550g, "    ")) {
                String str = this.f32550g;
                for (int i8 = 0; i8 < str.length(); i8++) {
                    char cCharAt = str.charAt(i8);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f32550g).toString());
                    }
                }
            }
        } else if (!kotlin.jvm.internal.t.c(this.f32550g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new h(this.f32544a, this.f32546c, this.f32547d, this.f32548e, this.f32549f, this.f32545b, this.f32550g, this.f32551h, this.f32552i, this.f32553j, this.f32555l, this.f32556m, null, this.f32557n, this.f32558o, this.f32554k);
    }

    public final t7.c b() {
        return this.f32559p;
    }

    public final void c(boolean z8) {
        this.f32555l = z8;
    }

    public final void d(boolean z8) {
        this.f32548e = z8;
    }

    public final void e(boolean z8) {
        this.f32544a = z8;
    }

    public final void f(boolean z8) {
        this.f32546c = z8;
    }

    public final void g(boolean z8) {
        this.f32547d = z8;
    }

    public final void h(boolean z8) {
        this.f32549f = z8;
    }

    public final void i(boolean z8) {
        this.f32552i = z8;
    }
}
