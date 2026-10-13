package T5;

import X5.C1693w;
import X5.InterfaceC1684m;
import X5.x;
import kotlin.jvm.internal.t;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f9918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p141p6.c f9919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1684m f9920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1693w f9921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G6.g f9923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p141p6.c f9924g;

    public final Object a() {
        return this.f9922e;
    }

    public final G6.g b() {
        return this.f9923f;
    }

    public final InterfaceC1684m c() {
        return this.f9920c;
    }

    public final p141p6.c d() {
        return this.f9919b;
    }

    public final p141p6.c e() {
        return this.f9924g;
    }

    public final x f() {
        return this.f9918a;
    }

    public final C1693w g() {
        return this.f9921d;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f9918a + ')';
    }

    public h(x statusCode, p141p6.c requestTime, InterfaceC1684m headers, C1693w version, Object obj, G6.g callContext) {
        t.g(statusCode, "statusCode");
        t.g(requestTime, "requestTime");
        t.g(headers, "headers");
        t.g(version, "version");
        t.g(obj, hJroAgFztiMK.wJDEpwe);
        t.g(callContext, "callContext");
        this.f9918a = statusCode;
        this.f9919b = requestTime;
        this.f9920c = headers;
        this.f9921d = version;
        this.f9922e = obj;
        this.f9923f = callContext;
        this.f9924g = p141p6.a.c(null, 1, null);
    }
}
