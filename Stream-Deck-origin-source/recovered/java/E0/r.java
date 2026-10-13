package E0;

import D6.AbstractC0921a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0921a implements C0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2015a;

    public r(d dVar) {
        this.f2015a = dVar;
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f2015a.size();
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f2015a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new s(this.f2015a.o());
    }
}
