package p215z0;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import H6.c;
import I6.b;
import I6.l;
import Q6.k;
import Q6.o;
import p017b7.AbstractC1785g;
import p017b7.J;
import p017b7.U;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements InterfaceC3146c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0 f38645a = new Q0();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f38647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, d dVar) {
            super(2, dVar);
            this.f38647b = kVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f38647b, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f38646a;
            if (i8 == 0) {
                r.b(obj);
                this.f38646a = 1;
                if (U.a(16L, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return this.f38647b.invoke(b.e(System.nanoTime()));
        }
    }

    @Override // G6.g.b, G6.g
    public g.b A(g.c cVar) {
        return InterfaceC3146c0.a.b(this, cVar);
    }

    @Override // G6.g
    public g P1(g gVar) {
        return InterfaceC3146c0.a.d(this, gVar);
    }

    @Override // p215z0.InterfaceC3146c0
    public Object V0(k kVar, d dVar) {
        return AbstractC1785g.g(Z.c(), new a(kVar, null), dVar);
    }

    @Override // G6.g.b, G6.g
    public g j(g.c cVar) {
        return InterfaceC3146c0.a.c(this, cVar);
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, o oVar) {
        return InterfaceC3146c0.a.a(this, obj, oVar);
    }
}
