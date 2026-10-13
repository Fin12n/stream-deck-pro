package X3;

import C6.G;
import C6.r;
import D6.L;
import Q6.o;
import X5.C1692v;
import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1785g;
import p017b7.J;
import p017b7.X0;
import p017b7.Z;
import r7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f11665g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.k f11666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.b f11667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X3.d f11668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p098k7.a f11671f;

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
        public Object f11672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f11673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f11674c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11676e;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f11674c = obj;
            this.f11676e |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    /* JADX INFO: renamed from: X3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0299c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f11677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f11678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f11679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f11680d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11682f;

        public C0299c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f11680d = obj;
            this.f11682f |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Exception f11683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.f11683a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to fetch country code: " + this.f11683a.getMessage();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11684a;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new e(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            if (r5 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        
            if (r5 == r0) goto L21;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f11684a;
            if (i8 != 0) {
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return (String) obj;
            }
            r.b(obj);
            Q6.k kVar = c.this.f11666a;
            if (kVar != null) {
                this.f11684a = 1;
                obj = kVar.invoke(this);
            } else {
                c cVar = c.this;
                this.f11684a = 2;
                obj = cVar.e(this);
            }
            return objF;
            String str = (String) obj;
            if (str != null) {
                return str;
            }
            c cVar2 = c.this;
            this.f11684a = 2;
            obj = cVar2.e(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f11686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11687b;

        public f(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new f(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            G5.a aVar;
            Throwable th;
            G5.a aVar2;
            r7.j jVar;
            y yVarP;
            Object objF = H6.c.f();
            int i8 = this.f11687b;
            String strC = null;
            if (i8 == 0) {
                r.b(obj);
                G5.a aVarB = G5.d.b(null, 1, null);
                try {
                    T5.d dVar = new T5.d();
                    T5.f.d(dVar, "https://api.country.is");
                    dVar.n(C1692v.f11962b.b());
                    U5.g gVar = new U5.g(dVar, aVarB);
                    this.f11686a = aVarB;
                    this.f11687b = 1;
                    Object objC = gVar.c(this);
                    if (objC != objF) {
                        aVar2 = aVarB;
                        obj = objC;
                    }
                    return objF;
                } catch (Throwable th2) {
                    aVar = aVarB;
                    th = th2;
                    aVar.close();
                    throw th;
                }
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (G5.a) this.f11686a;
                try {
                    r.b(obj);
                    jVar = (r7.j) r7.k.o(r7.c.f32534d.g((String) obj)).get("country");
                    if (jVar != null && (yVarP = r7.k.p(jVar)) != null) {
                        strC = yVarP.c();
                    }
                    aVar.close();
                    return strC;
                } catch (Throwable th3) {
                    th = th3;
                    aVar.close();
                    throw th;
                }
            }
            aVar2 = (G5.a) this.f11686a;
            try {
                r.b(obj);
            } catch (Throwable th4) {
                th = th4;
                aVar = aVar2;
                aVar.close();
                throw th;
            }
            this.f11686a = aVar2;
            this.f11687b = 2;
            obj = U5.e.b((U5.c) obj, null, this, 1, null);
            if (obj != objF) {
                aVar = aVar2;
                jVar = (r7.j) r7.k.o(r7.c.f32534d.g((String) obj)).get("country");
                if (jVar != null) {
                    strC = yVarP.c();
                }
                aVar.close();
                return strC;
            }
            return objF;
        }
    }

    public c(Context context, String str, Q6.k kVar) {
        t.g(context, "context");
        this.f11666a = kVar;
        this.f11667b = X3.b.f11660e.a(context, str);
        this.f11670e = context.getApplicationContext();
        this.f11671f = p098k7.c.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(G6.d dVar) {
        b bVar;
        c cVar;
        p098k7.a aVar;
        Map mapA;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f11676e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f11676e = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f11674c;
        Object objF = H6.c.f();
        int i9 = bVar.f11676e;
        if (i9 == 0) {
            r.b(obj);
            p098k7.a aVar2 = this.f11671f;
            bVar.f11672a = this;
            bVar.f11673b = aVar2;
            bVar.f11676e = 1;
            if (aVar2.b(null, bVar) == objF) {
                return objF;
            }
            cVar = this;
            aVar = aVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p098k7.a) bVar.f11673b;
            cVar = (c) bVar.f11672a;
            r.b(obj);
        }
        try {
            Map mapC = L.c();
            X3.d dVar2 = cVar.f11668c;
            if (dVar2 != null && (mapA = dVar2.a()) != null) {
                mapC.putAll(mapA);
            }
            mapC.putAll(cVar.f11667b.a());
            String str = cVar.f11669d;
            if (str != null) {
                mapC.put("mp_country_code", i.Companion.g(str));
            }
            return L.b(mapC);
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(G6.d dVar) {
        C0299c c0299c;
        c cVar;
        c cVar2;
        p098k7.a aVar;
        String str;
        if (dVar instanceof C0299c) {
            c0299c = (C0299c) dVar;
            int i8 = c0299c.f11682f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0299c.f11682f = i8 - Integer.MIN_VALUE;
            } else {
                c0299c = new C0299c(dVar);
            }
        } else {
            c0299c = new C0299c(dVar);
        }
        Object objE = c0299c.f11680d;
        Object objF = H6.c.f();
        int i9 = c0299c.f11682f;
        try {
            if (i9 == 0) {
                r.b(objE);
                e eVar = new e(null);
                c0299c.f11677a = this;
                c0299c.f11682f = 1;
                objE = X0.e(5000L, eVar, c0299c);
                if (objE != objF) {
                    cVar = this;
                }
                return objF;
            }
            if (i9 == 1) {
                cVar = (c) c0299c.f11677a;
                r.b(objE);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p098k7.a) c0299c.f11679c;
                str = (String) c0299c.f11678b;
                cVar2 = (c) c0299c.f11677a;
                r.b(objE);
            }
            try {
                cVar2.f11669d = str;
                G g8 = G.f1419a;
                return G.f1419a;
            } finally {
                aVar.e(null);
            }
            String str2 = (String) objE;
            p098k7.a aVar2 = cVar.f11671f;
            c0299c.f11677a = cVar;
            c0299c.f11678b = str2;
            c0299c.f11679c = aVar2;
            c0299c.f11682f = 2;
            if (aVar2.b(null, c0299c) != objF) {
                cVar2 = cVar;
                aVar = aVar2;
                str = str2;
                cVar2.f11669d = str;
                G g9 = G.f1419a;
                return G.f1419a;
            }
            return objF;
        } catch (Exception e8) {
            Z2.j.a.f(Z2.j.f12858c, "ContextProvider", null, new d(e8), 2, null);
        }
    }

    public final Object e(G6.d dVar) {
        return AbstractC1785g.g(Z.b(), new f(null), dVar);
    }

    public final String f() {
        return this.f11669d;
    }

    public final void g() {
        X3.d.a aVar = X3.d.f11688r;
        Context applicationContext = this.f11670e;
        t.f(applicationContext, "applicationContext");
        this.f11668c = aVar.a(applicationContext);
    }

    public /* synthetic */ c(Context context, String str, Q6.k kVar, int i8, AbstractC2633k abstractC2633k) {
        this(context, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : kVar);
    }
}
