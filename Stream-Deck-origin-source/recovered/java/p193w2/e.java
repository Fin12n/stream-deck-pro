package p193w2;

import A2.h;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.c f36795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f36796b;

    public e(h.c delegate, c autoCloser) {
        t.g(delegate, "delegate");
        t.g(autoCloser, "autoCloser");
        this.f36795a = delegate;
        this.f36796b = autoCloser;
    }

    @Override // A2.h.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(h.b configuration) {
        t.g(configuration, "configuration");
        return new d(this.f36795a.a(configuration), this.f36796b);
    }
}
