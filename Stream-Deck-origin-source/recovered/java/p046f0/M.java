package p046f0;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import I6.l;
import Q6.k;
import Q6.o;
import X.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f21312a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p098k7.a f21313b = p098k7.c.b(false, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f21314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1815v0 f21315b;

        public a(K k8, InterfaceC1815v0 interfaceC1815v0) {
            this.f21314a = k8;
            this.f21315b = interfaceC1815v0;
        }

        public final boolean a(a aVar) {
            return this.f21314a.compareTo(aVar.f21314a) >= 0;
        }

        public final void b() {
            this.f21315b.z(new L());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f21318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f21320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ K f21321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ M f21322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f21323h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K k8, M m8, k kVar, d dVar) {
            super(2, dVar);
            this.f21321f = k8;
            this.f21322g = m8;
            this.f21323h = kVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f21321f, this.f21322g, this.f21323h, dVar);
            bVar.f21320e = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, k7.a] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            p098k7.a aVar;
            a aVar2;
            M m8;
            k kVar;
            Throwable th;
            M m9;
            a aVar3;
            p098k7.a aVar4;
            Object objF = H6.c.f();
            ?? r8 = this.f21319d;
            try {
                try {
                    if (r8 == 0) {
                        r.b(obj);
                        J j8 = (J) this.f21320e;
                        K k8 = this.f21321f;
                        g.b bVarA = j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                        t.d(bVarA);
                        a aVar5 = new a(k8, (InterfaceC1815v0) bVarA);
                        this.f21322g.h(aVar5);
                        aVar = this.f21322g.f21313b;
                        k kVar2 = this.f21323h;
                        M m10 = this.f21322g;
                        this.f21320e = aVar5;
                        this.f21316a = aVar;
                        this.f21317b = kVar2;
                        this.f21318c = m10;
                        this.f21319d = 1;
                        if (aVar.b(null, this) != objF) {
                            aVar2 = aVar5;
                            m8 = m10;
                            kVar = kVar2;
                        }
                        return objF;
                    }
                    if (r8 != 1) {
                        if (r8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m9 = (M) this.f21317b;
                        aVar4 = (p098k7.a) this.f21316a;
                        aVar3 = (a) this.f21320e;
                        try {
                            r.b(obj);
                            i.a(m9.f21312a, aVar3, null);
                            aVar4.e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            i.a(m9.f21312a, aVar3, null);
                            throw th;
                        }
                    }
                    m8 = (M) this.f21318c;
                    kVar = (k) this.f21317b;
                    p098k7.a aVar6 = (p098k7.a) this.f21316a;
                    aVar2 = (a) this.f21320e;
                    r.b(obj);
                    aVar = aVar6;
                    this.f21320e = aVar2;
                    this.f21316a = aVar;
                    this.f21317b = m8;
                    this.f21318c = null;
                    this.f21319d = 2;
                    Object objInvoke = kVar.invoke(this);
                    if (objInvoke != objF) {
                        m9 = m8;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        i.a(m9.f21312a, aVar3, null);
                        aVar4.e(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th3) {
                    th = th3;
                    m9 = m8;
                    aVar3 = aVar2;
                    i.a(m9.f21312a, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r8.e(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f21326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f21327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f21329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K f21330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ M f21331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ o f21332i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Object f21333j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(K k8, M m8, o oVar, Object obj, d dVar) {
            super(2, dVar);
            this.f21330g = k8;
            this.f21331h = m8;
            this.f21332i = oVar;
            this.f21333j = obj;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            c cVar = new c(this.f21330g, this.f21331h, this.f21332i, this.f21333j, dVar);
            cVar.f21329f = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, k7.a] */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            p098k7.a aVar;
            o oVar;
            a aVar2;
            M m8;
            Object obj2;
            Throwable th;
            M m9;
            a aVar3;
            p098k7.a aVar4;
            Object objF = H6.c.f();
            ?? r8 = this.f21328e;
            try {
                try {
                    if (r8 == 0) {
                        r.b(obj);
                        J j8 = (J) this.f21329f;
                        K k8 = this.f21330g;
                        g.b bVarA = j8.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                        t.d(bVarA);
                        a aVar5 = new a(k8, (InterfaceC1815v0) bVarA);
                        this.f21331h.h(aVar5);
                        aVar = this.f21331h.f21313b;
                        oVar = this.f21332i;
                        Object obj3 = this.f21333j;
                        M m10 = this.f21331h;
                        this.f21329f = aVar5;
                        this.f21324a = aVar;
                        this.f21325b = oVar;
                        this.f21326c = obj3;
                        this.f21327d = m10;
                        this.f21328e = 1;
                        if (aVar.b(null, this) != objF) {
                            aVar2 = aVar5;
                            m8 = m10;
                            obj2 = obj3;
                        }
                        return objF;
                    }
                    if (r8 != 1) {
                        if (r8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m9 = (M) this.f21325b;
                        aVar4 = (p098k7.a) this.f21324a;
                        aVar3 = (a) this.f21329f;
                        try {
                            r.b(obj);
                            i.a(m9.f21312a, aVar3, null);
                            aVar4.e(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            i.a(m9.f21312a, aVar3, null);
                            throw th;
                        }
                    }
                    m8 = (M) this.f21327d;
                    obj2 = this.f21326c;
                    oVar = (o) this.f21325b;
                    p098k7.a aVar6 = (p098k7.a) this.f21324a;
                    aVar2 = (a) this.f21329f;
                    r.b(obj);
                    aVar = aVar6;
                    this.f21329f = aVar2;
                    this.f21324a = aVar;
                    this.f21325b = m8;
                    this.f21326c = null;
                    this.f21327d = null;
                    this.f21328e = 2;
                    Object objInvoke = oVar.invoke(obj2, this);
                    if (objInvoke != objF) {
                        m9 = m8;
                        aVar4 = aVar;
                        obj = objInvoke;
                        aVar3 = aVar2;
                        i.a(m9.f21312a, aVar3, null);
                        aVar4.e(null);
                        return obj;
                    }
                    return objF;
                } catch (Throwable th3) {
                    th = th3;
                    m9 = m8;
                    aVar3 = aVar2;
                    i.a(m9.f21312a, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r8.e(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object e(M m8, K k8, k kVar, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            k8 = K.Default;
        }
        return m8.d(k8, kVar, dVar);
    }

    public final Object d(K k8, k kVar, d dVar) {
        return K.f(new b(k8, this, kVar, null), dVar);
    }

    public final Object f(Object obj, K k8, o oVar, d dVar) {
        return K.f(new c(k8, this, oVar, obj, null), dVar);
    }

    public final boolean g() {
        return p098k7.a.C0628a.b(this.f21313b, null, 1, null);
    }

    public final void h(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f21312a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.f21312a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final void i() {
        p098k7.a.C0628a.c(this.f21313b, null, 1, null);
    }
}
