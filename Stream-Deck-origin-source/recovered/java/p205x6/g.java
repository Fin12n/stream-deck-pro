package p205x6;

import C6.G;
import com.amazon.a.a.o.c.a.b;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.t;
import p189v6.c;
import p189v6.d;
import p213y6.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static /* synthetic */ a b(ByteBuffer byteBuffer, p221z6.g gVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = null;
        }
        return a(byteBuffer, gVar);
    }

    public static final void c(a aVar, ByteBuffer dst, int i8) throws EOFException {
        t.g(aVar, "<this>");
        t.g(dst, "dst");
        ByteBuffer byteBufferH = aVar.h();
        int i9 = aVar.i();
        if (aVar.k() - i9 < i8) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i8 + b.f16789a);
        }
        int iLimit = dst.limit();
        try {
            dst.limit(dst.position() + i8);
            d.a(byteBufferH, dst, i9);
            dst.limit(iLimit);
            G g8 = G.f1419a;
            aVar.c(i8);
        } catch (Throwable th) {
            dst.limit(iLimit);
            throw th;
        }
    }

    public static final a a(ByteBuffer byteBuffer, p221z6.g gVar) {
        t.g(byteBuffer, SZCvugJaXc.UIzPxrFW);
        c.a aVar = c.f35174a;
        ByteBuffer byteBufferOrder = byteBuffer.slice().order(ByteOrder.BIG_ENDIAN);
        t.f(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        return new a(c.b(byteBufferOrder), null, gVar, null);
    }
}
