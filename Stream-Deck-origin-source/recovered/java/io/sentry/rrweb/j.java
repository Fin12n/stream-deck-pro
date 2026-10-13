package io.sentry.rrweb;

import D6.iIQ.BmWxZhjGfw;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends b implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f27604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f27615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map f27616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f27617r;

    public j() {
        super(c.Custom);
        this.f27606g = "h264";
        this.f27607h = "mp4";
        this.f27611l = "constant";
        this.f27602c = "video";
    }

    private void t(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("tag").c(this.f27602c);
        x8.k("payload");
        u(x8, iLogger);
        Map map = this.f27617r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27617r.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    private void u(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("segmentId").a(this.f27603d);
        x8.k("size").a(this.f27604e);
        x8.k("duration").a(this.f27605f);
        x8.k("encoding").c(this.f27606g);
        x8.k("container").c(this.f27607h);
        x8.k("height").a(this.f27608i);
        x8.k("width").a(this.f27609j);
        x8.k("frameCount").a(this.f27610k);
        x8.k("frameRate").a(this.f27612m);
        x8.k("frameRateType").c(this.f27611l);
        x8.k("left").a(this.f27613n);
        x8.k("top").a(this.f27614o);
        Map map = this.f27616q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27616q.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void A(int i8) {
        this.f27613n = i8;
    }

    public void B(Map map) {
        this.f27616q = map;
    }

    public void C(int i8) {
        this.f27603d = i8;
    }

    public void D(long j8) {
        this.f27604e = j8;
    }

    public void E(int i8) {
        this.f27614o = i8;
    }

    public void F(Map map) {
        this.f27615p = map;
    }

    public void G(int i8) {
        this.f27609j = i8;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f27603d == jVar.f27603d && this.f27604e == jVar.f27604e && this.f27605f == jVar.f27605f && this.f27608i == jVar.f27608i && this.f27609j == jVar.f27609j && this.f27610k == jVar.f27610k && this.f27612m == jVar.f27612m && this.f27613n == jVar.f27613n && this.f27614o == jVar.f27614o && u.a(this.f27602c, jVar.f27602c) && u.a(this.f27606g, jVar.f27606g) && u.a(this.f27607h, jVar.f27607h) && u.a(this.f27611l, jVar.f27611l);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return u.b(Integer.valueOf(super.hashCode()), this.f27602c, Integer.valueOf(this.f27603d), Long.valueOf(this.f27604e), Long.valueOf(this.f27605f), this.f27606g, this.f27607h, Integer.valueOf(this.f27608i), Integer.valueOf(this.f27609j), Integer.valueOf(this.f27610k), this.f27611l, Integer.valueOf(this.f27612m), Integer.valueOf(this.f27613n), Integer.valueOf(this.f27614o));
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        new b.C0604b().a(this, x8, iLogger);
        x8.k("data");
        t(x8, iLogger);
        Map map = this.f27615p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27615p.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void v(Map map) {
        this.f27617r = map;
    }

    public void w(long j8) {
        this.f27605f = j8;
    }

    public void x(int i8) {
        this.f27610k = i8;
    }

    public void y(int i8) {
        this.f27612m = i8;
    }

    public void z(int i8) {
        this.f27608i = i8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        public final void c(j jVar, W0 w8, ILogger iLogger) {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("payload")) {
                    d(jVar, w8, iLogger);
                } else if (strF0.equals("tag")) {
                    String strK0 = w8.k0();
                    if (strK0 == null) {
                        strK0 = "";
                    }
                    jVar.f27602c = strK0;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w8.t0(iLogger, concurrentHashMap, strF0);
                }
            }
            jVar.v(concurrentHashMap);
            w8.u();
        }

        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(W0 w8, ILogger iLogger) {
            w8.x();
            j jVar = new j();
            b.a aVar = new b.a();
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (!strF0.equals(BmWxZhjGfw.uKywscepSrfOQ)) {
                    if (!aVar.a(jVar, strF0, w8, iLogger)) {
                        if (map == null) {
                            map = new HashMap();
                        }
                        w8.t0(iLogger, map, strF0);
                    }
                } else {
                    c(jVar, w8, iLogger);
                }
            }
            jVar.F(map);
            w8.u();
            return jVar;
        }

        public final void d(j jVar, W0 w8, ILogger iLogger) {
            long jLongValue;
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                int iIntValue = 0;
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -1992012396:
                        if (strF0.equals("duration")) {
                            b8 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strF0.equals("segmentId")) {
                            b8 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strF0.equals("height")) {
                            b8 = 2;
                        }
                        break;
                    case -410956671:
                        if (strF0.equals(GOKsbdzhLhXAMt.KTjeuAFohAg)) {
                            b8 = 3;
                        }
                        break;
                    case -296512606:
                        if (strF0.equals("frameCount")) {
                            b8 = 4;
                        }
                        break;
                    case 115029:
                        if (strF0.equals("top")) {
                            b8 = 5;
                        }
                        break;
                    case 3317767:
                        if (strF0.equals("left")) {
                            b8 = 6;
                        }
                        break;
                    case 3530753:
                        if (strF0.equals("size")) {
                            b8 = 7;
                        }
                        break;
                    case 113126854:
                        if (strF0.equals("width")) {
                            b8 = 8;
                        }
                        break;
                    case 545057773:
                        if (strF0.equals("frameRate")) {
                            b8 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strF0.equals("encoding")) {
                            b8 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strF0.equals("frameRateType")) {
                            b8 = 11;
                        }
                        break;
                }
                String str = "";
                switch (b8) {
                    case 0:
                        jVar.f27605f = w8.nextLong();
                        break;
                    case 1:
                        jVar.f27603d = w8.nextInt();
                        break;
                    case 2:
                        Integer numT = w8.T();
                        if (numT != null) {
                            iIntValue = numT.intValue();
                        }
                        jVar.f27608i = iIntValue;
                        break;
                    case 3:
                        String strK0 = w8.k0();
                        if (strK0 != null) {
                            str = strK0;
                        }
                        jVar.f27607h = str;
                        break;
                    case 4:
                        Integer numT2 = w8.T();
                        if (numT2 != null) {
                            iIntValue = numT2.intValue();
                        }
                        jVar.f27610k = iIntValue;
                        break;
                    case 5:
                        Integer numT3 = w8.T();
                        if (numT3 != null) {
                            iIntValue = numT3.intValue();
                        }
                        jVar.f27614o = iIntValue;
                        break;
                    case 6:
                        Integer numT4 = w8.T();
                        if (numT4 != null) {
                            iIntValue = numT4.intValue();
                        }
                        jVar.f27613n = iIntValue;
                        break;
                    case 7:
                        Long lA0 = w8.a0();
                        if (lA0 == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = lA0.longValue();
                        }
                        jVar.f27604e = jLongValue;
                        break;
                    case 8:
                        Integer numT5 = w8.T();
                        if (numT5 != null) {
                            iIntValue = numT5.intValue();
                        }
                        jVar.f27609j = iIntValue;
                        break;
                    case 9:
                        Integer numT6 = w8.T();
                        if (numT6 != null) {
                            iIntValue = numT6.intValue();
                        }
                        jVar.f27612m = iIntValue;
                        break;
                    case 10:
                        String strK1 = w8.k0();
                        if (strK1 != null) {
                            str = strK1;
                        }
                        jVar.f27606g = str;
                        break;
                    case 11:
                        String strK2 = w8.k0();
                        if (strK2 != null) {
                            str = strK2;
                        }
                        jVar.f27611l = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            jVar.B(concurrentHashMap);
            w8.u();
        }
    }
}
