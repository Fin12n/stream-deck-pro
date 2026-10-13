package E0;

import D6.AbstractC0928h;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0928h implements C0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f2014b;

    public p(d dVar) {
        this.f2014b = dVar;
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f2014b.size();
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f2014b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new q(this.f2014b.o());
    }
}
