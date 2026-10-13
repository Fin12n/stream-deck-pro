package H5;

import X5.C1688q;
import X5.InterfaceC1684m;
import Z6.o;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3562a;

    public c(U5.c response, X6.d from, X6.d to) {
        t.g(response, "response");
        t.g(from, "from");
        t.g(to, "to");
        StringBuilder sb = new StringBuilder();
        sb.append("\n        Expected response body of the type '");
        sb.append(to);
        sb.append("' but was '");
        sb.append(from);
        sb.append("'\n        In response from `");
        sb.append(U5.e.d(response).o());
        sb.append("`\n        Response status `");
        sb.append(response.g());
        sb.append("`\n        Response header `ContentType: ");
        InterfaceC1684m interfaceC1684mA = response.a();
        C1688q c1688q = C1688q.f11910a;
        sb.append(interfaceC1684mA.d(c1688q.j()));
        sb.append("` \n        Request header `Accept: ");
        sb.append(U5.e.d(response).a().d(c1688q.c()));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f3562a = o.f(sb.toString());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f3562a;
    }
}
