package K2;

import android.content.Context;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4600a = a.f4601a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f4601a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Q6.k f4602b = C0167a.f4603a;

        /* JADX INFO: renamed from: K2.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0167a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0167a f4603a = new C0167a();

            public C0167a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l invoke(l it) {
                t.g(it, "it");
                return it;
            }
        }

        public final l a() {
            return (l) f4602b.invoke(m.f4604b);
        }
    }

    k a(Context context);
}
