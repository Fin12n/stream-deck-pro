package N3;

import com.elgato.streamdeck.vsd2.Endpoint;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6174d;

    public /* synthetic */ p(String str, String str2, List list, AbstractC2633k abstractC2633k) {
        this(str, str2, list);
    }

    public static /* synthetic */ p b(p pVar, String str, String str2, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = pVar.f6171a;
        }
        if ((i8 & 2) != 0) {
            str2 = pVar.f6172b;
        }
        if ((i8 & 4) != 0) {
            list = pVar.f6173c;
        }
        return pVar.a(str, str2, list);
    }

    public final p a(String id, String displayName, List endpoints) {
        t.g(id, "id");
        t.g(displayName, "displayName");
        t.g(endpoints, "endpoints");
        return new p(id, displayName, endpoints, null);
    }

    public final int c() {
        return this.f6174d;
    }

    public final String d() {
        return this.f6172b;
    }

    public final List e() {
        return this.f6173c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return P3.i.d(this.f6171a, pVar.f6171a) && t.c(this.f6172b, pVar.f6172b) && t.c(this.f6173c, pVar.f6173c);
    }

    public final String f() {
        return this.f6171a;
    }

    public int hashCode() {
        return (((P3.i.e(this.f6171a) * 31) + this.f6172b.hashCode()) * 31) + this.f6173c.hashCode();
    }

    public String toString() {
        return "StreamDeckHost(id=" + P3.i.f(this.f6171a) + ", displayName=" + this.f6172b + ", endpoints=" + this.f6173c + ")";
    }

    public p(String id, String displayName, List endpoints) {
        Endpoint.Source source;
        t.g(id, "id");
        t.g(displayName, "displayName");
        t.g(endpoints, "endpoints");
        this.f6171a = id;
        this.f6172b = displayName;
        this.f6173c = endpoints;
        Endpoint endpointA = P3.c.a(endpoints);
        this.f6174d = (endpointA == null || (source = endpointA.getSource()) == null) ? 1000 : P3.c.b(source);
    }

    public /* synthetic */ p(String str, String str2, List list, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, (i8 & 4) != 0 ? D6.r.n() : list, null);
    }
}
