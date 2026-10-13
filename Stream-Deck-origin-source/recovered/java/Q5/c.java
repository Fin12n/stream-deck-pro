package Q5;

import G6.g;
import X5.C1692v;
import X5.InterfaceC1684m;
import X5.T;
import kotlin.jvm.internal.t;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements T5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.b f9226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T5.c f9227b;

    public c(H5.b call, T5.c origin) {
        t.g(call, "call");
        t.g(origin, "origin");
        this.f9226a = call;
        this.f9227b = origin;
    }

    @Override // T5.c
    public C1692v L0() {
        return this.f9227b.L0();
    }

    @Override // T5.c
    public p007a6.c T0() {
        return this.f9227b.T0();
    }

    @Override // X5.InterfaceC1689s
    public InterfaceC1684m a() {
        return this.f9227b.a();
    }

    @Override // T5.c
    public H5.b g1() {
        return this.f9226a;
    }

    @Override // T5.c
    public InterfaceC2692b getAttributes() {
        return this.f9227b.getAttributes();
    }

    @Override // T5.c, p017b7.J
    public g getCoroutineContext() {
        return this.f9227b.getCoroutineContext();
    }

    @Override // T5.c
    public T o() {
        return this.f9227b.o();
    }
}
