package J0;

import V.ocy.SVzBK;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x implements G, Map, R6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I f4027a = new a(C0.a.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f4028b = new q(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f4029c = new r(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f4030d = new t(this);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0.f f4031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4032d;

        public a(C0.f fVar) {
            this.f4031c = fVar;
        }

        @Override // J0.I
        public void c(I i8) {
            kotlin.jvm.internal.t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) i8;
            synchronized (y.f4033a) {
                this.f4031c = aVar.f4031c;
                this.f4032d = aVar.f4032d;
                C6.G g8 = C6.G.f1419a;
            }
        }

        @Override // J0.I
        public I d() {
            return new a(this.f4031c);
        }

        public final C0.f i() {
            return this.f4031c;
        }

        public final int j() {
            return this.f4032d;
        }

        public final void k(C0.f fVar) {
            this.f4031c = fVar;
        }

        public final void l(int i8) {
            this.f4032d = i8;
        }
    }

    public Set a() {
        return this.f4028b;
    }

    public Set b() {
        return this.f4029c;
    }

    @Override // J0.G
    public I c() {
        return this.f4027a;
    }

    @Override // java.util.Map
    public void clear() {
        AbstractC1028k abstractC1028kD;
        I iC = c();
        kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) p.F((a) iC);
        aVar.i();
        C0.f fVarA = C0.a.a();
        if (fVarA != aVar.i()) {
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (y.f4033a) {
                    aVar3.k(fVarA);
                    aVar3.l(aVar3.j() + 1);
                }
            }
            p.Q(abstractC1028kD, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e().i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return e().i().containsValue(obj);
    }

    public final int d() {
        return e().j();
    }

    public final a e() {
        I iC = c();
        kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) p.X((a) iC, this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    public int f() {
        return e().i().size();
    }

    public Collection g() {
        return this.f4030d;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return e().i().get(obj);
    }

    public final boolean h(Object obj) {
        Object next;
        Iterator it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.t.c(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return e().i().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // J0.G
    public void o(I i8) {
        kotlin.jvm.internal.t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f4027a = (a) i8;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        C0.f fVarI;
        int iJ;
        Object objPut;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        do {
            synchronized (y.f4033a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) p.F((a) iC);
                fVarI = aVar.i();
                iJ = aVar.j();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(fVarI);
            C0.f.a aVarL = fVarI.l();
            objPut = aVarL.put(obj, obj2);
            C0.f fVarBuild = aVarL.build();
            if (kotlin.jvm.internal.t.c(fVarBuild, fVarI)) {
                break;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (y.f4033a) {
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        z8 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return objPut;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        C0.f fVarI;
        int iJ;
        Object objRemove;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        do {
            synchronized (y.f4033a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) p.F((a) iC);
                fVarI = aVar.i();
                iJ = aVar.j();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(fVarI);
            C0.f.a aVarL = fVarI.l();
            objRemove = aVarL.remove(obj);
            C0.f fVarBuild = aVarL.build();
            if (kotlin.jvm.internal.t.c(fVarBuild, fVarI)) {
                break;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (y.f4033a) {
                    if (aVar3.j() == iJ) {
                        aVar3.k(fVarBuild);
                        z8 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0078 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void putAll(Map map) {
        C0.f fVarI;
        int iJ;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        do {
            synchronized (y.f4033a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, SVzBK.BckMIr);
                a aVar = (a) p.F((a) iC);
                fVarI = aVar.i();
                iJ = aVar.j();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(fVarI);
            C0.f.a aVarL = fVarI.l();
            aVarL.putAll(map);
            C0.f fVarBuild = aVarL.build();
            if (!kotlin.jvm.internal.t.c(fVarBuild, fVarI)) {
                I iC2 = c();
                kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) iC2;
                p.J();
                synchronized (p.I()) {
                    abstractC1028kD = AbstractC1028k.f3974e.d();
                    a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                    synchronized (y.f4033a) {
                        try {
                            if (aVar3.j() == iJ) {
                                aVar3.k(fVarBuild);
                                z8 = true;
                                aVar3.l(aVar3.j() + 1);
                            } else {
                                z8 = false;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                p.Q(abstractC1028kD, this);
            } else {
                return;
            }
        } while (!z8);
    }
}
