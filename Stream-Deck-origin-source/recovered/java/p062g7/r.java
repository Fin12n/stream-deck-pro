package p062g7;

import P2.Lsk.mHPawN;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.t;
import p017b7.N;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23859a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23860b = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23861c = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a extends AbstractC2363b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f23862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f23863c;

        public a(r rVar) {
            this.f23862b = rVar;
        }

        @Override // p062g7.AbstractC2363b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(r rVar, Object obj) {
            boolean z8 = obj == null;
            r rVar2 = z8 ? this.f23862b : this.f23863c;
            if (rVar2 != null && F1.b.a(r.p(), rVar, this, rVar2) && z8) {
                r rVar3 = this.f23862b;
                r rVar4 = this.f23863c;
                t.d(rVar4);
                rVar3.l(rVar4);
            }
        }
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater p() {
        return f23859a;
    }

    public final boolean h(r rVar) {
        f23860b.set(rVar, this);
        f23859a.set(rVar, this);
        while (m() == this) {
            if (F1.b.a(f23859a, this, this, rVar)) {
                rVar.l(this);
                return true;
            }
        }
        return false;
    }

    public final r k(r rVar) {
        while (rVar.s()) {
            rVar = (r) f23860b.get(rVar);
        }
        return rVar;
    }

    public final void l(r rVar) {
        r rVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23860b;
        do {
            rVar2 = (r) atomicReferenceFieldUpdater.get(rVar);
            if (m() != rVar) {
                return;
            }
        } while (!F1.b.a(f23860b, rVar, rVar2, this));
        if (s()) {
            rVar.i(null);
        }
    }

    public final Object m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23859a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z)) {
                return obj;
            }
            ((z) obj).a(this);
        }
    }

    public final r n() {
        r rVar;
        Object objM = m();
        A a8 = objM instanceof A ? (A) objM : null;
        if (a8 != null && (rVar = a8.f23812a) != null) {
            return rVar;
        }
        t.e(objM, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (r) objM;
    }

    public final r o() {
        r rVarI = i(null);
        return rVarI == null ? k((r) f23860b.get(this)) : rVarI;
    }

    public boolean s() {
        return m() instanceof A;
    }

    public boolean t() {
        return u() == null;
    }

    public String toString() {
        return new B(this) { // from class: g7.r.b
            @Override // kotlin.jvm.internal.B, X6.j
            public Object get() {
                return N.a(this.receiver);
            }
        } + '@' + N.b(this);
    }

    public final r u() {
        Object objM;
        r rVar;
        do {
            objM = m();
            if (objM instanceof A) {
                return ((A) objM).f23812a;
            }
            if (objM == this) {
                return (r) objM;
            }
            t.e(objM, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            rVar = (r) objM;
        } while (!F1.b.a(f23859a, this, objM, rVar.v()));
        rVar.i(null);
        return null;
    }

    public final A v() {
        A a8 = (A) f23861c.get(this);
        if (a8 != null) {
            return a8;
        }
        A a9 = new A(this);
        f23861c.set(this, a9);
        return a9;
    }

    public final int w(r rVar, r rVar2, a aVar) {
        f23860b.set(rVar, this);
        f23859a.set(rVar, rVar2);
        aVar.f23863c = rVar2;
        if (F1.b.a(f23859a, this, rVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final r i(z zVar) {
        r rVar;
        Object obj;
        loop0: while (true) {
            r rVar2 = (r) f23860b.get(this);
            rVar = rVar2;
            while (true) {
                r rVar3 = null;
                while (true) {
                    obj = f23859a.get(rVar);
                    if (obj == this) {
                        if (rVar2 != rVar && !F1.b.a(f23860b, this, rVar2, rVar)) {
                            break;
                        }
                        break;
                    }
                    if (s()) {
                        return null;
                    }
                    if (obj == zVar) {
                        break loop0;
                    }
                    if (obj instanceof z) {
                        ((z) obj).a(rVar);
                        break;
                    }
                    if (obj instanceof A) {
                        if (rVar3 != null) {
                            break;
                        }
                        rVar = (r) f23860b.get(rVar);
                    } else {
                        t.e(obj, mHPawN.nWzqBglyXOBSuEV);
                        rVar3 = rVar;
                        rVar = (r) obj;
                    }
                }
                if (!F1.b.a(f23859a, rVar3, rVar, ((A) obj).f23812a)) {
                    break;
                }
                rVar = rVar3;
            }
        }
        return rVar;
    }
}
