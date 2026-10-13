package p219z4;

import L4.b;
import L4.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O extends b implements InterfaceC3202k {
    public O() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // L4.b
    public final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            z(i10, strongBinder, bundle);
        } else if (i8 == 2) {
            int i11 = parcel.readInt();
            Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            t(i11, bundle2);
        } else {
            if (i8 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            a0 a0Var = (a0) c.a(parcel, a0.CREATOR);
            c.b(parcel);
            x(i12, strongBinder2, a0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
