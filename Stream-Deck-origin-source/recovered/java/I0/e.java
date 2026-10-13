package I0;

import C6.G;
import D6.M;
import Q6.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements I0.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f3690d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f3691e = k.a(a.f3695a, b.f3696a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f3694c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3695a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map invoke(l lVar, e eVar) {
            return eVar.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3696a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e invoke(Map map) {
            return new e(map);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a() {
            return e.f3691e;
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f3697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3698b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f3699c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f3701a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar) {
                super(1);
                this.f3701a = eVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                g gVarG = this.f3701a.g();
                return Boolean.valueOf(gVarG != null ? gVarG.a(obj) : true);
            }
        }

        public d(Object obj) {
            this.f3697a = obj;
            this.f3699c = i.a((Map) e.this.f3692a.get(obj), new a(e.this));
        }

        public final g a() {
            return this.f3699c;
        }

        public final void b(Map map) {
            if (this.f3698b) {
                Map mapB = this.f3699c.b();
                if (mapB.isEmpty()) {
                    map.remove(this.f3697a);
                } else {
                    map.put(this.f3697a, mapB);
                }
            }
        }

        public final void c(boolean z8) {
            this.f3698b = z8;
        }
    }

    /* JADX INFO: renamed from: I0.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0140e extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f3703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f3704c;

        /* JADX INFO: renamed from: I0.e$e$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f3705a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f3706b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f3707c;

            public a(d dVar, e eVar, Object obj) {
                this.f3705a = dVar;
                this.f3706b = eVar;
                this.f3707c = obj;
            }

            @Override // p215z0.H
            public void d() {
                this.f3705a.b(this.f3706b.f3692a);
                this.f3706b.f3693b.remove(this.f3707c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0140e(Object obj, d dVar) {
            super(1);
            this.f3703b = obj;
            this.f3704c = dVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            boolean zContainsKey = e.this.f3693b.containsKey(this.f3703b);
            Object obj = this.f3703b;
            if (!zContainsKey) {
                e.this.f3692a.remove(this.f3703b);
                e.this.f3693b.put(this.f3703b, this.f3704c);
                return new a(this.f3704c, e.this, this.f3703b);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f3709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f3710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f3711d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, o oVar, int i8) {
            super(2);
            this.f3709b = obj;
            this.f3710c = oVar;
            this.f3711d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            e.this.f(this.f3709b, this.f3710c, interfaceC3163l, F0.a(this.f3711d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // I0.d
    public void e(Object obj) {
        d dVar = (d) this.f3693b.get(obj);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.f3692a.remove(obj);
        }
    }

    @Override // I0.d
    public void f(Object obj, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1198538093);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1198538093, i8, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        interfaceC3163lP.f(444418301);
        interfaceC3163lP.u(207, obj);
        interfaceC3163lP.f(-492369756);
        Object objG = interfaceC3163lP.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            g gVarG = g();
            if (!(gVarG != null ? gVarG.a(obj) : true)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objG = new d(obj);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        d dVar = (d) objG;
        AbstractC3182v.a(i.b().c(dVar.a()), oVar, interfaceC3163lP, i8 & 112);
        K.a(G.f1419a, new C0140e(obj, dVar), interfaceC3163lP, 6);
        interfaceC3163lP.d();
        interfaceC3163lP.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new f(obj, oVar, i8));
        }
    }

    public final g g() {
        return this.f3694c;
    }

    public final Map h() {
        Map mapY = M.y(this.f3692a);
        Iterator it = this.f3693b.values().iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(mapY);
        }
        if (mapY.isEmpty()) {
            return null;
        }
        return mapY;
    }

    public final void i(g gVar) {
        this.f3694c = gVar;
    }

    public e(Map<Object, Map<String, List<Object>>> map) {
        this.f3692a = map;
        this.f3693b = new LinkedHashMap();
    }

    public /* synthetic */ e(Map map, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
