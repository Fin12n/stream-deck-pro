package E0;

import D6.AbstractC0926f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC0926f implements C0.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G0.e f2000b = new G0.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f2001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2004f;

    public f(d dVar) {
        this.f1999a = dVar;
        this.f2001c = this.f1999a.o();
        this.f2004f = this.f1999a.size();
    }

    @Override // D6.AbstractC0926f
    public Set a() {
        return new h(this);
    }

    @Override // D6.AbstractC0926f
    public Set b() {
        return new j(this);
    }

    @Override // D6.AbstractC0926f
    public int c() {
        return this.f2004f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t tVarA = t.f2016e.a();
        kotlin.jvm.internal.t.e(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f2001c = tVarA;
        m(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f2001c.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // D6.AbstractC0926f
    public Collection d() {
        return new l(this);
    }

    @Override // C0.f.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d build() {
        d dVar;
        if (this.f2001c == this.f1999a.o()) {
            dVar = this.f1999a;
        } else {
            this.f2000b = new G0.e();
            dVar = new d(this.f2001c, size());
        }
        this.f1999a = dVar;
        return dVar;
    }

    public final int f() {
        return this.f2003e;
    }

    public final t g() {
        return this.f2001c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f2001c.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final G0.e h() {
        return this.f2000b;
    }

    public final void j(int i8) {
        this.f2003e = i8;
    }

    public final void k(Object obj) {
        this.f2002d = obj;
    }

    public final void l(G0.e eVar) {
        this.f2000b = eVar;
    }

    public void m(int i8) {
        this.f2004f = i8;
        this.f2003e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f2002d = null;
        this.f2001c = this.f2001c.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f2002d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        d dVarBuild = map instanceof d ? (d) map : null;
        if (dVarBuild == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarBuild = fVar != null ? fVar.build() : null;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        G0.b bVar = new G0.b(0, 1, null);
        int size = size();
        t tVar = this.f2001c;
        t tVarO = dVarBuild.o();
        kotlin.jvm.internal.t.e(tVarO, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f2001c = tVar.E(tVarO, 0, bVar, this);
        int size2 = (dVarBuild.size() + size) - bVar.a();
        if (size != size2) {
            m(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f2002d = null;
        t tVarG = this.f2001c.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarG == null) {
            tVarG = t.f2016e.a();
            kotlin.jvm.internal.t.e(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f2001c = tVarG;
        return this.f2002d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarH = this.f2001c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarH == null) {
            tVarH = t.f2016e.a();
            kotlin.jvm.internal.t.e(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f2001c = tVarH;
        return size != size();
    }
}
