package C2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0052a f1251e = new C0052a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f1252f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f1254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f1255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f1256d;

    /* JADX INFO: renamed from: C2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0052a {
        public /* synthetic */ C0052a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f1252f) {
                try {
                    Map map = a.f1252f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public C0052a() {
        }
    }

    public a(String name, File file, boolean z8) {
        File file2;
        t.g(name, "name");
        this.f1253a = z8;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f1254b = file2;
        this.f1255c = f1251e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = aVar.f1253a;
        }
        aVar.b(z8);
    }

    public final void b(boolean z8) {
        this.f1255c.lock();
        if (z8) {
            try {
                File file = this.f1254b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f1254b).getChannel();
                channel.lock();
                this.f1256d = channel;
            } catch (IOException e8) {
                this.f1256d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e8);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f1256d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f1255c.unlock();
    }
}
