package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends L0 {
    public /* synthetic */ J0(I0 i8) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.L0
    public final void a(Object obj, long j8) {
        ((InterfaceC2078x0) G1.k(obj, j8)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.L0
    public final void b(Object obj, Object obj2, long j8) {
        InterfaceC2078x0 interfaceC2078x0B = (InterfaceC2078x0) G1.k(obj, j8);
        InterfaceC2078x0 interfaceC2078x0 = (InterfaceC2078x0) G1.k(obj2, j8);
        int size = interfaceC2078x0B.size();
        int size2 = interfaceC2078x0.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC2078x0B.j()) {
                interfaceC2078x0B = interfaceC2078x0B.b(size2 + size);
            }
            interfaceC2078x0B.addAll(interfaceC2078x0);
        }
        if (size > 0) {
            interfaceC2078x0 = interfaceC2078x0B;
        }
        G1.x(obj, j8, interfaceC2078x0);
    }
}
