package J0;

import C6.C0920i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p116m7.kKPq.toqHM;
import p215z0.C3151f;
import p215z0.m1;
import p215z0.w1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q6.k f3999a = b.f4012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f4000b = new m1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4001c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static n f4002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f4003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f4004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A f4005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static List f4006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static List f4007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicReference f4008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AbstractC1028k f4009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C3151f f4010l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4014b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q6.k kVar, Q6.k kVar2) {
            super(1);
            this.f4013a = kVar;
            this.f4014b = kVar2;
        }

        public final void b(Object obj) {
            this.f4013a.invoke(obj);
            this.f4014b.invoke(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4016b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Q6.k kVar, Q6.k kVar2) {
            super(1);
            this.f4015a = kVar;
            this.f4016b = kVar2;
        }

        public final void b(Object obj) {
            this.f4015a.invoke(obj);
            this.f4016b.invoke(obj);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q6.k f4017a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Q6.k kVar) {
            super(1);
            this.f4017a = kVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC1028k invoke(n nVar) {
            AbstractC1028k abstractC1028k = (AbstractC1028k) this.f4017a.invoke(nVar);
            synchronized (p.I()) {
                p.f4002d = p.f4002d.F(abstractC1028k.f());
                C6.G g8 = C6.G.f1419a;
            }
            return abstractC1028k;
        }
    }

    static {
        n.a aVar = n.f3987e;
        f4002d = aVar.a();
        f4003e = 1;
        f4004f = new m();
        f4005g = new A();
        f4006h = D6.r.n();
        f4007i = D6.r.n();
        int i8 = f4003e;
        f4003e = i8 + 1;
        C1018a c1018a = new C1018a(i8, aVar.a());
        f4002d = f4002d.F(c1018a.f());
        AtomicReference atomicReference = new AtomicReference(c1018a);
        f4008j = atomicReference;
        f4009k = (AbstractC1028k) atomicReference.get();
        f4010l = new C3151f(0);
    }

    public static final void B() {
        A(a.f4011a);
    }

    public static final void C() {
        A a8 = f4005g;
        int iE = a8.e();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= iE) {
                break;
            }
            w1 w1Var = a8.f()[i8];
            Object obj = w1Var != null ? w1Var.get() : null;
            if (obj != null && T((G) obj)) {
                if (i9 != i8) {
                    a8.f()[i9] = w1Var;
                    a8.d()[i9] = a8.d()[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < iE; i10++) {
            a8.f()[i10] = null;
            a8.d()[i10] = 0;
        }
        if (i9 != iE) {
            a8.g(i9);
        }
    }

    public static final AbstractC1028k D(AbstractC1028k abstractC1028k, Q6.k kVar, boolean z8) {
        boolean z9 = abstractC1028k instanceof C1020c;
        if (z9 || abstractC1028k == null) {
            return new K(z9 ? (C1020c) abstractC1028k : null, kVar, null, false, z8);
        }
        return new L(abstractC1028k, kVar, false, z8);
    }

    public static /* synthetic */ AbstractC1028k E(AbstractC1028k abstractC1028k, Q6.k kVar, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar = null;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return D(abstractC1028k, kVar, z8);
    }

    public static final I F(I i8) {
        I iW;
        AbstractC1028k.a aVar = AbstractC1028k.f3974e;
        AbstractC1028k abstractC1028kD = aVar.d();
        I iW2 = W(i8, abstractC1028kD.f(), abstractC1028kD.g());
        if (iW2 != null) {
            return iW2;
        }
        synchronized (I()) {
            AbstractC1028k abstractC1028kD2 = aVar.d();
            iW = W(i8, abstractC1028kD2.f(), abstractC1028kD2.g());
        }
        if (iW != null) {
            return iW;
        }
        V();
        throw new C0920i();
    }

    public static final I G(I i8, AbstractC1028k abstractC1028k) {
        I iW = W(i8, abstractC1028k.f(), abstractC1028k.g());
        if (iW != null) {
            return iW;
        }
        V();
        throw new C0920i();
    }

    public static final AbstractC1028k H() {
        AbstractC1028k abstractC1028k = (AbstractC1028k) f4000b.a();
        return abstractC1028k == null ? (AbstractC1028k) f4008j.get() : abstractC1028k;
    }

    public static final Object I() {
        return f4001c;
    }

    public static final AbstractC1028k J() {
        return f4009k;
    }

    public static final Q6.k K(Q6.k kVar, Q6.k kVar2, boolean z8) {
        if (!z8) {
            kVar2 = null;
        }
        if (kVar == null || kVar2 == null || kotlin.jvm.internal.t.c(kVar, kVar2)) {
            return kVar == null ? kVar2 : kVar;
        }
        return new c(kVar, kVar2);
    }

    public static /* synthetic */ Q6.k L(Q6.k kVar, Q6.k kVar2, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return K(kVar, kVar2, z8);
    }

    public static final Q6.k M(Q6.k kVar, Q6.k kVar2) {
        if (kVar == null || kVar2 == null || kotlin.jvm.internal.t.c(kVar, kVar2)) {
            return kVar == null ? kVar2 : kVar;
        }
        return new d(kVar, kVar2);
    }

    public static final I N(I i8, G g8) {
        I iD0 = d0(g8);
        if (iD0 != null) {
            iD0.h(Integer.MAX_VALUE);
            return iD0;
        }
        I iD = i8.d();
        iD.h(Integer.MAX_VALUE);
        iD.g(g8.c());
        kotlin.jvm.internal.t.e(iD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        g8.o(iD);
        kotlin.jvm.internal.t.e(iD, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return iD;
    }

    public static final I O(I i8, G g8, AbstractC1028k abstractC1028k) {
        I iP;
        synchronized (I()) {
            iP = P(i8, g8, abstractC1028k);
        }
        return iP;
    }

    public static final I P(I i8, G g8, AbstractC1028k abstractC1028k) {
        I iN = N(i8, g8);
        iN.c(i8);
        iN.h(abstractC1028k.f());
        return iN;
    }

    public static final void Q(AbstractC1028k abstractC1028k, G g8) {
        abstractC1028k.w(abstractC1028k.j() + 1);
        Q6.k kVarK = abstractC1028k.k();
        if (kVarK != null) {
            kVarK.invoke(g8);
        }
    }

    public static final Map R(C1020c c1020c, C1020c c1020c2, n nVar) {
        I iW;
        B0.b bVarE = c1020c2.E();
        int iF = c1020c.f();
        if (bVarE == null) {
            return null;
        }
        n nVarE = c1020c2.g().F(c1020c2.f()).E(c1020c2.F());
        Object[] objArrT = bVarE.t();
        int size = bVarE.size();
        HashMap map = null;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = objArrT[i8];
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            G g8 = (G) obj;
            I iC = g8.c();
            I iW2 = W(iC, iF, nVar);
            if (iW2 != null && (iW = W(iC, iF, nVarE)) != null && !kotlin.jvm.internal.t.c(iW2, iW)) {
                I iW3 = W(iC, c1020c2.f(), c1020c2.g());
                if (iW3 == null) {
                    V();
                    throw new C0920i();
                }
                I iS = g8.s(iW, iW2, iW3);
                if (iS == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(iW2, iS);
                map = map;
            }
        }
        return map;
    }

    public static final I S(I i8, G g8, AbstractC1028k abstractC1028k, I i9) {
        I iN;
        if (abstractC1028k.i()) {
            abstractC1028k.p(g8);
        }
        int iF = abstractC1028k.f();
        if (i9.f() == iF) {
            return i9;
        }
        synchronized (I()) {
            iN = N(i8, g8);
        }
        iN.h(iF);
        abstractC1028k.p(g8);
        return iN;
    }

    public static final boolean T(G g8) {
        I i8;
        int iE = f4004f.e(f4003e);
        I i9 = null;
        I iC = null;
        int i10 = 0;
        for (I iC2 = g8.c(); iC2 != null; iC2 = iC2.e()) {
            int iF = iC2.f();
            if (iF != 0) {
                if (iF >= iE) {
                    i10++;
                } else if (i9 == null) {
                    i10++;
                    i9 = iC2;
                } else {
                    if (iC2.f() < i9.f()) {
                        i8 = i9;
                        i9 = iC2;
                    } else {
                        i8 = iC2;
                    }
                    if (iC == null) {
                        iC = g8.c();
                        I i11 = iC;
                        while (true) {
                            if (iC == null) {
                                iC = i11;
                                break;
                            }
                            if (iC.f() >= iE) {
                                break;
                            }
                            if (i11.f() < iC.f()) {
                                i11 = iC;
                            }
                            iC = iC.e();
                        }
                    }
                    i9.h(0);
                    i9.c(iC);
                    i9 = i8;
                }
            }
        }
        return i10 > 1;
    }

    public static final void U(G g8) {
        if (T(g8)) {
            f4005g.a(g8);
        }
    }

    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final I W(I i8, int i9, n nVar) {
        I i10 = null;
        while (i8 != null) {
            if (f0(i8, i9, nVar) && (i10 == null || i10.f() < i8.f())) {
                i10 = i8;
            }
            i8 = i8.e();
        }
        if (i10 != null) {
            return i10;
        }
        return null;
    }

    public static final I X(I i8, G g8) {
        I iW;
        AbstractC1028k.a aVar = AbstractC1028k.f3974e;
        AbstractC1028k abstractC1028kD = aVar.d();
        Q6.k kVarH = abstractC1028kD.h();
        if (kVarH != null) {
            kVarH.invoke(g8);
        }
        I iW2 = W(i8, abstractC1028kD.f(), abstractC1028kD.g());
        if (iW2 != null) {
            return iW2;
        }
        synchronized (I()) {
            AbstractC1028k abstractC1028kD2 = aVar.d();
            I iC = g8.c();
            kotlin.jvm.internal.t.e(iC, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            iW = W(iC, abstractC1028kD2.f(), abstractC1028kD2.g());
            if (iW == null) {
                V();
                throw new C0920i();
            }
        }
        return iW;
    }

    public static final void Y(int i8) {
        f4004f.f(i8);
    }

    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final Object a0(AbstractC1028k abstractC1028k, Q6.k kVar) {
        Object objInvoke = kVar.invoke(f4002d.y(abstractC1028k.f()));
        synchronized (I()) {
            int i8 = f4003e;
            f4003e = i8 + 1;
            f4002d = f4002d.y(abstractC1028k.f());
            f4008j.set(new C1018a(i8, f4002d));
            abstractC1028k.d();
            f4002d = f4002d.F(i8);
            C6.G g8 = C6.G.f1419a;
        }
        return objInvoke;
    }

    public static final AbstractC1028k b0(Q6.k kVar) {
        return (AbstractC1028k) A(new e(kVar));
    }

    public static final int c0(int i8, n nVar) {
        int iA;
        int iD = nVar.D(i8);
        synchronized (I()) {
            iA = f4004f.a(iD);
        }
        return iA;
    }

    public static final I d0(G g8) {
        int iE = f4004f.e(f4003e) - 1;
        n nVarA = n.f3987e.a();
        I i8 = null;
        for (I iC = g8.c(); iC != null; iC = iC.e()) {
            if (iC.f() != 0) {
                if (f0(iC, iE, nVarA)) {
                    if (i8 == null) {
                        i8 = iC;
                    } else if (iC.f() >= i8.f()) {
                        return i8;
                    }
                }
            }
            return iC;
        }
        return null;
    }

    public static final boolean e0(int i8, int i9, n nVar) {
        return (i9 == 0 || i9 > i8 || nVar.A(i9)) ? false : true;
    }

    public static final boolean f0(I i8, int i9, n nVar) {
        return e0(i9, i8.f(), nVar);
    }

    public static final void g0(AbstractC1028k abstractC1028k) {
        int iE;
        if (f4002d.A(abstractC1028k.f())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: id=");
        sb.append(abstractC1028k.f());
        sb.append(", disposed=");
        sb.append(abstractC1028k.e());
        sb.append(", applied=");
        C1020c c1020c = abstractC1028k instanceof C1020c ? (C1020c) abstractC1028k : null;
        sb.append(c1020c != null ? Boolean.valueOf(c1020c.D()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (I()) {
            iE = f4004f.e(-1);
        }
        sb.append(iE);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final I h0(I i8, G g8, AbstractC1028k abstractC1028k) {
        if (abstractC1028k.i()) {
            abstractC1028k.p(g8);
        }
        I iW = W(i8, abstractC1028k.f(), abstractC1028k.g());
        if (iW == null) {
            V();
            throw new C0920i();
        }
        if (iW.f() == abstractC1028k.f()) {
            return iW;
        }
        I iO = O(iW, g8, abstractC1028k);
        abstractC1028k.p(g8);
        return iO;
    }

    public static final n z(n nVar, int i8, int i9) {
        while (i8 < i9) {
            nVar = nVar.F(i8);
            i8++;
        }
        return nVar;
    }

    public static final Object A(Q6.k kVar) {
        Object obj;
        B0.b bVarE;
        Object objA0;
        AbstractC1028k abstractC1028k = f4009k;
        kotlin.jvm.internal.t.e(abstractC1028k, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (I()) {
            try {
                obj = f4008j.get();
                bVarE = ((C1018a) obj).E();
                if (bVarE != null) {
                    f4010l.a(1);
                }
                objA0 = a0((AbstractC1028k) obj, kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bVarE != null) {
            try {
                List list = f4006h;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((Q6.o) list.get(i8)).invoke(bVarE, obj);
                }
                f4010l.a(-1);
            } catch (Throwable th2) {
                f4010l.a(-1);
                throw th2;
            }
        }
        synchronized (I()) {
            try {
                C();
                if (bVarE != null) {
                    Object[] objArrT = bVarE.t();
                    int size2 = bVarE.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        Object obj2 = objArrT[i9];
                        kotlin.jvm.internal.t.e(obj2, toqHM.pWLBeaEmeGAsrLp);
                        U((G) obj2);
                    }
                    C6.G g8 = C6.G.f1419a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objA0;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4011a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((n) obj);
            return C6.G.f1419a;
        }

        public final void b(n nVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4012a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((n) obj);
            return C6.G.f1419a;
        }

        public final void b(n nVar) {
        }
    }
}
