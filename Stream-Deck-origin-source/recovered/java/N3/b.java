package N3;

import kotlin.jvm.internal.t;
import p044e7.InterfaceC2260f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2260f f5830a;

    public b(InterfaceC2260f value) {
        t.g(value, "value");
        this.f5830a = value;
    }

    public final InterfaceC2260f a() {
        return this.f5830a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && t.c(this.f5830a, ((b) obj).f5830a);
    }

    public int hashCode() {
        return this.f5830a.hashCode();
    }

    public String toString() {
        return "DiscoveryFlow(value=" + this.f5830a + ")";
    }
}
