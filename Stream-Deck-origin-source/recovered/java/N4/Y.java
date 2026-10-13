package N4;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f6638a;

    public Y(Z z8) {
        this.f6638a = z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f6638a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Z z8 = this.f6638a;
        Map mapP = z8.p();
        return mapP != null ? mapP.values().iterator() : new S(z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f6638a.size();
    }
}
