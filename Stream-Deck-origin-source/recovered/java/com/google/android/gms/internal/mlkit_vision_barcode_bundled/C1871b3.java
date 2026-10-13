package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1871b3 implements InterfaceC1934o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1934o1 f18111a = new C1871b3();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1934o1
    public final boolean a(int i8) {
        switch (i8) {
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
            case 18:
            case 21:
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return true;
            case 19:
            case 20:
            default:
                return false;
        }
    }
}
