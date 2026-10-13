package p061g6;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.t;
import p052f6.C2314e;
import p052f6.E;
import p052f6.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final Cipher c(C2314e c2314e, byte[] bArr, E e8, int i8, long j8, long j9) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(c2314e.h());
        t.d(cipher);
        SecretKeySpec secretKeySpecI = l.i(bArr, c2314e);
        byte[] bArrCopyOf = Arrays.copyOf(l.h(bArr, c2314e), c2314e.g());
        t.f(bArrCopyOf, "copyOf(this, newSize)");
        b.b(bArrCopyOf, c2314e.e(), j8);
        cipher.init(2, secretKeySpecI, new GCMParameterSpec(c2314e.a() * 8, bArrCopyOf));
        int iG = (i8 - (c2314e.g() - c2314e.e())) - c2314e.a();
        if (iG >= 65536) {
            throw new IllegalStateException(("Content size should fit in 2 bytes, actual: " + iG).toString());
        }
        byte[] bArr2 = new byte[13];
        b.b(bArr2, 0, j9);
        bArr2[8] = (byte) e8.c();
        bArr2[9] = 3;
        bArr2[10] = 3;
        b.c(bArr2, 11, (short) iG);
        cipher.updateAAD(bArr2);
        return cipher;
    }

    public static final Cipher d(C2314e c2314e, byte[] bArr, E e8, int i8, long j8, long j9) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(c2314e.h());
        t.d(cipher);
        SecretKeySpec secretKeySpecB = l.b(bArr, c2314e);
        byte[] bArrCopyOf = Arrays.copyOf(l.a(bArr, c2314e), c2314e.g());
        t.f(bArrCopyOf, "copyOf(this, newSize)");
        b.b(bArrCopyOf, c2314e.e(), j8);
        cipher.init(1, secretKeySpecB, new GCMParameterSpec(c2314e.a() * 8, bArrCopyOf));
        byte[] bArr2 = new byte[13];
        b.b(bArr2, 0, j9);
        bArr2[8] = (byte) e8.c();
        bArr2[9] = 3;
        bArr2[10] = 3;
        b.c(bArr2, 11, (short) i8);
        cipher.updateAAD(bArr2);
        return cipher;
    }
}
