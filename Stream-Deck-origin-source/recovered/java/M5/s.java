package M5;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends IOException {
    public s(String url, Long l8) {
        kotlin.jvm.internal.t.g(url, "url");
        StringBuilder sb = new StringBuilder();
        sb.append("Request timeout has expired [url=");
        sb.append(url);
        sb.append(", request_timeout=");
        sb.append(l8 == null ? "unknown" : l8);
        sb.append(" ms]");
        super(sb.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(T5.d request) {
        kotlin.jvm.internal.t.g(request, "request");
        String strC = request.i().c();
        u.a aVar = (u.a) request.f(u.f5752d);
        this(strC, aVar != null ? aVar.d() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(T5.e request) {
        kotlin.jvm.internal.t.g(request, "request");
        String string = request.h().toString();
        u.a aVar = (u.a) request.c(u.f5752d);
        this(string, aVar != null ? aVar.d() : null);
    }
}
