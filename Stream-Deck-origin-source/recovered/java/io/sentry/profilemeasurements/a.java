package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import io.sentry.util.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f27284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f27286c;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0601a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(W0 w8, ILogger iLogger) {
            w8.x();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                if (strF0.equals("values")) {
                    List listO1 = w8.O1(iLogger, new b.a());
                    if (listO1 != null) {
                        aVar.f27286c = listO1;
                    }
                } else if (strF0.equals("unit")) {
                    String strK0 = w8.k0();
                    if (strK0 != null) {
                        aVar.f27285b = strK0;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    w8.t0(iLogger, concurrentHashMap, strF0);
                }
            }
            aVar.c(concurrentHashMap);
            w8.u();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(Map map) {
        this.f27284a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (u.a(this.f27284a, aVar.f27284a) && this.f27285b.equals(aVar.f27285b) && new ArrayList(this.f27286c).equals(new ArrayList(aVar.f27286c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return u.b(this.f27284a, this.f27285b, this.f27286c);
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("unit").g(iLogger, this.f27285b);
        x8.k("values").g(iLogger, this.f27286c);
        Map map = this.f27284a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27284a.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public a(String str, Collection<b> collection) {
        this.f27285b = str;
        this.f27286c = collection;
    }
}
