package io.sentry.protocol;

import T0.Vl.PCRzgdeK;
import com.elgato.streamdeck.vsd2.KnownHost;
import io.sentry.A2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f27497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f27498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f27501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f27503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f27509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f27510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public A2 f27511r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(W0 w8, ILogger iLogger) {
            y yVar = new y();
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -1443345323:
                        if (strF0.equals("image_addr")) {
                            b8 = 0;
                        }
                        break;
                    case -1184392185:
                        if (strF0.equals("in_app")) {
                            b8 = 1;
                        }
                        break;
                    case -1113875953:
                        if (strF0.equals("raw_function")) {
                            b8 = 2;
                        }
                        break;
                    case -1102671691:
                        if (strF0.equals("lineno")) {
                            b8 = 3;
                        }
                        break;
                    case -1068784020:
                        if (strF0.equals("module")) {
                            b8 = 4;
                        }
                        break;
                    case -1052618729:
                        if (strF0.equals("native")) {
                            b8 = 5;
                        }
                        break;
                    case -887523944:
                        if (strF0.equals(PCRzgdeK.EMvKFqipO)) {
                            b8 = 6;
                        }
                        break;
                    case -807062458:
                        if (strF0.equals("package")) {
                            b8 = 7;
                        }
                        break;
                    case -734768633:
                        if (strF0.equals("filename")) {
                            b8 = 8;
                        }
                        break;
                    case -330260936:
                        if (strF0.equals("symbol_addr")) {
                            b8 = 9;
                        }
                        break;
                    case 3327275:
                        if (strF0.equals("lock")) {
                            b8 = 10;
                        }
                        break;
                    case 94842689:
                        if (strF0.equals("colno")) {
                            b8 = 11;
                        }
                        break;
                    case 410194178:
                        if (strF0.equals("instruction_addr")) {
                            b8 = 12;
                        }
                        break;
                    case 1116694660:
                        if (strF0.equals("context_line")) {
                            b8 = 13;
                        }
                        break;
                    case 1380938712:
                        if (strF0.equals("function")) {
                            b8 = 14;
                        }
                        break;
                    case 1713445842:
                        if (strF0.equals("abs_path")) {
                            b8 = 15;
                        }
                        break;
                    case 1874684019:
                        if (strF0.equals(toqHM.ovFcKlYzMW)) {
                            b8 = 16;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        yVar.f27505l = w8.k0();
                        break;
                    case 1:
                        yVar.f27501h = w8.Z0();
                        break;
                    case 2:
                        yVar.f27510q = w8.k0();
                        break;
                    case 3:
                        yVar.f27497d = w8.T();
                        break;
                    case 4:
                        yVar.f27496c = w8.k0();
                        break;
                    case 5:
                        yVar.f27503j = w8.Z0();
                        break;
                    case 6:
                        yVar.f27508o = w8.k0();
                        break;
                    case 7:
                        yVar.f27502i = w8.k0();
                        break;
                    case 8:
                        yVar.f27494a = w8.k0();
                        break;
                    case 9:
                        yVar.f27506m = w8.k0();
                        break;
                    case 10:
                        yVar.f27511r = (A2) w8.m1(iLogger, new A2.a());
                        break;
                    case 11:
                        yVar.f27498e = w8.T();
                        break;
                    case 12:
                        yVar.f27507n = w8.k0();
                        break;
                    case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                        yVar.f27500g = w8.k0();
                        break;
                    case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                        yVar.f27495b = w8.k0();
                        break;
                    case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                        yVar.f27499f = w8.k0();
                        break;
                    case 16:
                        yVar.f27504k = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            yVar.A(concurrentHashMap);
            w8.u();
            return yVar;
        }
    }

    public void A(Map map) {
        this.f27509p = map;
    }

    public String r() {
        return this.f27496c;
    }

    public void s(String str) {
        this.f27494a = str;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27494a != null) {
            x8.k("filename").c(this.f27494a);
        }
        if (this.f27495b != null) {
            x8.k("function").c(this.f27495b);
        }
        if (this.f27496c != null) {
            x8.k("module").c(this.f27496c);
        }
        if (this.f27497d != null) {
            x8.k("lineno").f(this.f27497d);
        }
        if (this.f27498e != null) {
            x8.k("colno").f(this.f27498e);
        }
        if (this.f27499f != null) {
            x8.k("abs_path").c(this.f27499f);
        }
        if (this.f27500g != null) {
            x8.k("context_line").c(this.f27500g);
        }
        if (this.f27501h != null) {
            x8.k("in_app").h(this.f27501h);
        }
        if (this.f27502i != null) {
            x8.k("package").c(this.f27502i);
        }
        if (this.f27503j != null) {
            x8.k("native").h(this.f27503j);
        }
        if (this.f27504k != null) {
            x8.k("platform").c(this.f27504k);
        }
        if (this.f27505l != null) {
            x8.k("image_addr").c(this.f27505l);
        }
        if (this.f27506m != null) {
            x8.k("symbol_addr").c(this.f27506m);
        }
        if (this.f27507n != null) {
            x8.k("instruction_addr").c(this.f27507n);
        }
        if (this.f27510q != null) {
            x8.k("raw_function").c(this.f27510q);
        }
        if (this.f27508o != null) {
            x8.k("symbol").c(this.f27508o);
        }
        if (this.f27511r != null) {
            x8.k("lock").g(iLogger, this.f27511r);
        }
        Map map = this.f27509p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27509p.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public void t(String str) {
        this.f27495b = str;
    }

    public void u(Boolean bool) {
        this.f27501h = bool;
    }

    public void v(Integer num) {
        this.f27497d = num;
    }

    public void w(A2 a8) {
        this.f27511r = a8;
    }

    public void x(String str) {
        this.f27496c = str;
    }

    public void y(Boolean bool) {
        this.f27503j = bool;
    }

    public void z(String str) {
        this.f27502i = str;
    }
}
