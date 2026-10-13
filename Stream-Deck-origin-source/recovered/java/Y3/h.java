package Y3;

import C6.G;
import C6.r;
import Q6.o;
import android.content.Context;
import java.io.File;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.F;
import p017b7.J;
import p143q0.nKy.bGZGhbtQmA;
import p179u4.eubL.OjEsfyJYzbPn;
import q7.N0;
import q7.Z;
import r7.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12328f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f12330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f12331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p098k7.a f12332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r7.c f12333e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12334a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((r7.f) obj);
            return G.f1419a;
        }

        public final void invoke(r7.f Json) {
            t.g(Json, "$this$Json");
            Json.h(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f12337c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12339e;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12337c = obj;
            this.f12339e |= Integer.MIN_VALUE;
            return h.this.e(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12340a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f12342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Exception f12343b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, Exception exc) {
                super(0);
                this.f12342a = hVar;
                this.f12343b = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Failed to load properties from " + this.f12342a.f12329a + OjEsfyJYzbPn.FsVISHtMPvpqI + this.f12343b.getMessage();
            }
        }

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return h.this.new d(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f12340a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            try {
                if (!h.this.f12331c.exists()) {
                    return null;
                }
                String strF = N6.c.f(h.this.f12331c, null, 1, null);
                r7.c cVar = h.this.f12333e;
                cVar.a();
                return (Map) cVar.b(new Z(N0.f32043a, X3.i.Companion.serializer()), strF);
            } catch (Exception e8) {
                Z2.j.a.h(Z2.j.f12858c, "PropertyStorage", null, new a(h.this, e8), 2, null);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f12347d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12349f;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12347d = obj;
            this.f12349f |= Integer.MIN_VALUE;
            return h.this.f(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12350a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f12352c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f12353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Exception f12354b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, Exception exc) {
                super(0);
                this.f12353a = hVar;
                this.f12354b = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Failed to save properties to " + this.f12353a.f12329a + ": " + this.f12354b.getMessage();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Map map, G6.d dVar) {
            super(2, dVar);
            this.f12352c = map;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return h.this.new f(this.f12352c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f12350a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            try {
                h.this.f12330b.mkdirs();
                r7.c cVar = h.this.f12333e;
                Map map = this.f12352c;
                cVar.a();
                N6.c.h(h.this.f12331c, cVar.c(new Z(N0.f32043a, X3.i.Companion.serializer()), map), null, 2, null);
            } catch (Exception e8) {
                Z2.j.a.h(Z2.j.f12858c, "PropertyStorage", null, new a(h.this, e8), 2, null);
            }
            return G.f1419a;
        }
    }

    public h(Context context, String fileName) {
        t.g(context, bGZGhbtQmA.RIc);
        t.g(fileName, "fileName");
        this.f12329a = fileName;
        File file = new File(context.getFilesDir(), "ElgatoTelemetry");
        this.f12330b = file;
        this.f12331c = new File(file, fileName);
        this.f12332d = p098k7.c.b(false, 1, null);
        this.f12333e = p.b(null, b.f12334a, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(G6.d dVar) throws Throwable {
        c cVar;
        p098k7.a aVar;
        h hVar;
        p098k7.a aVar2;
        Throwable th;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f12339e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f12339e = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f12337c;
        Object objF = H6.c.f();
        int i9 = cVar.f12339e;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar = this.f12332d;
                cVar.f12335a = this;
                cVar.f12336b = aVar;
                cVar.f12339e = 1;
                if (aVar.b(null, cVar) != objF) {
                    hVar = this;
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (p098k7.a) cVar.f12335a;
                try {
                    r.b(obj);
                    Map map = (Map) obj;
                    aVar2.e(null);
                    return map;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.e(null);
                    throw th;
                }
            }
            p098k7.a aVar3 = (p098k7.a) cVar.f12336b;
            hVar = (h) cVar.f12335a;
            r.b(obj);
            aVar = aVar3;
            F fB = p017b7.Z.b();
            d dVar2 = hVar.new d(null);
            cVar.f12335a = aVar;
            cVar.f12336b = null;
            cVar.f12339e = 2;
            Object objG = AbstractC1785g.g(fB, dVar2, cVar);
            if (objG != objF) {
                aVar2 = aVar;
                obj = objG;
                Map map2 = (Map) obj;
                aVar2.e(null);
                return map2;
            }
            return objF;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Map map, G6.d dVar) throws Throwable {
        e eVar;
        p098k7.a aVar;
        h hVar;
        Throwable th;
        p098k7.a aVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f12349f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f12349f = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f12347d;
        Object objF = H6.c.f();
        int i9 = eVar.f12349f;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar = this.f12332d;
                eVar.f12344a = this;
                eVar.f12345b = map;
                eVar.f12346c = aVar;
                eVar.f12349f = 1;
                if (aVar.b(null, eVar) != objF) {
                    hVar = this;
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (p098k7.a) eVar.f12344a;
                try {
                    r.b(obj);
                    G g8 = G.f1419a;
                    aVar2.e(null);
                    return g8;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.e(null);
                    throw th;
                }
            }
            p098k7.a aVar3 = (p098k7.a) eVar.f12346c;
            Map map2 = (Map) eVar.f12345b;
            hVar = (h) eVar.f12344a;
            r.b(obj);
            aVar = aVar3;
            map = map2;
            F fB = p017b7.Z.b();
            f fVar = hVar.new f(map, null);
            eVar.f12344a = aVar;
            eVar.f12345b = null;
            eVar.f12346c = null;
            eVar.f12349f = 2;
            if (AbstractC1785g.g(fB, fVar, eVar) != objF) {
                aVar2 = aVar;
                G g9 = G.f1419a;
                aVar2.e(null);
                return g9;
            }
            return objF;
        } catch (Throwable th3) {
            p098k7.a aVar4 = aVar;
            th = th3;
            aVar2 = aVar4;
            aVar2.e(null);
            throw th;
        }
    }

    public /* synthetic */ h(Context context, String str, int i8, AbstractC2633k abstractC2633k) {
        this(context, (i8 & 2) != 0 ? "super_properties.json" : str);
    }
}
