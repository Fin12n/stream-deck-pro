package W;

import A.C0894s;
import A.D0;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1732o;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.z;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f10773f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static h f10774g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10775a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10776b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f10777c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f10778d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B.a f10779e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public static a a(InterfaceC1733p interfaceC1733p, C0894s c0894s) {
            return new W.a(System.identityHashCode(interfaceC1733p), c0894s);
        }

        public abstract C0894s b();

        public abstract int c();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements InterfaceC1732o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f10780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1733p f10781b;

        public b(InterfaceC1733p interfaceC1733p, h hVar) {
            this.f10781b = interfaceC1733p;
            this.f10780a = hVar;
        }

        public InterfaceC1733p a() {
            return this.f10781b;
        }

        @z(AbstractC1726i.a.ON_DESTROY)
        public void onDestroy(InterfaceC1733p interfaceC1733p) {
            this.f10780a.o(interfaceC1733p);
        }

        @z(AbstractC1726i.a.ON_START)
        public void onStart(InterfaceC1733p interfaceC1733p) {
            this.f10780a.j(interfaceC1733p);
        }

        @z(AbstractC1726i.a.ON_STOP)
        public void onStop(InterfaceC1733p interfaceC1733p) {
            this.f10780a.k(interfaceC1733p);
        }
    }

    public static h c() {
        h hVar;
        synchronized (f10773f) {
            try {
                if (f10774g == null) {
                    f10774g = new h();
                }
                hVar = f10774g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public void a(c cVar, D0 d8, B.a aVar) {
        synchronized (this.f10775a) {
            try {
                T1.f.a(!d8.k().isEmpty());
                this.f10779e = aVar;
                InterfaceC1733p interfaceC1733pS = cVar.s();
                b bVarE = e(interfaceC1733pS);
                if (bVarE == null) {
                    return;
                }
                Set set = (Set) this.f10777c.get(bVarE);
                B.a aVar2 = this.f10779e;
                if (aVar2 == null || aVar2.c() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        c cVar2 = (c) T1.f.g((c) this.f10776b.get((a) it.next()));
                        if (!cVar2.equals(cVar) && !cVar2.t().isEmpty()) {
                            if (cVar2.v() || d8.m()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            cVar2.x();
                        }
                    }
                }
                try {
                    cVar.f(d8);
                    if (interfaceC1733pS.w().b().b(AbstractC1726i.b.STARTED)) {
                        j(interfaceC1733pS);
                    }
                } catch (L.f.a e8) {
                    throw new IllegalArgumentException(e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c b(InterfaceC1733p interfaceC1733p, L.f fVar) {
        synchronized (this.f10775a) {
            try {
                T1.f.b(this.f10776b.get(a.a(interfaceC1733p, fVar.I())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                c cVar = new c(interfaceC1733p, fVar);
                if (fVar.N().isEmpty()) {
                    cVar.w();
                }
                if (interfaceC1733p.w().b() == AbstractC1726i.b.DESTROYED) {
                    return cVar;
                }
                h(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c d(InterfaceC1733p interfaceC1733p, C0894s c0894s) {
        c cVar;
        synchronized (this.f10775a) {
            cVar = (c) this.f10776b.get(a.a(interfaceC1733p, c0894s));
        }
        return cVar;
    }

    public final b e(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10775a) {
            try {
                for (b bVar : this.f10777c.keySet()) {
                    if (interfaceC1733p.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection f() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f10775a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f10776b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean g(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10775a) {
            try {
                b bVarE = e(interfaceC1733p);
                if (bVarE == null) {
                    return false;
                }
                Iterator it = ((Set) this.f10777c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    if (!((c) T1.f.g((c) this.f10776b.get((a) it.next()))).t().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(c cVar) {
        synchronized (this.f10775a) {
            try {
                InterfaceC1733p interfaceC1733pS = cVar.s();
                a aVarA = a.a(interfaceC1733pS, cVar.i().I());
                b bVarE = e(interfaceC1733pS);
                Set hashSet = bVarE != null ? (Set) this.f10777c.get(bVarE) : new HashSet();
                hashSet.add(aVarA);
                this.f10776b.put(aVarA, cVar);
                if (bVarE == null) {
                    b bVar = new b(interfaceC1733pS, this);
                    this.f10777c.put(bVar, hashSet);
                    interfaceC1733pS.w().a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(Set set) {
        synchronized (this.f10775a) {
            if (set == null) {
                try {
                    set = this.f10776b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (a aVar : set) {
                if (this.f10776b.containsKey(aVar)) {
                    n((c) this.f10776b.get(aVar));
                }
            }
        }
    }

    public void j(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10775a) {
            try {
                if (g(interfaceC1733p)) {
                    if (this.f10778d.isEmpty()) {
                        this.f10778d.push(interfaceC1733p);
                    } else {
                        B.a aVar = this.f10779e;
                        if (aVar == null || aVar.c() != 2) {
                            InterfaceC1733p interfaceC1733p2 = (InterfaceC1733p) this.f10778d.peek();
                            if (!interfaceC1733p.equals(interfaceC1733p2)) {
                                l(interfaceC1733p2);
                                this.f10778d.remove(interfaceC1733p);
                                this.f10778d.push(interfaceC1733p);
                            }
                        }
                    }
                    p(interfaceC1733p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10775a) {
            try {
                this.f10778d.remove(interfaceC1733p);
                l(interfaceC1733p);
                if (!this.f10778d.isEmpty()) {
                    p((InterfaceC1733p) this.f10778d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10775a) {
            try {
                b bVarE = e(interfaceC1733p);
                if (bVarE == null) {
                    return;
                }
                Iterator it = ((Set) this.f10777c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    ((c) T1.f.g((c) this.f10776b.get((a) it.next()))).w();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(Set set) {
        synchronized (this.f10775a) {
            if (set == null) {
                try {
                    set = this.f10776b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c cVar = (c) this.f10776b.get((a) it.next());
                if (cVar != null) {
                    cVar.x();
                    k(cVar.s());
                }
            }
        }
    }

    public final void n(c cVar) {
        synchronized (this.f10775a) {
            try {
                InterfaceC1733p interfaceC1733pS = cVar.s();
                a aVarA = a.a(interfaceC1733pS, cVar.i().I());
                this.f10776b.remove(aVarA);
                HashSet hashSet = new HashSet();
                for (b bVar : this.f10777c.keySet()) {
                    if (interfaceC1733pS.equals(bVar.a())) {
                        Set set = (Set) this.f10777c.get(bVar);
                        set.remove(aVarA);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.a());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    o((InterfaceC1733p) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10775a) {
            try {
                b bVarE = e(interfaceC1733p);
                if (bVarE == null) {
                    return;
                }
                k(interfaceC1733p);
                Iterator it = ((Set) this.f10777c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    this.f10776b.remove((a) it.next());
                }
                this.f10777c.remove(bVarE);
                bVarE.a().w().d(bVarE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(InterfaceC1733p interfaceC1733p) {
        synchronized (this.f10775a) {
            try {
                Iterator it = ((Set) this.f10777c.get(e(interfaceC1733p))).iterator();
                while (it.hasNext()) {
                    c cVar = (c) this.f10776b.get((a) it.next());
                    if (!((c) T1.f.g(cVar)).t().isEmpty()) {
                        cVar.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
