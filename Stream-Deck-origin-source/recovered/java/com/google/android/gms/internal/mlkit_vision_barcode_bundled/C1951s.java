package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1951s extends A4.a {
    public static final Parcelable.Creator<C1951s> CREATOR = new M();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18649d;

    public C1951s(int i8, String str, String str2, String str3) {
        this.f18646a = i8;
        this.f18647b = str;
        this.f18648c = str2;
        this.f18649d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f18646a;
        int iA = A4.c.a(parcel);
        A4.c.j(parcel, 1, i9);
        A4.c.n(parcel, 2, this.f18647b, false);
        A4.c.n(parcel, 3, this.f18648c, false);
        A4.c.n(parcel, 4, this.f18649d, false);
        A4.c.b(parcel, iA);
    }
}
