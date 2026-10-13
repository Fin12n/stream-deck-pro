package p017b7;

import C6.C0920i;
import F1.b;
import G6.d;
import G6.g;
import H6.c;
import I6.e;
import Q6.k;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;
import p062g7.C2372k;
import p062g7.D;
import p062g7.G;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: renamed from: b7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C1797m extends W implements InterfaceC1795l, e, b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15968f = AtomicIntegerFieldUpdater.newUpdater(C1797m.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15969g = AtomicReferenceFieldUpdater.newUpdater(C1797m.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15970h = AtomicReferenceFieldUpdater.newUpdater(C1797m.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f15971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f15972e;

    public C1797m(d<Object> dVar, int i8) {
        super(i8);
        this.f15971d = dVar;
        this.f15972e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1779d.f15944a;
    }

    public static /* synthetic */ void P(C1797m c1797m, Object obj, int i8, k kVar, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i9 & 4) != 0) {
            kVar = null;
        }
        c1797m.O(obj, i8, kVar);
    }

    public final InterfaceC1776b0 A() {
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) getContext().A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 == null) {
            return null;
        }
        InterfaceC1776b0 interfaceC1776b0O = B0.o(interfaceC1815v0, true, false, new C1805q(this), 2, null);
        b.a(f15970h, this, null, interfaceC1776b0O);
        return interfaceC1776b0O;
    }

    public final void B(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15969g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C1779d)) {
                if (obj2 instanceof InterfaceC1793k ? true : obj2 instanceof D) {
                    H(obj, obj2);
                } else {
                    if (obj2 instanceof C1822z) {
                        C1822z c1822z = (C1822z) obj2;
                        if (!c1822z.c()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof C1803p) {
                            Throwable th = c1822z.f15995a;
                            if (obj instanceof InterfaceC1793k) {
                                j((InterfaceC1793k) obj, th);
                                return;
                            } else {
                                t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                l((D) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C1820y) {
                        C1820y c1820y = (C1820y) obj2;
                        if (c1820y.f15989b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof D) {
                            return;
                        }
                        t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        InterfaceC1793k interfaceC1793k = (InterfaceC1793k) obj;
                        if (c1820y.c()) {
                            j(interfaceC1793k, c1820y.f15992e);
                            return;
                        } else {
                            if (b.a(f15969g, this, obj2, C1820y.b(c1820y, null, interfaceC1793k, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof D) {
                            return;
                        }
                        t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (b.a(f15969g, this, obj2, new C1820y(obj2, (InterfaceC1793k) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (b.a(f15969g, this, obj2, obj)) {
                return;
            }
        }
    }

    @Override // p017b7.InterfaceC1795l
    public void C(F f8, Object obj) {
        d dVar = this.f15971d;
        C2372k c2372k = dVar instanceof C2372k ? (C2372k) dVar : null;
        P(this, obj, (c2372k != null ? c2372k.f23844d : null) == f8 ? 4 : this.f15923c, null, 4, null);
    }

    public final void D(InterfaceC1793k interfaceC1793k) {
        B(interfaceC1793k);
    }

    public final boolean E() {
        if (!X.c(this.f15923c)) {
            return false;
        }
        d dVar = this.f15971d;
        t.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2372k) dVar).n();
    }

    @Override // p017b7.InterfaceC1795l
    public Object F(Object obj, Object obj2, k kVar) {
        return S(obj, obj2, kVar);
    }

    @Override // p017b7.InterfaceC1795l
    public void G(Object obj, k kVar) {
        O(obj, this.f15923c, kVar);
    }

    public String I() {
        return "CancellableContinuation";
    }

    @Override // p017b7.InterfaceC1795l
    public void J(k kVar) {
        AbstractC1801o.c(this, new InterfaceC1793k.a(kVar));
    }

    @Override // p017b7.InterfaceC1795l
    public void K(Object obj) {
        p(this.f15923c);
    }

    public final void L(Throwable th) {
        if (m(th)) {
            return;
        }
        f(th);
        o();
    }

    public final void M() {
        Throwable thQ;
        d dVar = this.f15971d;
        C2372k c2372k = dVar instanceof C2372k ? (C2372k) dVar : null;
        if (c2372k == null || (thQ = c2372k.q(this)) == null) {
            return;
        }
        n();
        f(thQ);
    }

    public final boolean N() {
        Object obj = f15969g.get(this);
        if ((obj instanceof C1820y) && ((C1820y) obj).f15991d != null) {
            n();
            return false;
        }
        f15968f.set(this, 536870911);
        f15969g.set(this, C1779d.f15944a);
        return true;
    }

    public final void O(Object obj, int i8, k kVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15969g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof L0)) {
                Object obj3 = obj;
                k kVar2 = kVar;
                if (obj2 instanceof C1803p) {
                    C1803p c1803p = (C1803p) obj2;
                    if (c1803p.e()) {
                        if (kVar2 != null) {
                            k(kVar2, c1803p.f15995a);
                            return;
                        }
                        return;
                    }
                }
                i(obj3);
                throw new C0920i();
            }
            Object obj4 = obj;
            int i9 = i8;
            k kVar3 = kVar;
            if (b.a(f15969g, this, obj2, Q((L0) obj2, obj4, i9, kVar3, null))) {
                o();
                p(i9);
                return;
            } else {
                obj = obj4;
                i8 = i9;
                kVar = kVar3;
            }
        }
    }

    public final Object Q(L0 l8, Object obj, int i8, k kVar, Object obj2) {
        if (obj instanceof C1822z) {
            return obj;
        }
        if ((X.b(i8) || obj2 != null) && !(kVar == null && !(l8 instanceof InterfaceC1793k) && obj2 == null)) {
            return new C1820y(obj, l8 instanceof InterfaceC1793k ? (InterfaceC1793k) l8 : null, kVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean R() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15968f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f15968f.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
        return true;
    }

    public final G S(Object obj, Object obj2, k kVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15969g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof L0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C1820y) && obj4 != null && ((C1820y) obj3).f15991d == obj4) {
                    return AbstractC1799n.f15974a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            k kVar2 = kVar;
            if (b.a(f15969g, this, obj3, Q((L0) obj3, obj5, this.f15923c, kVar2, obj6))) {
                o();
                return AbstractC1799n.f15974a;
            }
            obj = obj5;
            kVar = kVar2;
            obj2 = obj6;
        }
    }

    public final boolean T() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15968f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f15968f.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        return true;
    }

    @Override // p017b7.W
    public void a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15969g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof L0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C1822z) {
                return;
            }
            if (obj2 instanceof C1820y) {
                C1820y c1820y = (C1820y) obj2;
                if (c1820y.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (b.a(f15969g, this, obj2, C1820y.b(c1820y, null, null, null, null, th3, 15, null))) {
                    c1820y.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (b.a(f15969g, this, obj2, new C1820y(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // p017b7.W
    public final d b() {
        return this.f15971d;
    }

    @Override // p017b7.W
    public Throwable c(Object obj) {
        Throwable thC = super.c(obj);
        if (thC != null) {
            return thC;
        }
        return null;
    }

    @Override // p017b7.b1
    public void d(D d8, int i8) {
        int i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15968f;
        do {
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        B(d8);
    }

    @Override // p017b7.W
    public Object e(Object obj) {
        return obj instanceof C1820y ? ((C1820y) obj).f15988a : obj;
    }

    @Override // p017b7.InterfaceC1795l
    public boolean f(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15969g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof L0)) {
                return false;
            }
        } while (!b.a(f15969g, this, obj, new C1803p(this, th, (obj instanceof InterfaceC1793k) || (obj instanceof D))));
        L0 l8 = (L0) obj;
        if (l8 instanceof InterfaceC1793k) {
            j((InterfaceC1793k) obj, th);
        } else if (l8 instanceof D) {
            l((D) obj, th);
        }
        o();
        p(this.f15923c);
        return true;
    }

    @Override // I6.e
    public e getCallerFrame() {
        d dVar = this.f15971d;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // G6.d
    public g getContext() {
        return this.f15972e;
    }

    @Override // p017b7.W
    public Object h() {
        return t();
    }

    public final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    @Override // p017b7.InterfaceC1795l
    public boolean isCancelled() {
        return t() instanceof C1803p;
    }

    public final void k(k kVar, Throwable th) {
        try {
            kVar.invoke(th);
        } catch (Throwable th2) {
            H.a(getContext(), new B("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(D d8, Throwable th) {
        int i8 = f15968f.get(this) & 536870911;
        if (i8 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            d8.s(i8, th, getContext());
        } catch (Throwable th2) {
            H.a(getContext(), new B("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean m(Throwable th) {
        if (!E()) {
            return false;
        }
        d dVar = this.f15971d;
        t.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2372k) dVar).o(th);
    }

    public final void n() {
        InterfaceC1776b0 interfaceC1776b0R = r();
        if (interfaceC1776b0R == null) {
            return;
        }
        interfaceC1776b0R.d();
        f15970h.set(this, K0.f15903a);
    }

    public final void o() {
        if (E()) {
            return;
        }
        n();
    }

    public final void p(int i8) {
        if (R()) {
            return;
        }
        X.a(this, i8);
    }

    public Throwable q(InterfaceC1815v0 interfaceC1815v0) {
        return interfaceC1815v0.r0();
    }

    public final InterfaceC1776b0 r() {
        return (InterfaceC1776b0) f15970h.get(this);
    }

    @Override // G6.d
    public void resumeWith(Object obj) {
        P(this, C.c(obj, this), this.f15923c, null, 4, null);
    }

    public final Object s() {
        InterfaceC1815v0 interfaceC1815v0;
        boolean zE = E();
        if (T()) {
            if (r() == null) {
                A();
            }
            if (zE) {
                M();
            }
            return c.f();
        }
        if (zE) {
            M();
        }
        Object objT = t();
        if (objT instanceof C1822z) {
            throw ((C1822z) objT).f15995a;
        }
        if (!X.b(this.f15923c) || (interfaceC1815v0 = (InterfaceC1815v0) getContext().A(InterfaceC1815v0.f15985O)) == null || interfaceC1815v0.b()) {
            return e(objT);
        }
        CancellationException cancellationExceptionR0 = interfaceC1815v0.r0();
        a(objT, cancellationExceptionR0);
        throw cancellationExceptionR0;
    }

    public final Object t() {
        return f15969g.get(this);
    }

    public String toString() {
        return I() + '(' + N.c(this.f15971d) + "){" + u() + "}@" + N.b(this);
    }

    public final String u() {
        Object objT = t();
        if (objT instanceof L0) {
            return "Active";
        }
        return objT instanceof C1803p ? "Cancelled" : "Completed";
    }

    @Override // p017b7.InterfaceC1795l
    public boolean y() {
        return !(t() instanceof L0);
    }

    public void z() {
        InterfaceC1776b0 interfaceC1776b0A = A();
        if (interfaceC1776b0A != null && y()) {
            interfaceC1776b0A.d();
            f15970h.set(this, K0.f15903a);
        }
    }

    public final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + LYdqVGvOGMNr.iVPdJSpoG + obj2).toString());
    }

    public final void j(InterfaceC1793k interfaceC1793k, Throwable th) {
        try {
            interfaceC1793k.a(th);
        } catch (Throwable th2) {
            H.a(getContext(), new B(OjEsfyJYzbPn.AQe + this, th2));
        }
    }
}
