package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C2485c1;
import io.sentry.C2507i;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.util.C2576h;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.android.core.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2470s implements io.sentry.U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ILogger f26553h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26546a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26547b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26548c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26549d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26550e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f26551f = 1.0E9d / 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f26552g = new File("/proc/self/stat");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26554i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Pattern f26555j = Pattern.compile("[\n\t\r ]");

    public C2470s(ILogger iLogger) {
        this.f26553h = (ILogger) io.sentry.util.u.c(iLogger, "Logger is required.");
    }

    @Override // io.sentry.U
    public void c(C2485c1 c2485c1) {
        if (this.f26554i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j8 = jElapsedRealtimeNanos - this.f26546a;
            this.f26546a = jElapsedRealtimeNanos;
            long jD = d();
            long j9 = jD - this.f26547b;
            this.f26547b = jD;
            c2485c1.a(new C2507i(System.currentTimeMillis(), ((j9 / j8) / this.f26549d) * 100.0d));
        }
    }

    public final long d() {
        String strC;
        try {
            strC = C2576h.c(this.f26552g);
        } catch (IOException e8) {
            this.f26554i = false;
            this.f26553h.b(EnumC2596z2.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e8);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f26555j.split(strC.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f26551f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e9) {
                this.f26553h.b(EnumC2596z2.ERROR, "Error parsing /proc/self/stat file.", e9);
            }
        }
        return 0L;
    }

    @Override // io.sentry.U
    public void e() {
        this.f26554i = true;
        this.f26548c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f26549d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f26551f = 1.0E9d / this.f26548c;
        this.f26547b = d();
    }
}
