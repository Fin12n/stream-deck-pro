package s7;

/* JADX INFO: renamed from: s7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2907n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2914v f33298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33299b;

    public C2907n(InterfaceC2914v writer) {
        kotlin.jvm.internal.t.g(writer, "writer");
        this.f33298a = writer;
        this.f33299b = true;
    }

    public final boolean a() {
        return this.f33299b;
    }

    public void b() {
        this.f33299b = true;
    }

    public void c() {
        this.f33299b = false;
    }

    public void d() {
        this.f33299b = false;
    }

    public void e(byte b8) {
        this.f33298a.writeLong(b8);
    }

    public final void f(char c8) {
        this.f33298a.a(c8);
    }

    public void g(double d8) {
        this.f33298a.c(String.valueOf(d8));
    }

    public void h(float f8) {
        this.f33298a.c(String.valueOf(f8));
    }

    public void i(int i8) {
        this.f33298a.writeLong(i8);
    }

    public void j(long j8) {
        this.f33298a.writeLong(j8);
    }

    public final void k(String v8) {
        kotlin.jvm.internal.t.g(v8, "v");
        this.f33298a.c(v8);
    }

    public void l(short s8) {
        this.f33298a.writeLong(s8);
    }

    public void m(boolean z8) {
        this.f33298a.c(String.valueOf(z8));
    }

    public void n(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        this.f33298a.b(value);
    }

    public final void o(boolean z8) {
        this.f33299b = z8;
    }

    public void p() {
    }

    public void q() {
    }
}
