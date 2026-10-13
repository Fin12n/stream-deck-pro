package Y6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q6.k f12521c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f12522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12523b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12524c;

        public a() {
            this.f12522a = e.this.f12519a.iterator();
        }

        public final void b() {
            while (this.f12522a.hasNext()) {
                Object next = this.f12522a.next();
                if (((Boolean) e.this.f12521c.invoke(next)).booleanValue() == e.this.f12520b) {
                    this.f12524c = next;
                    this.f12523b = 1;
                    return;
                }
            }
            this.f12523b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12523b == -1) {
                b();
            }
            return this.f12523b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f12523b == -1) {
                b();
            }
            if (this.f12523b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f12524c;
            this.f12524c = null;
            this.f12523b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g sequence, boolean z8, Q6.k predicate) {
        t.g(sequence, "sequence");
        t.g(predicate, "predicate");
        this.f12519a = sequence;
        this.f12520b = z8;
        this.f12521c = predicate;
    }

    @Override // Y6.g
    public Iterator iterator() {
        return new a();
    }

    public /* synthetic */ e(g gVar, boolean z8, Q6.k kVar, int i8, AbstractC2633k abstractC2633k) {
        this(gVar, (i8 & 2) != 0 ? true : z8, kVar);
    }
}
