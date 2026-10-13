package O5;

import X5.C1693w;
import X5.InterfaceC1684m;
import X5.T;
import X5.x;
import java.util.Map;
import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f8693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f8694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p141p6.c f8695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p141p6.c f8696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1693w f8697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p141p6.c f8698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1684m f8699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f8700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f8701i;

    public final b a(Map varyKeys, p141p6.c expires) {
        t.g(varyKeys, "varyKeys");
        t.g(expires, "expires");
        return new b(this.f8693a, this.f8694b, this.f8695c, this.f8696d, this.f8697e, expires, this.f8699g, varyKeys, this.f8701i);
    }

    public final byte[] b() {
        return this.f8701i;
    }

    public final p141p6.c c() {
        return this.f8698f;
    }

    public final InterfaceC1684m d() {
        return this.f8699g;
    }

    public final p141p6.c e() {
        return this.f8695c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f8693a, bVar.f8693a) && t.c(this.f8700h, bVar.f8700h);
    }

    public final p141p6.c f() {
        return this.f8696d;
    }

    public final x g() {
        return this.f8694b;
    }

    public final T h() {
        return this.f8693a;
    }

    public int hashCode() {
        return (this.f8693a.hashCode() * 31) + this.f8700h.hashCode();
    }

    public final Map i() {
        return this.f8700h;
    }

    public final C1693w j() {
        return this.f8697e;
    }

    public b(T url, x statusCode, p141p6.c requestTime, p141p6.c responseTime, C1693w version, p141p6.c cVar, InterfaceC1684m interfaceC1684m, Map<String, String> varyKeys, byte[] body) {
        t.g(url, "url");
        t.g(statusCode, "statusCode");
        t.g(requestTime, "requestTime");
        t.g(responseTime, "responseTime");
        t.g(version, "version");
        t.g(cVar, RaiWHuj.PWLDAUi);
        t.g(interfaceC1684m, BpgIURjN.cjpgNrdvYv);
        t.g(varyKeys, "varyKeys");
        t.g(body, "body");
        this.f8693a = url;
        this.f8694b = statusCode;
        this.f8695c = requestTime;
        this.f8696d = responseTime;
        this.f8697e = version;
        this.f8698f = cVar;
        this.f8699g = interfaceC1684m;
        this.f8700h = varyKeys;
        this.f8701i = body;
    }
}
