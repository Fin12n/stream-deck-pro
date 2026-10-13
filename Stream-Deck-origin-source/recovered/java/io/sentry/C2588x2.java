package io.sentry;

import io.sentry.util.C2569a;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.x2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2588x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C2588x2 f27801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2569a f27802d = new C2569a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f27803a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f27804b = new CopyOnWriteArraySet();

    public static C2588x2 c() {
        if (f27801c == null) {
            InterfaceC2480b0 interfaceC2480b0A = f27802d.a();
            try {
                if (f27801c == null) {
                    f27801c = new C2588x2();
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
        return f27801c;
    }

    public void a(String str) {
        io.sentry.util.u.c(str, "integration is required.");
        this.f27803a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.u.c(str, "name is required.");
        io.sentry.util.u.c(str2, "version is required.");
        this.f27804b.add(new io.sentry.protocol.v(str, str2));
    }

    public Set d() {
        return this.f27803a;
    }

    public Set e() {
        return this.f27804b;
    }
}
