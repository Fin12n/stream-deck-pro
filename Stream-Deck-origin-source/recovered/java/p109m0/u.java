package p109m0;

import C6.G;
import H0.c;
import I0.d;
import L0.i;
import Q6.o;
import Q6.p;
import io.jentz.winter.js.HRHLwtyqJWz;
import kotlin.jvm.functions.Function0;
import p038e1.I;
import p038e1.h0;
import p038e1.i0;
import p038e1.j0;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f29454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f29455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f29456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q1 f29457d;

        /* JADX INFO: renamed from: m0.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0644a extends kotlin.jvm.internal.u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f29458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f29459b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0644a(o oVar, o oVar2) {
                super(2);
                this.f29458a = oVar;
                this.f29459b = oVar2;
            }

            public final I b(j0 j0Var, long j8) {
                return (I) this.f29459b.invoke(new w(this.f29458a, j0Var), A1.b.b(j8));
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((j0) obj, ((A1.b) obj2).s());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q1 f29460a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q1 q1Var) {
                super(0);
                this.f29460a = q1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q invoke() {
                return (q) ((Function0) this.f29460a.getValue()).invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B b8, i iVar, o oVar, q1 q1Var) {
            super(3);
            this.f29454a = b8;
            this.f29455b = iVar;
            this.f29456c = oVar;
            this.f29457d = q1Var;
        }

        public final void b(d dVar, InterfaceC3163l interfaceC3163l, int i8) {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1488997347, i8, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:81)");
            }
            q1 q1Var = this.f29457d;
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = new o(dVar, new b(q1Var));
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            o oVar = (o) objG;
            interfaceC3163l.f(-492369756);
            Object objG2 = interfaceC3163l.g();
            if (objG2 == aVar.a()) {
                objG2 = new i0(new s(oVar));
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            i0 i0Var = (i0) objG2;
            B b8 = this.f29454a;
            interfaceC3163l.f(-1523807258);
            if (b8 != null) {
                D.a(this.f29454a, oVar, i0Var, interfaceC3163l, (i0.f20495f << 6) | 64);
                G g8 = G.f1419a;
            }
            interfaceC3163l.N();
            i iVar = this.f29455b;
            o oVar2 = this.f29456c;
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(oVar) | interfaceC3163l.R(oVar2);
            Object objG3 = interfaceC3163l.g();
            if (zR || objG3 == aVar.a()) {
                objG3 = new C0644a(oVar, oVar2);
                interfaceC3163l.H(objG3);
            }
            interfaceC3163l.N();
            h0.b(i0Var, iVar, (o) objG3, interfaceC3163l, i0.f20495f, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((d) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f29461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f29462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f29463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f29464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f29465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29466f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, i iVar, B b8, o oVar, int i8, int i9) {
            super(2);
            this.f29461a = function0;
            this.f29462b = iVar;
            this.f29463c = b8;
            this.f29464d = oVar;
            this.f29465e = i8;
            this.f29466f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            u.a(this.f29461a, this.f29462b, this.f29463c, this.f29464d, interfaceC3163l, F0.a(this.f29465e | 1), this.f29466f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(Function0 function0, i iVar, B b8, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(2002163445);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (interfaceC3163lP.l(function0)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i15 = i9 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (interfaceC3163lP.R(iVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i16 = i9 & 4;
        if (i16 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (interfaceC3163lP.R(b8)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (interfaceC3163lP.l(oVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i10 & 5851) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i15 != 0) {
                iVar = i.f4836a;
            }
            if (i16 != 0) {
                b8 = null;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2002163445, i10, -1, HRHLwtyqJWz.JaXgfDBN);
            }
            H.a(c.b(interfaceC3163lP, -1488997347, true, new a(b8, iVar, oVar, g1.p(function0, interfaceC3163lP, i10 & 14))), interfaceC3163lP, 6);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        i iVar2 = iVar;
        B b9 = b8;
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(function0, iVar2, b9, oVar, i8, i9));
        }
    }
}
