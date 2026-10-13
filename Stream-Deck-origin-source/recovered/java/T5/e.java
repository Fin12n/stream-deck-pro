package T5;

import X5.C1692v;
import X5.InterfaceC1684m;
import X5.T;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f9903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1692v f9904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1684m f9905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p007a6.c f9906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1815v0 f9907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2692b f9908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f9909g;

    public e(T url, C1692v method, InterfaceC1684m headers, p007a6.c body, InterfaceC1815v0 executionContext, InterfaceC2692b attributes) {
        Set setKeySet;
        t.g(url, "url");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(body, "body");
        t.g(executionContext, "executionContext");
        t.g(attributes, "attributes");
        this.f9903a = url;
        this.f9904b = method;
        this.f9905c = headers;
        this.f9906d = body;
        this.f9907e = executionContext;
        this.f9908f = attributes;
        Map map = (Map) attributes.e(J5.f.a());
        this.f9909g = (map == null || (setKeySet = map.keySet()) == null) ? D6.T.d() : setKeySet;
    }

    public final InterfaceC2692b a() {
        return this.f9908f;
    }

    public final p007a6.c b() {
        return this.f9906d;
    }

    public final Object c(J5.e key) {
        t.g(key, "key");
        Map map = (Map) this.f9908f.e(J5.f.a());
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final InterfaceC1815v0 d() {
        return this.f9907e;
    }

    public final InterfaceC1684m e() {
        return this.f9905c;
    }

    public final C1692v f() {
        return this.f9904b;
    }

    public final Set g() {
        return this.f9909g;
    }

    public final T h() {
        return this.f9903a;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.f9903a + ", method=" + this.f9904b + ')';
    }
}
