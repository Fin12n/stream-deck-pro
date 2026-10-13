package p215z0;

import B0.b;
import B0.f;
import C6.C0920i;
import C6.G;
import D6.C0933m;
import G6.g;
import J0.AbstractC1024g;
import J0.H;
import K0.c;
import Q6.o;
import X.i;
import Z.JTT.ryTuoS;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import p010b0.B;
import p010b0.u;
import p010b0.v;
import p010b0.w;
import p116m7.kKPq.toqHM;

/* JADX INFO: renamed from: z0.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3176s implements B, N0, G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3173q f38899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3149e f38900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f38901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f38902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f38903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T0 f38904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f38905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f38906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f38907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A0.a f38908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A0.a f38909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f38910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B0.a f38911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3176s f38913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C3188y f38915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C3165m f38916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f38917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f38918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f38919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f38920v;

    /* JADX INFO: renamed from: z0.s$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f38921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f38922b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f38923c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f38924d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v f38925e;

        public a(Set<L0> set) {
            this.f38921a = set;
        }

        @Override // p215z0.K0
        public void a(Function0 function0) {
            this.f38924d.add(function0);
        }

        @Override // p215z0.K0
        public void b(InterfaceC3159j interfaceC3159j) {
            this.f38923c.add(interfaceC3159j);
        }

        @Override // p215z0.K0
        public void c(InterfaceC3159j interfaceC3159j) {
            v vVarA = this.f38925e;
            if (vVarA == null) {
                vVarA = B.a();
                this.f38925e = vVarA;
            }
            vVarA.o(interfaceC3159j);
            this.f38923c.add(interfaceC3159j);
        }

        @Override // p215z0.K0
        public void d(L0 l8) {
            this.f38923c.add(l8);
        }

        @Override // p215z0.K0
        public void e(L0 l8) {
            this.f38922b.add(l8);
        }

        public final void f() {
            if (this.f38921a.isEmpty()) {
                return;
            }
            Object objA = u1.f38946a.a("Compose:abandons");
            try {
                Iterator it = this.f38921a.iterator();
                while (it.hasNext()) {
                    L0 l8 = (L0) it.next();
                    it.remove();
                    l8.b();
                }
                G g8 = G.f1419a;
            } finally {
                u1.f38946a.b(objA);
            }
        }

        public final void g() {
            if (!this.f38923c.isEmpty()) {
                Object objA = u1.f38946a.a("Compose:onForgotten");
                try {
                    v vVar = this.f38925e;
                    for (int size = this.f38923c.size() - 1; -1 < size; size--) {
                        Object obj = this.f38923c.get(size);
                        P.a(this.f38921a).remove(obj);
                        if (obj instanceof L0) {
                            ((L0) obj).c();
                        }
                        if (obj instanceof InterfaceC3159j) {
                            if (vVar == null || !vVar.a(obj)) {
                                ((InterfaceC3159j) obj).e();
                            } else {
                                ((InterfaceC3159j) obj).d();
                            }
                        }
                    }
                    G g8 = G.f1419a;
                    u1.f38946a.b(objA);
                } catch (Throwable th) {
                    u1.f38946a.b(objA);
                    throw th;
                }
            }
            if (this.f38922b.isEmpty()) {
                return;
            }
            Object objA2 = u1.f38946a.a("Compose:onRemembered");
            try {
                List list = this.f38922b;
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    L0 l8 = (L0) list.get(i8);
                    this.f38921a.remove(l8);
                    l8.d();
                }
                G g9 = G.f1419a;
            } finally {
                u1.f38946a.b(objA2);
            }
        }

        public final void h() {
            if (this.f38924d.isEmpty()) {
                return;
            }
            Object objA = u1.f38946a.a("Compose:sideeffects");
            try {
                List list = this.f38924d;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((Function0) list.get(i8)).invoke();
                }
                this.f38924d.clear();
                G g8 = G.f1419a;
            } finally {
                u1.f38946a.b(objA);
            }
        }
    }

    public C3176s(AbstractC3173q abstractC3173q, InterfaceC3149e interfaceC3149e, g gVar) {
        this.f38899a = abstractC3173q;
        this.f38900b = interfaceC3149e;
        this.f38901c = new AtomicReference(null);
        this.f38902d = new Object();
        HashSet hashSet = new HashSet();
        this.f38903e = hashSet;
        T0 t8 = new T0();
        this.f38904f = t8;
        this.f38905g = new f();
        this.f38906h = new HashSet();
        this.f38907i = new f();
        A0.a aVar = new A0.a();
        this.f38908j = aVar;
        A0.a aVar2 = new A0.a();
        this.f38909k = aVar2;
        this.f38910l = new f();
        this.f38911m = new B0.a(0, 1, null);
        this.f38915q = new C3188y(null, false, 3, null);
        C3165m c3165m = new C3165m(interfaceC3149e, abstractC3173q, t8, hashSet, aVar, aVar2, this);
        abstractC3173q.o(c3165m);
        this.f38916r = c3165m;
        this.f38917s = gVar;
        this.f38918t = abstractC3173q instanceof H0;
        this.f38920v = C3155h.f38756a.a();
    }

    public final void C() {
        long[] jArr;
        long[] jArr2;
        long j8;
        char c8;
        long j9;
        int i8;
        boolean zD;
        long[] jArr3;
        int i9;
        long j10;
        v vVar;
        u uVarD = this.f38907i.d();
        long[] jArr4 = uVarD.f15646a;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr4[i10];
                char c9 = 7;
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j11 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            c8 = c9;
                            Object obj = uVarD.f15647b[i14];
                            Object obj2 = uVarD.f15648c[i14];
                            j9 = j12;
                            if (obj2 instanceof v) {
                                t.e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                v vVar2 = (v) obj2;
                                Object[] objArr = vVar2.f15564b;
                                long[] jArr5 = vVar2.f15563a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i15 = i11;
                                    int i16 = 0;
                                    while (true) {
                                        v vVar3 = vVar2;
                                        long j13 = jArr5[i16];
                                        j8 = j11;
                                        if ((((~j13) << c8) & j13 & j9) != j9) {
                                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j13 & 255) < 128) {
                                                    jArr3 = jArr4;
                                                    int i19 = (i16 << 3) + i18;
                                                    i9 = i18;
                                                    j10 = j13;
                                                    vVar = vVar3;
                                                    if (!this.f38905g.c((E) objArr[i19])) {
                                                        vVar.q(i19);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i9 = i18;
                                                    j10 = j13;
                                                    vVar = vVar3;
                                                }
                                                i18 = i9 + 1;
                                                vVar3 = vVar;
                                                jArr4 = jArr3;
                                                j13 = j10 >> i15;
                                            }
                                            jArr2 = jArr4;
                                            vVar2 = vVar3;
                                            if (i17 != i15) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            vVar2 = vVar3;
                                        }
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        j11 = j8;
                                        jArr4 = jArr2;
                                        i15 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j8 = j11;
                                }
                                zD = vVar2.d();
                            } else {
                                jArr2 = jArr4;
                                j8 = j11;
                                t.e(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                zD = !this.f38905g.c((E) obj2);
                            }
                            if (zD) {
                                uVarD.o(i14);
                            }
                            i8 = 8;
                        } else {
                            jArr2 = jArr4;
                            j8 = j11;
                            c8 = c9;
                            j9 = j12;
                            i8 = i11;
                        }
                        j11 = j8 >> i8;
                        i13++;
                        i11 = i8;
                        c9 = c8;
                        j12 = j9;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr4 = jArr;
            }
        }
        if (this.f38906h.isEmpty()) {
            return;
        }
        Iterator it = this.f38906h.iterator();
        while (it.hasNext()) {
            if (!((E0) it.next()).u()) {
                it.remove();
            }
        }
    }

    public final void D(o oVar) {
        if (this.f38919u) {
            throw new IllegalStateException("The composition is disposed");
        }
        this.f38920v = oVar;
        this.f38899a.a(this, oVar);
    }

    public final void F() {
        Object andSet = this.f38901c.getAndSet(null);
        if (t.c(andSet, AbstractC3178t.f38928a)) {
            return;
        }
        if (andSet instanceof Set) {
            A((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                A(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC3169o.v("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new C0920i();
        }
        AbstractC3169o.v("corrupt pendingModifications drain: " + this.f38901c);
        throw new C0920i();
    }

    public final boolean G() {
        return this.f38916r.z0();
    }

    public final C3188y H() {
        return this.f38915q;
    }

    public final U I(E0 e8, C3147d c3147d, Object obj) {
        synchronized (this.f38902d) {
            try {
                C3176s c3176s = this.f38913o;
                if (c3176s == null || !this.f38904f.I(this.f38914p, c3147d)) {
                    c3176s = null;
                }
                if (c3176s == null) {
                    if (O(e8, obj)) {
                        return U.IMMINENT;
                    }
                    if (obj == null) {
                        this.f38911m.j(e8, null);
                    } else {
                        AbstractC3178t.e(this.f38911m, e8, obj);
                    }
                }
                if (c3176s != null) {
                    return c3176s.I(e8, c3147d, obj);
                }
                this.f38899a.k(this);
                return m() ? U.DEFERRED : U.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J(Object obj) {
        Object objB = this.f38905g.d().b(obj);
        if (objB == null) {
            return;
        }
        if (!(objB instanceof v)) {
            E0 e8 = (E0) objB;
            if (e8.t(obj) == U.IMMINENT) {
                this.f38910l.a(obj, e8);
                return;
            }
            return;
        }
        v vVar = (v) objB;
        Object[] objArr = vVar.f15564b;
        long[] jArr = vVar.f15563a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        E0 e9 = (E0) objArr[(i8 << 3) + i10];
                        if (e9.t(obj) == U.IMMINENT) {
                            this.f38910l.a(obj, e9);
                        }
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final c K() {
        C3188y c3188y = this.f38915q;
        if (c3188y.b()) {
            c3188y.a();
            return null;
        }
        C3188y c3188yI = this.f38899a.i();
        if (c3188yI != null) {
            c3188yI.a();
        }
        c3188y.a();
        if (!t.c(null, null)) {
            c3188y.c(null);
        }
        return null;
    }

    public final void L(E e8) {
        if (this.f38905g.c(e8)) {
            return;
        }
        this.f38907i.f(e8);
    }

    public final void M(Object obj, E0 e8) {
        this.f38905g.e(obj, e8);
    }

    public final B0.a N() {
        B0.a aVar = this.f38911m;
        this.f38911m = new B0.a(0, 1, null);
        return aVar;
    }

    public final boolean O(E0 e8, Object obj) {
        return m() && this.f38916r.l1(e8, obj);
    }

    @Override // p215z0.B, p215z0.G0
    public void a(Object obj) {
        E0 e0B0;
        if (G() || (e0B0 = this.f38916r.B0()) == null) {
            return;
        }
        e0B0.H(true);
        if (e0B0.w(obj)) {
            return;
        }
        if (obj instanceof H) {
            ((H) obj).q(AbstractC1024g.a(1));
        }
        this.f38905g.a(obj, e0B0);
        if (!(obj instanceof E)) {
            return;
        }
        this.f38907i.f(obj);
        w wVarB = ((E) obj).z().b();
        Object[] objArr = wVarB.f15641b;
        long[] jArr = wVarB.f15640a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        J0.G g8 = (J0.G) objArr[(i8 << 3) + i10];
                        if (g8 instanceof H) {
                            ((H) g8).q(AbstractC1024g.a(1));
                        }
                        this.f38907i.a(g8, obj);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    @Override // p215z0.B
    public void b(o oVar) throws Exception {
        try {
            synchronized (this.f38902d) {
                E();
                B0.a aVarN = N();
                try {
                    K();
                    this.f38916r.i0(aVarN, oVar);
                } catch (Exception e8) {
                    this.f38911m = aVarN;
                    throw e8;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f38903e.isEmpty()) {
                    new a(this.f38903e).f();
                }
                throw th;
            } catch (Exception e9) {
                w();
                throw e9;
            }
        }
    }

    @Override // p215z0.G0
    public U c(E0 e8, Object obj) {
        C3176s c3176s;
        if (e8.l()) {
            e8.C(true);
        }
        C3147d c3147dJ = e8.j();
        if (c3147dJ == null || !c3147dJ.b()) {
            return U.IGNORED;
        }
        if (this.f38904f.L(c3147dJ)) {
            return !e8.k() ? U.IGNORED : I(e8, c3147dJ, obj);
        }
        synchronized (this.f38902d) {
            c3176s = this.f38913o;
        }
        return (c3176s == null || !c3176s.O(e8, obj)) ? U.IGNORED : U.IMMINENT;
    }

    @Override // p215z0.InterfaceC3171p
    public void d() {
        synchronized (this.f38902d) {
            try {
                if (this.f38916r.K0()) {
                    throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f38919u) {
                    boolean z8 = true;
                    this.f38919u = true;
                    this.f38920v = C3155h.f38756a.b();
                    A0.a aVarC0 = this.f38916r.C0();
                    if (aVarC0 != null) {
                        B(aVarC0);
                    }
                    if (this.f38904f.A() <= 0) {
                        z8 = false;
                    }
                    if (z8 || !this.f38903e.isEmpty()) {
                        a aVar = new a(this.f38903e);
                        if (z8) {
                            this.f38900b.e();
                            W0 w0K = this.f38904f.K();
                            try {
                                AbstractC3169o.Q(w0K, aVar);
                                G g8 = G.f1419a;
                                w0K.L();
                                this.f38900b.clear();
                                this.f38900b.i();
                                aVar.g();
                            } catch (Throwable th) {
                                w0K.L();
                                throw th;
                            }
                        }
                        aVar.f();
                    }
                    this.f38916r.o0();
                }
                G g9 = G.f1419a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38899a.s(this);
    }

    @Override // p215z0.N0
    public void deactivate() {
        boolean z8 = this.f38904f.A() > 0;
        if (z8 || !this.f38903e.isEmpty()) {
            u1 u1Var = u1.f38946a;
            Object objA = u1Var.a("Compose:deactivate");
            try {
                a aVar = new a(this.f38903e);
                if (z8) {
                    this.f38900b.e();
                    W0 w0K = this.f38904f.K();
                    try {
                        AbstractC3169o.w(w0K, aVar);
                        G g8 = G.f1419a;
                        w0K.L();
                        this.f38900b.i();
                        aVar.g();
                    } catch (Throwable th) {
                        w0K.L();
                        throw th;
                    }
                }
                aVar.f();
                G g9 = G.f1419a;
                u1Var.b(objA);
            } catch (Throwable th2) {
                u1.f38946a.b(objA);
                throw th2;
            }
        }
        this.f38905g.b();
        this.f38907i.b();
        this.f38911m.a();
        this.f38908j.a();
        this.f38916r.n0();
    }

    @Override // p215z0.B
    public boolean e(Set set) {
        if (!(set instanceof b)) {
            for (Object obj : set) {
                if (this.f38905g.c(obj) || this.f38907i.c(obj)) {
                    return true;
                }
            }
            return false;
        }
        b bVar = (b) set;
        Object[] objArrT = bVar.t();
        int size = bVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj2 = objArrT[i8];
            t.e(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.f38905g.c(obj2) || this.f38907i.c(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p215z0.B
    public void f() {
        synchronized (this.f38902d) {
            try {
                if (this.f38909k.d()) {
                    B(this.f38909k);
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f38903e.isEmpty()) {
                            new a(this.f38903e).f();
                        }
                        throw th;
                    } catch (Exception e8) {
                        w();
                        throw e8;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p215z0.InterfaceC3171p
    public boolean g() {
        return this.f38919u;
    }

    @Override // p215z0.B
    public void h(Function0 function0) {
        this.f38916r.P0(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p215z0.B
    public void i(Set set) {
        Object obj;
        Object objA;
        do {
            obj = this.f38901c.get();
            if (obj == null ? true : t.c(obj, AbstractC3178t.f38928a)) {
                objA = set;
            } else if (obj instanceof Set) {
                objA = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f38901c).toString());
                }
                t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objA = C0933m.A((Set[]) obj, set);
            }
        } while (!i.a(this.f38901c, obj, objA));
        if (obj == null) {
            synchronized (this.f38902d) {
                F();
                G g8 = G.f1419a;
            }
        }
    }

    @Override // p215z0.G0
    public void j(E0 e8) {
        this.f38912n = true;
    }

    @Override // p215z0.N0
    public void k(o oVar) {
        this.f38916r.j1();
        D(oVar);
        this.f38916r.t0();
    }

    @Override // p215z0.B
    public void l() {
        synchronized (this.f38902d) {
            try {
                B(this.f38908j);
                F();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f38903e.isEmpty()) {
                            new a(this.f38903e).f();
                        }
                        throw th;
                    } catch (Exception e8) {
                        w();
                        throw e8;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p215z0.B
    public boolean m() {
        return this.f38916r.K0();
    }

    @Override // p215z0.B
    public void n(List list) throws Exception {
        int size = list.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z8 = true;
                break;
            } else if (!t.c(((C3156h0) ((C6.o) list.get(i8)).c()).b(), this)) {
                break;
            } else {
                i8++;
            }
        }
        AbstractC3169o.U(z8);
        try {
            this.f38916r.H0(list);
            G g8 = G.f1419a;
        } catch (Throwable th) {
            try {
                if (!this.f38903e.isEmpty()) {
                    new a(this.f38903e).f();
                }
                throw th;
            } catch (Exception e8) {
                w();
                throw e8;
            }
        }
    }

    @Override // p215z0.InterfaceC3171p
    public void o(o oVar) {
        D(oVar);
    }

    @Override // p215z0.B
    public void p(C3154g0 c3154g0) {
        a aVar = new a(this.f38903e);
        W0 w0K = c3154g0.a().K();
        try {
            AbstractC3169o.Q(w0K, aVar);
            G g8 = G.f1419a;
            w0K.L();
            aVar.g();
        } catch (Throwable th) {
            w0K.L();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060, B:25:0x0065), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EDGE_INSN: B:33:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    @Override // p215z0.B
    public void q(Object obj) {
        synchronized (this.f38902d) {
            try {
                J(obj);
                Object objB = this.f38907i.d().b(obj);
                if (objB != null) {
                    if (objB instanceof v) {
                        v vVar = (v) objB;
                        Object[] objArr = vVar.f15564b;
                        long[] jArr = vVar.f15563a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j8 = jArr[i8];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i8 != length) {
                                        break;
                                        break;
                                    }
                                    i8++;
                                } else {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((255 & j8) < 128) {
                                            J((E) objArr[(i8 << 3) + i10]);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i9 != 8) {
                                        break;
                                    } else if (i8 != length) {
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                        }
                    } else {
                        J((E) objB);
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p215z0.InterfaceC3171p
    public boolean r() {
        boolean z8;
        synchronized (this.f38902d) {
            z8 = this.f38911m.g() > 0;
        }
        return z8;
    }

    @Override // p215z0.B
    public Object s(B b8, int i8, Function0 function0) {
        if (b8 == null || t.c(b8, this) || i8 < 0) {
            return function0.invoke();
        }
        this.f38913o = (C3176s) b8;
        this.f38914p = i8;
        try {
            return function0.invoke();
        } finally {
            this.f38913o = null;
            this.f38914p = 0;
        }
    }

    @Override // p215z0.B
    public void t() {
        synchronized (this.f38902d) {
            try {
                this.f38916r.f0();
                if (!this.f38903e.isEmpty()) {
                    new a(this.f38903e).f();
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f38903e.isEmpty()) {
                            new a(this.f38903e).f();
                        }
                        throw th;
                    } catch (Exception e8) {
                        w();
                        throw e8;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p215z0.B
    public boolean u() {
        boolean zQ0;
        synchronized (this.f38902d) {
            try {
                E();
                try {
                    B0.a aVarN = N();
                    try {
                        K();
                        zQ0 = this.f38916r.Q0(aVarN);
                        if (!zQ0) {
                            F();
                        }
                    } catch (Exception e8) {
                        this.f38911m = aVarN;
                        throw e8;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f38903e.isEmpty()) {
                            new a(this.f38903e).f();
                        }
                        throw th;
                    } catch (Exception e9) {
                        w();
                        throw e9;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zQ0;
    }

    @Override // p215z0.B
    public void v() {
        synchronized (this.f38902d) {
            try {
                for (Object obj : this.f38904f.D()) {
                    E0 e8 = obj instanceof E0 ? (E0) obj : null;
                    if (e8 != null) {
                        e8.invalidate();
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w() {
        this.f38901c.set(null);
        this.f38908j.a();
        this.f38909k.a();
        this.f38903e.clear();
    }

    public final HashSet z(HashSet hashSet, Object obj, boolean z8) {
        Object objB = this.f38905g.d().b(obj);
        if (objB != null) {
            if (objB instanceof v) {
                v vVar = (v) objB;
                Object[] objArr = vVar.f15564b;
                long[] jArr = vVar.f15563a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    HashSet hashSet2 = hashSet;
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j8) < 128) {
                                    E0 e8 = (E0) objArr[(i8 << 3) + i10];
                                    if (!this.f38910l.e(obj, e8) && e8.t(obj) != U.IGNORED) {
                                        if (!e8.u() || z8) {
                                            if (hashSet2 == null) {
                                                hashSet2 = new HashSet();
                                            }
                                            hashSet2.add(e8);
                                        } else {
                                            this.f38906h.add(e8);
                                        }
                                    }
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                return hashSet2;
                            }
                        }
                        if (i8 == length) {
                            return hashSet2;
                        }
                        i8++;
                    }
                }
            } else {
                E0 e9 = (E0) objB;
                if (!this.f38910l.e(obj, e9) && e9.t(obj) != U.IGNORED) {
                    if (e9.u() && !z8) {
                        this.f38906h.add(e9);
                        return hashSet;
                    }
                    HashSet hashSet3 = hashSet == null ? new HashSet() : hashSet;
                    hashSet3.add(e9);
                    return hashSet3;
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x00a1 A[EDGE_INSN: B:182:0x00a1->B:28:0x00a1 BREAK  A[LOOP:1: B:16:0x0064->B:26:0x0098], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0215 A[EDGE_INSN: B:192:0x0215->B:97:0x0215 BREAK  A[LOOP:5: B:78:0x01b6->B:95:0x0208], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x014e A[EDGE_INSN: B:215:0x014e->B:58:0x014e BREAK  A[LOOP:12: B:47:0x011c->B:57:0x014b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[DONT_INVERT, PHI: r5
      0x0096: PHI (r5v19 java.util.HashSet) = (r5v18 java.util.HashSet), (r5v20 java.util.HashSet) binds: [B:17:0x0070, B:24:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0098 A[LOOP:1: B:16:0x0064->B:26:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0149 A[DONT_INVERT, PHI: r4
      0x0149: PHI (r4v4 java.util.HashSet) = (r4v3 java.util.HashSet), (r4v5 java.util.HashSet) binds: [B:48:0x0126, B:55:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x014b A[LOOP:12: B:47:0x011c->B:57:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0208 A[LOOP:5: B:78:0x01b6->B:95:0x0208, LOOP_END] */
    public final void A(Set set, boolean z8) {
        long j8;
        long j9;
        char c8;
        long j10;
        HashSet hashSetZ;
        String str;
        long[] jArr;
        long[] jArr2;
        long j11;
        boolean zContains;
        long[] jArr3;
        long j12;
        long[] jArr4;
        long[] jArr5;
        long j13;
        int i8;
        int i9;
        boolean z9;
        boolean zD;
        long j14;
        int i10;
        int i11 = 8;
        Object obj = null;
        if (set instanceof b) {
            b bVar = (b) set;
            Object[] objArrT = bVar.t();
            int size = bVar.size();
            hashSetZ = null;
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = objArrT[i12];
                t.e(obj2, toqHM.NPsbZUzU);
                if (obj2 instanceof E0) {
                    ((E0) obj2).t(obj);
                    i12 = i12;
                } else {
                    HashSet hashSetZ2 = z(hashSetZ, obj2, z8);
                    Object objB = this.f38907i.d().b(obj2);
                    if (objB != null) {
                        if (objB instanceof v) {
                            v vVar = (v) objB;
                            Object[] objArr = vVar.f15564b;
                            long[] jArr6 = vVar.f15563a;
                            int length = jArr6.length - 2;
                            if (length >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j15 = jArr6[i13];
                                    i12 = i12;
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j15 & 255) < 128) {
                                                hashSetZ2 = z(hashSetZ2, (E) objArr[(i13 << 3) + i15], z8);
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length) {
                                            break;
                                        }
                                        i13++;
                                        i12 = i12;
                                    } else if (i13 != length) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i12 = i12;
                                    }
                                }
                            }
                            hashSetZ = hashSetZ2;
                        } else {
                            i12 = i12;
                            hashSetZ = z(hashSetZ2, (E) objB, z8);
                        }
                    }
                    hashSetZ = hashSetZ2;
                }
                i12++;
                obj = null;
            }
            j8 = 128;
            j9 = 255;
            c8 = 7;
            j10 = -9187201950435737472L;
        } else {
            j8 = 128;
            j9 = 255;
            c8 = 7;
            j10 = -9187201950435737472L;
            hashSetZ = null;
            for (Object obj3 : set) {
                if (obj3 instanceof E0) {
                    ((E0) obj3).t(null);
                } else {
                    HashSet hashSetZ3 = z(hashSetZ, obj3, z8);
                    Object objB2 = this.f38907i.d().b(obj3);
                    if (objB2 != null) {
                        if (objB2 instanceof v) {
                            v vVar2 = (v) objB2;
                            Object[] objArr2 = vVar2.f15564b;
                            long[] jArr7 = vVar2.f15563a;
                            int length2 = jArr7.length - 2;
                            if (length2 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j16 = jArr7[i16];
                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length2) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j16 & 255) < 128) {
                                                hashSetZ3 = z(hashSetZ3, (E) objArr2[(i16 << 3) + i18], z8);
                                            }
                                            j16 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        } else if (i16 != length2) {
                                            break;
                                        } else {
                                            i16++;
                                        }
                                    }
                                }
                            }
                        } else {
                            hashSetZ = z(hashSetZ3, (E) objB2, z8);
                        }
                    }
                    hashSetZ = hashSetZ3;
                }
            }
        }
        String str2 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
        if (!z8 || this.f38906h.isEmpty()) {
            boolean z10 = true;
            if (hashSetZ != null) {
                u uVarD = this.f38905g.d();
                long[] jArr8 = uVarD.f15646a;
                int length3 = jArr8.length - 2;
                if (length3 >= 0) {
                    int i19 = 0;
                    while (true) {
                        long j17 = jArr8[i19];
                        if ((((~j17) << c8) & j17 & j10) != j10) {
                            int i20 = 8 - ((~(i19 - length3)) >>> 31);
                            int i21 = 0;
                            while (i21 < i20) {
                                if ((j17 & j9) < j8 ? z10 : false) {
                                    int i22 = (i19 << 3) + i21;
                                    Object obj4 = uVarD.f15647b[i22];
                                    Object obj5 = uVarD.f15648c[i22];
                                    if (obj5 instanceof v) {
                                        t.e(obj5, str2);
                                        v vVar3 = (v) obj5;
                                        Object[] objArr3 = vVar3.f15564b;
                                        long[] jArr9 = vVar3.f15563a;
                                        int length4 = jArr9.length - 2;
                                        if (length4 >= 0) {
                                            j11 = j17;
                                            int i23 = 0;
                                            while (true) {
                                                long j18 = jArr9[i23];
                                                long[] jArr10 = jArr9;
                                                Object[] objArr4 = objArr3;
                                                if ((((~j18) << c8) & j18 & j10) != j10) {
                                                    int i24 = 8 - ((~(i23 - length4)) >>> 31);
                                                    int i25 = 0;
                                                    while (i25 < i24) {
                                                        if ((j18 & j9) < j8) {
                                                            jArr3 = jArr8;
                                                            int i26 = (i23 << 3) + i25;
                                                            j12 = j18;
                                                            if (hashSetZ.contains((E0) objArr4[i26])) {
                                                                vVar3.q(i26);
                                                            }
                                                        } else {
                                                            jArr3 = jArr8;
                                                            j12 = j18;
                                                        }
                                                        i25++;
                                                        jArr8 = jArr3;
                                                        j18 = j12 >> 8;
                                                    }
                                                    jArr2 = jArr8;
                                                    if (i24 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr2 = jArr8;
                                                }
                                                if (i23 == length4) {
                                                    break;
                                                }
                                                i23++;
                                                objArr3 = objArr4;
                                                jArr9 = jArr10;
                                                jArr8 = jArr2;
                                            }
                                        } else {
                                            jArr2 = jArr8;
                                            j11 = j17;
                                        }
                                        zContains = vVar3.d();
                                    } else {
                                        jArr2 = jArr8;
                                        j11 = j17;
                                        t.e(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                        zContains = hashSetZ.contains((E0) obj5);
                                    }
                                    if (zContains) {
                                        uVarD.o(i22);
                                    }
                                } else {
                                    str2 = str2;
                                    jArr2 = jArr8;
                                    j11 = j17;
                                }
                                i21++;
                                z10 = true;
                                j17 = j11 >> 8;
                                str2 = str2;
                                jArr8 = jArr2;
                            }
                            str = str2;
                            jArr = jArr8;
                            if (i20 != 8) {
                                break;
                            }
                        } else {
                            str = str2;
                            jArr = jArr8;
                        }
                        if (i19 == length3) {
                            break;
                        }
                        i19++;
                        z10 = true;
                        str2 = str;
                        jArr8 = jArr;
                    }
                }
                C();
                G g8 = G.f1419a;
                return;
            }
            return;
        }
        u uVarD2 = this.f38905g.d();
        long[] jArr11 = uVarD2.f15646a;
        int length5 = jArr11.length - 2;
        if (length5 >= 0) {
            int i27 = 0;
            while (true) {
                long j19 = jArr11[i27];
                if ((((~j19) << c8) & j19 & j10) != j10) {
                    int i28 = 8 - ((~(i27 - length5)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j19 & j9) < j8) {
                            int i30 = (i27 << 3) + i29;
                            Object obj6 = uVarD2.f15647b[i30];
                            Object obj7 = uVarD2.f15648c[i30];
                            int i31 = i11;
                            if (obj7 instanceof v) {
                                t.e(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                v vVar4 = (v) obj7;
                                Object[] objArr5 = vVar4.f15564b;
                                long[] jArr12 = vVar4.f15563a;
                                jArr5 = jArr11;
                                int length6 = jArr12.length - 2;
                                if (length6 >= 0) {
                                    j13 = j19;
                                    int i32 = 0;
                                    while (true) {
                                        long j20 = jArr12[i32];
                                        Object[] objArr6 = objArr5;
                                        i8 = i29;
                                        if ((((~j20) << c8) & j20 & j10) == j10) {
                                            if (i32 != length6) {
                                                break;
                                                break;
                                            }
                                            i32++;
                                            i29 = i8;
                                            objArr5 = objArr6;
                                            i31 = 8;
                                        } else {
                                            int i33 = 8 - ((~(i32 - length6)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j20 & j9) < j8) {
                                                    j14 = j20;
                                                    int i35 = (i32 << 3) + i34;
                                                    E0 e8 = (E0) objArr6[i35];
                                                    i10 = i34;
                                                    if (this.f38906h.contains(e8) || (hashSetZ != null && hashSetZ.contains(e8))) {
                                                        vVar4.q(i35);
                                                    }
                                                } else {
                                                    j14 = j20;
                                                    i10 = i34;
                                                }
                                                j20 = j14 >> i31;
                                                i34 = i10 + 1;
                                            }
                                            if (i33 != i31) {
                                                break;
                                            }
                                            if (i32 != length6) {
                                                break;
                                            }
                                            i32++;
                                            i29 = i8;
                                            objArr5 = objArr6;
                                            i31 = 8;
                                        }
                                    }
                                } else {
                                    j13 = j19;
                                    i8 = i29;
                                }
                                zD = vVar4.d();
                            } else {
                                jArr5 = jArr11;
                                j13 = j19;
                                i8 = i29;
                                t.e(obj7, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                E0 e9 = (E0) obj7;
                                if (this.f38906h.contains(e9)) {
                                    z9 = true;
                                } else {
                                    if (hashSetZ != null) {
                                        z9 = true;
                                        if (hashSetZ.contains(e9)) {
                                        }
                                    }
                                    zD = false;
                                }
                                zD = z9;
                            }
                            if (zD) {
                                uVarD2.o(i30);
                            }
                            i9 = 8;
                        } else {
                            jArr5 = jArr11;
                            j13 = j19;
                            i8 = i29;
                            i9 = i11;
                        }
                        i11 = i9;
                        i29 = i8 + 1;
                        j19 = j13 >> i9;
                        jArr11 = jArr5;
                    }
                    jArr4 = jArr11;
                    if (i28 != i11) {
                        break;
                    }
                } else {
                    jArr4 = jArr11;
                }
                if (i27 == length5) {
                    break;
                }
                i27++;
                jArr11 = jArr4;
                i11 = 8;
            }
        }
        this.f38906h.clear();
        C();
    }

    public final void B(A0.a aVar) throws Throwable {
        a aVar2;
        long[] jArr;
        a aVar3;
        long[] jArr2;
        long j8;
        char c8;
        long j9;
        int i8;
        boolean zD;
        long[] jArr3;
        a aVar4 = new a(this.f38903e);
        try {
            if (aVar.c()) {
                if (this.f38909k.c()) {
                    aVar4.f();
                    return;
                }
                return;
            }
            try {
                u1 u1Var = u1.f38946a;
                Object objA = u1Var.a("Compose:applyChanges");
                try {
                    this.f38900b.e();
                    W0 w0K = this.f38904f.K();
                    try {
                        aVar.b(this.f38900b, w0K, aVar4);
                        G g8 = G.f1419a;
                        w0K.L();
                        this.f38900b.i();
                        u1Var.b(objA);
                        aVar4.g();
                        aVar4.h();
                        if (this.f38912n) {
                            Object objA2 = u1Var.a("Compose:unobserve");
                            int i9 = 0;
                            try {
                                this.f38912n = false;
                                u uVarD = this.f38905g.d();
                                long[] jArr4 = uVarD.f15646a;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j10 = jArr4[i10];
                                        char c9 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8;
                                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                                            int i13 = i9;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < 128) {
                                                    int i14 = (i10 << 3) + i13;
                                                    c8 = c9;
                                                    Object obj = uVarD.f15647b[i14];
                                                    Object obj2 = uVarD.f15648c[i14];
                                                    j9 = j11;
                                                    if (obj2 instanceof v) {
                                                        t.e(obj2, ryTuoS.FtfFmhagGP);
                                                        v vVar = (v) obj2;
                                                        Object[] objArr = vVar.f15564b;
                                                        long[] jArr5 = vVar.f15563a;
                                                        int i15 = i11;
                                                        int length2 = jArr5.length - 2;
                                                        aVar3 = aVar4;
                                                        if (length2 >= 0) {
                                                            j8 = j10;
                                                            int i16 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr5[i16];
                                                                    Object[] objArr2 = objArr;
                                                                    long[] jArr6 = jArr5;
                                                                    if ((((~j12) << c8) & j12 & j9) != j9) {
                                                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                                        int i18 = 0;
                                                                        while (i18 < i17) {
                                                                            if ((j12 & 255) < 128) {
                                                                                jArr3 = jArr4;
                                                                                int i19 = (i16 << 3) + i18;
                                                                                if (!((E0) objArr2[i19]).s()) {
                                                                                    vVar.q(i19);
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr4;
                                                                            }
                                                                            j12 >>= i15;
                                                                            i18++;
                                                                            jArr4 = jArr3;
                                                                        }
                                                                        jArr2 = jArr4;
                                                                        if (i17 != i15) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr2 = jArr4;
                                                                    }
                                                                    if (i16 == length2) {
                                                                        break;
                                                                    }
                                                                    i16++;
                                                                    objArr = objArr2;
                                                                    jArr5 = jArr6;
                                                                    jArr4 = jArr2;
                                                                    i15 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    u1.f38946a.b(objA2);
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j8 = j10;
                                                        }
                                                        zD = vVar.d();
                                                    } else {
                                                        aVar3 = aVar4;
                                                        jArr2 = jArr4;
                                                        j8 = j10;
                                                        t.e(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                                        zD = !((E0) obj2).s();
                                                    }
                                                    if (zD) {
                                                        uVarD.o(i14);
                                                    }
                                                    i8 = 8;
                                                } else {
                                                    aVar3 = aVar4;
                                                    jArr2 = jArr4;
                                                    j8 = j10;
                                                    c8 = c9;
                                                    j9 = j11;
                                                    i8 = i11;
                                                }
                                                j10 = j8 >> i8;
                                                i13++;
                                                i11 = i8;
                                                c9 = c8;
                                                j11 = j9;
                                                aVar4 = aVar3;
                                                jArr4 = jArr2;
                                            }
                                            aVar2 = aVar4;
                                            jArr = jArr4;
                                            if (i12 != i11) {
                                                break;
                                            }
                                        } else {
                                            aVar2 = aVar4;
                                            jArr = jArr4;
                                        }
                                        if (i10 == length) {
                                            break;
                                        }
                                        i10++;
                                        aVar4 = aVar2;
                                        jArr4 = jArr;
                                        i9 = 0;
                                    }
                                } else {
                                    aVar2 = aVar4;
                                }
                                C();
                                G g9 = G.f1419a;
                                u1.f38946a.b(objA2);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            aVar2 = aVar4;
                        }
                        if (this.f38909k.c()) {
                            aVar2.f();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        try {
                            w0K.L();
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            u1.f38946a.b(objA);
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (this.f38909k.c()) {
            aVar4.f();
        }
        throw th;
    }

    public final void E() {
        Object andSet = this.f38901c.getAndSet(AbstractC3178t.f38928a);
        if (andSet != null) {
            if (t.c(andSet, AbstractC3178t.f38928a)) {
                AbstractC3169o.v("pending composition has not been applied");
                throw new C0920i();
            }
            if (andSet instanceof Set) {
                A((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC3169o.v(ajyWhveMDgQ.REfLwPbVjc + this.f38901c);
                throw new C0920i();
            }
            for (Set set : (Set[]) andSet) {
                A(set, true);
            }
        }
    }

    public /* synthetic */ C3176s(AbstractC3173q abstractC3173q, InterfaceC3149e interfaceC3149e, g gVar, int i8, AbstractC2633k abstractC2633k) {
        this(abstractC3173q, interfaceC3149e, (i8 & 4) != 0 ? null : gVar);
    }
}
