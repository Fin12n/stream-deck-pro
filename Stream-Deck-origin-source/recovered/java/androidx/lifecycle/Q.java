package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15268a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f15268a.values().iterator();
        while (it.hasNext()) {
            ((O) it.next()).b();
        }
        this.f15268a.clear();
    }

    public final O b(String key) {
        kotlin.jvm.internal.t.g(key, "key");
        return (O) this.f15268a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f15268a.keySet());
    }

    public final void d(String key, O viewModel) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(viewModel, "viewModel");
        O o8 = (O) this.f15268a.put(key, viewModel);
        if (o8 != null) {
            o8.b();
        }
    }
}
