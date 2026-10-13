package M2;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements L2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0183a f5118b = new C0183a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L2.a f5119a;

    /* JADX INFO: renamed from: M2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0183a {
        public /* synthetic */ C0183a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final L2.a a(WindowLayoutComponent component, I2.d adapter) {
            t.g(component, "component");
            t.g(adapter, "adapter");
            int iA = I2.e.f3742a.a();
            if (iA >= 2) {
                return new e(component);
            }
            return iA == 1 ? new d(component, adapter) : new c();
        }

        public C0183a() {
        }
    }

    public a(L2.a backend) {
        t.g(backend, "backend");
        this.f5119a = backend;
    }

    @Override // L2.a
    public void a(T1.a callback) {
        t.g(callback, "callback");
        this.f5119a.a(callback);
    }

    @Override // L2.a
    public void b(Context context, Executor executor, T1.a callback) {
        t.g(context, "context");
        t.g(executor, "executor");
        t.g(callback, "callback");
        this.f5119a.b(context, executor, callback);
    }
}
