package p143q0;

import D6.r;
import I0.j;
import I0.l;
import Q0.h;
import Q6.k;
import Q6.o;
import W6.n;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p055g0.B;
import p128o1.G;
import p215z0.AbstractC3185w0;
import p215z0.InterfaceC3158i0;
import p215z0.InterfaceC3164l0;
import p215z0.g1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f31503f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f31504g = I0.a.a(a.f31510a, b.f31511a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3158i0 f31505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3158i0 f31506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f31507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f31509e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31510a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(l lVar, S s8) {
            return r.q(Float.valueOf(s8.d()), Boolean.valueOf(s8.f() == B.Vertical));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31511a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final S invoke(List list) {
            Object obj = list.get(1);
            t.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            B b8 = ((Boolean) obj).booleanValue() ? B.Vertical : B.Horizontal;
            Object obj2 = list.get(0);
            t.e(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new S(b8, ((Float) obj2).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a() {
            return S.f31504g;
        }

        public c() {
        }
    }

    public S(B b8, float f8) {
        this.f31505a = AbstractC3185w0.a(f8);
        this.f31506b = AbstractC3185w0.a(0.0f);
        this.f31507c = h.f9087e.a();
        this.f31508d = G.f30758b.a();
        this.f31509e = g1.i(b8, g1.r());
    }

    public final void b(float f8, float f9, int i8) {
        float f10;
        float fD = d();
        float f11 = i8;
        float f12 = fD + f11;
        if (f9 <= f12 && (f8 >= fD || f9 - f8 <= f11)) {
            f10 = (f8 >= fD || f9 - f8 > f11) ? 0.0f : f8 - fD;
        } else {
            f10 = f9 - f12;
        }
        h(d() + f10);
    }

    public final float c() {
        return this.f31506b.b();
    }

    public final float d() {
        return this.f31505a.b();
    }

    public final int e(long j8) {
        if (G.n(j8) != G.n(this.f31508d)) {
            return G.n(j8);
        }
        return G.i(j8) != G.i(this.f31508d) ? G.i(j8) : G.l(j8);
    }

    public final B f() {
        return (B) this.f31509e.getValue();
    }

    public final void g(float f8) {
        this.f31506b.k(f8);
    }

    public final void h(float f8) {
        this.f31505a.k(f8);
    }

    public final void i(long j8) {
        this.f31508d = j8;
    }

    public final void j(B b8, h hVar, int i8, int i9) {
        float f8 = i9 - i8;
        g(f8);
        if (hVar.i() != this.f31507c.i() || hVar.l() != this.f31507c.l()) {
            boolean z8 = b8 == B.Vertical;
            b(z8 ? hVar.l() : hVar.i(), z8 ? hVar.e() : hVar.j(), i8);
            this.f31507c = hVar;
        }
        h(n.j(d(), 0.0f, f8));
    }

    public /* synthetic */ S(B b8, float f8, int i8, AbstractC2633k abstractC2633k) {
        this(b8, (i8 & 2) != 0 ? 0.0f : f8);
    }

    public S() {
        this(B.Vertical, 0.0f, 2, null);
    }
}
