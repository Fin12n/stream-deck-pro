package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f25462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p221z6.g f25465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p221z6.g f25466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p221z6.g f25467f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends p221z6.f {
        @Override // p221z6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h.c b0() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(f.a());
            t.f(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new h.c(byteBufferAllocateDirect, 0, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends p221z6.d {
        public b(int i8) {
            super(i8);
        }

        @Override // p221z6.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public void j(h.c instance) {
            t.g(instance, "instance");
            f.d().H1(instance.f25471a);
        }

        @Override // p221z6.d
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public h.c t() {
            return new h.c((ByteBuffer) f.d().b0(), 0, 2, null);
        }
    }

    static {
        int iA = m.a("BufferSize", 4096);
        f25462a = iA;
        int iA2 = m.a("BufferPoolSize", 2048);
        f25463b = iA2;
        int iA3 = m.a("BufferObjectPoolSize", 1024);
        f25464c = iA3;
        f25465d = new p221z6.e(iA2, iA);
        f25466e = new b(iA3);
        f25467f = new a();
    }

    public static final int a() {
        return f25462a;
    }

    public static final p221z6.g b() {
        return f25467f;
    }

    public static final p221z6.g c() {
        return f25466e;
    }

    public static final p221z6.g d() {
        return f25465d;
    }
}
