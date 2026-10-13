package N4;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G extends E implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f6277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h8) {
        super(h8);
        this.f6277d = h8;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f6277d.isEmpty();
        b();
        ((ListIterator) this.f6249a).add(obj);
        this.f6277d.f6288f.f6312d++;
        if (zIsEmpty) {
            this.f6277d.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f6249a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f6249a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.f6249a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f6249a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f6249a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h8, int i8) {
        super(h8, ((List) h8.f6269b).listIterator(i8));
        this.f6277d = h8;
    }
}
