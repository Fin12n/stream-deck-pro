package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1927n extends A4.a {
    public static final Parcelable.Creator<C1927n> CREATOR = new C1922m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f18599b;

    public C1927n(int i8, String[] strArr) {
        this.f18598a = i8;
        this.f18599b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f18598a);
        A4.c.o(parcel, 2, this.f18599b, false);
        A4.c.b(parcel, iA);
    }
}
