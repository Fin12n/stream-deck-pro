package p189v6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final void a(ByteBuffer copyTo, ByteBuffer destination, int i8) {
        t.g(copyTo, "$this$copyTo");
        t.g(destination, "destination");
        int iRemaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int iPosition = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i8, destination.array(), destination.arrayOffset() + iPosition, iRemaining);
            destination.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i8);
            byteBufferDuplicate.position(i8);
            destination.put(byteBufferDuplicate);
        }
    }

    public static final void b(ByteBuffer copyTo, byte[] destination, int i8, int i9, int i10) {
        t.g(copyTo, "$this$copyTo");
        t.g(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(destination, i10, i9);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i8, destination, i10, i9);
        }
    }

    public static final void c(ByteBuffer copyTo, ByteBuffer destination, int i8) {
        t.g(copyTo, "$this$copyTo");
        t.g(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            d(destination, i8, copyTo.remaining()).put(copyTo);
            return;
        }
        byte[] bArrArray = copyTo.array();
        t.f(bArrArray, "array()");
        int iArrayOffset = copyTo.arrayOffset() + copyTo.position();
        int iRemaining = copyTo.remaining();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iArrayOffset, iRemaining).slice().order(ByteOrder.BIG_ENDIAN);
        t.f(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        c.c(c.b(byteBufferOrder), destination, 0, iRemaining, i8);
        copyTo.position(copyTo.limit());
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i8, int i9) {
        t.g(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        t.f(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i8);
        myDuplicate$lambda$1.limit(i8 + i9);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        t.f(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }
}
