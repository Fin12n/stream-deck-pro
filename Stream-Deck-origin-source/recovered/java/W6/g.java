package W6;

import D6.I;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class g implements Iterable, R6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11505d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11508c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a(int i8, int i9, int i10) {
            return new g(i8, i9, i10);
        }

        public a() {
        }
    }

    public g(int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11506a = i8;
        this.f11507b = K6.c.c(i8, i9, i10);
        this.f11508c = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.f11506a == gVar.f11506a && this.f11507b == gVar.f11507b && this.f11508c == gVar.f11508c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f11506a * 31) + this.f11507b) * 31) + this.f11508c;
    }

    public boolean isEmpty() {
        if (this.f11508c > 0) {
            return this.f11506a > this.f11507b;
        }
        return this.f11506a < this.f11507b;
    }

    public final int s() {
        return this.f11506a;
    }

    public final int t() {
        return this.f11507b;
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f11508c > 0) {
            sb = new StringBuilder();
            sb.append(this.f11506a);
            sb.append("..");
            sb.append(this.f11507b);
            sb.append(" step ");
            i8 = this.f11508c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f11506a);
            sb.append(" downTo ");
            sb.append(this.f11507b);
            sb.append(" step ");
            i8 = -this.f11508c;
        }
        sb.append(i8);
        return sb.toString();
    }

    public final int u() {
        return this.f11508c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public I iterator() {
        return new h(this.f11506a, this.f11507b, this.f11508c);
    }
}
