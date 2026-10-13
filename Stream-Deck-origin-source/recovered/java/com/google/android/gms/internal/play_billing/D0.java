package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class D0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2008e0 f18750c = C2008e0.f18887c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile V0 f18751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile S f18752b;

    public final int a() {
        if (this.f18752b != null) {
            return ((O) this.f18752b).f18811e.length;
        }
        if (this.f18751a != null) {
            return this.f18751a.l();
        }
        return 0;
    }

    public final S b() {
        if (this.f18752b != null) {
            return this.f18752b;
        }
        synchronized (this) {
            try {
                if (this.f18752b != null) {
                    return this.f18752b;
                }
                if (this.f18751a == null) {
                    this.f18752b = S.f18819b;
                } else {
                    this.f18752b = this.f18751a.zzb();
                }
                return this.f18752b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(V0 v8) {
        if (this.f18751a != null) {
            return;
        }
        synchronized (this) {
            if (this.f18751a != null) {
                return;
            }
            try {
                this.f18751a = v8;
                this.f18752b = S.f18819b;
            } catch (A0 unused) {
                this.f18751a = v8;
                this.f18752b = S.f18819b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d8 = (D0) obj;
        V0 v8 = this.f18751a;
        V0 v9 = d8.f18751a;
        if (v8 == null && v9 == null) {
            return b().equals(d8.b());
        }
        if (v8 != null && v9 != null) {
            return v8.equals(v9);
        }
        if (v8 != null) {
            d8.c(v8.d());
            return v8.equals(d8.f18751a);
        }
        c(v9.d());
        return this.f18751a.equals(v9);
    }

    public int hashCode() {
        return 1;
    }
}
