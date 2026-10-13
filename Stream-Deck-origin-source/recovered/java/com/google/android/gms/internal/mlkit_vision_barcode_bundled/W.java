package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W extends A4.a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f18036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18038c;

    public W(float[] fArr, int i8, boolean z8) {
        this.f18036a = fArr;
        this.f18037b = i8;
        this.f18038c = z8;
    }

    public final int a() {
        return this.f18037b;
    }

    public final boolean b() {
        return this.f18038c;
    }

    public final float[] c() {
        return this.f18036a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        float[] fArr = this.f18036a;
        int iA = A4.c.a(parcel);
        A4.c.h(parcel, 1, fArr, false);
        A4.c.j(parcel, 2, this.f18037b);
        A4.c.c(parcel, 3, this.f18038c);
        A4.c.b(parcel, iA);
    }
}
