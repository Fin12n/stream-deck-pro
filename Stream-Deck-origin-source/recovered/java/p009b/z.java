package p009b;

import C6.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f15555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f15556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f15561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f15562h;

    public z(Executor executor, Function0 reportFullyDrawn) {
        t.g(executor, "executor");
        t.g(reportFullyDrawn, "reportFullyDrawn");
        this.f15555a = executor;
        this.f15556b = reportFullyDrawn;
        this.f15557c = new Object();
        this.f15561g = new ArrayList();
        this.f15562h = new Runnable() { // from class: b.y
            @Override // java.lang.Runnable
            public final void run() {
                z.d(this.f15554a);
            }
        };
    }

    public static final void d(z this$0) {
        t.g(this$0, "this$0");
        synchronized (this$0.f15557c) {
            try {
                this$0.f15559e = false;
                if (this$0.f15558d == 0 && !this$0.f15560f) {
                    this$0.f15556b.invoke();
                    this$0.b();
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f15557c) {
            try {
                this.f15560f = true;
                Iterator it = this.f15561g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f15561g.clear();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z8;
        synchronized (this.f15557c) {
            z8 = this.f15560f;
        }
        return z8;
    }
}
