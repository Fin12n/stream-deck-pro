package p147q4;

import p077i4.b;
import p077i4.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31994a = new d();
    }

    public static d a() {
        return a.f31994a;
    }

    public static p147q4.a c() {
        return (p147q4.a) e.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // B6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p147q4.a get() {
        return c();
    }
}
