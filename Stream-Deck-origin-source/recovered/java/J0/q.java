package J0;

import C6.C0920i;
import D6.C0938s;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.P;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {
    public q(x xVar) {
        super(xVar);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) o((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) s(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (P.m(obj)) {
            return t((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C(c(), ((C0.d) c().e().i().entrySet()).iterator());
    }

    public Void o(Map.Entry entry) {
        y.b();
        throw new C0920i();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (P.m(obj)) {
            return u((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z8 = false;
            while (it.hasNext()) {
                if (c().remove(((Map.Entry) it.next()).getKey()) != null || z8) {
                    z8 = true;
                }
            }
            return z8;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        C0.f fVarI;
        int iJ;
        boolean z8;
        AbstractC1028k abstractC1028kD;
        Collection<Map.Entry> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(D6.L.d(C0938s.y(collection2, 10)), 16));
        for (Map.Entry entry : collection2) {
            C6.o oVarA = C6.v.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(oVarA.c(), oVarA.d());
        }
        x xVarC = c();
        boolean z9 = false;
        do {
            synchronized (y.f4033a) {
                I iC = xVarC.c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x.a aVar = (x.a) p.F((x.a) iC);
                fVarI = aVar.i();
                iJ = aVar.j();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(fVarI);
            C0.f.a aVarL = fVarI.l();
            Iterator it = xVarC.entrySet().iterator();
            while (true) {
                z8 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !kotlin.jvm.internal.t.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarL.remove(entry2.getKey());
                    z9 = true;
                }
            }
            C6.G g9 = C6.G.f1419a;
            C0.f fVarBuild = aVarL.build();
            if (kotlin.jvm.internal.t.c(fVarBuild, fVarI)) {
                break;
            }
            I iC2 = xVarC.c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            x.a aVar2 = (x.a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                x.a aVar3 = (x.a) p.h0(aVar2, xVarC, abstractC1028kD);
                synchronized (y.f4033a) {
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, xVarC);
        } while (!z8);
        return z9;
    }

    public Void s(Collection collection) {
        y.b();
        throw new C0920i();
    }

    public boolean t(Map.Entry entry) {
        return kotlin.jvm.internal.t.c(c().get(entry.getKey()), entry.getValue());
    }

    public boolean u(Map.Entry entry) {
        return c().remove(entry.getKey()) != null;
    }
}
