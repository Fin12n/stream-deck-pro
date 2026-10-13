package p100l0;

import C6.G;
import G6.d;
import H6.c;
import p055g0.H;
import p109m0.E;
import p110m1.b;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f28964a;

        public a(G g8) {
            this.f28964a = g8;
        }

        @Override // p109m0.E
        public boolean a() {
            return this.f28964a.a();
        }

        @Override // p109m0.E
        public Object c(float f8, d dVar) {
            Object objB = H.b(this.f28964a, f8, null, dVar, 2, null);
            return objB == c.f() ? objB : G.f1419a;
        }

        @Override // p109m0.E
        public Object d(int i8, d dVar) {
            Object objD = G.D(this.f28964a, i8, 0, dVar, 2, null);
            return objD == c.f() ? objD : G.f1419a;
        }

        @Override // p109m0.E
        public int e() {
            return this.f28964a.n();
        }

        @Override // p109m0.E
        public b f() {
            return new b(-1, -1);
        }

        @Override // p109m0.E
        public int h() {
            return this.f28964a.m();
        }
    }

    public static final E a(G g8, boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1247008005);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1247008005, i8, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        Boolean boolValueOf = Boolean.valueOf(z8);
        interfaceC3163l.f(511388516);
        boolean zR = interfaceC3163l.R(boolValueOf) | interfaceC3163l.R(g8);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new a(g8);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        a aVar = (a) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return aVar;
    }
}
