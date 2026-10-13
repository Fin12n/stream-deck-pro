package io.sentry;

import M6.eLZq.eGwOBWCdOTaKus;
import T0.Vl.PCRzgdeK;
import com.elgato.streamdeck.vsd2.KnownHost;
import io.sentry.protocol.C2541c;
import io.sentry.protocol.C2542d;
import io.sentry.util.AbstractC2571c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.u f25966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2541c f25967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.sentry.protocol.o f25968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.sentry.protocol.l f25969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f25970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f25973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.sentry.protocol.F f25974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient Throwable f25975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f25977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f25978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2542d f25979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f25980o;

    public P1(io.sentry.protocol.u uVar) {
        this.f25967b = new C2541c();
        this.f25966a = uVar;
    }

    public List B() {
        return this.f25978m;
    }

    public C2541c C() {
        return this.f25967b;
    }

    public C2542d D() {
        return this.f25979n;
    }

    public String E() {
        return this.f25977l;
    }

    public String F() {
        return this.f25972g;
    }

    public io.sentry.protocol.u G() {
        return this.f25966a;
    }

    public Map H() {
        return this.f25980o;
    }

    public String I() {
        return this.f25973h;
    }

    public String J() {
        return this.f25971f;
    }

    public io.sentry.protocol.l K() {
        return this.f25969d;
    }

    public io.sentry.protocol.o L() {
        return this.f25968c;
    }

    public String M() {
        return this.f25976k;
    }

    public Map N() {
        return this.f25970e;
    }

    public Throwable O() {
        Throwable th = this.f25975j;
        return th instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th).c() : th;
    }

    public Throwable P() {
        return this.f25975j;
    }

    public io.sentry.protocol.F Q() {
        return this.f25974i;
    }

    public void R(List list) {
        this.f25978m = AbstractC2571c.a(list);
    }

    public void S(C2542d c2542d) {
        this.f25979n = c2542d;
    }

    public void T(String str) {
        this.f25977l = str;
    }

    public void U(String str) {
        this.f25972g = str;
    }

    public void V(io.sentry.protocol.u uVar) {
        this.f25966a = uVar;
    }

    public void W(Map map) {
        this.f25980o = AbstractC2571c.c(map);
    }

    public void X(String str) {
        this.f25973h = str;
    }

    public void Y(String str) {
        this.f25971f = str;
    }

    public void Z(io.sentry.protocol.l lVar) {
        this.f25969d = lVar;
    }

    public void a0(io.sentry.protocol.o oVar) {
        this.f25968c = oVar;
    }

    public void b0(String str) {
        this.f25976k = str;
    }

    public void c0(String str, String str2) {
        if (this.f25970e == null) {
            this.f25970e = new HashMap();
        }
        this.f25970e.put(str, str2);
    }

    public void d0(Map map) {
        this.f25970e = AbstractC2571c.c(map);
    }

    public void e0(io.sentry.protocol.F f8) {
        this.f25974i = f8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public boolean a(P1 p8, String str, W0 w8, ILogger iLogger) {
            str.getClass();
            byte b8 = -1;
            switch (str.hashCode()) {
                case -1840434063:
                    if (str.equals(vHKCAgr.IFFUFKYUiUOEC)) {
                        b8 = 0;
                    }
                    break;
                case -758770169:
                    if (str.equals("server_name")) {
                        b8 = 1;
                    }
                    break;
                case -567312220:
                    if (str.equals("contexts")) {
                        b8 = 2;
                    }
                    break;
                case -85904877:
                    if (str.equals(PCRzgdeK.jKz)) {
                        b8 = 3;
                    }
                    break;
                case -51457840:
                    if (str.equals("breadcrumbs")) {
                        b8 = 4;
                    }
                    break;
                case 113722:
                    if (str.equals("sdk")) {
                        b8 = 5;
                    }
                    break;
                case 3083686:
                    if (str.equals("dist")) {
                        b8 = 6;
                    }
                    break;
                case 3552281:
                    if (str.equals("tags")) {
                        b8 = 7;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        b8 = 8;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b8 = 9;
                    }
                    break;
                case 278118624:
                    if (str.equals("event_id")) {
                        b8 = 10;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        b8 = 11;
                    }
                    break;
                case 1095692943:
                    if (str.equals("request")) {
                        b8 = 12;
                    }
                    break;
                case 1874684019:
                    if (str.equals("platform")) {
                        b8 = 13;
                    }
                    break;
            }
            switch (b8) {
                case 0:
                    p8.f25979n = (C2542d) w8.m1(iLogger, new C2542d.a());
                    return true;
                case 1:
                    p8.f25976k = w8.k0();
                    return true;
                case 2:
                    p8.f25967b.k(new C2541c.a().a(w8, iLogger));
                    return true;
                case 3:
                    p8.f25972g = w8.k0();
                    return true;
                case 4:
                    p8.f25978m = w8.O1(iLogger, new C2491e.a());
                    return true;
                case 5:
                    p8.f25968c = (io.sentry.protocol.o) w8.m1(iLogger, new io.sentry.protocol.o.a());
                    return true;
                case 6:
                    p8.f25977l = w8.k0();
                    return true;
                case 7:
                    p8.f25970e = AbstractC2571c.b((Map) w8.y1());
                    return true;
                case 8:
                    p8.f25974i = (io.sentry.protocol.F) w8.m1(iLogger, new io.sentry.protocol.F.a());
                    return true;
                case 9:
                    p8.f25980o = AbstractC2571c.b((Map) w8.y1());
                    return true;
                case 10:
                    p8.f25966a = (io.sentry.protocol.u) w8.m1(iLogger, new io.sentry.protocol.u.a());
                    return true;
                case 11:
                    p8.f25971f = w8.k0();
                    return true;
                case 12:
                    p8.f25969d = (io.sentry.protocol.l) w8.m1(iLogger, new io.sentry.protocol.l.a());
                    return true;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    p8.f25973h = w8.k0();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public void a(P1 p8, X0 x8, ILogger iLogger) {
            if (p8.f25966a != null) {
                x8.k("event_id").g(iLogger, p8.f25966a);
            }
            x8.k("contexts").g(iLogger, p8.f25967b);
            if (p8.f25968c != null) {
                x8.k("sdk").g(iLogger, p8.f25968c);
            }
            if (p8.f25969d != null) {
                x8.k("request").g(iLogger, p8.f25969d);
            }
            if (p8.f25970e != null && !p8.f25970e.isEmpty()) {
                x8.k("tags").g(iLogger, p8.f25970e);
            }
            if (p8.f25971f != null) {
                x8.k("release").c(p8.f25971f);
            }
            if (p8.f25972g != null) {
                x8.k("environment").c(p8.f25972g);
            }
            if (p8.f25973h != null) {
                x8.k("platform").c(p8.f25973h);
            }
            if (p8.f25974i != null) {
                x8.k("user").g(iLogger, p8.f25974i);
            }
            if (p8.f25976k != null) {
                x8.k(eGwOBWCdOTaKus.kuTI).c(p8.f25976k);
            }
            if (p8.f25977l != null) {
                x8.k("dist").c(p8.f25977l);
            }
            if (p8.f25978m != null && !p8.f25978m.isEmpty()) {
                x8.k("breadcrumbs").g(iLogger, p8.f25978m);
            }
            if (p8.f25979n != null) {
                x8.k("debug_meta").g(iLogger, p8.f25979n);
            }
            if (p8.f25980o != null && !p8.f25980o.isEmpty()) {
                x8.k("extra").g(iLogger, p8.f25980o);
            }
        }
    }

    public P1() {
        this(new io.sentry.protocol.u());
    }
}
