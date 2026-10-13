package p052f6;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.t;
import p070h6.b;
import p070h6.c;
import p070h6.h;
import p205x6.k;
import p205x6.q;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    public static final byte[] c(SecureRandom secureRandom) {
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        bArr[0] = (byte) (jCurrentTimeMillis >> 24);
        bArr[1] = (byte) (jCurrentTimeMillis >> 16);
        bArr[2] = (byte) (jCurrentTimeMillis >> 8);
        bArr[3] = (byte) jCurrentTimeMillis;
        return bArr;
    }

    public static final C2318i d(c cVar, ECPoint eCPoint) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        t.d(keyPairGenerator);
        keyPairGenerator.initialize(new ECGenParameterSpec(cVar.name()));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        t.d(keyPairGenerateKeyPair);
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        t.e(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        t.d(keyFactory);
        ECParameterSpec params = ((ECPublicKey) publicKey).getParams();
        t.d(params);
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, params));
        t.d(publicKeyGeneratePublic);
        PublicKey publicKey2 = keyPairGenerateKeyPair.getPublic();
        t.f(publicKey2, "clientKeys.public");
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        t.f(privateKey, "clientKeys.private");
        return new C2318i(publicKeyGeneratePublic, publicKey2, privateKey);
    }

    public static final C2312c e(k packet) {
        t.g(packet, "packet");
        byte[] bArrB = y.b(packet, packet.readByte() & 255);
        int iE = q.e(packet) & 65535;
        ArrayList arrayList = new ArrayList();
        int i8 = iE / 2;
        for (int i9 = 0; i9 < i8; i9++) {
            b bVarC = h.c(b.f24489e, packet.readByte(), packet.readByte());
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        int iE2 = q.e(packet) & 65535;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < iE2) {
            int iE3 = q.e(packet) & 65535;
            i10 += iE3 + 2;
            linkedHashSet.add(new X500Principal(y.b(packet, iE3)));
        }
        C2312c c2312c = new C2312c(bArrB, (b[]) arrayList.toArray(new b[0]), linkedHashSet);
        if (packet.T0()) {
            return c2312c;
        }
        throw new IllegalStateException("Check failed.");
    }
}
