package p204x5;

import O4.C1449k5;
import S4.C1631b;
import S4.InterfaceC1635f;
import S4.k;
import S4.n;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1732o;
import androidx.lifecycle.z;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p140p5.AbstractC2796f;
import p196w5.a;
import p219z4.AbstractC3207p;
import p219z4.C3200i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e implements Closeable, InterfaceC1732o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3200i f37407f = new C3200i("MobileVisionBase", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f37408a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2796f f37409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1631b f37410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f37411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f37412e;

    public e(AbstractC2796f abstractC2796f, Executor executor) {
        this.f37409b = abstractC2796f;
        C1631b c1631b = new C1631b();
        this.f37410c = c1631b;
        this.f37411d = executor;
        abstractC2796f.c();
        this.f37412e = abstractC2796f.a(executor, new Callable() { // from class: x5.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3200i c3200i = e.f37407f;
                return null;
            }
        }, c1631b.b()).d(new InterfaceC1635f() { // from class: x5.h
            @Override // S4.InterfaceC1635f
            public final void d(Exception exc) {
                e.f37407f.d("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }

    public synchronized k c(final a aVar) {
        AbstractC3207p.l(aVar, "InputImage can not be null");
        if (this.f37408a.get()) {
            return n.c(new p105l5.a("This detector is already closed!", 14));
        }
        if (aVar.j() < 32 || aVar.f() < 32) {
            return n.c(new p105l5.a("InputImage width and height should be at least 32!", 3));
        }
        return this.f37409b.a(this.f37411d, new Callable() { // from class: x5.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37413a.o(aVar);
            }
        }, this.f37410c.b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, p156r5.a
    @z(AbstractC1726i.a.ON_DESTROY)
    public synchronized void close() {
        if (this.f37408a.getAndSet(true)) {
            return;
        }
        this.f37410c.a();
        this.f37409b.e(this.f37411d);
    }

    public final /* synthetic */ Object o(a aVar) {
        C1449k5 c1449k5T = C1449k5.t("detectorTaskWithResource#run");
        c1449k5T.c();
        try {
            Object objI = this.f37409b.i(aVar);
            c1449k5T.close();
            return objI;
        } catch (Throwable th) {
            try {
                c1449k5T.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
