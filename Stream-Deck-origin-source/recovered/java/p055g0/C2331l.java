package p055g0;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.k;
import Q6.o;
import p017b7.J;
import p046f0.K;
import p046f0.M;

/* JADX INFO: renamed from: g0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2331l implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2336q f23174b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f23175c = new M();

    /* JADX INFO: renamed from: g0.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23176a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ K f23178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f23179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K k8, o oVar, d dVar) {
            super(2, dVar);
            this.f23178c = k8;
            this.f23179d = oVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return C2331l.this.new a(this.f23178c, this.f23179d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f23176a;
            if (i8 == 0) {
                r.b(obj);
                M m8 = C2331l.this.f23175c;
                InterfaceC2336q interfaceC2336q = C2331l.this.f23174b;
                K k8 = this.f23178c;
                o oVar = this.f23179d;
                this.f23176a = 1;
                if (m8.f(interfaceC2336q, k8, oVar, this) == objF) {
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

    /* JADX INFO: renamed from: g0.l$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2336q {
        public b() {
        }

        @Override // p055g0.InterfaceC2336q
        public void b(float f8) {
            C2331l.this.d().invoke(Float.valueOf(f8));
        }
    }

    public C2331l(k kVar) {
        this.f23173a = kVar;
    }

    @Override // p055g0.v
    public Object a(K k8, o oVar, d dVar) {
        Object objF = p017b7.K.f(new a(k8, oVar, null), dVar);
        return objF == c.f() ? objF : G.f1419a;
    }

    public final k d() {
        return this.f23173a;
    }
}
