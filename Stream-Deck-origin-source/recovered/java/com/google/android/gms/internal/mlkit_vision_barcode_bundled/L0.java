package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L0 extends N0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17989d;

    public /* synthetic */ L0(byte[] bArr, int i8, int i9, boolean z8, K0 k8) {
        super(null);
        this.f17989d = Integer.MAX_VALUE;
        this.f17987b = 0;
    }

    public final int c(int i8) {
        int i9 = this.f17989d;
        this.f17989d = 0;
        int i10 = this.f17987b + this.f17988c;
        this.f17987b = i10;
        if (i10 <= 0) {
            this.f17988c = 0;
            return i9;
        }
        this.f17988c = i10;
        this.f17987b = 0;
        return i9;
    }
}
