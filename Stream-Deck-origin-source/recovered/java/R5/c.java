package R5;

import io.ktor.websocket.w;
import kotlin.jvm.internal.t;
import p035d7.x;
import p035d7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements a, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.b f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f9507b;

    public c(H5.b call, w session) {
        t.g(call, "call");
        t.g(session, "session");
        this.f9506a = call;
        this.f9507b = session;
    }

    @Override // io.ktor.websocket.w
    public y J0() {
        return this.f9507b.J0();
    }

    @Override // io.ktor.websocket.w
    public void M1(long j8) {
        this.f9507b.M1(j8);
    }

    @Override // io.ktor.websocket.w
    public long X1() {
        return this.f9507b.X1();
    }

    @Override // io.ktor.websocket.w
    public x c() {
        return this.f9507b.c();
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f9507b.getCoroutineContext();
    }

    @Override // io.ktor.websocket.w
    public Object q1(io.ktor.websocket.e eVar, G6.d dVar) {
        return this.f9507b.q1(eVar, dVar);
    }

    @Override // io.ktor.websocket.w
    public Object w0(G6.d dVar) {
        return this.f9507b.w0(dVar);
    }
}
