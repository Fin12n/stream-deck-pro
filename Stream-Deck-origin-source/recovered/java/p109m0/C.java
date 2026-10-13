package p109m0;

import B0.d;
import C6.G;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p038e1.i0;
import p215z0.L0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C implements L0, B.b, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f29290k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f29291l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static long f29292m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f29293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f29294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f29295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f29296d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f29298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29300h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29302j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f29297e = new d(new b[16], 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Choreographer f29301i = Choreographer.getInstance();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        public final void b(View view) {
            float refreshRate;
            if (C.f29292m == 0) {
                Display display = view.getDisplay();
                if (view.isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                C.f29292m = (long) (1000000000 / refreshRate);
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements B.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f29304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i0.a f29305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f29307e;

        public /* synthetic */ b(int i8, long j8, AbstractC2633k abstractC2633k) {
            this(i8, j8);
        }

        public final boolean a() {
            return this.f29306d;
        }

        public final long b() {
            return this.f29304b;
        }

        public final int c() {
            return this.f29303a;
        }

        @Override // m0.B.a
        public void cancel() {
            if (this.f29306d) {
                return;
            }
            this.f29306d = true;
            i0.a aVar = this.f29305c;
            if (aVar != null) {
                aVar.d();
            }
            this.f29305c = null;
        }

        public final boolean d() {
            return this.f29307e;
        }

        public final i0.a e() {
            return this.f29305c;
        }

        public final void f(i0.a aVar) {
            this.f29305c = aVar;
        }

        public b(int i8, long j8) {
            this.f29303a = i8;
            this.f29304b = j8;
        }
    }

    public C(B b8, i0 i0Var, o oVar, View view) {
        this.f29293a = b8;
        this.f29294b = i0Var;
        this.f29295c = oVar;
        this.f29296d = view;
        f29290k.b(view);
    }

    @Override // m0.B.b
    public B.a a(int i8, long j8) {
        b bVar = new b(i8, j8, null);
        this.f29297e.d(bVar);
        if (!this.f29300h) {
            this.f29300h = true;
            this.f29296d.post(this);
        }
        return bVar;
    }

    @Override // p215z0.L0
    public void c() {
        this.f29302j = false;
        this.f29293a.b(null);
        this.f29296d.removeCallbacks(this);
        this.f29301i.removeFrameCallback(this);
    }

    @Override // p215z0.L0
    public void d() {
        this.f29293a.b(this);
        this.f29302j = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        if (this.f29302j) {
            this.f29296d.post(this);
        }
    }

    public final long g(long j8, long j9) {
        if (j9 == 0) {
            return j8;
        }
        long j10 = 4;
        return ((j9 / j10) * ((long) 3)) + (j8 / j10);
    }

    public final boolean h(long j8, long j9, long j10) {
        return j8 + j10 < j9;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (this.f29297e.u() || !this.f29300h || !this.f29302j || this.f29296d.getWindowVisibility() != 0) {
            this.f29300h = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f29296d.getDrawingTime()) + f29292m;
        boolean z8 = System.nanoTime() > nanos;
        boolean z9 = false;
        while (this.f29297e.v() && !z9) {
            b bVar = (b) this.f29297e.r()[0];
            q qVar = (q) this.f29295c.d().invoke();
            if (!bVar.a()) {
                int iD = qVar.d();
                int iC = bVar.c();
                if (iC >= 0 && iC < iD) {
                    if (bVar.e() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long jNanoTime = System.nanoTime();
                            try {
                                if (h(jNanoTime, nanos, this.f29298f) || z8) {
                                    Object objA = qVar.a(bVar.c());
                                    bVar.f(this.f29294b.i(objA, this.f29295c.b(bVar.c(), objA, qVar.e(bVar.c()))));
                                    this.f29298f = g(System.nanoTime() - jNanoTime, this.f29298f);
                                    z8 = false;
                                } else {
                                    z9 = true;
                                }
                                G g8 = G.f1419a;
                                Trace.endSection();
                            } catch (Throwable th) {
                                th = th;
                                Trace.endSection();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (bVar.d()) {
                            throw new IllegalStateException("request already measured");
                        }
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long jNanoTime2 = System.nanoTime();
                            if (h(jNanoTime2, nanos, this.f29299g) || z8) {
                                i0.a aVarE = bVar.e();
                                t.d(aVarE);
                                int iA = aVarE.a();
                                for (int i8 = 0; i8 < iA; i8++) {
                                    aVarE.b(i8, bVar.b());
                                }
                                this.f29299g = g(System.nanoTime() - jNanoTime2, this.f29299g);
                                this.f29297e.D(0);
                                z8 = false;
                            } else {
                                G g9 = G.f1419a;
                                z9 = true;
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
            }
            this.f29297e.D(0);
        }
        if (z9) {
            this.f29301i.postFrameCallback(this);
        } else {
            this.f29300h = false;
        }
    }

    @Override // p215z0.L0
    public void b() {
    }
}
