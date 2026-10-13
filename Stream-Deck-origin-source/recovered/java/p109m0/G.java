package p109m0;

import I0.g;
import I0.i;
import I0.j;
import I0.l;
import Q6.k;
import Q6.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.P0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements g, I0.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f29333d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f29334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f29335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f29336c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29337a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(1);
            this.f29337a = gVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            g gVar = this.f29337a;
            return Boolean.valueOf(gVar != null ? gVar.a(obj) : true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f29338a = new a();

            public a() {
                super(2);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map invoke(l lVar, G g8) {
                Map mapB = g8.b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            }
        }

        /* JADX INFO: renamed from: m0.G$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0637b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f29339a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0637b(g gVar) {
                super(1);
                this.f29339a = gVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final G invoke(Map map) {
                return new G(this.f29339a, map);
            }
        }

        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a(g gVar) {
            return I0.k.a(a.f29338a, new C0637b(gVar));
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f29341b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ G f29342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f29343b;

            public a(G g8, Object obj) {
                this.f29342a = g8;
                this.f29343b = obj;
            }

            @Override // p215z0.H
            public void d() {
                this.f29342a.f29336c.add(this.f29343b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj) {
            super(1);
            this.f29341b = obj;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I i8) {
            G.this.f29336c.remove(this.f29341b);
            return new a(G.this, this.f29341b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f29345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f29346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29347d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, o oVar, int i8) {
            super(2);
            this.f29345b = obj;
            this.f29346c = oVar;
            this.f29347d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            G.this.f(this.f29345b, this.f29346c, interfaceC3163l, F0.a(this.f29347d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return C6.G.f1419a;
        }
    }

    public G(g gVar) {
        this.f29334a = gVar;
        this.f29335b = l1.e(null, null, 2, null);
        this.f29336c = new LinkedHashSet();
    }

    @Override // I0.g
    public boolean a(Object obj) {
        return this.f29334a.a(obj);
    }

    @Override // I0.g
    public Map b() {
        I0.d dVarH = h();
        if (dVarH != null) {
            Iterator it = this.f29336c.iterator();
            while (it.hasNext()) {
                dVarH.e(it.next());
            }
        }
        return this.f29334a.b();
    }

    @Override // I0.g
    public Object c(String str) {
        return this.f29334a.c(str);
    }

    @Override // I0.g
    public g.a d(String str, Function0 function0) {
        return this.f29334a.d(str, function0);
    }

    @Override // I0.d
    public void e(Object obj) {
        I0.d dVarH = h();
        if (dVarH == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        dVarH.e(obj);
    }

    @Override // I0.d
    public void f(Object obj, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-697180401);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-697180401, i8, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        I0.d dVarH = h();
        if (dVarH == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        dVarH.f(obj, oVar, interfaceC3163lP, (i8 & 112) | 520);
        K.a(obj, new c(obj), interfaceC3163lP, 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(obj, oVar, i8));
        }
    }

    public final I0.d h() {
        return (I0.d) this.f29335b.getValue();
    }

    public final void i(I0.d dVar) {
        this.f29335b.setValue(dVar);
    }

    public G(g gVar, Map<String, ? extends List<? extends Object>> map) {
        this(i.a(map, new a(gVar)));
    }
}
