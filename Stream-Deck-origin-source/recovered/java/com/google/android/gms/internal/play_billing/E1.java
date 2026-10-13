package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E1 extends F1 {
    public E1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final double a(Object obj, long j8) {
        return Double.longBitsToDouble(this.f18760a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final float b(Object obj, long j8) {
        return Float.intBitsToFloat(this.f18760a.getInt(obj, j8));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.G1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.G1.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z8' boolean)' in method call: com.google.android.gms.internal.play_billing.G1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z8' boolean)' in method call: com.google.android.gms.internal.play_billing.G1.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.play_billing.F1
    public final void c(Object obj, long j8, boolean z8) {
        if (G1.f18768h) {
            G1.n(obj, j8, z8);
        } else {
            G1.o(obj, j8, z8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final void d(Object obj, long j8, byte b8) {
        if (G1.f18768h) {
            G1.d(obj, j8, b8);
        } else {
            G1.e(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final void e(Object obj, long j8, double d8) {
        this.f18760a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final void f(Object obj, long j8, float f8) {
        this.f18760a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final boolean g(Object obj, long j8) {
        return G1.f18768h ? G1.y(obj, j8) : G1.z(obj, j8);
    }
}
