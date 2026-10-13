package p135p0;

import A1.d;
import Q0.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31036a;

    public e(float f8) {
        this.f31036a = f8;
        if (f8 < 0.0f || f8 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p135p0.b
    public float a(long j8, d dVar) {
        return l.h(j8) * (this.f31036a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f31036a, ((e) obj).f31036a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f31036a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f31036a + "%)";
    }
}
