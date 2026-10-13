package com.google.android.gms.internal.play_billing;

import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S1 implements InterfaceC2069u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2069u0 f18823a = new S1();

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2069u0
    public final boolean a(int i8) {
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
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return true;
            default:
                switch (i8) {
                    case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
