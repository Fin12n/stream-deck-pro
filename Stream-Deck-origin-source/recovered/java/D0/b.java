package D0;

import D6.AbstractC0922b;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractC0922b implements C0.e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f1686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Collection collection) {
            super(1);
            this.f1686a = collection;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f1686a.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, C0.e
    public C0.e addAll(Collection collection) {
        C0.e.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // D6.AbstractC0922b, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // D6.AbstractC0922b, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, C0.e
    public C0.e remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? q(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, C0.e
    public C0.e removeAll(Collection collection) {
        return i(new a(collection));
    }

    @Override // D6.AbstractC0922b, java.util.List, C0.c
    public C0.c subList(int i8, int i9) {
        return super.subList(i8, i9);
    }
}
