package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K2 extends P1 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public File f25916p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f25920t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Date f25922v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map f25926z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public io.sentry.protocol.u f25919s = new io.sentry.protocol.u();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f25917q = "replay_event";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f25918r = b.SESSION;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f25924x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f25925y = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f25923w = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Date f25921u = AbstractC2519l.c();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K2 a(W0 w8, ILogger iLogger) {
            P1.a aVar = new P1.a();
            K2 k8 = new K2();
            w8.x();
            String strK0 = null;
            b bVar = null;
            Integer numT = null;
            Date dateS0 = null;
            HashMap map = null;
            io.sentry.protocol.u uVar = null;
            Date dateS1 = null;
            List list = null;
            List list2 = null;
            List list3 = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "replay_id":
                        uVar = (io.sentry.protocol.u) w8.m1(iLogger, new io.sentry.protocol.u.a());
                        break;
                    case "replay_start_timestamp":
                        dateS1 = w8.S0(iLogger);
                        break;
                    case "type":
                        strK0 = w8.k0();
                        break;
                    case "urls":
                        list = (List) w8.y1();
                        break;
                    case "timestamp":
                        dateS0 = w8.S0(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) w8.y1();
                        break;
                    case "trace_ids":
                        list3 = (List) w8.y1();
                        break;
                    case "replay_type":
                        bVar = (b) w8.m1(iLogger, new b.a());
                        break;
                    case "segment_id":
                        numT = w8.T();
                        break;
                    default:
                        if (!aVar.a(k8, strF0, w8, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            w8.t0(iLogger, map, strF0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            w8.u();
            if (strK0 != null) {
                k8.o0(strK0);
            }
            if (bVar != null) {
                k8.k0(bVar);
            }
            if (numT != null) {
                k8.l0(numT.intValue());
            }
            if (dateS0 != null) {
                k8.m0(dateS0);
            }
            k8.i0(uVar);
            k8.j0(dateS1);
            k8.q0(list);
            k8.h0(list2);
            k8.n0(list3);
            k8.p0(map);
            return k8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b implements InterfaceC2582w0 {
        SESSION,
        BUFFER;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2524m0 {
            @Override // io.sentry.InterfaceC2524m0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(W0 w8, ILogger iLogger) {
                return b.valueOf(w8.G().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC2582w0
        public void serialize(X0 x8, ILogger iLogger) {
            x8.c(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K2.class == obj.getClass()) {
            K2 k8 = (K2) obj;
            if (this.f25920t == k8.f25920t && io.sentry.util.u.a(this.f25917q, k8.f25917q) && this.f25918r == k8.f25918r && io.sentry.util.u.a(this.f25919s, k8.f25919s) && io.sentry.util.u.a(this.f25923w, k8.f25923w) && io.sentry.util.u.a(this.f25924x, k8.f25924x) && io.sentry.util.u.a(this.f25925y, k8.f25925y)) {
                return true;
            }
        }
        return false;
    }

    public Date f0() {
        return this.f25921u;
    }

    public File g0() {
        return this.f25916p;
    }

    public void h0(List list) {
        this.f25924x = list;
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f25917q, this.f25918r, this.f25919s, Integer.valueOf(this.f25920t), this.f25923w, this.f25924x, this.f25925y);
    }

    public void i0(io.sentry.protocol.u uVar) {
        this.f25919s = uVar;
    }

    public void j0(Date date) {
        this.f25922v = date;
    }

    public void k0(b bVar) {
        this.f25918r = bVar;
    }

    public void l0(int i8) {
        this.f25920t = i8;
    }

    public void m0(Date date) {
        this.f25921u = date;
    }

    public void n0(List list) {
        this.f25925y = list;
    }

    public void o0(String str) {
        this.f25917q = str;
    }

    public void p0(Map map) {
        this.f25926z = map;
    }

    public void q0(List list) {
        this.f25923w = list;
    }

    public void r0(File file) {
        this.f25916p = file;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("type").c(this.f25917q);
        x8.k("replay_type").g(iLogger, this.f25918r);
        x8.k("segment_id").a(this.f25920t);
        x8.k(DiagnosticsEntry.TIMESTAMP_KEY).g(iLogger, this.f25921u);
        if (this.f25919s != null) {
            x8.k("replay_id").g(iLogger, this.f25919s);
        }
        if (this.f25922v != null) {
            x8.k("replay_start_timestamp").g(iLogger, this.f25922v);
        }
        if (this.f25923w != null) {
            x8.k("urls").g(iLogger, this.f25923w);
        }
        if (this.f25924x != null) {
            x8.k("error_ids").g(iLogger, this.f25924x);
        }
        if (this.f25925y != null) {
            x8.k("trace_ids").g(iLogger, this.f25925y);
        }
        new P1.b().a(this, x8, iLogger);
        Map map = this.f25926z;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f25926z.get(str));
            }
        }
        x8.u();
    }
}
