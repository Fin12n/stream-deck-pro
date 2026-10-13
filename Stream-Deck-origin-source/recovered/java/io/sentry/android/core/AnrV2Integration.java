package io.sentry.android.core;

import P2.Lsk.mHPawN;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import io.sentry.AbstractC2519l;
import io.sentry.C2479b;
import io.sentry.C2557s2;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.InterfaceC2516k0;
import io.sentry.J2;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class AnrV2Integration implements InterfaceC2516k0, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f26113d = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.p f26115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f26116c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f26117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.sentry.X f26118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SentryAndroidOptions f26119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f26120d;

        public a(Context context, io.sentry.X x8, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.p pVar) {
            this.f26117a = context;
            this.f26118b = x8;
            this.f26119c = sentryAndroidOptions;
            this.f26120d = pVar.getCurrentTimeMillis() - AnrV2Integration.f26113d;
        }

        public final byte[] a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i8 = inputStream.read(bArr, 0, 1024);
                    if (i8 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i8);
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final c b(ApplicationExitInfo applicationExitInfo, boolean z8) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream == null) {
                            return cVar;
                        }
                        traceInputStream.close();
                        return cVar;
                    }
                    byte[] bArrA = a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrA)));
                        try {
                            List listF = new io.sentry.android.core.internal.threaddump.c(this.f26119c, z8).f(io.sentry.android.core.internal.threaddump.b.c(bufferedReader));
                            if (listF.isEmpty()) {
                                c cVar2 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar2;
                            }
                            c cVar3 = new c(c.a.DUMP, bArrA, listF);
                            bufferedReader.close();
                            return cVar3;
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        this.f26119c.getLogger().b(EnumC2596z2.WARNING, "Failed to parse ANR thread dump", th3);
                        return new c(c.a.ERROR, bArrA);
                    }
                } catch (Throwable th4) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                this.f26119c.getLogger().b(EnumC2596z2.WARNING, "Failed to read ANR thread dump", th6);
                return new c(c.a.NO_DUMP);
            }
        }

        public final void c(ApplicationExitInfo applicationExitInfo, boolean z8) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z9 = applicationExitInfo.getImportance() != 100;
            c cVarB = b(applicationExitInfo, z9);
            if (cVarB.f26124a == c.a.NO_DUMP) {
                this.f26119c.getLogger().c(EnumC2596z2.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            b bVar = new b(this.f26119c.getFlushTimeoutMillis(), this.f26119c.getLogger(), timestamp, z8, z9);
            io.sentry.H hE = io.sentry.util.m.e(bVar);
            C2557s2 c2557s2 = new C2557s2();
            c.a aVar = cVarB.f26124a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.j jVar = new io.sentry.protocol.j();
                jVar.f("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                c2557s2.C0(jVar);
            } else if (aVar == c.a.DUMP) {
                c2557s2.E0(cVarB.f26126c);
            }
            c2557s2.B0(EnumC2596z2.FATAL);
            c2557s2.F0(AbstractC2519l.d(timestamp));
            if (this.f26119c.isAttachAnrThreadDump() && (bArr = cVarB.f26125b) != null) {
                hE.n(C2479b.b(bArr));
            }
            if (this.f26118b.F(c2557s2, hE).equals(io.sentry.protocol.u.f27472b) || bVar.e()) {
                return;
            }
            this.f26119c.getLogger().c(EnumC2596z2.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c2557s2.G());
        }

        public final void d(List list, Long l8) {
            Collections.reverse(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = J.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    if (applicationExitInfoA.getTimestamp() < this.f26120d) {
                        this.f26119c.getLogger().c(EnumC2596z2.DEBUG, "ANR happened too long ago %s.", applicationExitInfoA);
                    } else if (l8 == null || applicationExitInfoA.getTimestamp() > l8.longValue()) {
                        c(applicationExitInfoA, false);
                    } else {
                        this.f26119c.getLogger().c(EnumC2596z2.DEBUG, "ANR has already been reported %s.", applicationExitInfoA);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f26117a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f26119c.getLogger().c(EnumC2596z2.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.g envelopeDiskCache = this.f26119c.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.f26119c.isEnableAutoSessionTracking()) {
                io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
                if (!fVar.R()) {
                    this.f26119c.getLogger().c(EnumC2596z2.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    fVar.L();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lX = io.sentry.android.core.cache.b.X(this.f26119c);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = J.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    arrayList.remove(applicationExitInfoA);
                    applicationExitInfo = applicationExitInfoA;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f26119c.getLogger().c(EnumC2596z2.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f26120d) {
                this.f26119c.getLogger().c(EnumC2596z2.DEBUG, cFAYKUlMj.SmWcalq, new Object[0]);
                return;
            }
            if (lX != null && applicationExitInfo.getTimestamp() <= lX.longValue()) {
                this.f26119c.getLogger().c(EnumC2596z2.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f26119c.isReportHistoricalAnrs()) {
                d(arrayList, lX);
            }
            c(applicationExitInfo, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f26121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f26123f;

        public b(long j8, ILogger iLogger, long j9, boolean z8, boolean z9) {
            super(j8, iLogger);
            this.f26121d = j9;
            this.f26122e = z8;
            this.f26123f = z9;
        }

        @Override // io.sentry.hints.c
        public boolean a() {
            return this.f26122e;
        }

        @Override // io.sentry.hints.a
        public Long c() {
            return Long.valueOf(this.f26121d);
        }

        @Override // io.sentry.hints.a
        public boolean d() {
            return false;
        }

        @Override // io.sentry.hints.f
        public boolean f(io.sentry.protocol.u uVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void h(io.sentry.protocol.u uVar) {
        }

        @Override // io.sentry.hints.a
        public String g() {
            return this.f26123f ? OjEsfyJYzbPn.yookFILMZra : "anr_foreground";
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.n.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f26116c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    public AnrV2Integration(Context context, io.sentry.transport.p pVar) {
        this.f26114a = Z.h(context);
        this.f26115b = pVar;
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(io.sentry.X x8, J2 j8) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.u.c(j8 instanceof SentryAndroidOptions ? (SentryAndroidOptions) j8 : null, "SentryAndroidOptions is required");
        this.f26116c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(EnumC2596z2.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f26116c.isAnrEnabled()));
        if (this.f26116c.getCacheDirPath() == null) {
            this.f26116c.getLogger().c(EnumC2596z2.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f26116c.isAnrEnabled()) {
            try {
                j8.getExecutorService().submit(new a(this.f26114a, x8, this.f26116c, this.f26115b));
            } catch (Throwable th) {
                j8.getLogger().b(EnumC2596z2.DEBUG, "Failed to start AnrProcessor.", th);
            }
            j8.getLogger().c(EnumC2596z2.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.o.a(mHPawN.czl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f26124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f26125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f26126c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        public c(a aVar) {
            this.f26124a = aVar;
            this.f26125b = null;
            this.f26126c = null;
        }

        public c(a aVar, byte[] bArr) {
            this.f26124a = aVar;
            this.f26125b = bArr;
            this.f26126c = null;
        }

        public c(a aVar, byte[] bArr, List list) {
            this.f26124a = aVar;
            this.f26125b = bArr;
            this.f26126c = list;
        }
    }
}
