package io.sentry.protocol;

import io.jentz.winter.js.HRHLwtyqJWz;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f27309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f27310b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(W0 w8, ILogger iLogger) {
            w8.x();
            C c8 = new C();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("active_profiles")) {
                    List list = (List) w8.y1();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c8.f27309a = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w8.t0(iLogger, concurrentHashMap, strF0);
                }
            }
            c8.b(concurrentHashMap);
            w8.u();
            return c8;
        }
    }

    public C() {
    }

    public void b(Map map) {
        this.f27310b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f27309a, ((C) obj).f27309a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f27309a);
    }

    public C(C c8) {
        this.f27309a = c8.f27309a;
        this.f27310b = AbstractC2571c.b(c8.f27310b);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27309a != null) {
            x8.k(HRHLwtyqJWz.WeLWVFFxVrMNV).g(iLogger, this.f27309a);
        }
        Map map = this.f27310b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27310b.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }
}
