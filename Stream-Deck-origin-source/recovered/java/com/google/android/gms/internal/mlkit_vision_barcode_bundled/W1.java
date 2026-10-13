package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W1 implements J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1 f18039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f18041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18042d;

    public W1(M1 m8, String str, Object[] objArr) {
        this.f18039a = m8;
        this.f18040b = str;
        this.f18041c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18042d = cCharAt;
            return;
        }
        int i8 = cCharAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f18042d = i8 | (cCharAt2 << i10);
                return;
            } else {
                i8 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    public final String a() {
        return this.f18040b;
    }

    public final Object[] b() {
        return this.f18041c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final int j() {
        int i8 = this.f18042d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final M1 zza() {
        return this.f18039a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.J1
    public final boolean zzb() {
        return (this.f18042d & 2) == 2;
    }
}
