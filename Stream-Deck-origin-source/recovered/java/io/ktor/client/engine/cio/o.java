package io.ktor.client.engine.cio;

import io.jentz.winter.js.HRHLwtyqJWz;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1812u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T5.e f24964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1812u f24965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G6.g f24966c;

    public o(T5.e request, InterfaceC1812u response, G6.g context) {
        t.g(request, "request");
        t.g(response, "response");
        t.g(context, "context");
        this.f24964a = request;
        this.f24965b = response;
        this.f24966c = context;
    }

    public final G6.g a() {
        return this.f24966c;
    }

    public final T5.e b() {
        return this.f24964a;
    }

    public final InterfaceC1812u c() {
        return this.f24965b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return t.c(this.f24964a, oVar.f24964a) && t.c(this.f24965b, oVar.f24965b) && t.c(this.f24966c, oVar.f24966c);
    }

    public int hashCode() {
        return (((this.f24964a.hashCode() * 31) + this.f24965b.hashCode()) * 31) + this.f24966c.hashCode();
    }

    public String toString() {
        return "RequestTask(request=" + this.f24964a + HRHLwtyqJWz.KztEYKd + this.f24965b + ", context=" + this.f24966c + ')';
    }
}
