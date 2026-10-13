package z7;

import C6.G;
import M6.eLZq.eGwOBWCdOTaKus;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import u7.C3041a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39352f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.d f39355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f39356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f39357e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends y7.a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // y7.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(y7.e taskRunner, int i8, long j8, TimeUnit timeUnit) {
        t.g(taskRunner, "taskRunner");
        t.g(timeUnit, "timeUnit");
        this.f39353a = i8;
        this.f39354b = timeUnit.toNanos(j8);
        this.f39355c = taskRunner.i();
        this.f39356d = new b(v7.d.f35187i + " ConnectionPool");
        this.f39357e = new ConcurrentLinkedQueue();
        if (j8 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j8).toString());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    public final boolean a(C3041a address, e call, List list, boolean z8) {
        t.g(address, "address");
        t.g(call, "call");
        for (f connection : this.f39357e) {
            t.f(connection, "connection");
            synchronized (connection) {
                if (z8) {
                    try {
                        if (connection.v()) {
                            if (connection.t(address, list)) {
                                call.d(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (connection.t(address, list)) {
                    call.d(connection);
                    return true;
                }
                G g8 = G.f1419a;
            }
        }
        return false;
    }

    public final long b(long j8) {
        int i8 = 0;
        long j9 = Long.MIN_VALUE;
        f fVar = null;
        int i9 = 0;
        for (f connection : this.f39357e) {
            t.f(connection, "connection");
            synchronized (connection) {
                if (e(connection, j8) > 0) {
                    i9++;
                } else {
                    i8++;
                    long jO = j8 - connection.o();
                    if (jO > j9) {
                        fVar = connection;
                        j9 = jO;
                    }
                    G g8 = G.f1419a;
                }
            }
        }
        long j10 = this.f39354b;
        if (j9 < j10 && i8 <= this.f39353a) {
            if (i8 > 0) {
                return j10 - j9;
            }
            if (i9 > 0) {
                return j10;
            }
            return -1L;
        }
        t.d(fVar);
        synchronized (fVar) {
            if (!fVar.n().isEmpty()) {
                return 0L;
            }
            if (fVar.o() + j9 != j8) {
                return 0L;
            }
            fVar.D(true);
            this.f39357e.remove(fVar);
            v7.d.n(fVar.E());
            if (this.f39357e.isEmpty()) {
                this.f39355c.a();
            }
            return 0L;
        }
    }

    public final void d() {
        Socket socketE;
        Iterator it = this.f39357e.iterator();
        t.f(it, "connections.iterator()");
        while (it.hasNext()) {
            f connection = (f) it.next();
            t.f(connection, "connection");
            synchronized (connection) {
                if (connection.n().isEmpty()) {
                    it.remove();
                    connection.D(true);
                    socketE = connection.E();
                } else {
                    socketE = null;
                }
            }
            if (socketE != null) {
                v7.d.n(socketE);
            }
        }
        if (this.f39357e.isEmpty()) {
            this.f39355c.a();
        }
    }

    public final int e(f fVar, long j8) {
        if (v7.d.f35186h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listN = fVar.n();
        int i8 = 0;
        while (i8 < listN.size()) {
            Reference reference = (Reference) listN.get(i8);
            if (reference.get() != null) {
                i8++;
            } else {
                t.e(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                E7.h.f2311a.g().m("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listN.remove(i8);
                fVar.D(true);
                if (listN.isEmpty()) {
                    fVar.C(j8 - this.f39354b);
                    return 0;
                }
            }
        }
        return listN.size();
    }

    public final void f(f connection) {
        t.g(connection, "connection");
        if (!v7.d.f35186h || Thread.holdsLock(connection)) {
            this.f39357e.add(connection);
            y7.d.j(this.f39355c, this.f39356d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final boolean c(f fVar) {
        t.g(fVar, eGwOBWCdOTaKus.UnSxh);
        if (v7.d.f35186h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        if (!fVar.p() && this.f39353a != 0) {
            y7.d.j(this.f39355c, this.f39356d, 0L, 2, null);
            return false;
        }
        fVar.D(true);
        this.f39357e.remove(fVar);
        if (this.f39357e.isEmpty()) {
            this.f39355c.a();
        }
        return true;
    }
}
