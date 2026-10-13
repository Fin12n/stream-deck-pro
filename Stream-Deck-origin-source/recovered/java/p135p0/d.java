package p135p0;

import A1.h;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31035a;

    public /* synthetic */ d(float f8, AbstractC2633k abstractC2633k) {
        this(f8);
    }

    @Override // p135p0.b
    public float a(long j8, A1.d dVar) {
        return dVar.E0(this.f31035a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.t(this.f31035a, ((d) obj).f31035a);
    }

    public int hashCode() {
        return h.u(this.f31035a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f31035a + ".dp)";
    }

    public d(float f8) {
        this.f31035a = f8;
    }
}
