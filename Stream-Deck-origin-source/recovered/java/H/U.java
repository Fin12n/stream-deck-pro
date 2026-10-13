package H;

import A.C0886n0;
import A.C0904x;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class U implements A.z0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f2902d;

    public U(long j8, int i8, Throwable th) {
        this.f2901c = SystemClock.elapsedRealtime() - j8;
        this.f2900b = i8;
        if (th instanceof AbstractC0976e0.b) {
            this.f2899a = 2;
            this.f2902d = th;
            return;
        }
        if (!(th instanceof C0886n0)) {
            this.f2899a = 0;
            this.f2902d = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.f2902d = th;
        if (th instanceof C0904x) {
            this.f2899a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.f2899a = 1;
        } else {
            this.f2899a = 0;
        }
    }

    @Override // A.z0.b
    public int a() {
        return this.f2899a;
    }

    @Override // A.z0.b
    public Throwable b() {
        return this.f2902d;
    }

    @Override // A.z0.b
    public long c() {
        return this.f2901c;
    }
}
