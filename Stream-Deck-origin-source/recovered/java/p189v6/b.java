package p189v6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f35173a = new b();

    @Override // p189v6.a
    public void a(ByteBuffer instance) {
        t.g(instance, "instance");
    }

    @Override // p189v6.a
    public ByteBuffer b(int i8) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
        t.f(byteBufferAllocate, "allocate(size)");
        return c.b(byteBufferAllocate);
    }
}
