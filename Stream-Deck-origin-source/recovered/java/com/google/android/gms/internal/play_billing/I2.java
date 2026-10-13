package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I2 extends N2 implements K2 {
    public I2(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.K2
    public final void A(int i8, String str, Bundle bundle, H2 h8) {
        Parcel parcelP = P();
        parcelP.writeInt(18);
        parcelP.writeString(str);
        P2.c(parcelP, bundle);
        parcelP.writeStrongBinder(h8);
        R(1301, parcelP);
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle C(int i8, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelP = P();
        parcelP.writeInt(i8);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        parcelP.writeString(str3);
        parcelP.writeString(null);
        P2.c(parcelP, bundle);
        Parcel parcelQ = Q(8, parcelP);
        Bundle bundle2 = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.K2
    public final void G(int i8, String str, Bundle bundle, M2 m8) {
        Parcel parcelP = P();
        parcelP.writeInt(12);
        parcelP.writeString(str);
        P2.c(parcelP, bundle);
        parcelP.writeStrongBinder(m8);
        R(1201, parcelP);
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final int I(int i8, String str, String str2, Bundle bundle) {
        Parcel parcelP = P();
        parcelP.writeInt(i8);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        P2.c(parcelP, bundle);
        Parcel parcelQ = Q(10, parcelP);
        int i9 = parcelQ.readInt();
        parcelQ.recycle();
        return i9;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle K(int i8, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelP = P();
        parcelP.writeInt(i8);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        parcelP.writeString(str3);
        P2.c(parcelP, bundle);
        Parcel parcelQ = Q(11, parcelP);
        Bundle bundle2 = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle O(int i8, String str, String str2, Bundle bundle) {
        Parcel parcelP = P();
        parcelP.writeInt(9);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        P2.c(parcelP, bundle);
        Parcel parcelQ = Q(902, parcelP);
        Bundle bundle2 = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle f(int i8, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelP = P();
        parcelP.writeInt(i8);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        P2.c(parcelP, bundle);
        P2.c(parcelP, bundle2);
        Parcel parcelQ = Q(901, parcelP);
        Bundle bundle3 = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final int g(int i8, String str, String str2) {
        Parcel parcelP = P();
        parcelP.writeInt(3);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        Parcel parcelQ = Q(5, parcelP);
        int i9 = parcelQ.readInt();
        parcelQ.recycle();
        return i9;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle h(int i8, String str, String str2, Bundle bundle) {
        Parcel parcelP = P();
        parcelP.writeInt(9);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        P2.c(parcelP, bundle);
        Parcel parcelQ = Q(12, parcelP);
        Bundle bundle2 = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final int i(int i8, String str, String str2) {
        Parcel parcelP = P();
        parcelP.writeInt(i8);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        Parcel parcelQ = Q(1, parcelP);
        int i9 = parcelQ.readInt();
        parcelQ.recycle();
        return i9;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle o(int i8, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelP = P();
        parcelP.writeInt(6);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        parcelP.writeString(str3);
        P2.c(parcelP, bundle);
        Parcel parcelQ = Q(9, parcelP);
        Bundle bundle2 = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle u(int i8, String str, String str2, String str3) {
        Parcel parcelP = P();
        parcelP.writeInt(3);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        parcelP.writeString(str3);
        Parcel parcelQ = Q(4, parcelP);
        Bundle bundle = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final Bundle v(int i8, String str, String str2, String str3, String str4) {
        Parcel parcelP = P();
        parcelP.writeInt(3);
        parcelP.writeString(str);
        parcelP.writeString(str2);
        parcelP.writeString(str3);
        parcelP.writeString(null);
        Parcel parcelQ = Q(3, parcelP);
        Bundle bundle = (Bundle) P2.a(parcelQ, Bundle.CREATOR);
        parcelQ.recycle();
        return bundle;
    }
}
