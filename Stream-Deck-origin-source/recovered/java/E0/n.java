package E0;

import D6.AbstractC0928h;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0928h implements C0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f2013b;

    public n(d dVar) {
        this.f2013b = dVar;
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f2013b.size();
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return o((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new o(this.f2013b.o());
    }

    public boolean o(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f2013b.get(entry.getKey());
        if (obj != null) {
            return kotlin.jvm.internal.t.c(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f2013b.containsKey(entry.getKey());
    }
}
