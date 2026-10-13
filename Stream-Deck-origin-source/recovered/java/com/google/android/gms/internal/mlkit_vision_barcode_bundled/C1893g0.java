package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1893g0 extends A4.a {
    public static final Parcelable.Creator<C1893g0> CREATOR = new C1898h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18132e;

    public C1893g0(int i8, int i9, int i10, int i11, long j8) {
        this.f18128a = i8;
        this.f18129b = i9;
        this.f18130c = i10;
        this.f18131d = i11;
        this.f18132e = j8;
    }

    public final int a() {
        return this.f18130c;
    }

    public final int b() {
        return this.f18128a;
    }

    public final int c() {
        return this.f18131d;
    }

    public final int d() {
        return this.f18129b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, this.f18128a);
        A4.c.j(parcel, 2, this.f18129b);
        A4.c.j(parcel, 3, this.f18130c);
        A4.c.j(parcel, 4, this.f18131d);
        A4.c.l(parcel, 5, this.f18132e);
        A4.c.b(parcel, iA);
    }
}
