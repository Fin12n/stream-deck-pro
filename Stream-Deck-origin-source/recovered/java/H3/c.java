package H3;

import C6.G;
import C6.r;
import C6.v;
import D6.L;
import I6.l;
import Q6.o;
import V3.h;
import V3.k;
import X3.i;
import Z2.j;
import Z2.p;
import java.util.Map;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y3.c f3519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f3520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f3521c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V3.j f3524c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f3524c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new a(this.f3524c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3522a;
            if (i8 == 0) {
                r.b(obj);
                Y3.c cVar = c.this.f3519a;
                H3.d.a aVarC = H3.d.c((h.a) this.f3524c);
                this.f3522a = 1;
                if (cVar.p(aVarC, this) == objF) {
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
        public int f3525a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V3.j f3527c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f3527c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new b(this.f3527c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3525a;
            if (i8 == 0) {
                r.b(obj);
                Y3.c cVar = c.this.f3519a;
                H3.d.b bVarD = H3.d.d((h.c) this.f3527c);
                this.f3525a = 1;
                if (cVar.p(bVarD, this) == objF) {
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

    /* JADX INFO: renamed from: H3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0130c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3528a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V3.j f3530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0130c(V3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f3530c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new C0130c(this.f3530c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((C0130c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3528a;
            if (i8 == 0) {
                r.b(obj);
                Y3.c cVar = c.this.f3519a;
                String strA = ((h.b) this.f3530c).a();
                int iB = ((h.b) this.f3530c).b();
                this.f3528a = 1;
                if (cVar.h(strA, iB, this) == objF) {
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
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3531a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V3.j f3533c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(V3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f3533c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new d(this.f3533c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3531a;
            if (i8 == 0) {
                r.b(obj);
                Y3.c cVar = c.this.f3519a;
                Map mapE = L.e(v.a(((h.d) this.f3533c).a(), i.Companion.g(((h.d) this.f3533c).b().toString())));
                this.f3531a = 1;
                if (cVar.n(mapE, this) == objF) {
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

    public c(Y3.c dataMaster, J coroutineScope) {
        t.g(dataMaster, "dataMaster");
        t.g(coroutineScope, "coroutineScope");
        this.f3519a = dataMaster;
        this.f3520b = coroutineScope;
        this.f3521c = j.f12858c.d("TelemetryTrackingService");
    }

    @Override // V3.k
    public void a(V3.j event) {
        t.g(event, "event");
        if (event instanceof h) {
            h hVar = (h) event;
            if (hVar instanceof h.a) {
                j jVar = this.f3521c;
                String str = "Tracking event: " + ((h.a) event).b();
                String strC = jVar.c();
                p pVar = p.Debug;
                if (jVar.a().a().compareTo(pVar) <= 0) {
                    jVar.b(pVar, strC, null, str);
                }
                AbstractC1789i.d(this.f3520b, null, null, new a(event, null), 3, null);
                return;
            }
            if (hVar instanceof h.c) {
                j jVar2 = this.f3521c;
                String str2 = "Tracking screen: " + ((h.c) event).b();
                String strC2 = jVar2.c();
                p pVar2 = p.Debug;
                if (jVar2.a().a().compareTo(pVar2) <= 0) {
                    jVar2.b(pVar2, strC2, null, str2);
                }
                AbstractC1789i.d(this.f3520b, null, null, new b(event, null), 3, null);
                return;
            }
            if (hVar instanceof h.b) {
                j jVar3 = this.f3521c;
                h.b bVar = (h.b) event;
                String str3 = "Incrementing session attribute: " + bVar.a() + " by " + bVar.b();
                String strC3 = jVar3.c();
                p pVar3 = p.Debug;
                if (jVar3.a().a().compareTo(pVar3) <= 0) {
                    jVar3.b(pVar3, strC3, null, str3);
                }
                AbstractC1789i.d(this.f3520b, null, null, new C0130c(event, null), 3, null);
                return;
            }
            if (hVar instanceof h.d) {
                j jVar4 = this.f3521c;
                h.d dVar = (h.d) event;
                String str4 = "Setting user attribute: " + dVar.a() + " to " + dVar.b();
                String strC4 = jVar4.c();
                p pVar4 = p.Debug;
                if (jVar4.a().a().compareTo(pVar4) <= 0) {
                    jVar4.b(pVar4, strC4, null, str4);
                }
                AbstractC1789i.d(this.f3520b, null, null, new d(event, null), 3, null);
            }
        }
    }
}
