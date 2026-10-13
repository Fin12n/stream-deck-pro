package io.sentry;

import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X1 f26041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f26042b;

    public W1(X1 x8, Iterable<C2550q2> iterable) {
        this.f26041a = (X1) io.sentry.util.u.c(x8, "SentryEnvelopeHeader is required.");
        this.f26042b = (Iterable) io.sentry.util.u.c(iterable, "SentryEnvelope items are required.");
    }

    public static W1 a(InterfaceC2484c0 interfaceC2484c0, Y2 y8, io.sentry.protocol.o oVar) {
        io.sentry.util.u.c(interfaceC2484c0, "Serializer is required.");
        io.sentry.util.u.c(y8, "session is required.");
        return new W1((io.sentry.protocol.u) null, oVar, C2550q2.y(interfaceC2484c0, y8));
    }

    public X1 b() {
        return this.f26041a;
    }

    public Iterable c() {
        return this.f26042b;
    }

    public W1(io.sentry.protocol.u uVar, io.sentry.protocol.o oVar, Iterable<C2550q2> iterable) {
        this.f26041a = new X1(uVar, oVar);
        this.f26042b = (Iterable) io.sentry.util.u.c(iterable, WqXA.Vxe);
    }

    public W1(io.sentry.protocol.u uVar, io.sentry.protocol.o oVar, C2550q2 c2550q2) {
        io.sentry.util.u.c(c2550q2, "SentryEnvelopeItem is required.");
        this.f26041a = new X1(uVar, oVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c2550q2);
        this.f26042b = arrayList;
    }
}
