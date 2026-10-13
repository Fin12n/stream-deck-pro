package com.elgato.streamdeck.vsd2.connection;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface CryptoBox {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class KeyPair {
        private final byte[] publicKey;
        private final byte[] secretKey;

        public KeyPair(byte[] publicKey, byte[] secretKey) {
            t.g(publicKey, "publicKey");
            t.g(secretKey, "secretKey");
            this.publicKey = publicKey;
            this.secretKey = secretKey;
        }

        public final byte[] getPublicKey() {
            return this.publicKey;
        }

        public final byte[] getSecretKey() {
            return this.secretKey;
        }
    }

    byte[] calculateSharedKey(KeyPair keyPair);

    KeyPair createKeypair();

    byte[] decrypt(byte[] bArr, byte[] bArr2);

    byte[] encrypt(byte[] bArr, byte[] bArr2);

    String getFingerprint(byte[] bArr);
}
