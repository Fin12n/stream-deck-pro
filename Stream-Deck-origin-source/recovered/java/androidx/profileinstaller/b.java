package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p185v2.k;
import p185v2.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f15342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f15343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0382c f15344c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f15346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15349h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p185v2.b[] f15351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f15352k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15350i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f15345d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0382c interfaceC0382c, String str, String str2, String str3, File file) {
        this.f15342a = assetManager;
        this.f15343b = executor;
        this.f15344c = interfaceC0382c;
        this.f15347f = str;
        this.f15348g = str2;
        this.f15349h = str3;
        this.f15346e = file;
    }

    public static byte[] d() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 > 34) {
            return null;
        }
        switch (i8) {
            case 28:
            case 29:
            case 30:
                return l.f35095b;
            case 31:
            case 32:
            case 33:
            case 34:
                return l.f35094a;
            default:
                return null;
        }
    }

    public static boolean j() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 > 34) {
            return false;
        }
        switch (i8) {
            case 31:
            case 32:
            case 33:
            case 34:
                return true;
            default:
                return false;
        }
    }

    public final b b(p185v2.b[] bVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f15342a, this.f15349h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f15351j = k.q(inputStreamG, k.o(inputStreamG, k.f35093b), bArr, bVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e8) {
            this.f15344c.b(9, e8);
        } catch (IOException e9) {
            this.f15344c.b(7, e9);
        } catch (IllegalStateException e10) {
            this.f15351j = null;
            this.f15344c.b(8, e10);
        }
    }

    public final void c() {
        if (!this.f15350i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f15345d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f15346e.exists()) {
            try {
                this.f15346e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f15346e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f15350i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f15348g);
        } catch (FileNotFoundException e8) {
            this.f15344c.b(6, e8);
            return null;
        } catch (IOException e9) {
            this.f15344c.b(7, e9);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f15344c.a(5, null);
            }
            return null;
        }
    }

    public b h() {
        b bVarB;
        c();
        if (this.f15345d != null) {
            InputStream inputStreamF = f(this.f15342a);
            if (inputStreamF != null) {
                this.f15351j = i(inputStreamF);
            }
            p185v2.b[] bVarArr = this.f15351j;
            if (bVarArr != null && j() && (bVarB = b(bVarArr, this.f15345d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public final p185v2.b[] i(InputStream inputStream) {
        try {
            try {
                try {
                    p185v2.b[] bVarArrW = k.w(inputStream, k.o(inputStream, k.f35092a), this.f15347f);
                    try {
                        inputStream.close();
                        return bVarArrW;
                    } catch (IOException e8) {
                        this.f15344c.b(7, e8);
                        return bVarArrW;
                    }
                } catch (IllegalStateException e9) {
                    this.f15344c.b(8, e9);
                    try {
                        inputStream.close();
                    } catch (IOException e10) {
                        this.f15344c.b(7, e10);
                    }
                    return null;
                }
            } catch (IOException e11) {
                this.f15344c.b(7, e11);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e12) {
                this.f15344c.b(7, e12);
            }
            throw th;
        }
    }

    public final void k(final int i8, final Object obj) {
        this.f15343b.execute(new Runnable() { // from class: v2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f35065a.f15344c.b(i8, obj);
            }
        });
    }

    public b l() {
        p185v2.b[] bVarArr = this.f15351j;
        byte[] bArr = this.f15345d;
        if (bVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    k.E(byteArrayOutputStream, bArr);
                    if (!k.B(byteArrayOutputStream, bArr, bVarArr)) {
                        this.f15344c.b(5, null);
                        this.f15351j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f15352k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f15351j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                this.f15344c.b(7, e8);
            } catch (IllegalStateException e9) {
                this.f15344c.b(8, e9);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f15352k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f15346e);
                    try {
                        p185v2.c.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        this.f15352k = null;
                        this.f15351j = null;
                        return true;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                this.f15352k = null;
                this.f15351j = null;
                throw th5;
            }
        } catch (FileNotFoundException e8) {
            k(6, e8);
            this.f15352k = null;
            this.f15351j = null;
            return false;
        } catch (IOException e9) {
            k(7, e9);
            this.f15352k = null;
            this.f15351j = null;
            return false;
        }
    }
}
