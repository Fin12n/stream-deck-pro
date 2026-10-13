package p055g0;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import Q6.p;
import androidx.compose.foundation.gestures.DraggableElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.u;
import p011b1.AbstractC1767o;
import p011b1.InterfaceC1755c;
import p011b1.z;
import p017b7.J;
import p035d7.y;
import p073i0.m;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2336q f23251a = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f23254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f23255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f23256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f23257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f23258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f23259h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f23260i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f23261j;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f23260i = obj;
            this.f23261j |= Integer.MIN_VALUE;
            return t.h(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p020c1.d f23262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I f23263b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p020c1.d dVar, I i8) {
            super(2);
            this.f23262a = dVar;
            this.f23263b = i8;
        }

        public final void b(z zVar, long j8) {
            p020c1.e.c(this.f23262a, zVar);
            zVar.a();
            this.f23263b.f28778a = j8;
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((z) obj, ((Q0.f) obj2).x());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p020c1.d f23264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f23265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f23266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p020c1.d dVar, y yVar, boolean z8) {
            super(1);
            this.f23264a = dVar;
            this.f23265b = yVar;
            this.f23266c = z8;
        }

        public final void b(z zVar) {
            p020c1.e.c(this.f23264a, zVar);
            if (AbstractC1767o.d(zVar)) {
                return;
            }
            long jG = AbstractC1767o.g(zVar);
            zVar.a();
            y yVar = this.f23265b;
            if (this.f23266c) {
                jG = Q0.f.u(jG, -1.0f);
            }
            yVar.m(new AbstractC2334o.b(jG, null));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((z) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23267a;

        public e(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(J j8, long j9, G6.d dVar) {
            return new e(dVar).invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((J) obj, ((Q0.f) obj2).x(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f23267a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23268a;

        public f(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(J j8, float f8, G6.d dVar) {
            return new f(dVar).invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((J) obj, ((Number) obj2).floatValue(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f23268a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f23269a = new g();

        public g() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z zVar) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f23270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z8) {
            super(0);
            this.f23270a = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f23270a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f23273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f23274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ B f23275e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p pVar, B b8, G6.d dVar) {
            super(3, dVar);
            this.f23274d = pVar;
            this.f23275e = b8;
        }

        public final Object g(J j8, long j9, G6.d dVar) {
            i iVar = new i(this.f23274d, this.f23275e, dVar);
            iVar.f23272b = j8;
            iVar.f23273c = j9;
            return iVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((J) obj, ((A1.y) obj2).o(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f23271a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f23272b;
                long j9 = this.f23273c;
                p pVar = this.f23274d;
                Float fC = I6.b.c(t.o(j9, this.f23275e));
                this.f23271a = 1;
                if (pVar.invoke(j8, fC, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f23278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f23279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f23280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f23281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23282g;

        public j(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f23281f = obj;
            this.f23282g |= Integer.MIN_VALUE;
            return t.l(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f23283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(q1 q1Var) {
            super(1);
            this.f23283a = q1Var;
        }

        public final void b(float f8) {
            ((Q6.k) this.f23283a.getValue()).invoke(Float.valueOf(f8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).floatValue());
            return G.f1419a;
        }
    }

    public static final v a(Q6.k kVar) {
        return new C2331l(kVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bd A[LOOP:0: B:43:0x01a0->B:47:0x01bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf A[EDGE_INSN: B:90:0x01cf->B:49:0x01cf BREAK  A[LOOP:0: B:43:0x01a0->B:47:0x01bd], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0253 -> B:76:0x0256). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(p011b1.InterfaceC1755c r20, Q6.k r21, kotlin.jvm.functions.Function0 r22, p020c1.d r23, p055g0.C r24, G6.d r25) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.t.h(b1.c, Q6.k, kotlin.jvm.functions.Function0, c1.d, g0.C, G6.d):java.lang.Object");
    }

    public static final Object i(InterfaceC1755c interfaceC1755c, z zVar, long j8, p020c1.d dVar, y yVar, boolean z8, Q6.k kVar, G6.d dVar2) {
        yVar.m(new AbstractC2334o.c(Q0.f.s(zVar.i(), Q0.g.a(Q0.f.o(j8) * Math.signum(Q0.f.o(zVar.i())), Q0.f.p(j8) * Math.signum(Q0.f.p(zVar.i())))), null));
        yVar.m(new AbstractC2334o.b(z8 ? Q0.f.u(j8, -1.0f) : j8, null));
        return l(interfaceC1755c, kVar, zVar.g(), new d(dVar, yVar, z8), dVar2);
    }

    public static final L0.i j(L0.i iVar, v vVar, B b8, boolean z8, m mVar, boolean z9, p pVar, p pVar2, boolean z10) {
        return iVar.j(new DraggableElement(vVar, g.f23269a, b8, z8, mVar, new h(z9), pVar, new i(pVar2, b8, null), z10));
    }

    public static /* synthetic */ L0.i k(L0.i iVar, v vVar, B b8, boolean z8, m mVar, boolean z9, p pVar, p pVar2, boolean z10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return j(iVar, vVar, b8, z8, (i8 & 8) != 0 ? null : mVar, (i8 & 16) != 0 ? false : z9, (i8 & 32) != 0 ? new e(null) : pVar, (i8 & 64) != 0 ? new f(null) : pVar2, (i8 & 128) != 0 ? false : z10);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[LOOP:0: B:24:0x0095->B:28:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[EDGE_INSN: B:66:0x00b7->B:30:0x00b7 BREAK  A[LOOP:0: B:24:0x0095->B:28:0x00ad], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:23:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(p011b1.InterfaceC1755c r17, Q6.k r18, long r19, Q6.k r21, G6.d r22) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.t.l(b1.c, Q6.k, long, Q6.k, G6.d):java.lang.Object");
    }

    public static final v m(Q6.k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-183245213);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-183245213, i8, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:141)");
        }
        q1 q1VarP = g1.p(kVar, interfaceC3163l, i8 & 14);
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = a(new k(q1VarP));
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        v vVar = (v) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return vVar;
    }

    public static final float n(long j8, B b8) {
        return b8 == B.Vertical ? Q0.f.p(j8) : Q0.f.o(j8);
    }

    public static final float o(long j8, B b8) {
        return b8 == B.Vertical ? A1.y.i(j8) : A1.y.h(j8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2336q {
        @Override // p055g0.InterfaceC2336q
        public void b(float f8) {
        }
    }
}
