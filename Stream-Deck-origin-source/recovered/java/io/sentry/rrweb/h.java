package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC2582w0;
import io.sentry.J2;
import io.sentry.L2;
import io.sentry.X0;
import io.sentry.protocol.o;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends b implements InterfaceC2582w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f27590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f27591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f27592f;

    public h() {
        super(c.Custom);
        this.f27590d = new HashMap();
        this.f27589c = "options";
    }

    private void g(X0 x8, ILogger iLogger) {
        x8.x();
        x8.k("tag").c(this.f27589c);
        x8.k("payload");
        h(x8, iLogger);
        Map map = this.f27592f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27592f.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    private void h(X0 x8, ILogger iLogger) {
        x8.x();
        Map map = this.f27590d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27590d.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    @Override // io.sentry.InterfaceC2582w0
    public void serialize(X0 x8, ILogger iLogger) {
        x8.x();
        new b.C0604b().a(this, x8, iLogger);
        x8.k("data");
        g(x8, iLogger);
        Map map = this.f27591e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f27591e.get(str);
                x8.k(str);
                x8.g(iLogger, obj);
            }
        }
        x8.u();
    }

    public h(J2 j8) {
        this();
        o sdkVersion = j8.getSdkVersion();
        if (sdkVersion != null) {
            this.f27590d.put("nativeSdkName", sdkVersion.e());
            this.f27590d.put("nativeSdkVersion", sdkVersion.g());
        }
        L2 sessionReplay = j8.getSessionReplay();
        this.f27590d.put("errorSampleRate", sessionReplay.g());
        this.f27590d.put("sessionSampleRate", sessionReplay.k());
        this.f27590d.put("maskAllImages", Boolean.valueOf(sessionReplay.e().contains("android.widget.ImageView")));
        this.f27590d.put("maskAllText", Boolean.valueOf(sessionReplay.e().contains("android.widget.TextView")));
        this.f27590d.put("quality", sessionReplay.h().serializedName());
        this.f27590d.put("maskedViewClasses", sessionReplay.e());
        this.f27590d.put("unmaskedViewClasses", sessionReplay.m());
    }
}
