package io.ktor.utils.io;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends C2429a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Q6.k f25269q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, Q6.k kVar) {
            super(z8, null, 0, 6, null);
            this.f25269q = kVar;
        }

        @Override // io.ktor.utils.io.C2429a, io.ktor.utils.io.j
        public boolean d(Throwable th) {
            return super.d((Throwable) this.f25269q.invoke(th));
        }
    }

    public static final InterfaceC2442c a(boolean z8) {
        return new C2429a(z8, null, 0, 6, null);
    }

    public static final InterfaceC2442c b(boolean z8, Q6.k exceptionMapper) {
        kotlin.jvm.internal.t.g(exceptionMapper, "exceptionMapper");
        return new a(z8, exceptionMapper);
    }

    public static /* synthetic */ InterfaceC2442c c(boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return a(z8);
    }

    public static /* synthetic */ InterfaceC2442c d(boolean z8, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return b(z8, kVar);
    }

    public static final g e(byte[] content, int i8, int i9) {
        kotlin.jvm.internal.t.g(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, i8, i9);
        kotlin.jvm.internal.t.f(byteBufferWrap, "wrap(content, offset, length)");
        return new C2429a(byteBufferWrap);
    }
}
