package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y3 extends AbstractC1899h1 implements N1 {
    private static final Y3 zzd;
    private byte zze = 2;

    static {
        Y3 y8 = new Y3();
        zzd = y8;
        AbstractC1914k1.C(Y3.class, y8);
    }

    public static Y3 L() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1914k1
    public final Object I(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zze);
        }
        W3 w8 = null;
        if (i9 == 2) {
            return AbstractC1914k1.x(zzd, "\u0003\u0000", null);
        }
        if (i9 == 3) {
            return new Y3();
        }
        if (i9 == 4) {
            return new X3(w8);
        }
        if (i9 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
