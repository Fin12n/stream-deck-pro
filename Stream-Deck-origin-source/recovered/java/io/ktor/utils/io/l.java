package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1810t;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements y, B, InterfaceC1815v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1815v0 f25550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2442c f25551b;

    public l(InterfaceC1815v0 delegate, InterfaceC2442c channel) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        kotlin.jvm.internal.t.g(channel, "channel");
        this.f25550a = delegate;
        this.f25551b = channel;
    }

    @Override // G6.g.b, G6.g
    public G6.g.b A(G6.g.c key) {
        kotlin.jvm.internal.t.g(key, "key");
        return this.f25550a.A(key);
    }

    @Override // p017b7.InterfaceC1815v0
    public InterfaceC1776b0 H0(Q6.k handler) {
        kotlin.jvm.internal.t.g(handler, "handler");
        return this.f25550a.H0(handler);
    }

    @Override // p017b7.InterfaceC1815v0
    public InterfaceC1776b0 K1(boolean z8, boolean z9, Q6.k handler) {
        kotlin.jvm.internal.t.g(handler, "handler");
        return this.f25550a.K1(z8, z9, handler);
    }

    @Override // G6.g
    public G6.g P1(G6.g context) {
        kotlin.jvm.internal.t.g(context, "context");
        return this.f25550a.P1(context);
    }

    @Override // p017b7.InterfaceC1815v0
    public Y6.g Y() {
        return this.f25550a.Y();
    }

    @Override // io.ktor.utils.io.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC2442c mo219e() {
        return this.f25551b;
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean b() {
        return this.f25550a.b();
    }

    @Override // G6.g.b
    public G6.g.c getKey() {
        return this.f25550a.getKey();
    }

    @Override // p017b7.InterfaceC1815v0
    public InterfaceC1815v0 getParent() {
        return this.f25550a.getParent();
    }

    @Override // p017b7.InterfaceC1815v0
    public Object i0(G6.d dVar) {
        return this.f25550a.i0(dVar);
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean isCancelled() {
        return this.f25550a.isCancelled();
    }

    @Override // G6.g.b, G6.g
    public G6.g j(G6.g.c key) {
        kotlin.jvm.internal.t.g(key, "key");
        return this.f25550a.j(key);
    }

    @Override // p017b7.InterfaceC1815v0
    public p017b7.r j0(InterfaceC1810t child) {
        kotlin.jvm.internal.t.g(child, "child");
        return this.f25550a.j0(child);
    }

    @Override // p017b7.InterfaceC1815v0
    public CancellationException r0() {
        return this.f25550a.r0();
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean start() {
        return this.f25550a.start();
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, Q6.o operation) {
        kotlin.jvm.internal.t.g(operation, "operation");
        return this.f25550a.t(obj, operation);
    }

    public String toString() {
        return "ChannelJob[" + this.f25550a + ']';
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean y() {
        return this.f25550a.y();
    }

    @Override // p017b7.InterfaceC1815v0
    public void z(CancellationException cancellationException) {
        this.f25550a.z(cancellationException);
    }
}
