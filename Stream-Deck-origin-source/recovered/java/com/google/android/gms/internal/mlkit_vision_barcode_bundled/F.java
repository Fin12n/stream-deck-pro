package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        boolean zM = false;
        W w8 = null;
        Y y8 = null;
        boolean zM2 = false;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 1) {
                w8 = (W) A4.b.e(parcel, iP, W.CREATOR);
            } else if (iL == 2) {
                y8 = (Y) A4.b.e(parcel, iP, Y.CREATOR);
            } else if (iL == 3) {
                zM = A4.b.m(parcel, iP);
            } else if (iL != 4) {
                A4.b.u(parcel, iP);
            } else {
                zM2 = A4.b.m(parcel, iP);
            }
        }
        A4.b.k(parcel, iV);
        return new E(w8, y8, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new E[i8];
    }
}
