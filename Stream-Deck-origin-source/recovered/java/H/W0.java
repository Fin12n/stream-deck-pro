package H;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2911c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2912a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set f2913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f2914c;

        public W0 a() {
            return new W0(this.f2912a, this.f2913b, this.f2914c);
        }

        public b b(Set set) {
            this.f2914c = new HashSet(set);
            return this;
        }

        public b c(Set set) {
            this.f2913b = new HashSet(set);
            return this;
        }

        public b d(boolean z8) {
            this.f2912a = z8;
            return this;
        }
    }

    public static W0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class cls, boolean z8) {
        if (this.f2910b.contains(cls)) {
            return true;
        }
        return !this.f2911c.contains(cls) && this.f2909a && z8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof W0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        W0 w8 = (W0) obj;
        return this.f2909a == w8.f2909a && Objects.equals(this.f2910b, w8.f2910b) && Objects.equals(this.f2911c, w8.f2911c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2909a), this.f2910b, this.f2911c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f2909a + ", forceEnabledQuirks=" + this.f2910b + ", forceDisabledQuirks=" + this.f2911c + '}';
    }

    public W0(boolean z8, Set set, Set set2) {
        this.f2909a = z8;
        this.f2910b = set == null ? Collections.EMPTY_SET : new HashSet(set);
        this.f2911c = set2 == null ? Collections.EMPTY_SET : new HashSet(set2);
    }
}
