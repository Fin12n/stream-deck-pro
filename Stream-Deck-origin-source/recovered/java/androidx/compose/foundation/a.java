package androidx.compose.foundation;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p011b1.C1766n;
import p011b1.EnumC1768p;
import p017b7.AbstractC1789i;
import p017b7.J;
import p046f0.AbstractC2285m;
import p056g1.AbstractC2348l;
import p056g1.m0;
import p073i0.m;
import p073i0.p;
import p073i0.q;
import p110m1.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC2348l implements m0, Z0.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f14319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f14321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f14322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Function0 f14323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0354a f14324u;

    /* JADX INFO: renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0354a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p f14326b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f14325a = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14327c = Q0.f.f9082b.c();

        public final long a() {
            return this.f14327c;
        }

        public final Map b() {
            return this.f14325a;
        }

        public final p c() {
            return this.f14326b;
        }

        public final void d(long j8) {
            this.f14327c = j8;
        }

        public final void e(p pVar) {
            this.f14326b = pVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14328a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f14330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, G6.d dVar) {
            super(2, dVar);
            this.f14330c = pVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return a.this.new b(this.f14330c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f14328a;
            if (i8 == 0) {
                r.b(obj);
                m mVar = a.this.f14319p;
                p pVar = this.f14330c;
                this.f14328a = 1;
                if (mVar.b(pVar, this) == objF) {
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
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14331a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f14333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p pVar, G6.d dVar) {
            super(2, dVar);
            this.f14333c = pVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return a.this.new c(this.f14333c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f14331a;
            if (i8 == 0) {
                r.b(obj);
                m mVar = a.this.f14319p;
                q qVar = new q(this.f14333c);
                this.f14331a = 1;
                if (mVar.b(qVar, this) == objF) {
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

    public /* synthetic */ a(m mVar, boolean z8, String str, h hVar, Function0 function0, AbstractC2633k abstractC2633k) {
        this(mVar, z8, str, hVar, function0);
    }

    @Override // L0.i.c
    public void O1() {
        j2();
    }

    @Override // Z0.e
    public boolean W(KeyEvent keyEvent) {
        if (this.f14320q && AbstractC2285m.f(keyEvent)) {
            if (this.f14324u.b().containsKey(Z0.a.m(Z0.d.a(keyEvent)))) {
                return false;
            }
            p pVar = new p(this.f14324u.a(), null);
            this.f14324u.b().put(Z0.a.m(Z0.d.a(keyEvent)), pVar);
            AbstractC1789i.d(D1(), null, null, new b(pVar, null), 3, null);
            return true;
        }
        if (!this.f14320q || !AbstractC2285m.b(keyEvent)) {
            return false;
        }
        p pVar2 = (p) this.f14324u.b().remove(Z0.a.m(Z0.d.a(keyEvent)));
        if (pVar2 != null) {
            AbstractC1789i.d(D1(), null, null, new c(pVar2, null), 3, null);
        }
        this.f14323t.invoke();
        return true;
    }

    @Override // p056g1.m0
    public void f0() {
        k2().f0();
    }

    public final void j2() {
        p pVarC = this.f14324u.c();
        if (pVarC != null) {
            this.f14319p.a(new p073i0.o(pVarC));
        }
        Iterator it = this.f14324u.b().values().iterator();
        while (it.hasNext()) {
            this.f14319p.a(new p073i0.o((p) it.next()));
        }
        this.f14324u.e(null);
        this.f14324u.b().clear();
    }

    public abstract androidx.compose.foundation.b k2();

    public final C0354a l2() {
        return this.f14324u;
    }

    public final void m2(m mVar, boolean z8, String str, h hVar, Function0 function0) {
        if (!t.c(this.f14319p, mVar)) {
            j2();
            this.f14319p = mVar;
        }
        if (this.f14320q != z8) {
            if (!z8) {
                j2();
            }
            this.f14320q = z8;
        }
        this.f14321r = str;
        this.f14322s = hVar;
        this.f14323t = function0;
    }

    @Override // Z0.e
    public boolean y(KeyEvent keyEvent) {
        return false;
    }

    @Override // p056g1.m0
    public void y0(C1766n c1766n, EnumC1768p enumC1768p, long j8) {
        k2().y0(c1766n, enumC1768p, j8);
    }

    public a(m mVar, boolean z8, String str, h hVar, Function0 function0) {
        this.f14319p = mVar;
        this.f14320q = z8;
        this.f14321r = str;
        this.f14322s = hVar;
        this.f14323t = function0;
        this.f14324u = new C0354a();
    }
}
