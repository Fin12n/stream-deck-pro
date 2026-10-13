package E0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2010a;

    public i(f fVar) {
        u[] uVarArr = new u[8];
        for (int i8 = 0; i8 < 8; i8++) {
            uVarArr[i8] = new y(this);
        }
        this.f2010a = new g(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.f2010a.next();
    }

    public final void c(Object obj, Object obj2) {
        this.f2010a.l(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2010a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f2010a.remove();
    }
}
