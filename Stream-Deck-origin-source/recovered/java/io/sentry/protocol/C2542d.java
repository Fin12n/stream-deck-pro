package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2542d implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f27355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f27356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27357c;

    /* JADX INFO: renamed from: io.sentry.protocol.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2542d a(W0 w8, ILogger iLogger) {
            C2542d c2542d = new C2542d();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("images")) {
                    c2542d.f27356b = w8.O1(iLogger, new DebugImage.a());
                } else if (strF0.equals("sdk_info")) {
                    c2542d.f27355a = (n) w8.m1(iLogger, new n.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            w8.u();
            c2542d.e(map);
            return c2542d;
        }
    }

    public List c() {
        return this.f27356b;
    }

    public void d(List list) {
        this.f27356b = list != null ? new ArrayList(list) : null;
    }

    public void e(Map map) {
        this.f27357c = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27355a != null) {
            x8.k("sdk_info").g(iLogger, this.f27355a);
        }
        if (this.f27356b != null) {
            x8.k("images").g(iLogger, this.f27356b);
        }
        Map map = this.f27357c;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27357c.get(str));
            }
        }
        x8.u();
    }
}
