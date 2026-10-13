package p221z6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f39271h;

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        int i8 = 0;
        this(i8, i8, 3, null);
    }

    @Override // p221z6.d
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public ByteBuffer c(ByteBuffer instance) {
        t.g(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    @Override // p221z6.d
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public ByteBuffer t() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f39271h);
        t.d(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // p221z6.d
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void A(ByteBuffer instance) {
        t.g(instance, "instance");
        if (instance.capacity() != this.f39271h) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public /* synthetic */ e(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 2000 : i8, (i10 & 2) != 0 ? 4096 : i9);
    }

    public e(int i8, int i9) {
        super(i8);
        this.f39271h = i9;
    }
}
