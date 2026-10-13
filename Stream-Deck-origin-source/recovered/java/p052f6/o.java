package p052f6;

import C6.G;
import I6.d;
import R0.pkXL.Oitvkwcwn;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.t;
import p070h6.b;
import p070h6.c;
import p070h6.e;
import p070h6.f;
import p070h6.h;
import p205x6.j;
import p205x6.k;
import p205x6.r;
import p205x6.u;
import p205x6.v;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22117d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22116c = obj;
            this.f22117d |= Integer.MIN_VALUE;
            return o.n(null, null, this);
        }
    }

    public static final k a(List list) {
        j jVar = new j(null, 1, null);
        try {
            if (list.size() > 16382) {
                throw new IllegalArgumentException("Too many named curves provided: at most 16382 could be provided");
            }
            v.e(jVar, p070h6.j.ELLIPTIC_CURVES.b());
            int size = list.size() * 2;
            v.e(jVar, (short) (size + 2));
            v.e(jVar, (short) size);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v.e(jVar, ((c) it.next()).b());
            }
            return jVar.M1();
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }

    public static /* synthetic */ k b(List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = p070h6.d.a();
        }
        return a(list);
    }

    public static final k c(List list) {
        j jVar = new j(null, 1, null);
        try {
            v.e(jVar, p070h6.j.EC_POINT_FORMAT.b());
            int size = list.size();
            v.e(jVar, (short) (size + 1));
            jVar.g1((byte) size);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jVar.g1(((e) it.next()).b());
            }
            return jVar.M1();
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }

    public static /* synthetic */ k d(List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = f.a();
        }
        return c(list);
    }

    public static final k e(String str) {
        j jVar = new j(null, 1, null);
        try {
            if (str.length() >= 32762) {
                throw new IllegalArgumentException("Server name length limit exceeded: at most 32762 characters allowed");
            }
            v.e(jVar, p070h6.j.SERVER_NAME.b());
            v.e(jVar, (short) (str.length() + 5));
            v.e(jVar, (short) (str.length() + 3));
            jVar.g1((byte) 0);
            v.e(jVar, (short) str.length());
            y.i(jVar, str, 0, 0, null, 14, null);
            return jVar.M1();
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }

    public static final k f(List list) {
        j jVar = new j(null, 1, null);
        try {
            v.e(jVar, p070h6.j.SIGNATURE_ALGORITHMS.b());
            int size = list.size() * 2;
            v.e(jVar, (short) (size + 2));
            v.e(jVar, (short) size);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                jVar.g1(bVar.a().b());
                jVar.g1(bVar.d().b());
            }
            return jVar.M1();
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }

    public static /* synthetic */ k g(List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = h.d();
        }
        return f(list);
    }

    public static final k h(byte[] digest, SecretKey secretKey) {
        t.g(digest, "digest");
        t.g(secretKey, "secretKey");
        j jVar = new j(null, 1, null);
        try {
            u.d(jVar, j.a(secretKey, l.d(), digest, 12), 0, 0, 6, null);
            return jVar.M1();
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }

    public static final byte[] i(byte[] handshakeHash, SecretKey secretKey, int i8) {
        t.g(handshakeHash, "handshakeHash");
        t.g(secretKey, "secretKey");
        return j.a(secretKey, l.e(), handshakeHash, i8);
    }

    public static final void j(j jVar, byte[] bArr, int i8) {
        j jVar2;
        int i9 = (i8 + 7) >>> 3;
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (bArr[i10] != 0) {
                break;
            } else {
                i10++;
            }
        }
        int length2 = i9 - (bArr.length - i10);
        if (length2 > 0) {
            jVar2 = jVar;
            u.d(jVar2, new byte[length2], 0, 0, 6, null);
        } else {
            jVar2 = jVar;
        }
        u.b(jVar2, bArr, i10, bArr.length - i10);
    }

    public static final void k(j jVar, ECPoint point, int i8) throws r {
        t.g(jVar, "<this>");
        t.g(point, "point");
        j jVar2 = new j(null, 1, null);
        try {
            jVar2.g1((byte) 4);
            byte[] byteArray = point.getAffineX().toByteArray();
            t.f(byteArray, "point.affineX.toByteArray()");
            j(jVar2, byteArray, i8);
            byte[] byteArray2 = point.getAffineY().toByteArray();
            t.f(byteArray2, "point.affineY.toByteArray()");
            j(jVar2, byteArray2, i8);
            k kVarM1 = jVar2.M1();
            jVar.g1((byte) kVarM1.o1());
            jVar.o1(kVarM1);
        } catch (Throwable th) {
            jVar2.T0();
            throw th;
        }
    }

    public static final void l(j jVar, byte[] preSecret, PublicKey publicKey, SecureRandom random) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, A {
        t.g(jVar, "<this>");
        t.g(preSecret, "preSecret");
        t.g(publicKey, "publicKey");
        t.g(random, "random");
        if (preSecret.length != 48) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        t.d(cipher);
        cipher.init(1, publicKey, random);
        byte[] encryptedSecret = cipher.doFinal(preSecret);
        if (encryptedSecret.length > 65535) {
            throw new A("Encrypted premaster secret is too long", null, 2, null);
        }
        v.e(jVar, (short) encryptedSecret.length);
        t.f(encryptedSecret, "encryptedSecret");
        u.d(jVar, encryptedSecret, 0, 0, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d A[PHI: r9 r10
      0x004d: PHI (r9v5 f6.D) = (r9v4 f6.D), (r9v17 f6.D) binds: [B:34:0x00d5, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r10v5 io.ktor.utils.io.j) = (r10v4 io.ktor.utils.io.j), (r10v16 io.ktor.utils.io.j) binds: [B:34:0x00d5, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1 A[PHI: r9 r10
      0x00c1: PHI (r9v4 f6.D) = (r9v3 f6.D), (r9v15 f6.D) binds: [B:31:0x00be, B:20:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r10v4 io.ktor.utils.io.j) = (r10v3 io.ktor.utils.io.j), (r10v14 io.ktor.utils.io.j) binds: [B:31:0x00be, B:20:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r9.K(r10, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(io.ktor.utils.io.j jVar, D d8, G6.d dVar) {
        a aVar;
        io.ktor.utils.io.j jVar2;
        D d9;
        byte bC;
        short sO1;
        io.ktor.utils.io.j jVar3;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f22117d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f22117d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f22116c;
        Object objF = H6.c.f();
        int i9 = aVar.f22117d;
        if (i9 == 0) {
            C6.r.b(obj);
            byte bC2 = (byte) d8.b().c();
            aVar.f22114a = jVar;
            aVar.f22115b = d8;
            aVar.f22117d = 1;
            if (jVar.E(bC2, aVar) != objF) {
            }
            return objF;
        }
        if (i9 == 1) {
            d8 = (D) aVar.f22115b;
            jVar = (io.ktor.utils.io.j) aVar.f22114a;
            C6.r.b(obj);
        } else {
            if (i9 == 2) {
                d9 = (D) aVar.f22115b;
                jVar2 = (io.ktor.utils.io.j) aVar.f22114a;
                C6.r.b(obj);
                bC = (byte) d9.c().c();
                aVar.f22114a = jVar2;
                aVar.f22115b = d9;
                aVar.f22117d = 3;
                if (jVar2.E(bC, aVar) != objF) {
                    sO1 = (short) d9.a().o1();
                    aVar.f22114a = jVar2;
                    aVar.f22115b = d9;
                    aVar.f22117d = 4;
                    if (jVar2.i(sO1, aVar) != objF) {
                        io.ktor.utils.io.j jVar4 = jVar2;
                        D d10 = d9;
                        jVar3 = jVar4;
                        k kVarA = d10.a();
                        aVar.f22114a = jVar3;
                        aVar.f22115b = null;
                        aVar.f22117d = 5;
                    }
                }
                return objF;
            }
            if (i9 == 3) {
                d9 = (D) aVar.f22115b;
                jVar2 = (io.ktor.utils.io.j) aVar.f22114a;
                C6.r.b(obj);
                sO1 = (short) d9.a().o1();
                aVar.f22114a = jVar2;
                aVar.f22115b = d9;
                aVar.f22117d = 4;
                if (jVar2.i(sO1, aVar) != objF) {
                    io.ktor.utils.io.j jVar5 = jVar2;
                    D d11 = d9;
                    jVar3 = jVar5;
                    k kVarA2 = d11.a();
                    aVar.f22114a = jVar3;
                    aVar.f22115b = null;
                    aVar.f22117d = 5;
                }
                return objF;
            }
            if (i9 == 4) {
                d9 = (D) aVar.f22115b;
                jVar2 = (io.ktor.utils.io.j) aVar.f22114a;
                C6.r.b(obj);
                io.ktor.utils.io.j jVar6 = jVar2;
                D d12 = d9;
                jVar3 = jVar6;
                k kVarA3 = d12.a();
                aVar.f22114a = jVar3;
                aVar.f22115b = null;
                aVar.f22117d = 5;
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar3 = (io.ktor.utils.io.j) aVar.f22114a;
                C6.r.b(obj);
            }
        }
        jVar3.flush();
        return G.f1419a;
        byte bC3 = (byte) (d8.c().c() >> 8);
        aVar.f22114a = jVar;
        aVar.f22115b = d8;
        aVar.f22117d = 2;
        if (jVar.E(bC3, aVar) != objF) {
            D d13 = d8;
            jVar2 = jVar;
            d9 = d13;
            bC = (byte) d9.c().c();
            aVar.f22114a = jVar2;
            aVar.f22115b = d9;
            aVar.f22117d = 3;
            if (jVar2.E(bC, aVar) != objF) {
                sO1 = (short) d9.a().o1();
                aVar.f22114a = jVar2;
                aVar.f22115b = d9;
                aVar.f22117d = 4;
                if (jVar2.i(sO1, aVar) != objF) {
                    io.ktor.utils.io.j jVar7 = jVar2;
                    D d14 = d9;
                    jVar3 = jVar7;
                    k kVarA4 = d14.a();
                    aVar.f22114a = jVar3;
                    aVar.f22115b = null;
                    aVar.f22117d = 5;
                }
            }
        }
        return objF;
    }

    public static final void o(j jVar, X509Certificate[] certificates) {
        t.g(jVar, "<this>");
        t.g(certificates, "certificates");
        j jVar2 = new j(null, 1, null);
        try {
            for (X509Certificate x509Certificate : certificates) {
                byte[] encoded = x509Certificate.getEncoded();
                t.d(encoded);
                r(jVar2, encoded.length);
                u.d(jVar2, encoded, 0, 0, 6, null);
            }
            k kVarM1 = jVar2.M1();
            r(jVar, (int) kVarM1.o1());
            jVar.o1(kVarM1);
        } catch (Throwable th) {
            jVar2.T0();
            throw th;
        }
    }

    public static final void q(j jVar, C type, int i8) throws A {
        t.g(jVar, "<this>");
        t.g(type, "type");
        if (i8 <= 16777215) {
            v.a(jVar, (type.c() << 24) | i8);
            return;
        }
        throw new A("TLS handshake size limit exceeded: " + i8, null, 2, null);
    }

    public static final void r(j jVar, int i8) throws r {
        jVar.g1((byte) ((i8 >>> 16) & 255));
        v.e(jVar, (short) (i8 & 65535));
    }

    public static final void m(j jVar, PublicKey key) throws r, A {
        t.g(jVar, "<this>");
        t.g(key, "key");
        if (!(key instanceof ECPublicKey)) {
            throw new A(Oitvkwcwn.nmcwdEDF + key, null, 2, null);
        }
        ECPublicKey eCPublicKey = (ECPublicKey) key;
        int fieldSize = eCPublicKey.getParams().getCurve().getField().getFieldSize();
        ECPoint w8 = eCPublicKey.getW();
        t.f(w8, "key.w");
        k(jVar, w8, fieldSize);
    }

    public static final void p(j jVar, H h8, List suites, byte[] random, byte[] sessionId, String str) {
        t.g(jVar, "<this>");
        t.g(h8, Oitvkwcwn.lOSqFwPc);
        t.g(suites, "suites");
        t.g(random, "random");
        t.g(sessionId, "sessionId");
        v.e(jVar, (short) h8.c());
        u.d(jVar, random, 0, 0, 6, null);
        int length = sessionId.length;
        if (length < 0 || length > 255 || length > sessionId.length) {
            throw new A("Illegal sessionIdLength", null, 2, null);
        }
        jVar.g1((byte) length);
        int iO1 = 0;
        u.b(jVar, sessionId, 0, length);
        v.e(jVar, (short) (suites.size() * 2));
        Iterator it = suites.iterator();
        while (it.hasNext()) {
            v.e(jVar, ((C2314e) it.next()).c());
        }
        jVar.g1((byte) 1);
        jVar.g1((byte) 0);
        ArrayList<k> arrayList = new ArrayList();
        arrayList.add(g(null, 1, null));
        arrayList.add(b(null, 1, null));
        arrayList.add(d(null, 1, null));
        if (str != null) {
            arrayList.add(e(str));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iO1 += (int) ((k) it2.next()).o1();
        }
        v.e(jVar, (short) iO1);
        for (k e8 : arrayList) {
            t.f(e8, "e");
            jVar.o1(e8);
        }
    }
}
