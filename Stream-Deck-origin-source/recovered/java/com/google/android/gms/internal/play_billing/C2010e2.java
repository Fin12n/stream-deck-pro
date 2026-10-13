package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2010e2 implements InterfaceC2069u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2069u0 f18892a = new C2010e2();

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2069u0
    public final boolean a(int i8) {
        EnumC2014f2 enumC2014f2;
        EnumC2014f2 enumC2014f3 = EnumC2014f2.BROADCAST_ACTION_UNSPECIFIED;
        if (i8 == 0) {
            enumC2014f2 = EnumC2014f2.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i8 == 1) {
            enumC2014f2 = EnumC2014f2.f18898c;
        } else if (i8 != 2) {
            enumC2014f2 = i8 != 3 ? null : EnumC2014f2.ALTERNATIVE_BILLING_ACTION;
        } else {
            enumC2014f2 = EnumC2014f2.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return enumC2014f2 != null;
    }
}
