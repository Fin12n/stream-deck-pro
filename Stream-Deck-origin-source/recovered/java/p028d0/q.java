package p028d0;

import kotlin.jvm.internal.t;
import p037e0.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f19725b;

    public q(float f8, E e8) {
        this.f19724a = f8;
        this.f19725b = e8;
    }

    public final float a() {
        return this.f19724a;
    }

    public final E b() {
        return this.f19725b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f19724a, qVar.f19724a) == 0 && t.c(this.f19725b, qVar.f19725b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f19724a) * 31) + this.f19725b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f19724a + ", animationSpec=" + this.f19725b + ')';
    }
}
