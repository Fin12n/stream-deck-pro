package p193w2;

import A2.g;
import A2.h;
import B2.f;
import C6.G;
import W6.n;
import android.content.Context;
import android.util.Log;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.t;
import p209y2.b;
import p209y2.c;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f36902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable f36903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f36905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f36906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36907h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends h.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f36908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, int i9) {
            super(i9);
            this.f36908c = i8;
        }

        @Override // A2.h.a
        public void d(g db) {
            t.g(db, "db");
        }

        @Override // A2.h.a
        public void f(g db) {
            t.g(db, "db");
            int i8 = this.f36908c;
            if (i8 < 1) {
                db.K(i8);
            }
        }

        @Override // A2.h.a
        public void g(g db, int i8, int i9) {
            t.g(db, "db");
        }
    }

    public v(Context context, String str, File file, Callable<InputStream> callable, int i8, h delegate) {
        t.g(context, "context");
        t.g(delegate, "delegate");
        this.f36900a = context;
        this.f36901b = str;
        this.f36902c = file;
        this.f36903d = callable;
        this.f36904e = i8;
        this.f36905f = delegate;
    }

    @Override // A2.h
    public g B0() {
        if (!this.f36907h) {
            v(false);
            this.f36907h = true;
        }
        return b().B0();
    }

    @Override // A2.h
    public g M0() {
        if (!this.f36907h) {
            v(true);
            this.f36907h = true;
        }
        return b().M0();
    }

    @Override // p193w2.i
    public h b() {
        return this.f36905f;
    }

    @Override // A2.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b().close();
        this.f36907h = false;
    }

    @Override // A2.h
    public String getDatabaseName() {
        return b().getDatabaseName();
    }

    public final h j(File file) throws IllegalAccessException, InvocationTargetException {
        try {
            int iD = b.d(file);
            return new f().a(h.b.f484f.a(this.f36900a).c(file.getAbsolutePath()).b(new a(iD, n.d(iD, 1))).a());
        } catch (IOException e8) {
            throw new RuntimeException("Malformed database file, unable to read version.", e8);
        }
    }

    public final void o(File file, boolean z8) throws IllegalAccessException, IOException, InvocationTargetException {
        h hVar = this.f36906g;
        if (hVar == null) {
            t.t("databaseConfiguration");
            hVar = null;
        }
        if (hVar.f36821q == null) {
            return;
        }
        h hVarJ = j(file);
        try {
            g gVarM0 = z8 ? hVarJ.M0() : hVarJ.B0();
            h hVar2 = this.f36906g;
            if (hVar2 == null) {
                t.t("databaseConfiguration");
                hVar2 = null;
            }
            r.f fVar = hVar2.f36821q;
            t.d(fVar);
            fVar.a(gVarM0);
            G g8 = G.f1419a;
            N6.a.a(hVarJ, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                N6.a.a(hVarJ, th);
                throw th2;
            }
        }
    }

    @Override // A2.h
    public void setWriteAheadLoggingEnabled(boolean z8) {
        b().setWriteAheadLoggingEnabled(z8);
    }

    public final void t(h databaseConfiguration) {
        t.g(databaseConfiguration, "databaseConfiguration");
        this.f36906g = databaseConfiguration;
    }

    public final void v(boolean z8) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f36900a.getDatabasePath(databaseName);
        h hVar = this.f36906g;
        h hVar2 = null;
        if (hVar == null) {
            t.t("databaseConfiguration");
            hVar = null;
        }
        C2.a aVar = new C2.a(databaseName, this.f36900a.getFilesDir(), hVar.f36824t);
        try {
            C2.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    t.f(databaseFile, "databaseFile");
                    c(databaseFile, z8);
                    aVar.d();
                    return;
                } catch (IOException e8) {
                    throw new RuntimeException("Unable to copy database file.", e8);
                }
            }
            try {
                t.f(databaseFile, "databaseFile");
                int iD = b.d(databaseFile);
                if (iD == this.f36904e) {
                    aVar.d();
                    return;
                }
                h hVar3 = this.f36906g;
                if (hVar3 == null) {
                    t.t("databaseConfiguration");
                } else {
                    hVar2 = hVar3;
                }
                if (hVar2.a(iD, this.f36904e)) {
                    aVar.d();
                    return;
                }
                if (this.f36900a.deleteDatabase(databaseName)) {
                    try {
                        c(databaseFile, z8);
                    } catch (IOException e9) {
                        Log.w("ROOM", "Unable to copy database file.", e9);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e10) {
                Log.w("ROOM", "Unable to read database version.", e10);
                aVar.d();
                return;
            }
        } catch (Throwable th) {
            aVar.d();
            throw th;
        }
        aVar.d();
        throw th;
    }

    public final void c(File file, boolean z8) throws IllegalAccessException, IOException, InvocationTargetException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f36901b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f36900a.getAssets().open(this.f36901b));
            t.f(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f36902c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f36902c).getChannel();
            t.f(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f36903d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                t.f(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e8) {
                throw new IOException("inputStreamCallable exception on call", e8);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", RaiWHuj.hASqbyQFiHM, this.f36900a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel output = new FileOutputStream(fileCreateTempFile).getChannel();
        t.f(output, "output");
        c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        t.f(fileCreateTempFile, ZWZaxQrCHfNe.TAYqlzSLfiaMXt);
        o(fileCreateTempFile, z8);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }
}
