package p089j7;

import C6.G;
import C6.r;
import D6.C0937q;
import D6.z;
import G6.d;
import G6.g;
import H6.c;
import I6.h;
import Q6.k;
import Q6.o;
import Q6.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1801o;
import p017b7.C1797m;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1793k;
import p017b7.InterfaceC1795l;
import p017b7.b1;
import p062g7.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class i implements InterfaceC1793k, c, j, b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28352f = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f28353a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f28355c;
    private volatile /* synthetic */ Object state$volatile = k.f28372b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f28354b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28356d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f28357e = k.f28375e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f28358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f28359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f28360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f28361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f28362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p f28363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f28364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f28365h = -1;

        public a(Object obj, p pVar, p pVar2, Object obj2, Object obj3, p pVar3) {
            this.f28358a = obj;
            this.f28359b = pVar;
            this.f28360c = pVar2;
            this.f28361d = obj2;
            this.f28362e = obj3;
            this.f28363f = pVar3;
        }

        public final k a(j jVar, Object obj) {
            p pVar = this.f28363f;
            if (pVar != null) {
                return (k) pVar.invoke(jVar, this.f28361d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f28364g;
            i iVar = i.this;
            if (obj instanceof D) {
                ((D) obj).s(this.f28365h, null, iVar.getContext());
                return;
            }
            InterfaceC1776b0 interfaceC1776b0 = obj instanceof InterfaceC1776b0 ? (InterfaceC1776b0) obj : null;
            if (interfaceC1776b0 != null) {
                interfaceC1776b0.d();
            }
        }

        public final Object c(Object obj, d dVar) {
            Object obj2 = this.f28362e;
            if (this.f28361d == k.i()) {
                t.e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((k) obj2).invoke(dVar);
            }
            t.e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((o) obj2).invoke(obj, dVar);
        }

        public final Object d(Object obj) {
            return this.f28360c.invoke(this.f28358a, this.f28361d, obj);
        }

        public final boolean e(i iVar) {
            this.f28359b.invoke(this.f28358a, iVar, this.f28361d);
            return iVar.f28357e == k.f28375e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28368b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28370d;

        public b(d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f28368b = obj;
            this.f28370d |= Integer.MIN_VALUE;
            return i.this.q(this);
        }
    }

    public i(g gVar) {
        this.f28353a = gVar;
    }

    public static /* synthetic */ Object p(i iVar, d dVar) {
        return iVar.t() ? iVar.n(dVar) : iVar.q(dVar);
    }

    private final boolean t() {
        return f28352f.get(this) instanceof a;
    }

    public static /* synthetic */ void v(i iVar, a aVar, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        iVar.u(aVar, z8);
    }

    @Override // p017b7.InterfaceC1793k
    public void a(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28352f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == k.f28373c) {
                return;
            }
        } while (!F1.b.a(atomicReferenceFieldUpdater, this, obj, k.f28374d));
        List list = this.f28354b;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f28357e = k.f28375e;
        this.f28354b = null;
    }

    @Override // p089j7.c
    public void b(d dVar, k kVar) {
        v(this, new a(dVar.b(), dVar.a(), dVar.d(), k.i(), kVar, dVar.c()), false, 1, null);
    }

    @Override // p089j7.j
    public void c(InterfaceC1776b0 interfaceC1776b0) {
        this.f28355c = interfaceC1776b0;
    }

    @Override // p017b7.b1
    public void d(D d8, int i8) {
        this.f28355c = d8;
        this.f28356d = i8;
    }

    @Override // p089j7.j
    public boolean e(Object obj, Object obj2) {
        return y(obj, obj2) == 0;
    }

    @Override // p089j7.c
    public void f(f fVar, o oVar) {
        v(this, new a(fVar.b(), fVar.a(), fVar.d(), null, oVar, fVar.c()), false, 1, null);
    }

    @Override // p089j7.j
    public void g(Object obj) {
        this.f28357e = obj;
    }

    @Override // p089j7.j
    public g getContext() {
        return this.f28353a;
    }

    public final void l(Object obj) {
        List list = this.f28354b;
        t.d(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).f28358a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    public final void m(a aVar) {
        List<a> list = this.f28354b;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f28352f.set(this, k.f28373c);
        this.f28357e = k.f28375e;
        this.f28354b = null;
    }

    public final Object n(d dVar) {
        Object obj = f28352f.get(this);
        t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f28357e;
        m(aVar);
        return aVar.c(aVar.d(obj2), dVar);
    }

    public Object o(d dVar) {
        return p(this, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(d dVar) {
        b bVar;
        i iVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f28370d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f28370d = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f28368b;
        Object objF = c.f();
        int i9 = bVar.f28370d;
        if (i9 == 0) {
            r.b(obj);
            bVar.f28367a = this;
            bVar.f28370d = 1;
            if (z(bVar) != objF) {
                iVar = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return obj;
        }
        iVar = (i) bVar.f28367a;
        r.b(obj);
        bVar.f28367a = null;
        bVar.f28370d = 2;
        Object objN = iVar.n(bVar);
        return objN == objF ? objF : objN;
    }

    public final a r(Object obj) {
        List list = this.f28354b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((a) obj3).f28358a == obj) {
                obj2 = obj3;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void u(a aVar, boolean z8) {
        if (f28352f.get(this) instanceof a) {
            return;
        }
        if (!z8) {
            l(aVar.f28358a);
        }
        if (!aVar.e(this)) {
            f28352f.set(this, aVar);
            return;
        }
        if (!z8) {
            List list = this.f28354b;
            t.d(list);
            list.add(aVar);
        }
        aVar.f28364g = this.f28355c;
        aVar.f28365h = this.f28356d;
        this.f28355c = null;
        this.f28356d = -1;
    }

    public final void w(Object obj) {
        a aVarR = r(obj);
        t.d(aVarR);
        aVarR.f28364g = null;
        aVarR.f28365h = -1;
        u(aVarR, true);
    }

    public final l x(Object obj, Object obj2) {
        return k.a(y(obj, obj2));
    }

    public final int y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f28352f.get(this);
            if (obj3 instanceof InterfaceC1795l) {
                a aVarR = r(obj);
                if (aVarR == null) {
                    continue;
                } else {
                    k kVarA = aVarR.a(this, obj2);
                    if (F1.b.a(f28352f, this, obj3, aVarR)) {
                        this.f28357e = obj2;
                        if (k.j((InterfaceC1795l) obj3, kVarA)) {
                            return 0;
                        }
                        this.f28357e = k.f28375e;
                        return 2;
                    }
                }
            } else {
                if (t.c(obj3, k.f28373c) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (t.c(obj3, k.f28374d)) {
                    return 2;
                }
                if (t.c(obj3, k.f28372b)) {
                    if (F1.b.a(f28352f, this, obj3, C0937q.e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (F1.b.a(f28352f, this, obj3, z.C0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    public final Object z(d dVar) {
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28352f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == k.f28372b) {
                if (F1.b.a(f28352f, this, obj, c1797m)) {
                    AbstractC1801o.c(c1797m, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof a) {
                        c1797m.G(G.f1419a, ((a) obj).a(this, this.f28357e));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (F1.b.a(f28352f, this, obj, k.f28372b)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        w(it.next());
                    }
                }
            }
        }
        Object objS = c1797m.s();
        if (objS == c.f()) {
            h.c(dVar);
        }
        return objS == c.f() ? objS : G.f1419a;
    }
}
