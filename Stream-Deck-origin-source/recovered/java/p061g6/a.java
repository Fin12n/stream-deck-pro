package p061g6;

import C6.G;
import D6.C0934n;
import Q6.k;
import W6.n;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p052f6.A;
import p052f6.C2314e;
import p052f6.D;
import p052f6.l;
import p115m6.p;
import p205x6.j;
import p205x6.r;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2314e f23790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cipher f23792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SecretKeySpec f23793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Mac f23794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Cipher f23795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SecretKeySpec f23796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Mac f23797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f23798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f23799k;

    /* JADX INFO: renamed from: g6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0551a extends u implements k {
        public C0551a() {
            super(1);
        }

        public final void b(j cipherLoop) {
            t.g(cipherLoop, "$this$cipherLoop");
            byte[] iv = a.this.f23792d.getIV();
            t.f(iv, "sendCipher.iv");
            p205x6.u.d(cipherLoop, iv, 0, 0, 6, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((j) obj);
            return G.f1419a;
        }
    }

    public a(C2314e suite, byte[] keyMaterial) throws NoSuchPaddingException, NoSuchAlgorithmException {
        t.g(suite, "suite");
        t.g(keyMaterial, "keyMaterial");
        this.f23790b = suite;
        this.f23791c = keyMaterial;
        Cipher cipher = Cipher.getInstance(suite.h());
        t.d(cipher);
        this.f23792d = cipher;
        this.f23793e = l.b(keyMaterial, suite);
        Mac mac = Mac.getInstance(suite.k());
        t.d(mac);
        this.f23794f = mac;
        Cipher cipher2 = Cipher.getInstance(suite.h());
        t.d(cipher2);
        this.f23795g = cipher2;
        this.f23796h = l.i(keyMaterial, suite);
        Mac mac2 = Mac.getInstance(suite.k());
        t.d(mac2);
        this.f23797i = mac2;
    }

    @Override // p061g6.f
    public D a(D record) throws Throwable {
        t.g(record, "record");
        this.f23792d.init(1, this.f23793e, new IvParameterSpec(p.b(this.f23790b.e())));
        byte[] bArrC = y.c(record.a(), 0, 1, null);
        byte[] bArrD = d(record, bArrC);
        j jVar = new j(null, 1, null);
        try {
            p205x6.u.d(jVar, bArrC, 0, 0, 6, null);
            try {
                p205x6.u.d(jVar, bArrD, 0, 0, 6, null);
                g(jVar);
                return new D(record.b(), null, c.a(jVar.M1(), this.f23792d, new C0551a()), 2, null);
            } catch (Throwable th) {
                th = th;
                jVar = jVar;
                Throwable th2 = th;
                jVar.T0();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p061g6.f
    public D b(D record) throws InvalidKeyException, A, InvalidAlgorithmParameterException {
        t.g(record, "record");
        p205x6.k kVarA = record.a();
        this.f23795g.init(2, this.f23796h, new IvParameterSpec(y.b(kVarA, this.f23790b.e())));
        byte[] bArrC = y.c(c.b(kVarA, this.f23795g, null, 2, null), 0, 1, null);
        int length = (bArrC.length - (bArrC[bArrC.length - 1] & 255)) - 1;
        int iL = length - this.f23790b.l();
        f(bArrC, length);
        e(record, bArrC, iL);
        j jVar = new j(null, 1, null);
        try {
            p205x6.u.b(jVar, bArrC, 0, iL);
            return new D(record.b(), record.c(), jVar.M1());
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }

    public final byte[] d(D d8, byte[] bArr) throws InvalidKeyException {
        this.f23794f.reset();
        this.f23794f.init(l.c(this.f23791c, this.f23790b));
        byte[] bArr2 = new byte[13];
        b.b(bArr2, 0, this.f23799k);
        bArr2[8] = (byte) d8.b().c();
        bArr2[9] = 3;
        bArr2[10] = 3;
        b.c(bArr2, 11, (short) bArr.length);
        this.f23799k++;
        this.f23794f.update(bArr2);
        byte[] bArrDoFinal = this.f23794f.doFinal(bArr);
        t.f(bArrDoFinal, "sendMac.doFinal(content)");
        return bArrDoFinal;
    }

    public final void e(D d8, byte[] bArr, int i8) throws InvalidKeyException, A {
        this.f23797i.reset();
        this.f23797i.init(l.j(this.f23791c, this.f23790b));
        byte[] bArr2 = new byte[13];
        b.b(bArr2, 0, this.f23798j);
        bArr2[8] = (byte) d8.b().c();
        bArr2[9] = 3;
        bArr2[10] = 3;
        b.c(bArr2, 11, (short) i8);
        this.f23798j++;
        this.f23797i.update(bArr2);
        this.f23797i.update(bArr, 0, i8);
        byte[] bArrDoFinal = this.f23797i.doFinal();
        t.d(bArrDoFinal);
        if (!MessageDigest.isEqual(bArrDoFinal, C0934n.m0(bArr, n.v(i8, this.f23790b.l() + i8)))) {
            throw new A("Failed to verify MAC content", null, 2, null);
        }
    }

    public final void f(byte[] bArr, int i8) throws A {
        int i9 = bArr[bArr.length - 1] & 255;
        int length = bArr.length;
        while (i8 < length) {
            int i10 = bArr[i8] & 255;
            if (i9 != i10) {
                throw new A("Padding invalid: expected " + i9 + ", actual " + i10, null, 2, null);
            }
            i8++;
        }
    }

    public final void g(j jVar) throws r {
        byte blockSize = (byte) (this.f23792d.getBlockSize() - ((jVar.P1() + 1) % this.f23792d.getBlockSize()));
        int i8 = blockSize + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            jVar.g1(blockSize);
        }
    }
}
