package Y6;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements g, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12515b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f12516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12517b;

        public a(b bVar) {
            this.f12516a = bVar.f12514a.iterator();
            this.f12517b = bVar.f12515b;
        }

        public final void b() {
            while (this.f12517b > 0 && this.f12516a.hasNext()) {
                this.f12516a.next();
                this.f12517b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f12516a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            return this.f12516a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(g sequence, int i8) {
        t.g(sequence, "sequence");
        this.f12514a = sequence;
        this.f12515b = i8;
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + com.amazon.a.a.o.c.a.b.f16789a).toString());
    }

    @Override // Y6.c
    public g a(int i8) {
        int i9 = this.f12515b + i8;
        return i9 < 0 ? new b(this, i8) : new b(this.f12514a, i9);
    }

    @Override // Y6.g
    public Iterator iterator() {
        return new a(this);
    }
}
