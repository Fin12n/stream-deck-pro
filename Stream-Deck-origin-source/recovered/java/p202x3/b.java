package p202x3;

import C6.G;
import D6.z;
import L0.i;
import O0.f;
import O0.m;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.C1598l0;
import R0.InterfaceC1621x0;
import R0.J;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.foundation.layout.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.K;
import p037e0.AbstractC2207c;
import p038e1.AbstractC2252x;
import p038e1.H;
import p046f0.D;
import p056g1.InterfaceC2343g;
import p065h1.I0;
import p065h1.X;
import p082j0.AbstractC2601e;
import p082j0.AbstractC2604h;
import p082j0.InterfaceC2605i;
import p082j0.InterfaceC2608l;
import p110m1.h;
import p110m1.n;
import p110m1.x;
import p135p0.g;
import p191w0.AbstractC3085t;
import p191w0.r;
import p215z0.AbstractC3157i;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.InterfaceC3184w;
import p215z0.P0;
import p215z0.R0;
import p215z0.l1;
import p215z0.q1;
import p215z0.v1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ X0.a f37205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f37206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q3.a f37207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f37208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(X0.a aVar, o oVar, Q3.a aVar2, InterfaceC3164l0 interfaceC3164l0) {
            super(1);
            this.f37205a = aVar;
            this.f37206b = oVar;
            this.f37207c = aVar2;
            this.f37208d = interfaceC3164l0;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent ev) {
            t.g(ev, "ev");
            int action = ev.getAction();
            if (action == 0) {
                if (!b.b(this.f37208d)) {
                    this.f37205a.a(X0.b.f11652a.a());
                }
                this.f37206b.invoke(this.f37207c, Boolean.TRUE);
                b.c(this.f37208d, true);
            } else if (action == 1) {
                this.f37206b.invoke(this.f37207c, Boolean.FALSE);
                b.c(this.f37208d, false);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: x3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0825b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q3.a f37209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0825b(Q3.a aVar) {
            super(1);
            this.f37209a = aVar;
        }

        public final void b(x semantics) {
            t.g(semantics, "$this$semantics");
            p110m1.u.S(semantics, h.f29507b.a());
            p110m1.u.X(semantics, I3.c.f3773a.a(this.f37209a.f()));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q3.a f37210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1621x0 f37211b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1621x0 f37212a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ float f37213b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ float f37214c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC1621x0 interfaceC1621x0, float f8, float f9) {
                super(3);
                this.f37212a = interfaceC1621x0;
                this.f37213b = f8;
                this.f37214c = f9;
            }

            public final void b(InterfaceC2608l Card, InterfaceC3163l interfaceC3163l, int i8) {
                t.g(Card, "$this$Card");
                if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-733794962, i8, -1, "com.elgato.streamdeck.keypad.KeyView.<anonymous>.<anonymous> (KeyView.kt:117)");
                }
                if (this.f37212a != null) {
                    interfaceC3163l.f(-1971230024);
                    InterfaceC1621x0 interfaceC1621x0 = this.f37212a;
                    float f8 = this.f37213b;
                    float f9 = this.f37214c;
                    interfaceC3163l.f(733328855);
                    i.a aVar = i.f4836a;
                    H hG = AbstractC2601e.g(L0.c.f4806a.m(), false, interfaceC3163l, 0);
                    interfaceC3163l.f(-1323940314);
                    int iA = AbstractC3157i.a(interfaceC3163l, 0);
                    InterfaceC3184w interfaceC3184wE = interfaceC3163l.E();
                    InterfaceC2343g.a aVar2 = InterfaceC2343g.f23596Q;
                    Function0 function0A = aVar2.a();
                    p pVarB = AbstractC2252x.b(aVar);
                    if (interfaceC3163l.t() == null) {
                        AbstractC3157i.c();
                    }
                    interfaceC3163l.r();
                    if (interfaceC3163l.m()) {
                        interfaceC3163l.w(function0A);
                    } else {
                        interfaceC3163l.G();
                    }
                    InterfaceC3163l interfaceC3163lA = v1.a(interfaceC3163l);
                    v1.b(interfaceC3163lA, hG, aVar2.c());
                    v1.b(interfaceC3163lA, interfaceC3184wE, aVar2.e());
                    o oVarB = aVar2.b();
                    if (interfaceC3163lA.m() || !t.c(interfaceC3163lA.g(), Integer.valueOf(iA))) {
                        interfaceC3163lA.H(Integer.valueOf(iA));
                        interfaceC3163lA.A(Integer.valueOf(iA), oVarB);
                    }
                    pVarB.invoke(R0.a(R0.b(interfaceC3163l)), interfaceC3163l, 0);
                    interfaceC3163l.f(2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f14485a;
                    AbstractC2601e.a(androidx.compose.foundation.c.b(c.d(f8, f9, 1.2f), C1598l0.f9405b.a(), null, 2, null), interfaceC3163l, 0);
                    D.c(interfaceC1621x0, null, c.e(f8, f9, 0.0f, 4, null), null, null, 0.0f, null, 0, interfaceC3163l, 56, 248);
                    interfaceC3163l.N();
                    interfaceC3163l.O();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                    interfaceC3163l.N();
                } else {
                    interfaceC3163l.f(-1971229608);
                    AbstractC2601e.a(androidx.compose.foundation.c.b(c.e(this.f37213b, this.f37214c, 0.0f, 4, null), C1598l0.f9405b.a(), null, 2, null), interfaceC3163l, 0);
                    interfaceC3163l.N();
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((InterfaceC2608l) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q3.a aVar, InterfaceC1621x0 interfaceC1621x0) {
            super(3);
            this.f37210a = aVar;
            this.f37211b = interfaceC1621x0;
        }

        public static final i d(float f8, float f9, float f10) {
            return f.a(e.i(androidx.compose.foundation.layout.f.f(i.f4836a, 0.0f, 1, null), A1.h.m(f8 * f10)), g.c(A1.h.m(f9 * 0.13f)));
        }

        public static /* synthetic */ i e(float f8, float f9, float f10, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                f10 = 1.0f;
            }
            return d(f8, f9, f10);
        }

        public final void c(InterfaceC2605i BoxWithConstraints, InterfaceC3163l interfaceC3163l, int i8) {
            int i9;
            t.g(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (interfaceC3163l.R(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1884345312, i9, -1, "com.elgato.streamdeck.keypad.KeyView.<anonymous> (KeyView.kt:104)");
            }
            float fM = A1.h.m(Math.min(BoxWithConstraints.a(), BoxWithConstraints.d()));
            float fM2 = A1.h.m(0.026f * fM);
            long jC = I3.f.c((p014b4.c) interfaceC3163l.e(p014b4.b.a()));
            i.a aVar = i.f4836a;
            AbstractC3085t.a(e.i(aVar, A1.h.m(0.04f * fM)), g.c(A1.h.m(0.15f * fM)), r.f36360a.b(jC, 0L, 0L, 0L, interfaceC3163l, r.f36361b << 12, 14), null, null, H0.c.b(interfaceC3163l, -733794962, true, new a(this.f37211b, fM2, fM)), interfaceC3163l, 196608, 24);
            if (this.f37210a.i()) {
                J3.o.a(I0.a(androidx.compose.foundation.layout.f.e(aVar, 0.3f), "keypad_key_lock_indicator"), interfaceC3163l, 6, 0);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((InterfaceC2605i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f37215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q3.a f37216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f37217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f37218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f37219e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, Q3.a aVar, o oVar, int i8, int i9) {
            super(2);
            this.f37215a = iVar;
            this.f37216b = aVar;
            this.f37217c = oVar;
            this.f37218d = i8;
            this.f37219e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.a(this.f37215a, this.f37216b, this.f37217c, interfaceC3163l, F0.a(this.f37218d | 1), this.f37219e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, Q3.a key, o onKeyState, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        i iVar2;
        int i10;
        i iVar3;
        t.g(key, "key");
        t.g(onKeyState, "onKeyState");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1520156214);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
            iVar2 = iVar;
        } else if ((i8 & 14) == 0) {
            iVar2 = iVar;
            i10 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i8;
        } else {
            iVar2 = iVar;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(key) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= interfaceC3163lP.l(onKeyState) ? 256 : 128;
        }
        int i12 = i10;
        if ((i12 & 731) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            iVar3 = iVar2;
        } else {
            iVar3 = i11 != 0 ? i.f4836a : iVar2;
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1520156214, i12, -1, "com.elgato.streamdeck.keypad.KeyView (KeyView.kt:61)");
            }
            interfaceC3163lP.f(-811865496);
            Object objG = interfaceC3163lP.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = l1.e(Boolean.FALSE, null, 2, null);
                interfaceC3163lP.H(objG);
            }
            InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
            interfaceC3163lP.N();
            Object objE = key.e();
            Bitmap bitmap = objE instanceof Bitmap ? (Bitmap) objE : null;
            interfaceC3163lP.f(-811865419);
            boolean zR = interfaceC3163lP.R(bitmap);
            Object objG2 = interfaceC3163lP.g();
            if (zR || objG2 == aVar.a()) {
                Object objE2 = key.e();
                Bitmap bitmap2 = objE2 instanceof Bitmap ? (Bitmap) objE2 : null;
                objG2 = bitmap2 != null ? J.c(bitmap2) : null;
                interfaceC3163lP.H(objG2);
            }
            InterfaceC1621x0 interfaceC1621x0 = (InterfaceC1621x0) objG2;
            interfaceC3163lP.N();
            i iVarC = K3.c.c(K.c(m.a(androidx.compose.foundation.layout.a.b(iVar3, 1.0f, false, 2, null), d(AbstractC2207c.d((!b(interfaceC3164l0) || key.i()) ? 1.0f : 0.9f, null, 0.0f, "key press animation", null, interfaceC3163lP, 3072, 22))), null, new a((X0.a) interfaceC3163lP.e(X.g()), onKeyState, key, interfaceC3164l0), 1, null), g(key, interfaceC3163lP, (i12 >> 3) & 14));
            interfaceC3163lP.f(-811864343);
            boolean z8 = (i12 & 112) == 32;
            Object objG3 = interfaceC3163lP.g();
            if (z8 || objG3 == aVar.a()) {
                objG3 = new C0825b(key);
                interfaceC3163lP.H(objG3);
            }
            interfaceC3163lP.N();
            AbstractC2604h.a(n.d(iVarC, false, (k) objG3, 1, null), L0.c.f4806a.l(), false, H0.c.b(interfaceC3163lP, -1884345312, true, new c(key, interfaceC1621x0)), interfaceC3163lP, 3120, 4);
            interfaceC3163lP = interfaceC3163lP;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(iVar3, key, onKeyState, i8, i9));
        }
    }

    public static final boolean b(InterfaceC3164l0 interfaceC3164l0) {
        return ((Boolean) interfaceC3164l0.getValue()).booleanValue();
    }

    public static final void c(InterfaceC3164l0 interfaceC3164l0, boolean z8) {
        interfaceC3164l0.setValue(Boolean.valueOf(z8));
    }

    public static final float d(q1 q1Var) {
        return ((Number) q1Var.getValue()).floatValue();
    }

    public static final String g(Q3.a aVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-370275079);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-370275079, i8, -1, "com.elgato.streamdeck.keypad.<get-a11yLabel> (KeyView.kt:144)");
        }
        interfaceC3163l.f(1518370959);
        String strR0 = z.r0(D6.r.s(aVar.d(), aVar.h(), aVar.g()), ", ", null, null, 0, null, null, 62, null);
        if (strR0.length() == 0) {
            strR0 = p101l1.f.b(p194w3.b.f37014e, interfaceC3163l, 0) + " " + aVar.f();
        }
        interfaceC3163l.N();
        interfaceC3163l.f(1518371039);
        if (aVar.i()) {
            strR0 = strR0 + ", " + p101l1.f.b(p194w3.b.f37011d, interfaceC3163l, 0);
        }
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return strR0;
    }
}
