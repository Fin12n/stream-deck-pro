package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f27322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27323c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public G a(W0 w8, ILogger iLogger) {
            w8.x();
            String strK0 = null;
            List listO1 = null;
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("rendering_system")) {
                    strK0 = w8.k0();
                } else if (strF0.equals("windows")) {
                    listO1 = w8.O1(iLogger, new H.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            w8.u();
            G g8 = new G(strK0, listO1);
            g8.a(map);
            return g8;
        }
    }

    public G(String str, List<H> list) {
        this.f27321a = str;
        this.f27322b = list;
    }

    public void a(Map map) {
        this.f27323c = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27321a != null) {
            x8.k("rendering_system").c(this.f27321a);
        }
        if (this.f27322b != null) {
            x8.k("windows").g(iLogger, this.f27322b);
        }
        Map map = this.f27323c;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27323c.get(str));
            }
        }
        x8.u();
    }
}
