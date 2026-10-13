package io.ktor.websocket;

import p017b7.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends Exception implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25713a;

    public l(String violation) {
        kotlin.jvm.internal.t.g(violation, "violation");
        this.f25713a = violation;
    }

    @Override // p017b7.D
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l a() {
        l lVar = new l(this.f25713a);
        p149q6.a.a(lVar, this);
        return lVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Received illegal frame: " + this.f25713a;
    }
}
