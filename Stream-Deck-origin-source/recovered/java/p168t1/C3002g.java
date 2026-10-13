package p168t1;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import java.util.List;
import java.util.concurrent.CancellationException;
import p017b7.AbstractC1823z0;
import p017b7.J;
import p017b7.X0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: renamed from: t1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3002g implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f34041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3003h f34042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f34043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H f34044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f34045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34046g = true;

    /* JADX INFO: renamed from: t1.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f34047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f34048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f34049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f34052f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f34054h;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f34052f = obj;
            this.f34054h |= Integer.MIN_VALUE;
            return C3002g.this.o(this);
        }
    }

    /* JADX INFO: renamed from: t1.g$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34055a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3008m f34057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3008m interfaceC3008m, G6.d dVar) {
            super(1, dVar);
            this.f34057c = interfaceC3008m;
        }

        @Override // I6.a
        public final G6.d create(G6.d dVar) {
            return C3002g.this.new b(this.f34057c, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((b) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f34055a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            C3002g c3002g = C3002g.this;
            InterfaceC3008m interfaceC3008m = this.f34057c;
            this.f34055a = 1;
            Object objQ = c3002g.q(interfaceC3008m, this);
            return objQ == objF ? objF : objQ;
        }
    }

    /* JADX INFO: renamed from: t1.g$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f34058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34059b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34061d;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f34059b = obj;
            this.f34061d |= Integer.MIN_VALUE;
            return C3002g.this.q(null, this);
        }
    }

    /* JADX INFO: renamed from: t1.g$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34062a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3008m f34064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC3008m interfaceC3008m, G6.d dVar) {
            super(2, dVar);
            this.f34064c = interfaceC3008m;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return C3002g.this.new d(this.f34064c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f34062a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            H h8 = C3002g.this.f34044e;
            InterfaceC3008m interfaceC3008m = this.f34064c;
            this.f34062a = 1;
            Object objA = h8.a(interfaceC3008m, this);
            return objA == objF ? objF : objA;
        }
    }

    public C3002g(List<? extends InterfaceC3008m> list, Object obj, S s8, C3003h c3003h, k kVar, H h8) {
        this.f34040a = list;
        this.f34041b = s8;
        this.f34042c = c3003h;
        this.f34043d = kVar;
        this.f34044e = h8;
        this.f34045f = l1.e(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f34045f.setValue(obj);
    }

    public final boolean e() {
        return this.f34046g;
    }

    @Override // p215z0.q1
    public Object getValue() {
        return this.f34045f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #2 {all -> 0x00fe, blocks: (B:28:0x0075, B:30:0x008c), top: B:56:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:45:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:42:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object o(G6.d r18) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p168t1.C3002g.o(G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(InterfaceC3008m interfaceC3008m, G6.d dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f34061d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f34061d = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f34059b;
        Object objF = H6.c.f();
        int i9 = cVar.f34061d;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            d dVar2 = new d(interfaceC3008m, null);
            cVar.f34058a = interfaceC3008m;
            cVar.f34061d = 1;
            Object objE = X0.e(15000L, dVar2, cVar);
            return objE == objF ? objF : objE;
        } catch (CancellationException e8) {
            if (!AbstractC1823z0.q(cVar.getContext())) {
                throw e8;
            }
            return null;
        } catch (Exception e9) {
            p017b7.G g8 = (p017b7.G) cVar.getContext().A(p017b7.G.f15897N);
            if (g8 != null) {
                g8.R1(cVar.getContext(), new IllegalStateException("Unable to load font " + interfaceC3008m, e9));
            }
            return null;
        }
    }
}
