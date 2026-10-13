package io.ktor.utils.io.internal;

import io.ktor.utils.io.A;
import io.ktor.utils.io.C2429a;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2429a f25468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p213y6.a f25470d;

    public g(C2429a channel) {
        t.g(channel, "channel");
        this.f25468b = channel;
        this.f25470d = p213y6.a.f38436j.a();
    }

    public final void a() {
        b(p213y6.a.f38436j.a());
    }

    public final void b(p213y6.a aVar) {
        int i8 = this.f25469c;
        p213y6.a aVar2 = this.f25470d;
        int iK = i8 - (aVar2.k() - aVar2.i());
        if (iK > 0) {
            this.f25468b.w(iK);
        }
        this.f25470d = aVar;
        this.f25469c = aVar.k() - aVar.i();
    }

    public int c() {
        return this.f25468b.j();
    }

    @Override // io.ktor.utils.io.w
    public int h(int i8) {
        a();
        int iMin = Math.min(c(), i8);
        this.f25468b.w(iMin);
        return iMin;
    }

    @Override // io.ktor.utils.io.A
    public Object n(int i8, G6.d dVar) {
        a();
        return this.f25468b.n(i8, dVar);
    }

    @Override // io.ktor.utils.io.w
    public p213y6.a w(int i8) {
        ByteBuffer byteBufferH = this.f25468b.h(0, i8);
        if (byteBufferH == null) {
            return null;
        }
        p213y6.a aVarB = p205x6.g.b(byteBufferH, null, 2, null);
        aVarB.s();
        b(aVarB);
        return aVarB;
    }
}
