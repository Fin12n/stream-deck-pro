package p062g7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23865e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23866f = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23867g = AtomicLongFieldUpdater.newUpdater(t.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G f23868h = new G("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f23872d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a(long j8) {
            return (j8 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j8, int i8) {
            return d(j8, 1073741823L) | ((long) i8);
        }

        public final long c(long j8, int i8) {
            return d(j8, 1152921503533105152L) | (((long) i8) << 30);
        }

        public final long d(long j8, long j9) {
            return j8 & (~j9);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23873a;

        public b(int i8) {
            this.f23873a = i8;
        }
    }

    public t(int i8, boolean z8) {
        this.f23869a = i8;
        this.f23870b = z8;
        int i9 = i8 - 1;
        this.f23871c = i9;
        this.f23872d = new AtomicReferenceArray(i8);
        if (i9 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i8 & i9) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23867g;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j8) != 0) {
                return f23865e.a(j8);
            }
            int i8 = (int) (1073741823 & j8);
            int i9 = (int) ((1152921503533105152L & j8) >> 30);
            int i10 = this.f23871c;
            if (((i9 + 2) & i10) == (i8 & i10)) {
                return 1;
            }
            if (!this.f23870b && f().get(i9 & i10) != null) {
                int i11 = this.f23869a;
                if (i11 < 1024 || ((i9 - i8) & 1073741823) > (i11 >> 1)) {
                    return 1;
                }
            } else if (f23867g.compareAndSet(this, j8, f23865e.c(j8, (i9 + 1) & 1073741823))) {
                f().set(i9 & i10, obj);
                t tVarE = this;
                while ((f23867g.get(tVarE) & 1152921504606846976L) != 0 && (tVarE = tVarE.l().e(i9, obj)) != null) {
                }
                return 0;
            }
        }
    }

    public final t b(long j8) {
        t tVar = new t(this.f23869a * 2, this.f23870b);
        int i8 = (int) (1073741823 & j8);
        int i9 = (int) ((1152921503533105152L & j8) >> 30);
        while (true) {
            int i10 = this.f23871c;
            if ((i8 & i10) == (i10 & i9)) {
                f23867g.set(tVar, f23865e.d(j8, 1152921504606846976L));
                return tVar;
            }
            Object bVar = f().get(this.f23871c & i8);
            if (bVar == null) {
                bVar = new b(i8);
            }
            tVar.f().set(tVar.f23871c & i8, bVar);
            i8++;
        }
    }

    public final t c(long j8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23866f;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            if (tVar != null) {
                return tVar;
            }
            F1.b.a(f23866f, this, null, b(j8));
        }
    }

    public final boolean d() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23867g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, 2305843009213693952L | j8));
        return true;
    }

    public final t e(int i8, Object obj) {
        Object obj2 = f().get(this.f23871c & i8);
        if (!(obj2 instanceof b) || ((b) obj2).f23873a != i8) {
            return null;
        }
        f().set(i8 & this.f23871c, obj);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.f23872d;
    }

    public final int g() {
        long j8 = f23867g.get(this);
        return (((int) ((j8 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j8))) & 1073741823;
    }

    public final boolean j() {
        long j8 = f23867g.get(this);
        return ((int) (1073741823 & j8)) == ((int) ((j8 & 1152921503533105152L) >> 30));
    }

    public final long k() {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23867g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 1152921504606846976L) != 0) {
                return j8;
            }
            j9 = 1152921504606846976L | j8;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j9));
        return j9;
    }

    public final t l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23867g;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j8) != 0) {
                return f23868h;
            }
            int i8 = (int) (1073741823 & j8);
            int i9 = this.f23871c;
            if ((((int) ((1152921503533105152L & j8) >> 30)) & i9) == (i9 & i8)) {
                return null;
            }
            Object obj = f().get(this.f23871c & i8);
            if (obj == null) {
                if (this.f23870b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i10 = (i8 + 1) & 1073741823;
                if (f23867g.compareAndSet(this, j8, f23865e.b(j8, i10))) {
                    f().set(this.f23871c & i8, null);
                    return obj;
                }
                if (this.f23870b) {
                    t tVarN = this;
                    do {
                        tVarN = tVarN.n(i8, i10);
                    } while (tVarN != null);
                    return obj;
                }
            }
        }
    }

    public final t n(int i8, int i9) {
        long j8;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23867g;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            i10 = (int) (1073741823 & j8);
            if ((1152921504606846976L & j8) != 0) {
                return l();
            }
        } while (!f23867g.compareAndSet(this, j8, f23865e.b(j8, i9)));
        f().set(this.f23871c & i10, null);
        return null;
    }
}
