package E0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2009a;

    public h(f fVar) {
        this.f2009a = fVar;
    }

    @Override // E0.a
    public boolean A(Map.Entry entry) {
        return this.f2009a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // D6.AbstractC0927g
    public int c() {
        return this.f2009a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f2009a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i(this.f2009a);
    }

    @Override // E0.a
    public boolean t(Map.Entry entry) {
        Object obj = this.f2009a.get(entry.getKey());
        if (obj != null) {
            return kotlin.jvm.internal.t.c(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f2009a.containsKey(entry.getKey());
    }
}
