package io.sentry.android.core;

import io.sentry.AbstractC2519l;
import io.sentry.C2;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2488d0;
import io.sentry.InterfaceC2496f0;
import io.sentry.Q0;
import io.sentry.S0;
import io.sentry.U1;
import io.sentry.util.C2569a;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class z0 implements io.sentry.T, io.sentry.android.core.internal.util.u.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f26576h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2 f26577i = new C2(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26578a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.u f26580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f26581d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2569a f26579b = new C2569a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SortedSet f26582e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.y0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return z0.f((InterfaceC2488d0) obj, (InterfaceC2488d0) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentSkipListSet f26583f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26584g = 16666666;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f26585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f26586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f26587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f26588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f26590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f26591g;

        public a(long j8) {
            this(j8, j8, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f26586b, aVar.f26586b);
        }

        public a(long j8, long j9, long j10, long j11, boolean z8, boolean z9, long j12) {
            this.f26585a = j8;
            this.f26586b = j9;
            this.f26587c = j10;
            this.f26588d = j11;
            this.f26589e = z8;
            this.f26590f = z9;
            this.f26591g = j12;
        }
    }

    public z0(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.u uVar) {
        this.f26580c = uVar;
        this.f26578a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(InterfaceC2488d0 interfaceC2488d0, InterfaceC2488d0 interfaceC2488d1) {
        if (interfaceC2488d0 == interfaceC2488d1) {
            return 0;
        }
        int iCompareTo = interfaceC2488d0.u().compareTo(interfaceC2488d1.u());
        return iCompareTo != 0 ? iCompareTo : interfaceC2488d0.p().k().toString().compareTo(interfaceC2488d1.p().k().toString());
    }

    public static int g(x0 x0Var, long j8, long j9, long j10) {
        long jMax = Math.max(0L, j9 - j10);
        if (!io.sentry.android.core.internal.util.u.h(jMax, j8)) {
            return 0;
        }
        x0Var.a(jMax, Math.max(0L, jMax - j8), true, io.sentry.android.core.internal.util.u.g(jMax));
        return 1;
    }

    public static int i(x0 x0Var, long j8, long j9) {
        long jG = j9 - x0Var.g();
        if (jG > 0) {
            return (int) Math.ceil(jG / j8);
        }
        return 0;
    }

    public static long j(U1 u8) {
        if (u8 instanceof C2) {
            return u8.b(f26577i);
        }
        return System.nanoTime() - (AbstractC2519l.h(System.currentTimeMillis()) - u8.j());
    }

    @Override // io.sentry.T
    public void a(InterfaceC2488d0 interfaceC2488d0) {
        if (!this.f26578a || (interfaceC2488d0 instanceof Q0) || (interfaceC2488d0 instanceof S0)) {
            return;
        }
        InterfaceC2480b0 interfaceC2480b0A = this.f26579b.a();
        try {
            if (!this.f26582e.contains(interfaceC2488d0)) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            h(interfaceC2488d0);
            InterfaceC2480b0 interfaceC2480b0A2 = this.f26579b.a();
            try {
                if (this.f26582e.isEmpty()) {
                    clear();
                } else {
                    this.f26583f.headSet(new a(j(((InterfaceC2488d0) this.f26582e.first()).u()))).clear();
                }
                if (interfaceC2480b0A2 != null) {
                    interfaceC2480b0A2.close();
                }
            } catch (Throwable th) {
                if (interfaceC2480b0A2 != null) {
                    try {
                        interfaceC2480b0A2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.T
    public void b(InterfaceC2488d0 interfaceC2488d0) {
        if (!this.f26578a || (interfaceC2488d0 instanceof Q0) || (interfaceC2488d0 instanceof S0)) {
            return;
        }
        InterfaceC2480b0 interfaceC2480b0A = this.f26579b.a();
        try {
            this.f26582e.add(interfaceC2488d0);
            if (this.f26581d == null) {
                this.f26581d = this.f26580c.j(this);
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.T
    public void clear() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26579b.a();
        try {
            if (this.f26581d != null) {
                this.f26580c.k(this.f26581d);
                this.f26581d = null;
            }
            this.f26583f.clear();
            this.f26582e.clear();
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.internal.util.u.c
    public void d(long j8, long j9, long j10, long j11, boolean z8, boolean z9, float f8) {
        if (this.f26583f.size() > 3600) {
            return;
        }
        long j12 = (long) (f26576h / ((double) f8));
        this.f26584g = j12;
        if (z8 || z9) {
            this.f26583f.add(new a(j8, j9, j10, j11, z8, z9, j12));
        }
    }

    public final void h(InterfaceC2488d0 interfaceC2488d0) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26579b.a();
        try {
            if (!this.f26582e.remove(interfaceC2488d0)) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
            }
            U1 u1R = interfaceC2488d0.r();
            if (u1R == null) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
            }
            long j8 = j(interfaceC2488d0.u());
            long j9 = j(u1R);
            long j10 = j9 - j8;
            long j11 = 0;
            if (j10 <= 0) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return;
                }
                return;
            }
            x0 x0Var = new x0();
            long j12 = this.f26584g;
            if (!this.f26583f.isEmpty()) {
                for (a aVar : this.f26583f.tailSet(new a(j8))) {
                    if (aVar.f26585a > j9) {
                        break;
                    }
                    if (aVar.f26585a >= j8 && aVar.f26586b <= j9) {
                        x0Var.a(aVar.f26587c, aVar.f26588d, aVar.f26589e, aVar.f26590f);
                    } else if ((j8 > aVar.f26585a && j8 < aVar.f26586b) || (j9 > aVar.f26585a && j9 < aVar.f26586b)) {
                        long jMin = Math.min(aVar.f26588d - Math.max(j11, Math.max(j11, j8 - aVar.f26585a) - aVar.f26591g), j10);
                        long jMin2 = Math.min(j9, aVar.f26586b) - Math.max(j8, aVar.f26585a);
                        x0Var.a(jMin2, jMin, io.sentry.android.core.internal.util.u.h(jMin2, aVar.f26591g), io.sentry.android.core.internal.util.u.g(jMin2));
                    }
                    j12 = aVar.f26591g;
                    j11 = 0;
                }
            }
            long j13 = j12;
            int iF = x0Var.f();
            long jF = this.f26580c.f();
            if (jF != -1) {
                iF = iF + g(x0Var, j13, j9, jF) + i(x0Var, j13, j10);
            }
            double dE = (x0Var.e() + x0Var.c()) / 1.0E9d;
            interfaceC2488d0.c("frames.total", Integer.valueOf(iF));
            interfaceC2488d0.c("frames.slow", Integer.valueOf(x0Var.d()));
            interfaceC2488d0.c("frames.frozen", Integer.valueOf(x0Var.b()));
            interfaceC2488d0.c("frames.delay", Double.valueOf(dE));
            if (interfaceC2488d0 instanceof InterfaceC2496f0) {
                interfaceC2488d0.s("frames_total", Integer.valueOf(iF));
                interfaceC2488d0.s(kDsnNkYbBsI.wqp, Integer.valueOf(x0Var.d()));
                interfaceC2488d0.s("frames_frozen", Integer.valueOf(x0Var.b()));
                interfaceC2488d0.s("frames_delay", Double.valueOf(dE));
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A == null) {
                throw th;
            }
            try {
                interfaceC2480b0A.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
