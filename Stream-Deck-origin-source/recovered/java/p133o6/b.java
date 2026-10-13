package p133o6;

import Q6.k;
import R6.e;
import V.ocy.SVzBK;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Map, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30955a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f30956a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(1);
            this.f30956a = function0;
        }

        @Override // Q6.k
        public final Object invoke(Object obj) {
            return this.f30956a.invoke();
        }
    }

    public b() {
        this(0, 1, null);
    }

    public static final Object c(k tmp0, Object obj) {
        t.g(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    public final Object b(Object obj, Function0 block) {
        t.g(block, "block");
        ConcurrentHashMap concurrentHashMap = this.f30955a;
        final a aVar = new a(block);
        return concurrentHashMap.computeIfAbsent(obj, new Function() { // from class: o6.a
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return b.c(aVar, obj2);
            }
        });
    }

    @Override // java.util.Map
    public void clear() {
        this.f30955a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f30955a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f30955a.containsValue(obj);
    }

    public Set d() {
        Set setEntrySet = this.f30955a.entrySet();
        t.f(setEntrySet, "delegate.entries");
        return setEntrySet;
    }

    public Set e() {
        Set setKeySet = this.f30955a.keySet();
        t.f(setKeySet, "delegate.keys");
        return setKeySet;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof Map) {
            return t.c(obj, this.f30955a);
        }
        return false;
    }

    public int f() {
        return this.f30955a.size();
    }

    public Collection g() {
        Collection collectionValues = this.f30955a.values();
        t.f(collectionValues, "delegate.values");
        return collectionValues;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f30955a.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f30955a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f30955a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f30955a.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        t.g(from, "from");
        this.f30955a.putAll(from);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f30955a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }

    public b(int i8) {
        this.f30955a = new ConcurrentHashMap(i8);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f30955a.remove(obj, obj2);
    }

    public String toString() {
        return SVzBK.OLVM + this.f30955a;
    }

    public /* synthetic */ b(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 32 : i8);
    }
}
