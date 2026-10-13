package p140p5;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: p5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2791a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f31248a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f31249b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: p5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface InterfaceC0670a {
        void a();
    }

    public static C2791a a() {
        C2791a c2791a = new C2791a();
        c2791a.b(c2791a, new Runnable() { // from class: p5.o
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c2791a.f31248a;
        final Set set = c2791a.f31249b;
        Thread thread = new Thread(new Runnable() { // from class: p5.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((r) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c2791a;
    }

    public InterfaceC0670a b(Object obj, Runnable runnable) {
        r rVar = new r(obj, this.f31248a, this.f31249b, runnable, null);
        this.f31249b.add(rVar);
        return rVar;
    }
}
