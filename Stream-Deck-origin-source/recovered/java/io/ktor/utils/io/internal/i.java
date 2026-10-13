package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f25485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f25486b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        t.f(byteBufferAllocate, "allocate(0)");
        f25485a = byteBufferAllocate;
        f25486b = new j(0);
    }

    public static final ByteBuffer a() {
        return f25485a;
    }

    public static final j b() {
        return f25486b;
    }
}
