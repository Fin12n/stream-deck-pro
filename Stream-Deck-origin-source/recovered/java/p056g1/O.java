package p056g1;

import A1.n;
import Q6.k;
import java.util.Map;
import kotlin.jvm.internal.t;
import p038e1.AbstractC2230a;
import p038e1.I;
import p038e1.a0;
import p038e1.b0;
import p038e1.l0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class O extends a0 implements S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0.a f23466h = b0.a(this);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f23469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f23470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ O f23471e;

        public a(int i8, int i9, Map map, k kVar, O o8) {
            this.f23467a = i8;
            this.f23468b = i9;
            this.f23469c = map;
            this.f23470d = kVar;
            this.f23471e = o8;
        }

        @Override // p038e1.I
        public Map c() {
            return this.f23469c;
        }

        @Override // p038e1.I
        public void d() {
            this.f23470d.invoke(this.f23471e.d1());
        }

        @Override // p038e1.I
        public int f() {
            return this.f23468b;
        }

        @Override // p038e1.I
        public int g() {
            return this.f23467a;
        }
    }

    @Override // p038e1.InterfaceC2244o
    public boolean B0() {
        return false;
    }

    public abstract int L0(AbstractC2230a abstractC2230a);

    public abstract O O0();

    @Override // p038e1.K
    public final int Q(AbstractC2230a abstractC2230a) {
        int iL0;
        if (Q0() && (iL0 = L0(abstractC2230a)) != Integer.MIN_VALUE) {
            return iL0 + (abstractC2230a instanceof l0 ? n.j(g0()) : n.k(g0()));
        }
        return Integer.MIN_VALUE;
    }

    public abstract boolean Q0();

    public abstract I T0();

    @Override // p038e1.J
    public I b1(int i8, int i9, Map map, k kVar) {
        if ((i8 & (-16777216)) == 0 && ((-16777216) & i9) == 0) {
            return new a(i8, i9, map, kVar, this);
        }
        throw new IllegalStateException(("Size(" + i8 + " x " + i9 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    public final a0.a d1() {
        return this.f23466h;
    }

    public abstract long f1();

    public final void g1(X x8) {
        AbstractC2337a abstractC2337aC;
        X xJ2 = x8.j2();
        if (!t.c(xJ2 != null ? xJ2.h1() : null, x8.h1())) {
            x8.Z1().c().m();
            return;
        }
        InterfaceC2338b interfaceC2338bU = x8.Z1().u();
        if (interfaceC2338bU == null || (abstractC2337aC = interfaceC2338bU.c()) == null) {
            return;
        }
        abstractC2337aC.m();
    }

    public final boolean k1() {
        return this.f23465g;
    }

    public final boolean n1() {
        return this.f23464f;
    }

    public abstract void o1();

    public final void q1(boolean z8) {
        this.f23465g = z8;
    }

    public final void t1(boolean z8) {
        this.f23464f = z8;
    }
}
