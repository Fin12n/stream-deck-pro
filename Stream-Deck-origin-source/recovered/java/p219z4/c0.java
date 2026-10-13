package p219z4;

import A4.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        r rVar = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iR = 0;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            switch (b.l(iP)) {
                case 1:
                    rVar = (r) b.e(parcel, iP, r.CREATOR);
                    break;
                case 2:
                    zM = b.m(parcel, iP);
                    break;
                case 3:
                    zM2 = b.m(parcel, iP);
                    break;
                case 4:
                    iArrD = b.d(parcel, iP);
                    break;
                case 5:
                    iR = b.r(parcel, iP);
                    break;
                case 6:
                    iArrD2 = b.d(parcel, iP);
                    break;
                default:
                    b.u(parcel, iP);
                    break;
            }
        }
        b.k(parcel, iV);
        return new C3196e(rVar, zM, zM2, iArrD, iR, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3196e[i8];
    }
}
