package W;

import A.C0888o0;
import A.C0894s;
import A.C0900v;
import A.D0;
import A.F;
import A.G;
import A.I;
import A.InterfaceC0881l;
import A.InterfaceC0896t;
import A.T0;
import A.r;
import D6.C0934n;
import H.AbstractC1003s0;
import H.B;
import H.C0973d;
import H.D;
import H.E;
import H.J;
import I.w;
import K.n;
import android.content.Context;
import androidx.lifecycle.InterfaceC1733p;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10759a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G.b f10760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y4.a f10761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y4.a f10762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f10763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f10764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f10765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f10766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f10767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10768j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements G.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f10769a;

        public a(G g8) {
            this.f10769a = g8;
        }

        @Override // A.G.b
        public final G getCameraXConfig() {
            return this.f10769a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements K.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f10771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f10772c;

        public b(F f8, Context context) {
            this.f10771b = f8;
            this.f10772c = context;
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            g.this.f10764f = this.f10771b;
            g.this.A(I.e.a(this.f10772c));
        }

        @Override // K.c
        public void b(Throwable th) {
            t.g(th, jULK.MsP);
            g.this.B(false);
        }
    }

    public g() {
        Y4.a aVarP = n.p(null);
        t.f(aVarP, "immediateFuture(...)");
        this.f10762d = aVarP;
        h hVarC = h.c();
        t.f(hVarC, "getInstance(...)");
        this.f10763e = hVarC;
        this.f10766h = new HashMap();
        this.f10767i = new HashSet();
        this.f10768j = -1;
    }

    public static final void C(g gVar) {
        gVar.D();
        gVar.f10763e.i(gVar.f10767i);
    }

    public static /* synthetic */ InterfaceC0881l o(g gVar, InterfaceC1733p interfaceC1733p, C0900v c0900v, C0900v c0900v2, I i8, I i9, D0 d8, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c0900v2 = null;
        }
        C0900v c0900v3 = c0900v2;
        if ((i10 & 8) != 0) {
            i8 = I.f78d;
        }
        I i11 = i8;
        if ((i10 & 16) != 0) {
            i9 = I.f78d;
        }
        return gVar.n(interfaceC1733p, c0900v, c0900v3, i11, i9, d8);
    }

    public static final Y4.a v(F f8, Void r8) {
        return f8.l();
    }

    public static final Y4.a w(Q6.k kVar, Object obj) {
        return (Y4.a) kVar.invoke(obj);
    }

    public final void A(Context context) {
        this.f10765g = context;
    }

    public final Y4.a B(boolean z8) {
        Y4.a aVarP;
        w.f(new Runnable() { // from class: W.f
            @Override // java.lang.Runnable
            public final void run() {
                g.C(this.f10758a);
            }
        });
        F f8 = this.f10764f;
        if (f8 != null) {
            t.d(f8);
            aVarP = f8.q();
        } else {
            aVarP = n.p(null);
        }
        t.d(aVarP);
        synchronized (this.f10759a) {
            if (z8) {
                try {
                    this.f10760b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f10761c = null;
            this.f10762d = aVarP;
            this.f10766h.clear();
            this.f10767i.clear();
            C6.G g8 = C6.G.f1419a;
        }
        this.f10764f = null;
        this.f10765g = null;
        return aVarP;
    }

    public void D() {
        E2.a.a("CX:unbindAll");
        try {
            w.b();
            x(0);
            this.f10763e.m(this.f10767i);
            C6.G g8 = C6.G.f1419a;
        } finally {
            E2.a.b();
        }
    }

    public InterfaceC0881l m(InterfaceC1733p lifecycleOwner, C0900v cameraSelector, T0... useCases) {
        t.g(lifecycleOwner, "lifecycleOwner");
        t.g(cameraSelector, "cameraSelector");
        t.g(useCases, "useCases");
        E2.a.a("CX:bindToLifecycle");
        try {
            if (s() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            x(1);
            InterfaceC0881l interfaceC0881lO = o(this, lifecycleOwner, cameraSelector, null, null, null, new C0888o0(C0934n.L(useCases), null, null, 6, null), 28, null);
            E2.a.b();
            return interfaceC0881lO;
        } catch (Throwable th) {
            E2.a.b();
            throw th;
        }
    }

    public final InterfaceC0881l n(InterfaceC1733p interfaceC1733p, C0900v c0900v, C0900v c0900v2, I i8, I i9, D0 d8) {
        J j8;
        C0973d c0973d;
        E2.a.a("CX:bindToLifecycle-internal");
        try {
            w.b();
            F f8 = this.f10764f;
            t.d(f8);
            J jG = c0900v.g(f8.h().m());
            t.f(jG, "select(...)");
            jG.q(true);
            InterfaceC0896t interfaceC0896tR = r(c0900v);
            t.e(interfaceC0896tR, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
            C0973d c0973d2 = (C0973d) interfaceC0896tR;
            if (c0900v2 != null) {
                F f9 = this.f10764f;
                t.d(f9);
                J jG2 = c0900v2.g(f9.h().m());
                jG2.q(false);
                InterfaceC0896t interfaceC0896tR2 = r(c0900v2);
                t.e(interfaceC0896tR2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
                j8 = jG2;
                c0973d = (C0973d) interfaceC0896tR2;
            } else {
                j8 = null;
                c0973d = null;
            }
            C0894s c0894sE = C0894s.f306c.e(c0973d2, c0973d);
            c cVarD = this.f10763e.d(interfaceC1733p, c0894sE);
            Collection collectionF = this.f10763e.f();
            for (T0 t8 : d8.k()) {
                for (Object obj : collectionF) {
                    t.f(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.u(t8) && !t.c(cVar.s(), interfaceC1733p)) {
                        O o8 = O.f28784a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{t8}, 1));
                        t.f(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (cVarD == null) {
                h hVar = this.f10763e;
                F f10 = this.f10764f;
                t.d(f10);
                cVarD = hVar.b(interfaceC1733p, f10.i().a(jG, j8, c0973d2, c0973d, i8, i9));
            }
            if (d8.k().isEmpty()) {
                t.d(cVarD);
            } else {
                h hVar2 = this.f10763e;
                t.d(cVarD);
                F f11 = this.f10764f;
                t.d(f11);
                hVar2.a(cVarD, d8, f11.g().f());
                this.f10767i.add(h.a.a(interfaceC1733p, c0894sE));
            }
            E2.a.b();
            return cVarD;
        } catch (Throwable th) {
            E2.a.b();
            throw th;
        }
    }

    public final B q(C0900v c0900v, InterfaceC0896t interfaceC0896t) {
        Iterator it = c0900v.c().iterator();
        t.f(it, "iterator(...)");
        B b8 = null;
        while (it.hasNext()) {
            Object next = it.next();
            t.f(next, "next(...)");
            r rVar = (r) next;
            if (!t.c(rVar.a(), r.f303a)) {
                D dA = AbstractC1003s0.a(rVar.a());
                Context context = this.f10765g;
                t.d(context);
                B bA = dA.a(interfaceC0896t, context);
                if (bA == null) {
                    continue;
                } else {
                    if (b8 != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    b8 = bA;
                }
            }
        }
        return b8 == null ? E.a() : b8;
    }

    public InterfaceC0896t r(C0900v cameraSelector) {
        Object c0973d;
        t.g(cameraSelector, "cameraSelector");
        E2.a.a("CX:getCameraInfo");
        try {
            F f8 = this.f10764f;
            t.d(f8);
            H.I iR = cameraSelector.g(f8.h().m()).r();
            t.f(iR, "getCameraInfoInternal(...)");
            B bQ = q(cameraSelector, iR);
            C0894s.a aVar = C0894s.f306c;
            String strE = iR.e();
            t.f(strE, "getCameraId(...)");
            C0894s c0894sB = aVar.b(strE, null, bQ.Y());
            synchronized (this.f10759a) {
                try {
                    c0973d = this.f10766h.get(c0894sB);
                    if (c0973d == null) {
                        c0973d = new C0973d(iR, bQ);
                        this.f10766h.put(c0894sB, c0973d);
                    }
                    C6.G g8 = C6.G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0973d c0973d2 = (C0973d) c0973d;
            E2.a.b();
            return c0973d2;
        } catch (Throwable th2) {
            E2.a.b();
            throw th2;
        }
    }

    public final int s() {
        F f8 = this.f10764f;
        if (f8 == null) {
            return 0;
        }
        t.d(f8);
        return f8.g().f().c();
    }

    public final G.b t() {
        return this.f10760b;
    }

    public final Y4.a u(Context context, G g8) {
        t.g(context, "context");
        synchronized (this.f10759a) {
            Y4.a aVar = this.f10761c;
            if (aVar != null) {
                t.e(aVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
                return aVar;
            }
            if (g8 != null) {
                p(g8);
            }
            final F f8 = new F(context, this.f10760b);
            z(f8.j());
            K.d dVarB = K.d.b(this.f10762d);
            final Q6.k kVar = new Q6.k() { // from class: W.d
                @Override // Q6.k
                public final Object invoke(Object obj) {
                    return g.v(f8, (Void) obj);
                }
            };
            K.d dVarF = dVarB.f(new K.a() { // from class: W.e
                @Override // K.a
                public final Y4.a apply(Object obj) {
                    return g.w(kVar, obj);
                }
            }, J.a.a());
            t.f(dVarF, "transformAsync(...)");
            this.f10761c = dVarF;
            n.j(dVarF, new b(f8, context), J.a.a());
            Y4.a aVarS = n.s(dVarF);
            t.f(aVarS, "nonCancellationPropagating(...)");
            return aVarS;
        }
    }

    public final void x(int i8) {
        F f8 = this.f10764f;
        if (f8 == null) {
            return;
        }
        t.d(f8);
        f8.g().f().h(i8);
    }

    public final void y(G.b bVar) {
        this.f10760b = bVar;
    }

    public void z(int i8) {
        this.f10768j = i8;
    }

    public final void p(G cameraXConfig) {
        t.g(cameraXConfig, "cameraXConfig");
        E2.a.a("CX:configureInstanceInternal");
        try {
            synchronized (this.f10759a) {
                T1.f.g(cameraXConfig);
                T1.f.j(t() == null, WqXA.LbGRVrDkQBE);
                y(new a(cameraXConfig));
                C6.G g8 = C6.G.f1419a;
            }
            E2.a.b();
        } catch (Throwable th) {
            E2.a.b();
            throw th;
        }
    }
}
