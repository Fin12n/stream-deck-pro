package p059g4;

import java.util.concurrent.Executor;
import p077i4.b;
import p077i4.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f23756a = new g();
    }

    public static g a() {
        return a.f23756a;
    }

    public static Executor b() {
        return (Executor) e.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // B6.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
