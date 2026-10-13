package M5;

import C6.G;
import kotlin.jvm.internal.AbstractC2633k;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5697c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2691a f5698d = new C2691a("HttpRedirect");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W5.a f5699e = new W5.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5701b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5702a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5703b;

        public final boolean a() {
            return this.f5703b;
        }

        public final boolean b() {
            return this.f5702a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements k {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f5704a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f5705b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f5706c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f5707d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f5708e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Object f5709f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public Object f5710g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public Object f5711h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public Object f5712i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f5713j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f5714k;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f5716m;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f5714k = obj;
                this.f5716m |= Integer.MIN_VALUE;
                return b.this.e(null, null, null, false, null, this);
            }
        }

        /* JADX INFO: renamed from: M5.o$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0208b extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5717a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5718b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5719c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f5720d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ G5.a f5721e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0208b(o oVar, G5.a aVar, G6.d dVar) {
                super(3, dVar);
                this.f5720d = oVar;
                this.f5721e = aVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a8, T5.d dVar, G6.d dVar2) {
                C0208b c0208b = new C0208b(this.f5720d, this.f5721e, dVar2);
                c0208b.f5718b = a8;
                c0208b.f5719c = dVar;
                return c0208b.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                T5.d dVar;
                A a8;
                Object objF = H6.c.f();
                int i8 = this.f5717a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    A a9 = (A) this.f5718b;
                    dVar = (T5.d) this.f5719c;
                    this.f5718b = a9;
                    this.f5719c = dVar;
                    this.f5717a = 1;
                    Object objA = a9.a(dVar, this);
                    if (objA != objF) {
                        a8 = a9;
                        obj = objA;
                    }
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                    return obj;
                }
                dVar = (T5.d) this.f5719c;
                A a10 = (A) this.f5718b;
                C6.r.b(obj);
                a8 = a10;
                T5.d dVar2 = dVar;
                H5.b bVar = (H5.b) obj;
                if (this.f5720d.f5700a && !p.f5722a.contains(bVar.f().L0())) {
                    return bVar;
                }
                b bVar2 = o.f5697c;
                boolean z8 = this.f5720d.f5701b;
                G5.a aVar = this.f5721e;
                this.f5718b = null;
                this.f5719c = null;
                this.f5717a = 2;
                Object objE = bVar2.e(a8, dVar2, bVar, z8, aVar, this);
                return objE == objF ? objF : objE;
            }
        }

        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final W5.a d() {
            return o.f5699e;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0116  */
        /* JADX WARN: Code duplicated, block: B:22:0x011f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0165  */
        /* JADX WARN: Code duplicated, block: B:33:0x01ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:37:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:39:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01ac -> B:35:0x01b2). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public final java.lang.Object e(M5.A r17, T5.d r18, H5.b r19, boolean r20, G5.a r21, G6.d r22) {
            /*
                Method dump skipped, instruction units count: 465
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: M5.o.b.e(M5.A, T5.d, H5.b, boolean, G5.a, G6.d):java.lang.Object");
        }

        @Override // M5.k
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(o plugin, G5.a scope) {
            kotlin.jvm.internal.t.g(plugin, "plugin");
            kotlin.jvm.internal.t.g(scope, "scope");
            ((t) l.b(scope, t.f5732c)).d(new C0208b(plugin, scope, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public o b(Q6.k block) {
            kotlin.jvm.internal.t.g(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new o(aVar.b(), aVar.a(), null);
        }

        @Override // M5.k
        public C2691a getKey() {
            return o.f5698d;
        }

        public b() {
        }
    }

    public /* synthetic */ o(boolean z8, boolean z9, AbstractC2633k abstractC2633k) {
        this(z8, z9);
    }

    public o(boolean z8, boolean z9) {
        this.f5700a = z8;
        this.f5701b = z9;
    }
}
