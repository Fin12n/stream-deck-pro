package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18027b;

    public U0(Object obj, int i8) {
        this.f18026a = obj;
        this.f18027b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u8 = (U0) obj;
        return this.f18026a == u8.f18026a && this.f18027b == u8.f18027b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f18026a) * 65535) + this.f18027b;
    }
}
