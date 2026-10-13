package M5;

import D6.T;
import X5.C1692v;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f5722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L7.a f5723b;

    static {
        C1692v.a aVar = C1692v.f11962b;
        f5722a = T.g(aVar.b(), aVar.c());
        f5723b = p157r6.a.a("io.ktor.client.plugins.HttpRedirect");
    }

    public static final boolean d(X5.x xVar) {
        int iO0 = xVar.o0();
        X5.x.a aVar = X5.x.f11997c;
        return iO0 == aVar.r().o0() || iO0 == aVar.j().o0() || iO0 == aVar.R().o0() || iO0 == aVar.E().o0() || iO0 == aVar.N().o0();
    }
}
