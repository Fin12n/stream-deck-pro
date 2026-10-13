package io.sentry;

import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p3 implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f27273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final io.sentry.protocol.u f27282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map f27283k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2524m0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC2596z2.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC2524m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p3 a(W0 w8, ILogger iLogger) throws Exception {
            w8.x();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.u uVarA = null;
            String strG = null;
            String strK0 = null;
            String strK1 = null;
            String strK2 = null;
            String strK3 = null;
            String strK4 = null;
            String strK5 = null;
            io.sentry.protocol.u uVarA2 = null;
            String strK6 = null;
            while (true) {
                io.sentry.protocol.u uVar = uVarA;
                String str = strG;
                if (w8.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (uVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (str == null) {
                        throw c("public_key", iLogger);
                    }
                    p3 p3Var = new p3(uVar, str, strK0, strK1, strK2, strK3, strK4, strK5, uVarA2, strK6);
                    p3Var.c(concurrentHashMap);
                    w8.u();
                    return p3Var;
                }
                String strF0 = w8.F0();
                strF0.getClass();
                byte b8 = -1;
                switch (strF0.hashCode()) {
                    case -454767501:
                        if (strF0.equals("replay_id")) {
                            b8 = 0;
                        }
                        break;
                    case -147132913:
                        if (strF0.equals("user_id")) {
                            b8 = 1;
                        }
                        break;
                    case -85904877:
                        if (strF0.equals("environment")) {
                            b8 = 2;
                        }
                        break;
                    case 153192858:
                        if (strF0.equals("sample_rand")) {
                            b8 = 3;
                        }
                        break;
                    case 153193045:
                        if (strF0.equals("sample_rate")) {
                            b8 = 4;
                        }
                        break;
                    case 1090594823:
                        if (strF0.equals("release")) {
                            b8 = 5;
                        }
                        break;
                    case 1270300245:
                        if (strF0.equals("trace_id")) {
                            b8 = 6;
                        }
                        break;
                    case 1864843258:
                        if (strF0.equals("sampled")) {
                            b8 = 7;
                        }
                        break;
                    case 1904812937:
                        if (strF0.equals("public_key")) {
                            b8 = 8;
                        }
                        break;
                    case 2141246174:
                        if (strF0.equals(WqXA.OeOMXvqbOv)) {
                            b8 = 9;
                        }
                        break;
                }
                switch (b8) {
                    case 0:
                        uVarA2 = new io.sentry.protocol.u.a().a(w8, iLogger);
                        uVarA = uVar;
                        strG = str;
                        break;
                    case 1:
                        strK2 = w8.k0();
                        uVarA = uVar;
                        strG = str;
                        break;
                    case 2:
                        strK1 = w8.k0();
                        uVarA = uVar;
                        strG = str;
                        break;
                    case 3:
                        strK6 = w8.k0();
                        uVarA = uVar;
                        strG = str;
                        break;
                    case 4:
                        strK4 = w8.k0();
                        uVarA = uVar;
                        strG = str;
                        break;
                    case 5:
                        strK0 = w8.k0();
                        uVarA = uVar;
                        strG = str;
                        break;
                    case 6:
                        uVarA = new io.sentry.protocol.u.a().a(w8, iLogger);
                        strG = str;
                        break;
                    case 7:
                        strK5 = w8.k0();
                        uVarA = uVar;
                        strG = str;
                        break;
                    case 8:
                        strG = w8.G();
                        uVarA = uVar;
                        break;
                    case 9:
                        strK3 = w8.k0();
                        uVarA = uVar;
                        strG = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        w8.t0(iLogger, concurrentHashMap, strF0);
                        uVarA = uVar;
                        strG = str;
                        break;
                }
            }
        }
    }

    public p3(io.sentry.protocol.u uVar, String str) {
        this(uVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.f27280h;
    }

    public String b() {
        return this.f27279g;
    }

    public void c(Map map) {
        this.f27283k = map;
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("trace_id").g(iLogger, this.f27273a);
        x8.k("public_key").c(this.f27274b);
        if (this.f27275c != null) {
            x8.k("release").c(this.f27275c);
        }
        if (this.f27276d != null) {
            x8.k("environment").c(this.f27276d);
        }
        if (this.f27277e != null) {
            x8.k("user_id").c(this.f27277e);
        }
        if (this.f27278f != null) {
            x8.k("transaction").c(this.f27278f);
        }
        if (this.f27279g != null) {
            x8.k("sample_rate").c(this.f27279g);
        }
        if (this.f27280h != null) {
            x8.k("sample_rand").c(this.f27280h);
        }
        if (this.f27281i != null) {
            x8.k("sampled").c(this.f27281i);
        }
        if (this.f27282j != null) {
            x8.k("replay_id").g(iLogger, this.f27282j);
        }
        Map map = this.f27283k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27283k.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public p3(io.sentry.protocol.u uVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.u uVar2) {
        this(uVar, str, str2, str3, str4, str5, str6, str7, uVar2, null);
    }

    public p3(io.sentry.protocol.u uVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.u uVar2, String str8) {
        this.f27273a = uVar;
        this.f27274b = str;
        this.f27275c = str2;
        this.f27276d = str3;
        this.f27277e = str4;
        this.f27278f = str5;
        this.f27279g = str6;
        this.f27281i = str7;
        this.f27282j = uVar2;
        this.f27280h = str8;
    }
}
