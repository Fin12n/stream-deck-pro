package S4;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9734a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue f9735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9736c;

    public final void a(D d8) {
        synchronized (this.f9734a) {
            try {
                if (this.f9735b == null) {
                    this.f9735b = new ArrayDeque();
                }
                this.f9735b.add(d8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(k kVar) {
        D d8;
        synchronized (this.f9734a) {
            if (this.f9735b != null && !this.f9736c) {
                this.f9736c = true;
                while (true) {
                    synchronized (this.f9734a) {
                        try {
                            d8 = (D) this.f9735b.poll();
                            if (d8 == null) {
                                this.f9736c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    d8.c(kVar);
                }
            }
        }
    }
}
