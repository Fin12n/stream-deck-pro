package p062g7;

import C6.G;
import F1.b;
import G6.d;
import G6.g;
import I6.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;
import p017b7.A;
import p017b7.AbstractC1784f0;
import p017b7.C;
import p017b7.C1797m;
import p017b7.F;
import p017b7.InterfaceC1795l;
import p017b7.N;
import p017b7.U0;
import p017b7.W;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: g7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2372k extends W implements e, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23843h = AtomicReferenceFieldUpdater.newUpdater(C2372k.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f23844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f23845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f23846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f23847g;

    public C2372k(F f8, d<Object> dVar) {
        super(-1);
        this.f23844d = f8;
        this.f23845e = dVar;
        this.f23846f = AbstractC2373l.f23848a;
        this.f23847g = K.b(getContext());
    }

    @Override // p017b7.W
    public void a(Object obj, Throwable th) {
        if (obj instanceof A) {
            ((A) obj).f15863b.invoke(th);
        }
    }

    @Override // p017b7.W
    public d b() {
        return this;
    }

    @Override // I6.e
    public e getCallerFrame() {
        d dVar = this.f23845e;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // G6.d
    public g getContext() {
        return this.f23845e.getContext();
    }

    @Override // p017b7.W
    public Object h() {
        Object obj = this.f23846f;
        this.f23846f = AbstractC2373l.f23848a;
        return obj;
    }

    public final void i() {
        while (f23843h.get(this) == AbstractC2373l.f23849b) {
        }
    }

    public final C1797m j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23843h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f23843h.set(this, AbstractC2373l.f23849b);
                return null;
            }
            if (obj instanceof C1797m) {
                if (b.a(f23843h, this, obj, AbstractC2373l.f23849b)) {
                    return (C1797m) obj;
                }
            } else if (obj != AbstractC2373l.f23849b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void k(g gVar, Object obj) {
        this.f23846f = obj;
        this.f15923c = 1;
        this.f23844d.T0(gVar, this);
    }

    public final C1797m l() {
        Object obj = f23843h.get(this);
        if (obj instanceof C1797m) {
            return (C1797m) obj;
        }
        return null;
    }

    public final boolean n() {
        return f23843h.get(this) != null;
    }

    public final boolean o(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23843h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            G g8 = AbstractC2373l.f23849b;
            if (t.c(obj, g8)) {
                if (b.a(f23843h, this, g8, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (b.a(f23843h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        i();
        C1797m c1797mL = l();
        if (c1797mL != null) {
            c1797mL.n();
        }
    }

    public final Throwable q(InterfaceC1795l interfaceC1795l) {
        G g8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23843h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g8 = AbstractC2373l.f23849b;
            if (obj != g8) {
                if (obj instanceof Throwable) {
                    if (b.a(f23843h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!b.a(f23843h, this, g8, interfaceC1795l));
        return null;
    }

    @Override // G6.d
    public void resumeWith(Object obj) {
        g context = this.f23845e.getContext();
        Object objD = C.d(obj, null, 1, null);
        if (this.f23844d.g1(context)) {
            this.f23846f = objD;
            this.f15923c = 0;
            this.f23844d.L0(context, this);
            return;
        }
        AbstractC1784f0 abstractC1784f0B = U0.f15919a.b();
        if (abstractC1784f0B.b2()) {
            this.f23846f = objD;
            this.f15923c = 0;
            abstractC1784f0B.M1(this);
            return;
        }
        abstractC1784f0B.Z1(true);
        try {
            g context2 = getContext();
            Object objC = K.c(context2, this.f23847g);
            try {
                this.f23845e.resumeWith(obj);
                G g8 = G.f1419a;
                K.a(context2, objC);
                while (abstractC1784f0B.e2()) {
                }
            } catch (Throwable th) {
                K.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2, null);
            } finally {
                abstractC1784f0B.o1(true);
            }
        }
    }

    public String toString() {
        return kDsnNkYbBsI.KfgelllEAC + this.f23844d + ", " + N.c(this.f23845e) + ']';
    }
}
