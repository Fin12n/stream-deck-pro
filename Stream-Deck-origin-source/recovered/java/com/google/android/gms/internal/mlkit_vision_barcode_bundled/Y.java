package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y extends A4.a {
    public static final Parcelable.Creator<Y> CREATOR = new Z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f18047a;

    public Y(float[] fArr) {
        this.f18047a = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        float[] fArr = this.f18047a;
        int iA = A4.c.a(parcel);
        A4.c.h(parcel, 1, fArr, false);
        A4.c.b(parcel, iA);
    }
}
