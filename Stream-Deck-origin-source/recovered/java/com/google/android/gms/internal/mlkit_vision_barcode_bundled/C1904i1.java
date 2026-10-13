package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1904i1 implements Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G2 f18581b;

    public C1904i1(InterfaceC1929n1 interfaceC1929n1, int i8, G2 g8, boolean z8, boolean z9) {
        this.f18580a = i8;
        this.f18581b = g8;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f18580a - ((C1904i1) obj).f18580a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    public final H2 f() {
        return this.f18581b.a();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    public final G2 k() {
        return this.f18581b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    public final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    public final boolean o() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    public final L1 p(L1 l8, M1 m8) {
        AbstractC1889f1 abstractC1889f1 = (AbstractC1889f1) l8;
        abstractC1889f1.m((AbstractC1914k1) m8);
        return abstractC1889f1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    public final R1 r(R1 r8, R1 r9) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z0
    public final int zza() {
        return this.f18580a;
    }
}
