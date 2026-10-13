package io.ktor.utils.io;

import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements z, C, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2442c f25552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f25553b;

    public m(J delegate, InterfaceC2442c channel) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        kotlin.jvm.internal.t.g(channel, "channel");
        this.f25552a = channel;
        this.f25553b = delegate;
    }

    @Override // io.ktor.utils.io.C
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC2442c mo220e() {
        return this.f25552a;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f25553b.getCoroutineContext();
    }
}
