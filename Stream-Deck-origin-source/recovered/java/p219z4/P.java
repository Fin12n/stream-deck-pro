package p219z4;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P implements InterfaceC3203l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f39106a;

    public P(IBinder iBinder) {
        this.f39106a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39106a;
    }

    @Override // p219z4.InterfaceC3203l
    public final void e(InterfaceC3202k interfaceC3202k, C3197f c3197f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC3202k != null ? interfaceC3202k.asBinder() : null);
            if (c3197f != null) {
                parcelObtain.writeInt(1);
                d0.a(c3197f, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f39106a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
