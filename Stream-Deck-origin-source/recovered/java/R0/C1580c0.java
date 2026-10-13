package R0;

import p056g1.AbstractC2347k;

/* JADX INFO: renamed from: R0.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1580c0 extends L0.i.c implements p056g1.A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q6.k f9390n;

    /* JADX INFO: renamed from: R0.c0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p038e1.a0 f9391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1580c0 f9392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p038e1.a0 a0Var, C1580c0 c1580c0) {
            super(1);
            this.f9391a = a0Var;
            this.f9392b = c1580c0;
        }

        public final void b(e1.a0.a aVar) {
            e1.a0.a.r(aVar, this.f9391a, 0, 0, 0.0f, this.f9392b.d2(), 4, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((e1.a0.a) obj);
            return C6.G.f1419a;
        }
    }

    public C1580c0(Q6.k kVar) {
        this.f9390n = kVar;
    }

    @Override // L0.i.c
    public boolean I1() {
        return false;
    }

    @Override // p056g1.A
    public p038e1.I c(p038e1.J j8, p038e1.G g8, long j9) {
        p038e1.a0 a0VarJ = g8.J(j9);
        return p038e1.J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new a(a0VarJ, this), 4, null);
    }

    public final Q6.k d2() {
        return this.f9390n;
    }

    public final void e2() {
        p056g1.X xJ2 = AbstractC2347k.h(this, p056g1.Z.a(2)).j2();
        if (xJ2 != null) {
            xJ2.U2(this.f9390n, true);
        }
    }

    public final void f2(Q6.k kVar) {
        this.f9390n = kVar;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f9390n + ')';
    }
}
