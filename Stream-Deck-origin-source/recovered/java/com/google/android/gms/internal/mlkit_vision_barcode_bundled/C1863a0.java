package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1863a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 1:
                    strF = A4.b.f(parcel, iP);
                    break;
                case 2:
                    strF2 = A4.b.f(parcel, iP);
                    break;
                case 3:
                    strF3 = A4.b.f(parcel, iP);
                    break;
                case 4:
                    strF4 = A4.b.f(parcel, iP);
                    break;
                case 5:
                    strF5 = A4.b.f(parcel, iP);
                    break;
                case 6:
                    strF6 = A4.b.f(parcel, iP);
                    break;
                case 7:
                    strF7 = A4.b.f(parcel, iP);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new C1961u(strF, strF2, strF3, strF4, strF5, strF6, strF7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1961u[i8];
    }
}
