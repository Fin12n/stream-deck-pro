package io.sentry.backpressure;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2447a0;
import io.sentry.InterfaceC2480b0;
import io.sentry.J2;
import io.sentry.X;
import io.sentry.util.C2569a;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f26992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26993c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Future f26994d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2569a f26995e = new C2569a();

    public a(J2 j8, X x8) {
        this.f26991a = j8;
        this.f26992b = x8;
    }

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.f26993c;
    }

    public void b() {
        if (c()) {
            if (this.f26993c > 0) {
                this.f26991a.getLogger().c(EnumC2596z2.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f26993c = 0;
        } else {
            int i8 = this.f26993c;
            if (i8 < 10) {
                this.f26993c = i8 + 1;
                this.f26991a.getLogger().c(EnumC2596z2.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f26993c));
            }
        }
    }

    public final boolean c() {
        return this.f26992b.n();
    }

    @Override // io.sentry.backpressure.b
    public void close() {
        Future future = this.f26994d;
        if (future != null) {
            InterfaceC2480b0 interfaceC2480b0A = this.f26995e.a();
            try {
                future.cancel(true);
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
    }

    public final void d(int i8) {
        InterfaceC2447a0 executorService = this.f26991a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        InterfaceC2480b0 interfaceC2480b0A = this.f26995e.a();
        try {
            this.f26994d = executorService.b(this, i8);
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

    @Override // java.lang.Runnable
    public void run() {
        b();
        d(ModuleDescriptor.MODULE_VERSION);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        d(500);
    }
}
