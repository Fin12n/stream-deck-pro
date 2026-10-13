package io.sentry.clientreport;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f27056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f27057d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC2596z2.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(W0 w8, ILogger iLogger) throws Exception {
            w8.x();
            String strK0 = null;
            String strK1 = null;
            Long lA0 = null;
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "quantity":
                        lA0 = w8.a0();
                        break;
                    case "reason":
                        strK0 = w8.k0();
                        break;
                    case "category":
                        strK1 = w8.k0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        w8.t0(iLogger, map, strF0);
                        break;
                }
            }
            w8.u();
            if (strK0 == null) {
                throw c("reason", iLogger);
            }
            if (strK1 == null) {
                throw c("category", iLogger);
            }
            if (lA0 == null) {
                throw c("quantity", iLogger);
            }
            g gVar = new g(strK0, strK1, lA0);
            gVar.d(map);
            return gVar;
        }
    }

    public g(String str, String str2, Long l8) {
        this.f27054a = str;
        this.f27055b = str2;
        this.f27056c = l8;
    }

    public String a() {
        return this.f27055b;
    }

    public Long b() {
        return this.f27056c;
    }

    public String c() {
        return this.f27054a;
    }

    public void d(Map map) {
        this.f27057d = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("reason").c(this.f27054a);
        x8.k("category").c(this.f27055b);
        x8.k("quantity").f(this.f27056c);
        Map map = this.f27057d;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27057d.get(str));
            }
        }
        x8.u();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f27054a + "', category='" + this.f27055b + "', quantity=" + this.f27056c + '}';
    }
}
