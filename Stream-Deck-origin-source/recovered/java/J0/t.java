package J0;

import C6.C0920i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t extends s {
    public t(x xVar) {
        super(xVar);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) o(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) s(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return c().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!c().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void o(Object obj) {
        y.b();
        throw new C0920i();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return c().h(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        C0.f fVarI;
        int iJ;
        boolean z8;
        AbstractC1028k abstractC1028kD;
        Set setW0 = D6.z.W0(collection);
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
                Map.Entry entry = (Map.Entry) it.next();
                if (setW0.contains(entry.getValue())) {
                    aVarL.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        C0.f fVarI;
        int iJ;
        boolean z8;
        AbstractC1028k abstractC1028kD;
        Set setW0 = D6.z.W0(collection);
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
                Map.Entry entry = (Map.Entry) it.next();
                if (!setW0.contains(entry.getValue())) {
                    aVarL.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public F iterator() {
        return new F(c(), ((C0.d) c().e().i().entrySet()).iterator());
    }
}
