package p219z4;

import H4.a;
import L4.b;
import L4.c;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 extends b implements N {
    public m0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // L4.b
    public final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            a aVarK = k();
            parcel2.writeNoException();
            c.d(parcel2, aVarK);
        } else {
            if (i8 != 2) {
                return false;
            }
            int iJ = j();
            parcel2.writeNoException();
            parcel2.writeInt(iJ);
        }
        return true;
    }
}
