package io.sentry;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2553r2 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC2592y2 f27544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable f27546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f27548g;

    /* JADX INFO: renamed from: io.sentry.r2$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2553r2 a(W0 w8, ILogger iLogger) throws Exception {
            w8.x();
            HashMap map = null;
            EnumC2592y2 enumC2592y2 = null;
            String strK0 = null;
            String strK1 = null;
            String strK2 = null;
            int iNextInt = 0;
            while (w8.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strF0 = w8.F0();
                strF0.getClass();
                switch (strF0) {
                    case "length":
                        iNextInt = w8.nextInt();
                        break;
                    case "filename":
                        strK1 = w8.k0();
                        break;
                    case "attachment_type":
                        strK2 = w8.k0();
                        break;
                    case "type":
                        enumC2592y2 = (EnumC2592y2) w8.m1(iLogger, new EnumC2592y2.a());
                        break;
                    case "content_type":
                        strK0 = w8.k0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        w8.t0(iLogger, map, strF0);
                        break;
                }
            }
            if (enumC2592y2 == null) {
                throw c("type", iLogger);
            }
            C2553r2 c2553r2 = new C2553r2(enumC2592y2, iNextInt, strK0, strK1, strK2);
            c2553r2.c(map);
            w8.u();
            return c2553r2;
        }

        public final Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC2596z2.ERROR, str2, illegalStateException);
            return illegalStateException;
        }
    }

    public C2553r2(EnumC2592y2 enumC2592y2, int i8, String str, String str2, String str3) {
        this.f27544c = (EnumC2592y2) io.sentry.util.u.c(enumC2592y2, "type is required");
        this.f27542a = str;
        this.f27545d = i8;
        this.f27543b = str2;
        this.f27546e = null;
        this.f27547f = str3;
    }

    public int a() {
        Callable callable = this.f27546e;
        if (callable == null) {
            return this.f27545d;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public EnumC2592y2 b() {
        return this.f27544c;
    }

    public void c(Map map) {
        this.f27548g = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        if (this.f27542a != null) {
            x8.k("content_type").c(this.f27542a);
        }
        if (this.f27543b != null) {
            x8.k("filename").c(this.f27543b);
        }
        x8.k(LYdqVGvOGMNr.WjMHGUMIBMSFsI).g(iLogger, this.f27544c);
        if (this.f27547f != null) {
            x8.k("attachment_type").c(this.f27547f);
        }
        x8.k("length").a(a());
        Map map = this.f27548g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27548g.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public C2553r2(EnumC2592y2 enumC2592y2, Callable callable, String str, String str2, String str3) {
        this.f27544c = (EnumC2592y2) io.sentry.util.u.c(enumC2592y2, "type is required");
        this.f27542a = str;
        this.f27545d = -1;
        this.f27543b = str2;
        this.f27546e = callable;
        this.f27547f = str3;
    }

    public C2553r2(EnumC2592y2 enumC2592y2, Callable callable, String str, String str2) {
        this(enumC2592y2, callable, str, str2, (String) null);
    }
}
