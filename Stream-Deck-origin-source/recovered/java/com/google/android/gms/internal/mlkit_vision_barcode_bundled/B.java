package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends Binder implements IInterface {
    public B(String str) {
        attachInterface(this, str);
    }

    public abstract boolean a(int i8, Parcel parcel, Parcel parcel2, int i9);

    @Override // android.os.Binder
    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i8, parcel, parcel2, i9)) {
            return true;
        }
        return a(i8, parcel, parcel2, i9);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
