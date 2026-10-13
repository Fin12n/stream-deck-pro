package U6;

import W6.i;
import W6.l;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final c a(long j8) {
        return new e((int) j8, (int) (j8 >> 32));
    }

    public static final void c(int i8, int i9) {
        if (i9 <= i8) {
            throw new IllegalArgumentException(b(Integer.valueOf(i8), Integer.valueOf(i9)).toString());
        }
    }

    public static final void d(long j8, long j9) {
        if (j9 <= j8) {
            throw new IllegalArgumentException(b(Long.valueOf(j8), Long.valueOf(j9)).toString());
        }
    }

    public static final int e(int i8) {
        return 31 - Integer.numberOfLeadingZeros(i8);
    }

    public static final int f(c cVar, i range) {
        t.g(cVar, "<this>");
        t.g(range, "range");
        if (!range.isEmpty()) {
            if (range.t() < Integer.MAX_VALUE) {
                return cVar.g(range.s(), range.t() + 1);
            }
            return range.s() > Integer.MIN_VALUE ? cVar.g(range.s() - 1, range.t()) + 1 : cVar.e();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final long g(c cVar, l range) {
        t.g(cVar, "<this>");
        t.g(range, "range");
        if (!range.isEmpty()) {
            if (range.t() < Long.MAX_VALUE) {
                return cVar.i(range.s(), range.t() + 1);
            }
            return range.s() > Long.MIN_VALUE ? cVar.i(range.s() - 1, range.t()) + 1 : cVar.h();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int h(int i8, int i9) {
        return (i8 >>> (32 - i9)) & ((-i9) >> 31);
    }

    public static final String b(Object from, Object until) {
        t.g(from, "from");
        t.g(until, "until");
        return "Random range is empty: [" + from + uYOhHhTXuF.JsWzqr + until + ").";
    }
}
