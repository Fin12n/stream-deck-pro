package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1942q extends A4.a {
    public static final Parcelable.Creator<C1942q> CREATOR = new K();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1961u f18623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1966v[] f18626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1951s[] f18627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f18628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1927n[] f18629g;

    public C1942q(C1961u c1961u, String str, String str2, C1966v[] c1966vArr, C1951s[] c1951sArr, String[] strArr, C1927n[] c1927nArr) {
        this.f18623a = c1961u;
        this.f18624b = str;
        this.f18625c = str2;
        this.f18626d = c1966vArr;
        this.f18627e = c1951sArr;
        this.f18628f = strArr;
        this.f18629g = c1927nArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        C1961u c1961u = this.f18623a;
        int iA = A4.c.a(parcel);
        A4.c.m(parcel, 1, c1961u, i8, false);
        A4.c.n(parcel, 2, this.f18624b, false);
        A4.c.n(parcel, 3, this.f18625c, false);
        A4.c.q(parcel, 4, this.f18626d, i8, false);
        A4.c.q(parcel, 5, this.f18627e, i8, false);
        A4.c.o(parcel, 6, this.f18628f, false);
        A4.c.q(parcel, 7, this.f18629g, i8, false);
        A4.c.b(parcel, iA);
    }
}
