package io.sentry.protocol;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2546h implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Number f27406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27408c;

    /* JADX INFO: renamed from: io.sentry.protocol.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2546h a(W0 w8, ILogger iLogger) {
            w8.x();
            Number number = null;
            String strK0 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("unit")) {
                    strK0 = w8.k0();
                } else if (strF0.equals("value")) {
                    number = (Number) w8.y1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w8.t0(iLogger, concurrentHashMap, strF0);
                }
            }
            w8.u();
            if (number != null) {
                C2546h c2546h = new C2546h(number, strK0);
                c2546h.a(concurrentHashMap);
                return c2546h;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.b(EnumC2596z2.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C2546h(Number number, String str) {
        this.f27406a = number;
        this.f27407b = str;
    }

    public void a(Map map) {
        this.f27408c = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("value").f(this.f27406a);
        if (this.f27407b != null) {
            x8.k("unit").c(this.f27407b);
        }
        Map map = this.f27408c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27408c.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public C2546h(Number number, String str, Map<String, Object> map) {
        this.f27406a = number;
        this.f27407b = str;
        this.f27408c = map;
    }
}
