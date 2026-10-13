package androidx.compose.foundation;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p011b1.C1766n;
import p011b1.EnumC1768p;
import p011b1.I;
import p011b1.S;
import p011b1.T;
import p046f0.AbstractC2285m;
import p047f1.h;
import p055g0.D;
import p056g1.AbstractC2348l;
import p056g1.InterfaceC2344h;
import p056g1.m0;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractC2348l implements h, InterfaceC2344h, m0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m f14335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function0 f14336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.compose.foundation.a.C0354a f14337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Function0 f14338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final T f14339u;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((Boolean) b.this.u(androidx.compose.foundation.gestures.a.h())).booleanValue() || AbstractC2285m.c(b.this));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0355b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14342b;

        public C0355b(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            C0355b c0355b = b.this.new C0355b(dVar);
            c0355b.f14342b = obj;
            return c0355b;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((C0355b) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f14341a;
            if (i8 == 0) {
                r.b(obj);
                I i9 = (I) this.f14342b;
                b bVar = b.this;
                this.f14341a = 1;
                if (bVar.m2(i9, this) == objF) {
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

    public /* synthetic */ b(boolean z8, m mVar, Function0 function0, androidx.compose.foundation.a.C0354a c0354a, AbstractC2633k abstractC2633k) {
        this(z8, mVar, function0, c0354a);
    }

    @Override // p056g1.m0
    public void f0() {
        this.f14339u.f0();
    }

    public final boolean i2() {
        return this.f14334p;
    }

    public final androidx.compose.foundation.a.C0354a j2() {
        return this.f14337s;
    }

    public final Function0 k2() {
        return this.f14336r;
    }

    public final Object l2(D d8, long j8, G6.d dVar) {
        Object objF;
        m mVar = this.f14335q;
        return (mVar == null || (objF = d.f(d8, j8, mVar, this.f14337s, this.f14338t, dVar)) != H6.c.f()) ? G.f1419a : objF;
    }

    public abstract Object m2(I i8, G6.d dVar);

    public final void n2(boolean z8) {
        this.f14334p = z8;
    }

    public final void o2(m mVar) {
        this.f14335q = mVar;
    }

    public final void p2(Function0 function0) {
        this.f14336r = function0;
    }

    @Override // p056g1.m0
    public void y0(C1766n c1766n, EnumC1768p enumC1768p, long j8) {
        this.f14339u.y0(c1766n, enumC1768p, j8);
    }

    public b(boolean z8, m mVar, Function0 function0, androidx.compose.foundation.a.C0354a c0354a) {
        this.f14334p = z8;
        this.f14335q = mVar;
        this.f14336r = function0;
        this.f14337s = c0354a;
        this.f14338t = new a();
        this.f14339u = (T) d2(S.a(new C0355b(null)));
    }
}
