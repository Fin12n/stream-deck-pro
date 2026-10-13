package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O extends B implements P {
    public O() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B
    public final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            k();
            parcel2.writeNoException();
        } else if (i8 == 2) {
            l();
            parcel2.writeNoException();
        } else if (i8 == 3) {
            H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcel.readStrongBinder());
            C1893g0 c1893g0 = (C1893g0) AbstractC1878d0.a(parcel, C1893g0.CREATOR);
            AbstractC1878d0.b(parcel);
            List listQ = q(aVarC, c1893g0);
            parcel2.writeNoException();
            parcel2.writeTypedList(listQ);
        } else if (i8 == 4) {
            H4.a aVarC2 = H4.a.AbstractBinderC0133a.c(parcel.readStrongBinder());
            C1893g0 c1893g1 = (C1893g0) AbstractC1878d0.a(parcel, C1893g0.CREATOR);
            E e8 = (E) AbstractC1878d0.a(parcel, E.CREATOR);
            AbstractC1878d0.b(parcel);
            List listF = F(aVarC2, c1893g1, e8);
            parcel2.writeNoException();
            parcel2.writeTypedList(listF);
        } else {
            if (i8 != 5) {
                return false;
            }
            G g8 = (G) AbstractC1878d0.a(parcel, G.CREATOR);
            AbstractC1878d0.b(parcel);
            w(g8);
            parcel2.writeNoException();
        }
        return true;
    }
}
