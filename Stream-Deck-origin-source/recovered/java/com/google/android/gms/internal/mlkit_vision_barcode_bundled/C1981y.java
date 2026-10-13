package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1981y extends A4.a {
    public static final Parcelable.Creator<C1981y> CREATOR = new C1888f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18694c;

    public C1981y(String str, String str2, int i8) {
        this.f18692a = str;
        this.f18693b = str2;
        this.f18694c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f18692a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f18693b, false);
        A4.c.j(parcel, 3, this.f18694c);
        A4.c.b(parcel, iA);
    }
}
