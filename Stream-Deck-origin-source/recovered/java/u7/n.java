package u7;

import java.util.List;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34791a = a.f34793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f34792b = new a.C0786a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f34793a = new a();

        /* JADX INFO: renamed from: u7.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0786a implements n {
            @Override // u7.n
            public List a(u url) {
                kotlin.jvm.internal.t.g(url, "url");
                return D6.r.n();
            }

            @Override // u7.n
            public void b(u uVar, List cookies) {
                kotlin.jvm.internal.t.g(uVar, RaiWHuj.FmEDmpNQiyiiYcS);
                kotlin.jvm.internal.t.g(cookies, "cookies");
            }
        }
    }

    List a(u uVar);

    void b(u uVar, List list);
}
