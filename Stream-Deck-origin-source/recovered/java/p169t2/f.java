package p169t2;

import C6.G;
import D6.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import p017b7.J;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f34126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f34127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f34128d;

    public f() {
        this.f34125a = new e();
        this.f34126b = new LinkedHashMap();
        this.f34127c = new LinkedHashSet();
    }

    public final void d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        t.g(key, "key");
        t.g(closeable, "closeable");
        if (this.f34128d) {
            f(closeable);
            return;
        }
        synchronized (this.f34125a) {
            autoCloseable = (AutoCloseable) this.f34126b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f34128d) {
            return;
        }
        this.f34128d = true;
        synchronized (this.f34125a) {
            try {
                Iterator it = this.f34126b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f34127c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f34127c.clear();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                p158s.f.a(autoCloseable);
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        t.g(key, "key");
        synchronized (this.f34125a) {
            autoCloseable = (AutoCloseable) this.f34126b.get(key);
        }
        return autoCloseable;
    }

    public f(J viewModelScope) {
        t.g(viewModelScope, "viewModelScope");
        this.f34125a = new e();
        this.f34126b = new LinkedHashMap();
        this.f34127c = new LinkedHashSet();
        d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(viewModelScope));
    }

    public f(AutoCloseable... closeables) {
        t.g(closeables, "closeables");
        this.f34125a = new e();
        this.f34126b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f34127c = linkedHashSet;
        w.F(linkedHashSet, closeables);
    }

    public f(J viewModelScope, AutoCloseable... closeables) {
        t.g(viewModelScope, "viewModelScope");
        t.g(closeables, "closeables");
        this.f34125a = new e();
        this.f34126b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f34127c = linkedHashSet;
        d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(viewModelScope));
        w.F(linkedHashSet, closeables);
    }
}
