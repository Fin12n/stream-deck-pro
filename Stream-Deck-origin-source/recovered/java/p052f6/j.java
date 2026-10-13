package p052f6;

import D6.C0933m;
import E4.JFpq.XRlnZWSrAFn;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final byte[] b(byte[] bArr, Mac mac, SecretKey secretKey, int i8) throws InvalidKeyException {
        if (i8 < 12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byte[] bArrX = new byte[0];
        byte[] bArrDoFinal = bArr;
        while (bArrX.length < i8) {
            mac.reset();
            mac.init(secretKey);
            mac.update(bArrDoFinal);
            bArrDoFinal = mac.doFinal();
            t.f(bArrDoFinal, "mac.doFinal()");
            mac.reset();
            mac.init(secretKey);
            mac.update(bArrDoFinal);
            mac.update(bArr);
            byte[] bArrDoFinal2 = mac.doFinal();
            t.f(bArrDoFinal2, "mac.doFinal()");
            bArrX = C0933m.x(bArrX, bArrDoFinal2);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrX, i8);
        t.f(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static final byte[] a(SecretKey secretKey, byte[] label, byte[] seed, int i8) throws NoSuchAlgorithmException {
        t.g(secretKey, XRlnZWSrAFn.xByhSp);
        t.g(label, "label");
        t.g(seed, "seed");
        byte[] bArrX = C0933m.x(label, seed);
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        t.f(mac, "getInstance(secret.algorithm)");
        return b(bArrX, mac, secretKey, i8);
    }
}
