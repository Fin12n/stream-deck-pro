package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x3 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f27805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f27809e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x3 a(W0 w8, ILogger iLogger) {
            w8.x();
            io.sentry.protocol.u uVarA = null;
            String strK0 = null;
            String strK1 = null;
            String strK2 = null;
            HashMap map = null;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "comments":
                        strK2 = w8.k0();
                        break;
                    case "name":
                        strK0 = w8.k0();
                        break;
                    case "email":
                        strK1 = w8.k0();
                        break;
                    case "event_id":
                        uVarA = new io.sentry.protocol.u.a().a(w8, iLogger);
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
            if (uVarA != null) {
                x3 x3Var = new x3(uVarA, strK0, strK1, strK2);
                x3Var.a(map);
                return x3Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.b(EnumC2596z2.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public x3(io.sentry.protocol.u uVar) {
        this(uVar, null, null, null);
    }

    public void a(Map map) {
        this.f27809e = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("event_id");
        this.f27805a.serialize(x8, iLogger);
        if (this.f27806b != null) {
            x8.k("name").c(this.f27806b);
        }
        if (this.f27807c != null) {
            x8.k("email").c(this.f27807c);
        }
        if (this.f27808d != null) {
            x8.k("comments").c(this.f27808d);
        }
        Map map = this.f27809e;
        if (map != null) {
            for (String str : map.keySet()) {
                x8.k(str).g(iLogger, this.f27809e.get(str));
            }
        }
        x8.u();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f27805a + ", name='" + this.f27806b + "', email='" + this.f27807c + "', comments='" + this.f27808d + "'}";
    }

    public x3(io.sentry.protocol.u uVar, String str, String str2, String str3) {
        this.f27805a = uVar;
        this.f27806b = str;
        this.f27807c = str2;
        this.f27808d = str3;
    }
}
