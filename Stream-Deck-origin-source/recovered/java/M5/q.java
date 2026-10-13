package M5;

import C6.G;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p017b7.S0;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5724a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2691a f5725b = new C2691a("RequestLifecycle");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements k {

        /* JADX INFO: renamed from: M5.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0209a extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5727b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G5.a f5728c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0209a(G5.a aVar, G6.d dVar) {
                super(3, dVar);
                this.f5728c = aVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                C0209a c0209a = new C0209a(this.f5728c, dVar);
                c0209a.f5727b = eVar;
                return c0209a.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC1818x interfaceC1818x;
                Object objF = H6.c.f();
                int i8 = this.f5726a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1818x = (InterfaceC1818x) this.f5727b;
                    try {
                        C6.r.b(obj);
                        interfaceC1818x.i1();
                        return G.f1419a;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            interfaceC1818x.v(th);
                            throw th;
                        } catch (Throwable th2) {
                            interfaceC1818x.i1();
                            throw th2;
                        }
                    }
                }
                C6.r.b(obj);
                p173t6.e eVar = (p173t6.e) this.f5727b;
                InterfaceC1818x interfaceC1818xA = S0.a(((T5.d) eVar.d()).g());
                G6.g.b bVarA = this.f5728c.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                kotlin.jvm.internal.t.d(bVarA);
                r.c(interfaceC1818xA, (InterfaceC1815v0) bVarA);
                try {
                    ((T5.d) eVar.d()).m(interfaceC1818xA);
                    this.f5727b = interfaceC1818xA;
                    this.f5726a = 1;
                    if (eVar.g(this) == objF) {
                        return objF;
                    }
                    interfaceC1818x = interfaceC1818xA;
                    interfaceC1818x.i1();
                    return G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC1818x = interfaceC1818xA;
                    interfaceC1818x.v(th);
                    throw th;
                }
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(q plugin, G5.a scope) {
            kotlin.jvm.internal.t.g(plugin, "plugin");
            kotlin.jvm.internal.t.g(scope, "scope");
            scope.A().l(T5.g.f9911h.a(), new C0209a(scope, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public q b(Q6.k block) {
            kotlin.jvm.internal.t.g(block, "block");
            return new q(null);
        }

        @Override // M5.k
        public C2691a getKey() {
            return q.f5725b;
        }

        public a() {
        }
    }

    public /* synthetic */ q(AbstractC2633k abstractC2633k) {
        this();
    }

    public q() {
    }
}
