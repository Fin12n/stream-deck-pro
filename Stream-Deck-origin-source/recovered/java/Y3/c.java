package Y3;

import C6.G;
import D6.M;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.S0;
import p017b7.U;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements X3.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f12218s = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.g f12220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public J f12221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y3.d f12222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public X3.c f12223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X3.h f12224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Y3.l f12225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.elgato.telemetry.datamaster.persistence.a f12226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Y3.b f12227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Y3.j f12228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Application f12229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Y3.a f12230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC1815v0 f12231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC1815v0 f12232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p098k7.a f12233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f12234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f12235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f12236r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12241e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12243g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12241e = obj;
            this.f12243g |= Integer.MIN_VALUE;
            return c.this.g(null, this);
        }
    }

    /* JADX INFO: renamed from: Y3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0311c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12244a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0311c(int i8) {
            super(0);
            this.f12244a = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Country code fetch did not return a value (attempt " + (this.f12244a + 1) + "/3)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f12248d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12250f;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12248d = obj;
            this.f12250f |= Integer.MIN_VALUE;
            return c.this.i(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f12251a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot mark ready before start()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f12252a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DataMaster marked ready";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12253a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y3.j f12255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y3.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f12255c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new g(this.f12255c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005f  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        
            if (r7.d(r6) == r0) goto L28;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Y3.b bVar;
            Object objF = H6.c.f();
            int i8 = this.f12253a;
            if (i8 == 0) {
                C6.r.b(obj);
                this.f12253a = 1;
                if (U.a(60000L, this) != objF) {
                }
                return objF;
            }
            if (i8 == 1) {
                C6.r.b(obj);
            } else if (i8 == 2) {
                C6.r.b(obj);
                bVar = c.this.f12227i;
                if (bVar != null) {
                    this.f12253a = 3;
                }
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
            if (c.this.f12235q && c.this.f12236r && this.f12255c.e()) {
                Y3.j jVar = this.f12255c;
                this.f12253a = 2;
                if (jVar.d(this) != objF) {
                    bVar = c.this.f12227i;
                    if (bVar != null) {
                        this.f12253a = 3;
                    }
                }
                return objF;
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12256a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ J f12258c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(J j8, G6.d dVar) {
            super(2, dVar);
            this.f12258c = j8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new h(this.f12258c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((h) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f12256a;
            if (i8 == 0) {
                C6.r.b(obj);
                Y3.j jVar = c.this.f12228j;
                if (jVar == null) {
                    return G.f1419a;
                }
                if (!jVar.e()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    J j8 = this.f12258c;
                    this.f12256a = 1;
                    if (jVar.j(jCurrentTimeMillis, j8, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f12262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12263e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12265g;

        public i(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12263e = obj;
            this.f12265g |= Integer.MIN_VALUE;
            return c.this.l(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f12266a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot register app lifecycle callbacks without an Application context";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends u implements Function0 {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m79invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m79invoke() {
            c.this.k();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m80invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m80invoke() {
            c.this.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f12272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12273e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12275g;

        public m(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12273e = obj;
            this.f12275g |= Integer.MIN_VALUE;
            return c.this.o(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f12276a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DataMaster already started";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12277a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ X3.c f12279c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(X3.c cVar, G6.d dVar) {
            super(2, dVar);
            this.f12279c = cVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new o(this.f12279c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((o) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f12277a;
            if (i8 == 0) {
                C6.r.b(obj);
                c cVar = c.this;
                X3.c cVar2 = this.f12279c;
                this.f12277a = 1;
                if (cVar.g(cVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12281b;

        public p(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            p pVar = c.this.new p(dVar);
            pVar.f12281b = obj;
            return pVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(X3.k kVar, G6.d dVar) {
            return ((p) create(kVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f12280a;
            if (i8 == 0) {
                C6.r.b(obj);
                X3.k kVar = (X3.k) this.f12281b;
                c cVar = c.this;
                this.f12280a = 1;
                if (cVar.l(kVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y3.d f12283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Y3.d dVar) {
            super(0);
            this.f12283a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DataMaster started with app identifier: " + this.f12283a.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f12287d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12289f;

        public r(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12287d = obj;
            this.f12289f |= Integer.MIN_VALUE;
            return c.this.p(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f12290a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot track event before start()";
        }
    }

    public c(long j8, G6.g gVar, G g8) {
        this.f12219a = j8;
        this.f12220b = gVar;
        this.f12233o = p098k7.c.b(false, 1, null);
        this.f12234p = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:20:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(X3.c r12, G6.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof Y3.c.b
            if (r0 == 0) goto L13
            r0 = r13
            Y3.c$b r0 = (Y3.c.b) r0
            int r1 = r0.f12243g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12243g = r1
            goto L18
        L13:
            Y3.c$b r0 = new Y3.c$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f12241e
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f12243g
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r12 = r0.f12240d
            int r2 = r0.f12239c
            int r4 = r0.f12238b
            java.lang.Object r5 = r0.f12237a
            X3.c r5 = (X3.c) r5
            C6.r.b(r13)
            r13 = r5
            goto L58
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            C6.r.b(r13)
            r13 = 3
            r2 = 0
            r4 = r13
            r13 = r12
            r12 = r2
        L44:
            if (r12 >= r4) goto L73
            r0.f12237a = r13
            r0.f12238b = r4
            r0.f12239c = r12
            r0.f12240d = r12
            r0.f12243g = r3
            java.lang.Object r2 = r13.d(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r2 = r12
        L58:
            java.lang.String r5 = r13.f()
            if (r5 == 0) goto L61
            C6.G r12 = C6.G.f1419a
            return r12
        L61:
            Z2.j$a r5 = Z2.j.f12858c
            Y3.c$c r8 = new Y3.c$c
            r8.<init>(r12)
            r9 = 2
            r10 = 0
            java.lang.String r6 = "DataMaster"
            r7 = 0
            Z2.j.a.f(r5, r6, r7, r8, r9, r10)
            int r12 = r2 + 1
            goto L44
        L73:
            C6.G r12 = C6.G.f1419a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.c.g(X3.c, G6.d):java.lang.Object");
    }

    public Object h(String str, int i8, G6.d dVar) {
        Y3.i iVarF;
        Y3.j jVar = this.f12228j;
        if (jVar == null || (iVarF = jVar.f()) == null) {
            return G.f1419a;
        }
        Object objB = iVarF.b(str, i8, dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[PHI: r2
      0x00a5: PHI (r2v3 Y3.c) = (r2v2 Y3.c), (r2v2 Y3.c), (r2v10 Y3.c) binds: [B:35:0x0091, B:37:0x00a2, B:22:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:45:0x00bf, B:47:0x00c5, B:50:0x00da), top: B:57:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[LOOP:0: B:45:0x00bf->B:64:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r15.i0(r0) == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(G6.d dVar) throws Throwable {
        d dVar2;
        c cVar;
        p098k7.a aVar;
        c cVar2;
        p098k7.a aVar2;
        Iterator it;
        c cVar3;
        X3.k kVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f12250f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f12250f = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f12248d;
        Object objF = H6.c.f();
        int i9 = dVar2.f12250f;
        if (i9 == 0) {
            C6.r.b(obj);
            if (!this.f12235q) {
                Z2.j.a.h(Z2.j.f12858c, "DataMaster", null, e.f12251a, 2, null);
                return G.f1419a;
            }
            InterfaceC1815v0 interfaceC1815v0 = this.f12232n;
            if (interfaceC1815v0 != null) {
                dVar2.f12245a = this;
                dVar2.f12250f = 1;
            }
            cVar = this;
        } else {
            if (i9 != 1) {
                if (i9 == 2) {
                    cVar = (c) dVar2.f12245a;
                    C6.r.b(obj);
                    cVar.f12236r = true;
                    aVar = cVar.f12233o;
                    dVar2.f12245a = cVar;
                    dVar2.f12246b = aVar;
                    dVar2.f12250f = 3;
                    if (aVar.b(null, dVar2) != objF) {
                        cVar2 = cVar;
                        it = cVar2.f12234p.iterator();
                        cVar3 = cVar2;
                        aVar2 = aVar;
                        while (it.hasNext()) {
                            kVar = (X3.k) it.next();
                            dVar2.f12245a = cVar3;
                            dVar2.f12246b = aVar2;
                            dVar2.f12247c = it;
                            dVar2.f12250f = 4;
                            if (cVar3.l(kVar, dVar2) == objF) {
                            }
                        }
                        cVar3.f12234p.clear();
                        G g8 = G.f1419a;
                        aVar2.e(null);
                        Z2.j.a.f(Z2.j.f12858c, "DataMaster", null, f.f12252a, 2, null);
                        return G.f1419a;
                    }
                    return objF;
                }
                if (i9 != 3) {
                    if (i9 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) dVar2.f12247c;
                    aVar2 = (p098k7.a) dVar2.f12246b;
                    cVar3 = (c) dVar2.f12245a;
                    try {
                        C6.r.b(obj);
                        while (it.hasNext()) {
                            kVar = (X3.k) it.next();
                            dVar2.f12245a = cVar3;
                            dVar2.f12246b = aVar2;
                            dVar2.f12247c = it;
                            dVar2.f12250f = 4;
                            if (cVar3.l(kVar, dVar2) == objF) {
                                return objF;
                            }
                        }
                        cVar3.f12234p.clear();
                        G g9 = G.f1419a;
                        aVar2.e(null);
                        Z2.j.a.f(Z2.j.f12858c, "DataMaster", null, f.f12252a, 2, null);
                        return G.f1419a;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        aVar2.e(null);
                        throw th2;
                    }
                }
                p098k7.a aVar3 = (p098k7.a) dVar2.f12246b;
                cVar2 = (c) dVar2.f12245a;
                C6.r.b(obj);
                aVar = aVar3;
                try {
                    it = cVar2.f12234p.iterator();
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    while (it.hasNext()) {
                        kVar = (X3.k) it.next();
                        dVar2.f12245a = cVar3;
                        dVar2.f12246b = aVar2;
                        dVar2.f12247c = it;
                        dVar2.f12250f = 4;
                        if (cVar3.l(kVar, dVar2) == objF) {
                            return objF;
                        }
                    }
                    cVar3.f12234p.clear();
                    G g10 = G.f1419a;
                    aVar2.e(null);
                    Z2.j.a.f(Z2.j.f12858c, "DataMaster", null, f.f12252a, 2, null);
                    return G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2 = aVar;
                    Throwable th4 = th;
                    aVar2.e(null);
                    throw th4;
                }
            }
            cVar = (c) dVar2.f12245a;
            C6.r.b(obj);
        }
        Y3.j jVar = cVar.f12228j;
        if (jVar != null) {
            long j8 = cVar.f12219a;
            J j9 = cVar.f12221c;
            t.d(j9);
            dVar2.f12245a = cVar;
            dVar2.f12250f = 2;
            if (jVar.j(j8, j9, dVar2) != objF) {
                cVar.f12236r = true;
                aVar = cVar.f12233o;
                dVar2.f12245a = cVar;
                dVar2.f12246b = aVar;
                dVar2.f12250f = 3;
                if (aVar.b(null, dVar2) != objF) {
                    cVar2 = cVar;
                    it = cVar2.f12234p.iterator();
                    cVar3 = cVar2;
                    aVar2 = aVar;
                    while (it.hasNext()) {
                        kVar = (X3.k) it.next();
                        dVar2.f12245a = cVar3;
                        dVar2.f12246b = aVar2;
                        dVar2.f12247c = it;
                        dVar2.f12250f = 4;
                        if (cVar3.l(kVar, dVar2) == objF) {
                        }
                    }
                    cVar3.f12234p.clear();
                    G g11 = G.f1419a;
                    aVar2.e(null);
                    Z2.j.a.f(Z2.j.f12858c, "DataMaster", null, f.f12252a, 2, null);
                    return G.f1419a;
                }
            }
        } else {
            cVar.f12236r = true;
            aVar = cVar.f12233o;
            dVar2.f12245a = cVar;
            dVar2.f12246b = aVar;
            dVar2.f12250f = 3;
            if (aVar.b(null, dVar2) != objF) {
                cVar2 = cVar;
                it = cVar2.f12234p.iterator();
                cVar3 = cVar2;
                aVar2 = aVar;
                while (it.hasNext()) {
                    kVar = (X3.k) it.next();
                    dVar2.f12245a = cVar3;
                    dVar2.f12246b = aVar2;
                    dVar2.f12247c = it;
                    dVar2.f12250f = 4;
                    if (cVar3.l(kVar, dVar2) == objF) {
                    }
                }
                cVar3.f12234p.clear();
                G g12 = G.f1419a;
                aVar2.e(null);
                Z2.j.a.f(Z2.j.f12858c, "DataMaster", null, f.f12252a, 2, null);
                return G.f1419a;
            }
        }
        return objF;
    }

    public final InterfaceC1815v0 j() {
        Y3.j jVar;
        InterfaceC1815v0 interfaceC1815v0 = this.f12231m;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
        this.f12231m = null;
        J j8 = this.f12221c;
        if (j8 == null || !this.f12235q || !this.f12236r || (jVar = this.f12228j) == null) {
            return null;
        }
        if (jVar.e()) {
            jVar.g(System.currentTimeMillis());
        }
        InterfaceC1815v0 interfaceC1815v0D = AbstractC1789i.d(j8, null, null, new g(jVar, null), 3, null);
        this.f12231m = interfaceC1815v0D;
        return interfaceC1815v0D;
    }

    public final InterfaceC1815v0 k() {
        InterfaceC1815v0 interfaceC1815v0 = this.f12231m;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
        this.f12231m = null;
        J j8 = this.f12221c;
        if (j8 == null || !this.f12235q || !this.f12236r) {
            return null;
        }
        Y3.j jVar = this.f12228j;
        if (jVar != null) {
            jVar.h();
        }
        return AbstractC1789i.d(j8, null, null, new h(j8, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r14.e(r15, r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(X3.k kVar, G6.d dVar) {
        i iVar;
        X3.h hVar;
        X3.k kVar2;
        Y3.b bVar;
        c cVar;
        Map mapG;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i8 = iVar.f12265g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f12265g = i8 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objC = iVar.f12263e;
        Object objF = H6.c.f();
        int i9 = iVar.f12265g;
        if (i9 != 0) {
            if (i9 == 1) {
                bVar = (Y3.b) iVar.f12262d;
                hVar = (X3.h) iVar.f12261c;
                X3.k kVar3 = (X3.k) iVar.f12260b;
                cVar = (c) iVar.f12259a;
                C6.r.b(objC);
                kVar2 = kVar3;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(objC);
            }
            return G.f1419a;
        }
        C6.r.b(objC);
        X3.c cVar2 = this.f12223e;
        if (cVar2 == null) {
            return G.f1419a;
        }
        hVar = this.f12224f;
        if (hVar == null) {
            return G.f1419a;
        }
        Y3.b bVar2 = this.f12227i;
        if (bVar2 == null) {
            return G.f1419a;
        }
        iVar.f12259a = this;
        iVar.f12260b = kVar;
        iVar.f12261c = hVar;
        iVar.f12262d = bVar2;
        iVar.f12265g = 1;
        objC = cVar2.c(iVar);
        if (objC != objF) {
            kVar2 = kVar;
            bVar = bVar2;
            cVar = this;
        }
        return objF;
        Map map = (Map) objC;
        Y3.l lVar = cVar.f12225g;
        if (lVar == null || (mapG = lVar.a()) == null) {
            mapG = M.g();
        }
        Y3.k kVarA = new Y3.e(kVar2, (Map<String, ? extends X3.i>) map, (Map<String, ? extends X3.i>) mapG, hVar.c(), hVar.a(), hVar.b()).a();
        iVar.f12259a = null;
        iVar.f12260b = null;
        iVar.f12261c = null;
        iVar.f12262d = null;
        iVar.f12265g = 2;
    }

    public final void m(Context context) {
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            Z2.j.a.h(Z2.j.f12858c, "DataMaster", null, j.f12266a, 2, null);
            return;
        }
        Y3.a aVar = new Y3.a(new k(), new l());
        application.registerActivityLifecycleCallbacks(aVar);
        this.f12229k = application;
        this.f12230l = aVar;
    }

    public Object n(Map map, G6.d dVar) {
        Y3.l lVar = this.f12225g;
        if (lVar == null) {
            return G.f1419a;
        }
        Object objC = lVar.c(map, dVar);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object o(Context context, Y3.d dVar, X3.h hVar, G6.d dVar2) {
        m mVar;
        c cVar;
        Context context2;
        Y3.l lVar;
        Y3.d dVar3 = dVar;
        if (dVar2 instanceof m) {
            mVar = (m) dVar2;
            int i8 = mVar.f12275g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.f12275g = i8 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar2);
            }
        } else {
            mVar = new m(dVar2);
        }
        Object obj = mVar.f12273e;
        Object objF = H6.c.f();
        int i9 = mVar.f12275g;
        if (i9 == 0) {
            C6.r.b(obj);
            if (this.f12235q) {
                Z2.j.a.h(Z2.j.f12858c, "DataMaster", null, n.f12276a, 2, null);
                return G.f1419a;
            }
            this.f12222d = dVar3;
            this.f12224f = hVar;
            this.f12221c = K.a(S0.b(null, 1, null).P1(this.f12220b));
            m(context);
            X3.c cVar2 = new X3.c(context, dVar3.b(), dVar3.d());
            cVar2.g();
            this.f12223e = cVar2;
            J j8 = this.f12221c;
            t.d(j8);
            this.f12232n = AbstractC1789i.d(j8, null, null, new o(cVar2, null), 3, null);
            Y3.l lVar2 = new Y3.l(context);
            mVar.f12269a = this;
            mVar.f12270b = context;
            mVar.f12271c = dVar3;
            mVar.f12272d = lVar2;
            mVar.f12275g = 1;
            if (lVar2.b(mVar) == objF) {
                return objF;
            }
            cVar = this;
            context2 = context;
            lVar = lVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (Y3.l) mVar.f12272d;
            dVar3 = (Y3.d) mVar.f12271c;
            Context context3 = (Context) mVar.f12270b;
            cVar = (c) mVar.f12269a;
            C6.r.b(obj);
            context2 = context3;
        }
        cVar.f12225g = lVar;
        com.elgato.telemetry.datamaster.persistence.a aVar = new com.elgato.telemetry.datamaster.persistence.a(context2, 0, false, 6, null);
        cVar.f12226h = aVar;
        Y3.m mVarG = dVar3.g();
        if (mVarG == null) {
            mVarG = new Y3.g();
        }
        Y3.b bVar = new Y3.b(mVarG, aVar, dVar3.c(), dVar3.e(), dVar3.f());
        J j9 = cVar.f12221c;
        t.d(j9);
        bVar.f(j9);
        cVar.f12227i = bVar;
        cVar.f12228j = new Y3.j(context2, aVar, cVar.new p(null));
        cVar.f12235q = true;
        Z2.j.a.f(Z2.j.f12858c, "DataMaster", null, new q(dVar3), 2, null);
        return G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (l(r13, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(X3.k kVar, G6.d dVar) {
        r rVar;
        p098k7.a aVar;
        c cVar;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i8 = rVar.f12289f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                rVar.f12289f = i8 - Integer.MIN_VALUE;
            } else {
                rVar = new r(dVar);
            }
        } else {
            rVar = new r(dVar);
        }
        Object obj = rVar.f12287d;
        Object objF = H6.c.f();
        int i9 = rVar.f12289f;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return G.f1419a;
            }
            p098k7.a aVar2 = (p098k7.a) rVar.f12286c;
            X3.k kVar2 = (X3.k) rVar.f12285b;
            cVar = (c) rVar.f12284a;
            C6.r.b(obj);
            aVar = aVar2;
            kVar = kVar2;
            try {
                cVar.f12234p.add(kVar);
                return G.f1419a;
            } finally {
                aVar.e(null);
            }
        }
        C6.r.b(obj);
        if (!this.f12235q) {
            Z2.j.a.h(Z2.j.f12858c, "DataMaster", null, s.f12290a, 2, null);
            return G.f1419a;
        }
        if (this.f12236r) {
            rVar.f12289f = 2;
        } else {
            aVar = this.f12233o;
            rVar.f12284a = this;
            rVar.f12285b = kVar;
            rVar.f12286c = aVar;
            rVar.f12289f = 1;
            if (aVar.b(null, rVar) != objF) {
                cVar = this;
                cVar.f12234p.add(kVar);
                return G.f1419a;
            }
        }
        return objF;
    }

    public /* synthetic */ c(long j8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? System.currentTimeMillis() : j8);
    }

    public c(long j8) {
        this(j8, Z.a(), G.f1419a);
    }

    public /* synthetic */ c(long j8, G6.g gVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? System.currentTimeMillis() : j8, gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(long j8, G6.g coroutineContext) {
        this(j8, coroutineContext, G.f1419a);
        t.g(coroutineContext, "coroutineContext");
    }
}
