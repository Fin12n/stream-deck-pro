package N5;

import X5.C1692v;
import X5.InterfaceC1684m;
import X5.T;
import kotlin.jvm.internal.t;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements T5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1692v f7504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f7505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2692b f7506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p007a6.c f7507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1684m f7508e;

    public h(T5.e data) {
        t.g(data, "data");
        this.f7504a = data.f();
        this.f7505b = data.h();
        this.f7506c = data.a();
        this.f7507d = data.b();
        this.f7508e = data.e();
    }

    @Override // T5.c
    public C1692v L0() {
        return this.f7504a;
    }

    @Override // T5.c
    public p007a6.c T0() {
        return this.f7507d;
    }

    @Override // X5.InterfaceC1689s
    public InterfaceC1684m a() {
        return this.f7508e;
    }

    @Override // T5.c
    public H5.b g1() {
        throw new IllegalStateException("This request has no call");
    }

    @Override // T5.c
    public InterfaceC2692b getAttributes() {
        return this.f7506c;
    }

    @Override // T5.c, p017b7.J
    public G6.g getCoroutineContext() {
        return T5.c.a.a(this);
    }

    @Override // T5.c
    public T o() {
        return this.f7505b;
    }
}
