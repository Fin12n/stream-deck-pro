package U1;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f10019a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10020b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10021c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10022d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10023e = 0;

    public static float f(float f8) {
        return (f8 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f10022d != 0 && eventTime - this.f10020b[this.f10023e] > 40) {
            b();
        }
        int i8 = (this.f10023e + 1) % 20;
        this.f10023e = i8;
        int i9 = this.f10022d;
        if (i9 != 20) {
            this.f10022d = i9 + 1;
        }
        this.f10019a[i8] = motionEvent.getAxisValue(26);
        this.f10020b[this.f10023e] = eventTime;
    }

    public final void b() {
        this.f10022d = 0;
        this.f10021c = 0.0f;
    }

    public void c(int i8, float f8) {
        float fE = e() * i8;
        this.f10021c = fE;
        if (fE < (-Math.abs(f8))) {
            this.f10021c = -Math.abs(f8);
        } else if (this.f10021c > Math.abs(f8)) {
            this.f10021c = Math.abs(f8);
        }
    }

    public float d(int i8) {
        if (i8 != 26) {
            return 0.0f;
        }
        return this.f10021c;
    }

    public final float e() {
        long[] jArr;
        long j8;
        int i8 = this.f10022d;
        if (i8 < 2) {
            return 0.0f;
        }
        int i9 = this.f10023e;
        int i10 = ((i9 + 20) - (i8 - 1)) % 20;
        long j9 = this.f10020b[i9];
        while (true) {
            jArr = this.f10020b;
            j8 = jArr[i10];
            if (j9 - j8 <= 100) {
                break;
            }
            this.f10022d--;
            i10 = (i10 + 1) % 20;
        }
        int i11 = this.f10022d;
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = (i10 + 1) % 20;
            long j10 = jArr[i12];
            if (j8 == j10) {
                return 0.0f;
            }
            return this.f10019a[i12] / (j10 - j8);
        }
        float fAbs = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f10022d - 1; i14++) {
            int i15 = i14 + i10;
            long[] jArr2 = this.f10020b;
            long j11 = jArr2[i15 % 20];
            int i16 = (i15 + 1) % 20;
            if (jArr2[i16] != j11) {
                i13++;
                float f8 = f(fAbs);
                float f9 = this.f10019a[i16] / (this.f10020b[i16] - j11);
                fAbs += (f9 - f8) * Math.abs(f9);
                if (i13 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }
}
