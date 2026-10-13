package io.sentry.util;

import io.sentry.InterfaceC2480b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f27730b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f27729a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2569a f27731c = new C2569a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        Object a();
    }

    public q(a aVar) {
        this.f27730b = aVar;
    }

    public Object a() {
        if (this.f27729a == null) {
            InterfaceC2480b0 interfaceC2480b0A = this.f27731c.a();
            try {
                if (this.f27729a == null) {
                    this.f27729a = this.f27730b.a();
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
        return this.f27729a;
    }

    public void b() {
        InterfaceC2480b0 interfaceC2480b0A = this.f27731c.a();
        try {
            this.f27729a = null;
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

    public void c(Object obj) {
        InterfaceC2480b0 interfaceC2480b0A = this.f27731c.a();
        try {
            this.f27729a = obj;
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
