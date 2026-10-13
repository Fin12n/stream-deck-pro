package p017b7;

import C6.G;
import G6.g;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: b7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1781e extends AbstractC1773a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f15946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1784f0 f15947e;

    public C1781e(g gVar, Thread thread, AbstractC1784f0 abstractC1784f0) {
        super(gVar, true, true);
        this.f15946d = thread;
        this.f15947e = abstractC1784f0;
    }

    public final Object d1() throws Throwable {
        G g8;
        AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
        if (abstractC1775b != null) {
            abstractC1775b.c();
        }
        try {
            AbstractC1784f0 abstractC1784f0 = this.f15947e;
            if (abstractC1784f0 != null) {
                AbstractC1784f0.a2(abstractC1784f0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC1784f0 abstractC1784f1 = this.f15947e;
                    long jD2 = abstractC1784f1 != null ? abstractC1784f1.d2() : Long.MAX_VALUE;
                    if (y()) {
                        AbstractC1784f0 abstractC1784f2 = this.f15947e;
                        if (abstractC1784f2 != null) {
                            AbstractC1784f0.q1(abstractC1784f2, false, 1, null);
                        }
                        AbstractC1775b abstractC1775b2 = AbstractC1777c.f15940a;
                        if (abstractC1775b2 != null) {
                            abstractC1775b2.g();
                        }
                        Object objH = E0.h(c0());
                        C1822z c1822z = objH instanceof C1822z ? (C1822z) objH : null;
                        if (c1822z == null) {
                            return objH;
                        }
                        throw c1822z.f15995a;
                    }
                    AbstractC1775b abstractC1775b3 = AbstractC1777c.f15940a;
                    if (abstractC1775b3 != null) {
                        abstractC1775b3.b(this, jD2);
                        g8 = G.f1419a;
                    } else {
                        g8 = null;
                    }
                    if (g8 == null) {
                        LockSupport.parkNanos(this, jD2);
                    }
                } catch (Throwable th) {
                    AbstractC1784f0 abstractC1784f3 = this.f15947e;
                    if (abstractC1784f3 != null) {
                        AbstractC1784f0.q1(abstractC1784f3, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            D(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC1775b abstractC1775b4 = AbstractC1777c.f15940a;
            if (abstractC1775b4 != null) {
                abstractC1775b4.g();
            }
            throw th2;
        }
    }

    @Override // p017b7.D0
    public boolean m0() {
        return true;
    }

    @Override // p017b7.D0
    public void w(Object obj) {
        G g8;
        if (t.c(Thread.currentThread(), this.f15946d)) {
            return;
        }
        Thread thread = this.f15946d;
        AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
        if (abstractC1775b != null) {
            abstractC1775b.f(thread);
            g8 = G.f1419a;
        } else {
            g8 = null;
        }
        if (g8 == null) {
            LockSupport.unpark(thread);
        }
    }
}
