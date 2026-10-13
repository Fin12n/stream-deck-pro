package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1873c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 1) {
                strF = A4.b.f(parcel, iP);
            } else if (iL != 2) {
                A4.b.u(parcel, iP);
            } else {
                strF2 = A4.b.f(parcel, iP);
            }
        }
        A4.b.k(parcel, iV);
        return new C1971w(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1971w[i8];
    }
}
