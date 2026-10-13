package p065h1;

import Y6.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24148a = new ArrayList();

    public final void b(String str, Object obj) {
        this.f24148a.add(new N0(str, obj));
    }

    @Override // Y6.g
    public Iterator iterator() {
        return this.f24148a.iterator();
    }
}
