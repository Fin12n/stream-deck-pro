package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2540b implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27352c;

    /* JADX INFO: renamed from: io.sentry.protocol.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2540b a(W0 w8, ILogger iLogger) {
            w8.x();
            C2540b c2540b = new C2540b();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("name")) {
                    c2540b.f27350a = w8.k0();
                } else if (strF0.equals(DiagnosticsEntry.VERSION_KEY)) {
                    c2540b.f27351b = w8.k0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w8.t0(iLogger, concurrentHashMap, strF0);
                }
            }
            c2540b.c(concurrentHashMap);
            w8.u();
            return c2540b;
        }
    }

    public C2540b() {
    }

    public void c(Map map) {
        this.f27352c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2540b.class == obj.getClass()) {
            C2540b c2540b = (C2540b) obj;
            if (io.sentry.util.u.a(this.f27350a, c2540b.f27350a) && io.sentry.util.u.a(this.f27351b, c2540b.f27351b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27350a, this.f27351b);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27350a != null) {
            x8.k("name").c(this.f27350a);
        }
        if (this.f27351b != null) {
            x8.k(DiagnosticsEntry.VERSION_KEY).c(this.f27351b);
        }
        Map map = this.f27352c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27352c.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public C2540b(C2540b c2540b) {
        this.f27350a = c2540b.f27350a;
        this.f27351b = c2540b.f27351b;
        this.f27352c = AbstractC2571c.b(c2540b.f27352c);
    }
}
