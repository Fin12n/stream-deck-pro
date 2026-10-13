package p140p5;

import java.io.Closeable;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f31247a;

    public /* synthetic */ J(n nVar, I i8) {
        this.f31247a = nVar;
        AbstractC3207p.m(((Thread) nVar.f31298d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31247a.f31298d.set(null);
        this.f31247a.d();
    }
}
