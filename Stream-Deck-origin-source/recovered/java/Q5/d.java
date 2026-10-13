package Q5;

import X5.C1693w;
import X5.InterfaceC1684m;
import X5.x;
import io.ktor.utils.io.g;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends U5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.b f9228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.c f9230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G6.g f9231d;

    public d(H5.b call, g content, U5.c origin) {
        t.g(call, "call");
        t.g(content, "content");
        t.g(origin, "origin");
        this.f9228a = call;
        this.f9229b = content;
        this.f9230c = origin;
        this.f9231d = origin.getCoroutineContext();
    }

    @Override // X5.InterfaceC1689s
    public InterfaceC1684m a() {
        return this.f9230c.a();
    }

    @Override // U5.c
    public g b() {
        return this.f9229b;
    }

    @Override // U5.c
    public p141p6.c d() {
        return this.f9230c.d();
    }

    @Override // U5.c
    public p141p6.c f() {
        return this.f9230c.f();
    }

    @Override // U5.c
    public x g() {
        return this.f9230c.g();
    }

    @Override // U5.c
    public H5.b g1() {
        return this.f9228a;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f9231d;
    }

    @Override // U5.c
    public C1693w h() {
        return this.f9230c.h();
    }
}
