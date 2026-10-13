package p140p5;

import M4.HandlerC1047a;
import S4.k;
import S4.l;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p105l5.a;

/* JADX INFO: renamed from: p5.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2797g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f31254b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2797g f31255c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f31256a;

    public C2797g(Looper looper) {
        this.f31256a = new HandlerC1047a(looper);
    }

    public static C2797g a() {
        C2797g c2797g;
        synchronized (f31254b) {
            try {
                if (f31255c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f31255c = new C2797g(handlerThread.getLooper());
                }
                c2797g = f31255c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2797g;
    }

    public static Executor d() {
        return t.f31305a;
    }

    public k b(final Callable callable) {
        final l lVar = new l();
        c(new Runnable() { // from class: p5.s
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                l lVar2 = lVar;
                try {
                    lVar2.c(callable2.call());
                } catch (a e8) {
                    lVar2.b(e8);
                } catch (Exception e9) {
                    lVar2.b(new a("Internal error has occurred when executing ML Kit tasks", 13, e9));
                }
            }
        });
        return lVar.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
