package p088j6;

import C6.G;
import Q6.k;
import X5.C1674c;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: j6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0615a {

        /* JADX INFO: renamed from: j6.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0616a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0616a f28320a = new C0616a();

            public C0616a() {
                super(1);
            }

            public final void b(c cVar) {
                t.g(cVar, "$this$null");
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((c) obj);
                return G.f1419a;
            }
        }

        public static /* synthetic */ void a(a aVar, C1674c c1674c, c cVar, k kVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i8 & 4) != 0) {
                kVar = C0616a.f28320a;
            }
            aVar.a(c1674c, cVar, kVar);
        }
    }

    void a(C1674c c1674c, c cVar, k kVar);
}
