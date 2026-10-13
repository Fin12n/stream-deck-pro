package N4;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f6278a;

    public G0(Iterator it) {
        it.getClass();
        this.f6278a = it;
    }

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6278a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.f6278a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6278a.remove();
    }
}
