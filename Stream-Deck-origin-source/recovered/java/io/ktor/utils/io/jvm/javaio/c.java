package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f25523a = new c();

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j8);
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Thread token) {
        t.g(token, "token");
        LockSupport.unpark(token);
    }
}
