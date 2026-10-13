package p055g0;

import B0.d;
import C6.G;
import C6.q;
import Q0.h;
import Q6.k;
import W6.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.InterfaceC1795l;

/* JADX INFO: renamed from: g0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2328i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f23138b = d.f896d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23139a = new d(new C2330k.a[16], 0);

    /* JADX INFO: renamed from: g0.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2330k.a f23141b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2330k.a aVar) {
            super(1);
            this.f23141b = aVar;
        }

        public final void b(Throwable th) {
            C2328i.this.f23139a.z(this.f23141b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    public final void b(Throwable th) {
        d dVar = this.f23139a;
        int iS = dVar.s();
        InterfaceC1795l[] interfaceC1795lArr = new InterfaceC1795l[iS];
        for (int i8 = 0; i8 < iS; i8++) {
            interfaceC1795lArr[i8] = ((C2330k.a) dVar.r()[i8]).a();
        }
        for (int i9 = 0; i9 < iS; i9++) {
            interfaceC1795lArr[i9].f(th);
        }
        if (!this.f23139a.u()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(C2330k.a aVar) {
        h hVar = (h) aVar.b().invoke();
        if (hVar == null) {
            InterfaceC1795l interfaceC1795lA = aVar.a();
            q.a aVar2 = q.f1441b;
            interfaceC1795lA.resumeWith(q.b(G.f1419a));
            return false;
        }
        aVar.a().J(new a(aVar));
        i iVar = new i(0, this.f23139a.s() - 1);
        int iS = iVar.s();
        int iT = iVar.t();
        if (iS <= iT) {
            while (true) {
                h hVar2 = (h) ((C2330k.a) this.f23139a.r()[iT]).b().invoke();
                if (hVar2 != null) {
                    h hVarP = hVar.p(hVar2);
                    if (!t.c(hVarP, hVar)) {
                        if (!t.c(hVarP, hVar2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int iS2 = this.f23139a.s() - 1;
                            if (iS2 <= iT) {
                                while (true) {
                                    ((C2330k.a) this.f23139a.r()[iT]).a().f(cancellationException);
                                    if (iS2 == iT) {
                                        break;
                                    }
                                    iS2++;
                                }
                            }
                        }
                    } else {
                        this.f23139a.c(iT + 1, aVar);
                        return true;
                    }
                }
                if (iT != iS) {
                    iT--;
                }
            }
        }
        this.f23139a.c(0, aVar);
        return true;
    }

    public final void d() {
        i iVar = new i(0, this.f23139a.s() - 1);
        int iS = iVar.s();
        int iT = iVar.t();
        if (iS <= iT) {
            while (true) {
                ((C2330k.a) this.f23139a.r()[iS]).a().resumeWith(q.b(G.f1419a));
                if (iS == iT) {
                    break;
                } else {
                    iS++;
                }
            }
        }
        this.f23139a.m();
    }
}
