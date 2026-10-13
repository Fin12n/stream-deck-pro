package p062g7;

import G6.g;
import G6.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p017b7.F;
import p017b7.H;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1795l;
import p017b7.P;
import p017b7.T;

/* JADX INFO: renamed from: g7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2375n extends F implements T {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23850h = AtomicIntegerFieldUpdater.newUpdater(C2375n.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f23851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f23853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f23854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f23855g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: g7.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f23856a;

        public a(Runnable runnable) {
            this.f23856a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f23856a.run();
                } catch (Throwable th) {
                    H.a(h.f2820a, th);
                }
                Runnable runnableM1 = C2375n.this.M1();
                if (runnableM1 == null) {
                    return;
                }
                this.f23856a = runnableM1;
                i8++;
                if (i8 >= 16 && C2375n.this.f23851c.g1(C2375n.this)) {
                    C2375n.this.f23851c.L0(C2375n.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2375n(F f8, int i8) {
        this.f23851c = f8;
        this.f23852d = i8;
        T t8 = f8 instanceof T ? (T) f8 : null;
        this.f23853e = t8 == null ? P.a() : t8;
        this.f23854f = new s(false);
        this.f23855g = new Object();
    }

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        Runnable runnableM1;
        this.f23854f.a(runnable);
        if (f23850h.get(this) >= this.f23852d || !X1() || (runnableM1 = M1()) == null) {
            return;
        }
        this.f23851c.L0(this, new a(runnableM1));
    }

    public final Runnable M1() {
        while (true) {
            Runnable runnable = (Runnable) this.f23854f.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f23855g) {
                f23850h.decrementAndGet(this);
                if (this.f23854f.c() == 0) {
                    return null;
                }
                f23850h.incrementAndGet(this);
            }
        }
    }

    @Override // p017b7.F
    public void T0(g gVar, Runnable runnable) {
        Runnable runnableM1;
        this.f23854f.a(runnable);
        if (f23850h.get(this) >= this.f23852d || !X1() || (runnableM1 = M1()) == null) {
            return;
        }
        this.f23851c.T0(this, new a(runnableM1));
    }

    public final boolean X1() {
        synchronized (this.f23855g) {
            if (f23850h.get(this) >= this.f23852d) {
                return false;
            }
            f23850h.incrementAndGet(this);
            return true;
        }
    }

    @Override // p017b7.F
    public F k1(int i8) {
        AbstractC2376o.a(i8);
        return i8 >= this.f23852d ? this : super.k1(i8);
    }

    @Override // p017b7.T
    public InterfaceC1776b0 o(long j8, Runnable runnable, g gVar) {
        return this.f23853e.o(j8, runnable, gVar);
    }

    @Override // p017b7.T
    public void w0(long j8, InterfaceC1795l interfaceC1795l) {
        this.f23853e.w0(j8, interfaceC1795l);
    }
}
