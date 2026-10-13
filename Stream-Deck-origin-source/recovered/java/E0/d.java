package E0;

import D6.AbstractC0923c;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractC0923c implements C0.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1991d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1992e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f1993f = new d(t.f2016e.a(), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1995c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final d a() {
            d dVar = d.f1993f;
            kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        public a() {
        }
    }

    public d(t tVar, int i8) {
        this.f1994b = tVar;
        this.f1995c = i8;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f1994b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // D6.AbstractC0923c
    public final Set d() {
        return m();
    }

    @Override // D6.AbstractC0923c
    public int f() {
        return this.f1995c;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f1994b.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // C0.f
    public f l() {
        return new f(this);
    }

    public final C0.d m() {
        return new n(this);
    }

    @Override // D6.AbstractC0923c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0.d e() {
        return new p(this);
    }

    public final t o() {
        return this.f1994b;
    }

    @Override // D6.AbstractC0923c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C0.b g() {
        return new r(this);
    }

    public d r(Object obj, Object obj2) {
        t.b bVarP = this.f1994b.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarP == null ? this : new d(bVarP.a(), size() + bVarP.b());
    }

    public d s(Object obj) {
        t tVarQ = this.f1994b.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        if (this.f1994b == tVarQ) {
            return this;
        }
        return tVarQ == null ? f1991d.a() : new d(tVarQ, size() - 1);
    }
}
