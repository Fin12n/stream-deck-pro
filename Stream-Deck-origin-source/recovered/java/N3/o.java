package N3;

import com.elgato.streamdeck.vsd2.Endpoint;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Endpoint.Source f6170d;

    public /* synthetic */ o(String str, Endpoint endpoint, AbstractC2633k abstractC2633k) {
        this(str, endpoint);
    }

    public final String a() {
        return this.f6168b;
    }

    public final String b() {
        return this.f6167a;
    }

    public final int c() {
        return this.f6169c;
    }

    public final Endpoint d() {
        return P3.f.a(this.f6168b, this.f6169c, this.f6170d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return P3.i.d(this.f6167a, oVar.f6167a) && t.c(this.f6168b, oVar.f6168b) && this.f6169c == oVar.f6169c && this.f6170d == oVar.f6170d;
    }

    public int hashCode() {
        return (((((P3.i.e(this.f6167a) * 31) + this.f6168b.hashCode()) * 31) + Integer.hashCode(this.f6169c)) * 31) + this.f6170d.hashCode();
    }

    public String toString() {
        return "StreamDeckEndpoint(id=" + P3.i.f(this.f6167a) + ", host=" + this.f6168b + ", port=" + this.f6169c + ", source=" + this.f6170d + ")";
    }

    public /* synthetic */ o(String str, String str2, int i8, Endpoint.Source source, AbstractC2633k abstractC2633k) {
        this(str, str2, i8, source);
    }

    public o(String id, String host, int i8, Endpoint.Source source) {
        t.g(id, "id");
        t.g(host, "host");
        t.g(source, "source");
        this.f6167a = id;
        this.f6168b = host;
        this.f6169c = i8;
        this.f6170d = source;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String id, Endpoint endpoint) {
        t.g(id, "id");
        t.g(endpoint, "endpoint");
        String host = endpoint.getHost();
        t.f(host, "getHost(...)");
        int port = endpoint.getPort();
        Endpoint.Source source = endpoint.getSource();
        t.f(source, "getSource(...)");
        this(id, host, port, source, null);
    }
}
