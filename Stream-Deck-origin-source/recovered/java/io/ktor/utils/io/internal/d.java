package io.ktor.utils.io.internal;

import io.ktor.utils.io.v;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f25458b;

    public d(Throwable cause) {
        t.g(cause, "cause");
        this.f25458b = cause;
    }

    @Override // io.ktor.utils.io.u
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void w(int i8) throws Throwable {
        throw this.f25458b;
    }

    @Override // io.ktor.utils.io.u
    public ByteBuffer h(int i8, int i9) throws Throwable {
        throw this.f25458b;
    }

    @Override // io.ktor.utils.io.v
    public Object n(int i8, G6.d dVar) throws Throwable {
        throw this.f25458b;
    }
}
