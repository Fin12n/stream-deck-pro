package p115m6;

import Q6.k;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f30097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(k supplier, k close, int i8) {
        super(10, 0.75f, true);
        t.g(supplier, "supplier");
        t.g(close, "close");
        this.f30096a = supplier;
        this.f30097b = close;
        this.f30098c = i8;
    }

    public /* bridge */ Set a() {
        return super.entrySet();
    }

    public /* bridge */ Set b() {
        return super.keySet();
    }

    public /* bridge */ int d() {
        return super.size();
    }

    public /* bridge */ Collection e() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (this.f30098c == 0) {
            return this.f30096a.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object objInvoke = this.f30096a.invoke(obj);
            put(obj, objInvoke);
            return objInvoke;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry eldest) {
        t.g(eldest, "eldest");
        boolean z8 = size() > this.f30098c;
        if (z8) {
            this.f30097b.invoke(eldest.getValue());
        }
        return z8;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return e();
    }
}
