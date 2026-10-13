package U5;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p181u6.a f10214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10215b;

    public d(p181u6.a expectedType, Object response) {
        t.g(expectedType, "expectedType");
        t.g(response, "response");
        this.f10214a = expectedType;
        this.f10215b = response;
    }

    public final p181u6.a a() {
        return this.f10214a;
    }

    public final Object b() {
        return this.f10215b;
    }

    public final Object c() {
        return this.f10215b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.c(this.f10214a, dVar.f10214a) && t.c(this.f10215b, dVar.f10215b);
    }

    public int hashCode() {
        return (this.f10214a.hashCode() * 31) + this.f10215b.hashCode();
    }

    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f10214a + ", response=" + this.f10215b + ')';
    }
}
