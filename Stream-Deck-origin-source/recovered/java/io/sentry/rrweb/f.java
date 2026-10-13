package io.sentry.rrweb;

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
public final class f extends d implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f27576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27578g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(W0 w8, ILogger iLogger) {
            w8.x();
            f fVar = new f();
            io.sentry.rrweb.b.a aVar = new io.sentry.rrweb.b.a();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("data")) {
                    c(fVar, w8, iLogger);
                } else if (!aVar.a(fVar, strF0, w8, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            fVar.o(map);
            w8.u();
            return fVar;
        }

        public final void c(f fVar, W0 w8, ILogger iLogger) {
            d.a aVar = new d.a();
            w8.x();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("pointerId")) {
                    fVar.f27575d = w8.nextInt();
                } else if (strF0.equals("positions")) {
                    fVar.f27576e = w8.O1(iLogger, new b.a());
                } else if (!aVar.a(fVar, strF0, w8, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            fVar.l(map);
            w8.u();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2582w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f27580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f27581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f27582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f27583e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2524m0 {
            @Override // io.sentry.InterfaceC2524m0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(W0 w8, ILogger iLogger) {
                w8.x();
                b bVar = new b();
                HashMap map = null;
                while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strF0 = w8.F0();
                    strF0.getClass();
                    switch (strF0) {
                        case "x":
                            bVar.f27580b = w8.nextFloat();
                            break;
                        case "y":
                            bVar.f27581c = w8.nextFloat();
                            break;
                        case "id":
                            bVar.f27579a = w8.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f27582d = w8.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            w8.t0(iLogger, map, strF0);
                            break;
                    }
                }
                bVar.h(map);
                w8.u();
                return bVar;
            }
        }

        public long e() {
            return this.f27582d;
        }

        public void f(int i8) {
            this.f27579a = i8;
        }

        public void g(long j8) {
            this.f27582d = j8;
        }

        public void h(Map map) {
            this.f27583e = map;
        }

        public void i(float f8) {
            this.f27580b = f8;
        }

        public void j(float f8) {
            this.f27581c = f8;
        }

        @Override // io.sentry.InterfaceC2582w0
        public void serialize(X0 x8, ILogger iLogger) {
            x8.x();
            x8.k("id").a(this.f27579a);
            x8.k("x").b(this.f27580b);
            x8.k("y").b(this.f27581c);
            x8.k("timeOffset").a(this.f27582d);
            Map map = this.f27583e;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f27583e.get(str);
                    x8.k(str);
                    x8.g(iLogger, obj);
                }
            }
            x8.u();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void k(X0 x8, ILogger iLogger) {
        x8.x();
        new d.c().a(this, x8, iLogger);
        List list = this.f27576e;
        if (list != null && !list.isEmpty()) {
            x8.k("positions").g(iLogger, this.f27576e);
        }
        x8.k("pointerId").a(this.f27575d);
        Map map = this.f27578g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27578g.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void l(Map map) {
        this.f27578g = map;
    }

    public void m(int i8) {
        this.f27575d = i8;
    }

    public void n(List list) {
        this.f27576e = list;
    }

    public void o(Map map) {
        this.f27577f = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        new io.sentry.rrweb.b.C0604b().a(this, x8, iLogger);
        x8.k("data");
        k(x8, iLogger);
        Map map = this.f27577f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27577f.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }
}
