package W6;

import D6.AbstractC0936p;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable, R6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0297a f11493d = new C0297a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f11495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11496c;

    /* JADX INFO: renamed from: W6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0297a {
        public /* synthetic */ C0297a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0297a() {
        }
    }

    public a(char c8, char c9, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11494a = c8;
        this.f11495b = (char) K6.c.c(c8, c9, i8);
        this.f11496c = i8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f11494a == aVar.f11494a && this.f11495b == aVar.f11495b && this.f11496c == aVar.f11496c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f11494a * 31) + this.f11495b) * 31) + this.f11496c;
    }

    public boolean isEmpty() {
        if (this.f11496c > 0) {
            return t.h(this.f11494a, this.f11495b) > 0;
        }
        return t.h(this.f11494a, this.f11495b) < 0;
    }

    public final char s() {
        return this.f11494a;
    }

    public final char t() {
        return this.f11495b;
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f11496c > 0) {
            sb = new StringBuilder();
            sb.append(this.f11494a);
            sb.append("..");
            sb.append(this.f11495b);
            sb.append(" step ");
            i8 = this.f11496c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f11494a);
            sb.append(" downTo ");
            sb.append(this.f11495b);
            sb.append(" step ");
            i8 = -this.f11496c;
        }
        sb.append(i8);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC0936p iterator() {
        return new b(this.f11494a, this.f11495b, this.f11496c);
    }
}
