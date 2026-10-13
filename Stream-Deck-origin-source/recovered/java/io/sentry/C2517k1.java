package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p027d.LrLN.vHKCAgr;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: renamed from: io.sentry.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2517k1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f27211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f27212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27213c;

    /* JADX INFO: renamed from: io.sentry.k1$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27215b;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            f27215b = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27215b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27215b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[io.sentry.rrweb.d.b.values().length];
            f27214a = iArr2;
            try {
                iArr2[io.sentry.rrweb.d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27214a[io.sentry.rrweb.d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.k1$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2517k1 a(W0 w8, ILogger iLogger) {
            C2517k1 c2517k1 = new C2517k1();
            w8.x();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numT = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals(QhsKALGiniuQ.RrUHdnMqMFgd)) {
                    numT = w8.T();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    w8.t0(iLogger, map, strF0);
                }
            }
            w8.u();
            w8.s(true);
            List list = (List) w8.y1();
            w8.s(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        io.sentry.util.t tVar = new io.sentry.util.t(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i8 = a.f27215b[cVar.ordinal()];
                                byte b8 = 2;
                                if (i8 == 1) {
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        io.sentry.rrweb.d.b bVar = io.sentry.rrweb.d.b.values()[num.intValue()];
                                        int i9 = a.f27214a[bVar.ordinal()];
                                        if (i9 == 1) {
                                            arrayList.add(new io.sentry.rrweb.e.a().a(tVar, iLogger));
                                        } else if (i9 != 2) {
                                            iLogger.c(EnumC2596z2.DEBUG, "Unsupported rrweb incremental snapshot type %s", bVar);
                                        } else {
                                            arrayList.add(new io.sentry.rrweb.f.a().a(tVar, iLogger));
                                        }
                                    }
                                } else if (i8 == 2) {
                                    arrayList.add(new io.sentry.rrweb.g.a().a(tVar, iLogger));
                                } else if (i8 != 3) {
                                    iLogger.c(EnumC2596z2.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map4 = (Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2.hashCode()) {
                                            case -226040934:
                                                b8 = str2.equals("performanceSpan") ? (byte) 0 : (byte) -1;
                                                break;
                                            case 112202875:
                                                b8 = str2.equals("video") ? (byte) 1 : (byte) -1;
                                                break;
                                            case 1106718723:
                                                if (!str2.equals(vHKCAgr.evqQz)) {
                                                    b8 = -1;
                                                }
                                                break;
                                            default:
                                                b8 = -1;
                                                break;
                                        }
                                        switch (b8) {
                                            case 0:
                                                arrayList.add(new io.sentry.rrweb.i.a().a(tVar, iLogger));
                                                break;
                                            case 1:
                                                arrayList.add(new io.sentry.rrweb.j.a().a(tVar, iLogger));
                                                break;
                                            case 2:
                                                arrayList.add(new io.sentry.rrweb.a.C0603a().a(tVar, iLogger));
                                                break;
                                            default:
                                                iLogger.c(EnumC2596z2.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            c2517k1.c(numT);
            c2517k1.b(arrayList);
            c2517k1.d(map);
            return c2517k1;
        }
    }

    public List a() {
        return this.f27212b;
    }

    public void b(List list) {
        this.f27212b = list;
    }

    public void c(Integer num) {
        this.f27211a = num;
    }

    public void d(Map map) {
        this.f27213c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2517k1.class == obj.getClass()) {
            C2517k1 c2517k1 = (C2517k1) obj;
            if (io.sentry.util.u.a(this.f27211a, c2517k1.f27211a) && io.sentry.util.u.a(this.f27212b, c2517k1.f27212b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27211a, this.f27212b);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27211a != null) {
            x8.k("segment_id").f(this.f27211a);
        }
        Map map = this.f27213c;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27213c.get(str));
            }
        }
        x8.u();
        x8.s(true);
        if (this.f27211a != null) {
            x8.e("\n");
        }
        List list = this.f27212b;
        if (list != null) {
            x8.g(iLogger, list);
        }
        x8.s(false);
    }
}
