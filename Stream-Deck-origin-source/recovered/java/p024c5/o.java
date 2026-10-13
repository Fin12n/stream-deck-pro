package p024c5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1826c f16258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f16259b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f16260c = new HashSet();

        public b(C1826c c1826c) {
            this.f16258a = c1826c;
        }

        public void a(b bVar) {
            this.f16259b.add(bVar);
        }

        public void b(b bVar) {
            this.f16260c.add(bVar);
        }

        public C1826c c() {
            return this.f16258a;
        }

        public Set d() {
            return this.f16259b;
        }

        public boolean e() {
            return this.f16259b.isEmpty();
        }

        public boolean f() {
            return this.f16260c.isEmpty();
        }

        public void g(b bVar) {
            this.f16260c.remove(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f16261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16262b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f16261a.equals(this.f16261a) && cVar.f16262b == this.f16262b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f16261a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f16262b).hashCode();
        }

        public c(Class cls, boolean z8) {
            this.f16261a = cls;
            this.f16262b = z8;
        }
    }

    public static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i8 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i8++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i8 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new q(arrayList);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (p pVar : bVar.c().c()) {
                            if (pVar.d() && (set = (Set) map.get(new c(pVar.b(), pVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C1826c c1826c = (C1826c) it.next();
            b bVar3 = new b(c1826c);
            for (Class cls : c1826c.e()) {
                c cVar = new c(cls, !c1826c.j());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f16262b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
