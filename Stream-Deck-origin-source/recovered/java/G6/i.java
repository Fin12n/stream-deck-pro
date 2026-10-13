package G6;

import C6.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements d, I6.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2821b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2822c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2823a;
    private volatile Object result;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public i(d<Object> delegate, Object obj) {
        t.g(delegate, "delegate");
        this.f2823a = delegate;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        H6.a aVar = H6.a.UNDECIDED;
        if (obj == aVar) {
            if (F1.b.a(f2822c, this, aVar, H6.c.f())) {
                return H6.c.f();
            }
            obj = this.result;
        }
        if (obj == H6.a.RESUMED) {
            return H6.c.f();
        }
        if (obj instanceof q.b) {
            throw ((q.b) obj).f1443a;
        }
        return obj;
    }

    @Override // I6.e
    public I6.e getCallerFrame() {
        d dVar = this.f2823a;
        if (dVar instanceof I6.e) {
            return (I6.e) dVar;
        }
        return null;
    }

    @Override // G6.d
    public g getContext() {
        return this.f2823a.getContext();
    }

    @Override // G6.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            H6.a aVar = H6.a.UNDECIDED;
            if (obj2 == aVar) {
                if (F1.b.a(f2822c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != H6.c.f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (F1.b.a(f2822c, this, H6.c.f(), H6.a.RESUMED)) {
                    this.f2823a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f2823a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<Object> delegate) {
        this(delegate, H6.a.UNDECIDED);
        t.g(delegate, "delegate");
    }
}
