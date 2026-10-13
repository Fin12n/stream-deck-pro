package p205x6;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;
import p213y6.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final int a(k kVar, ByteBuffer byteBuffer, int i8) throws EOFException {
        a aVarD1;
        while (byteBuffer.hasRemaining() && (aVarD1 = kVar.D1(1)) != null) {
            int iRemaining = byteBuffer.remaining();
            int iK = aVarD1.k() - aVarD1.i();
            if (iRemaining < iK) {
                g.c(aVarD1, byteBuffer, iRemaining);
                kVar.c2(aVarD1.i());
                return i8 + iRemaining;
            }
            g.c(aVarD1, byteBuffer, iK);
            kVar.b2(aVarD1);
            i8 += iK;
        }
        return i8;
    }

    public static final int b(k kVar, ByteBuffer dst) {
        t.g(kVar, "<this>");
        t.g(dst, "dst");
        return a(kVar, dst, 0);
    }

    public static final int c(k kVar, ByteBuffer dst) throws EOFException {
        t.g(kVar, "<this>");
        t.g(dst, "dst");
        int iA = a(kVar, dst, 0);
        if (!dst.hasRemaining()) {
            return iA;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + dst.remaining() + " more bytes required");
    }
}
