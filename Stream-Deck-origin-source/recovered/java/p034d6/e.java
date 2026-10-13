package p034d6;

import I0.mIk.efuWFSeiT;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceArray f19860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f19854d = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f19857g = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19855e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19856f = AtomicLongFieldUpdater.newUpdater(e.class, "_state");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public String toString() {
            return "REMOVE_FROZEN";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int e(long j8) {
            return (j8 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long f(long j8, int i8) {
            return h(j8, 1073741823L) | ((long) i8);
        }

        public final long g(long j8, int i8) {
            return h(j8, 1152921503533105152L) | (((long) i8) << 30);
        }

        public final long h(long j8, long j9) {
            return j8 & (~j9);
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19861a;

        public c(int i8) {
            this.f19861a = i8;
        }
    }

    public e(int i8) {
        this.f19858a = i8;
        int i9 = i8 - 1;
        this.f19859b = i9;
        this.f19860c = new AtomicReferenceArray(i8);
        if (i9 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i8 & i9) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final e b(long j8) {
        e eVar = new e(this.f19858a * 2);
        int i8 = (int) (1073741823 & j8);
        int i9 = (int) ((1152921503533105152L & j8) >> 30);
        while (true) {
            int i10 = this.f19859b;
            if ((i8 & i10) == (i9 & i10)) {
                eVar._state = f19854d.h(j8, 1152921504606846976L);
                return eVar;
            }
            AtomicReferenceArray atomicReferenceArray = eVar.f19860c;
            int i11 = eVar.f19859b & i8;
            Object cVar = this.f19860c.get(i10 & i8);
            if (cVar == null) {
                cVar = new c(i8);
            }
            atomicReferenceArray.set(i11, cVar);
            i8++;
        }
    }

    public final e c(long j8) {
        while (true) {
            e eVar = (e) this._next;
            if (eVar != null) {
                return eVar;
            }
            F1.b.a(f19855e, this, null, b(j8));
        }
    }

    public final boolean d() {
        long j8;
        do {
            j8 = this._state;
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!f19856f.compareAndSet(this, j8, j8 | 2305843009213693952L));
        return true;
    }

    public final e e(int i8, Object obj) {
        Object obj2 = this.f19860c.get(this.f19859b & i8);
        if (!(obj2 instanceof c) || ((c) obj2).f19861a != i8) {
            return null;
        }
        this.f19860c.set(i8 & this.f19859b, obj);
        return this;
    }

    public final boolean f() {
        long j8 = this._state;
        return ((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30));
    }

    public final long g() {
        long j8;
        long j9;
        do {
            j8 = this._state;
            if ((j8 & 1152921504606846976L) != 0) {
                return j8;
            }
            j9 = j8 | 1152921504606846976L;
        } while (!f19856f.compareAndSet(this, j8, j9));
        return j9;
    }

    public final e h() {
        return c(g());
    }

    public final Object i() {
        Object obj;
        long j8 = this._state;
        if ((1152921504606846976L & j8) != 0) {
            return f19857g;
        }
        int i8 = (int) (1073741823 & j8);
        int i9 = this.f19859b;
        if ((((int) ((1152921503533105152L & j8) >> 30)) & i9) == (i8 & i9) || (obj = this.f19860c.get(i9 & i8)) == null || (obj instanceof c)) {
            return null;
        }
        int i10 = (i8 + 1) & 1073741823;
        if (f19856f.compareAndSet(this, j8, f19854d.f(j8, i10))) {
            this.f19860c.set(this.f19859b & i8, null);
            return obj;
        }
        e eVarJ = this;
        do {
            eVarJ = eVarJ.j(i8, i10);
        } while (eVarJ != null);
        return obj;
    }

    public final e j(int i8, int i9) {
        long j8;
        int i10;
        do {
            j8 = this._state;
            i10 = (int) (1073741823 & j8);
            if (i10 != i8) {
                throw new IllegalStateException("This queue can have only one consumer");
            }
            if ((1152921504606846976L & j8) != 0) {
                return h();
            }
        } while (!f19856f.compareAndSet(this, j8, f19854d.f(j8, i9)));
        this.f19860c.set(this.f19859b & i10, null);
        return null;
    }

    public final int a(Object obj) {
        long j8;
        int i8;
        t.g(obj, efuWFSeiT.niESXOQwtyymcTV);
        do {
            j8 = this._state;
            if ((3458764513820540928L & j8) != 0) {
                return f19854d.e(j8);
            }
            i8 = (int) ((1152921503533105152L & j8) >> 30);
            int i9 = this.f19859b;
            if (((i8 + 2) & i9) == (((int) (1073741823 & j8)) & i9)) {
                return 1;
            }
        } while (!f19856f.compareAndSet(this, j8, f19854d.g(j8, (i8 + 1) & 1073741823)));
        this.f19860c.set(this.f19859b & i8, obj);
        e eVarE = this;
        while ((eVarE._state & 1152921504606846976L) != 0 && (eVarE = eVarE.h().e(i8, obj)) != null) {
        }
        return 0;
    }
}
