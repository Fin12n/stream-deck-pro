package io.ktor.websocket;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class r {
    public static final int a() {
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 8;
    }

    public static final void b(ByteBuffer byteBuffer, ByteBuffer other) {
        kotlin.jvm.internal.t.g(byteBuffer, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = other.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i8 = 0; i8 < iRemaining2; i8++) {
            byteBufferSlice.put(i8, (byte) (byteBufferSlice.get(i8) ^ byteBufferSlice2.get(i8 % iRemaining)));
        }
    }
}
