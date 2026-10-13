package p061g6;

import C6.G;
import Q6.k;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p052f6.C2314e;
import p052f6.D;
import p052f6.E;
import p205x6.j;
import p205x6.q;
import p205x6.v;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2314e f23804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23807e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f23808a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8) {
            super(1);
            this.f23808a = j8;
        }

        public final void b(j cipherLoop) {
            t.g(cipherLoop, "$this$cipherLoop");
            v.c(cipherLoop, this.f23808a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((j) obj);
            return G.f1419a;
        }
    }

    public d(C2314e suite, byte[] keyMaterial) {
        t.g(suite, "suite");
        t.g(keyMaterial, "keyMaterial");
        this.f23804b = suite;
        this.f23805c = keyMaterial;
    }

    @Override // p061g6.f
    public D a(D record) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        t.g(record, "record");
        C2314e c2314e = this.f23804b;
        byte[] bArr = this.f23805c;
        E eB = record.b();
        int iO1 = (int) record.a().o1();
        long j8 = this.f23807e;
        p205x6.k kVarA = c.a(record.a(), e.d(c2314e, bArr, eB, iO1, j8, j8), new a(this.f23807e));
        this.f23807e++;
        return new D(record.b(), null, kVarA, 2, null);
    }

    @Override // p061g6.f
    public D b(D record) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        t.g(record, "record");
        p205x6.k kVarA = record.a();
        long jO1 = kVarA.o1();
        long jC = q.c(kVarA);
        long j8 = this.f23806d;
        this.f23806d = 1 + j8;
        return new D(record.b(), record.c(), c.b(kVarA, e.c(this.f23804b, this.f23805c, record.b(), (int) jO1, jC, j8), null, 2, null));
    }
}
