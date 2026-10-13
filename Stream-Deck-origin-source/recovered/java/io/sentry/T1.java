package io.sentry;

import io.sentry.util.C2569a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class T1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T1 f26004d = new T1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f26006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2569a f26007c = new C2569a();

    public static T1 a() {
        return f26004d;
    }

    public void b(boolean z8) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26007c.a();
        try {
            if (!this.f26005a) {
                this.f26006b = Boolean.valueOf(z8);
                this.f26005a = true;
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
}
