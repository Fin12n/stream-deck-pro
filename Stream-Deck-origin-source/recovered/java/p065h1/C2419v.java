package p065h1;

import java.util.Comparator;
import p110m1.o;

/* JADX INFO: renamed from: h1.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2419v implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f24343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f24344b;

    public C2419v(Comparator comparator, Comparator comparator2) {
        this.f24343a = comparator;
        this.f24344b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f24343a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : this.f24344b.compare(((o) obj).p(), ((o) obj2).p());
    }
}
