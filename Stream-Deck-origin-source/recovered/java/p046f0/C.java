package p046f0;

import C6.G;
import C6.r;
import I6.l;
import L0.i;
import Q6.o;
import kotlin.jvm.internal.t;
import p011b1.C1766n;
import p011b1.EnumC1768p;
import p017b7.AbstractC1789i;
import p017b7.J;
import p056g1.m0;
import p073i0.g;
import p073i0.h;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C extends i.c implements m0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f21244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f21245o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21248c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21250e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21248c = obj;
            this.f21250e |= Integer.MIN_VALUE;
            return C.this.d2(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21252b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21254d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21252b = obj;
            this.f21254d |= Integer.MIN_VALUE;
            return C.this.e2(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21255a;

        public c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C.this.new c(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f21255a;
            if (i8 == 0) {
                r.b(obj);
                C c8 = C.this;
                this.f21255a = 1;
                if (c8.d2(this) == objF) {
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
        public int f21257a;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C.this.new d(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f21257a;
            if (i8 == 0) {
                r.b(obj);
                C c8 = C.this;
                this.f21257a = 1;
                if (c8.e2(this) == objF) {
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

    public C(m mVar) {
        this.f21244n = mVar;
    }

    @Override // L0.i.c
    public void O1() {
        f2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d2(G6.d dVar) {
        a aVar;
        C c8;
        g gVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f21250e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f21250e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f21248c;
        Object objF = H6.c.f();
        int i9 = aVar.f21250e;
        if (i9 == 0) {
            r.b(obj);
            if (this.f21245o == null) {
                g gVar2 = new g();
                m mVar = this.f21244n;
                aVar.f21246a = this;
                aVar.f21247b = gVar2;
                aVar.f21250e = 1;
                if (mVar.b(gVar2, aVar) == objF) {
                    return objF;
                }
                c8 = this;
                gVar = gVar2;
            }
            return G.f1419a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gVar = (g) aVar.f21247b;
        c8 = (C) aVar.f21246a;
        r.b(obj);
        c8.f21245o = gVar;
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e2(G6.d dVar) {
        b bVar;
        C c8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f21254d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f21254d = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f21252b;
        Object objF = H6.c.f();
        int i9 = bVar.f21254d;
        if (i9 == 0) {
            r.b(obj);
            g gVar = this.f21245o;
            if (gVar != null) {
                h hVar = new h(gVar);
                m mVar = this.f21244n;
                bVar.f21251a = this;
                bVar.f21254d = 1;
                if (mVar.b(hVar, bVar) == objF) {
                    return objF;
                }
                c8 = this;
            }
            return G.f1419a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c8 = (C) bVar.f21251a;
        r.b(obj);
        c8.f21245o = null;
        return G.f1419a;
    }

    @Override // p056g1.m0
    public void f0() {
        f2();
    }

    public final void f2() {
        g gVar = this.f21245o;
        if (gVar != null) {
            this.f21244n.a(new h(gVar));
            this.f21245o = null;
        }
    }

    public final void g2(m mVar) {
        if (t.c(this.f21244n, mVar)) {
            return;
        }
        f2();
        this.f21244n = mVar;
    }

    @Override // p056g1.m0
    public void y0(C1766n c1766n, EnumC1768p enumC1768p, long j8) {
        if (enumC1768p == EnumC1768p.Main) {
            int iF = c1766n.f();
            b1.r.a aVar = p011b1.r.f15774a;
            if (p011b1.r.i(iF, aVar.a())) {
                AbstractC1789i.d(D1(), null, null, new c(null), 3, null);
            } else if (p011b1.r.i(iF, aVar.b())) {
                AbstractC1789i.d(D1(), null, null, new d(null), 3, null);
            }
        }
    }
}
