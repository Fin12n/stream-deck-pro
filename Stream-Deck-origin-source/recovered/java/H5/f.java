package H5;

import X5.C1692v;
import X5.InterfaceC1684m;
import X5.T;
import kotlin.jvm.internal.t;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements T5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T5.c f3569b;

    public f(e call, T5.c origin) {
        t.g(call, "call");
        t.g(origin, "origin");
        this.f3568a = call;
        this.f3569b = origin;
    }

    @Override // T5.c
    public C1692v L0() {
        return this.f3569b.L0();
    }

    @Override // T5.c
    public p007a6.c T0() {
        return this.f3569b.T0();
    }

    @Override // X5.InterfaceC1689s
    public InterfaceC1684m a() {
        return this.f3569b.a();
    }

    @Override // T5.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e g1() {
        return this.f3568a;
    }

    @Override // T5.c
    public InterfaceC2692b getAttributes() {
        return this.f3569b.getAttributes();
    }

    @Override // T5.c, p017b7.J
    public G6.g getCoroutineContext() {
        return this.f3569b.getCoroutineContext();
    }

    @Override // T5.c
    public T o() {
        return this.f3569b.o();
    }
}
