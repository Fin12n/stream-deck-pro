package p219z4;

import A4.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        int iR = -1;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        String strF = null;
        String strF2 = null;
        long jS = 0;
        long jS2 = 0;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            switch (b.l(iP)) {
                case 1:
                    iR2 = b.r(parcel, iP);
                    break;
                case 2:
                    iR3 = b.r(parcel, iP);
                    break;
                case 3:
                    iR4 = b.r(parcel, iP);
                    break;
                case 4:
                    jS = b.s(parcel, iP);
                    break;
                case 5:
                    jS2 = b.s(parcel, iP);
                    break;
                case 6:
                    strF = b.f(parcel, iP);
                    break;
                case 7:
                    strF2 = b.f(parcel, iP);
                    break;
                case 8:
                    iR5 = b.r(parcel, iP);
                    break;
                case 9:
                    iR = b.r(parcel, iP);
                    break;
                default:
                    b.u(parcel, iP);
                    break;
            }
        }
        b.k(parcel, iV);
        return new C3205n(iR2, iR3, iR4, jS, jS2, strF, strF2, iR5, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3205n[i8];
    }
}
