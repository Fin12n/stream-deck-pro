package p040e3;

import A1.n;
import A1.s;
import C6.G;
import L0.i;
import Q0.l;
import Q0.m;
import Q6.k;
import Q6.o;
import R0.F;
import R0.InterfaceC1586f0;
import T0.f;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p004a3.C1705k;
import p004a3.EnumC1695a;
import p004a3.J;
import p004a3.V;
import p038e1.InterfaceC2235f;
import p038e1.f0;
import p046f0.AbstractC2282j;
import p082j0.AbstractC2601e;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1705k f20605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f20606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f20607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f20608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f20609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f20610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ V f20611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f20612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n f20613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ L0.c f20614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2235f f20615k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f20616l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f20617m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Map f20618n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ EnumC1695a f20619o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f20620p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f20621q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f20622r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f20623s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1705k c1705k, Function0 function0, i iVar, boolean z8, boolean z9, boolean z10, V v8, boolean z11, n nVar, L0.c cVar, InterfaceC2235f interfaceC2235f, boolean z12, boolean z13, Map map, EnumC1695a enumC1695a, boolean z14, int i8, int i9, int i10) {
            super(2);
            this.f20605a = c1705k;
            this.f20606b = function0;
            this.f20607c = iVar;
            this.f20608d = z8;
            this.f20609e = z9;
            this.f20610f = z10;
            this.f20611g = v8;
            this.f20612h = z11;
            this.f20613i = nVar;
            this.f20614j = cVar;
            this.f20615k = interfaceC2235f;
            this.f20616l = z12;
            this.f20617m = z13;
            this.f20618n = map;
            this.f20619o = enumC1695a;
            this.f20620p = z14;
            this.f20621q = i8;
            this.f20622r = i9;
            this.f20623s = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.b(this.f20605a, this.f20606b, this.f20607c, this.f20608d, this.f20609e, this.f20610f, this.f20611g, this.f20612h, this.f20613i, this.f20614j, this.f20615k, this.f20616l, this.f20617m, this.f20618n, this.f20619o, this.f20620p, interfaceC3163l, F0.a(this.f20621q | 1), F0.a(this.f20622r), this.f20623s);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f20624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2235f f20625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L0.c f20626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f20627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J f20628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f20629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f20630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ V f20631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ EnumC1695a f20632i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ C1705k f20633j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Map f20634k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f20635l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f20636m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f20637n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f20638o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f20639p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f20640q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Function0 f20641r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f20642s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Rect rect, InterfaceC2235f interfaceC2235f, L0.c cVar, Matrix matrix, J j8, boolean z8, boolean z9, V v8, EnumC1695a enumC1695a, C1705k c1705k, Map map, n nVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Function0 function0, InterfaceC3164l0 interfaceC3164l0) {
            super(1);
            this.f20624a = rect;
            this.f20625b = interfaceC2235f;
            this.f20626c = cVar;
            this.f20627d = matrix;
            this.f20628e = j8;
            this.f20629f = z8;
            this.f20630g = z9;
            this.f20631h = v8;
            this.f20632i = enumC1695a;
            this.f20633j = c1705k;
            this.f20634k = map;
            this.f20635l = nVar;
            this.f20636m = z10;
            this.f20637n = z11;
            this.f20638o = z12;
            this.f20639p = z13;
            this.f20640q = z14;
            this.f20641r = function0;
            this.f20642s = interfaceC3164l0;
        }

        public final void b(f Canvas) {
            t.g(Canvas, "$this$Canvas");
            Rect rect = this.f20624a;
            InterfaceC2235f interfaceC2235f = this.f20625b;
            L0.c cVar = this.f20626c;
            Matrix matrix = this.f20627d;
            J j8 = this.f20628e;
            boolean z8 = this.f20629f;
            boolean z9 = this.f20630g;
            V v8 = this.f20631h;
            EnumC1695a enumC1695a = this.f20632i;
            C1705k c1705k = this.f20633j;
            Map map = this.f20634k;
            n nVar = this.f20635l;
            boolean z10 = this.f20636m;
            boolean z11 = this.f20637n;
            boolean z12 = this.f20638o;
            boolean z13 = this.f20639p;
            boolean z14 = this.f20640q;
            Function0 function0 = this.f20641r;
            InterfaceC3164l0 interfaceC3164l0 = this.f20642s;
            InterfaceC1586f0 interfaceC1586f0C = Canvas.K0().c();
            long jA = m.a(rect.width(), rect.height());
            long jA2 = s.a(S6.c.d(l.i(Canvas.d())), S6.c.d(l.g(Canvas.d())));
            long jA3 = interfaceC2235f.a(jA, Canvas.d());
            long jA4 = cVar.a(e.j(jA, jA3), jA2, Canvas.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(n.j(jA4), n.k(jA4));
            matrix.preScale(f0.b(jA3), f0.c(jA3));
            j8.z(z8);
            j8.N0(z9);
            j8.K0(v8);
            j8.n0(enumC1695a);
            j8.q0(c1705k);
            j8.t0(map);
            if (nVar != e.c(interfaceC3164l0)) {
                n nVarC = e.c(interfaceC3164l0);
                if (nVarC != null) {
                    nVarC.b(j8);
                }
                if (nVar != null) {
                    nVar.a(j8);
                }
                e.d(interfaceC3164l0, nVar);
            }
            j8.H0(z10);
            j8.m0(z11);
            j8.y0(z12);
            j8.p0(z13);
            j8.o0(z14);
            j8.J0(((Number) function0.invoke()).floatValue());
            j8.setBounds(0, 0, rect.width(), rect.height());
            j8.x(F.d(interfaceC1586f0C), matrix);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((f) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1705k f20643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f20644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f20645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f20646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f20647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f20648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ V f20649g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f20650h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n f20651i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ L0.c f20652j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2235f f20653k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f20654l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f20655m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Map f20656n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ EnumC1695a f20657o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f20658p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f20659q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f20660r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f20661s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1705k c1705k, Function0 function0, i iVar, boolean z8, boolean z9, boolean z10, V v8, boolean z11, n nVar, L0.c cVar, InterfaceC2235f interfaceC2235f, boolean z12, boolean z13, Map map, EnumC1695a enumC1695a, boolean z14, int i8, int i9, int i10) {
            super(2);
            this.f20643a = c1705k;
            this.f20644b = function0;
            this.f20645c = iVar;
            this.f20646d = z8;
            this.f20647e = z9;
            this.f20648f = z10;
            this.f20649g = v8;
            this.f20650h = z11;
            this.f20651i = nVar;
            this.f20652j = cVar;
            this.f20653k = interfaceC2235f;
            this.f20654l = z12;
            this.f20655m = z13;
            this.f20656n = map;
            this.f20657o = enumC1695a;
            this.f20658p = z14;
            this.f20659q = i8;
            this.f20660r = i9;
            this.f20661s = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.b(this.f20643a, this.f20644b, this.f20645c, this.f20646d, this.f20647e, this.f20648f, this.f20649g, this.f20650h, this.f20651i, this.f20652j, this.f20653k, this.f20654l, this.f20655m, this.f20656n, this.f20657o, this.f20658p, interfaceC3163l, F0.a(this.f20659q | 1), F0.a(this.f20660r), this.f20661s);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f20662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar) {
            super(0);
            this.f20662a = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(e.e(this.f20662a));
        }
    }

    /* JADX INFO: renamed from: e3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0478e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1705k f20663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f20664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f20665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f20666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f20667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f20668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f20669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f20670h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f20671i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f20672j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ V f20673k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f20674l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f20675m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ n f20676n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ L0.c f20677o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2235f f20678p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f20679q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f20680r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map f20681s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f20682t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ EnumC1695a f20683u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f20684v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f20685w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f20686x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ int f20687y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0478e(C1705k c1705k, i iVar, boolean z8, boolean z9, j jVar, float f8, int i8, boolean z10, boolean z11, boolean z12, V v8, boolean z13, boolean z14, n nVar, L0.c cVar, InterfaceC2235f interfaceC2235f, boolean z15, boolean z16, Map map, boolean z17, EnumC1695a enumC1695a, int i9, int i10, int i11, int i12) {
            super(2);
            this.f20663a = c1705k;
            this.f20664b = iVar;
            this.f20665c = z8;
            this.f20666d = z9;
            this.f20667e = jVar;
            this.f20668f = f8;
            this.f20669g = i8;
            this.f20670h = z10;
            this.f20671i = z11;
            this.f20672j = z12;
            this.f20673k = v8;
            this.f20674l = z13;
            this.f20675m = z14;
            this.f20676n = nVar;
            this.f20677o = cVar;
            this.f20678p = interfaceC2235f;
            this.f20679q = z15;
            this.f20680r = z16;
            this.f20681s = map;
            this.f20682t = z17;
            this.f20683u = enumC1695a;
            this.f20684v = i9;
            this.f20685w = i10;
            this.f20686x = i11;
            this.f20687y = i12;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.a(this.f20663a, this.f20664b, this.f20665c, this.f20666d, this.f20667e, this.f20668f, this.f20669g, this.f20670h, this.f20671i, this.f20672j, this.f20673k, this.f20674l, this.f20675m, this.f20676n, this.f20677o, this.f20678p, this.f20679q, this.f20680r, this.f20681s, this.f20682t, this.f20683u, interfaceC3163l, F0.a(this.f20684v | 1), F0.a(this.f20685w), F0.a(this.f20686x), this.f20687y);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(C1705k c1705k, i iVar, boolean z8, boolean z9, j jVar, float f8, int i8, boolean z10, boolean z11, boolean z12, V v8, boolean z13, boolean z14, n nVar, L0.c cVar, InterfaceC2235f interfaceC2235f, boolean z15, boolean z16, Map map, boolean z17, EnumC1695a enumC1695a, InterfaceC3163l interfaceC3163l, int i9, int i10, int i11, int i12) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1151869807);
        i iVar2 = (i12 & 2) != 0 ? i.f4836a : iVar;
        boolean z18 = (i12 & 4) != 0 ? true : z8;
        boolean z19 = (i12 & 8) != 0 ? true : z9;
        j jVar2 = (i12 & 16) != 0 ? null : jVar;
        float f9 = (i12 & 32) != 0 ? 1.0f : f8;
        int i13 = (i12 & 64) != 0 ? 1 : i8;
        boolean z20 = (i12 & 128) != 0 ? false : z10;
        boolean z21 = (i12 & 256) != 0 ? false : z11;
        boolean z22 = (i12 & 512) != 0 ? false : z12;
        V v9 = (i12 & 1024) != 0 ? V.AUTOMATIC : v8;
        boolean z23 = (i12 & 2048) != 0 ? false : z13;
        boolean z24 = (i12 & 4096) != 0 ? false : z14;
        n nVar2 = (i12 & 8192) != 0 ? null : nVar;
        L0.c cVarE = (i12 & 16384) != 0 ? L0.c.f4806a.e() : cVar;
        InterfaceC2235f interfaceC2235fC = (i12 & 32768) != 0 ? InterfaceC2235f.f20468a.c() : interfaceC2235f;
        boolean z25 = (i12 & 65536) != 0 ? true : z15;
        boolean z26 = (i12 & 131072) != 0 ? false : z16;
        Map map2 = (i12 & 262144) != 0 ? null : map;
        boolean z27 = (i12 & 524288) != 0 ? false : z17;
        EnumC1695a enumC1695a2 = (i12 & 1048576) != 0 ? EnumC1695a.AUTOMATIC : enumC1695a;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1151869807, i9, i10, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:211)");
        }
        int i14 = i9 >> 3;
        boolean z28 = z18;
        boolean z29 = z19;
        j jVar3 = jVar2;
        int i15 = i13;
        boolean z30 = z23;
        h hVarC = p040e3.a.c(c1705k, z28, z29, z30, jVar3, f9, i15, null, false, false, interfaceC3163lP, (i14 & 896) | (i14 & 112) | 8 | ((i10 << 6) & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016), 896);
        i iVar3 = iVar2;
        boolean z31 = z22;
        interfaceC3163lP.f(185157078);
        boolean zR = interfaceC3163lP.R(hVarC);
        Object objG = interfaceC3163lP.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new d(hVarC);
            interfaceC3163lP.H(objG);
        }
        Function0 function0 = (Function0) objG;
        interfaceC3163lP.N();
        int i16 = i9 >> 12;
        int i17 = i10 << 15;
        int i18 = (i16 & 7168) | ((i9 << 3) & 896) | 134217736 | (i16 & 57344) | (i16 & 458752) | ((i10 << 18) & 3670016) | (29360128 & i17) | (i17 & 1879048192);
        int i19 = i10 >> 15;
        L0.c cVar2 = cVarE;
        V v10 = v9;
        boolean z32 = z20;
        boolean z33 = z21;
        InterfaceC2235f interfaceC2235f2 = interfaceC2235fC;
        boolean z34 = z25;
        boolean z35 = z26;
        Map map3 = map2;
        boolean z36 = z27;
        EnumC1695a enumC1695a3 = enumC1695a2;
        b(c1705k, function0, iVar3, z32, z33, z31, v10, z24, nVar2, cVar2, interfaceC2235f2, z34, z35, map3, enumC1695a3, z36, interfaceC3163lP, i18, (i19 & 896) | (i19 & 14) | 4096 | (i19 & 112) | ((i11 << 12) & 57344) | ((i10 >> 12) & 458752), 0);
        float f10 = f9;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0478e(c1705k, iVar3, z28, z29, jVar3, f10, i15, z32, z33, z31, v10, z30, z24, nVar2, cVar2, interfaceC2235f2, z34, z35, map3, z36, enumC1695a3, i9, i10, i11, i12));
        }
    }

    public static final void b(C1705k c1705k, Function0 progress, i iVar, boolean z8, boolean z9, boolean z10, V v8, boolean z11, n nVar, L0.c cVar, InterfaceC2235f interfaceC2235f, boolean z12, boolean z13, Map map, EnumC1695a enumC1695a, boolean z14, InterfaceC3163l interfaceC3163l, int i8, int i9, int i10) {
        t.g(progress, "progress");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-674272918);
        i iVar2 = (i10 & 4) != 0 ? i.f4836a : iVar;
        boolean z15 = (i10 & 8) != 0 ? false : z8;
        boolean z16 = (i10 & 16) != 0 ? false : z9;
        boolean z17 = (i10 & 32) != 0 ? false : z10;
        V v9 = (i10 & 64) != 0 ? V.AUTOMATIC : v8;
        boolean z18 = (i10 & 128) != 0 ? false : z11;
        n nVar2 = (i10 & 256) != 0 ? null : nVar;
        L0.c cVarE = (i10 & 512) != 0 ? L0.c.f4806a.e() : cVar;
        InterfaceC2235f interfaceC2235fC = (i10 & 1024) != 0 ? InterfaceC2235f.f20468a.c() : interfaceC2235f;
        boolean z19 = (i10 & 2048) != 0 ? true : z12;
        boolean z20 = (i10 & 4096) != 0 ? false : z13;
        Map map2 = (i10 & 8192) != 0 ? null : map;
        EnumC1695a enumC1695a2 = (i10 & 16384) != 0 ? EnumC1695a.AUTOMATIC : enumC1695a;
        boolean z21 = (i10 & 32768) != 0 ? false : z14;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-674272918, i8, i9, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:94)");
        }
        interfaceC3163lP.f(185152052);
        Object objG = interfaceC3163lP.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = new J();
            interfaceC3163lP.H(objG);
        }
        J j8 = (J) objG;
        interfaceC3163lP.N();
        interfaceC3163lP.f(185152099);
        Object objG2 = interfaceC3163lP.g();
        if (objG2 == aVar.a()) {
            objG2 = new Matrix();
            interfaceC3163lP.H(objG2);
        }
        Matrix matrix = (Matrix) objG2;
        interfaceC3163lP.N();
        interfaceC3163lP.f(185152179);
        boolean zR = interfaceC3163lP.R(c1705k);
        Object objG3 = interfaceC3163lP.g();
        if (zR || objG3 == aVar.a()) {
            objG3 = l1.e(null, null, 2, null);
            interfaceC3163lP.H(objG3);
        }
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG3;
        interfaceC3163lP.N();
        interfaceC3163lP.f(185152231);
        if (c1705k == null || c1705k.d() == 0.0f) {
            i iVar3 = iVar2;
            boolean z22 = z17;
            V v10 = v9;
            n nVar3 = nVar2;
            boolean z23 = z15;
            boolean z24 = z16;
            boolean z25 = z19;
            boolean z26 = z20;
            boolean z27 = z21;
            Map map3 = map2;
            InterfaceC2235f interfaceC2235f2 = interfaceC2235fC;
            boolean z28 = z18;
            EnumC1695a enumC1695a3 = enumC1695a2;
            AbstractC2601e.a(iVar3, interfaceC3163lP, (i8 >> 6) & 14);
            interfaceC3163lP.N();
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            P0 p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new a(c1705k, progress, iVar3, z23, z24, z22, v10, z28, nVar3, cVarE, interfaceC2235f2, z25, z26, map3, enumC1695a3, z27, i8, i9, i10));
                return;
            }
            return;
        }
        interfaceC3163lP.N();
        Rect rectB = c1705k.b();
        i iVarA = g.a(iVar2, rectB.width(), rectB.height());
        i iVar4 = iVar2;
        boolean z29 = z17;
        boolean z30 = z21;
        InterfaceC2235f interfaceC2235f3 = interfaceC2235fC;
        V v11 = v9;
        L0.c cVar2 = cVarE;
        EnumC1695a enumC1695a4 = enumC1695a2;
        b bVar = new b(rectB, interfaceC2235f3, cVar2, matrix, j8, z29, z30, v11, enumC1695a4, c1705k, map2, nVar2, z15, z16, z18, z19, z20, progress, interfaceC3164l0);
        boolean z31 = z19;
        boolean z32 = z18;
        n nVar4 = nVar2;
        boolean z33 = z15;
        boolean z34 = z16;
        boolean z35 = z20;
        Map map4 = map2;
        AbstractC2282j.a(iVarA, bVar, interfaceC3163lP, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V2 = interfaceC3163lP.v();
        if (p0V2 != null) {
            p0V2.a(new c(c1705k, progress, iVar4, z33, z34, z29, v11, z32, nVar4, cVar2, interfaceC2235f3, z31, z35, map4, enumC1695a4, z30, i8, i9, i10));
        }
    }

    public static final n c(InterfaceC3164l0 interfaceC3164l0) {
        return (n) interfaceC3164l0.getValue();
    }

    public static final void d(InterfaceC3164l0 interfaceC3164l0, n nVar) {
        interfaceC3164l0.setValue(nVar);
    }

    public static final float e(h hVar) {
        return ((Number) hVar.getValue()).floatValue();
    }

    public static final long j(long j8, long j9) {
        return s.a((int) (l.i(j8) * f0.b(j9)), (int) (l.g(j8) * f0.c(j9)));
    }
}
