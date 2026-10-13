package u7;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f34794a = new o();

    public static final String a(String username, String password, Charset charset) {
        kotlin.jvm.internal.t.g(username, "username");
        kotlin.jvm.internal.t.g(password, "password");
        kotlin.jvm.internal.t.g(charset, "charset");
        return "Basic " + J7.h.f4388d.c(username + ':' + password, charset).a();
    }
}
