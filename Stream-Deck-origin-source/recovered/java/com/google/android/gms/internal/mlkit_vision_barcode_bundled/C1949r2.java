package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1949r2 extends RuntimeException {
    public C1949r2(M1 m8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C1963u1 a() {
        return new C1963u1(getMessage());
    }
}
