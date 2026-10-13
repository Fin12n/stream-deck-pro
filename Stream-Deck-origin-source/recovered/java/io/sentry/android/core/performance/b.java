package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import io.sentry.EnumC2512j0;
import io.sentry.InterfaceC2488d0;
import io.sentry.U1;
import io.sentry.android.core.C2471t;
import io.sentry.k3;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U1 f26503b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U1 f26504c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2488d0 f26505d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2488d0 f26506e = null;

    public b(String str) {
        this.f26502a = str;
    }

    public void a() {
        InterfaceC2488d0 interfaceC2488d0 = this.f26505d;
        if (interfaceC2488d0 != null && !interfaceC2488d0.d()) {
            this.f26505d.g(k3.CANCELLED);
        }
        this.f26505d = null;
        InterfaceC2488d0 interfaceC2488d1 = this.f26506e;
        if (interfaceC2488d1 != null && !interfaceC2488d1.d()) {
            this.f26506e.g(k3.CANCELLED);
        }
        this.f26506e = null;
    }

    public void b(InterfaceC2488d0 interfaceC2488d0) {
        if (this.f26503b == null || interfaceC2488d0 == null) {
            return;
        }
        InterfaceC2488d0 interfaceC2488d0D = d(interfaceC2488d0, this.f26502a + ".onCreate", this.f26503b);
        this.f26505d = interfaceC2488d0D;
        interfaceC2488d0D.i();
    }

    public void c(InterfaceC2488d0 interfaceC2488d0) {
        if (this.f26504c == null || interfaceC2488d0 == null) {
            return;
        }
        InterfaceC2488d0 interfaceC2488d0D = d(interfaceC2488d0, this.f26502a + ".onStart", this.f26504c);
        this.f26506e = interfaceC2488d0D;
        interfaceC2488d0D.i();
    }

    public final InterfaceC2488d0 d(InterfaceC2488d0 interfaceC2488d0, String str, U1 u8) {
        InterfaceC2488d0 interfaceC2488d0H = interfaceC2488d0.h("activity.load", str, u8, EnumC2512j0.SENTRY);
        f(interfaceC2488d0H);
        return interfaceC2488d0H;
    }

    public void e() {
        InterfaceC2488d0 interfaceC2488d0 = this.f26505d;
        if (interfaceC2488d0 == null || this.f26506e == null) {
            return;
        }
        U1 u1R = interfaceC2488d0.r();
        U1 u1R2 = this.f26506e.r();
        if (u1R == null || u1R2 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        U1 u1A = C2471t.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(u1A.b(this.f26505d.u()));
        long millis2 = timeUnit.toMillis(u1A.b(u1R));
        long millis3 = timeUnit.toMillis(u1A.b(this.f26506e.u()));
        long millis4 = timeUnit.toMillis(u1A.b(u1R2));
        c cVar = new c();
        cVar.b().B(this.f26505d.getDescription(), timeUnit.toMillis(this.f26505d.u().j()), jUptimeMillis - millis, jUptimeMillis - millis2);
        cVar.c().B(this.f26506e.getDescription(), timeUnit.toMillis(this.f26506e.u().j()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        f.m().c(cVar);
    }

    public void g(U1 u8) {
        this.f26503b = u8;
    }

    public void h(U1 u8) {
        this.f26504c = u8;
    }

    public final void f(InterfaceC2488d0 interfaceC2488d0) {
        interfaceC2488d0.c("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        interfaceC2488d0.c(ZWZaxQrCHfNe.uEKyMYIzV, "main");
        Boolean bool = Boolean.TRUE;
        interfaceC2488d0.c("ui.contributes_to_ttid", bool);
        interfaceC2488d0.c("ui.contributes_to_ttfd", bool);
    }
}
