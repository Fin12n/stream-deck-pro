package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1961u extends A4.a {
    public static final Parcelable.Creator<C1961u> CREATOR = new C1863a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18667g;

    public C1961u(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f18661a = str;
        this.f18662b = str2;
        this.f18663c = str3;
        this.f18664d = str4;
        this.f18665e = str5;
        this.f18666f = str6;
        this.f18667g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f18661a;
        int iA = A4.c.a(parcel);
        A4.c.n(parcel, 1, str, false);
        A4.c.n(parcel, 2, this.f18662b, false);
        A4.c.n(parcel, 3, this.f18663c, false);
        A4.c.n(parcel, 4, this.f18664d, false);
        A4.c.n(parcel, 5, this.f18665e, false);
        A4.c.n(parcel, 6, this.f18666f, false);
        A4.c.n(parcel, 7, this.f18667g, false);
        A4.c.b(parcel, iA);
    }
}
