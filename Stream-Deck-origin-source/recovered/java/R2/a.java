package R2;

import R6.e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Map, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9486b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap f9487a = new ConcurrentHashMap();

    public Set a() {
        Set setEntrySet = this.f9487a.entrySet();
        t.f(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public Set b() {
        Set setKeySet = this.f9487a.keySet();
        t.f(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    public int c() {
        return this.f9487a.size();
    }

    @Override // java.util.Map
    public void clear() {
        this.f9487a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f9487a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f9487a.containsValue(obj);
    }

    public Collection d() {
        Collection collectionValues = this.f9487a.values();
        t.f(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f9487a.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f9487a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f9487a.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        t.g(from, "from");
        this.f9487a.putAll(from);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f9487a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
