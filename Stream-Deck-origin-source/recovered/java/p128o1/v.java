package p128o1;

import A1.w;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30851c;

    public /* synthetic */ v(long j8, long j9, int i8, AbstractC2633k abstractC2633k) {
        this(j8, j9, i8);
    }

    public final long a() {
        return this.f30850b;
    }

    public final int b() {
        return this.f30851c;
    }

    public final long c() {
        return this.f30849a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return A1.v.e(this.f30849a, vVar.f30849a) && A1.v.e(this.f30850b, vVar.f30850b) && w.i(this.f30851c, vVar.f30851c);
    }

    public int hashCode() {
        return (((A1.v.i(this.f30849a) * 31) + A1.v.i(this.f30850b)) * 31) + w.j(this.f30851c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) A1.v.j(this.f30849a)) + ", height=" + ((Object) A1.v.j(this.f30850b)) + ", placeholderVerticalAlign=" + ((Object) w.k(this.f30851c)) + ')';
    }

    public v(long j8, long j9, int i8) {
        this.f30849a = j8;
        this.f30850b = j9;
        this.f30851c = i8;
        if (w.g(j8)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (w.g(j9)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
