package M2;

import C6.G;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements L2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f5127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f5130d;

    public e(WindowLayoutComponent component) {
        t.g(component, "component");
        this.f5127a = component;
        this.f5128b = new ReentrantLock();
        this.f5129c = new LinkedHashMap();
        this.f5130d = new LinkedHashMap();
    }

    @Override // L2.a
    public void a(T1.a callback) {
        t.g(callback, "callback");
        ReentrantLock reentrantLock = this.f5128b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f5130d.get(callback);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f5129c.get(context);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.c(callback);
            this.f5130d.remove(callback);
            if (multicastConsumer.b()) {
                this.f5129c.remove(context);
                this.f5127a.removeWindowLayoutInfoListener(multicastConsumer);
            }
            G g8 = G.f1419a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // L2.a
    public void b(Context context, Executor executor, T1.a callback) {
        G g8;
        t.g(context, "context");
        t.g(executor, "executor");
        t.g(callback, "callback");
        ReentrantLock reentrantLock = this.f5128b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f5129c.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(callback);
                this.f5130d.put(callback, context);
                g8 = G.f1419a;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f5129c.put(context, multicastConsumer2);
                this.f5130d.put(callback, context);
                multicastConsumer2.a(callback);
                this.f5127a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            G g9 = G.f1419a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
