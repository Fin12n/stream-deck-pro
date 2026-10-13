package io.sentry.cache;

import io.sentry.C2550q2;
import io.sentry.EnumC2592y2;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2484c0;
import io.sentry.J2;
import io.sentry.W1;
import io.sentry.Y2;
import io.sentry.util.u;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f27014e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J2 f27015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.util.q f27016b = new io.sentry.util.q(new io.sentry.util.q.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.q.a
        public final Object a() {
            return this.f27013a.f27015a.getSerializer();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f27017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27018d;

    public c(J2 j8, String str, int i8) {
        u.c(str, "Directory is required.");
        this.f27015a = (J2) u.c(j8, "SentryOptions is required.");
        this.f27017c = new File(str);
        this.f27018d = i8;
    }

    public final void A(File file, File[] fileArr) {
        Boolean boolG;
        C2550q2 c2550q2Y;
        Y2 y2E;
        W1 w1D = D(file);
        if (w1D == null || !y(w1D)) {
            return;
        }
        this.f27015a.getClientReportRecorder().b(io.sentry.clientreport.f.CACHE_OVERFLOW, w1D);
        Y2 y2S = s(w1D);
        if (y2S == null || !z(y2S) || (boolG = y2S.g()) == null || !boolG.booleanValue()) {
            return;
        }
        for (File file2 : fileArr) {
            W1 w1D2 = D(file2);
            if (w1D2 != null && y(w1D2)) {
                Iterator it = w1D2.c().iterator();
                while (true) {
                    c2550q2Y = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C2550q2 c2550q2 = (C2550q2) it.next();
                    if (u(c2550q2) && (y2E = E(c2550q2)) != null && z(y2E)) {
                        Boolean boolG2 = y2E.g();
                        if (boolG2 != null && boolG2.booleanValue()) {
                            this.f27015a.getLogger().c(EnumC2596z2.ERROR, "Session %s has 2 times the init flag.", y2S.j());
                            return;
                        }
                        if (y2S.j() != null && y2S.j().equals(y2E.j())) {
                            y2E.n();
                            try {
                                c2550q2Y = C2550q2.y((InterfaceC2484c0) this.f27016b.a(), y2E);
                                it.remove();
                                break;
                            } catch (IOException e8) {
                                this.f27015a.getLogger().a(EnumC2596z2.ERROR, e8, "Failed to create new envelope item for the session %s", y2S.j());
                                break;
                            }
                        }
                    }
                }
                if (c2550q2Y != null) {
                    W1 w1O = o(w1D2, c2550q2Y);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.f27015a.getLogger().c(EnumC2596z2.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    G(w1O, file2, jLastModified);
                    return;
                }
            }
        }
    }

    public final W1 D(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                W1 w1D = ((InterfaceC2484c0) this.f27016b.a()).d(bufferedInputStream);
                bufferedInputStream.close();
                return w1D;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e8) {
            this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Failed to deserialize the envelope.", e8);
            return null;
        }
    }

    public final Y2 E(C2550q2 c2550q2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c2550q2.A()), f27014e));
            try {
                Y2 y8 = (Y2) ((InterfaceC2484c0) this.f27016b.a()).c(bufferedReader, Y2.class);
                bufferedReader.close();
                return y8;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    public void F(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f27018d) {
            this.f27015a.getLogger().c(EnumC2596z2.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i8 = (length - this.f27018d) + 1;
            H(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i8, length);
            for (int i9 = 0; i9 < i8; i9++) {
                File file = fileArr[i9];
                A(file, fileArr2);
                if (!file.delete()) {
                    this.f27015a.getLogger().c(EnumC2596z2.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }

    public final void G(W1 w8, File file, long j8) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC2484c0) this.f27016b.a()).b(w8, fileOutputStream);
                file.setLastModified(j8);
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
            this.f27015a.getLogger().b(EnumC2596z2.ERROR, "Failed to serialize the new envelope to the disk.", th3);
        }
    }

    public final void H(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                }
            });
        }
    }

    public final W1 o(W1 w8, C2550q2 c2550q2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = w8.c().iterator();
        while (it.hasNext()) {
            arrayList.add((C2550q2) it.next());
        }
        arrayList.add(c2550q2);
        return new W1(w8.b(), arrayList);
    }

    public final Y2 s(W1 w8) {
        for (C2550q2 c2550q2 : w8.c()) {
            if (u(c2550q2)) {
                return E(c2550q2);
            }
        }
        return null;
    }

    public boolean t() {
        if (this.f27017c.isDirectory() && this.f27017c.canWrite() && this.f27017c.canRead()) {
            return true;
        }
        this.f27015a.getLogger().c(EnumC2596z2.ERROR, "The directory for caching files is inaccessible.: %s", this.f27017c.getAbsolutePath());
        return false;
    }

    public final boolean u(C2550q2 c2550q2) {
        if (c2550q2 == null) {
            return false;
        }
        return c2550q2.B().b().equals(EnumC2592y2.Session);
    }

    public final boolean y(W1 w8) {
        return w8.c().iterator().hasNext();
    }

    public final boolean z(Y2 y8) {
        return y8.l().equals(Y2.b.Ok) && y8.j() != null;
    }
}
