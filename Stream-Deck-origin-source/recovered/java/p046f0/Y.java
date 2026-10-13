package p046f0;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p110m1.g;
import p110m1.n;
import p110m1.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21348a = new a();

        public a() {
            super(1);
        }

        public final void b(x xVar) {
            p110m1.u.R(xVar, g.f29502d.a());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar) {
        return n.c(iVar, true, a.f21348a);
    }
}
