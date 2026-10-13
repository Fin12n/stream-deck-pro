package io.sentry;

import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A2 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f25815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f25816f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public A2 a(W0 w8, ILogger iLogger) {
            A2 a8 = new A2();
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "package_name":
                        a8.f25813c = w8.k0();
                        break;
                    case "thread_id":
                        a8.f25815e = w8.a0();
                        break;
                    case "address":
                        a8.f25812b = w8.k0();
                        break;
                    case "class_name":
                        a8.f25814d = w8.k0();
                        break;
                    case "type":
                        a8.f25811a = w8.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            a8.m(concurrentHashMap);
            w8.u();
            return a8;
        }
    }

    public A2() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A2.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.u.a(this.f25812b, ((A2) obj).f25812b);
    }

    public String f() {
        return this.f25812b;
    }

    public int g() {
        return this.f25811a;
    }

    public void h(String str) {
        this.f25812b = str;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f25812b);
    }

    public void i(String str) {
        this.f25814d = str;
    }

    public void j(String str) {
        this.f25813c = str;
    }

    public void k(Long l8) {
        this.f25815e = l8;
    }

    public void l(int i8) {
        this.f25811a = i8;
    }

    public void m(Map map) {
        this.f25816f = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("type").a(this.f25811a);
        if (this.f25812b != null) {
            x8.k("address").c(this.f25812b);
        }
        if (this.f25813c != null) {
            x8.k("package_name").c(this.f25813c);
        }
        if (this.f25814d != null) {
            x8.k("class_name").c(this.f25814d);
        }
        if (this.f25815e != null) {
            x8.k("thread_id").f(this.f25815e);
        }
        Map map = this.f25816f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f25816f.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public A2(A2 a8) {
        this.f25811a = a8.f25811a;
        this.f25812b = a8.f25812b;
        this.f25813c = a8.f25813c;
        this.f25814d = a8.f25814d;
        this.f25815e = a8.f25815e;
        this.f25816f = AbstractC2571c.b(a8.f25816f);
    }
}
