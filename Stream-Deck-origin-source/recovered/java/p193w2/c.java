package p193w2;

import A2.g;
import A2.h;
import C6.G;
import Q6.k;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f36762m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f36763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f36764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f36765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f36768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f36770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f36771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f36773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f36774l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public c(long j8, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        t.g(autoCloseTimeUnit, "autoCloseTimeUnit");
        t.g(autoCloseExecutor, "autoCloseExecutor");
        this.f36764b = new Handler(Looper.getMainLooper());
        this.f36766d = new Object();
        this.f36767e = autoCloseTimeUnit.toMillis(j8);
        this.f36768f = autoCloseExecutor;
        this.f36770h = SystemClock.uptimeMillis();
        this.f36773k = new Runnable() { // from class: w2.a
            @Override // java.lang.Runnable
            public final void run() {
                c.f(this.f36760a);
            }
        };
        this.f36774l = new Runnable() { // from class: w2.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f36761a);
            }
        };
    }

    public static final void c(c this$0) {
        G g8;
        t.g(this$0, "this$0");
        synchronized (this$0.f36766d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f36770h < this$0.f36767e) {
                    return;
                }
                if (this$0.f36769g != 0) {
                    return;
                }
                Runnable runnable = this$0.f36765c;
                if (runnable != null) {
                    runnable.run();
                    g8 = G.f1419a;
                } else {
                    g8 = null;
                }
                if (g8 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                g gVar = this$0.f36771i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f36771i = null;
                G g9 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(c this$0) {
        t.g(this$0, "this$0");
        this$0.f36768f.execute(this$0.f36774l);
    }

    public final void d() {
        synchronized (this.f36766d) {
            try {
                this.f36772j = true;
                g gVar = this.f36771i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f36771i = null;
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f36766d) {
            try {
                int i8 = this.f36769g;
                if (i8 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i9 = i8 - 1;
                this.f36769g = i9;
                if (i9 == 0) {
                    if (this.f36771i == null) {
                        return;
                    } else {
                        this.f36764b.postDelayed(this.f36773k, this.f36767e);
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(k block) {
        t.g(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final g h() {
        return this.f36771i;
    }

    public final h i() {
        h hVar = this.f36763a;
        if (hVar != null) {
            return hVar;
        }
        t.t("delegateOpenHelper");
        return null;
    }

    public final g j() {
        synchronized (this.f36766d) {
            this.f36764b.removeCallbacks(this.f36773k);
            this.f36769g++;
            if (this.f36772j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            g gVar = this.f36771i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            g gVarM0 = i().M0();
            this.f36771i = gVarM0;
            return gVarM0;
        }
    }

    public final void k(h delegateOpenHelper) {
        t.g(delegateOpenHelper, "delegateOpenHelper");
        m(delegateOpenHelper);
    }

    public final void l(Runnable onAutoClose) {
        t.g(onAutoClose, "onAutoClose");
        this.f36765c = onAutoClose;
    }

    public final void m(h hVar) {
        t.g(hVar, "<set-?>");
        this.f36763a = hVar;
    }
}
