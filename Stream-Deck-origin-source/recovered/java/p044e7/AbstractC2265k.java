package p044e7;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p053f7.s;

/* JADX INFO: renamed from: e7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2265k {

    /* JADX INFO: renamed from: e7.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21006b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2260f interfaceC2260f, d dVar) {
            super(2, dVar);
            this.f21006b = interfaceC2260f;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f21006b, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f21005a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260f = this.f21006b;
                this.f21005a = 1;
                if (AbstractC2262h.i(interfaceC2260f, this) == objF) {
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

    public static final Object a(InterfaceC2260f interfaceC2260f, d dVar) {
        Object objCollect = interfaceC2260f.collect(s.f22339a, dVar);
        return objCollect == c.f() ? objCollect : G.f1419a;
    }

    public static final Object b(InterfaceC2260f interfaceC2260f, o oVar, d dVar) {
        Object objI = AbstractC2262h.i(AbstractC2266l.b(AbstractC2262h.I(interfaceC2260f, oVar), 0, null, 2, null), dVar);
        return objI == c.f() ? objI : G.f1419a;
    }

    public static final Object c(InterfaceC2261g interfaceC2261g, InterfaceC2260f interfaceC2260f, d dVar) {
        AbstractC2262h.v(interfaceC2261g);
        Object objCollect = interfaceC2260f.collect(interfaceC2261g, dVar);
        return objCollect == c.f() ? objCollect : G.f1419a;
    }

    public static final InterfaceC1815v0 d(InterfaceC2260f interfaceC2260f, J j8) {
        return AbstractC1789i.d(j8, null, null, new a(interfaceC2260f, null), 3, null);
    }
}
