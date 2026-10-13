package H5;

import X5.C1693w;
import X5.InterfaceC1684m;
import X5.x;
import kotlin.jvm.internal.t;
import p017b7.B0;
import p017b7.InterfaceC1818x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends U5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1818x f3571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f3572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1693w f3573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p141p6.c f3574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p141p6.c f3575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1684m f3576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G6.g f3577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.ktor.utils.io.g f3578i;

    public g(e call, byte[] body, U5.c origin) {
        t.g(call, "call");
        t.g(body, "body");
        t.g(origin, "origin");
        this.f3570a = call;
        InterfaceC1818x interfaceC1818xB = B0.b(null, 1, null);
        this.f3571b = interfaceC1818xB;
        this.f3572c = origin.g();
        this.f3573d = origin.h();
        this.f3574e = origin.d();
        this.f3575f = origin.f();
        this.f3576g = origin.a();
        this.f3577h = origin.getCoroutineContext().P1(interfaceC1818xB);
        this.f3578i = io.ktor.utils.io.d.a(body);
    }

    @Override // X5.InterfaceC1689s
    public InterfaceC1684m a() {
        return this.f3576g;
    }

    @Override // U5.c
    public io.ktor.utils.io.g b() {
        return this.f3578i;
    }

    @Override // U5.c
    public p141p6.c d() {
        return this.f3574e;
    }

    @Override // U5.c
    public p141p6.c f() {
        return this.f3575f;
    }

    @Override // U5.c
    public x g() {
        return this.f3572c;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f3577h;
    }

    @Override // U5.c
    public C1693w h() {
        return this.f3573d;
    }

    @Override // U5.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e g1() {
        return this.f3570a;
    }
}
