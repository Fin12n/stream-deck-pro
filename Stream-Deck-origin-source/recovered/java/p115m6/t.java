package p115m6;

import R6.e;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Map.Entry, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f30094b;

    public t(Object obj, Object obj2) {
        this.f30093a = obj;
        this.f30094b = obj2;
    }

    public void a(Object obj) {
        this.f30094b = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.t.c(entry.getKey(), getKey()) && kotlin.jvm.internal.t.c(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f30093a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f30094b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        kotlin.jvm.internal.t.d(key);
        int iHashCode = key.hashCode() + 527;
        Object value = getValue();
        kotlin.jvm.internal.t.d(value);
        return iHashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        a(obj);
        return getValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
