package p053f7;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.h;
import I6.l;
import Q6.p;
import p017b7.J;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f22332a;

        public a(p pVar) {
            this.f22332a = pVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, d dVar) {
            Object objA = o.a(new b(this.f22332a, interfaceC2261g, null), dVar);
            return objA == c.f() ? objA : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f22335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f22336d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, InterfaceC2261g interfaceC2261g, d dVar) {
            super(2, dVar);
            this.f22335c = pVar;
            this.f22336d = interfaceC2261g;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f22335c, this.f22336d, dVar);
            bVar.f22334b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22333a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f22334b;
                p pVar = this.f22335c;
                InterfaceC2261g interfaceC2261g = this.f22336d;
                this.f22333a = 1;
                if (pVar.invoke(j8, interfaceC2261g, this) == objF) {
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

    public static final Object a(Q6.o oVar, d dVar) {
        n nVar = new n(dVar.getContext(), dVar);
        Object objB = p071h7.b.b(nVar, nVar, oVar);
        if (objB == c.f()) {
            h.c(dVar);
        }
        return objB;
    }

    public static final InterfaceC2260f b(p pVar) {
        return new a(pVar);
    }
}
