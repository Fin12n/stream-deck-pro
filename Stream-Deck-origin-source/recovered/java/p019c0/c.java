package p019c0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16029a;

    public c() {
        this(0, 0.0f, 3, null);
    }

    public final Object a(Object key) {
        t.g(key, "key");
        return this.f16029a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f16029a.entrySet();
        t.f(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f16029a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        t.g(key, "key");
        t.g(value, "value");
        return this.f16029a.put(key, value);
    }

    public final Object e(Object key) {
        t.g(key, "key");
        return this.f16029a.remove(key);
    }

    public c(int i8, float f8) {
        this.f16029a = new LinkedHashMap(i8, f8, true);
    }

    public /* synthetic */ c(int i8, float f8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 16 : i8, (i9 & 2) != 0 ? 0.75f : f8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(c original) {
        this(0, 0.0f, 3, null);
        t.g(original, "original");
        for (Map.Entry entry : original.b()) {
            d(entry.getKey(), entry.getValue());
        }
    }
}
