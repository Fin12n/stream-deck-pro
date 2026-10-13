package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27476c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(W0 w8, ILogger iLogger) {
            w8.x();
            String strG = null;
            String strG2 = null;
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("name")) {
                    strG = w8.G();
                } else if (strF0.equals(DiagnosticsEntry.VERSION_KEY)) {
                    strG2 = w8.G();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            w8.u();
            if (strG == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC2596z2.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strG2 != null) {
                v vVar = new v(strG, strG2);
                vVar.a(map);
                return vVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.b(EnumC2596z2.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public void a(Map map) {
        this.f27476c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (Objects.equals(this.f27474a, vVar.f27474a) && Objects.equals(this.f27475b, vVar.f27475b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f27474a, this.f27475b);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("name").c(this.f27474a);
        x8.k(DiagnosticsEntry.VERSION_KEY).c(this.f27475b);
        Map map = this.f27476c;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27476c.get(str));
            }
        }
        x8.u();
    }

    public v(String str, String str2) {
        this.f27474a = (String) io.sentry.util.u.c(str, BpgIURjN.apWpr);
        this.f27475b = (String) io.sentry.util.u.c(str2, "version is required.");
    }
}
