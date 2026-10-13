package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G extends A4.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f17950a;

    public G(U u8) {
        this.f17950a = u8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        U u8 = this.f17950a;
        int iA = A4.c.a(parcel);
        A4.c.m(parcel, 1, u8, i8, false);
        A4.c.b(parcel, iA);
    }
}
