package io.sentry;

import io.sentry.protocol.C2539a;
import io.sentry.protocol.C2541c;
import io.sentry.util.AbstractC2571c;
import io.sentry.util.C2569a;
import io.sentry.util.C2574f;
import io.sentry.util.C2575g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2533o1 implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile io.sentry.protocol.u f27241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC2596z2 f27242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2496f0 f27243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f27244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.sentry.protocol.F f27246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public io.sentry.protocol.l f27248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f27249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Queue f27250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f27252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f27253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile J2 f27254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Y2 f27255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2569a f27256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2569a f27257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2569a f27258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2541c f27259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f27260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2505h1 f27261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public io.sentry.protocol.u f27262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Z f27263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Map f27264x;

    /* JADX INFO: renamed from: io.sentry.o1$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(C2505h1 c2505h1);
    }

    /* JADX INFO: renamed from: io.sentry.o1$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a(Y2 y8);
    }

    /* JADX INFO: renamed from: io.sentry.o1$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void a(InterfaceC2496f0 interfaceC2496f0);
    }

    /* JADX INFO: renamed from: io.sentry.o1$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y2 f27265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Y2 f27266b;

        public d(Y2 y8, Y2 y9) {
            this.f27266b = y8;
            this.f27265a = y9;
        }

        public Y2 a() {
            return this.f27266b;
        }

        public Y2 b() {
            return this.f27265a;
        }
    }

    public C2533o1(J2 j8) {
        this.f27244d = new WeakReference(null);
        this.f27249i = new ArrayList();
        this.f27251k = new ConcurrentHashMap();
        this.f27252l = new ConcurrentHashMap();
        this.f27253m = new CopyOnWriteArrayList();
        this.f27256p = new C2569a();
        this.f27257q = new C2569a();
        this.f27258r = new C2569a();
        this.f27259s = new C2541c();
        this.f27260t = new CopyOnWriteArrayList();
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
        this.f27262v = uVar;
        this.f27263w = L0.f();
        this.f27264x = Collections.synchronizedMap(new WeakHashMap());
        this.f27254n = (J2) io.sentry.util.u.c(j8, "SentryOptions is required.");
        this.f27250j = P(this.f27254n.getMaxBreadcrumbs());
        this.f27261u = new C2505h1();
        this.f27241a = uVar;
    }

    public static Queue P(int i8) {
        return i8 > 0 ? n3.t(new C2495f(i8)) : n3.t(new C2565u());
    }

    @Override // io.sentry.V
    public void A(C2557s2 c2557s2) {
        io.sentry.util.v vVar;
        InterfaceC2488d0 interfaceC2488d0;
        if (!this.f27254n.isTracingEnabled() || c2557s2.O() == null || (vVar = (io.sentry.util.v) this.f27264x.get(C2575g.a(c2557s2.O()))) == null) {
            return;
        }
        WeakReference weakReference = (WeakReference) vVar.a();
        if (c2557s2.C().h() == null && weakReference != null && (interfaceC2488d0 = (InterfaceC2488d0) weakReference.get()) != null) {
            c2557s2.C().u(interfaceC2488d0.p());
        }
        String str = (String) vVar.b();
        if (c2557s2.v0() != null || str == null) {
            return;
        }
        c2557s2.G0(str);
    }

    @Override // io.sentry.V
    public C2541c B() {
        return this.f27259s;
    }

    @Override // io.sentry.V
    public C2505h1 C(a aVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27258r.a();
        try {
            aVar.a(this.f27261u);
            C2505h1 c2505h1 = new C2505h1(this.f27261u);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return c2505h1;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.V
    public String D() {
        return this.f27247g;
    }

    @Override // io.sentry.V
    public void E(c cVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27257q.a();
        try {
            cVar.a(this.f27243c);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.V
    public void F(io.sentry.protocol.u uVar) {
        this.f27241a = uVar;
    }

    @Override // io.sentry.V
    public void G(InterfaceC2496f0 interfaceC2496f0) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27257q.a();
        try {
            this.f27243c = interfaceC2496f0;
            for (W w8 : this.f27254n.getScopeObservers()) {
                if (interfaceC2496f0 != null) {
                    w8.o(interfaceC2496f0.getName());
                    w8.m(interfaceC2496f0.p(), this);
                } else {
                    w8.o(null);
                    w8.m(null, this);
                }
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.V
    public List H() {
        return this.f27249i;
    }

    @Override // io.sentry.V
    public io.sentry.protocol.F I() {
        return this.f27246f;
    }

    @Override // io.sentry.V
    public io.sentry.protocol.l J() {
        return this.f27248h;
    }

    @Override // io.sentry.V
    public List K() {
        return C2574f.a(this.f27253m);
    }

    @Override // io.sentry.V
    public String L() {
        InterfaceC2496f0 interfaceC2496f0 = this.f27243c;
        return interfaceC2496f0 != null ? interfaceC2496f0.getName() : this.f27245e;
    }

    @Override // io.sentry.V
    public void M(C2505h1 c2505h1) {
        this.f27261u = c2505h1;
        d3 d3VarG = c2505h1.g();
        Iterator<W> it = this.f27254n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().m(d3VarG, this);
        }
    }

    public void N() {
        this.f27260t.clear();
    }

    public void O() {
        this.f27250j.clear();
        Iterator<W> it = this.f27254n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(this.f27250j);
        }
    }

    public io.sentry.protocol.u Q() {
        return this.f27241a;
    }

    @Override // io.sentry.V
    public void a(String str, String str2) {
        this.f27252l.put(str, str2);
        for (W w8 : this.f27254n.getScopeObservers()) {
            w8.a(str, str2);
            w8.k(this.f27252l);
        }
    }

    @Override // io.sentry.V
    public J2 b() {
        return this.f27254n;
    }

    @Override // io.sentry.V
    public void c(io.sentry.protocol.F f8) {
        this.f27246f = f8;
        Iterator<W> it = this.f27254n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().c(f8);
        }
    }

    @Override // io.sentry.V
    public void clear() {
        this.f27242b = null;
        this.f27246f = null;
        this.f27248h = null;
        this.f27247g = null;
        this.f27249i.clear();
        O();
        this.f27251k.clear();
        this.f27252l.clear();
        this.f27253m.clear();
        n();
        N();
    }

    @Override // io.sentry.V
    public void d(String str, String str2) {
        this.f27251k.put(str, str2);
        for (W w8 : this.f27254n.getScopeObservers()) {
            w8.d(str, str2);
            w8.b(this.f27251k);
        }
    }

    @Override // io.sentry.V
    public void e(C2491e c2491e, H h8) {
        if (c2491e == null) {
            return;
        }
        if (h8 == null) {
            new H();
        }
        this.f27254n.getBeforeBreadcrumb();
        this.f27250j.add(c2491e);
        for (W w8 : this.f27254n.getScopeObservers()) {
            w8.i(c2491e);
            w8.j(this.f27250j);
        }
    }

    @Override // io.sentry.V
    public void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str) {
        io.sentry.util.u.c(th, "throwable is required");
        io.sentry.util.u.c(interfaceC2488d0, "span is required");
        io.sentry.util.u.c(str, "transactionName is required");
        Throwable thA = C2575g.a(th);
        if (this.f27264x.containsKey(thA)) {
            return;
        }
        this.f27264x.put(thA, new io.sentry.util.v(new WeakReference(interfaceC2488d0), str));
    }

    @Override // io.sentry.V
    public void g(io.sentry.protocol.u uVar) {
        this.f27262v = uVar;
        Iterator<W> it = this.f27254n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(uVar);
        }
    }

    @Override // io.sentry.V
    public Map getExtras() {
        return this.f27252l;
    }

    @Override // io.sentry.V
    public Map getTags() {
        return AbstractC2571c.b(this.f27251k);
    }

    @Override // io.sentry.V
    public InterfaceC2496f0 h() {
        return this.f27243c;
    }

    public void i(C2491e c2491e) {
        e(c2491e, null);
    }

    @Override // io.sentry.V
    public Y2 j() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27256p.a();
        try {
            Y2 y8 = null;
            if (this.f27255o != null) {
                this.f27255o.c();
                Y2 y2Clone = this.f27255o.clone();
                this.f27255o = null;
                y8 = y2Clone;
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return y8;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.V
    public d k() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27256p.a();
        try {
            if (this.f27255o != null) {
                this.f27255o.c();
            }
            Y2 y8 = this.f27255o;
            d dVar = null;
            if (this.f27254n.getRelease() != null) {
                this.f27255o = new Y2(this.f27254n.getDistinctId(), this.f27246f, this.f27254n.getEnvironment(), this.f27254n.getRelease());
                dVar = new d(this.f27255o.clone(), y8 != null ? y8.clone() : null);
            } else {
                this.f27254n.getLogger().c(EnumC2596z2.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return dVar;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.V
    public void l(EnumC2596z2 enumC2596z2) {
        this.f27242b = enumC2596z2;
        Iterator<W> it = this.f27254n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().l(enumC2596z2);
        }
    }

    @Override // io.sentry.V
    public void m(J2 j8) {
        this.f27254n = j8;
        Queue queue = this.f27250j;
        this.f27250j = P(j8.getMaxBreadcrumbs());
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            i((C2491e) it.next());
        }
    }

    @Override // io.sentry.V
    public void n() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27257q.a();
        try {
            this.f27243c = null;
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            this.f27245e = null;
            for (W w8 : this.f27254n.getScopeObservers()) {
                w8.o(null);
                w8.m(null, this);
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.V
    public void o(Z z8) {
        this.f27263w = z8;
    }

    @Override // io.sentry.V
    public InterfaceC2488d0 p() {
        InterfaceC2488d0 interfaceC2488d0K;
        InterfaceC2488d0 interfaceC2488d0 = (InterfaceC2488d0) this.f27244d.get();
        if (interfaceC2488d0 != null) {
            return interfaceC2488d0;
        }
        InterfaceC2496f0 interfaceC2496f0 = this.f27243c;
        return (interfaceC2496f0 == null || (interfaceC2488d0K = interfaceC2496f0.k()) == null) ? interfaceC2496f0 : interfaceC2488d0K;
    }

    @Override // io.sentry.V
    public Y2 q() {
        return this.f27255o;
    }

    @Override // io.sentry.V
    public Queue r() {
        return this.f27250j;
    }

    @Override // io.sentry.V
    public EnumC2596z2 s() {
        return this.f27242b;
    }

    @Override // io.sentry.V
    public io.sentry.protocol.u t() {
        return this.f27262v;
    }

    @Override // io.sentry.V
    public C2505h1 u() {
        return this.f27261u;
    }

    @Override // io.sentry.V
    public Y2 v(b bVar) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27256p.a();
        try {
            bVar.a(this.f27255o);
            Y2 y2Clone = this.f27255o != null ? this.f27255o.clone() : null;
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return y2Clone;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.V
    public void w(String str) {
        this.f27247g = str;
        C2541c c2541cB = B();
        C2539a c2539aD = c2541cB.d();
        if (c2539aD == null) {
            c2539aD = new C2539a();
            c2541cB.m(c2539aD);
        }
        if (str == null) {
            c2539aD.x(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c2539aD.x(arrayList);
        }
        Iterator<W> it = this.f27254n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().n(c2541cB);
        }
    }

    @Override // io.sentry.V
    public Z x() {
        return this.f27263w;
    }

    @Override // io.sentry.V
    public List y() {
        return this.f27253m;
    }

    @Override // io.sentry.V
    public List z() {
        return new CopyOnWriteArrayList(this.f27260t);
    }

    @Override // io.sentry.V
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public V m233clone() {
        return new C2533o1(this);
    }

    public C2533o1(C2533o1 c2533o1) {
        this.f27244d = new WeakReference(null);
        this.f27249i = new ArrayList();
        this.f27251k = new ConcurrentHashMap();
        this.f27252l = new ConcurrentHashMap();
        this.f27253m = new CopyOnWriteArrayList();
        this.f27256p = new C2569a();
        this.f27257q = new C2569a();
        this.f27258r = new C2569a();
        this.f27259s = new C2541c();
        this.f27260t = new CopyOnWriteArrayList();
        this.f27262v = io.sentry.protocol.u.f27472b;
        this.f27263w = L0.f();
        this.f27264x = Collections.synchronizedMap(new WeakHashMap());
        this.f27243c = c2533o1.f27243c;
        this.f27245e = c2533o1.f27245e;
        this.f27255o = c2533o1.f27255o;
        this.f27254n = c2533o1.f27254n;
        this.f27242b = c2533o1.f27242b;
        this.f27263w = c2533o1.f27263w;
        this.f27241a = c2533o1.Q();
        io.sentry.protocol.F f8 = c2533o1.f27246f;
        this.f27246f = f8 != null ? new io.sentry.protocol.F(f8) : null;
        this.f27247g = c2533o1.f27247g;
        this.f27262v = c2533o1.f27262v;
        io.sentry.protocol.l lVar = c2533o1.f27248h;
        this.f27248h = lVar != null ? new io.sentry.protocol.l(lVar) : null;
        this.f27249i = new ArrayList(c2533o1.f27249i);
        this.f27253m = new CopyOnWriteArrayList(c2533o1.f27253m);
        C2491e[] c2491eArr = (C2491e[]) c2533o1.f27250j.toArray(new C2491e[0]);
        Queue queueP = P(c2533o1.f27254n.getMaxBreadcrumbs());
        for (C2491e c2491e : c2491eArr) {
            queueP.add(new C2491e(c2491e));
        }
        this.f27250j = queueP;
        Map map = c2533o1.f27251k;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f27251k = concurrentHashMap;
        Map map2 = c2533o1.f27252l;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f27252l = concurrentHashMap2;
        this.f27259s = new C2541c(c2533o1.f27259s);
        this.f27260t = new CopyOnWriteArrayList(c2533o1.f27260t);
        this.f27261u = new C2505h1(c2533o1.f27261u);
    }
}
