package K5;

import C6.q;
import C6.r;
import java.io.IOException;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1795l;
import u7.B;
import u7.InterfaceC3045e;
import u7.InterfaceC3046f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC3046f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T5.e f4642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1795l f4643b;

    public b(T5.e requestData, InterfaceC1795l continuation) {
        t.g(requestData, "requestData");
        t.g(continuation, "continuation");
        this.f4642a = requestData;
        this.f4643b = continuation;
    }

    @Override // u7.InterfaceC3046f
    public void a(InterfaceC3045e call, B response) {
        t.g(call, "call");
        t.g(response, "response");
        if (call.c()) {
            return;
        }
        this.f4643b.resumeWith(q.b(response));
    }

    @Override // u7.InterfaceC3046f
    public void b(InterfaceC3045e call, IOException e8) {
        t.g(call, "call");
        t.g(e8, "e");
        if (this.f4643b.isCancelled()) {
            return;
        }
        InterfaceC1795l interfaceC1795l = this.f4643b;
        q.a aVar = q.f1441b;
        interfaceC1795l.resumeWith(q.b(r.a(h.f(this.f4642a, e8))));
    }
}
