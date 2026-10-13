package p037e0;

import C6.G;
import C6.InterfaceC0916e;
import C6.r;
import G6.d;
import I6.l;
import Q6.k;
import W6.n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.InterfaceC3164l0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2205a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f20089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2215k f20092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3164l0 f20093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f20094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V f20095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f20096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2221q f20097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC2221q f20098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC2221q f20099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC2221q f20100l;

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0466a extends l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20103c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f20105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2208d f20106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f20107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f20108h;

        /* JADX INFO: renamed from: e0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0467a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2205a f20109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2215k f20110b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f20111c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ F f20112d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0467a(C2205a c2205a, C2215k c2215k, k kVar, F f8) {
                super(1);
                this.f20109a = c2205a;
                this.f20110b = c2215k;
                this.f20111c = kVar;
                this.f20112d = f8;
            }

            public final void b(C2212h c2212h) {
                d0.o(c2212h, this.f20109a.j());
                Object objH = this.f20109a.h(c2212h.e());
                if (t.c(objH, c2212h.e())) {
                    k kVar = this.f20111c;
                    if (kVar != null) {
                        kVar.invoke(this.f20109a);
                        return;
                    }
                    return;
                }
                this.f20109a.j().E(objH);
                this.f20110b.E(objH);
                k kVar2 = this.f20111c;
                if (kVar2 != null) {
                    kVar2.invoke(this.f20109a);
                }
                c2212h.a();
                this.f20112d.f28775a = true;
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((C2212h) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0466a(Object obj, InterfaceC2208d interfaceC2208d, long j8, k kVar, d dVar) {
            super(1, dVar);
            this.f20105e = obj;
            this.f20106f = interfaceC2208d;
            this.f20107g = j8;
            this.f20108h = kVar;
        }

        @Override // I6.a
        public final d create(d dVar) {
            return C2205a.this.new C0466a(this.f20105e, this.f20106f, this.f20107g, this.f20108h, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar) {
            return ((C0466a) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            C2215k c2215k;
            F f8;
            Object objF = H6.c.f();
            int i8 = this.f20103c;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    C2205a.this.j().F((AbstractC2221q) C2205a.this.l().a().invoke(this.f20105e));
                    C2205a.this.s(this.f20106f.g());
                    C2205a.this.r(true);
                    C2215k c2215kH = AbstractC2216l.h(C2205a.this.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    F f9 = new F();
                    InterfaceC2208d interfaceC2208d = this.f20106f;
                    long j8 = this.f20107g;
                    C0467a c0467a = new C0467a(C2205a.this, c2215kH, this.f20108h, f9);
                    this.f20101a = c2215kH;
                    this.f20102b = f9;
                    this.f20103c = 1;
                    if (d0.c(c2215kH, interfaceC2208d, j8, c0467a, this) == objF) {
                        return objF;
                    }
                    c2215k = c2215kH;
                    f8 = f9;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f8 = (F) this.f20102b;
                    c2215k = (C2215k) this.f20101a;
                    r.b(obj);
                }
                EnumC2209e enumC2209e = f8.f28775a ? EnumC2209e.BoundReached : EnumC2209e.Finished;
                C2205a.this.i();
                return new C2211g(c2215k, enumC2209e);
            } catch (CancellationException e8) {
                C2205a.this.i();
                throw e8;
            }
        }
    }

    /* JADX INFO: renamed from: e0.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20113a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f20115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, d dVar) {
            super(1, dVar);
            this.f20115c = obj;
        }

        @Override // I6.a
        public final d create(d dVar) {
            return C2205a.this.new b(this.f20115c, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f20113a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            C2205a.this.i();
            Object objH = C2205a.this.h(this.f20115c);
            C2205a.this.j().E(objH);
            C2205a.this.s(objH);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e0.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20116a;

        public c(d dVar) {
            super(1, dVar);
        }

        @Override // I6.a
        public final d create(d dVar) {
            return C2205a.this.new c(dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar) {
            return ((c) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f20116a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            C2205a.this.i();
            return G.f1419a;
        }
    }

    public C2205a(Object obj, j0 j0Var, Object obj2, String str) {
        this.f20089a = j0Var;
        this.f20090b = obj2;
        this.f20091c = str;
        this.f20092d = new C2215k(j0Var, obj, null, 0L, 0L, false, 60, null);
        this.f20093e = l1.e(Boolean.FALSE, null, 2, null);
        this.f20094f = l1.e(obj, null, 2, null);
        this.f20095g = new V();
        this.f20096h = new a0(0.0f, 0.0f, obj2, 3, null);
        AbstractC2221q abstractC2221qO = o();
        AbstractC2221q abstractC2221q = abstractC2221qO instanceof C2217m ? AbstractC2206b.f20125e : abstractC2221qO instanceof C2218n ? AbstractC2206b.f20126f : abstractC2221qO instanceof C2219o ? AbstractC2206b.f20127g : AbstractC2206b.f20128h;
        t.e(abstractC2221q, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f20097i = abstractC2221q;
        AbstractC2221q abstractC2221qO2 = o();
        AbstractC2221q abstractC2221q2 = abstractC2221qO2 instanceof C2217m ? AbstractC2206b.f20121a : abstractC2221qO2 instanceof C2218n ? AbstractC2206b.f20122b : abstractC2221qO2 instanceof C2219o ? AbstractC2206b.f20123c : AbstractC2206b.f20124d;
        t.e(abstractC2221q2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f20098j = abstractC2221q2;
        this.f20099k = abstractC2221q;
        this.f20100l = abstractC2221q2;
    }

    public static /* synthetic */ Object f(C2205a c2205a, Object obj, InterfaceC2213i interfaceC2213i, Object obj2, k kVar, d dVar, int i8, Object obj3) {
        if ((i8 & 2) != 0) {
            interfaceC2213i = c2205a.f20096h;
        }
        InterfaceC2213i interfaceC2213i2 = interfaceC2213i;
        if ((i8 & 4) != 0) {
            obj2 = c2205a.n();
        }
        Object obj4 = obj2;
        if ((i8 & 8) != 0) {
            kVar = null;
        }
        return c2205a.e(obj, interfaceC2213i2, obj4, kVar, dVar);
    }

    public final Object e(Object obj, InterfaceC2213i interfaceC2213i, Object obj2, k kVar, d dVar) {
        return q(AbstractC2210f.a(interfaceC2213i, this.f20089a, m(), obj, obj2), obj2, kVar, dVar);
    }

    public final q1 g() {
        return this.f20092d;
    }

    public final Object h(Object obj) {
        if (t.c(this.f20099k, this.f20097i) && t.c(this.f20100l, this.f20098j)) {
            return obj;
        }
        AbstractC2221q abstractC2221q = (AbstractC2221q) this.f20089a.a().invoke(obj);
        int iB = abstractC2221q.b();
        boolean z8 = false;
        for (int i8 = 0; i8 < iB; i8++) {
            if (abstractC2221q.a(i8) < this.f20099k.a(i8) || abstractC2221q.a(i8) > this.f20100l.a(i8)) {
                abstractC2221q.e(i8, n.j(abstractC2221q.a(i8), this.f20099k.a(i8), this.f20100l.a(i8)));
                z8 = true;
            }
        }
        return z8 ? this.f20089a.b().invoke(abstractC2221q) : obj;
    }

    public final void i() {
        C2215k c2215k = this.f20092d;
        c2215k.s().d();
        c2215k.C(Long.MIN_VALUE);
        r(false);
    }

    public final C2215k j() {
        return this.f20092d;
    }

    public final Object k() {
        return this.f20094f.getValue();
    }

    public final j0 l() {
        return this.f20089a;
    }

    public final Object m() {
        return this.f20092d.getValue();
    }

    public final Object n() {
        return this.f20089a.b().invoke(o());
    }

    public final AbstractC2221q o() {
        return this.f20092d.s();
    }

    public final boolean p() {
        return ((Boolean) this.f20093e.getValue()).booleanValue();
    }

    public final Object q(InterfaceC2208d interfaceC2208d, Object obj, k kVar, d dVar) {
        return V.e(this.f20095g, null, new C0466a(obj, interfaceC2208d, this.f20092d.e(), kVar, null), dVar, 1, null);
    }

    public final void r(boolean z8) {
        this.f20093e.setValue(Boolean.valueOf(z8));
    }

    public final void s(Object obj) {
        this.f20094f.setValue(obj);
    }

    public final Object t(Object obj, d dVar) {
        Object objE = V.e(this.f20095g, null, new b(obj, null), dVar, 1, null);
        return objE == H6.c.f() ? objE : G.f1419a;
    }

    public final Object u(d dVar) {
        Object objE = V.e(this.f20095g, null, new c(null), dVar, 1, null);
        return objE == H6.c.f() ? objE : G.f1419a;
    }

    public /* synthetic */ C2205a(Object obj, j0 j0Var, Object obj2, String str, int i8, AbstractC2633k abstractC2633k) {
        this(obj, j0Var, (i8 & 4) != 0 ? null : obj2, (i8 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ C2205a(Object obj, j0 j0Var, Object obj2, int i8, AbstractC2633k abstractC2633k) {
        this(obj, j0Var, (i8 & 4) != 0 ? null : obj2);
    }

    @InterfaceC0916e
    public /* synthetic */ C2205a(Object obj, j0 j0Var, Object obj2) {
        this(obj, j0Var, obj2, "Animatable");
    }
}
