package io.ktor.client.engine.cio;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements J5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24800a = new a();

    static {
        n.a();
    }

    @Override // J5.h
    public J5.b a(Q6.k block) {
        t.g(block, "block");
        c cVar = new c();
        block.invoke(cVar);
        return new b(cVar);
    }

    public String toString() {
        return "CIO";
    }
}
