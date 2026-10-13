package N4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map.Entry f6222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f6223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f6224c;

    public B(C c8, Iterator it) {
        this.f6223b = it;
        this.f6224c = c8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6223b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f6223b.next();
        this.f6222a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1296t.e(this.f6222a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f6222a.getValue();
        this.f6223b.remove();
        this.f6224c.f6234b.f6312d -= collection.size();
        collection.clear();
        this.f6222a = null;
    }
}
