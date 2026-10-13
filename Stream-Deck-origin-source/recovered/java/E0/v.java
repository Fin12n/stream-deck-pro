package E0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v extends u {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        G0.a.a(f());
        m(e() + 2);
        return new b(d()[e() - 2], d()[e() - 1]);
    }
}
