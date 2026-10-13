package io.sentry.android.core;

import io.sentry.InterfaceC2480b0;
import io.sentry.util.C2569a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static P f26237c = new P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2569a f26238a = new C2569a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f26239b = null;

    public static P a() {
        return f26237c;
    }

    public Boolean b() {
        return this.f26239b;
    }

    public void c(boolean z8) {
        InterfaceC2480b0 interfaceC2480b0A = this.f26238a.a();
        try {
            this.f26239b = Boolean.valueOf(z8);
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
