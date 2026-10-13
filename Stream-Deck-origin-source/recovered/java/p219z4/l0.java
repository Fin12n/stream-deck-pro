package p219z4;

import L4.a;
import L4.c;
import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends a implements InterfaceC3201j {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p219z4.InterfaceC3201j
    public final Account zzb() {
        Parcel parcelA = a(2, P());
        Account account = (Account) c.a(parcelA, Account.CREATOR);
        parcelA.recycle();
        return account;
    }
}
