package p056g1;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: g1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2340d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23579a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f23580b = b.f23582a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f23581c = c.f23583a;

    /* JADX INFO: renamed from: g1.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements p047f1.k {
        @Override // p047f1.k
        public Object u(p047f1.c cVar) {
            return cVar.a().invoke();
        }
    }

    /* JADX INFO: renamed from: g1.d$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23582a = new b();

        public b() {
            super(1);
        }

        public final void b(C2339c c2339c) {
            c2339c.g2();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2339c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: g1.d$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23583a = new c();

        public c() {
            super(1);
        }

        public final void b(C2339c c2339c) {
            c2339c.j2();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2339c) obj);
            return G.f1419a;
        }
    }

    public static final boolean d(C2339c c2339c) {
        i.c cVarP = AbstractC2347k.k(c2339c).j0().p();
        t.e(cVarP, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((s0) cVarP).d2();
    }
}
