package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r extends AbstractC1726i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f15304k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p134p.a f15306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1726i.b f15307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f15308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f15312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p044e7.x f15313j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final AbstractC1726i.b a(AbstractC1726i.b state1, AbstractC1726i.b bVar) {
            kotlin.jvm.internal.t.g(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC1726i.b f15314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1730m f15315b;

        public b(InterfaceC1732o interfaceC1732o, AbstractC1726i.b initialState) {
            kotlin.jvm.internal.t.g(initialState, "initialState");
            kotlin.jvm.internal.t.d(interfaceC1732o);
            this.f15315b = C1736t.f(interfaceC1732o);
            this.f15314a = initialState;
        }

        public final void a(InterfaceC1733p interfaceC1733p, AbstractC1726i.a event) {
            kotlin.jvm.internal.t.g(event, "event");
            AbstractC1726i.b bVarB = event.b();
            this.f15314a = r.f15304k.a(this.f15314a, bVarB);
            InterfaceC1730m interfaceC1730m = this.f15315b;
            kotlin.jvm.internal.t.d(interfaceC1733p);
            interfaceC1730m.j(interfaceC1733p, event);
            this.f15314a = bVarB;
        }

        public final AbstractC1726i.b b() {
            return this.f15314a;
        }
    }

    public /* synthetic */ r(InterfaceC1733p interfaceC1733p, boolean z8, AbstractC2633k abstractC2633k) {
        this(interfaceC1733p, z8);
    }

    @Override // androidx.lifecycle.AbstractC1726i
    public void a(InterfaceC1732o observer) {
        InterfaceC1733p interfaceC1733p;
        kotlin.jvm.internal.t.g(observer, "observer");
        g("addObserver");
        AbstractC1726i.b bVar = this.f15307d;
        AbstractC1726i.b bVar2 = AbstractC1726i.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1726i.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f15306c.u(observer, bVar3)) == null && (interfaceC1733p = (InterfaceC1733p) this.f15308e.get()) != null) {
            boolean z8 = this.f15309f != 0 || this.f15310g;
            AbstractC1726i.b bVarF = f(observer);
            this.f15309f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.f15306c.contains(observer)) {
                m(bVar3.b());
                AbstractC1726i.a aVarB = AbstractC1726i.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC1733p, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z8) {
                o();
            }
            this.f15309f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1726i
    public AbstractC1726i.b b() {
        return this.f15307d;
    }

    @Override // androidx.lifecycle.AbstractC1726i
    public void d(InterfaceC1732o observer) {
        kotlin.jvm.internal.t.g(observer, "observer");
        g("removeObserver");
        this.f15306c.y(observer);
    }

    public final void e(InterfaceC1733p interfaceC1733p) {
        Iterator itDescendingIterator = this.f15306c.descendingIterator();
        kotlin.jvm.internal.t.f(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f15311h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            kotlin.jvm.internal.t.f(entry, "next()");
            InterfaceC1732o interfaceC1732o = (InterfaceC1732o) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f15307d) > 0 && !this.f15311h && this.f15306c.contains(interfaceC1732o)) {
                AbstractC1726i.a aVarA = AbstractC1726i.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.b());
                bVar.a(interfaceC1733p, aVarA);
                l();
            }
        }
    }

    public final AbstractC1726i.b f(InterfaceC1732o interfaceC1732o) {
        b bVar;
        Map.Entry entryZ = this.f15306c.z(interfaceC1732o);
        AbstractC1726i.b bVar2 = null;
        AbstractC1726i.b bVarB = (entryZ == null || (bVar = (b) entryZ.getValue()) == null) ? null : bVar.b();
        if (!this.f15312i.isEmpty()) {
            ArrayList arrayList = this.f15312i;
            bVar2 = (AbstractC1726i.b) arrayList.get(arrayList.size() - 1);
        }
        a aVar = f15304k;
        return aVar.a(aVar.a(this.f15307d, bVarB), bVar2);
    }

    public final void g(String str) {
        if (!this.f15305b || AbstractC1735s.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void h(InterfaceC1733p interfaceC1733p) {
        p.b.d dVarO = this.f15306c.o();
        kotlin.jvm.internal.t.f(dVarO, "observerMap.iteratorWithAdditions()");
        while (dVarO.hasNext() && !this.f15311h) {
            Map.Entry entry = (Map.Entry) dVarO.next();
            InterfaceC1732o interfaceC1732o = (InterfaceC1732o) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f15307d) < 0 && !this.f15311h && this.f15306c.contains(interfaceC1732o)) {
                m(bVar.b());
                AbstractC1726i.a aVarB = AbstractC1726i.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC1733p, aVarB);
                l();
            }
        }
    }

    public void i(AbstractC1726i.a event) {
        kotlin.jvm.internal.t.g(event, "event");
        g("handleLifecycleEvent");
        k(event.b());
    }

    public final boolean j() {
        if (this.f15306c.size() == 0) {
            return true;
        }
        Map.Entry entryC = this.f15306c.c();
        kotlin.jvm.internal.t.d(entryC);
        AbstractC1726i.b bVarB = ((b) entryC.getValue()).b();
        Map.Entry entryS = this.f15306c.s();
        kotlin.jvm.internal.t.d(entryS);
        AbstractC1726i.b bVarB2 = ((b) entryS.getValue()).b();
        return bVarB == bVarB2 && this.f15307d == bVarB2;
    }

    public final void k(AbstractC1726i.b bVar) {
        AbstractC1726i.b bVar2 = this.f15307d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1726i.b.INITIALIZED && bVar == AbstractC1726i.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f15307d + " in component " + this.f15308e.get()).toString());
        }
        this.f15307d = bVar;
        if (this.f15310g || this.f15309f != 0) {
            this.f15311h = true;
            return;
        }
        this.f15310g = true;
        o();
        this.f15310g = false;
        if (this.f15307d == AbstractC1726i.b.DESTROYED) {
            this.f15306c = new p134p.a();
        }
    }

    public final void l() {
        ArrayList arrayList = this.f15312i;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void m(AbstractC1726i.b bVar) {
        this.f15312i.add(bVar);
    }

    public void n(AbstractC1726i.b state) {
        kotlin.jvm.internal.t.g(state, "state");
        g("setCurrentState");
        k(state);
    }

    public final void o() {
        InterfaceC1733p interfaceC1733p = (InterfaceC1733p) this.f15308e.get();
        if (interfaceC1733p == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f15311h = false;
            AbstractC1726i.b bVar = this.f15307d;
            Map.Entry entryC = this.f15306c.c();
            kotlin.jvm.internal.t.d(entryC);
            if (bVar.compareTo(((b) entryC.getValue()).b()) < 0) {
                e(interfaceC1733p);
            }
            Map.Entry entryS = this.f15306c.s();
            if (!this.f15311h && entryS != null && this.f15307d.compareTo(((b) entryS.getValue()).b()) > 0) {
                h(interfaceC1733p);
            }
        }
        this.f15311h = false;
        this.f15313j.setValue(b());
    }

    public r(InterfaceC1733p interfaceC1733p, boolean z8) {
        this.f15305b = z8;
        this.f15306c = new p134p.a();
        AbstractC1726i.b bVar = AbstractC1726i.b.INITIALIZED;
        this.f15307d = bVar;
        this.f15312i = new ArrayList();
        this.f15308e = new WeakReference(interfaceC1733p);
        this.f15313j = p044e7.O.a(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC1733p provider) {
        this(provider, true);
        kotlin.jvm.internal.t.g(provider, "provider");
    }
}
