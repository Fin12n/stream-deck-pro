package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2073v1 extends RuntimeException {
    public C2073v1(V0 v8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final A0 a() {
        return new A0(getMessage());
    }
}
