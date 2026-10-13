package t7;

import Q6.k;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: t7.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0777a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p116m7.b f34310a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0777a(p116m7.b bVar) {
                super(1);
                this.f34310a = bVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p116m7.b invoke(List it) {
                t.g(it, "it");
                return this.f34310a;
            }
        }

        public static void a(e eVar, X6.d kClass, p116m7.b serializer) {
            t.g(kClass, "kClass");
            t.g(serializer, "serializer");
            eVar.a(kClass, new C0777a(serializer));
        }
    }

    void a(X6.d dVar, k kVar);

    void b(X6.d dVar, X6.d dVar2, p116m7.b bVar);

    void c(X6.d dVar, k kVar);

    void d(X6.d dVar, k kVar);

    void e(X6.d dVar, p116m7.b bVar);
}
