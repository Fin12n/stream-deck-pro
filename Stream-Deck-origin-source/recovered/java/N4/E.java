package N4;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class E implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f6249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f6250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f6251c;

    public E(F f8, Iterator it) {
        this.f6251c = f8;
        this.f6250b = f8.f6269b;
        this.f6249a = it;
    }

    public final void b() {
        this.f6251c.zzb();
        if (this.f6251c.f6269b != this.f6250b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.f6249a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        return this.f6249a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6249a.remove();
        this.f6251c.f6272e.f6312d--;
        this.f6251c.m();
    }

    public E(F f8) {
        this.f6251c = f8;
        Collection collection = f8.f6269b;
        this.f6250b = collection;
        this.f6249a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
