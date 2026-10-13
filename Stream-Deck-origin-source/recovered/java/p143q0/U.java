package p143q0;

import A1.b;
import A1.d;
import A1.r;
import A1.t;
import C6.G;
import L0.h;
import L0.i;
import Q6.k;
import Q6.p;
import W6.n;
import androidx.compose.foundation.layout.f;
import kotlin.jvm.internal.u;
import p038e1.J;
import p038e1.a0;
import p065h1.X;
import p128o1.I;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f31518a;

        /* JADX INFO: renamed from: q0.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0683a extends u implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ T f31519a;

            /* JADX INFO: renamed from: q0.U$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0684a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a0 f31520a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0684a(a0 a0Var) {
                    super(1);
                    this.f31520a = a0Var;
                }

                public final void b(a0.a aVar) {
                    a0.a.j(aVar, this.f31520a, 0, 0, 0.0f, 4, null);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((a0.a) obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0683a(T t8) {
                super(3);
                this.f31519a = t8;
            }

            public final p038e1.I b(J j8, p038e1.G g8, long j9) {
                f.b(i.f4836a, 0.0f, 0.0f, 3, null);
                long jB = this.f31519a.b();
                a0 a0VarJ = g8.J(b.e(j9, n.k(r.g(jB), b.p(j9), b.n(j9)), 0, n.k(r.f(jB), b.o(j9), b.m(j9)), 0, 10, null));
                return J.X0(j8, a0VarJ.y0(), a0VarJ.h0(), null, new C0684a(a0VarJ), 4, null);
            }

            @Override // Q6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((J) obj, (p038e1.G) obj2, ((b) obj3).s());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i8) {
            super(3);
            this.f31518a = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(q1 q1Var) {
            return q1Var.getValue();
        }

        public final i c(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(1582736677);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1582736677, i8, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)");
            }
            d dVar = (d) interfaceC3163l.e(X.d());
            AbstractC3009n.b bVar = (AbstractC3009n.b) interfaceC3163l.e(X.f());
            t tVar = (t) interfaceC3163l.e(X.i());
            I i9 = this.f31518a;
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(i9) | interfaceC3163l.R(tVar);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = p128o1.J.d(i9, tVar);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            I i10 = (I) objG;
            interfaceC3163l.f(511388516);
            boolean zR2 = interfaceC3163l.R(bVar) | interfaceC3163l.R(i10);
            Object objG2 = interfaceC3163l.g();
            if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
                AbstractC3009n abstractC3009nJ = i10.j();
                C cO = i10.o();
                if (cO == null) {
                    cO = C.f33980b.c();
                }
                y yVarM = i10.m();
                int i11 = yVarM != null ? yVarM.i() : y.f34112b.b();
                z zVarN = i10.n();
                objG2 = bVar.b(abstractC3009nJ, cO, i11, zVarN != null ? zVarN.m() : z.f34116b.a());
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            q1 q1Var = (q1) objG2;
            I i12 = this.f31518a;
            interfaceC3163l.f(-492369756);
            Object objG3 = interfaceC3163l.g();
            if (objG3 == InterfaceC3163l.f38803a.a()) {
                objG3 = new T(tVar, dVar, bVar, i12, d(q1Var));
                interfaceC3163l.H(objG3);
            }
            interfaceC3163l.N();
            T t8 = (T) objG3;
            t8.c(tVar, dVar, bVar, i10, d(q1Var));
            i iVarA = androidx.compose.ui.layout.b.a(i.f4836a, new C0683a(t8));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarA;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar, I i8) {
        return h.b(iVar, null, new a(i8), 1, null);
    }
}
