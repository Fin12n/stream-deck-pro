package p055g0;

import C6.r;
import G6.d;
import H6.c;
import I6.b;
import I6.l;
import L0.k;
import Q6.o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.J;
import p037e0.AbstractC2216l;
import p037e0.C2212h;
import p037e0.C2215k;
import p037e0.InterfaceC2227x;
import p037e0.d0;

/* JADX INFO: renamed from: g0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2332m implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2227x f23181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f23182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23183c;

    /* JADX INFO: renamed from: g0.m$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f23187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2332m f23188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ I f23189f;

        /* JADX INFO: renamed from: g0.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0538a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ G f23190a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f23191b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G f23192c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C2332m f23193d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0538a(G g8, I i8, G g9, C2332m c2332m) {
                super(1);
                this.f23190a = g8;
                this.f23191b = i8;
                this.f23192c = g9;
                this.f23193d = c2332m;
            }

            public final void b(C2212h c2212h) {
                float fFloatValue = ((Number) c2212h.e()).floatValue() - this.f23190a.f28776a;
                float fA = this.f23191b.a(fFloatValue);
                this.f23190a.f28776a = ((Number) c2212h.e()).floatValue();
                this.f23192c.f28776a = ((Number) c2212h.f()).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    c2212h.a();
                }
                C2332m c2332m = this.f23193d;
                c2332m.e(c2332m.c() + 1);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((C2212h) obj);
                return C6.G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f8, C2332m c2332m, I i8, d dVar) {
            super(2, dVar);
            this.f23187d = f8;
            this.f23188e = c2332m;
            this.f23189f = i8;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f23187d, this.f23188e, this.f23189f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            float f8;
            C2215k c2215k;
            G g8;
            Object objF = c.f();
            int i8 = this.f23186c;
            if (i8 == 0) {
                r.b(obj);
                if (Math.abs(this.f23187d) > 1.0f) {
                    G g9 = new G();
                    g9.f28776a = this.f23187d;
                    G g10 = new G();
                    C2215k c2215kC = AbstractC2216l.c(0.0f, this.f23187d, 0L, 0L, false, 28, null);
                    try {
                        InterfaceC2227x interfaceC2227xB = this.f23188e.b();
                        C0538a c0538a = new C0538a(g10, this.f23189f, g9, this.f23188e);
                        this.f23184a = g9;
                        this.f23185b = c2215kC;
                        this.f23186c = 1;
                        c2215k = c2215kC;
                        try {
                            if (d0.h(c2215k, interfaceC2227xB, false, c0538a, this, 2, null) == objF) {
                                return objF;
                            }
                            g8 = g9;
                            f8 = g8.f28776a;
                        } catch (CancellationException unused) {
                            g8 = g9;
                            g8.f28776a = ((Number) c2215k.q()).floatValue();
                        }
                    } catch (CancellationException unused2) {
                        c2215k = c2215kC;
                    }
                } else {
                    f8 = this.f23187d;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2215k = (C2215k) this.f23185b;
                g8 = (G) this.f23184a;
                try {
                    r.b(obj);
                } catch (CancellationException unused3) {
                    g8.f28776a = ((Number) c2215k.q()).floatValue();
                }
                f8 = g8.f28776a;
            }
            return b.c(f8);
        }
    }

    public C2332m(InterfaceC2227x interfaceC2227x, k kVar) {
        this.f23181a = interfaceC2227x;
        this.f23182b = kVar;
    }

    @Override // p055g0.w
    public Object a(I i8, float f8, d dVar) {
        this.f23183c = 0;
        return AbstractC1785g.g(this.f23182b, new a(f8, this, i8, null), dVar);
    }

    public final InterfaceC2227x b() {
        return this.f23181a;
    }

    public final int c() {
        return this.f23183c;
    }

    public final void d(InterfaceC2227x interfaceC2227x) {
        this.f23181a = interfaceC2227x;
    }

    public final void e(int i8) {
        this.f23183c = i8;
    }

    public /* synthetic */ C2332m(InterfaceC2227x interfaceC2227x, k kVar, int i8, AbstractC2633k abstractC2633k) {
        this(interfaceC2227x, (i8 & 2) != 0 ? androidx.compose.foundation.gestures.a.g() : kVar);
    }
}
