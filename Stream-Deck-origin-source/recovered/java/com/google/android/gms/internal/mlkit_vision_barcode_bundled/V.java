package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        float fO = 0.0f;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 1) {
                zM = A4.b.m(parcel, iP);
            } else if (iL == 2) {
                bArrB = A4.b.b(parcel, iP);
            } else if (iL == 3) {
                zM2 = A4.b.m(parcel, iP);
            } else if (iL == 4) {
                fO = A4.b.o(parcel, iP);
            } else if (iL != 5) {
                A4.b.u(parcel, iP);
            } else {
                zM3 = A4.b.m(parcel, iP);
            }
        }
        A4.b.k(parcel, iV);
        return new U(zM, bArrB, zM2, fO, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new U[i8];
    }
}
