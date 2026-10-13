package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1976x extends A4.a {
    public static final Parcelable.Creator<C1976x> CREATOR = new C1883e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18688b;

    public C1976x(String str, String str2) {
        this.f18687a = str;
        this.f18688b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f18687a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f18688b, false);
        A4.c.b(parcel, iA);
    }
}
