package io.sentry.cache;

import io.sentry.AbstractC2519l;
import io.sentry.C2550q2;
import io.sentry.EnumC2592y2;
import io.sentry.EnumC2596z2;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2484c0;
import io.sentry.J2;
import io.sentry.T1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.W1;
import io.sentry.W2;
import io.sentry.Y2;
import io.sentry.util.C2569a;
import io.sentry.util.u;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class f extends c implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f27020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f27021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2569a f27022h;

    public f(J2 j8, String str, int i8) {
        super(j8, str, i8);
        this.f27021g = new WeakHashMap();
        this.f27022h = new C2569a();
        this.f27020f = new CountDownLatch(1);
    }

    public static g K(J2 j8) {
        String cacheDirPath = j8.getCacheDirPath();
        int maxCacheItems = j8.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(j8, cacheDirPath, maxCacheItems);
        }
        j8.getLogger().c(EnumC2596z2.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return io.sentry.transport.s.c();
    }

    public static File M(String str) {
        return new File(str, "session.json");
    }

    public static File O(String str) {
        return new File(str, "previous_session.json");
    }

    public final File[] J() {
        File[] fileArrListFiles;
        return (!t() || (fileArrListFiles = this.f27017c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(".envelope");
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }

    public void L() {
        this.f27020f.countDown();
    }

    public final File N(W1 w8) {
        String str;
        InterfaceC2480b0 interfaceC2480b0A = this.f27022h.a();
        try {
            if (this.f27021g.containsKey(w8)) {
                str = (String) this.f27021g.get(w8);
            } else {
                String str2 = W2.a() + ".envelope";
                this.f27021g.put(w8, str2);
                str = str2;
            }
            File file = new File(this.f27017c.getAbsolutePath(), str);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return file;
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

    public final void P(H h8) {
        Date dateD;
        Object objG = io.sentry.util.m.g(h8);
        if (objG instanceof io.sentry.hints.a) {
            File fileO = O(this.f27017c.getAbsolutePath());
            if (!fileO.exists()) {
                this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            ILogger logger = this.f27015a.getLogger();
            EnumC2596z2 enumC2596z2 = EnumC2596z2.WARNING;
            logger.c(enumC2596z2, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileO), c.f27014e));
                try {
                    Y2 y8 = (Y2) ((InterfaceC2484c0) this.f27016b.a()).c(bufferedReader, Y2.class);
                    if (y8 != null) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objG;
                        Long lC = aVar.c();
                        if (lC != null) {
                            dateD = AbstractC2519l.d(lC.longValue());
                            Date dateK = y8.k();
                            if (dateK == null || dateD.before(dateK)) {
                                this.f27015a.getLogger().c(enumC2596z2, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            }
                        } else {
                            dateD = null;
                        }
                        y8.q(Y2.b.Abnormal, null, true, aVar.g());
                        y8.d(dateD);
                        U(fileO, y8);
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Error processing previous session.", th3);
            }
        }
    }

    public final void Q(File file, W1 w8) {
        Iterable iterableC = w8.c();
        if (!iterableC.iterator().hasNext()) {
            this.f27015a.getLogger().c(EnumC2596z2.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        C2550q2 c2550q2 = (C2550q2) iterableC.iterator().next();
        if (!EnumC2592y2.Session.equals(c2550q2.B().b())) {
            this.f27015a.getLogger().c(EnumC2596z2.INFO, "Current envelope has a different envelope type %s", c2550q2.B().b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c2550q2.A()), c.f27014e));
            try {
                Y2 y8 = (Y2) ((InterfaceC2484c0) this.f27016b.a()).c(bufferedReader, Y2.class);
                if (y8 == null) {
                    this.f27015a.getLogger().c(EnumC2596z2.ERROR, "Item of type %s returned null by the parser.", c2550q2.B().b());
                } else {
                    U(file, y8);
                }
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Item failed to process.", th3);
        }
    }

    public boolean R() {
        try {
            return this.f27020f.await(this.f27015a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void S() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f27015a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(AbstractC2519l.g(AbstractC2519l.c()).getBytes(c.f27014e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Error writing the crash marker file to the disk", th3);
        }
    }

    public final void U(File file, Y2 y8) {
        if (file.exists()) {
            this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Overwriting session to offline storage: %s", y8.j());
            if (!file.delete()) {
                this.f27015a.getLogger().c(EnumC2596z2.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f27014e));
                try {
                    ((InterfaceC2484c0) this.f27016b.a()).a(y8, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            this.f27015a.getLogger().a(EnumC2596z2.ERROR, th5, "Error writing Session to offline storage: %s", y8.j());
        }
    }

    @Override // io.sentry.cache.g
    public void e(W1 w8) {
        u.c(w8, "Envelope is required.");
        File fileN = N(w8);
        if (!fileN.exists()) {
            this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Envelope was not cached: %s", fileN.getAbsolutePath());
            return;
        }
        this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Discarding envelope from cache: %s", fileN.getAbsolutePath());
        if (fileN.delete()) {
            return;
        }
        this.f27015a.getLogger().c(EnumC2596z2.ERROR, "Failed to delete envelope: %s", fileN.getAbsolutePath());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        File[] fileArrJ = J();
        ArrayList arrayList = new ArrayList(fileArrJ.length);
        for (File file : fileArrJ) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((InterfaceC2484c0) this.f27016b.a()).d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e8) {
                this.f27015a.getLogger().b(EnumC2596z2.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e8);
            }
        }
        return arrayList.iterator();
    }

    public void p(W1 w8, H h8) {
        u.c(w8, "Envelope is required.");
        F(J());
        File fileM = M(this.f27017c.getAbsolutePath());
        File fileO = O(this.f27017c.getAbsolutePath());
        if (io.sentry.util.m.h(h8, io.sentry.hints.l.class) && !fileM.delete()) {
            this.f27015a.getLogger().c(EnumC2596z2.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.m.h(h8, io.sentry.hints.a.class)) {
            P(h8);
        }
        if (io.sentry.util.m.h(h8, io.sentry.hints.n.class)) {
            if (fileM.exists()) {
                this.f27015a.getLogger().c(EnumC2596z2.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileM), c.f27014e));
                    try {
                        Y2 y8 = (Y2) ((InterfaceC2484c0) this.f27016b.a()).c(bufferedReader, Y2.class);
                        if (y8 != null) {
                            U(fileO, y8);
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Error processing session.", th3);
                }
            }
            Q(fileM, w8);
            boolean zExists = new File(this.f27015a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f27015a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f27015a.getLogger().c(EnumC2596z2.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f27015a.getLogger().c(EnumC2596z2.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            T1.a().b(zExists);
            L();
        }
        File fileN = N(w8);
        if (fileN.exists()) {
            this.f27015a.getLogger().c(EnumC2596z2.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileN.getAbsolutePath());
            return;
        }
        this.f27015a.getLogger().c(EnumC2596z2.DEBUG, "Adding Envelope to offline storage: %s", fileN.getAbsolutePath());
        T(fileN, w8);
        if (io.sentry.util.m.h(h8, UncaughtExceptionHandlerIntegration.a.class)) {
            S();
        }
    }

    public final void T(File file, W1 w8) {
        if (file.exists()) {
            this.f27015a.getLogger().c(EnumC2596z2.DEBUG, jULK.CZhAlGJbBSCiGXQ, file.getAbsolutePath());
            if (!file.delete()) {
                this.f27015a.getLogger().c(EnumC2596z2.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC2484c0) this.f27016b.a()).b(w8, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f27015a.getLogger().a(EnumC2596z2.ERROR, th3, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }
}
