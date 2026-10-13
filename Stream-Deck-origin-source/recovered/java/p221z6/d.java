package p221z6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.x;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f39263f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f39264g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f39268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f39269e;
    private volatile long top;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    static {
        AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(d.class, new x() { // from class: z6.d.a
            @Override // kotlin.jvm.internal.x, X6.k
            public Object get(Object obj) {
                return Long.valueOf(((d) obj).top);
            }
        }.getName());
        t.f(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        f39264g = atomicLongFieldUpdaterNewUpdater;
    }

    public void A(Object instance) {
        t.g(instance, "instance");
    }

    @Override // p221z6.g
    public final void H1(Object instance) {
        t.g(instance, "instance");
        A(instance);
        if (z(instance)) {
            return;
        }
        j(instance);
    }

    @Override // p221z6.g
    public final Object b0() {
        Object objC;
        Object objY = y();
        return (objY == null || (objC = c(objY)) == null) ? t() : objC;
    }

    public Object c(Object instance) {
        t.g(instance, "instance");
        return instance;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g.a.a(this);
    }

    @Override // p221z6.g
    public final void d() {
        while (true) {
            Object objY = y();
            if (objY == null) {
                return;
            } else {
                j(objY);
            }
        }
    }

    public void j(Object instance) {
        t.g(instance, "instance");
    }

    public final int o() {
        long j8;
        long j9;
        int i8;
        do {
            j8 = this.top;
            if (j8 == 0) {
                return 0;
            }
            j9 = ((j8 >> 32) & 4294967295L) + 1;
            i8 = (int) (4294967295L & j8);
            if (i8 == 0) {
                return 0;
            }
        } while (!f39264g.compareAndSet(this, j8, (j9 << 32) | ((long) this.f39269e[i8])));
        return i8;
    }

    public abstract Object t();

    public final void v(int i8) {
        long j8;
        if (i8 <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j8 = this.top;
            this.f39269e[i8] = (int) (4294967295L & j8);
        } while (!f39264g.compareAndSet(this, j8, ((((j8 >> 32) & 4294967295L) + 1) << 32) | ((long) i8)));
    }

    public final Object y() {
        int iO = o();
        if (iO == 0) {
            return null;
        }
        return this.f39268d.getAndSet(iO, null);
    }

    public final boolean z(Object obj) {
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f39267c) + 1;
        for (int i8 = 0; i8 < 8; i8++) {
            if (c.a(this.f39268d, iIdentityHashCode, null, obj)) {
                v(iIdentityHashCode);
                return true;
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f39266b;
            }
        }
        return false;
    }

    public d(int i8) {
        this.f39265a = i8;
        if (i8 > 0) {
            if (i8 <= 536870911) {
                int iHighestOneBit = Integer.highestOneBit((i8 * 4) - 1) * 2;
                this.f39266b = iHighestOneBit;
                this.f39267c = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
                this.f39268d = new AtomicReferenceArray(iHighestOneBit + 1);
                this.f39269e = new int[iHighestOneBit + 1];
                return;
            }
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i8).toString());
        }
        throw new IllegalArgumentException((GIGvBf.gzdLFZGNTMQnSFV + i8).toString());
    }
}
