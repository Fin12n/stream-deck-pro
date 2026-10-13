package io.ktor.utils.io.internal;

import io.ktor.utils.io.C2429a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25459c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeWaitJob");
    private volatile /* synthetic */ Object _closeWaitJob;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2429a f25460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25461b;
    private volatile /* synthetic */ int closed;

    public e(C2429a delegatedTo, boolean z8) {
        t.g(delegatedTo, "delegatedTo");
        this.f25460a = delegatedTo;
        this.f25461b = z8;
        this._closeWaitJob = null;
        this.closed = 0;
    }

    public final void a() {
        this.closed = 1;
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) f25459c.getAndSet(this, null);
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
    }

    public final boolean b() {
        return this.f25461b;
    }

    public final C2429a c() {
        return this.f25460a;
    }
}
