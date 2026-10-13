package p219z4;

import A4.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p195w4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        Bundle bundleA = null;
        C3196e c3196e = null;
        int iR = 0;
        d[] dVarArr = null;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            int iL = b.l(iP);
            if (iL == 1) {
                bundleA = b.a(parcel, iP);
            } else if (iL == 2) {
                dVarArr = (d[]) b.i(parcel, iP, d.CREATOR);
            } else if (iL == 3) {
                iR = b.r(parcel, iP);
            } else if (iL != 4) {
                b.u(parcel, iP);
            } else {
                c3196e = (C3196e) b.e(parcel, iP, C3196e.CREATOR);
            }
        }
        b.k(parcel, iV);
        return new a0(bundleA, dVarArr, iR, c3196e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new a0[i8];
    }
}
