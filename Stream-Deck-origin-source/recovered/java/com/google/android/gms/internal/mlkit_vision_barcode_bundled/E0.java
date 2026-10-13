package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends I0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17945e;

    public E0(byte[] bArr, int i8, int i9) {
        super(bArr);
        J0.K(i8, i8 + i9, bArr.length);
        this.f17944d = i8;
        this.f17945e = i9;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0
    public final int U() {
        return this.f17944d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final byte c(int i8) {
        J0.Q(i8, this.f17945e);
        return this.f17983c[this.f17944d + i8];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final byte o(int i8) {
        return this.f17983c[this.f17944d + i8];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final int y() {
        return this.f17945e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0
    public final void z(byte[] bArr, int i8, int i9, int i10) {
        System.arraycopy(this.f17983c, this.f17944d + i8, bArr, i9, i10);
    }
}
