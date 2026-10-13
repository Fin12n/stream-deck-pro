package p169t2;

import G6.g;
import kotlin.jvm.internal.t;
import p017b7.B0;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f34122a;

    public a(g coroutineContext) {
        t.g(coroutineContext, "coroutineContext");
        this.f34122a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        B0.e(getCoroutineContext(), null, 1, null);
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f34122a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(J coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        t.g(coroutineScope, "coroutineScope");
    }
}
