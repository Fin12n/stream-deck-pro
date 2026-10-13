package p017b7;

import G6.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: b7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1803p extends C1822z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15976c = AtomicIntegerFieldUpdater.newUpdater(C1803p.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1803p(d<?> dVar, Throwable th, boolean z8) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z8);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f15976c.compareAndSet(this, 0, 1);
    }
}
