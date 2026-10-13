package L3;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G5.a f5014a;

        public a(G5.a aVar) {
            this.f5014a = aVar;
        }

        @Override // L3.c
        public final Object a(G6.d dVar) {
            return d.b(this.f5014a, dVar);
        }
    }

    public static final c a(G5.a client) {
        t.g(client, "client");
        return new a(client);
    }
}
