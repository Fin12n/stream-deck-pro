package p109m0;

import C6.G;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.u;
import p038e1.Y;
import p038e1.Z;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.C0;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f29482a;

        /* JADX INFO: renamed from: m0.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0645a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y f29483a;

            public C0645a(y yVar) {
                this.f29483a = yVar;
            }

            @Override // p215z0.H
            public void d() {
                this.f29483a.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(1);
            this.f29482a = yVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            return new C0645a(this.f29482a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f29484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A f29486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f29487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f29488e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, int i8, A a8, o oVar, int i9) {
            super(2);
            this.f29484a = obj;
            this.f29485b = i8;
            this.f29486c = a8;
            this.f29487d = oVar;
            this.f29488e = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            z.a(this.f29484a, this.f29485b, this.f29486c, this.f29487d, interfaceC3163l, F0.a(this.f29488e | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(Object obj, int i8, A a8, o oVar, InterfaceC3163l interfaceC3163l, int i9) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2079116560);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2079116560, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
        }
        interfaceC3163lP.f(511388516);
        boolean zR = interfaceC3163lP.R(obj) | interfaceC3163lP.R(a8);
        Object objG = interfaceC3163lP.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new y(obj, a8);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        y yVar = (y) objG;
        yVar.h(i8);
        yVar.j((Y) interfaceC3163lP.e(Z.a()));
        interfaceC3163lP.f(-913235405);
        boolean zR2 = interfaceC3163lP.R(yVar);
        Object objG2 = interfaceC3163lP.g();
        if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
            objG2 = new a(yVar);
            interfaceC3163lP.H(objG2);
        }
        interfaceC3163lP.N();
        K.a(yVar, (k) objG2, interfaceC3163lP, 0);
        AbstractC3182v.a(Z.a().c(yVar), oVar, interfaceC3163lP, C0.f38510d | ((i9 >> 6) & 112));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(obj, i8, a8, oVar, i9));
        }
    }
}
