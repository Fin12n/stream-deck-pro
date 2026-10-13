package io.ktor.websocket;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f25733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f25734c = ByteBuffer.allocate(4);

    public final boolean a() {
        return this.f25732a > 0;
    }

    public final void b(ByteBuffer bb) {
        kotlin.jvm.internal.t.g(bb, "bb");
        int i8 = this.f25732a;
        ByteBuffer byteBuffer = this.f25733b;
        kotlin.jvm.internal.t.d(byteBuffer);
        this.f25732a = i8 - p115m6.w.c(bb, byteBuffer, this.f25732a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final void c(int i8, ByteBuffer bb) {
        kotlin.jvm.internal.t.g(bb, "bb");
        if (this.f25732a != 0) {
            throw new IllegalStateException("remaining should be 0");
        }
        this.f25732a = i8;
        ByteBuffer byteBuffer = this.f25733b;
        if (byteBuffer != null) {
            kotlin.jvm.internal.t.d(byteBuffer);
            if (byteBuffer.capacity() < i8) {
                this.f25733b = ByteBuffer.allocate(i8);
            }
        } else {
            this.f25733b = ByteBuffer.allocate(i8);
        }
        ByteBuffer byteBuffer2 = this.f25733b;
        kotlin.jvm.internal.t.d(byteBuffer2);
        byteBuffer2.clear();
        b(bb);
    }

    public final ByteBuffer d(Integer num) {
        ByteBuffer byteBuffer = this.f25733b;
        kotlin.jvm.internal.t.d(byteBuffer);
        byteBuffer.flip();
        ByteBuffer view = byteBuffer.slice();
        if (num != null) {
            this.f25734c.clear();
            this.f25734c.asIntBuffer().put(num.intValue());
            this.f25734c.clear();
            kotlin.jvm.internal.t.f(view, "view");
            ByteBuffer maskBuffer = this.f25734c;
            kotlin.jvm.internal.t.f(maskBuffer, "maskBuffer");
            q.b(view, maskBuffer);
        }
        this.f25733b = null;
        ByteBuffer byteBufferAsReadOnlyBuffer = view.asReadOnlyBuffer();
        kotlin.jvm.internal.t.f(byteBufferAsReadOnlyBuffer, "buffer!!.run {\n        f….asReadOnlyBuffer()\n    }");
        return byteBufferAsReadOnlyBuffer;
    }
}
