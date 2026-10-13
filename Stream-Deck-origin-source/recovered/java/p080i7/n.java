package p080i7;

import F1.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.J;
import p221z6.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24794b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24795c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24796d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24797e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f24798a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final h a(h hVar, boolean z8) {
        if (z8) {
            return b(hVar);
        }
        h hVar2 = (h) f24794b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f24782b.b() == 1) {
            f24797e.incrementAndGet(this);
        }
        int i8 = f24795c.get(this) & 127;
        while (this.f24798a.get(i8) != null) {
            Thread.yield();
        }
        this.f24798a.lazySet(i8, hVar);
        f24795c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || hVar.f24782b.b() != 1) {
            return;
        }
        f24797e.decrementAndGet(this);
    }

    public final int e() {
        return f24795c.get(this) - f24796d.get(this);
    }

    public final int i() {
        return f24794b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f24794b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f24794b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final h m() {
        h hVar;
        while (true) {
            int i8 = f24796d.get(this);
            if (i8 - f24795c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (f24796d.compareAndSet(this, i8, i8 + 1) && (hVar = (h) this.f24798a.getAndSet(i9, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    public final h o(boolean z8) {
        h hVar;
        do {
            hVar = (h) f24794b.get(this);
            if (hVar != null) {
                if ((hVar.f24782b.b() == 1) == z8) {
                }
            }
            int i8 = f24796d.get(this);
            int i9 = f24795c.get(this);
            while (i8 != i9) {
                if (z8 && f24797e.get(this) == 0) {
                    return null;
                }
                i9--;
                h hVarQ = q(i9, z8);
                if (hVarQ != null) {
                    return hVarQ;
                }
            }
            return null;
        } while (!b.a(f24794b, this, hVar, null));
        return hVar;
    }

    public final h p(int i8) {
        int i9 = f24796d.get(this);
        int i10 = f24795c.get(this);
        boolean z8 = i8 == 1;
        while (i9 != i10) {
            if (z8 && f24797e.get(this) == 0) {
                return null;
            }
            int i11 = i9 + 1;
            h hVarQ = q(i9, z8);
            if (hVarQ != null) {
                return hVarQ;
            }
            i9 = i11;
        }
        return null;
    }

    public final h q(int i8, boolean z8) {
        int i9 = i8 & 127;
        h hVar = (h) this.f24798a.get(i9);
        if (hVar != null) {
            if ((hVar.f24782b.b() == 1) == z8 && c.a(this.f24798a, i9, hVar, null)) {
                if (z8) {
                    f24797e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    public final long r(int i8, J j8) {
        h hVarM = i8 == 3 ? m() : p(i8);
        if (hVarM == null) {
            return s(i8, j8);
        }
        j8.f28779a = hVarM;
        return -1L;
    }

    public final long s(int i8, J j8) {
        h hVar;
        do {
            hVar = (h) f24794b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f24782b.b() != 1 ? 2 : 1) & i8) == 0) {
                return -2L;
            }
            long jA = l.f24790f.a() - hVar.f24781a;
            long j9 = l.f24786b;
            if (jA < j9) {
                return j9 - jA;
            }
        } while (!b.a(f24794b, this, hVar, null));
        j8.f28779a = hVar;
        return -1L;
    }
}
