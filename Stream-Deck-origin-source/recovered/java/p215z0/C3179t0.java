package p215z0;

import C6.r;
import G6.g;
import H6.c;
import I6.d;
import Q6.k;
import Q6.o;

/* JADX INFO: renamed from: z0.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3179t0 implements InterfaceC3146c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3146c0 f38930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f38931b = new X();

    /* JADX INFO: renamed from: z0.t0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f38932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f38933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f38934c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f38936e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f38934c = obj;
            this.f38936e |= Integer.MIN_VALUE;
            return C3179t0.this.V0(null, this);
        }
    }

    public C3179t0(InterfaceC3146c0 interfaceC3146c0) {
        this.f38930a = interfaceC3146c0;
    }

    @Override // G6.g.b, G6.g
    public g.b A(g.c cVar) {
        return InterfaceC3146c0.a.b(this, cVar);
    }

    @Override // G6.g
    public g P1(g gVar) {
        return InterfaceC3146c0.a.d(this, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p215z0.InterfaceC3146c0
    public Object V0(k kVar, G6.d dVar) {
        a aVar;
        C3179t0 c3179t0;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f38936e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f38936e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f38934c;
        Object objF = c.f();
        int i9 = aVar.f38936e;
        if (i9 == 0) {
            r.b(obj);
            X x8 = this.f38931b;
            aVar.f38932a = this;
            aVar.f38933b = kVar;
            aVar.f38936e = 1;
            if (x8.c(aVar) != objF) {
                c3179t0 = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return obj;
        }
        kVar = (k) aVar.f38933b;
        c3179t0 = (C3179t0) aVar.f38932a;
        r.b(obj);
        InterfaceC3146c0 interfaceC3146c0 = c3179t0.f38930a;
        aVar.f38932a = null;
        aVar.f38933b = null;
        aVar.f38936e = 2;
        Object objV0 = interfaceC3146c0.V0(kVar, aVar);
        return objV0 == objF ? objF : objV0;
    }

    public final void a() {
        this.f38931b.d();
    }

    public final void c() {
        this.f38931b.f();
    }

    @Override // G6.g.b, G6.g
    public g j(g.c cVar) {
        return InterfaceC3146c0.a.c(this, cVar);
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, o oVar) {
        return InterfaceC3146c0.a.a(this, obj, oVar);
    }
}
