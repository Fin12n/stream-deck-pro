package p213y6;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p221z6.f;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a extends p205x6.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f38436j = new d(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f38439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f38440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f38441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f38442p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f38443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f38444i;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends f {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p221z6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a b0() {
            return new a(p189v6.b.f35173a.b(4096), null, this, 0 == true ? 1 : 0);
        }

        @Override // p221z6.f, p221z6.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void H1(a instance) {
            t.g(instance, "instance");
            p189v6.b.f35173a.a(instance.h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends f {
        @Override // p221z6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a b0() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }

        @Override // p221z6.f, p221z6.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void H1(a instance) {
            t.g(instance, "instance");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {
        public /* synthetic */ d(AbstractC2633k abstractC2633k) {
            this();
        }

        public final a a() {
            return a.f38440n;
        }

        public final g b() {
            return a.f38439m;
        }

        public final g c() {
            return p205x6.c.a();
        }

        public d() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C0848a c0848a = new C0848a();
        f38439m = c0848a;
        f38440n = new a(p189v6.c.f35174a.a(), 0 == true ? 1 : 0, c0848a, 0 == true ? 1 : 0);
        f38441o = new b();
        f38442p = new c();
        f38437k = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "nextRef");
        f38438l = AtomicIntegerFieldUpdater.newUpdater(a.class, "refCount");
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, a aVar, g gVar, AbstractC2633k abstractC2633k) {
        this(byteBuffer, aVar, gVar);
    }

    public final a A() {
        return (a) f38437k.getAndSet(this, null);
    }

    public a B() {
        a aVar = this.f38444i;
        if (aVar == null) {
            aVar = this;
        }
        aVar.y();
        a aVar2 = new a(h(), aVar, this.f38443h, null);
        e(aVar2);
        return aVar2;
    }

    public final a C() {
        return (a) this.nextRef;
    }

    public final a D() {
        return this.f38444i;
    }

    public final int E() {
        return this.refCount;
    }

    public void F(g pool) {
        t.g(pool, "pool");
        if (G()) {
            a aVar = this.f38444i;
            if (aVar != null) {
                I();
                aVar.F(pool);
            } else {
                g gVar = this.f38443h;
                if (gVar != null) {
                    pool = gVar;
                }
                pool.H1(this);
            }
        }
    }

    public final boolean G() {
        int i8;
        int i9;
        do {
            i8 = this.refCount;
            if (i8 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i9 = i8 - 1;
        } while (!f38438l.compareAndSet(this, i8, i9));
        return i9 == 0;
    }

    public final void H(a aVar) {
        if (aVar == null) {
            A();
        } else {
            z(aVar);
        }
    }

    public final void I() {
        if (!f38438l.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        A();
        this.f38444i = null;
    }

    public final void J() {
        int i8;
        do {
            i8 = this.refCount;
            if (i8 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i8 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f38438l.compareAndSet(this, i8, 1));
    }

    @Override // p205x6.a
    public final void r() {
        if (this.f38444i != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        super.r();
        this.nextRef = null;
    }

    public final void y() {
        int i8;
        do {
            i8 = this.refCount;
            if (i8 <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f38438l.compareAndSet(this, i8, i8 + 1));
    }

    public final void z(a aVar) {
        if (!F1.b.a(f38437k, this, null, aVar)) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ByteBuffer memory, a aVar, g gVar) {
        super(memory, null);
        t.g(memory, "memory");
        this.f38443h = gVar;
        if (aVar == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.f38444i = aVar;
    }

    /* JADX INFO: renamed from: y6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0848a implements g {
        @Override // p221z6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a b0() {
            return a.f38436j.a();
        }

        @Override // p221z6.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void H1(a instance) {
            t.g(instance, "instance");
            if (instance != a.f38436j.a()) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            g.a.a(this);
        }

        @Override // p221z6.g
        public void d() {
        }
    }
}
