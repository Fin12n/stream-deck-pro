package N4;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.elgato.streamdeck.vsd2.KnownHost;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ta implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        String strF = null;
        String strF2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        C1205ka c1205ka = null;
        C1241na c1241na = null;
        oa oaVar = null;
        ra raVar = null;
        pa paVar = null;
        C1217la c1217la = null;
        C1169ha c1169ha = null;
        C1181ia c1181ia = null;
        C1193ja c1193ja = null;
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
                    c1205ka = (C1205ka) A4.b.e(parcel, iP, C1205ka.CREATOR);
                    break;
                case 8:
                    c1241na = (C1241na) A4.b.e(parcel, iP, C1241na.CREATOR);
                    break;
                case 9:
                    oaVar = (oa) A4.b.e(parcel, iP, oa.CREATOR);
                    break;
                case 10:
                    raVar = (ra) A4.b.e(parcel, iP, ra.CREATOR);
                    break;
                case 11:
                    paVar = (pa) A4.b.e(parcel, iP, pa.CREATOR);
                    break;
                case 12:
                    c1217la = (C1217la) A4.b.e(parcel, iP, C1217la.CREATOR);
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    c1169ha = (C1169ha) A4.b.e(parcel, iP, C1169ha.CREATOR);
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    c1181ia = (C1181ia) A4.b.e(parcel, iP, C1181ia.CREATOR);
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    c1193ja = (C1193ja) A4.b.e(parcel, iP, C1193ja.CREATOR);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new sa(iR, strF, strF2, bArrB, pointArr, iR2, c1205ka, c1241na, oaVar, raVar, paVar, c1217la, c1169ha, c1181ia, c1193ja);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new sa[i8];
    }
}
