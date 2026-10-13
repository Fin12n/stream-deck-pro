package p215z0;

import D6.r;
import K0.b;
import R6.a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements b, Iterable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f38889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f38890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterable f38892d = r.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterable f38893e = this;

    public o1(T0 t8, P p8) {
        this.f38889a = t8;
        this.f38890b = p8;
        this.f38891c = Integer.valueOf(p8.d());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new n1(this.f38889a, this.f38890b);
    }
}
