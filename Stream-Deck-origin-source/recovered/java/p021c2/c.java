package p021c2;

import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16053a = new ArrayList();

    public final void a(b listener) {
        t.g(listener, "listener");
        this.f16053a.add(listener);
    }

    public final void b(b listener) {
        t.g(listener, "listener");
        this.f16053a.remove(listener);
    }
}
