package N4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: N4.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1297t0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f7321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Collection f7322b;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f7321a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f7321a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f7322b;
        if (collection != null) {
            return collection;
        }
        C1286s0 c1286s0 = new C1286s0(this);
        this.f7322b = c1286s0;
        return c1286s0;
    }
}
