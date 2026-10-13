package p055g0;

import A1.y;
import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p056g1.AbstractC2348l;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC2348l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final O f22821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B f22822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f22823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p002a1.b f22824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f22825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final G f22826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Function0 f22827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f22828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u f22829x;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ long f22831b;

        /* JADX INFO: renamed from: g0.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0525a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f22833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f22834b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f22835c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0525a(K k8, long j8, d dVar) {
                super(2, dVar);
                this.f22834b = k8;
                this.f22835c = j8;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new C0525a(this.f22834b, this.f22835c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((C0525a) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f22833a;
                if (i8 == 0) {
                    r.b(obj);
                    O oJ2 = this.f22834b.j2();
                    long j8 = this.f22835c;
                    this.f22833a = 1;
                    if (oJ2.g(j8, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
        }

        public a(d dVar) {
            super(3, dVar);
        }

        public final Object g(J j8, long j9, d dVar) {
            a aVar = K.this.new a(dVar);
            aVar.f22831b = j9;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((J) obj, ((y) obj2).o(), (d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.f22830a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            AbstractC1789i.d(K.this.i2().e(), null, null, new C0525a(K.this, this.f22831b, null), 3, null);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(K.this.j2().l());
        }
    }

    public K(O o8, B b8, boolean z8, p002a1.b bVar, m mVar) {
        this.f22821p = o8;
        this.f22822q = b8;
        this.f22823r = z8;
        this.f22824s = bVar;
        this.f22825t = mVar;
        d2(new A(o8));
        G g8 = new G(o8);
        this.f22826u = g8;
        b bVar2 = new b();
        this.f22827v = bVar2;
        a aVar = new a(null);
        this.f22828w = aVar;
        this.f22829x = (u) d2(new u(g8, androidx.compose.foundation.gestures.a.f14398a, b8, z8, mVar, bVar2, androidx.compose.foundation.gestures.a.f14399b, aVar, false));
    }

    public final p002a1.b i2() {
        return this.f22824s;
    }

    public final O j2() {
        return this.f22821p;
    }

    public final void k2(B b8, boolean z8, m mVar) {
        this.f22829x.Q2(this.f22826u, androidx.compose.foundation.gestures.a.f14398a, b8, z8, mVar, this.f22827v, androidx.compose.foundation.gestures.a.f14399b, this.f22828w, false);
    }
}
