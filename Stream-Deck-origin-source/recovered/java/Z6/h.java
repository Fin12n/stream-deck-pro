package Z6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static b a(h hVar) {
            return new b(hVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f12959a;

        public b(h match) {
            kotlin.jvm.internal.t.g(match, "match");
            this.f12959a = match;
        }

        public final h a() {
            return this.f12959a;
        }
    }

    b a();

    List b();

    W6.i c();

    String getValue();

    h next();
}
