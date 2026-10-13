package p065h1;

import F6.a;
import java.util.Comparator;
import p110m1.o;

/* JADX INFO: renamed from: h1.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2421w implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f24364a;

    public C2421w(Comparator comparator) {
        this.f24364a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f24364a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : a.a(Integer.valueOf(((o) obj).n()), Integer.valueOf(((o) obj2).n()));
    }
}
