package R4;

import android.os.Parcel;
import android.os.Parcelable;
import p219z4.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = A4.b.v(parcel);
        p195w4.b bVar = null;
        int iR = 0;
        K k8 = null;
        while (parcel.dataPosition() < iV) {
            int iP = A4.b.p(parcel);
            int iL = A4.b.l(iP);
            if (iL == 1) {
                iR = A4.b.r(parcel, iP);
            } else if (iL == 2) {
                bVar = (p195w4.b) A4.b.e(parcel, iP, p195w4.b.CREATOR);
            } else if (iL != 3) {
                A4.b.u(parcel, iP);
            } else {
                k8 = (K) A4.b.e(parcel, iP, K.CREATOR);
            }
        }
        A4.b.k(parcel, iV);
        return new l(iR, bVar, k8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new l[i8];
    }
}
