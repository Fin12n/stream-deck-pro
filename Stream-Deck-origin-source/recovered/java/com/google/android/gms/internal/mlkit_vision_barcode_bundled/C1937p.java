package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1937p extends A4.a {
    public static final Parcelable.Creator<C1937p> CREATOR = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1932o f18615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1932o f18616g;

    public C1937p(String str, String str2, String str3, String str4, String str5, C1932o c1932o, C1932o c1932o2) {
        this.f18610a = str;
        this.f18611b = str2;
        this.f18612c = str3;
        this.f18613d = str4;
        this.f18614e = str5;
        this.f18615f = c1932o;
        this.f18616g = c1932o2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f18610a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f18611b, false);
        A4.c.n(parcel, 3, this.f18612c, false);
        A4.c.n(parcel, 4, this.f18613d, false);
        A4.c.n(parcel, 5, this.f18614e, false);
        A4.c.m(parcel, 6, this.f18615f, i8, false);
        A4.c.m(parcel, 7, this.f18616g, i8, false);
        A4.c.b(parcel, iA);
    }
}
