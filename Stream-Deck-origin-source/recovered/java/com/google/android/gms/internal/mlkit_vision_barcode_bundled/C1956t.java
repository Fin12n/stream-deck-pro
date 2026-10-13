package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1956t extends A4.a {
    public static final Parcelable.Creator<C1956t> CREATOR = new N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f18653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f18654b;

    public C1956t(double d8, double d9) {
        this.f18653a = d8;
        this.f18654b = d9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        double d8 = this.f18653a;
        int iA = A4.c.a(parcel);
        A4.c.f(parcel, 1, d8);
        A4.c.f(parcel, 2, this.f18654b);
        A4.c.b(parcel, iA);
    }
}
