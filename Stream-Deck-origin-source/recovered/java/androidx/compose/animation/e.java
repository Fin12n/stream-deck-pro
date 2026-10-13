package androidx.compose.animation;

import C6.G;
import Q6.k;
import R0.a1;
import androidx.compose.animation.e;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import kotlin.jvm.internal.C2635m;
import p028d0.B;
import p028d0.F;
import p028d0.x;
import p037e0.AbstractC2214j;
import p037e0.C2218n;
import p037e0.E;
import p037e0.a0;
import p037e0.f0;
import p037e0.g0;
import p037e0.j0;
import p037e0.l0;
import p037e0.x0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f14246a = l0.a(a.f14250a, b.f14251a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f14247b = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f14248c = AbstractC2214j.g(0.0f, 400.0f, A1.n.b(x0.c(A1.n.f446b)), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f14249d = AbstractC2214j.g(0.0f, 400.0f, A1.r.b(x0.d(A1.r.f455b)), 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14250a = new a();

        public a() {
            super(1);
        }

        public final C2218n b(long j8) {
            return new C2218n(androidx.compose.ui.graphics.f.f(j8), androidx.compose.ui.graphics.f.g(j8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((androidx.compose.ui.graphics.f) obj).j());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14251a = new b();

        public b() {
            super(1);
        }

        public final long b(C2218n c2218n) {
            return a1.a(c2218n.f(), c2218n.g());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(b((C2218n) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.f f14252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.g f14253b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.f14252a = fVar;
            this.f14253b = gVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(f0.b bVar) {
            E eB;
            E eB2;
            p028d0.l lVar = p028d0.l.PreEnter;
            p028d0.l lVar2 = p028d0.l.Visible;
            if (bVar.b(lVar, lVar2)) {
                p028d0.q qVarC = this.f14252a.b().c();
                return (qVarC == null || (eB2 = qVarC.b()) == null) ? e.f14247b : eB2;
            }
            if (!bVar.b(lVar2, p028d0.l.PostExit)) {
                return e.f14247b;
            }
            p028d0.q qVarC2 = this.f14253b.b().c();
            return (qVarC2 == null || (eB = qVarC2.b()) == null) ? e.f14247b : eB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.f f14254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.g f14255b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14256a;

            static {
                int[] iArr = new int[p028d0.l.values().length];
                try {
                    iArr[p028d0.l.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p028d0.l.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p028d0.l.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14256a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.f14254a = fVar;
            this.f14255b = gVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke(p028d0.l lVar) {
            int i8 = a.f14256a[lVar.ordinal()];
            float fA = 1.0f;
            if (i8 != 1) {
                if (i8 == 2) {
                    p028d0.q qVarC = this.f14254a.b().c();
                    if (qVarC != null) {
                        fA = qVarC.a();
                    }
                } else {
                    if (i8 != 3) {
                        throw new C6.m();
                    }
                    p028d0.q qVarC2 = this.f14255b.b().c();
                    if (qVarC2 != null) {
                        fA = qVarC2.a();
                    }
                }
            }
            return Float.valueOf(fA);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0353e extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f14257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1 f14258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q1 f14259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0353e(q1 q1Var, q1 q1Var2, q1 q1Var3) {
            super(1);
            this.f14257a = q1Var;
            this.f14258b = q1Var2;
            this.f14259c = q1Var3;
        }

        public final void b(androidx.compose.ui.graphics.c cVar) {
            q1 q1Var = this.f14257a;
            cVar.b(q1Var != null ? ((Number) q1Var.getValue()).floatValue() : 1.0f);
            q1 q1Var2 = this.f14258b;
            cVar.p(q1Var2 != null ? ((Number) q1Var2.getValue()).floatValue() : 1.0f);
            q1 q1Var3 = this.f14258b;
            cVar.k(q1Var3 != null ? ((Number) q1Var3.getValue()).floatValue() : 1.0f);
            q1 q1Var4 = this.f14259c;
            cVar.W0(q1Var4 != null ? ((androidx.compose.ui.graphics.f) q1Var4.getValue()).j() : androidx.compose.ui.graphics.f.f14706b.a());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((androidx.compose.ui.graphics.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.f f14260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.g f14261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.f14260a = fVar;
            this.f14261b = gVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(f0.b bVar) {
            E eA;
            E eA2;
            p028d0.l lVar = p028d0.l.PreEnter;
            p028d0.l lVar2 = p028d0.l.Visible;
            if (bVar.b(lVar, lVar2)) {
                x xVarE = this.f14260a.b().e();
                return (xVarE == null || (eA2 = xVarE.a()) == null) ? e.f14247b : eA2;
            }
            if (!bVar.b(lVar2, p028d0.l.PostExit)) {
                return e.f14247b;
            }
            x xVarE2 = this.f14261b.b().e();
            return (xVarE2 == null || (eA = xVarE2.a()) == null) ? e.f14247b : eA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.f f14262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.g f14263b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14264a;

            static {
                int[] iArr = new int[p028d0.l.values().length];
                try {
                    iArr[p028d0.l.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p028d0.l.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p028d0.l.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14264a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.compose.animation.f fVar, androidx.compose.animation.g gVar) {
            super(1);
            this.f14262a = fVar;
            this.f14263b = gVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke(p028d0.l lVar) {
            int i8 = a.f14264a[lVar.ordinal()];
            float fB = 1.0f;
            if (i8 != 1) {
                if (i8 == 2) {
                    x xVarE = this.f14262a.b().e();
                    if (xVarE != null) {
                        fB = xVarE.b();
                    }
                } else {
                    if (i8 != 3) {
                        throw new C6.m();
                    }
                    x xVarE2 = this.f14263b.b().e();
                    if (xVarE2 != null) {
                        fB = xVarE2.b();
                    }
                }
            }
            return Float.valueOf(fB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f14265a = new h();

        public h() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(f0.b bVar) {
            return AbstractC2214j.g(0.0f, 0.0f, null, 7, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.f f14266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.f f14267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.animation.g f14268c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14269a;

            static {
                int[] iArr = new int[p028d0.l.values().length];
                try {
                    iArr[p028d0.l.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p028d0.l.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p028d0.l.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14269a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.compose.ui.graphics.f fVar, androidx.compose.animation.f fVar2, androidx.compose.animation.g gVar) {
            super(1);
            this.f14266a = fVar;
            this.f14267b = fVar2;
            this.f14268c = gVar;
        }

        public final long b(p028d0.l lVar) {
            androidx.compose.ui.graphics.f fVarB;
            int i8 = a.f14269a[lVar.ordinal()];
            if (i8 != 1) {
                fVarB = null;
                if (i8 == 2) {
                    x xVarE = this.f14267b.b().e();
                    if (xVarE != null || (xVarE = this.f14268c.b().e()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(xVarE.c());
                    }
                } else {
                    if (i8 != 3) {
                        throw new C6.m();
                    }
                    x xVarE2 = this.f14268c.b().e();
                    if (xVarE2 != null || (xVarE2 = this.f14267b.b().e()) != null) {
                        fVarB = androidx.compose.ui.graphics.f.b(xVarE2.c());
                    }
                }
            } else {
                fVarB = this.f14266a;
            }
            return fVarB != null ? fVarB.j() : androidx.compose.ui.graphics.f.f14706b.a();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(b((p028d0.l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f14270a = new j();

        public j() {
            super(1);
        }

        public final long b(long j8) {
            return A1.s.a(0, 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.r.b(b(((A1.r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f14271a = new k();

        public k() {
            super(1);
        }

        public final Integer b(int i8) {
            return 0;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Q6.k kVar) {
            super(1);
            this.f14272a = kVar;
        }

        public final long b(long j8) {
            return A1.s.a(A1.r.g(j8), ((Number) this.f14272a.invoke(Integer.valueOf(A1.r.f(j8)))).intValue());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.r.b(b(((A1.r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f14273a = new m();

        public m() {
            super(1);
        }

        public final long b(long j8) {
            return A1.s.a(0, 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.r.b(b(((A1.r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f14274a = new n();

        public n() {
            super(1);
        }

        public final Integer b(int i8) {
            return 0;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14275a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Q6.k kVar) {
            super(1);
            this.f14275a = kVar;
        }

        public final long b(long j8) {
            return A1.s.a(A1.r.g(j8), ((Number) this.f14275a.invoke(Integer.valueOf(A1.r.f(j8)))).intValue());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.r.b(b(((A1.r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f14276a = new p();

        public p() {
            super(1);
        }

        public final Integer b(int i8) {
            return Integer.valueOf((-i8) / 2);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14277a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Q6.k kVar) {
            super(1);
            this.f14277a = kVar;
        }

        public final long b(long j8) {
            return A1.o.a(((Number) this.f14277a.invoke(Integer.valueOf(A1.r.g(j8)))).intValue(), 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.n.b(b(((A1.r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14278a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Q6.k kVar) {
            super(1);
            this.f14278a = kVar;
        }

        public final long b(long j8) {
            return A1.o.a(0, ((Number) this.f14278a.invoke(Integer.valueOf(A1.r.f(j8)))).intValue());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.n.b(b(((A1.r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f14279a = new s();

        public s() {
            super(1);
        }

        public final Integer b(int i8) {
            return Integer.valueOf((-i8) / 2);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14280a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Q6.k kVar) {
            super(1);
            this.f14280a = kVar;
        }

        public final long b(long j8) {
            return A1.o.a(((Number) this.f14280a.invoke(Integer.valueOf(A1.r.g(j8)))).intValue(), 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.n.b(b(((A1.r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class u extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f14281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Q6.k kVar) {
            super(1);
            this.f14281a = kVar;
        }

        public final long b(long j8) {
            return A1.o.a(0, ((Number) this.f14281a.invoke(Integer.valueOf(A1.r.f(j8)))).intValue());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return A1.n.b(b(((A1.r) obj).j()));
        }
    }

    public static final androidx.compose.animation.g A(E e8, Q6.k kVar) {
        return z(e8, new t(kVar));
    }

    public static /* synthetic */ androidx.compose.animation.g B(E e8, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, A1.n.b(x0.c(A1.n.f446b)), 1, null);
        }
        if ((i8 & 2) != 0) {
            kVar = s.f14279a;
        }
        return A(e8, kVar);
    }

    public static final androidx.compose.animation.g C(E e8, Q6.k kVar) {
        return z(e8, new u(kVar));
    }

    public static final L0.c D(L0.c.InterfaceC0174c interfaceC0174c) {
        L0.c.a aVar = L0.c.f4806a;
        if (kotlin.jvm.internal.t.c(interfaceC0174c, aVar.j())) {
            return aVar.k();
        }
        return kotlin.jvm.internal.t.c(interfaceC0174c, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final androidx.compose.animation.f E(f0 f0Var, androidx.compose.animation.f fVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(21614502);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(21614502, i8, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(f0Var);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(fVar, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        if (f0Var.h() == f0Var.n() && f0Var.h() == p028d0.l.Visible) {
            if (f0Var.r()) {
                G(interfaceC3164l0, fVar);
            } else {
                G(interfaceC3164l0, androidx.compose.animation.f.f14282a.a());
            }
        } else if (f0Var.n() == p028d0.l.Visible) {
            G(interfaceC3164l0, F(interfaceC3164l0).c(fVar));
        }
        androidx.compose.animation.f fVarF = F(interfaceC3164l0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return fVarF;
    }

    public static final androidx.compose.animation.f F(InterfaceC3164l0 interfaceC3164l0) {
        return (androidx.compose.animation.f) interfaceC3164l0.getValue();
    }

    public static final void G(InterfaceC3164l0 interfaceC3164l0, androidx.compose.animation.f fVar) {
        interfaceC3164l0.setValue(fVar);
    }

    public static final androidx.compose.animation.g H(f0 f0Var, androidx.compose.animation.g gVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1363864804);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1363864804, i8, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(f0Var);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(gVar, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        if (f0Var.h() == f0Var.n() && f0Var.h() == p028d0.l.Visible) {
            if (f0Var.r()) {
                J(interfaceC3164l0, gVar);
            } else {
                J(interfaceC3164l0, androidx.compose.animation.g.f14284a.a());
            }
        } else if (f0Var.n() != p028d0.l.Visible) {
            J(interfaceC3164l0, I(interfaceC3164l0).c(gVar));
        }
        androidx.compose.animation.g gVarI = I(interfaceC3164l0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return gVarI;
    }

    public static final androidx.compose.animation.g I(InterfaceC3164l0 interfaceC3164l0) {
        return (androidx.compose.animation.g) interfaceC3164l0.getValue();
    }

    public static final void J(InterfaceC3164l0 interfaceC3164l0, androidx.compose.animation.g gVar) {
        interfaceC3164l0.setValue(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public static final Q6.k f(f0.a aVar, f0.a aVar2, f0 f0Var, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, f0.a aVar3) {
        androidx.compose.ui.graphics.f fVarB;
        q1 q1VarA = aVar != null ? aVar.a(new c(fVar, gVar), new d(fVar, gVar)) : null;
        q1 q1VarA2 = aVar2 != null ? aVar2.a(new f(fVar, gVar), new g(fVar, gVar)) : null;
        if (f0Var.h() == p028d0.l.PreEnter) {
            x xVarE = fVar.b().e();
            if (xVarE == null && (xVarE = gVar.b().e()) == null) {
                fVarB = null;
            } else {
                fVarB = androidx.compose.ui.graphics.f.b(xVarE.c());
            }
        } else {
            x xVarE2 = gVar.b().e();
            if (xVarE2 == null && (xVarE2 = fVar.b().e()) == null) {
                fVarB = null;
            } else {
                fVarB = androidx.compose.ui.graphics.f.b(xVarE2.c());
            }
        }
        return new C0353e(q1VarA, q1VarA2, aVar3 != null ? aVar3.a(h.f14265a, new i(fVarB, fVar, gVar)) : null);
    }

    public static final L0.i g(f0 f0Var, androidx.compose.animation.f fVar, androidx.compose.animation.g gVar, String str, InterfaceC3163l interfaceC3163l, int i8) {
        f0.a aVarB;
        f0.a aVarB2;
        p028d0.i iVarA;
        interfaceC3163l.f(914000546);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(914000546, i8, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:855)");
        }
        int i9 = i8 & 14;
        androidx.compose.animation.f fVarE = E(f0Var, fVar, interfaceC3163l, i8 & 126);
        androidx.compose.animation.g gVarH = H(f0Var, gVar, interfaceC3163l, ((i8 >> 3) & 112) | i9);
        boolean z8 = (fVarE.b().f() == null && gVarH.b().f() == null) ? false : true;
        boolean z9 = (fVarE.b().a() == null && gVarH.b().a() == null) ? false : true;
        interfaceC3163l.f(1657242209);
        f0.a aVarB3 = null;
        if (z8) {
            j0 j0VarD = l0.d(A1.n.f446b);
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = str + " slide";
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            aVarB = g0.b(f0Var, j0VarD, (String) objG, interfaceC3163l, i9 | 448, 0);
        } else {
            aVarB = null;
        }
        interfaceC3163l.N();
        interfaceC3163l.f(1657242379);
        if (z9) {
            j0 j0VarE = l0.e(A1.r.f455b);
            interfaceC3163l.f(-492369756);
            Object objG2 = interfaceC3163l.g();
            if (objG2 == InterfaceC3163l.f38803a.a()) {
                objG2 = str + " shrink/expand";
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            aVarB2 = g0.b(f0Var, j0VarE, (String) objG2, interfaceC3163l, i9 | 448, 0);
        } else {
            aVarB2 = null;
        }
        interfaceC3163l.N();
        interfaceC3163l.f(1657242547);
        if (z9) {
            j0 j0VarD2 = l0.d(A1.n.f446b);
            interfaceC3163l.f(-492369756);
            Object objG3 = interfaceC3163l.g();
            if (objG3 == InterfaceC3163l.f38803a.a()) {
                objG3 = str + " InterruptionHandlingOffset";
                interfaceC3163l.H(objG3);
            }
            interfaceC3163l.N();
            aVarB3 = g0.b(f0Var, j0VarD2, (String) objG3, interfaceC3163l, i9 | 448, 0);
        }
        interfaceC3163l.N();
        p028d0.i iVarA2 = fVarE.b().a();
        L0.i iVarJ = androidx.compose.ui.graphics.b.c(L0.i.f4836a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, !(((iVarA2 == null || iVarA2.c()) && ((iVarA = gVarH.b().a()) == null || iVarA.c()) && z9) ? false : true), null, 0L, 0L, 0, 126975, null).j(new EnterExitTransitionElement(f0Var, aVarB2, aVarB3, aVarB, fVarE, gVarH, e(f0Var, fVarE, gVarH, str, interfaceC3163l, i8 & 7182)));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iVarJ;
    }

    public static final androidx.compose.animation.f h(E e8, L0.c cVar, boolean z8, Q6.k kVar) {
        return new p028d0.o(new F(null, null, new p028d0.i(cVar, kVar, e8, z8), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.f i(E e8, L0.c cVar, boolean z8, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, A1.r.b(x0.d(A1.r.f455b)), 1, null);
        }
        if ((i8 & 2) != 0) {
            cVar = L0.c.f4806a.c();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            kVar = j.f14270a;
        }
        return h(e8, cVar, z8, kVar);
    }

    public static final androidx.compose.animation.f j(E e8, L0.c.InterfaceC0174c interfaceC0174c, boolean z8, Q6.k kVar) {
        return h(e8, D(interfaceC0174c), z8, new l(kVar));
    }

    public static /* synthetic */ androidx.compose.animation.f k(E e8, L0.c.InterfaceC0174c interfaceC0174c, boolean z8, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, A1.r.b(x0.d(A1.r.f455b)), 1, null);
        }
        if ((i8 & 2) != 0) {
            interfaceC0174c = L0.c.f4806a.a();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            kVar = k.f14271a;
        }
        return j(e8, interfaceC0174c, z8, kVar);
    }

    public static final androidx.compose.animation.f l(E e8, float f8) {
        return new p028d0.o(new F(new p028d0.q(f8, e8), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.f m(E e8, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        return l(e8, f8);
    }

    public static final androidx.compose.animation.g n(E e8, float f8) {
        return new p028d0.p(new F(new p028d0.q(f8, e8), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.g o(E e8, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        return n(e8, f8);
    }

    public static final androidx.compose.animation.f p(E e8, float f8, long j8) {
        return new p028d0.o(new F(null, null, null, new x(f8, j8, e8, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.f q(E e8, float f8, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            j8 = androidx.compose.ui.graphics.f.f14706b.a();
        }
        return p(e8, f8, j8);
    }

    public static final androidx.compose.animation.g r(E e8, L0.c cVar, boolean z8, Q6.k kVar) {
        return new p028d0.p(new F(null, null, new p028d0.i(cVar, kVar, e8, z8), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.g s(E e8, L0.c cVar, boolean z8, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, A1.r.b(x0.d(A1.r.f455b)), 1, null);
        }
        if ((i8 & 2) != 0) {
            cVar = L0.c.f4806a.c();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            kVar = m.f14273a;
        }
        return r(e8, cVar, z8, kVar);
    }

    public static final androidx.compose.animation.g t(E e8, L0.c.InterfaceC0174c interfaceC0174c, boolean z8, Q6.k kVar) {
        return r(e8, D(interfaceC0174c), z8, new o(kVar));
    }

    public static /* synthetic */ androidx.compose.animation.g u(E e8, L0.c.InterfaceC0174c interfaceC0174c, boolean z8, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, A1.r.b(x0.d(A1.r.f455b)), 1, null);
        }
        if ((i8 & 2) != 0) {
            interfaceC0174c = L0.c.f4806a.a();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            kVar = n.f14274a;
        }
        return t(e8, interfaceC0174c, z8, kVar);
    }

    public static final androidx.compose.animation.f v(E e8, Q6.k kVar) {
        return new p028d0.o(new F(null, new B(kVar, e8), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.f w(E e8, Q6.k kVar) {
        return v(e8, new q(kVar));
    }

    public static /* synthetic */ androidx.compose.animation.f x(E e8, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            e8 = AbstractC2214j.g(0.0f, 400.0f, A1.n.b(x0.c(A1.n.f446b)), 1, null);
        }
        if ((i8 & 2) != 0) {
            kVar = p.f14276a;
        }
        return w(e8, kVar);
    }

    public static final androidx.compose.animation.f y(E e8, Q6.k kVar) {
        return v(e8, new r(kVar));
    }

    public static final androidx.compose.animation.g z(E e8, Q6.k kVar) {
        return new p028d0.p(new F(null, new B(kVar, e8), null, null, false, null, 61, null));
    }

    public static final p028d0.t e(final f0 f0Var, final androidx.compose.animation.f fVar, final androidx.compose.animation.g gVar, String str, InterfaceC3163l interfaceC3163l, int i8) {
        final f0.a aVar;
        final f0.a aVarB;
        InterfaceC3163l interfaceC3163l2 = interfaceC3163l;
        interfaceC3163l2.f(642253525);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(642253525, i8, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        boolean z8 = (fVar.b().c() == null && gVar.b().c() == null) ? false : true;
        boolean z9 = (fVar.b().e() == null && gVar.b().e() == null) ? false : true;
        interfaceC3163l2.f(-1158245383);
        if (z8) {
            j0 j0VarI = l0.i(C2635m.f28814a);
            interfaceC3163l2.f(-492369756);
            Object objG = interfaceC3163l2.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = str + " alpha";
                interfaceC3163l2.H(objG);
            }
            interfaceC3163l2.N();
            f0.a aVarB2 = g0.b(f0Var, j0VarI, (String) objG, interfaceC3163l2, (i8 & 14) | 448, 0);
            interfaceC3163l2 = interfaceC3163l2;
            aVar = aVarB2;
        } else {
            aVar = null;
        }
        interfaceC3163l2.N();
        interfaceC3163l2.f(-1158245186);
        if (z9) {
            j0 j0VarI2 = l0.i(C2635m.f28814a);
            interfaceC3163l2.f(-492369756);
            Object objG2 = interfaceC3163l2.g();
            if (objG2 == InterfaceC3163l.f38803a.a()) {
                objG2 = str + yOZfxp.IyrwkkEEGJtzt;
                interfaceC3163l2.H(objG2);
            }
            interfaceC3163l2.N();
            aVarB = g0.b(f0Var, j0VarI2, (String) objG2, interfaceC3163l2, (i8 & 14) | 448, 0);
        } else {
            aVarB = null;
        }
        interfaceC3163l.N();
        final f0.a aVarB3 = z9 ? g0.b(f0Var, f14246a, "TransformOriginInterruptionHandling", interfaceC3163l, (i8 & 14) | 448, 0) : null;
        p028d0.t tVar = new p028d0.t() { // from class: d0.m
            @Override // p028d0.t
            public final k a() {
                return e.f(aVar, aVarB, f0Var, fVar, gVar, aVarB3);
            }
        };
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return tVar;
    }
}
