package p219z4;

import L4.b;
import L4.c;
import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: z4.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3201j extends IInterface {

    /* JADX INFO: renamed from: z4.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a extends b implements InterfaceC3201j {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static InterfaceC3201j c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3201j ? (InterfaceC3201j) iInterfaceQueryLocalInterface : new l0(iBinder);
        }

        @Override // L4.b
        public final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 != 2) {
                return false;
            }
            Account accountZzb = zzb();
            parcel2.writeNoException();
            c.c(parcel2, accountZzb);
            return true;
        }
    }

    Account zzb();
}
