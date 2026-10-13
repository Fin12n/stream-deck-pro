package p189v6;

import C6.C0920i;
import com.amazon.device.iap.internal.c.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p213y6.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35174a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f35175b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final ByteBuffer a() {
            return c.f35175b;
        }

        public a() {
        }
    }

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        t.f(byteBufferOrder, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f35175b = b(byteBufferOrder);
    }

    public static ByteBuffer b(ByteBuffer buffer) {
        t.g(buffer, "buffer");
        return buffer;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer destination, int i8, int i9, int i10) {
        t.g(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i8, destination.array(), destination.arrayOffset() + i10, i9);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i8);
        byteBufferDuplicate.limit(i8 + i9);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i10);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }

    public static final void d(ByteBuffer byteBuffer, ByteBuffer destination, long j8, long j9, long j10) {
        t.g(destination, "destination");
        if (j8 >= 2147483647L) {
            e.a(j8, b.as);
            throw new C0920i();
        }
        int i8 = (int) j8;
        if (j9 >= 2147483647L) {
            e.a(j9, "length");
            throw new C0920i();
        }
        int i9 = (int) j9;
        if (j10 < 2147483647L) {
            c(byteBuffer, destination, i8, i9, (int) j10);
        } else {
            e.a(j10, "destinationOffset");
            throw new C0920i();
        }
    }

    public static final ByteBuffer e(ByteBuffer byteBuffer, int i8, int i9) {
        return b(d.d(byteBuffer, i8, i9));
    }
}
