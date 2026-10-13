package p061g6;

import C6.G;
import Q6.k;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p205x6.i;
import p205x6.j;
import p221z6.b;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f23802a = new b(128, 65536);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23803a = new a();

        public a() {
            super(1);
        }

        public final void b(j jVar) {
            t.g(jVar, "$this$null");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((j) obj);
            return G.f1419a;
        }
    }

    public static final p205x6.k a(p205x6.k kVar, Cipher cipher, k header) {
        t.g(kVar, "<this>");
        t.g(cipher, "cipher");
        t.g(header, "header");
        ByteBuffer byteBuffer = (ByteBuffer) io.ktor.network.util.a.a().b0();
        Object objB0 = f23802a.b0();
        boolean z8 = true;
        try {
            j jVar = new j(null, 1, null);
            try {
                byteBuffer.clear();
                header.invoke(jVar);
                while (true) {
                    int iB = byteBuffer.hasRemaining() ? i.b(kVar, byteBuffer) : 0;
                    byteBuffer.flip();
                    if (!byteBuffer.hasRemaining() && (iB == -1 || kVar.T0())) {
                        break;
                    }
                    ((ByteBuffer) objB0).clear();
                    if (cipher.getOutputSize(byteBuffer.remaining()) > ((ByteBuffer) objB0).remaining()) {
                        if (z8) {
                            f23802a.H1(objB0);
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(cipher.getOutputSize(byteBuffer.remaining()));
                        t.f(byteBufferAllocate, "allocate(cipher.getOutpu…e(srcBuffer.remaining()))");
                        objB0 = byteBufferAllocate;
                        z8 = false;
                    }
                    cipher.update(byteBuffer, (ByteBuffer) objB0);
                    ((ByteBuffer) objB0).flip();
                    p205x6.t.a(jVar, (ByteBuffer) objB0);
                    byteBuffer.compact();
                }
                byteBuffer.hasRemaining();
                ((ByteBuffer) objB0).hasRemaining();
                int outputSize = cipher.getOutputSize(0);
                if (outputSize != 0) {
                    if (outputSize > ((ByteBuffer) objB0).capacity()) {
                        byte[] bArrDoFinal = cipher.doFinal();
                        t.f(bArrDoFinal, "cipher.doFinal()");
                        p205x6.u.d(jVar, bArrDoFinal, 0, 0, 6, null);
                    } else {
                        ((ByteBuffer) objB0).clear();
                        cipher.doFinal(b.a(), (ByteBuffer) objB0);
                        ((ByteBuffer) objB0).flip();
                        if (((ByteBuffer) objB0).hasRemaining()) {
                            p205x6.t.a(jVar, (ByteBuffer) objB0);
                        } else {
                            byte[] bArrDoFinal2 = cipher.doFinal();
                            t.f(bArrDoFinal2, "cipher.doFinal()");
                            p205x6.u.d(jVar, bArrDoFinal2, 0, 0, 6, null);
                        }
                    }
                }
                p205x6.k kVarM1 = jVar.M1();
                io.ktor.network.util.a.a().H1(byteBuffer);
                if (z8) {
                    f23802a.H1(objB0);
                }
                return kVarM1;
            } catch (Throwable th) {
                jVar.T0();
                throw th;
            }
        } catch (Throwable th2) {
            io.ktor.network.util.a.a().H1(byteBuffer);
            if (!z8) {
                throw th2;
            }
            f23802a.H1(objB0);
            throw th2;
        }
    }

    public static /* synthetic */ p205x6.k b(p205x6.k kVar, Cipher cipher, k kVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            kVar2 = a.f23803a;
        }
        return a(kVar, cipher, kVar2);
    }
}
