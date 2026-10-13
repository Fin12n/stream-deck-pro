package p063h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static q f24017d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24020c;

    public static q b() {
        if (f24017d == null) {
            f24017d = new q();
        }
        return f24017d;
    }

    public void a(long j8, double d8, double d9) {
        float f8 = (j8 - 946728000000L) / 8.64E7f;
        float f9 = (0.01720197f * f8) + 6.24006f;
        double d10 = f9;
        double dSin = (Math.sin(d10) * 0.03341960161924362d) + d10 + (Math.sin(2.0f * f9) * 3.4906598739326E-4d) + (Math.sin(f9 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d11 = (-d9) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f8 - 9.0E-4f)) - d11) + 9.0E-4f)) + d11 + (Math.sin(d10) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d12 = 0.01745329238474369d * d8;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d12) * Math.sin(dAsin))) / (Math.cos(d12) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f24020c = 1;
            this.f24018a = -1L;
            this.f24019b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f24020c = 0;
                this.f24018a = -1L;
                this.f24019b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f24018a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f24019b = jRound;
            if (jRound >= j8 || this.f24018a <= j8) {
                this.f24020c = 1;
            } else {
                this.f24020c = 0;
            }
        }
    }
}
