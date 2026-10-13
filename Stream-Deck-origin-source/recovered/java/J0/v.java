package J0;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2632j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v implements G, List, RandomAccess, R6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I f4019a = new a(C0.a.b());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Collection f4024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, Collection collection) {
            super(1);
            this.f4023a = i8;
            this.f4024b = collection;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            return Boolean.valueOf(list.addAll(this.f4023a, this.f4024b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f4025a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Collection collection) {
            super(1);
            this.f4025a = collection;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            return Boolean.valueOf(list.retainAll(this.f4025a));
        }
    }

    public Object A(int i8) {
        int iJ;
        C0.e eVarI;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        Object obj = get(i8);
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e eVarQ = eVarI.q(i8);
            if (kotlin.jvm.internal.t.c(eVarQ, eVarI)) {
                return obj;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarQ);
                        z8 = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i8, int i9) {
        int iJ;
        C0.e eVarI;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e.a aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i8, i9).clear();
            C0.e eVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.t.c(eVarBuild, eVarI)) {
                return;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    try {
                        if (aVar3.j() == iJ) {
                            aVar3.l(eVarBuild);
                            z8 = true;
                            aVar3.m(aVar3.j() + 1);
                            aVar3.n(aVar3.k() + 1);
                        } else {
                            z8 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
    }

    public final int E(Collection collection, int i8, int i9) {
        int iJ;
        C0.e eVarI;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        int size = size();
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e.a aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i8, i9).retainAll(collection);
            C0.e eVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.t.c(eVarBuild, eVarI)) {
                break;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarBuild);
                        z8 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return size - size();
    }

    public final List F() {
        return m().i();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int iJ;
        C0.e eVarI;
        boolean z8;
        AbstractC1028k abstractC1028kD;
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e eVarAdd = eVarI.add(obj);
            z8 = false;
            if (kotlin.jvm.internal.t.c(eVarAdd, eVarI)) {
                return false;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAdd);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z8 = true;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection collection) {
        return y(new b(i8, collection));
    }

    @Override // J0.G
    public I c() {
        return this.f4019a;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AbstractC1028k abstractC1028kD;
        I iC = c();
        kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) iC;
        p.J();
        synchronized (p.I()) {
            abstractC1028kD = AbstractC1028k.f3974e.d();
            a aVar2 = (a) p.h0(aVar, this, abstractC1028kD);
            synchronized (w.f4026a) {
                aVar2.l(C0.a.b());
                aVar2.m(aVar2.j() + 1);
                aVar2.n(aVar2.k() + 1);
            }
        }
        p.Q(abstractC1028kD, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return m().i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return m().i().containsAll(collection);
    }

    @Override // java.util.List
    public Object get(int i8) {
        return m().i().get(i8);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return m().i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return m().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return m().i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new B(this, 0);
    }

    public final a m() {
        I iC = c();
        kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) p.X((a) iC, this);
    }

    @Override // J0.G
    public void o(I i8) {
        i8.g(c());
        kotlin.jvm.internal.t.e(i8, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f4019a = (a) i8;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i8) {
        return A(i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int iJ;
        C0.e eVarI;
        boolean z8;
        AbstractC1028k abstractC1028kD;
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e eVarRemoveAll = eVarI.removeAll(collection);
            z8 = false;
            if (kotlin.jvm.internal.t.c(eVarRemoveAll, eVarI)) {
                return false;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarRemoveAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z8 = true;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return y(new c(collection));
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        int iJ;
        C0.e eVarI;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        Object obj2 = get(i8);
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e eVar = eVarI.set(i8, obj);
            if (kotlin.jvm.internal.t.c(eVar, eVarI)) {
                return obj2;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVar);
                        z8 = true;
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return t();
    }

    @Override // java.util.List
    public List subList(int i8, int i9) {
        if (i8 < 0 || i8 > i9 || i9 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new J(this, i8, i9);
    }

    public int t() {
        return m().i().size();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    public final int u() {
        I iC = c();
        kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) p.F((a) iC)).k();
    }

    public final boolean y(Q6.k kVar) {
        int iJ;
        C0.e eVarI;
        Object objInvoke;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e.a aVarBuilder = eVarI.builder();
            objInvoke = kVar.invoke(aVarBuilder);
            C0.e eVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.t.c(eVarBuild, eVarI)) {
                break;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarBuild);
                        z8 = true;
                        aVar3.m(aVar3.j() + 1);
                        aVar3.n(aVar3.k() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0.e f4020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4022e;

        public a(C0.e eVar) {
            this.f4020c = eVar;
        }

        @Override // J0.I
        public I d() {
            return new a(this.f4020c);
        }

        public final C0.e i() {
            return this.f4020c;
        }

        public final int j() {
            return this.f4021d;
        }

        public final int k() {
            return this.f4022e;
        }

        public final void l(C0.e eVar) {
            this.f4020c = eVar;
        }

        public final void m(int i8) {
            this.f4021d = i8;
        }

        public final void n(int i8) {
            this.f4022e = i8;
        }

        @Override // J0.I
        public void c(I i8) {
            synchronized (w.f4026a) {
                kotlin.jvm.internal.t.e(i8, uYOhHhTXuF.RnDoKoCMwC);
                this.f4020c = ((a) i8).f4020c;
                this.f4021d = ((a) i8).f4021d;
                this.f4022e = ((a) i8).f4022e;
                C6.G g8 = C6.G.f1419a;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        int iJ;
        C0.e eVarI;
        boolean z8;
        AbstractC1028k abstractC1028kD;
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e eVarAddAll = eVarI.addAll(collection);
            z8 = false;
            if (kotlin.jvm.internal.t.c(eVarAddAll, eVarI)) {
                return false;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAddAll);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z8 = true;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i8) {
        return new B(this, i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iJ;
        C0.e eVarI;
        boolean z8;
        AbstractC1028k abstractC1028kD;
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e eVarRemove = eVarI.remove(obj);
            z8 = false;
            if (kotlin.jvm.internal.t.c(eVarRemove, eVarI)) {
                return false;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarRemove);
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                        z8 = true;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC2632j.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        int iJ;
        C0.e eVarI;
        AbstractC1028k abstractC1028kD;
        boolean z8;
        do {
            synchronized (w.f4026a) {
                I iC = c();
                kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) p.F((a) iC);
                iJ = aVar.j();
                eVarI = aVar.i();
                C6.G g8 = C6.G.f1419a;
            }
            kotlin.jvm.internal.t.d(eVarI);
            C0.e eVarAdd = eVarI.add(i8, obj);
            if (kotlin.jvm.internal.t.c(eVarAdd, eVarI)) {
                return;
            }
            I iC2 = c();
            kotlin.jvm.internal.t.e(iC2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) iC2;
            p.J();
            synchronized (p.I()) {
                abstractC1028kD = AbstractC1028k.f3974e.d();
                a aVar3 = (a) p.h0(aVar2, this, abstractC1028kD);
                synchronized (w.f4026a) {
                    if (aVar3.j() == iJ) {
                        aVar3.l(eVarAdd);
                        z8 = true;
                        aVar3.n(aVar3.k() + 1);
                        aVar3.m(aVar3.j() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            p.Q(abstractC1028kD, this);
        } while (!z8);
    }
}
