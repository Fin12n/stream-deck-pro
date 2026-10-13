package p062g7;

import G6.g;
import p017b7.J;

/* JADX INFO: renamed from: g7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2368g implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f23840a;

    public C2368g(g gVar) {
        this.f23840a = gVar;
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f23840a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
