package io.sentry.protocol;

import Z.JTT.ryTuoS;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.AbstractC2571c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f27480d;

    public w() {
    }

    public String d() {
        return this.f27477a;
    }

    public String e() {
        return this.f27478b;
    }

    public void f(String str) {
        this.f27477a = str;
    }

    public void g(Map map) {
        this.f27480d = map;
    }

    public void h(String str) {
        this.f27478b = str;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27477a != null) {
            x8.k("name").c(this.f27477a);
        }
        if (this.f27478b != null) {
            x8.k(DiagnosticsEntry.VERSION_KEY).c(this.f27478b);
        }
        if (this.f27479c != null) {
            x8.k("raw_description").c(this.f27479c);
        }
        Map map = this.f27480d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27480d.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(W0 w8, ILogger iLogger) {
            w8.x();
            w wVar = new w();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -339173787:
                        if (strF0.equals("raw_description")) {
                            b8 = 0;
                        }
                        break;
                    case 3373707:
                        if (strF0.equals(ryTuoS.cLommgchoI)) {
                            b8 = 1;
                        }
                        break;
                    case 351608024:
                        if (strF0.equals(DiagnosticsEntry.VERSION_KEY)) {
                            b8 = 2;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        wVar.f27479c = w8.k0();
                        break;
                    case 1:
                        wVar.f27477a = w8.k0();
                        break;
                    case 2:
                        wVar.f27478b = w8.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        break;
                }
            }
            wVar.g(concurrentHashMap);
            w8.u();
            return wVar;
        }
    }

    public w(w wVar) {
        this.f27477a = wVar.f27477a;
        this.f27478b = wVar.f27478b;
        this.f27479c = wVar.f27479c;
        this.f27480d = AbstractC2571c.b(wVar.f27480d);
    }
}
