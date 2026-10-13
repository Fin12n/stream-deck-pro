package J0;

import java.util.Set;
import kotlin.jvm.internal.AbstractC2632j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class s implements Set, R6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f4018a;

    public s(x xVar) {
        this.f4018a = xVar;
    }

    public final x c() {
        return this.f4018a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f4018a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f4018a.isEmpty();
    }

    public int m() {
        return this.f4018a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC2632j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC2632j.b(this, objArr);
    }
}
