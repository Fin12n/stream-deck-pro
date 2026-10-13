package D6;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f1928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1929b;

    public H(Iterator<Object> iterator) {
        kotlin.jvm.internal.t.g(iterator, "iterator");
        this.f1928a = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final F next() {
        int i8 = this.f1929b;
        this.f1929b = i8 + 1;
        if (i8 < 0) {
            r.x();
        }
        return new F(i8, this.f1928a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1928a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
