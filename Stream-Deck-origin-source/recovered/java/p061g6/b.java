package p061g6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f23801a;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        t.f(byteBufferAllocate, "allocate(0)");
        f23801a = byteBufferAllocate;
    }

    public static final ByteBuffer a() {
        return f23801a;
    }

    public static final void b(byte[] bArr, int i8, long j8) {
        t.g(bArr, "<this>");
        for (int i9 = 0; i9 < 8; i9++) {
            bArr[i9 + i8] = (byte) (j8 >>> ((7 - i9) * 8));
        }
    }

    public static final void c(byte[] bArr, int i8, short s8) {
        t.g(bArr, "<this>");
        for (int i9 = 0; i9 < 2; i9++) {
            bArr[i9 + i8] = (byte) (s8 >>> ((1 - i9) * 8));
        }
    }
}
