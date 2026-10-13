package p219z4;

import A4.b;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        Account account = null;
        int iR = 0;
        int iR2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            int iL = b.l(iP);
            if (iL == 1) {
                iR = b.r(parcel, iP);
            } else if (iL == 2) {
                account = (Account) b.e(parcel, iP, Account.CREATOR);
            } else if (iL == 3) {
                iR2 = b.r(parcel, iP);
            } else if (iL != 4) {
                b.u(parcel, iP);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.e(parcel, iP, GoogleSignInAccount.CREATOR);
            }
        }
        b.k(parcel, iV);
        return new I(iR, account, iR2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new I[i8];
    }
}
