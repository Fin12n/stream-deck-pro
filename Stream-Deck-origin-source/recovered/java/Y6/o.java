package Y6;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q6.k f12542b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f12543a;

        public a() {
            this.f12543a = o.this.f12541a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12543a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return o.this.f12542b.invoke(this.f12543a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(g sequence, Q6.k transformer) {
        t.g(sequence, "sequence");
        t.g(transformer, "transformer");
        this.f12541a = sequence;
        this.f12542b = transformer;
    }

    @Override // Y6.g
    public Iterator iterator() {
        return new a();
    }
}
