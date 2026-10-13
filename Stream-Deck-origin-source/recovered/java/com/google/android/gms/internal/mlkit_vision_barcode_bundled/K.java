package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        C1961u c1961u = null;
        String strF = null;
        String strF2 = null;
        C1966v[] c1966vArr = null;
        C1951s[] c1951sArr = null;
        String[] strArrG = null;
        C1927n[] c1927nArr = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 1:
                    c1961u = (C1961u) A4.b.e(parcel, iP, C1961u.CREATOR);
                    break;
                case 2:
                    strF = A4.b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = A4.b.f(parcel, iP);
                    break;
                case 4:
                    c1966vArr = (C1966v[]) A4.b.i(parcel, iP, C1966v.CREATOR);
                    break;
                case 5:
                    c1951sArr = (C1951s[]) A4.b.i(parcel, iP, C1951s.CREATOR);
                    break;
                case 6:
                    strArrG = A4.b.g(parcel, iP);
                    break;
                case 7:
                    c1927nArr = (C1927n[]) A4.b.i(parcel, iP, C1927n.CREATOR);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new C1942q(c1961u, strF, strF2, c1966vArr, c1951sArr, strArrG, c1927nArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1942q[i8];
    }
}
