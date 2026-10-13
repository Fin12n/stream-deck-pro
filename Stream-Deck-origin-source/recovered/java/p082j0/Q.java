package p082j0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2611o f27890c;

    public Q() {
        this(0.0f, false, null, 7, null);
    }

    public final AbstractC2611o a() {
        return this.f27890c;
    }

    public final boolean b() {
        return this.f27889b;
    }

    public final float c() {
        return this.f27888a;
    }

    public final void d(AbstractC2611o abstractC2611o) {
        this.f27890c = abstractC2611o;
    }

    public final void e(boolean z8) {
        this.f27889b = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q8 = (Q) obj;
        return Float.compare(this.f27888a, q8.f27888a) == 0 && this.f27889b == q8.f27889b && t.c(this.f27890c, q8.f27890c);
    }

    public final void f(float f8) {
        this.f27888a = f8;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f27888a) * 31) + Boolean.hashCode(this.f27889b)) * 31;
        AbstractC2611o abstractC2611o = this.f27890c;
        return iHashCode + (abstractC2611o == null ? 0 : abstractC2611o.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f27888a + ", fill=" + this.f27889b + ", crossAxisAlignment=" + this.f27890c + ')';
    }

    public Q(float f8, boolean z8, AbstractC2611o abstractC2611o) {
        this.f27888a = f8;
        this.f27889b = z8;
        this.f27890c = abstractC2611o;
    }

    public /* synthetic */ Q(float f8, boolean z8, AbstractC2611o abstractC2611o, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? 0.0f : f8, (i8 & 2) != 0 ? true : z8, (i8 & 4) != 0 ? null : abstractC2611o);
    }
}
