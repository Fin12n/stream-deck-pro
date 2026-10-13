package M2;

import C6.G;
import D6.r;
import Q6.k;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements L2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f5121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I2.d f5122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f5123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f5124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f5125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f5126f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements k {
        public a(Object obj) {
            super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((WindowLayoutInfo) obj);
            return G.f1419a;
        }

        public final void h(WindowLayoutInfo windowLayoutInfo) {
            t.g(windowLayoutInfo, ajyWhveMDgQ.ftucPFXcTuS);
            ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
        }
    }

    public d(WindowLayoutComponent component, I2.d consumerAdapter) {
        t.g(component, "component");
        t.g(consumerAdapter, "consumerAdapter");
        this.f5121a = component;
        this.f5122b = consumerAdapter;
        this.f5123c = new ReentrantLock();
        this.f5124d = new LinkedHashMap();
        this.f5125e = new LinkedHashMap();
        this.f5126f = new LinkedHashMap();
    }

    @Override // L2.a
    public void a(T1.a callback) {
        t.g(callback, "callback");
        ReentrantLock reentrantLock = this.f5123c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f5125e.get(callback);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f5124d.get(context);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.c(callback);
            this.f5125e.remove(callback);
            if (multicastConsumer.b()) {
                this.f5124d.remove(context);
                I2.d.b bVar = (I2.d.b) this.f5126f.remove(multicastConsumer);
                if (bVar != null) {
                    bVar.d();
                }
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
        ReentrantLock reentrantLock = this.f5123c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f5124d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(callback);
                this.f5125e.put(callback, context);
                g8 = G.f1419a;
            } else {
                g8 = null;
            }
            if (g8 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f5124d.put(context, multicastConsumer2);
                this.f5125e.put(callback, context);
                multicastConsumer2.a(callback);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(r.n()));
                    return;
                } else {
                    this.f5126f.put(multicastConsumer2, this.f5122b.c(this.f5121a, K.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(multicastConsumer2)));
                }
            }
            G g9 = G.f1419a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
