package p055g0;

import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import p002a1.e;
import p046f0.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements v, InterfaceC2336q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f22804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I f22805b = androidx.compose.foundation.gestures.a.f14400c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22807b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f22809d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, d dVar) {
            super(2, dVar);
            this.f22809d = oVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = G.this.new a(this.f22809d, dVar);
            aVar.f22807b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, d dVar) {
            return ((a) create(i8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22806a;
            if (i8 == 0) {
                r.b(obj);
                G.this.c((I) this.f22807b);
                o oVar = this.f22809d;
                G g8 = G.this;
                this.f22806a = 1;
                if (oVar.invoke(g8, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    public G(O o8) {
        this.f22804a = o8;
    }

    @Override // p055g0.v
    public Object a(K k8, o oVar, d dVar) {
        Object objF = this.f22804a.e().f(k8, new a(oVar, null), dVar);
        return objF == c.f() ? objF : C6.G.f1419a;
    }

    @Override // p055g0.InterfaceC2336q
    public void b(float f8) {
        O o8 = this.f22804a;
        o8.c(this.f22805b, o8.q(f8), e.f13022a.a());
    }

    public final void c(I i8) {
        this.f22805b = i8;
    }
}
