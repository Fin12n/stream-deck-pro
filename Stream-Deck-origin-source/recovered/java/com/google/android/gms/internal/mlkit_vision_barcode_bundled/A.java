package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.elgato.streamdeck.vsd2.KnownHost;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String strF = null;
        String strF2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        C1951s c1951s = null;
        C1966v c1966v = null;
        C1971w c1971w = null;
        C1981y c1981y = null;
        C1976x c1976x = null;
        C1956t c1956t = null;
        C1937p c1937p = null;
        C1942q c1942q = null;
        r rVar = null;
        int iR = 0;
        int iR2 = 0;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 1:
                    iR = A4.b.r(parcel, iP);
                    break;
                case 2:
                    strF = A4.b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = A4.b.f(parcel, iP);
                    break;
                case 4:
                    bArrB = A4.b.b(parcel, iP);
                    break;
                case 5:
                    pointArr = (Point[]) A4.b.i(parcel, iP, Point.CREATOR);
                    break;
                case 6:
                    iR2 = A4.b.r(parcel, iP);
                    break;
                case 7:
                    c1951s = (C1951s) A4.b.e(parcel, iP, C1951s.CREATOR);
                    break;
                case 8:
                    c1966v = (C1966v) A4.b.e(parcel, iP, C1966v.CREATOR);
                    break;
                case 9:
                    c1971w = (C1971w) A4.b.e(parcel, iP, C1971w.CREATOR);
                    break;
                case 10:
                    c1981y = (C1981y) A4.b.e(parcel, iP, C1981y.CREATOR);
                    break;
                case 11:
                    c1976x = (C1976x) A4.b.e(parcel, iP, C1976x.CREATOR);
                    break;
                case 12:
                    c1956t = (C1956t) A4.b.e(parcel, iP, C1956t.CREATOR);
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    c1937p = (C1937p) A4.b.e(parcel, iP, C1937p.CREATOR);
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    c1942q = (C1942q) A4.b.e(parcel, iP, C1942q.CREATOR);
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    rVar = (r) A4.b.e(parcel, iP, r.CREATOR);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new C1986z(iR, strF, strF2, bArrB, pointArr, iR2, c1951s, c1966v, c1971w, c1981y, c1976x, c1956t, c1937p, c1942q, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1986z[i8];
    }
}
