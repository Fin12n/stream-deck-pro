package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1974w2 extends AbstractC1984y2 {
    public C1974w2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1984y2
    public final double a(Object obj, long j8) {
        return Double.longBitsToDouble(this.f18700a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1984y2
    public final float b(Object obj, long j8) {
        return Float.intBitsToFloat(this.f18700a.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1984y2
    public final void c(Object obj, long j8, boolean z8) {
        if (AbstractC1989z2.f18726h) {
            AbstractC1989z2.d(obj, j8, z8 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1989z2.e(obj, j8, z8 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1984y2
    public final void d(Object obj, long j8, byte b8) {
        if (AbstractC1989z2.f18726h) {
            AbstractC1989z2.d(obj, j8, b8);
        } else {
            AbstractC1989z2.e(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1984y2
    public final void e(Object obj, long j8, double d8) {
        this.f18700a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1984y2
    public final void f(Object obj, long j8, float f8) {
        this.f18700a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1984y2
    public final boolean g(Object obj, long j8) {
        return AbstractC1989z2.f18726h ? AbstractC1989z2.y(obj, j8) : AbstractC1989z2.z(obj, j8);
    }
}
