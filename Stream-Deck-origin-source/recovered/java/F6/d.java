package F6;

import java.util.Comparator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2425a = new d();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a8, Comparable b8) {
        t.g(a8, "a");
        t.g(b8, "b");
        return b8.compareTo(a8);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return c.f2424a;
    }
}
