package H3;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import V3.g;
import V3.k;
import X3.f;
import Z2.j;
import Z2.p;
import java.util.Map;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a4.c f3506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f3507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f3508c;

    /* JADX INFO: renamed from: H3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0129a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3509a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V3.j f3511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0129a(V3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f3511c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return a.this.new C0129a(this.f3511c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0129a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3509a;
            if (i8 == 0) {
                r.b(obj);
                p005a4.c cVar = a.this.f3506a;
                Throwable thA = ((g.c) this.f3511c).a();
                this.f3509a = 1;
                if (cVar.d(thA, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3512a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V3.j f3514c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f3514c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return a.this.new b(this.f3514c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3512a;
            if (i8 == 0) {
                r.b(obj);
                p005a4.c cVar = a.this.f3506a;
                String strD = ((g.a) this.f3514c).d();
                if (strD == null) {
                    strD = "";
                }
                String str = strD;
                String strA = ((g.a) this.f3514c).a();
                if (strA == null) {
                    strA = "default";
                }
                String str2 = strA;
                f fVarB = H3.b.b(((g.a) this.f3514c).c());
                String strE = ((g.a) this.f3514c).e();
                Map mapB = ((g.a) this.f3514c).b();
                this.f3512a = 1;
                if (cVar.a(str, str2, fVarB, strE, mapB, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3515a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V3.j f3517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f3517c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return a.this.new c(this.f3517c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3515a;
            if (i8 == 0) {
                r.b(obj);
                p005a4.c cVar = a.this.f3506a;
                String strA = ((g.d) this.f3517c).a();
                this.f3515a = 1;
                if (cVar.b(strA, this) == objF) {
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

    public a(p005a4.c sentryTracker, J coroutineScope) {
        t.g(sentryTracker, "sentryTracker");
        t.g(coroutineScope, "coroutineScope");
        this.f3506a = sentryTracker;
        this.f3507b = coroutineScope;
        this.f3508c = j.f12858c.d("SentryTrackingService");
    }

    @Override // V3.k
    public void a(V3.j event) {
        t.g(event, "event");
        if (event instanceof g) {
            g gVar = (g) event;
            if (gVar instanceof g.c) {
                j jVar = this.f3508c;
                String strC = jVar.c();
                p pVar = p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, "Capturing exception: " + ((g.c) event).a());
                }
                AbstractC1789i.d(this.f3507b, null, null, new C0129a(event, null), 3, null);
                return;
            }
            if (gVar instanceof g.a) {
                j jVar2 = this.f3508c;
                String strC2 = jVar2.c();
                p pVar2 = p.Debug;
                if (jVar2.a().a().compareTo(pVar2) <= 0) {
                    jVar2.b(pVar2, strC2, null, "Adding breadcrumb: " + ((g.a) event).d());
                }
                AbstractC1789i.d(this.f3507b, null, null, new b(event, null), 3, null);
                return;
            }
            if (gVar instanceof g.d) {
                j jVar3 = this.f3508c;
                String strC3 = jVar3.c();
                p pVar3 = p.Debug;
                if (jVar3.a().a().compareTo(pVar3) <= 0) {
                    jVar3.b(pVar3, strC3, null, "Setting user: " + ((g.d) event).a());
                }
                AbstractC1789i.d(this.f3507b, null, null, new c(event, null), 3, null);
            }
        }
    }
}
