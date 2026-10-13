package p027d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f19597a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Context f19598b;

    public final void a(b listener) {
        t.g(listener, "listener");
        Context context = this.f19598b;
        if (context != null) {
            listener.a(context);
        }
        this.f19597a.add(listener);
    }

    public final void b() {
        this.f19598b = null;
    }

    public final void c(Context context) {
        t.g(context, "context");
        this.f19598b = context;
        Iterator it = this.f19597a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
