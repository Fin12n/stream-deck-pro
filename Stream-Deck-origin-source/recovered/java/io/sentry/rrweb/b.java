package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.ILogger;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f27564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27565b = System.currentTimeMillis();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public boolean a(b bVar, String str, W0 w8, ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                bVar.f27564a = (c) u.c((c) w8.m1(iLogger, new c.a()), "");
                return true;
            }
            if (!str.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                return false;
            }
            bVar.f27565b = w8.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0604b {
        public void a(b bVar, X0 x8, ILogger iLogger) {
            x8.k("type").g(iLogger, bVar.f27564a);
            x8.k(DiagnosticsEntry.TIMESTAMP_KEY).a(bVar.f27565b);
        }
    }

    public b(c cVar) {
        this.f27564a = cVar;
    }

    public long e() {
        return this.f27565b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27565b == bVar.f27565b && this.f27564a == bVar.f27564a;
    }

    public void f(long j8) {
        this.f27565b = j8;
    }

    public int hashCode() {
        return u.b(this.f27564a, Long.valueOf(this.f27565b));
    }
}
