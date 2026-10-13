package p043e6;

import C6.G;
import Q6.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p034d6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20777a = new a();

        public a() {
            super(1);
        }

        public final void b(r configure) {
            t.g(configure, "$this$configure");
            if (configure instanceof r.d) {
                ((r.d) configure).q(true);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((r) obj);
            return G.f1419a;
        }
    }

    public static final p a(i selector) {
        t.g(selector, "selector");
        return new p(selector, r.f20868e.a());
    }

    public static final g b(g gVar) {
        t.g(gVar, "<this>");
        return gVar.d(a.f20777a);
    }
}
