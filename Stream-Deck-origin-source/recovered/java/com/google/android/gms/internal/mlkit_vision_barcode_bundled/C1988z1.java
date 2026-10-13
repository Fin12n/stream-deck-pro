package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C1988z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile M1 f18717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile J0 f18718b;

    public final int a() {
        if (this.f18718b != null) {
            return ((I0) this.f18718b).f17983c.length;
        }
        if (this.f18717a != null) {
            return this.f18717a.a();
        }
        return 0;
    }

    public final J0 b() {
        if (this.f18718b != null) {
            return this.f18718b;
        }
        synchronized (this) {
            try {
                if (this.f18718b != null) {
                    return this.f18718b;
                }
                if (this.f18717a == null) {
                    this.f18718b = J0.f17985b;
                } else {
                    this.f18718b = this.f18717a.f();
                }
                return this.f18718b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(M1 m8) {
        if (this.f18717a != null) {
            return;
        }
        synchronized (this) {
            if (this.f18717a != null) {
                return;
            }
            try {
                this.f18717a = m8;
                this.f18718b = J0.f17985b;
            } catch (C1963u1 unused) {
                this.f18717a = m8;
                this.f18718b = J0.f17985b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1988z1)) {
            return false;
        }
        C1988z1 c1988z1 = (C1988z1) obj;
        M1 m8 = this.f18717a;
        M1 m9 = c1988z1.f18717a;
        if (m8 == null && m9 == null) {
            return b().equals(c1988z1.b());
        }
        if (m8 != null && m9 != null) {
            return m8.equals(m9);
        }
        if (m8 != null) {
            c1988z1.c(m8.d());
            return m8.equals(c1988z1.f18717a);
        }
        c(m9.d());
        return this.f18717a.equals(m9);
    }

    public int hashCode() {
        return 1;
    }
}
