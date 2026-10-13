package io.ktor.websocket;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static final w a(io.ktor.utils.io.g input, io.ktor.utils.io.j output, long j8, boolean z8, G6.g coroutineContext) {
        kotlin.jvm.internal.t.g(input, "input");
        kotlin.jvm.internal.t.g(output, "output");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        return new m(input, output, j8, z8, coroutineContext, null, 32, null);
    }

    public static /* synthetic */ w b(io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, long j8, boolean z8, G6.g gVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j8 = 2147483647L;
        }
        long j9 = j8;
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return a(gVar, jVar, j9, z8, gVar2);
    }
}
