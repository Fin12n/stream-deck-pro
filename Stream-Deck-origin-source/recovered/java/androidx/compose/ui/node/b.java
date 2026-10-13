package androidx.compose.ui.node;

import B0.d;
import L0.f;
import L0.i;
import Q6.k;
import W6.n;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14755a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends i.c {
        public String toString() {
            return "<Head>";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0364b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f14756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0364b(d dVar) {
            super(1);
            this.f14756a = dVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i.b bVar) {
            this.f14756a.d(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.T1(-1);
        f14755a = aVar;
    }

    public static final int d(i.b bVar, i.b bVar2) {
        if (t.c(bVar, bVar2)) {
            return 2;
        }
        if (L0.b.a(bVar, bVar2)) {
            return 1;
        }
        return ((bVar instanceof ForceUpdateElement) && L0.b.a(((ForceUpdateElement) bVar).r(), bVar2)) ? 1 : 0;
    }

    public static final d e(i iVar, d dVar) {
        d dVar2 = new d(new i[n.d(dVar.s(), 16)], 0);
        dVar2.d(iVar);
        C0364b c0364b = null;
        while (dVar2.v()) {
            i iVar2 = (i) dVar2.D(dVar2.s() - 1);
            if (iVar2 instanceof f) {
                f fVar = (f) iVar2;
                dVar2.d(fVar.k());
                dVar2.d(fVar.p());
            } else if (iVar2 instanceof i.b) {
                dVar.d(iVar2);
            } else {
                if (c0364b == null) {
                    c0364b = new C0364b(dVar);
                }
                iVar2.a(c0364b);
                c0364b = c0364b;
            }
        }
        return dVar;
    }

    public static final void f(U u8, i.c cVar) {
        t.e(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        u8.p(cVar);
    }
}
