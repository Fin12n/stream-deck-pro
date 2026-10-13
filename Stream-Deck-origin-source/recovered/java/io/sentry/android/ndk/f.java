package io.sentry.android.ndk;

import io.sentry.AbstractC2519l;
import io.sentry.AbstractC2552r1;
import io.sentry.C2491e;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.F;
import io.sentry.util.u;
import java.util.Locale;
import java.util.Map;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends AbstractC2552r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.ndk.a f26606b;

    public f(J2 j8) {
        this(j8, new NativeScope());
    }

    public static /* synthetic */ void e(f fVar, F f8) {
        if (f8 == null) {
            fVar.f26606b.e();
        } else {
            fVar.f26606b.b(f8.i(), f8.h(), f8.j(), f8.k());
        }
    }

    public static /* synthetic */ void h(f fVar, C2491e c2491e) {
        fVar.getClass();
        String strF = null;
        String lowerCase = c2491e.u() != null ? c2491e.u().name().toLowerCase(Locale.ROOT) : null;
        String strG = AbstractC2519l.g(c2491e.w());
        try {
            Map mapT = c2491e.t();
            if (!mapT.isEmpty()) {
                strF = fVar.f26605a.getSerializer().f(mapT);
            }
        } catch (Throwable th) {
            fVar.f26605a.getLogger().a(EnumC2596z2.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
        }
        fVar.f26606b.c(lowerCase, c2491e.v(), c2491e.s(), c2491e.x(), strG, strF);
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void a(final String str, final String str2) {
        try {
            this.f26605a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26595a.f26606b.a(str, str2);
                }
            });
        } catch (Throwable th) {
            this.f26605a.getLogger().a(EnumC2596z2.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void c(final F f8) {
        try {
            this.f26605a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(this.f26603a, f8);
                }
            });
        } catch (Throwable th) {
            this.f26605a.getLogger().a(EnumC2596z2.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void d(final String str, final String str2) {
        try {
            this.f26605a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26598a.f26606b.d(str, str2);
                }
            });
        } catch (Throwable th) {
            this.f26605a.getLogger().a(EnumC2596z2.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    public f(J2 j8, io.sentry.ndk.a aVar) {
        this.f26605a = (J2) u.c(j8, "The SentryOptions object is required.");
        this.f26606b = (io.sentry.ndk.a) u.c(aVar, "The NativeScope object is required.");
    }

    @Override // io.sentry.AbstractC2552r1, io.sentry.W
    public void i(final C2491e c2491e) {
        try {
            this.f26605a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.h(this.f26601a, c2491e);
                }
            });
        } catch (Throwable th) {
            this.f26605a.getLogger().a(EnumC2596z2.ERROR, th, toqHM.lCkHqxSuhrZQYoB, new Object[0]);
        }
    }
}
