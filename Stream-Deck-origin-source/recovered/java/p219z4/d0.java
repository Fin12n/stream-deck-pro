package p219z4;

import A4.b;
import A4.c;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.google.android.gms.common.api.Scope;
import p195w4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Parcelable.Creator {
    public static void a(C3197f c3197f, Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.j(parcel, 1, c3197f.f39187a);
        c.j(parcel, 2, c3197f.f39188b);
        c.j(parcel, 3, c3197f.f39189c);
        c.n(parcel, 4, c3197f.f39190d, false);
        c.i(parcel, 5, c3197f.f39191e, false);
        c.q(parcel, 6, c3197f.f39192f, i8, false);
        c.d(parcel, 7, c3197f.f39193g, false);
        c.m(parcel, 8, c3197f.f39194h, i8, false);
        c.q(parcel, 10, c3197f.f39195i, i8, false);
        c.q(parcel, 11, c3197f.f39196j, i8, false);
        c.c(parcel, 12, c3197f.f39197k);
        c.j(parcel, 13, c3197f.f39198l);
        c.c(parcel, 14, c3197f.f39199m);
        c.n(parcel, 15, c3197f.a(), false);
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iV = b.v(parcel);
        Scope[] scopeArr = C3197f.f39185o;
        Bundle bundle = new Bundle();
        d[] dVarArr = C3197f.f39186p;
        d[] dVarArr2 = dVarArr;
        String strF = null;
        IBinder iBinderQ = null;
        Account account = null;
        String strF2 = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        boolean zM = false;
        int iR4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iV) {
            int iP = b.p(parcel);
            switch (b.l(iP)) {
                case 1:
                    iR = b.r(parcel, iP);
                    break;
                case 2:
                    iR2 = b.r(parcel, iP);
                    break;
                case 3:
                    iR3 = b.r(parcel, iP);
                    break;
                case 4:
                    strF = b.f(parcel, iP);
                    break;
                case 5:
                    iBinderQ = b.q(parcel, iP);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.i(parcel, iP, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel, iP);
                    break;
                case 8:
                    account = (Account) b.e(parcel, iP, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.u(parcel, iP);
                    break;
                case 10:
                    dVarArr = (d[]) b.i(parcel, iP, d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (d[]) b.i(parcel, iP, d.CREATOR);
                    break;
                case 12:
                    zM = b.m(parcel, iP);
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    iR4 = b.r(parcel, iP);
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    zM2 = b.m(parcel, iP);
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    strF2 = b.f(parcel, iP);
                    break;
            }
        }
        b.k(parcel, iV);
        return new C3197f(iR, iR2, iR3, strF, iBinderQ, scopeArr, bundle, account, dVarArr, dVarArr2, zM, iR4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3197f[i8];
    }
}
