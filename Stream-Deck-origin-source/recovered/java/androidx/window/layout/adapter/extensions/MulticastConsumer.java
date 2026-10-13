package androidx.window.layout.adapter.extensions;

import C6.G;
import K2.j;
import M2.f;
import T1.a;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class MulticastConsumer implements a, Consumer<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f15421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f15422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f15423d;

    public MulticastConsumer(Context context) {
        t.g(context, "context");
        this.f15420a = context;
        this.f15421b = new ReentrantLock();
        this.f15423d = new LinkedHashSet();
    }

    public final void a(a listener) {
        t.g(listener, "listener");
        ReentrantLock reentrantLock = this.f15421b;
        reentrantLock.lock();
        try {
            j jVar = this.f15422c;
            if (jVar != null) {
                listener.accept(jVar);
            }
            this.f15423d.add(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b() {
        return this.f15423d.isEmpty();
    }

    public final void c(a listener) {
        t.g(listener, "listener");
        ReentrantLock reentrantLock = this.f15421b;
        reentrantLock.lock();
        try {
            this.f15423d.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // T1.a
    public void accept(WindowLayoutInfo value) {
        t.g(value, "value");
        ReentrantLock reentrantLock = this.f15421b;
        reentrantLock.lock();
        try {
            j jVarC = f.f5131a.c(this.f15420a, value);
            this.f15422c = jVarC;
            Iterator it = this.f15423d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(jVarC);
            }
            G g8 = G.f1419a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
