package J5;

import E4.JFpq.XRlnZWSrAFn;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.F;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4328d = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f4330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6.j f4331c;
    private volatile /* synthetic */ int closed;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G6.g invoke() {
            return p115m6.o.b(null, 1, null).P1(c.this.j()).P1(new I(c.this.f4329a + XRlnZWSrAFn.eEqOhTloi));
        }
    }

    public c(String engineName) {
        t.g(engineName, "engineName");
        this.f4329a = engineName;
        this.closed = 0;
        this.f4330b = d.a();
        this.f4331c = C6.k.b(new a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f4328d.compareAndSet(this, 0, 1)) {
            G6.g.b bVarA = getCoroutineContext().A(InterfaceC1815v0.f15985O);
            InterfaceC1818x interfaceC1818x = bVarA instanceof InterfaceC1818x ? (InterfaceC1818x) bVarA : null;
            if (interfaceC1818x == null) {
                return;
            }
            interfaceC1818x.i1();
        }
    }

    @Override // J5.b
    public void f1(G5.a aVar) {
        b.a.h(this, aVar);
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return (G6.g) this.f4331c.getValue();
    }

    @Override // J5.b
    public Set h0() {
        return b.a.g(this);
    }

    public F j() {
        return this.f4330b;
    }
}
