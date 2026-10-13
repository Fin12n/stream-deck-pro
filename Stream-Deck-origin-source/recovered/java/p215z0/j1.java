package p215z0;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import G6.h;
import H6.c;
import I6.l;
import J0.AbstractC1024g;
import J0.AbstractC1028k;
import J0.H;
import Q6.k;
import Q6.o;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p010b0.v;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j1 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f38783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f38784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f38785d;

        /* JADX INFO: renamed from: z0.j1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0850a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3191z0 f38786a;

            public C0850a(InterfaceC3191z0 interfaceC3191z0) {
                this.f38786a = interfaceC3191z0;
            }

            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, d dVar) {
                this.f38786a.setValue(obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f38787a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f38788b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC3191z0 f38789c;

            /* JADX INFO: renamed from: z0.j1$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0851a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC3191z0 f38790a;

                public C0851a(InterfaceC3191z0 interfaceC3191z0) {
                    this.f38790a = interfaceC3191z0;
                }

                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, d dVar) {
                    this.f38790a.setValue(obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC2260f interfaceC2260f, InterfaceC3191z0 interfaceC3191z0, d dVar) {
                super(2, dVar);
                this.f38788b = interfaceC2260f;
                this.f38789c = interfaceC3191z0;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                return new b(this.f38788b, this.f38789c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, d dVar) {
                return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f38787a;
                if (i8 == 0) {
                    r.b(obj);
                    InterfaceC2260f interfaceC2260f = this.f38788b;
                    C0851a c0851a = new C0851a(this.f38789c);
                    this.f38787a = 1;
                    if (interfaceC2260f.collect(c0851a, this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, InterfaceC2260f interfaceC2260f, d dVar) {
            super(2, dVar);
            this.f38784c = gVar;
            this.f38785d = interfaceC2260f;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f38784c, this.f38785d, dVar);
            aVar.f38783b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3191z0 interfaceC3191z0, d dVar) {
            return ((a) create(interfaceC3191z0, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r1.collect(r2, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (p017b7.AbstractC1785g.g(r1, r3, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            return r0;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f38782a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC3191z0 interfaceC3191z0 = (InterfaceC3191z0) this.f38783b;
                if (t.c(this.f38784c, h.f2820a)) {
                    InterfaceC2260f interfaceC2260f = this.f38785d;
                    C0850a c0850a = new C0850a(interfaceC3191z0);
                    this.f38782a = 1;
                } else {
                    g gVar = this.f38784c;
                    b bVar = new b(this.f38785d, interfaceC3191z0, null);
                    this.f38782a = 2;
                }
            } else {
                if (i8 != 1 && i8 != 2) {
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
        public Object f38791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f38792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f38793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f38794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f38795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f38796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f38797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f38798h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f38799i;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v f38800a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v vVar) {
                super(1);
                this.f38800a = vVar;
            }

            public final void b(Object obj) {
                if (obj instanceof H) {
                    ((H) obj).q(AbstractC1024g.a(4));
                }
                this.f38800a.g(obj);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: z0.j1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0852b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p035d7.g f38801a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0852b(p035d7.g gVar) {
                super(2);
                this.f38801a = gVar;
            }

            public final void b(Set set, AbstractC1028k abstractC1028k) {
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return;
                }
                for (Object obj : set2) {
                    if (!(obj instanceof H) || ((H) obj).e(AbstractC1024g.a(4))) {
                        this.f38801a.m(set);
                        return;
                    }
                }
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Set) obj, (AbstractC1028k) obj2);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, d dVar) {
            super(2, dVar);
            this.f38799i = function0;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f38799i, dVar);
            bVar.f38798h = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, d dVar) {
            return ((b) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cb A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:15:0x0050, B:31:0x00c7, B:33:0x00cb, B:38:0x00d5, B:41:0x00e3, B:45:0x00f9, B:47:0x0102, B:55:0x011e, B:56:0x0121, B:42:0x00ee, B:44:0x00f6, B:53:0x011a, B:54:0x011d), top: B:68:0x0050, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:15:0x0050, B:31:0x00c7, B:33:0x00cb, B:38:0x00d5, B:41:0x00e3, B:45:0x00f9, B:47:0x0102, B:55:0x011e, B:56:0x0121, B:42:0x00ee, B:44:0x00f6, B:53:0x011a, B:54:0x011d), top: B:68:0x0050, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0102 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:15:0x0050, B:31:0x00c7, B:33:0x00cb, B:38:0x00d5, B:41:0x00e3, B:45:0x00f9, B:47:0x0102, B:55:0x011e, B:56:0x0121, B:42:0x00ee, B:44:0x00f6, B:53:0x011a, B:54:0x011d), top: B:68:0x0050, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0123  */
        /* JADX WARN: Path cross not found for [B:41:0x00e3, B:57:0x0122], limit reached: 74 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.j1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final q1 b(InterfaceC2260f interfaceC2260f, Object obj, g gVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-606625098);
        if ((i9 & 2) != 0) {
            gVar = h.f2820a;
        }
        g gVar2 = gVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-606625098, i8, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:61)");
        }
        int i10 = i8 >> 3;
        q1 q1VarM = g1.m(obj, interfaceC2260f, gVar2, new a(gVar2, interfaceC2260f, null), interfaceC3163l, (i10 & 8) | 4672 | (i10 & 14));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarM;
    }

    public static final q1 c(M m8, g gVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(-1439883919);
        if ((i9 & 1) != 0) {
            gVar = h.f2820a;
        }
        g gVar2 = gVar;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1439883919, i8, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:46)");
        }
        q1 q1VarA = g1.a(m8, m8.getValue(), gVar2, interfaceC3163l, 520, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarA;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public static final boolean d(v vVar, Set set) {
        Object[] objArr = vVar.f15564b;
        long[] jArr = vVar.f15563a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128 && set.contains(objArr[(i8 << 3) + i10])) {
                            return true;
                        }
                        j8 >>= 8;
                    }
                    if (i9 == 8) {
                        if (i8 != length) {
                            i8++;
                        }
                    }
                } else if (i8 != length) {
                    i8++;
                }
            }
        }
        return false;
    }

    public static final InterfaceC2260f e(Function0 function0) {
        return AbstractC2262h.D(new b(function0, null));
    }
}
