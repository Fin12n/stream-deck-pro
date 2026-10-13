package com.revenuecat.purchases.common.verification;

import android.util.Base64;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p006a5.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DefaultSignatureVerifier implements SignatureVerifier {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final c verifier;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultSignatureVerifier(byte[] bArr) {
        t.g(bArr, yOZfxp.nZgQhEEhuQRPiNr);
        this.verifier = new c(bArr);
    }

    @Override // com.revenuecat.purchases.common.verification.SignatureVerifier
    public boolean verify(byte[] signatureToVerify, byte[] messageToVerify) {
        t.g(signatureToVerify, "signatureToVerify");
        t.g(messageToVerify, "messageToVerify");
        try {
            this.verifier.a(signatureToVerify, messageToVerify);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultSignatureVerifier(String publicKey) {
        t.g(publicKey, "publicKey");
        byte[] bArrDecode = Base64.decode(publicKey, 0);
        t.f(bArrDecode, "decode(publicKey, Base64.DEFAULT)");
        this(bArrDecode);
    }

    public /* synthetic */ DefaultSignatureVerifier(String str, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? DEFAULT_PUBLIC_KEY : str);
    }
}
