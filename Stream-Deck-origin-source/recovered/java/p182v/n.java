package p182v;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34941a;

    public n(Object obj) {
        this.f34941a = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return Objects.equals(this.f34941a, ((n) obj).f34941a);
        }
        return false;
    }

    public int hashCode() {
        return this.f34941a.hashCode();
    }

    @Override // v.i.a
    public void a(long j8) {
    }

    @Override // v.i.a
    public void f(int i8) {
    }
}
