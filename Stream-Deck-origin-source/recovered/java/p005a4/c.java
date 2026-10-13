package p005a4;

import C6.G;
import C6.r;
import I6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements X3.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13338f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005a4.i f13339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a4.a f13340b = new p005a4.a(0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p098k7.a f13341c = p098k7.c.b(false, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13342d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f13343e;

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
        public Object f13344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f13347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f13348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f13349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f13350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f13351h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13353j;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13351h = obj;
            this.f13353j |= Integer.MIN_VALUE;
            return c.this.a(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: a4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0332c extends l implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13354a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f13356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ X3.f f13358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f13359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Map f13360g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0332c(String str, String str2, X3.f fVar, String str3, Map map, G6.d dVar) {
            super(1, dVar);
            this.f13356c = str;
            this.f13357d = str2;
            this.f13358e = fVar;
            this.f13359f = str3;
            this.f13360g = map;
        }

        @Override // I6.a
        public final G6.d create(G6.d dVar) {
            return c.this.new C0332c(this.f13356c, this.f13357d, this.f13358e, this.f13359f, this.f13360g, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((C0332c) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f13354a;
            if (i8 == 0) {
                r.b(obj);
                c cVar = c.this;
                String str = this.f13356c;
                String str2 = this.f13357d;
                X3.f fVar = this.f13358e;
                String str3 = this.f13359f;
                Map map = this.f13360g;
                this.f13354a = 1;
                if (cVar.a(str, str2, fVar, str3, map, this) == objF) {
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
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13364d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13366f;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13364d = obj;
            this.f13366f |= Integer.MIN_VALUE;
            return c.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13367a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f13369c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, G6.d dVar) {
            super(1, dVar);
            this.f13369c = str;
        }

        @Override // I6.a
        public final G6.d create(G6.d dVar) {
            return c.this.new e(this.f13369c, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((e) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f13367a;
            if (i8 == 0) {
                r.b(obj);
                c cVar = c.this;
                String str = this.f13369c;
                this.f13367a = 1;
                if (cVar.b(str, this) == objF) {
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
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13373d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13375f;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13373d = obj;
            this.f13375f |= Integer.MIN_VALUE;
            return c.this.c(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f13376a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "SentryTracker already started";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f13377a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "SentryTracker started";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f13381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f13382e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13384g;

        public i(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13382e = obj;
            this.f13384g |= Integer.MIN_VALUE;
            return c.this.e(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends l implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13385a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f13387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ X3.e f13388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Throwable th, X3.e eVar, G6.d dVar) {
            super(1, dVar);
            this.f13387c = th;
            this.f13388d = eVar;
        }

        @Override // I6.a
        public final G6.d create(G6.d dVar) {
            return c.this.new j(this.f13387c, this.f13388d, dVar);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G6.d dVar) {
            return ((j) create(dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f13385a;
            if (i8 == 0) {
                r.b(obj);
                c cVar = c.this;
                Throwable th = this.f13387c;
                X3.e eVar = this.f13388d;
                this.f13385a = 1;
                if (cVar.e(th, eVar, this) == objF) {
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
    public static final class k extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f13389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Throwable th) {
            super(0);
            this.f13389a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Deduplicating error: " + this.f13389a.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object a(String str, String str2, X3.f fVar, String str3, Map map, G6.d dVar) {
        b bVar;
        c cVar;
        Map map2;
        String str4;
        X3.f fVar2;
        String str5;
        String str6;
        p098k7.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f13353j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f13353j = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f13351h;
        Object objF = H6.c.f();
        int i9 = bVar.f13353j;
        if (i9 == 0) {
            r.b(obj);
            if (this.f13343e) {
                p005a4.i iVar = this.f13339a;
                if (iVar != null) {
                    iVar.c(str, str2, fVar, str3, map);
                }
                return G.f1419a;
            }
            p098k7.a aVar2 = this.f13341c;
            bVar.f13344a = this;
            bVar.f13345b = str;
            bVar.f13346c = str2;
            bVar.f13347d = fVar;
            bVar.f13348e = str3;
            bVar.f13349f = map;
            bVar.f13350g = aVar2;
            bVar.f13353j = 1;
            if (aVar2.b(null, bVar) == objF) {
                return objF;
            }
            cVar = this;
            map2 = map;
            str4 = str3;
            fVar2 = fVar;
            str5 = str2;
            str6 = str;
            aVar = aVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p098k7.a) bVar.f13350g;
            Map map3 = (Map) bVar.f13349f;
            String str7 = (String) bVar.f13348e;
            X3.f fVar3 = (X3.f) bVar.f13347d;
            String str8 = (String) bVar.f13346c;
            String str9 = (String) bVar.f13345b;
            c cVar2 = (c) bVar.f13344a;
            r.b(obj);
            map2 = map3;
            str4 = str7;
            fVar2 = fVar3;
            str5 = str8;
            str6 = str9;
            cVar = cVar2;
        }
        try {
            cVar.f13342d.add(cVar.new C0332c(str6, str5, fVar2, str4, map2, null));
            return G.f1419a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, G6.d dVar) {
        d dVar2;
        p098k7.a aVar;
        c cVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f13366f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f13366f = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f13364d;
        Object objF = H6.c.f();
        int i9 = dVar2.f13366f;
        if (i9 == 0) {
            r.b(obj);
            if (this.f13343e) {
                p005a4.i iVar = this.f13339a;
                if (iVar != null) {
                    iVar.d(str);
                }
                return G.f1419a;
            }
            aVar = this.f13341c;
            dVar2.f13361a = this;
            dVar2.f13362b = str;
            dVar2.f13363c = aVar;
            dVar2.f13366f = 1;
            if (aVar.b(null, dVar2) == objF) {
                return objF;
            }
            cVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p098k7.a aVar2 = (p098k7.a) dVar2.f13363c;
            String str2 = (String) dVar2.f13362b;
            cVar = (c) dVar2.f13361a;
            r.b(obj);
            aVar = aVar2;
            str = str2;
        }
        try {
            cVar.f13342d.add(cVar.new e(str, null));
            return G.f1419a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x003a, B:37:0x00a3, B:39:0x00a9, B:42:0x00be, B:36:0x009d), top: B:49:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:37:0x00a3->B:54:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, k7.a] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final Object c(p005a4.b bVar, X3.h hVar, p005a4.i iVar, G6.d dVar) {
        f fVar;
        G g8;
        p098k7.a aVar;
        c cVar;
        Iterator it;
        Q6.k kVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f13375f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f13375f = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f13373d;
        Object objF = H6.c.f();
        ?? r8 = fVar.f13375f;
        try {
            if (r8 == 0) {
                r.b(obj);
                if (this.f13343e) {
                    Z2.j.a.h(Z2.j.f12858c, "SentryTracker", null, g.f13376a, 2, null);
                    return G.f1419a;
                }
                if (iVar == null) {
                    throw new IllegalStateException("SentryTransport must be provided. Use SentryTransport(context) for Android.");
                }
                this.f13339a = iVar;
                iVar.b(bVar);
                String strB = hVar.b();
                if (strB != null) {
                    iVar.d(strB);
                    g8 = G.f1419a;
                } else {
                    g8 = null;
                }
                if (g8 == null) {
                    iVar.d(hVar.c());
                }
                this.f13343e = true;
                aVar = this.f13341c;
                fVar.f13370a = this;
                fVar.f13371b = aVar;
                fVar.f13375f = 1;
                if (aVar.b(null, fVar) != objF) {
                    cVar = this;
                }
                return objF;
            }
            if (r8 == 1) {
                aVar = (p098k7.a) fVar.f13371b;
                cVar = (c) fVar.f13370a;
                r.b(obj);
            } else {
                if (r8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) fVar.f13372c;
                p098k7.a aVar2 = (p098k7.a) fVar.f13371b;
                cVar = (c) fVar.f13370a;
                r.b(obj);
                r8 = aVar2;
            }
            while (it.hasNext()) {
                kVar = (Q6.k) it.next();
                fVar.f13370a = cVar;
                fVar.f13371b = r8;
                fVar.f13372c = it;
                fVar.f13375f = 2;
                if (kVar.invoke(fVar) == objF) {
                    return objF;
                }
            }
            cVar.f13342d.clear();
            G g9 = G.f1419a;
            r8.e(null);
            Z2.j.a.f(Z2.j.f12858c, "SentryTracker", null, h.f13377a, 2, null);
            return G.f1419a;
            r8 = aVar;
            it = cVar.f13342d.iterator();
            while (it.hasNext()) {
                kVar = (Q6.k) it.next();
                fVar.f13370a = cVar;
                fVar.f13371b = r8;
                fVar.f13372c = it;
                fVar.f13375f = 2;
                if (kVar.invoke(fVar) == objF) {
                    return objF;
                }
            }
            cVar.f13342d.clear();
            G g10 = G.f1419a;
            r8.e(null);
            Z2.j.a.f(Z2.j.f12858c, "SentryTracker", null, h.f13377a, 2, null);
            return G.f1419a;
        } catch (Throwable th) {
            r8.e(null);
            throw th;
        }
    }

    public Object d(Throwable th, G6.d dVar) {
        Object objE = e(th, null, dVar);
        return objE == H6.c.f() ? objE : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Throwable th, X3.e eVar, G6.d dVar) {
        i iVar;
        c cVar;
        p098k7.a aVar;
        c cVar2;
        p005a4.i iVar2;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i8 = iVar.f13384g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                iVar.f13384g = i8 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object objB = iVar.f13382e;
        Object objF = H6.c.f();
        int i9 = iVar.f13384g;
        if (i9 != 0) {
            if (i9 == 1) {
                p098k7.a aVar2 = (p098k7.a) iVar.f13381d;
                eVar = (X3.e) iVar.f13380c;
                Throwable th2 = (Throwable) iVar.f13379b;
                cVar2 = (c) iVar.f13378a;
                r.b(objB);
                aVar = aVar2;
                th = th2;
                try {
                    cVar2.f13342d.add(cVar2.new j(th, eVar, null));
                    return G.f1419a;
                } finally {
                    aVar.e(null);
                }
            }
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (X3.e) iVar.f13380c;
            th = (Throwable) iVar.f13379b;
            cVar = (c) iVar.f13378a;
            r.b(objB);
            if (!((Boolean) objB).booleanValue()) {
                Z2.j.a.f(Z2.j.f12858c, "SentryTracker", null, new k(th), 2, null);
                return G.f1419a;
            }
            iVar2 = cVar.f13339a;
            if (iVar2 != null) {
                iVar2.a(th, eVar);
            }
            return G.f1419a;
        }
        r.b(objB);
        if (this.f13343e) {
            p005a4.a aVar3 = this.f13340b;
            iVar.f13378a = this;
            iVar.f13379b = th;
            iVar.f13380c = eVar;
            iVar.f13384g = 2;
            objB = aVar3.b(th, iVar);
            if (objB != objF) {
                cVar = this;
                if (!((Boolean) objB).booleanValue()) {
                    Z2.j.a.f(Z2.j.f12858c, "SentryTracker", null, new k(th), 2, null);
                    return G.f1419a;
                }
                iVar2 = cVar.f13339a;
                if (iVar2 != null) {
                    iVar2.a(th, eVar);
                }
                return G.f1419a;
            }
        } else {
            aVar = this.f13341c;
            iVar.f13378a = this;
            iVar.f13379b = th;
            iVar.f13380c = eVar;
            iVar.f13381d = aVar;
            iVar.f13384g = 1;
            if (aVar.b(null, iVar) != objF) {
                cVar2 = this;
                cVar2.f13342d.add(cVar2.new j(th, eVar, null));
                return G.f1419a;
            }
        }
        return objF;
    }
}
