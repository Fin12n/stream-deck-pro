package H0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f3331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f3332c;

    public g(int i8, long[] jArr, Object[] objArr) {
        this.f3330a = i8;
        this.f3331b = jArr;
        this.f3332c = objArr;
    }

    public final int a(long j8) {
        int i8 = this.f3330a - 1;
        if (i8 != -1) {
            int i9 = 0;
            if (i8 != 0) {
                while (i9 <= i8) {
                    int i10 = (i9 + i8) >>> 1;
                    long j9 = this.f3331b[i10] - j8;
                    if (j9 < 0) {
                        i9 = i10 + 1;
                    } else {
                        if (j9 <= 0) {
                            return i10;
                        }
                        i8 = i10 - 1;
                    }
                }
                return -(i9 + 1);
            }
            long j10 = this.f3331b[0];
            if (j10 == j8) {
                return 0;
            }
            if (j10 > j8) {
                return -2;
            }
        }
        return -1;
    }

    public final Object b(long j8) {
        int iA = a(j8);
        if (iA >= 0) {
            return this.f3332c[iA];
        }
        return null;
    }

    public final g c(long j8, Object obj) {
        int i8 = this.f3330a;
        int i9 = 0;
        int i10 = 0;
        for (Object obj2 : this.f3332c) {
            if (obj2 != null) {
                i10++;
            }
        }
        int i11 = i10 + 1;
        long[] jArr = new long[i11];
        Object[] objArr = new Object[i11];
        if (i11 > 1) {
            int i12 = 0;
            while (i9 < i11 && i12 < i8) {
                long j9 = this.f3331b[i12];
                Object obj3 = this.f3332c[i12];
                if (j9 > j8) {
                    jArr[i9] = j8;
                    objArr[i9] = obj;
                    i9++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i9] = j9;
                    objArr[i9] = obj3;
                    i9++;
                }
                i12++;
            }
            if (i12 == i8) {
                jArr[i10] = j8;
                objArr[i10] = obj;
            } else {
                while (i9 < i11) {
                    long j10 = this.f3331b[i12];
                    Object obj4 = this.f3332c[i12];
                    if (obj4 != null) {
                        jArr[i9] = j10;
                        objArr[i9] = obj4;
                        i9++;
                    }
                    i12++;
                }
            }
        } else {
            jArr[0] = j8;
            objArr[0] = obj;
        }
        return new g(i11, jArr, objArr);
    }

    public final boolean d(long j8, Object obj) {
        int iA = a(j8);
        if (iA < 0) {
            return false;
        }
        this.f3332c[iA] = obj;
        return true;
    }
}
