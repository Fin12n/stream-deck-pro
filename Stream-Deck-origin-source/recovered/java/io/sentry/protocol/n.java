package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f27451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f27452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f27453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f27454e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(W0 w8, ILogger iLogger) {
            n nVar = new n();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "sdk_name":
                        nVar.f27450a = w8.k0();
                        break;
                    case "version_patchlevel":
                        nVar.f27453d = w8.T();
                        break;
                    case "version_major":
                        nVar.f27451b = w8.T();
                        break;
                    case "version_minor":
                        nVar.f27452c = w8.T();
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
            nVar.e(map);
            return nVar;
        }
    }

    public void e(Map map) {
        this.f27454e = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27450a != null) {
            x8.k("sdk_name").c(this.f27450a);
        }
        if (this.f27451b != null) {
            x8.k("version_major").f(this.f27451b);
        }
        if (this.f27452c != null) {
            x8.k("version_minor").f(this.f27452c);
        }
        if (this.f27453d != null) {
            x8.k("version_patchlevel").f(this.f27453d);
        }
        Map map = this.f27454e;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27454e.get(str));
            }
        }
        x8.u();
    }
}
