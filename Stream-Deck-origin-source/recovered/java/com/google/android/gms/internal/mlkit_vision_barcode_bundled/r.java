package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends A4.a {
    public static final Parcelable.Creator<r> CREATOR = new L();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f18640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f18641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f18642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f18643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f18644n;

    public r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f18631a = str;
        this.f18632b = str2;
        this.f18633c = str3;
        this.f18634d = str4;
        this.f18635e = str5;
        this.f18636f = str6;
        this.f18637g = str7;
        this.f18638h = str8;
        this.f18639i = str9;
        this.f18640j = str10;
        this.f18641k = str11;
        this.f18642l = str12;
        this.f18643m = str13;
        this.f18644n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f18631a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f18632b, false);
        A4.c.n(parcel, 3, this.f18633c, false);
        A4.c.n(parcel, 4, this.f18634d, false);
        A4.c.n(parcel, 5, this.f18635e, false);
        A4.c.n(parcel, 6, this.f18636f, false);
        A4.c.n(parcel, 7, this.f18637g, false);
        A4.c.n(parcel, 8, this.f18638h, false);
        A4.c.n(parcel, 9, this.f18639i, false);
        A4.c.n(parcel, 10, this.f18640j, false);
        A4.c.n(parcel, 11, this.f18641k, false);
        A4.c.n(parcel, 12, this.f18642l, false);
        A4.c.n(parcel, 13, this.f18643m, false);
        A4.c.n(parcel, 14, this.f18644n, false);
        A4.c.b(parcel, iA);
    }
}
