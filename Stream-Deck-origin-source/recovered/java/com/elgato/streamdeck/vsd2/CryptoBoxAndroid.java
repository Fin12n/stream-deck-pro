package com.elgato.streamdeck.vsd2;

import com.elgato.streamdeck.vsd2.connection.CryptoBox;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class CryptoBoxAndroid implements CryptoBox {
    public static final Companion Companion;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int init() {
            return CryptoBoxAndroid.init();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        System.loadLibrary("vsd2-android");
        if (companion.init() < 0) {
            throw new IllegalStateException("Failed to initialize libsodium.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int init();

    @Override // com.elgato.streamdeck.vsd2.connection.CryptoBox
    public native byte[] calculateSharedKey(CryptoBox.KeyPair keyPair);

    @Override // com.elgato.streamdeck.vsd2.connection.CryptoBox
    public native CryptoBox.KeyPair createKeypair();

    @Override // com.elgato.streamdeck.vsd2.connection.CryptoBox
    public native byte[] decrypt(byte[] bArr, byte[] bArr2);

    @Override // com.elgato.streamdeck.vsd2.connection.CryptoBox
    public native byte[] encrypt(byte[] bArr, byte[] bArr2);

    @Override // com.elgato.streamdeck.vsd2.connection.CryptoBox
    public native String getFingerprint(byte[] bArr);
}
