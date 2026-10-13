package p115m6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    public static final ByteBuffer a(ByteBuffer byteBuffer, int i8) {
        t.g(byteBuffer, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        t.f(byteBufferSlice, "this@copy.slice()");
        t.f(byteBufferAllocate, "this@apply");
        d(byteBufferSlice, byteBufferAllocate, 0, 2, null);
        byteBufferAllocate.clear();
        t.f(byteBufferAllocate, "allocate(size).apply {\n …ly)\n        clear()\n    }");
        return byteBufferAllocate;
    }

    public static /* synthetic */ ByteBuffer b(ByteBuffer byteBuffer, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = byteBuffer.remaining();
        }
        return a(byteBuffer, i8);
    }

    public static final int c(ByteBuffer byteBuffer, ByteBuffer destination, int i8) {
        t.g(byteBuffer, "<this>");
        t.g(destination, "destination");
        int iMin = Math.min(i8, Math.min(byteBuffer.remaining(), destination.remaining()));
        if (iMin == byteBuffer.remaining()) {
            destination.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        destination.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    public static /* synthetic */ int d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return c(byteBuffer, byteBuffer2, i8);
    }

    public static final byte[] e(ByteBuffer byteBuffer) {
        t.g(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }
}
