package F0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2332c;

    public c(Object obj, Map<Object, a> map) {
        this.f2330a = obj;
        this.f2331b = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2332c < this.f2331b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        b();
        Object obj = this.f2330a;
        this.f2332c++;
        Object obj2 = this.f2331b.get(obj);
        if (obj2 != null) {
            this.f2330a = ((a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
