package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E extends A4.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f17940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f17941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17942c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17943d;

    public E(W w8, Y y8, boolean z8, boolean z9) {
        this.f17940a = w8;
        this.f17941b = y8;
        this.f17943d = z9;
    }

    public final W a() {
        return this.f17940a;
    }

    public final boolean b() {
        return this.f17943d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = A4.c.a(parcel);
        A4.c.m(parcel, 1, this.f17940a, i8, false);
        A4.c.m(parcel, 2, this.f17941b, i8, false);
        A4.c.c(parcel, 3, this.f17942c);
        A4.c.c(parcel, 4, this.f17943d);
        A4.c.b(parcel, iA);
    }
}
