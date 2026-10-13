package A1;

import kotlin.jvm.internal.AbstractC2633k;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f422b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f423c = {18, 20, 17, 15};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f424d = {65535, 262143, 32767, 8191};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f425e = {32767, 8191, 65535, 262143};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f426a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a(int i8) {
            if (i8 < 8191) {
                return 13;
            }
            if (i8 < 32767) {
                return 15;
            }
            if (i8 < 65535) {
                return 16;
            }
            if (i8 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i8 + " in Constraints");
        }

        public final long c(int i8, int i9) {
            if (i8 >= 0 && i9 >= 0) {
                return b(i8, i8, i9, i9);
            }
            throw new IllegalArgumentException(("width(" + i8 + ") and height(" + i9 + ") must be >= 0").toString());
        }

        public final long d(int i8) {
            if (i8 >= 0) {
                return b(0, Integer.MAX_VALUE, i8, i8);
            }
            throw new IllegalArgumentException(("height(" + i8 + ") must be >= 0").toString());
        }

        public final long e(int i8) {
            if (i8 >= 0) {
                return b(i8, i8, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i8 + ") must be >= 0").toString());
        }

        public a() {
        }

        public final long b(int i8, int i9, int i10, int i11) {
            int i12;
            int i13;
            long j8;
            int i14;
            if (i11 == Integer.MAX_VALUE) {
                i12 = i10;
            } else {
                i12 = i11;
            }
            int iA = a(i12);
            if (i9 == Integer.MAX_VALUE) {
                i13 = i8;
            } else {
                i13 = i9;
            }
            int iA2 = a(i13);
            if (iA + iA2 <= 31) {
                if (iA2 != 13) {
                    if (iA2 != 18) {
                        if (iA2 != 15) {
                            if (iA2 == 16) {
                                j8 = 0;
                            } else {
                                throw new IllegalStateException("Should only have the provided constants.");
                            }
                        } else {
                            j8 = 2;
                        }
                    } else {
                        j8 = 1;
                    }
                } else {
                    j8 = 3;
                }
                int i15 = 0;
                if (i9 == Integer.MAX_VALUE) {
                    i14 = 0;
                } else {
                    i14 = i9 + 1;
                }
                if (i11 != Integer.MAX_VALUE) {
                    i15 = i11 + 1;
                }
                int i16 = b.f423c[(int) j8];
                return b.c((((long) i14) << 33) | j8 | (((long) i8) << 2) | (((long) i10) << i16) | (((long) i15) << (i16 + 31)));
            }
            throw new IllegalArgumentException(kDsnNkYbBsI.zZBkvTjAWyeh + i13 + " and height of " + i12 + " in Constraints");
        }
    }

    public /* synthetic */ b(long j8) {
        this.f426a = j8;
    }

    public static final /* synthetic */ b b(long j8) {
        return new b(j8);
    }

    public static final long d(long j8, int i8, int i9, int i10, int i11) {
        if (i10 < 0 || i8 < 0) {
            throw new IllegalArgumentException(("minHeight(" + i10 + ") and minWidth(" + i8 + ") must be >= 0").toString());
        }
        if (i9 < i8 && i9 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i9 + ") must be >= minWidth(" + i8 + ')').toString());
        }
        if (i11 >= i10 || i11 == Integer.MAX_VALUE) {
            return f422b.b(i8, i9, i10, i11);
        }
        throw new IllegalArgumentException(("maxHeight(" + i11 + ") must be >= minHeight(" + i10 + ')').toString());
    }

    public static /* synthetic */ long e(long j8, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = p(j8);
        }
        int i13 = i8;
        if ((i12 & 2) != 0) {
            i9 = n(j8);
        }
        int i14 = i9;
        if ((i12 & 4) != 0) {
            i10 = o(j8);
        }
        int i15 = i10;
        if ((i12 & 8) != 0) {
            i11 = m(j8);
        }
        return d(j8, i13, i14, i15, i11);
    }

    public static boolean f(long j8, Object obj) {
        return (obj instanceof b) && j8 == ((b) obj).s();
    }

    public static final boolean g(long j8, long j9) {
        return j8 == j9;
    }

    public static final int h(long j8) {
        return (int) (j8 & 3);
    }

    public static final boolean i(long j8) {
        int iH = h(j8);
        return (((int) (j8 >> (f423c[iH] + 31))) & f425e[iH]) != 0;
    }

    public static final boolean j(long j8) {
        return (((int) (j8 >> 33)) & f424d[h(j8)]) != 0;
    }

    public static final boolean k(long j8) {
        return m(j8) == o(j8);
    }

    public static final boolean l(long j8) {
        return n(j8) == p(j8);
    }

    public static final int m(long j8) {
        int iH = h(j8);
        int i8 = ((int) (j8 >> (f423c[iH] + 31))) & f425e[iH];
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    public static final int n(long j8) {
        int i8 = ((int) (j8 >> 33)) & f424d[h(j8)];
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    public static final int o(long j8) {
        int iH = h(j8);
        return ((int) (j8 >> f423c[iH])) & f425e[iH];
    }

    public static final int p(long j8) {
        return ((int) (j8 >> 2)) & f424d[h(j8)];
    }

    public static int q(long j8) {
        return Long.hashCode(j8);
    }

    public static String r(long j8) {
        int iN = n(j8);
        String strValueOf = iN == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iN);
        int iM = m(j8);
        return "Constraints(minWidth = " + p(j8) + ", maxWidth = " + strValueOf + ", minHeight = " + o(j8) + ", maxHeight = " + (iM != Integer.MAX_VALUE ? String.valueOf(iM) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f426a, obj);
    }

    public int hashCode() {
        return q(this.f426a);
    }

    public final /* synthetic */ long s() {
        return this.f426a;
    }

    public String toString() {
        return r(this.f426a);
    }

    public static long c(long j8) {
        return j8;
    }
}
