package N4;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.elgato.streamdeck.vsd2.KnownHost;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W8 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        double dN = 0.0d;
        int iR = 0;
        int iR2 = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        Point[] pointArr = null;
        S4 s8 = null;
        C1325v6 c1325v6 = null;
        W6 w8 = null;
        Y7 y8 = null;
        C1348x7 c1348x7 = null;
        C1302t5 c1302t5 = null;
        C1257p3 c1257p3 = null;
        Q3 q8 = null;
        C1279r4 c1279r4 = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 2:
                    iR = A4.b.r(parcel, iP);
                    break;
                case 3:
                    strF = A4.b.f(parcel, iP);
                    break;
                case 4:
                    strF2 = A4.b.f(parcel, iP);
                    break;
                case 5:
                    iR2 = A4.b.r(parcel, iP);
                    break;
                case 6:
                    pointArr = (Point[]) A4.b.i(parcel, iP, Point.CREATOR);
                    break;
                case 7:
                    s8 = (S4) A4.b.e(parcel, iP, S4.CREATOR);
                    break;
                case 8:
                    c1325v6 = (C1325v6) A4.b.e(parcel, iP, C1325v6.CREATOR);
                    break;
                case 9:
                    w8 = (W6) A4.b.e(parcel, iP, W6.CREATOR);
                    break;
                case 10:
                    y8 = (Y7) A4.b.e(parcel, iP, Y7.CREATOR);
                    break;
                case 11:
                    c1348x7 = (C1348x7) A4.b.e(parcel, iP, C1348x7.CREATOR);
                    break;
                case 12:
                    c1302t5 = (C1302t5) A4.b.e(parcel, iP, C1302t5.CREATOR);
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    c1257p3 = (C1257p3) A4.b.e(parcel, iP, C1257p3.CREATOR);
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    q8 = (Q3) A4.b.e(parcel, iP, Q3.CREATOR);
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    c1279r4 = (C1279r4) A4.b.e(parcel, iP, C1279r4.CREATOR);
                    break;
                case 16:
                    bArrB = A4.b.b(parcel, iP);
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    zM = A4.b.m(parcel, iP);
                    break;
                case 18:
                    dN = A4.b.n(parcel, iP);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new C1371z8(iR, strF, strF2, iR2, pointArr, s8, c1325v6, w8, y8, c1348x7, c1302t5, c1257p3, q8, c1279r4, bArrB, zM, dN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1371z8[i8];
    }
}
