package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2004d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18882b;

    public C2004d0(Object obj, int i8) {
        this.f18881a = obj;
        this.f18882b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2004d0)) {
            return false;
        }
        C2004d0 c2004d0 = (C2004d0) obj;
        return this.f18881a == c2004d0.f18881a && this.f18882b == c2004d0.f18882b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f18881a) * 65535) + this.f18882b;
    }
}
