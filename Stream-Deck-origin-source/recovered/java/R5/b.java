package R5;

import java.util.List;
import kotlin.jvm.internal.t;
import p035d7.x;
import p035d7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements a, io.ktor.websocket.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.b f9504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.ktor.websocket.b f9505b;

    public b(H5.b call, io.ktor.websocket.b delegate) {
        t.g(call, "call");
        t.g(delegate, "delegate");
        this.f9504a = call;
        this.f9505b = delegate;
    }

    @Override // io.ktor.websocket.w
    public y J0() {
        return this.f9505b.J0();
    }

    @Override // io.ktor.websocket.w
    public void M1(long j8) {
        this.f9505b.M1(j8);
    }

    @Override // io.ktor.websocket.w
    public long X1() {
        return this.f9505b.X1();
    }

    @Override // io.ktor.websocket.w
    public x c() {
        return this.f9505b.c();
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f9505b.getCoroutineContext();
    }

    @Override // io.ktor.websocket.b
    public void o1(List negotiatedExtensions) {
        t.g(negotiatedExtensions, "negotiatedExtensions");
        this.f9505b.o1(negotiatedExtensions);
    }

    @Override // io.ktor.websocket.w
    public Object q1(io.ktor.websocket.e eVar, G6.d dVar) {
        return this.f9505b.q1(eVar, dVar);
    }

    @Override // io.ktor.websocket.w
    public Object w0(G6.d dVar) {
        return this.f9505b.w0(dVar);
    }
}
