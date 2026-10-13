package p037e0;

import kotlin.jvm.internal.AbstractC2633k;
import p215z0.InterfaceC3164l0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: renamed from: e0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2215k implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f20269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f20270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2221q f20271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20274f;

    public C2215k(j0 j0Var, Object obj, AbstractC2221q abstractC2221q, long j8, long j9, boolean z8) {
        AbstractC2221q abstractC2221qE;
        this.f20269a = j0Var;
        this.f20270b = l1.e(obj, null, 2, null);
        this.f20271c = (abstractC2221q == null || (abstractC2221qE = r.e(abstractC2221q)) == null) ? AbstractC2216l.i(j0Var, obj) : abstractC2221qE;
        this.f20272d = j8;
        this.f20273e = j9;
        this.f20274f = z8;
    }

    public final boolean A() {
        return this.f20274f;
    }

    public final void B(long j8) {
        this.f20273e = j8;
    }

    public final void C(long j8) {
        this.f20272d = j8;
    }

    public final void D(boolean z8) {
        this.f20274f = z8;
    }

    public void E(Object obj) {
        this.f20270b.setValue(obj);
    }

    public final void F(AbstractC2221q abstractC2221q) {
        this.f20271c = abstractC2221q;
    }

    public final long c() {
        return this.f20273e;
    }

    public final long e() {
        return this.f20272d;
    }

    @Override // p215z0.q1
    public Object getValue() {
        return this.f20270b.getValue();
    }

    public final j0 o() {
        return this.f20269a;
    }

    public final Object q() {
        return this.f20269a.b().invoke(this.f20271c);
    }

    public final AbstractC2221q s() {
        return this.f20271c;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + q() + ", isRunning=" + this.f20274f + ", lastFrameTimeNanos=" + this.f20272d + ", finishedTimeNanos=" + this.f20273e + ')';
    }

    public /* synthetic */ C2215k(j0 j0Var, Object obj, AbstractC2221q abstractC2221q, long j8, long j9, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(j0Var, obj, (i8 & 4) != 0 ? null : abstractC2221q, (i8 & 8) != 0 ? Long.MIN_VALUE : j8, (i8 & 16) != 0 ? Long.MIN_VALUE : j9, (i8 & 32) != 0 ? false : z8);
    }
}
