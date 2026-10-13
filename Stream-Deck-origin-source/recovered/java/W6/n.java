package W6;

import I0.mIk.efuWFSeiT;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class n extends m {
    public static float c(float f8, float f9) {
        return f8 < f9 ? f9 : f8;
    }

    public static int d(int i8, int i9) {
        return i8 < i9 ? i9 : i8;
    }

    public static long e(long j8, long j9) {
        return j8 < j9 ? j9 : j8;
    }

    public static float f(float f8, float f9) {
        return f8 > f9 ? f9 : f8;
    }

    public static int g(int i8, int i9) {
        return i8 > i9 ? i9 : i8;
    }

    public static long h(long j8, long j9) {
        return j8 > j9 ? j9 : j8;
    }

    public static double i(double d8, double d9, double d10) {
        if (d9 <= d10) {
            if (d8 < d9) {
                return d9;
            }
            return d8 > d10 ? d10 : d8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + com.amazon.a.a.o.c.a.b.f16789a);
    }

    public static float j(float f8, float f9, float f10) {
        if (f9 <= f10) {
            if (f8 < f9) {
                return f9;
            }
            return f8 > f10 ? f10 : f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f9 + com.amazon.a.a.o.c.a.b.f16789a);
    }

    public static int k(int i8, int i9, int i10) {
        if (i9 <= i10) {
            if (i8 < i9) {
                return i9;
            }
            return i8 > i10 ? i10 : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i9 + com.amazon.a.a.o.c.a.b.f16789a);
    }

    public static int l(int i8, f range) {
        t.g(range, "range");
        if (range instanceof e) {
            return ((Number) o(Integer.valueOf(i8), (e) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i8 < ((Number) range.c()).intValue()) {
                return ((Number) range.c()).intValue();
            }
            return i8 > ((Number) range.o()).intValue() ? ((Number) range.o()).intValue() : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + com.amazon.a.a.o.c.a.b.f16789a);
    }

    public static final Comparable o(Comparable comparable, e range) {
        t.g(comparable, "<this>");
        t.g(range, "range");
        if (!range.isEmpty()) {
            if (!range.m(comparable, range.c()) || range.m(range.c(), comparable)) {
                return (!range.m(range.o(), comparable) || range.m(comparable, range.o())) ? comparable : range.o();
            }
            return range.c();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + com.amazon.a.a.o.c.a.b.f16789a);
    }

    public static g p(int i8, int i9) {
        return g.f11505d.a(i8, i9, -1);
    }

    public static int q(i iVar, U6.c random) {
        t.g(iVar, "<this>");
        t.g(random, "random");
        try {
            return U6.d.f(random, iVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static long r(l lVar, U6.c random) {
        t.g(lVar, "<this>");
        t.g(random, "random");
        try {
            return U6.d.g(random, lVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static g s(g gVar) {
        t.g(gVar, "<this>");
        return g.f11505d.a(gVar.t(), gVar.s(), -gVar.u());
    }

    public static g t(g gVar, int i8) {
        t.g(gVar, "<this>");
        m.a(i8 > 0, Integer.valueOf(i8));
        g.a aVar = g.f11505d;
        int iS = gVar.s();
        int iT = gVar.t();
        if (gVar.u() <= 0) {
            i8 = -i8;
        }
        return aVar.a(iS, iT, i8);
    }

    public static j u(j jVar, long j8) {
        t.g(jVar, "<this>");
        m.a(j8 > 0, Long.valueOf(j8));
        j.a aVar = j.f11515d;
        long jS = jVar.s();
        long jT = jVar.t();
        if (jVar.u() <= 0) {
            j8 = -j8;
        }
        return aVar.a(jS, jT, j8);
    }

    public static i v(int i8, int i9) {
        return i9 <= Integer.MIN_VALUE ? i.f11513e.a() : new i(i8, i9 - 1);
    }

    public static l w(long j8, long j9) {
        return j9 <= Long.MIN_VALUE ? l.f11523e.a() : new l(j8, j9 - 1);
    }

    public static long m(long j8, long j9, long j10) {
        if (j9 <= j10) {
            if (j8 < j9) {
                return j9;
            }
            return j8 > j10 ? j10 : j8;
        }
        throw new IllegalArgumentException(LYdqVGvOGMNr.UrhNzWvLnYXGw + j10 + " is less than minimum " + j9 + com.amazon.a.a.o.c.a.b.f16789a);
    }

    public static long n(long j8, f fVar) {
        t.g(fVar, efuWFSeiT.qwk);
        if (fVar instanceof e) {
            return ((Number) o(Long.valueOf(j8), (e) fVar)).longValue();
        }
        if (!fVar.isEmpty()) {
            if (j8 < ((Number) fVar.c()).longValue()) {
                return ((Number) fVar.c()).longValue();
            }
            return j8 > ((Number) fVar.o()).longValue() ? ((Number) fVar.o()).longValue() : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + com.amazon.a.a.o.c.a.b.f16789a);
    }
}
