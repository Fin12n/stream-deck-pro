package p065h1;

import C6.G;
import L0.i;
import Q6.k;
import kotlin.jvm.internal.u;
import p110m1.n;
import p110m1.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f24108a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f24108a = str;
        }

        public final void b(x xVar) {
            p110m1.u.X(xVar, this.f24108a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar, String str) {
        return n.d(iVar, false, new a(str), 1, null);
    }
}
