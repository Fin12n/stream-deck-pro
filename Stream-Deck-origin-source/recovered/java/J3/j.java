package J3;

import C6.G;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p046f0.AbstractC2282j;
import p191w0.Z;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f4248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f4249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f4250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f4251d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f8, float f9, long j8, long j9) {
            super(1);
            this.f4248a = f8;
            this.f4249b = f9;
            this.f4250c = j8;
            this.f4251d = j9;
        }

        public final void b(T0.f Canvas) {
            t.g(Canvas, "$this$Canvas");
            float f8 = 2;
            T0.f.p1(Canvas, this.f4250c, Q0.g.a(0.0f, Canvas.E0(this.f4248a) / f8), Q0.g.a(Canvas.E0(this.f4249b), Canvas.E0(this.f4248a) / f8), Canvas.E0(this.f4248a), 0, null, 0.0f, null, 0, 496, null);
            T0.f.p1(Canvas, this.f4251d, Q0.g.a(Canvas.E0(this.f4249b), Canvas.E0(this.f4248a) / f8), Q0.g.a(Q0.l.i(Canvas.d()), Canvas.E0(this.f4248a) / f8), Canvas.E0(this.f4248a), 0, null, 0.0f, null, 0, 496, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.f) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f4252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f8, int i8, int i9) {
            super(2);
            this.f4252a = f8;
            this.f4253b = i8;
            this.f4254c = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            j.a(this.f4252a, interfaceC3163l, F0.a(this.f4253b | 1), this.f4254c);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(float f8, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        float fJ;
        int i10;
        int i11;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1323271268);
        if ((i8 & 14) == 0) {
            if ((i9 & 1) == 0) {
                fJ = f8;
                if (interfaceC3163lP.h(fJ)) {
                    i11 = 4;
                }
                i10 = i11 | i8;
            } else {
                fJ = f8;
            }
            i11 = 2;
            i10 = i11 | i8;
        } else {
            fJ = f8;
            i10 = i8;
        }
        if ((i10 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0 && !interfaceC3163lP.F()) {
                interfaceC3163lP.z();
                if ((i9 & 1) != 0) {
                    i10 &= -15;
                }
            } else if ((i9 & 1) != 0) {
                fJ = W3.c.f11463a.j();
                i10 &= -15;
            }
            float f9 = fJ;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1323271268, i10, -1, "com.elgato.streamdeck.ui.components.Divider (Divider.kt:15)");
            }
            long jD = m.d(Z.f35786a.a(interfaceC3163lP, Z.f35787b), interfaceC3163lP, 0);
            long jN = W3.b.f11304a.n();
            float fM = A1.h.m((float) 0.5d);
            L0.i iVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.f.h(L0.i.f4836a, 0.0f, 1, null), fM);
            interfaceC3163lP.f(-1850496397);
            boolean zJ = ((((i10 & 14) ^ 6) > 4 && interfaceC3163lP.h(f9)) || (i10 & 6) == 4) | interfaceC3163lP.j(jD) | interfaceC3163lP.j(jN);
            Object objG = interfaceC3163lP.g();
            if (zJ || objG == InterfaceC3163l.f38803a.a()) {
                a aVar = new a(fM, f9, jD, jN);
                interfaceC3163lP.H(aVar);
                objG = aVar;
            }
            interfaceC3163lP.N();
            AbstractC2282j.a(iVarI, (Q6.k) objG, interfaceC3163lP, 6);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            fJ = f9;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(fJ, i8, i9));
        }
    }
}
