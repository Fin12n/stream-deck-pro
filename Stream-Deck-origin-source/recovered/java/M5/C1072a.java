package M5;

import C6.G;
import kotlin.jvm.internal.AbstractC2633k;
import p115m6.C2691a;

/* JADX INFO: renamed from: M5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1072a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0201a f5592a = new C0201a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2691a f5593b = new C2691a("BodyProgress");

    /* JADX INFO: renamed from: M5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0201a implements k {
        public /* synthetic */ C0201a(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(C1072a plugin, G5.a scope) throws p173t6.b {
            kotlin.jvm.internal.t.g(plugin, "plugin");
            kotlin.jvm.internal.t.g(scope, "scope");
            plugin.c(scope);
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1072a b(Q6.k block) {
            kotlin.jvm.internal.t.g(block, "block");
            return new C1072a();
        }

        @Override // M5.k
        public C2691a getKey() {
            return C1072a.f5593b;
        }

        public C0201a() {
        }
    }

    /* JADX INFO: renamed from: M5.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5596c;

        public b(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
            b bVar = new b(dVar);
            bVar.f5595b = eVar;
            bVar.f5596c = obj;
            return bVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5594a;
            if (i8 == 0) {
                C6.r.b(obj);
                p173t6.e eVar = (p173t6.e) this.f5595b;
                Object obj2 = this.f5596c;
                Q6.p pVar = (Q6.p) ((T5.d) eVar.d()).c().e(AbstractC1073b.f5600a);
                if (pVar == null) {
                    return G.f1419a;
                }
                kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                I5.a aVar = new I5.a((p007a6.c) obj2, ((T5.d) eVar.d()).g(), pVar);
                this.f5595b = null;
                this.f5594a = 1;
                if (eVar.h(aVar, this) == objF) {
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

    /* JADX INFO: renamed from: M5.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5599c;

        public c(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p173t6.e eVar, U5.c cVar, G6.d dVar) {
            c cVar2 = new c(dVar);
            cVar2.f5598b = eVar;
            cVar2.f5599c = cVar;
            return cVar2.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5597a;
            if (i8 == 0) {
                C6.r.b(obj);
                p173t6.e eVar = (p173t6.e) this.f5598b;
                U5.c cVar = (U5.c) this.f5599c;
                Q6.p pVar = (Q6.p) cVar.g1().f().getAttributes().e(AbstractC1073b.f5601b);
                if (pVar == null) {
                    return G.f1419a;
                }
                U5.c cVarC = AbstractC1073b.c(cVar, pVar);
                this.f5598b = null;
                this.f5597a = 1;
                if (eVar.h(cVarC, this) == objF) {
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

    public final void c(G5.a aVar) throws p173t6.b {
        p173t6.h hVar = new p173t6.h("ObservableContent");
        aVar.A().j(T5.g.f9911h.b(), hVar);
        aVar.A().l(hVar, new b(null));
        aVar.z().l(U5.b.f10209h.a(), new c(null));
    }
}
