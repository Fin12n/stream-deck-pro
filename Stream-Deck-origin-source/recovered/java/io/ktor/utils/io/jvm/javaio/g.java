package io.ktor.utils.io.jvm.javaio;

import C6.C0920i;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f25535a = new g();

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j8) {
        c();
        throw new C0920i();
    }

    public final Void c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Thread token) {
        t.g(token, "token");
        c.f25523a.b(token);
    }
}
