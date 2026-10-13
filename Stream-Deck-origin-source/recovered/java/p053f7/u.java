package p053f7;

import C6.G;
import C6.q;
import G6.g;
import G6.h;
import H6.c;
import I6.d;
import I6.e;
import Q6.o;
import Q6.p;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1823z0;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends d implements InterfaceC2261g, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2261g f22343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f22344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f22346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G6.d f22347e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22348a = new a();

        public a() {
            super(2);
        }

        public final Integer b(int i8, g.b bVar) {
            return Integer.valueOf(i8 + 1);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public u(InterfaceC2261g interfaceC2261g, g gVar) {
        super(r.f22337a, h.f2820a);
        this.f22343a = interfaceC2261g;
        this.f22344b = gVar;
        this.f22345c = ((Number) gVar.t(0, a.f22348a)).intValue();
    }

    @Override // p044e7.InterfaceC2261g
    public Object emit(Object obj, G6.d dVar) {
        try {
            Object objH = h(dVar, obj);
            if (objH == c.f()) {
                I6.h.c(dVar);
            }
            return objH == c.f() ? objH : G.f1419a;
        } catch (Throwable th) {
            this.f22346d = new m(th, dVar.getContext());
            throw th;
        }
    }

    public final void g(g gVar, g gVar2, Object obj) {
        if (gVar2 instanceof m) {
            k((m) gVar2, obj);
        }
        w.a(this, gVar);
    }

    @Override // I6.a, I6.e
    public e getCallerFrame() {
        G6.d dVar = this.f22347e;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // I6.d, G6.d
    public g getContext() {
        g gVar = this.f22346d;
        return gVar == null ? h.f2820a : gVar;
    }

    @Override // I6.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object h(G6.d dVar, Object obj) {
        g context = dVar.getContext();
        AbstractC1823z0.l(context);
        g gVar = this.f22346d;
        if (gVar != context) {
            g(context, gVar, obj);
            this.f22346d = context;
        }
        this.f22347e = dVar;
        p pVar = v.f22349a;
        InterfaceC2261g interfaceC2261g = this.f22343a;
        t.e(interfaceC2261g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        t.e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = pVar.invoke(interfaceC2261g, obj, this);
        if (!t.c(objInvoke, c.f())) {
            this.f22347e = null;
        }
        return objInvoke;
    }

    @Override // I6.a
    public Object invokeSuspend(Object obj) {
        Throwable thE = q.e(obj);
        if (thE != null) {
            this.f22346d = new m(thE, getContext());
        }
        G6.d dVar = this.f22347e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return c.f();
    }

    public final void k(m mVar, Object obj) {
        throw new IllegalStateException(Z6.o.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f22330a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // I6.d, I6.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
