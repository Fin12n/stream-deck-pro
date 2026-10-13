package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U extends A4.a {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18025e;

    public U(boolean z8, byte[] bArr, boolean z9, float f8, boolean z10) {
        this.f18021a = z8;
        this.f18022b = bArr;
        this.f18023c = z9;
        this.f18024d = f8;
        this.f18025e = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z8 = this.f18021a;
        int iA = A4.c.a(parcel);
        A4.c.c(parcel, 1, z8);
        A4.c.e(parcel, 2, this.f18022b, false);
        A4.c.c(parcel, 3, this.f18023c);
        A4.c.g(parcel, 4, this.f18024d);
        A4.c.c(parcel, 5, this.f18025e);
        A4.c.b(parcel, iA);
    }
}
