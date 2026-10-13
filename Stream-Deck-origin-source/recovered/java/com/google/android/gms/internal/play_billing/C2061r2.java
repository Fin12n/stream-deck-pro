package com.google.android.gms.internal.play_billing;

import com.elgato.streamdeck.vsd2.KnownHost;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2061r2 implements InterfaceC2069u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2069u0 f19009a = new C2061r2();

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2069u0
    public final boolean a(int i8) {
        if (i8 == 17) {
            return true;
        }
        switch (i8) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return true;
            default:
                return false;
        }
    }
}
