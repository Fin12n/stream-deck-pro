package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f27287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f27289c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(W0 w8, ILogger iLogger) {
            w8.x();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("elapsed_since_start_ns")) {
                    String strK0 = w8.k0();
                    if (strK0 != null) {
                        bVar.f27288b = strK0;
                    }
                } else if (strF0.equals("value")) {
                    Double dD0 = w8.D0();
                    if (dD0 != null) {
                        bVar.f27289c = dD0.doubleValue();
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w8.t0(iLogger, concurrentHashMap, strF0);
                }
            }
            bVar.c(concurrentHashMap);
            w8.u();
            return bVar;
        }
    }

    public b() {
        this(0L, 0);
    }

    public void c(Map map) {
        this.f27287a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (u.a(this.f27287a, bVar.f27287a) && this.f27288b.equals(bVar.f27288b) && this.f27289c == bVar.f27289c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return u.b(this.f27287a, this.f27288b, Double.valueOf(this.f27289c));
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("value").g(iLogger, Double.valueOf(this.f27289c));
        x8.k("elapsed_since_start_ns").g(iLogger, this.f27288b);
        Map map = this.f27287a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27287a.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public b(Long l8, Number number) {
        this.f27288b = l8.toString();
        this.f27289c = number.doubleValue();
    }
}
