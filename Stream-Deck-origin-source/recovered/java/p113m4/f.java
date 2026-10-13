package p113m4;

import B6.a;
import p077i4.b;
import p077i4.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30063a;

    public f(a aVar) {
        this.f30063a = aVar;
    }

    public static p122n4.f a(p147q4.a aVar) {
        return (p122n4.f) e.c(e.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static f b(a aVar) {
        return new f(aVar);
    }

    @Override // B6.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p122n4.f get() {
        return a((p147q4.a) this.f30063a.get());
    }
}
