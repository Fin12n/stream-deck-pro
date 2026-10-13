package C0;

import Q6.k;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface e extends c, b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a extends List, Collection, R6.b, R6.d {
        e build();
    }

    @Override // java.util.List
    e add(int i8, Object obj);

    @Override // java.util.List, java.util.Collection
    e add(Object obj);

    @Override // java.util.List, java.util.Collection
    e addAll(Collection collection);

    a builder();

    e i(k kVar);

    e q(int i8);

    @Override // java.util.List, java.util.Collection
    e remove(Object obj);

    @Override // java.util.List, java.util.Collection
    e removeAll(Collection collection);

    @Override // java.util.List
    e set(int i8, Object obj);
}
