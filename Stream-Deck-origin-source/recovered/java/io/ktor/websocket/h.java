package io.ktor.websocket;

import p017b7.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends Exception implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25677a;

    public h(long j8) {
        this.f25677a = j8;
    }

    @Override // p017b7.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h a() {
        h hVar = new h(this.f25677a);
        p149q6.a.a(hVar, this);
        return hVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Frame is too big: " + this.f25677a;
    }
}
