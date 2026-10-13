package A7;

import java.net.Proxy;
import kotlin.jvm.internal.t;
import u7.u;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f880a = new i();

    public final String a(z request, Proxy.Type proxyType) {
        t.g(request, "request");
        t.g(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.h());
        sb.append(' ');
        i iVar = f880a;
        if (iVar.b(request, proxyType)) {
            sb.append(request.j());
        } else {
            sb.append(iVar.c(request.j()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean b(z zVar, Proxy.Type type) {
        return !zVar.g() && type == Proxy.Type.HTTP;
    }

    public final String c(u url) {
        t.g(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
