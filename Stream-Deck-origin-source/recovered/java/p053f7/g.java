package p053f7;

import C6.G;
import C6.r;
import G6.d;
import G6.e;
import H6.c;
import I6.l;
import Q6.o;
import kotlin.jvm.internal.t;
import p017b7.E;
import p035d7.v;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2260f f22283d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22285b;

        public a(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = g.this.new a(dVar);
            aVar.f22285b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, d dVar) {
            return ((a) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22284a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f22285b;
                g gVar = g.this;
                this.f22284a = 1;
                if (gVar.q(interfaceC2261g, this) == objF) {
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

    public g(InterfaceC2260f interfaceC2260f, G6.g gVar, int i8, p035d7.d dVar) {
        super(gVar, i8, dVar);
        this.f22283d = interfaceC2260f;
    }

    public static /* synthetic */ Object n(g gVar, InterfaceC2261g interfaceC2261g, d dVar) {
        if (gVar.f22274b == -3) {
            G6.g context = dVar.getContext();
            G6.g gVarD = E.d(context, gVar.f22273a);
            if (t.c(gVarD, context)) {
                Object objQ = gVar.q(interfaceC2261g, dVar);
                return objQ == c.f() ? objQ : G.f1419a;
            }
            e.b bVar = e.f2817J;
            if (t.c(gVarD.A(bVar), context.A(bVar))) {
                Object objP = gVar.p(interfaceC2261g, gVarD, dVar);
                return objP == c.f() ? objP : G.f1419a;
            }
        }
        Object objCollect = super.collect(interfaceC2261g, dVar);
        return objCollect == c.f() ? objCollect : G.f1419a;
    }

    public static /* synthetic */ Object o(g gVar, v vVar, d dVar) {
        Object objQ = gVar.q(new x(vVar), dVar);
        return objQ == c.f() ? objQ : G.f1419a;
    }

    @Override // p053f7.e, p044e7.InterfaceC2260f
    public Object collect(InterfaceC2261g interfaceC2261g, d dVar) {
        return n(this, interfaceC2261g, dVar);
    }

    @Override // p053f7.e
    public Object h(v vVar, d dVar) {
        return o(this, vVar, dVar);
    }

    public final Object p(InterfaceC2261g interfaceC2261g, G6.g gVar, d dVar) {
        return f.d(gVar, f.e(interfaceC2261g, dVar.getContext()), null, new a(null), dVar, 4, null);
    }

    public abstract Object q(InterfaceC2261g interfaceC2261g, d dVar);

    @Override // p053f7.e
    public String toString() {
        return this.f22283d + " -> " + super.toString();
    }
}
