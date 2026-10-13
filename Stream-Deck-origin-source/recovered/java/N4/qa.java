package N4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class qa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        U5 u8 = null;
        String strF = null;
        String strF2 = null;
        C1325v6[] c1325v6Arr = null;
        S4[] s4Arr = null;
        String[] strArrG = null;
        C1233n2[] c1233n2Arr = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            switch (A4.b.l(iP)) {
                case 2:
                    u8 = (U5) A4.b.e(parcel, iP, U5.CREATOR);
                    break;
                case 3:
                    strF = A4.b.f(parcel, iP);
                    break;
                case 4:
                    strF2 = A4.b.f(parcel, iP);
                    break;
                case 5:
                    c1325v6Arr = (C1325v6[]) A4.b.i(parcel, iP, C1325v6.CREATOR);
                    break;
                case 6:
                    s4Arr = (S4[]) A4.b.i(parcel, iP, S4.CREATOR);
                    break;
                case 7:
                    strArrG = A4.b.g(parcel, iP);
                    break;
                case 8:
                    c1233n2Arr = (C1233n2[]) A4.b.i(parcel, iP, C1233n2.CREATOR);
                    break;
                default:
                    A4.b.u(parcel, iP);
                    break;
            }
        }
        A4.b.k(parcel, iV);
        return new Q3(u8, strF, strF2, c1325v6Arr, s4Arr, strArrG, c1233n2Arr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Q3[i8];
    }
}
