package u7;

import P2.Lsk.mHPawN;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: u7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3041a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f34554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f34555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f34556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f34557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3047g f34558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3042b f34559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f34560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f34561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f34562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f34563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f34564k;

    public final C3047g a() {
        return this.f34558e;
    }

    public final List b() {
        return this.f34564k;
    }

    public final q c() {
        return this.f34554a;
    }

    public final boolean d(C3041a that) {
        kotlin.jvm.internal.t.g(that, "that");
        return kotlin.jvm.internal.t.c(this.f34554a, that.f34554a) && kotlin.jvm.internal.t.c(this.f34559f, that.f34559f) && kotlin.jvm.internal.t.c(this.f34563j, that.f34563j) && kotlin.jvm.internal.t.c(this.f34564k, that.f34564k) && kotlin.jvm.internal.t.c(this.f34561h, that.f34561h) && kotlin.jvm.internal.t.c(this.f34560g, that.f34560g) && kotlin.jvm.internal.t.c(this.f34556c, that.f34556c) && kotlin.jvm.internal.t.c(this.f34557d, that.f34557d) && kotlin.jvm.internal.t.c(this.f34558e, that.f34558e) && this.f34562i.l() == that.f34562i.l();
    }

    public final HostnameVerifier e() {
        return this.f34557d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3041a)) {
            return false;
        }
        C3041a c3041a = (C3041a) obj;
        return kotlin.jvm.internal.t.c(this.f34562i, c3041a.f34562i) && d(c3041a);
    }

    public final List f() {
        return this.f34563j;
    }

    public final Proxy g() {
        return this.f34560g;
    }

    public final InterfaceC3042b h() {
        return this.f34559f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f34562i.hashCode()) * 31) + this.f34554a.hashCode()) * 31) + this.f34559f.hashCode()) * 31) + this.f34563j.hashCode()) * 31) + this.f34564k.hashCode()) * 31) + this.f34561h.hashCode()) * 31) + Objects.hashCode(this.f34560g)) * 31) + Objects.hashCode(this.f34556c)) * 31) + Objects.hashCode(this.f34557d)) * 31) + Objects.hashCode(this.f34558e);
    }

    public final ProxySelector i() {
        return this.f34561h;
    }

    public final SocketFactory j() {
        return this.f34555b;
    }

    public final SSLSocketFactory k() {
        return this.f34556c;
    }

    public final u l() {
        return this.f34562i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f34562i.h());
        sb2.append(':');
        sb2.append(this.f34562i.l());
        sb2.append(", ");
        if (this.f34560g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f34560g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f34561h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }

    public C3041a(String uriHost, int i8, q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C3047g c3047g, InterfaceC3042b proxyAuthenticator, Proxy proxy, List<? extends y> protocols, List<l> connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.t.g(uriHost, "uriHost");
        kotlin.jvm.internal.t.g(dns, "dns");
        kotlin.jvm.internal.t.g(socketFactory, "socketFactory");
        kotlin.jvm.internal.t.g(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.t.g(protocols, "protocols");
        kotlin.jvm.internal.t.g(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.t.g(proxySelector, "proxySelector");
        this.f34554a = dns;
        this.f34555b = socketFactory;
        this.f34556c = sSLSocketFactory;
        this.f34557d = hostnameVerifier;
        this.f34558e = c3047g;
        this.f34559f = proxyAuthenticator;
        this.f34560g = proxy;
        this.f34561h = proxySelector;
        this.f34562i = new u.a().o(sSLSocketFactory != null ? "https" : mHPawN.HzVuhpZBnO).e(uriHost).k(i8).a();
        this.f34563j = v7.d.U(protocols);
        this.f34564k = v7.d.U(connectionSpecs);
    }
}
