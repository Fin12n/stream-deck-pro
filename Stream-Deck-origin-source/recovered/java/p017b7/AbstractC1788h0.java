package p017b7;

import C6.G;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: b7.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1788h0 extends AbstractC1784f0 {
    public abstract Thread g2();

    public void h2(long j8, AbstractC1786g0.c cVar) {
        O.f15912i.u2(j8, cVar);
    }

    public final void i2() {
        G g8;
        Thread threadG2 = g2();
        if (Thread.currentThread() != threadG2) {
            AbstractC1775b abstractC1775b = AbstractC1777c.f15940a;
            if (abstractC1775b != null) {
                abstractC1775b.f(threadG2);
                g8 = G.f1419a;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                LockSupport.unpark(threadG2);
            }
        }
    }
}
