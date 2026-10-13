package O5;

import X5.T;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0241a f8688a = C0241a.f8689a;

    /* JADX INFO: renamed from: O5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0241a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0241a f8689a = new C0241a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Function0 f8690b = C0242a.f8692a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f8691c = e.f8725b;

        /* JADX INFO: renamed from: O5.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0242a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0242a f8692a = new C0242a();

            public C0242a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k invoke() {
                return new k();
            }
        }

        public final Function0 a() {
            return f8690b;
        }
    }

    Object a(T t8, Map map, G6.d dVar);

    Object b(T t8, G6.d dVar);

    Object c(T t8, b bVar, G6.d dVar);
}
