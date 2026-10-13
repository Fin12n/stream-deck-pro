package N4;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: N4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1351y extends AbstractC1265q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f7382a;

    public C1351y(A a8) {
        this.f7382a = a8;
    }

    @Override // N4.AbstractC1265q0
    public final Map c() {
        return this.f7382a;
    }

    @Override // N4.AbstractC1265q0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f7382a.f6203c.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1362z(this.f7382a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        A a8 = this.f7382a;
        I.o(a8.f6204d, entry.getKey());
        return true;
    }
}
