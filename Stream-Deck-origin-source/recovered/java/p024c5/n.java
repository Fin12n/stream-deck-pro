package p024c5;

import X.i;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p078i5.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class n extends AbstractC1824a implements p033d5.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p087j5.b f16248g = m.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f16251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f16253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f16254f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f16255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f16256b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f16257c = new ArrayList();

        public b(Executor executor) {
            this.f16255a = executor;
        }

        public b a(C1826c c1826c) {
            this.f16257c.add(c1826c);
            return this;
        }

        public b b(Collection collection) {
            this.f16256b.addAll(collection);
            return this;
        }

        public n c() {
            return new n(this.f16255a, this.f16256b, this.f16257c);
        }
    }

    public static b e(Executor executor) {
        return new b(executor);
    }

    public static List i(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Iterable r(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(j.a((h) it.next()));
        }
        return arrayList;
    }

    @Override // p024c5.AbstractC1824a, p024c5.d
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // p024c5.d
    public synchronized p087j5.b b(Class cls) {
        B.c(cls, "Null interface requested.");
        return (p087j5.b) this.f16250b.get(cls);
    }

    @Override // p024c5.d
    public synchronized p087j5.b c(Class cls) {
        w wVar = (w) this.f16251c.get(cls);
        if (wVar != null) {
            return wVar;
        }
        return f16248g;
    }

    @Override // p024c5.AbstractC1824a, p024c5.d
    public /* bridge */ /* synthetic */ Set d(Class cls) {
        return super.d(cls);
    }

    public final void f(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f16252d.iterator();
            while (it.hasNext()) {
                try {
                    h hVar = (h) ((p087j5.b) it.next()).get();
                    if (hVar != null) {
                        list.addAll(hVar.a());
                        it.remove();
                    }
                } catch (u e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            if (this.f16249a.isEmpty()) {
                o.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f16249a.keySet());
                arrayList2.addAll(list);
                o.a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1826c c1826c = (C1826c) it2.next();
                this.f16249a.put(c1826c, new v(i.a(this, c1826c)));
            }
            arrayList.addAll(p(list));
            arrayList.addAll(q());
            o();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        n();
    }

    public final void g(Map map, boolean z8) {
        for (Map.Entry entry : map.entrySet()) {
            C1826c c1826c = (C1826c) entry.getKey();
            p087j5.b bVar = (p087j5.b) entry.getValue();
            if (c1826c.h() || (c1826c.i() && z8)) {
                bVar.get();
            }
        }
        this.f16253e.a();
    }

    public void h(boolean z8) {
        HashMap map;
        if (i.a(this.f16254f, null, Boolean.valueOf(z8))) {
            synchronized (this) {
                map = new HashMap(this.f16249a);
            }
            g(map, z8);
        }
    }

    public final void n() {
        Boolean bool = (Boolean) this.f16254f.get();
        if (bool != null) {
            g(this.f16249a, bool.booleanValue());
        }
    }

    public final void o() {
        for (C1826c c1826c : this.f16249a.keySet()) {
            for (p pVar : c1826c.c()) {
                if (pVar.f() && !this.f16251c.containsKey(pVar.b())) {
                    this.f16251c.put(pVar.b(), w.b(Collections.EMPTY_SET));
                } else if (this.f16250b.containsKey(pVar.b())) {
                    continue;
                } else {
                    if (pVar.e()) {
                        throw new x(String.format("Unsatisfied dependency for component %s: %s", c1826c, pVar.b()));
                    }
                    if (!pVar.f()) {
                        this.f16250b.put(pVar.b(), A.a());
                    }
                }
            }
        }
    }

    public final List p(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1826c c1826c = (C1826c) it.next();
            if (c1826c.j()) {
                p087j5.b bVar = (p087j5.b) this.f16249a.get(c1826c);
                for (Class cls : c1826c.e()) {
                    if (this.f16250b.containsKey(cls)) {
                        arrayList.add(k.a((A) ((p087j5.b) this.f16250b.get(cls)), bVar));
                    } else {
                        this.f16250b.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List q() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f16249a.entrySet()) {
            C1826c c1826c = (C1826c) entry.getKey();
            if (!c1826c.j()) {
                p087j5.b bVar = (p087j5.b) entry.getValue();
                for (Class cls : c1826c.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f16251c.containsKey(entry2.getKey())) {
                w wVar = (w) this.f16251c.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(l.a(wVar, (p087j5.b) it.next()));
                }
            } else {
                this.f16251c.put((Class) entry2.getKey(), w.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Deprecated
    public n(Executor executor, Iterable<h> iterable, C1826c... c1826cArr) {
        this(executor, r(iterable), Arrays.asList(c1826cArr));
    }

    public n(Executor executor, Iterable iterable, Collection collection) {
        this.f16249a = new HashMap();
        this.f16250b = new HashMap();
        this.f16251c = new HashMap();
        this.f16254f = new AtomicReference();
        t tVar = new t(executor);
        this.f16253e = tVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1826c.l(tVar, t.class, c.class, p078i5.b.class));
        arrayList.add(C1826c.l(this, p033d5.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1826c c1826c = (C1826c) it.next();
            if (c1826c != null) {
                arrayList.add(c1826c);
            }
        }
        this.f16252d = i(iterable);
        f(arrayList);
    }

    public static /* synthetic */ h m(h hVar) {
        return hVar;
    }
}
