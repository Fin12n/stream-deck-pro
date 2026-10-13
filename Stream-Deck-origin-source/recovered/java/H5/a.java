package H5;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3549a;

    public a(b call) {
        t.g(call, "call");
        this.f3549a = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f3549a;
    }
}
