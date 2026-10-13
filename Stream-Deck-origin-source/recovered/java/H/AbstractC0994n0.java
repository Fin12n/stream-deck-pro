package H;

import A.AbstractC0890p0;
import I0.mIk.efuWFSeiT;
import android.util.Log;
import android.util.Size;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: H.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0994n0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f3146k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f3147l = AbstractC0890p0.f("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f3148m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f3149n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F1.c.a f3153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y4.a f3154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F1.c.a f3155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y4.a f3156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f3157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f3159j;

    /* JADX INFO: renamed from: H.n0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC0994n0 f3160a;

        public a(String str, AbstractC0994n0 abstractC0994n0) {
            super(str);
            this.f3160a = abstractC0994n0;
        }

        public AbstractC0994n0 a() {
            return this.f3160a;
        }
    }

    /* JADX INFO: renamed from: H.n0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public AbstractC0994n0() {
        this(f3146k, 0);
    }

    public static /* synthetic */ Object a(AbstractC0994n0 abstractC0994n0, F1.c.a aVar) {
        synchronized (abstractC0994n0.f3150a) {
            abstractC0994n0.f3153d = aVar;
        }
        return "DeferrableSurface-termination(" + abstractC0994n0 + ")";
    }

    public static /* synthetic */ Object b(AbstractC0994n0 abstractC0994n0, F1.c.a aVar) {
        synchronized (abstractC0994n0.f3150a) {
            abstractC0994n0.f3155f = aVar;
        }
        return "DeferrableSurface-close(" + abstractC0994n0 + ")";
    }

    public static /* synthetic */ void c(AbstractC0994n0 abstractC0994n0, String str) {
        abstractC0994n0.getClass();
        try {
            abstractC0994n0.f3154e.get();
            abstractC0994n0.n("Surface terminated", f3149n.decrementAndGet(), f3148m.get());
        } catch (Exception e8) {
            AbstractC0890p0.c("DeferrableSurface", "Unexpected surface termination for " + abstractC0994n0 + "\nStack Trace:\n" + str);
            synchronized (abstractC0994n0.f3150a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC0994n0, Boolean.valueOf(abstractC0994n0.f3152c), Integer.valueOf(abstractC0994n0.f3151b)), e8);
            }
        }
    }

    public void d() {
        F1.c.a aVar;
        synchronized (this.f3150a) {
            try {
                if (this.f3152c) {
                    aVar = null;
                } else {
                    this.f3152c = true;
                    this.f3155f.c(null);
                    if (this.f3151b == 0) {
                        aVar = this.f3153d;
                        this.f3153d = null;
                    } else {
                        aVar = null;
                    }
                    if (AbstractC0890p0.f("DeferrableSurface")) {
                        AbstractC0890p0.a("DeferrableSurface", "surface closed,  useCount=" + this.f3151b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public Y4.a f() {
        return K.n.s(this.f3156g);
    }

    public Class g() {
        return this.f3159j;
    }

    public Size h() {
        return this.f3157h;
    }

    public int i() {
        return this.f3158i;
    }

    public final Y4.a j() {
        synchronized (this.f3150a) {
            try {
                if (this.f3152c) {
                    return K.n.n(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Y4.a k() {
        return K.n.s(this.f3154e);
    }

    public void l() {
        synchronized (this.f3150a) {
            try {
                int i8 = this.f3151b;
                if (i8 == 0 && this.f3152c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f3151b = i8 + 1;
                if (AbstractC0890p0.f("DeferrableSurface")) {
                    if (this.f3151b == 1) {
                        n("New surface in use", f3149n.get(), f3148m.incrementAndGet());
                    }
                    AbstractC0890p0.a("DeferrableSurface", "use count+1, useCount=" + this.f3151b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m() {
        boolean z8;
        synchronized (this.f3150a) {
            z8 = this.f3152c;
        }
        return z8;
    }

    public abstract Y4.a o();

    public void p(Class cls) {
        this.f3159j = cls;
    }

    public AbstractC0994n0(Size size, int i8) {
        this.f3150a = new Object();
        this.f3151b = 0;
        this.f3152c = false;
        this.f3157h = size;
        this.f3158i = i8;
        Y4.a aVarA = F1.c.a(new F1.c.InterfaceC0112c() { // from class: H.k0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return AbstractC0994n0.a(this.f3113a, aVar);
            }
        });
        this.f3154e = aVarA;
        this.f3156g = F1.c.a(new F1.c.InterfaceC0112c() { // from class: H.l0
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return AbstractC0994n0.b(this.f3115a, aVar);
            }
        });
        if (AbstractC0890p0.f("DeferrableSurface")) {
            n("Surface created", f3149n.incrementAndGet(), f3148m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            aVarA.a(new Runnable() { // from class: H.m0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0994n0.c(this.f3133a, stackTraceString);
                }
            }, J.a.a());
        }
    }

    public void e() {
        F1.c.a aVar;
        synchronized (this.f3150a) {
            try {
                int i8 = this.f3151b;
                if (i8 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i9 = i8 - 1;
                this.f3151b = i9;
                if (i9 == 0 && this.f3152c) {
                    aVar = this.f3153d;
                    this.f3153d = null;
                } else {
                    aVar = null;
                }
                if (AbstractC0890p0.f("DeferrableSurface")) {
                    AbstractC0890p0.a("DeferrableSurface", "use count-1,  useCount=" + this.f3151b + " closed=" + this.f3152c + ZWZaxQrCHfNe.vfZp + this);
                    if (this.f3151b == 0) {
                        n("Surface no longer in use", f3149n.get(), f3148m.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public final void n(String str, int i8, int i9) {
        if (!f3147l && AbstractC0890p0.f("DeferrableSurface")) {
            AbstractC0890p0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC0890p0.a("DeferrableSurface", str + "[total_surfaces=" + i8 + efuWFSeiT.INHITfrrvLtihiu + i9 + "](" + this + "}");
    }
}
