package H0;

import E0.t;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.AbstractC3180u;
import p215z0.AbstractC3186x;
import p215z0.InterfaceC3183v0;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e extends E0.d implements InterfaceC3183v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f3327g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f3328h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends E0.f implements InterfaceC3183v0.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e f3329g;

        public a(e eVar) {
            super(eVar);
            this.f3329g = eVar;
        }

        @Override // E0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC3180u) {
                return o((AbstractC3180u) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof q1) {
                return p((q1) obj);
            }
            return false;
        }

        @Override // E0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof AbstractC3180u) {
                return r((AbstractC3180u) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC3180u) ? obj2 : s((AbstractC3180u) obj, (q1) obj2);
        }

        @Override // E0.f
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public e build() {
            e eVar;
            if (g() == this.f3329g.o()) {
                eVar = this.f3329g;
            } else {
                l(new G0.e());
                eVar = new e(g(), size());
            }
            this.f3329g = eVar;
            return eVar;
        }

        public /* bridge */ boolean o(AbstractC3180u abstractC3180u) {
            return super.containsKey(abstractC3180u);
        }

        public /* bridge */ boolean p(q1 q1Var) {
            return super.containsValue(q1Var);
        }

        public /* bridge */ q1 r(AbstractC3180u abstractC3180u) {
            return (q1) super.get(abstractC3180u);
        }

        @Override // E0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof AbstractC3180u) {
                return t((AbstractC3180u) obj);
            }
            return null;
        }

        public /* bridge */ q1 s(AbstractC3180u abstractC3180u, q1 q1Var) {
            return (q1) super.getOrDefault(abstractC3180u, q1Var);
        }

        public /* bridge */ q1 t(AbstractC3180u abstractC3180u) {
            return (q1) super.remove(abstractC3180u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e a() {
            return e.f3328h;
        }

        public b() {
        }
    }

    static {
        t tVarA = t.f2016e.a();
        kotlin.jvm.internal.t.e(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        f3328h = new e(tVarA, 0);
    }

    public e(t tVar, int i8) {
        super(tVar, i8);
    }

    @Override // p215z0.InterfaceC3184w
    public Object a(AbstractC3180u abstractC3180u) {
        return AbstractC3186x.c(this, abstractC3180u);
    }

    @Override // E0.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC3180u) {
            return v((AbstractC3180u) obj);
        }
        return false;
    }

    @Override // D6.AbstractC0923c, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof q1) {
            return w((q1) obj);
        }
        return false;
    }

    @Override // E0.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC3180u) {
            return x((AbstractC3180u) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC3180u) ? obj2 : y((AbstractC3180u) obj, (q1) obj2);
    }

    @Override // E0.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a l() {
        return new a(this);
    }

    public /* bridge */ boolean v(AbstractC3180u abstractC3180u) {
        return super.containsKey(abstractC3180u);
    }

    public /* bridge */ boolean w(q1 q1Var) {
        return super.containsValue(q1Var);
    }

    public /* bridge */ q1 x(AbstractC3180u abstractC3180u) {
        return (q1) super.get(abstractC3180u);
    }

    public /* bridge */ q1 y(AbstractC3180u abstractC3180u, q1 q1Var) {
        return (q1) super.getOrDefault(abstractC3180u, q1Var);
    }

    @Override // p215z0.InterfaceC3183v0
    public InterfaceC3183v0 z(AbstractC3180u abstractC3180u, q1 q1Var) {
        t.b bVarP = o().P(abstractC3180u.hashCode(), abstractC3180u, q1Var, 0);
        return bVarP == null ? this : new e(bVarP.a(), size() + bVarP.b());
    }
}
