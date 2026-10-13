package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1932o extends A4.a {
    public static final Parcelable.Creator<C1932o> CREATOR = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18608h;

    public C1932o(int i8, int i9, int i10, int i11, int i12, int i13, boolean z8, String str) {
        this.f18601a = i8;
        this.f18602b = i9;
        this.f18603c = i10;
        this.f18604d = i11;
        this.f18605e = i12;
        this.f18606f = i13;
        this.f18607g = z8;
        this.f18608h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f18601a;
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, i9);
        A4.c.j(parcel, 2, this.f18602b);
        A4.c.j(parcel, 3, this.f18603c);
        A4.c.j(parcel, 4, this.f18604d);
        A4.c.j(parcel, 5, this.f18605e);
        A4.c.j(parcel, 6, this.f18606f);
        A4.c.c(parcel, 7, this.f18607g);
        A4.c.n(parcel, 8, this.f18608h, false);
        A4.c.b(parcel, iA);
    }
}
