package p053f7;

import C6.G;
import C6.q;
import G6.d;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import p044e7.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f22268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f22271d;

    public final M e() {
        z zVar;
        synchronized (this) {
            zVar = this.f22271d;
            if (zVar == null) {
                zVar = new z(this.f22269b);
                this.f22271d = zVar;
            }
        }
        return zVar;
    }

    public final d h() {
        d dVarI;
        z zVar;
        synchronized (this) {
            try {
                d[] dVarArrJ = this.f22268a;
                if (dVarArrJ == null) {
                    dVarArrJ = j(2);
                    this.f22268a = dVarArrJ;
                } else if (this.f22269b >= dVarArrJ.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrJ, dVarArrJ.length * 2);
                    t.f(objArrCopyOf, "copyOf(...)");
                    this.f22268a = (d[]) objArrCopyOf;
                    dVarArrJ = (d[]) objArrCopyOf;
                }
                int i8 = this.f22270c;
                do {
                    dVarI = dVarArrJ[i8];
                    if (dVarI == null) {
                        dVarI = i();
                        dVarArrJ[i8] = dVarI;
                    }
                    i8++;
                    if (i8 >= dVarArrJ.length) {
                        i8 = 0;
                    }
                    t.e(dVarI, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarI.a(this));
                this.f22270c = i8;
                this.f22269b++;
                zVar = this.f22271d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            zVar.Z(1);
        }
        return dVarI;
    }

    public abstract d i();

    public abstract d[] j(int i8);

    public final void k(d dVar) {
        z zVar;
        int i8;
        d[] dVarArrB;
        synchronized (this) {
            try {
                int i9 = this.f22269b - 1;
                this.f22269b = i9;
                zVar = this.f22271d;
                if (i9 == 0) {
                    this.f22270c = 0;
                }
                t.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (d dVar2 : dVarArrB) {
            if (dVar2 != null) {
                q.a aVar = q.f1441b;
                dVar2.resumeWith(q.b(G.f1419a));
            }
        }
        if (zVar != null) {
            zVar.Z(-1);
        }
    }

    public final int l() {
        return this.f22269b;
    }

    public final d[] m() {
        return this.f22268a;
    }
}
