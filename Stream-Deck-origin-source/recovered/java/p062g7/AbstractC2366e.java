package p062g7;

import F1.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: g7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2366e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23838a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2366e.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23839b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2366e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2366e(AbstractC2366e abstractC2366e) {
        this._prev$volatile = abstractC2366e;
    }

    public final void c() {
        f23839b.set(this, null);
    }

    public final AbstractC2366e d() {
        AbstractC2366e abstractC2366eH = h();
        while (abstractC2366eH != null && abstractC2366eH.k()) {
            abstractC2366eH = (AbstractC2366e) f23839b.get(abstractC2366eH);
        }
        return abstractC2366eH;
    }

    public final AbstractC2366e e() {
        AbstractC2366e abstractC2366eF;
        AbstractC2366e abstractC2366eF2 = f();
        t.d(abstractC2366eF2);
        while (abstractC2366eF2.k() && (abstractC2366eF = abstractC2366eF2.f()) != null) {
            abstractC2366eF2 = abstractC2366eF;
        }
        return abstractC2366eF2;
    }

    public final AbstractC2366e f() {
        Object objG = g();
        if (objG == AbstractC2365d.f23837a) {
            return null;
        }
        return (AbstractC2366e) objG;
    }

    public final Object g() {
        return f23838a.get(this);
    }

    public final AbstractC2366e h() {
        return (AbstractC2366e) f23839b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return b.a(f23838a, this, null, AbstractC2365d.f23837a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC2366e abstractC2366eD = d();
            AbstractC2366e abstractC2366eE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23839b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC2366eE);
            } while (!b.a(atomicReferenceFieldUpdater, abstractC2366eE, obj, ((AbstractC2366e) obj) == null ? null : abstractC2366eD));
            if (abstractC2366eD != null) {
                f23838a.set(abstractC2366eD, abstractC2366eE);
            }
            if (!abstractC2366eE.k() || abstractC2366eE.l()) {
                if (abstractC2366eD == null || !abstractC2366eD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC2366e abstractC2366e) {
        return b.a(f23838a, this, null, abstractC2366e);
    }
}
