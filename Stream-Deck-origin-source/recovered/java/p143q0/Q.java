package p143q0;

import A1.t;
import C6.G;
import G6.d;
import L0.i;
import O0.f;
import Q0.h;
import Q6.k;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p046f0.K;
import p055g0.B;
import p055g0.M;
import p055g0.N;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p065h1.X;
import p073i0.m;
import p128o1.E;
import p176u1.W;
import p176u1.Y;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31490a;

        static {
            int[] iArr = new int[B.values().length];
            try {
                iArr[B.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31490a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S f31491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f31492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f31493c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(S s8, m mVar, boolean z8) {
            super(1);
            this.f31491a = s8;
            this.f31492b = mVar;
            this.f31493c = z8;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("textFieldScrollable");
            c2403m0.a().b("scrollerPosition", this.f31491a);
            c2403m0.a().b("interactionSource", this.f31492b);
            c2403m0.a().b("enabled", Boolean.valueOf(this.f31493c));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S f31494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f31495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f31496c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ S f31497a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(S s8) {
                super(1);
                this.f31497a = s8;
            }

            public final Float b(float f8) {
                float fD = this.f31497a.d() + f8;
                if (fD > this.f31497a.c()) {
                    f8 = this.f31497a.c() - this.f31497a.d();
                } else if (fD < 0.0f) {
                    f8 = -this.f31497a.d();
                }
                S s8 = this.f31497a;
                s8.h(s8.d() + f8);
                return Float.valueOf(f8);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ M f31498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final q1 f31499b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final q1 f31500c;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ S f31501a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(S s8) {
                    super(0);
                    this.f31501a = s8;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f31501a.d() > 0.0f);
                }
            }

            /* JADX INFO: renamed from: q0.Q$c$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0682b extends u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ S f31502a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0682b(S s8) {
                    super(0);
                    this.f31502a = s8;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f31502a.d() < this.f31502a.c());
                }
            }

            public b(M m8, S s8) {
                this.f31498a = m8;
                this.f31499b = g1.d(new C0682b(s8));
                this.f31500c = g1.d(new a(s8));
            }

            @Override // p055g0.M
            public boolean a() {
                return ((Boolean) this.f31499b.getValue()).booleanValue();
            }

            @Override // p055g0.M
            public boolean b() {
                return this.f31498a.b();
            }

            @Override // p055g0.M
            public boolean d() {
                return ((Boolean) this.f31500c.getValue()).booleanValue();
            }

            @Override // p055g0.M
            public float e(float f8) {
                return this.f31498a.e(f8);
            }

            @Override // p055g0.M
            public Object f(K k8, o oVar, d dVar) {
                return this.f31498a.f(k8, oVar, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(S s8, boolean z8, m mVar) {
            super(3);
            this.f31494a = s8;
            this.f31495b = z8;
            this.f31496c = mVar;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(805428266);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(805428266, i8, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            boolean z8 = this.f31494a.f() == B.Vertical || !(interfaceC3163l.e(X.i()) == t.Rtl);
            interfaceC3163l.f(753734506);
            boolean zR = interfaceC3163l.R(this.f31494a);
            S s8 = this.f31494a;
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(s8);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            M mB = N.b((k) objG, interfaceC3163l, 0);
            S s9 = this.f31494a;
            interfaceC3163l.f(511388516);
            boolean zR2 = interfaceC3163l.R(mB) | interfaceC3163l.R(s9);
            Object objG2 = interfaceC3163l.g();
            if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
                objG2 = new b(mB, s9);
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            i iVarL = androidx.compose.foundation.gestures.a.l(i.f4836a, (b) objG2, this.f31494a.f(), this.f31495b && this.f31494a.c() != 0.0f, z8, null, this.f31496c, 16, null);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarL;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final h b(A1.d dVar, int i8, W w8, E e8, boolean z8, int i9) {
        h hVarA;
        if (e8 == null || (hVarA = e8.e(w8.a().b(i8))) == null) {
            hVarA = h.f9087e.a();
        }
        h hVar = hVarA;
        int iV0 = dVar.V0(H.c());
        return h.d(hVar, z8 ? (i9 - hVar.i()) - iV0 : hVar.i(), 0.0f, z8 ? i9 - hVar.i() : iV0 + hVar.i(), 0.0f, 10, null);
    }

    public static final i c(i iVar, S s8, p176u1.M m8, Y y8, Function0 function0) {
        i g0Var;
        B bF = s8.f();
        int iE = s8.e(m8.g());
        s8.i(m8.g());
        W wA = f0.a(y8, m8.e());
        int i8 = a.f31490a[bF.ordinal()];
        if (i8 == 1) {
            g0Var = new g0(s8, iE, wA, function0);
        } else {
            if (i8 != 2) {
                throw new C6.m();
            }
            g0Var = new C2816p(s8, iE, wA, function0);
        }
        return f.b(iVar).j(g0Var);
    }

    public static final i d(i iVar, S s8, m mVar, boolean z8) {
        return L0.h.a(iVar, AbstractC2401l0.c() ? new b(s8, mVar, z8) : AbstractC2401l0.a(), new c(s8, z8, mVar));
    }
}
