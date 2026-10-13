package M3;

import C6.G;
import M5.v;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5521a = new a();

        public a() {
            super(1);
        }

        public final void b(G5.b config) {
            kotlin.jvm.internal.t.g(config, "$this$config");
            G5.b.k(config, M5.u.f5752d, null, 2, null);
            G5.b.k(config, R5.h.f9512d, null, 2, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((G5.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f5522a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f5523a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(1);
                this.f5523a = fVar;
            }

            public final void b(M5.u.a timeout) {
                kotlin.jvm.internal.t.g(timeout, "$this$timeout");
                timeout.f(Long.valueOf(p008a7.a.z(this.f5523a.b())));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((M5.u.a) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(1);
            this.f5522a = fVar;
        }

        public final void b(T5.d webSocketRaw) {
            kotlin.jvm.internal.t.g(webSocketRaw, "$this$webSocketRaw");
            v.f(webSocketRaw, new a(this.f5522a));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T5.d) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q6.o f5526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f5527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.elgato.streamdeck.vsd2.connection.a f5528e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Q6.o oVar, f fVar, com.elgato.streamdeck.vsd2.connection.a aVar, G6.d dVar) {
            super(2, dVar);
            this.f5526c = oVar;
            this.f5527d = fVar;
            this.f5528e = aVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f5526c, this.f5527d, this.f5528e, dVar);
            cVar.f5525b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(R5.a aVar, G6.d dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5524a;
            if (i8 == 0) {
                C6.r.b(obj);
                R5.a aVar = (R5.a) this.f5525b;
                Q6.o oVar = this.f5526c;
                t tVar = new t(this.f5527d, this.f5528e, aVar);
                this.f5524a = 1;
                if (oVar.invoke(tVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    public static final Object a(G5.a aVar, String str, int i8, f fVar, com.elgato.streamdeck.vsd2.connection.a aVar2, Q6.o oVar, G6.d dVar) {
        Object objB = S5.a.b(aVar.b(a.f5521a), null, str, I6.b.d(i8), "/", new b(fVar), new c(oVar, fVar, aVar2, null), dVar, 1, null);
        return objB == H6.c.f() ? objB : G.f1419a;
    }
}
