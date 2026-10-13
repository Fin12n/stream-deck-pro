package J0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F extends D implements Iterator, R6.a {
    public F(x xVar, Iterator<? extends Map.Entry<Object, Object>> it) {
        super(xVar, it);
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entryG = g();
        if (entryG == null) {
            throw new IllegalStateException();
        }
        d();
        return entryG.getValue();
    }
}
