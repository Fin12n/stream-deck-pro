package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class S extends B implements T {
    public S() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static T asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new Q(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.B
    public final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        H4.a aVarC = H4.a.AbstractBinderC0133a.c(parcel.readStrongBinder());
        C c8 = (C) AbstractC1878d0.a(parcel, C.CREATOR);
        AbstractC1878d0.b(parcel);
        P pNewBarcodeScanner = newBarcodeScanner(aVarC, c8);
        parcel2.writeNoException();
        if (pNewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(pNewBarcodeScanner.asBinder());
        }
        return true;
    }
}
