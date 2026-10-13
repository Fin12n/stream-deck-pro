package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F1.d f15355a = F1.d.r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15356b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f15357c = null;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f15360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f15361d;

        public b(int i8, int i9, long j8, long j9) {
            this.f15358a = i8;
            this.f15359b = i9;
            this.f15360c = j8;
            this.f15361d = j9;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }

        public void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f15358a);
                dataOutputStream.writeInt(this.f15359b);
                dataOutputStream.writeLong(this.f15360c);
                dataOutputStream.writeLong(this.f15361d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f15359b == bVar.f15359b && this.f15360c == bVar.f15360c && this.f15358a == bVar.f15358a && this.f15361d == bVar.f15361d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f15359b), Long.valueOf(this.f15360c), Integer.valueOf(this.f15358a), Long.valueOf(this.f15361d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15364c;

        public c(int i8, boolean z8, boolean z9) {
            this.f15362a = i8;
            this.f15364c = z9;
            this.f15363b = z8;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i8, boolean z8, boolean z9) {
        c cVar = new c(i8, z8, z9);
        f15357c = cVar;
        f15355a.o(cVar);
        return f15357c;
    }

    public static c c(Context context, boolean z8) {
        b bVarA;
        int i8;
        c cVar;
        if (!z8 && (cVar = f15357c) != null) {
            return cVar;
        }
        synchronized (f15356b) {
            if (!z8) {
                try {
                    c cVar2 = f15357c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i9 = 0;
            if (Build.VERSION.SDK_INT == 30) {
                return b(262144, false, false);
            }
            File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
            long length = file.length();
            boolean z9 = file.exists() && length > 0;
            File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
            long length2 = file2.length();
            boolean z10 = file2.exists() && length2 > 0;
            try {
                long jA = a(context);
                File file3 = new File(context.getFilesDir(), "profileInstalled");
                if (file3.exists()) {
                    try {
                        bVarA = b.a(file3);
                    } catch (IOException unused) {
                        return b(131072, z9, z10);
                    }
                } else {
                    bVarA = null;
                }
                if (bVarA != null && bVarA.f15360c == jA && (i8 = bVarA.f15359b) != 2) {
                    i9 = i8;
                } else if (z9) {
                    i9 = 1;
                } else if (z10) {
                    i9 = 2;
                }
                if (z8 && z10 && i9 != 1) {
                    i9 = 2;
                }
                if (bVarA != null && bVarA.f15359b == 2 && i9 == 1 && length < bVarA.f15361d) {
                    i9 = 3;
                }
                int i10 = i9;
                b bVar = new b(1, i10, jA, length2);
                if (bVarA == null || !bVarA.equals(bVar)) {
                    try {
                        bVar.b(file3);
                    } catch (IOException unused2) {
                        i10 = 196608;
                    }
                }
                return b(i10, z9, z10);
            } catch (PackageManager.NameNotFoundException unused3) {
                return b(65536, z9, z10);
            }
        }
    }
}
