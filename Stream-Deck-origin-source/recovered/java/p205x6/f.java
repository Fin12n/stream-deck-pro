package p205x6;

import C6.G;
import P2.Lsk.mHPawN;
import com.amazon.a.a.o.c.a.b;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.t;
import p189v6.c;
import p189v6.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final void b(a aVar, byte[] destination, int i8, int i9) throws EOFException {
        t.g(aVar, "<this>");
        t.g(destination, "destination");
        ByteBuffer byteBufferH = aVar.h();
        int i10 = aVar.i();
        if (aVar.k() - i10 >= i9) {
            d.b(byteBufferH, destination, i10, i9, i8);
            G g8 = G.f1419a;
            aVar.c(i9);
        } else {
            throw new EOFException("Not enough bytes to read a byte array of size " + i9 + b.f16789a);
        }
    }

    public static final long d(a aVar) throws EOFException {
        t.g(aVar, "<this>");
        ByteBuffer byteBufferH = aVar.h();
        int i8 = aVar.i();
        if (aVar.k() - i8 >= 8) {
            Long lValueOf = Long.valueOf(byteBufferH.getLong(i8));
            aVar.c(8);
            return lValueOf.longValue();
        }
        throw new EOFException("Not enough bytes to read a long integer of size 8" + b.f16789a);
    }

    public static final short e(a aVar) throws EOFException {
        t.g(aVar, "<this>");
        ByteBuffer byteBufferH = aVar.h();
        int i8 = aVar.i();
        if (aVar.k() - i8 >= 2) {
            Short shValueOf = Short.valueOf(byteBufferH.getShort(i8));
            aVar.c(2);
            return shValueOf.shortValue();
        }
        throw new EOFException("Not enough bytes to read a short integer of size 2" + b.f16789a);
    }

    public static final void f(a aVar, a src, int i8) throws r {
        t.g(aVar, "<this>");
        t.g(src, "src");
        if (i8 < 0) {
            throw new IllegalArgumentException(("length shouldn't be negative: " + i8).toString());
        }
        if (i8 > src.k() - src.i()) {
            throw new IllegalArgumentException(("length shouldn't be greater than the source read remaining: " + i8 + " > " + (src.k() - src.i())).toString());
        }
        if (i8 > aVar.g() - aVar.k()) {
            throw new IllegalArgumentException(("length shouldn't be greater than the destination write remaining space: " + i8 + " > " + (aVar.g() - aVar.k())).toString());
        }
        ByteBuffer byteBufferH = aVar.h();
        int iK = aVar.k();
        int iG = aVar.g() - iK;
        if (iG < i8) {
            throw new r("buffer readable content", i8, iG);
        }
        c.c(src.h(), byteBufferH, src.i(), i8, iK);
        src.c(i8);
        aVar.a(i8);
    }

    public static final void g(a aVar, byte[] source, int i8, int i9) throws r {
        t.g(aVar, "<this>");
        t.g(source, "source");
        ByteBuffer byteBufferH = aVar.h();
        int iK = aVar.k();
        int iG = aVar.g() - iK;
        if (iG < i9) {
            throw new r("byte array", i9, iG);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i8, i9).slice().order(ByteOrder.BIG_ENDIAN);
        t.f(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        c.c(c.b(byteBufferOrder), byteBufferH, 0, i9, iK);
        aVar.a(i9);
    }

    public static final void h(a aVar, int i8) {
        t.g(aVar, "<this>");
        ByteBuffer byteBufferH = aVar.h();
        int iK = aVar.k();
        int iG = aVar.g() - iK;
        if (iG < 4) {
            throw new r("regular integer", 4, iG);
        }
        byteBufferH.putInt(iK, i8);
        aVar.a(4);
    }

    public static final void j(a aVar, short s8) {
        t.g(aVar, "<this>");
        ByteBuffer byteBufferH = aVar.h();
        int iK = aVar.k();
        int iG = aVar.g() - iK;
        if (iG < 2) {
            throw new r("short integer", 2, iG);
        }
        byteBufferH.putShort(iK, s8);
        aVar.a(2);
    }

    public static final int a(a aVar, a dst, int i8) throws EOFException {
        t.g(aVar, "<this>");
        t.g(dst, "dst");
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 > dst.g() - dst.k()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ByteBuffer byteBufferH = aVar.h();
        int i9 = aVar.i();
        if (aVar.k() - i9 >= i8) {
            c.c(byteBufferH, dst.h(), i9, i8, dst.k());
            dst.a(i8);
            G g8 = G.f1419a;
            aVar.c(i8);
            return i8;
        }
        throw new EOFException(mHPawN.dZzowgPKE + "buffer content of size " + i8 + b.f16789a);
    }

    public static final int c(a aVar) throws EOFException {
        t.g(aVar, yOZfxp.bBA);
        ByteBuffer byteBufferH = aVar.h();
        int i8 = aVar.i();
        if (aVar.k() - i8 >= 4) {
            Integer numValueOf = Integer.valueOf(byteBufferH.getInt(i8));
            aVar.c(4);
            return numValueOf.intValue();
        }
        throw new EOFException("Not enough bytes to read a regular integer of size 4" + b.f16789a);
    }

    public static final void i(a aVar, long j8) {
        t.g(aVar, "<this>");
        ByteBuffer byteBufferH = aVar.h();
        int iK = aVar.k();
        int iG = aVar.g() - iK;
        if (iG < 8) {
            throw new r(HRHLwtyqJWz.tTAhAaNOCZKX, 8, iG);
        }
        byteBufferH.putLong(iK, j8);
        aVar.a(8);
    }
}
