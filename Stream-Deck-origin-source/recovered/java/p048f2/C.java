package p048f2;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p035d7.g;
import p035d7.j;
import p035d7.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f21542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f21543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f21544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2300c f21545d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f21546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C f21547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f21548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, C c8, o oVar) {
            super(1);
            this.f21546a = kVar;
            this.f21547b = c8;
            this.f21548c = oVar;
        }

        public final void b(Throwable th) {
            G g8;
            this.f21546a.invoke(th);
            this.f21547b.f21544c.d(th);
            do {
                Object objF = p035d7.k.f(this.f21547b.f21544c.g());
                if (objF != null) {
                    this.f21548c.invoke(objF, th);
                    g8 = G.f1419a;
                } else {
                    g8 = null;
                }
            } while (g8 != null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21550b;

        public b(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return C.this.new b(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 Q6.o) = (r1v2 Q6.o), (r1v4 Q6.o) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o oVar;
            Object objF = c.f();
            int i8 = this.f21550b;
            if (i8 == 0) {
                r.b(obj);
                if (C.this.f21545d.b() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                K.g(C.this.f21542a);
                oVar = C.this.f21543b;
                g gVar = C.this.f21544c;
                this.f21549a = oVar;
                this.f21550b = 1;
                obj = gVar.l(this);
                if (obj != objF) {
                    this.f21549a = null;
                    this.f21550b = 2;
                }
                return objF;
            }
            if (i8 == 1) {
                oVar = (o) this.f21549a;
                r.b(obj);
                this.f21549a = null;
                this.f21550b = 2;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            if (C.this.f21545d.a() == 0) {
                return G.f1419a;
            }
            K.g(C.this.f21542a);
            oVar = C.this.f21543b;
            g gVar2 = C.this.f21544c;
            this.f21549a = oVar;
            this.f21550b = 1;
            obj = gVar2.l(this);
            if (obj != objF) {
                this.f21549a = null;
                this.f21550b = 2;
            }
            return objF;
        }
    }

    public C(J scope, k onComplete, o onUndeliveredElement, o consumeMessage) {
        t.g(scope, "scope");
        t.g(onComplete, "onComplete");
        t.g(onUndeliveredElement, "onUndeliveredElement");
        t.g(consumeMessage, "consumeMessage");
        this.f21542a = scope;
        this.f21543b = consumeMessage;
        this.f21544c = j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f21545d = new C2300c(0);
        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) scope.getCoroutineContext().A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v0 != null) {
            interfaceC1815v0.H0(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) throws Throwable {
        Object objM = this.f21544c.m(obj);
        if (objM instanceof d7.k.a) {
            Throwable thE = p035d7.k.e(objM);
            if (thE != null) {
                throw thE;
            }
            throw new q("Channel was closed normally");
        }
        if (!p035d7.k.i(objM)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f21545d.c() == 0) {
            AbstractC1789i.d(this.f21542a, null, null, new b(null), 3, null);
        }
    }
}
