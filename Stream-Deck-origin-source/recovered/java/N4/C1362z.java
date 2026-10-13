package N4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: N4.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1362z implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f7396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f7397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f7398c;

    public C1362z(A a8) {
        this.f7398c = a8;
        this.f7396a = a8.f6203c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7396a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f7396a.next();
        this.f7397b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new C1135f0(key, this.f7398c.f6204d.h(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1296t.e(this.f7397b != null, "no calls to next() since the last call to remove()");
        this.f7396a.remove();
        this.f7398c.f6204d.f6312d -= this.f7397b.size();
        this.f7397b.clear();
        this.f7397b = null;
    }
}
