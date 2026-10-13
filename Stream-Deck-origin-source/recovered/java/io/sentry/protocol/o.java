package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C2588x2;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2524m0;
import io.sentry.InterfaceC2582w0;
import io.sentry.W0;
import io.sentry.X0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f27457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f27458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f27459e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(W0 w8, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            w8.x();
            String strG = null;
            String strG2 = null;
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "name":
                        strG = w8.G();
                        break;
                    case "version":
                        strG2 = w8.G();
                        break;
                    case "packages":
                        List listO1 = w8.O1(iLogger, new v.a());
                        if (listO1 == null) {
                            break;
                        } else {
                            arrayList.addAll(listO1);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) w8.y1();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        w8.t0(iLogger, map, strF0);
                        break;
                }
            }
            w8.u();
            if (strG == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC2596z2.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strG2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.b(EnumC2596z2.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            o oVar = new o(strG, strG2);
            oVar.f27457c = new CopyOnWriteArraySet(arrayList);
            oVar.f27458d = new CopyOnWriteArraySet(arrayList2);
            oVar.i(map);
            return oVar;
        }
    }

    public o(String str, String str2) {
        this.f27455a = (String) io.sentry.util.u.c(str, "name is required.");
        this.f27456b = (String) io.sentry.util.u.c(str2, "version is required.");
    }

    public static o k(o oVar, String str, String str2) {
        io.sentry.util.u.c(str, "name is required.");
        io.sentry.util.u.c(str2, "version is required.");
        if (oVar == null) {
            return new o(str, str2);
        }
        oVar.h(str);
        oVar.j(str2);
        return oVar;
    }

    public void c(String str, String str2) {
        C2588x2.c().b(str, str2);
    }

    public Set d() {
        Set set = this.f27458d;
        return set != null ? set : C2588x2.c().d();
    }

    public String e() {
        return this.f27455a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f27455a.equals(oVar.f27455a) && this.f27456b.equals(oVar.f27456b)) {
                return true;
            }
        }
        return false;
    }

    public Set f() {
        Set set = this.f27457c;
        return set != null ? set : C2588x2.c().e();
    }

    public String g() {
        return this.f27456b;
    }

    public void h(String str) {
        this.f27455a = (String) io.sentry.util.u.c(str, "name is required.");
    }

    public int hashCode() {
        return io.sentry.util.u.b(this.f27455a, this.f27456b);
    }

    public void i(Map map) {
        this.f27459e = map;
    }

    public void j(String str) {
        this.f27456b = (String) io.sentry.util.u.c(str, "version is required.");
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("name").c(this.f27455a);
        x8.k(DiagnosticsEntry.VERSION_KEY).c(this.f27456b);
        Set setF = f();
        Set setD = d();
        if (!setF.isEmpty()) {
            x8.k("packages").g(iLogger, setF);
        }
        if (!setD.isEmpty()) {
            x8.k("integrations").g(iLogger, setD);
        }
        Map map = this.f27459e;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27459e.get(str));
            }
        }
        x8.u();
    }
}
