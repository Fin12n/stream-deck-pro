package z7;

import C6.C0918g;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOException f39360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f39361b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException firstConnectException) {
        super(firstConnectException);
        t.g(firstConnectException, "firstConnectException");
        this.f39360a = firstConnectException;
        this.f39361b = firstConnectException;
    }

    public final void a(IOException e8) throws IllegalAccessException, InvocationTargetException {
        t.g(e8, "e");
        C0918g.a(this.f39360a, e8);
        this.f39361b = e8;
    }

    public final IOException b() {
        return this.f39360a;
    }

    public final IOException c() {
        return this.f39361b;
    }
}
