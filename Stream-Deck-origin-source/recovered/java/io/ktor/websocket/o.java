package io.ktor.websocket;

import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f25727a = new ArrayBlockingQueue(1024);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f25728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f25729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f25730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25731e;

    public final void a(e f8) throws InterruptedException {
        kotlin.jvm.internal.t.g(f8, "f");
        this.f25727a.put(f8);
    }

    public final int b(e eVar, boolean z8) {
        int i8;
        int iRemaining = eVar.b().remaining();
        if (iRemaining < 126) {
            i8 = 2;
        } else {
            i8 = iRemaining <= 32767 ? 4 : 10;
        }
        return i8 + e(z8);
    }

    public final boolean c() {
        return (this.f25727a.isEmpty() && this.f25728b == null) ? false : true;
    }

    public final int d() {
        return this.f25727a.remainingCapacity();
    }

    public final int e(boolean z8) {
        return z8 ? 4 : 0;
    }

    public final ByteBuffer f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f25729c;
        if (byteBuffer2 != null) {
            ByteBuffer byteBufferB = p115m6.w.b(byteBuffer, 0, 1, null);
            q.b(byteBufferB, byteBuffer2);
            if (byteBufferB != null) {
                return byteBufferB;
            }
        }
        return byteBuffer;
    }

    public final void g(ByteBuffer buffer) {
        e eVar;
        kotlin.jvm.internal.t.g(buffer, "buffer");
        while (k(buffer) && (eVar = (e) this.f25727a.peek()) != null) {
            boolean z8 = this.f25731e;
            i(z8);
            if (buffer.remaining() < b(eVar, z8)) {
                return;
            }
            h(eVar, buffer, z8);
            this.f25727a.remove();
            this.f25728b = f(eVar.b());
        }
    }

    public final void h(e eVar, ByteBuffer byteBuffer, boolean z8) {
        int iE;
        ByteBuffer byteBufferDuplicate;
        int iRemaining = eVar.b().remaining();
        if (iRemaining >= 126) {
            iRemaining = iRemaining <= 65535 ? 126 : 127;
        }
        i iVar = this.f25730d;
        if (iVar == null) {
            if (!eVar.d()) {
                this.f25730d = eVar.e();
            }
            iE = eVar.e().e();
        } else if (iVar == eVar.e()) {
            if (eVar.d()) {
                this.f25730d = null;
            }
            iE = 0;
        } else {
            if (!eVar.e().d()) {
                throw new IllegalStateException("Can't continue with different data frame opcode");
            }
            iE = eVar.e().e();
        }
        byteBuffer.put((byte) (iE | (eVar.d() ? 128 : 0) | (eVar.f() ? 64 : 0) | (eVar.g() ? 32 : 0) | (eVar.h() ? 16 : 0)));
        byteBuffer.put((byte) ((z8 ? 128 : 0) | iRemaining));
        if (iRemaining == 126) {
            byteBuffer.putShort((short) eVar.b().remaining());
        } else if (iRemaining == 127) {
            byteBuffer.putLong(eVar.b().remaining());
        }
        ByteBuffer byteBuffer2 = this.f25729c;
        if (byteBuffer2 == null || (byteBufferDuplicate = byteBuffer2.duplicate()) == null) {
            return;
        }
        p115m6.w.d(byteBufferDuplicate, byteBuffer, 0, 2, null);
    }

    public final void i(boolean z8) {
        if (!z8) {
            this.f25729c = null;
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(U6.c.f10243a.e());
        byteBufferAllocate.clear();
        this.f25729c = byteBufferAllocate;
    }

    public final void j(boolean z8) {
        this.f25731e = z8;
    }

    public final boolean k(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f25728b;
        if (byteBuffer2 == null) {
            return true;
        }
        p115m6.w.d(byteBuffer2, byteBuffer, 0, 2, null);
        if (byteBuffer2.hasRemaining()) {
            return false;
        }
        this.f25728b = null;
        return true;
    }
}
