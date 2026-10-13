package p159s0;

import A1.d;
import A1.r;
import A1.s;
import C6.G;
import L0.h;
import L0.i;
import Q0.f;
import Q6.k;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p011b1.C1766n;
import p046f0.J;
import p046f0.V;
import p065h1.X;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f32707a;

        /* JADX INFO: renamed from: s0.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0725a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ I f32708a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f32709b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0725a(I i8, InterfaceC3164l0 interfaceC3164l0) {
                super(0);
                this.f32708a = i8;
                this.f32709b = interfaceC3164l0;
            }

            public final long b() {
                return J.b(this.f32708a, a.e(this.f32709b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return f.d(b());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f32710a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3164l0 f32711b;

            /* JADX INFO: renamed from: s0.K$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0726a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Function0 f32712a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0726a(Function0 function0) {
                    super(1);
                    this.f32712a = function0;
                }

                public final long b(d dVar) {
                    return ((f) this.f32712a.invoke()).x();
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return f.d(b((d) obj));
                }
            }

            /* JADX INFO: renamed from: s0.K$a$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0727b extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d f32713a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3164l0 f32714b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0727b(d dVar, InterfaceC3164l0 interfaceC3164l0) {
                    super(1);
                    this.f32713a = dVar;
                    this.f32714b = interfaceC3164l0;
                }

                public final void b(long j8) {
                    InterfaceC3164l0 interfaceC3164l0 = this.f32714b;
                    d dVar = this.f32713a;
                    a.f(interfaceC3164l0, s.a(dVar.V0(A1.k.h(j8)), dVar.V0(A1.k.g(j8))));
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((A1.k) obj).k());
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, InterfaceC3164l0 interfaceC3164l0) {
                super(1);
                this.f32710a = dVar;
                this.f32711b = interfaceC3164l0;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i invoke(Function0 function0) {
                return J.e(i.f4836a, new C0726a(function0), null, new C0727b(this.f32710a, this.f32711b), 0.0f, true, 0L, 0.0f, 0.0f, false, V.f21341a.a(), 490, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I i8) {
            super(3);
            this.f32707a = i8;
        }

        public static final long e(InterfaceC3164l0 interfaceC3164l0) {
            return ((r) interfaceC3164l0.getValue()).j();
        }

        public static final void f(InterfaceC3164l0 interfaceC3164l0, long j8) {
            interfaceC3164l0.setValue(r.b(j8));
        }

        public final i d(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(1980580247);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1980580247, i8, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)");
            }
            d dVar = (d) interfaceC3163l.e(X.d());
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = l1.e(r.b(r.f455b.a()), null, 2, null);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
            C0725a c0725a = new C0725a(this.f32707a, interfaceC3164l0);
            interfaceC3163l.f(-753410549);
            boolean zR = interfaceC3163l.R(interfaceC3164l0) | interfaceC3163l.R(dVar);
            Object objG2 = interfaceC3163l.g();
            if (zR || objG2 == aVar.a()) {
                objG2 = new b(dVar, interfaceC3164l0);
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            i iVarD = B.d(iVar, c0725a, (k) objG2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarD;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return d((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final boolean a(C1766n c1766n) {
        return false;
    }

    public static final i b(i iVar, I i8) {
        return !J.c(0, 1, null) ? iVar : h.b(iVar, null, new a(i8), 1, null);
    }
}
