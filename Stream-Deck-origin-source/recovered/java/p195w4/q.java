package p195w4;

import A4.b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        long jS = -1;
        int iR = 0;
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            int iL = b.l(iP);
            if (iL == 1) {
                strF = b.f(parcel, iP);
            } else if (iL == 2) {
                iR = b.r(parcel, iP);
            } else if (iL != 3) {
                b.u(parcel, iP);
            } else {
                jS = b.s(parcel, iP);
            }
        }
        b.k(parcel, iV);
        return new d(strF, iR, jS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new d[i8];
    }
}
