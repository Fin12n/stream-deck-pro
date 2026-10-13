package P3;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8888b;

    public /* synthetic */ e(String str, List list, AbstractC2633k abstractC2633k) {
        this(str, list);
    }

    public final List a() {
        return this.f8888b;
    }

    public final String b() {
        return this.f8887a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.d(this.f8887a, eVar.f8887a) && t.c(this.f8888b, eVar.f8888b);
    }

    public int hashCode() {
        return (i.e(this.f8887a) * 31) + this.f8888b.hashCode();
    }

    public String toString() {
        return "IdAndEndpoints(id=" + i.f(this.f8887a) + ", endpoints=" + this.f8888b + ")";
    }

    public e(String id, List endpoints) {
        t.g(id, "id");
        t.g(endpoints, "endpoints");
        this.f8887a = id;
        this.f8888b = endpoints;
    }
}
