package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1966v extends A4.a {
    public static final Parcelable.Creator<C1966v> CREATOR = new C1868b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18670b;

    public C1966v(int i8, String str) {
        this.f18669a = i8;
        this.f18670b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f18669a;
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, i9);
        A4.c.n(parcel, 2, this.f18670b, false);
        A4.c.b(parcel, iA);
    }
}
