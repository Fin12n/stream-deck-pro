package p196w5;

import O4.G5;
import O4.I5;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import p140p5.InterfaceC2798h;
import p204x5.c;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a implements InterfaceC2798h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Bitmap f37125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteBuffer f37126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile b f37127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f37132h;

    public a(Bitmap bitmap, int i8) {
        this.f37125a = (Bitmap) AbstractC3207p.k(bitmap);
        this.f37128d = bitmap.getWidth();
        this.f37129e = bitmap.getHeight();
        k(i8);
        this.f37130f = i8;
        this.f37131g = -1;
        this.f37132h = null;
    }

    public static a a(Image image, int i8) {
        return l(image, i8, null);
    }

    public static int k(int i8) {
        boolean z8 = true;
        if (i8 != 0 && i8 != 90 && i8 != 180) {
            if (i8 == 270) {
                i8 = 270;
            } else {
                z8 = false;
            }
        }
        AbstractC3207p.b(z8, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i8;
    }

    public static a l(Image image, int i8, Matrix matrix) {
        Image image2;
        int i9;
        int iLimit;
        a aVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AbstractC3207p.l(image, "Please provide a valid image");
        k(i8);
        boolean z8 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z8 = false;
        }
        AbstractC3207p.b(z8, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i9 = i8;
            aVar = new a(c.d().b(image, i8), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i9 = i8;
            a aVar2 = new a(image2, image.getWidth(), image.getHeight(), i9, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            aVar = aVar2;
        }
        m(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i9);
        return aVar;
    }

    public static void m(int i8, int i9, long j8, int i10, int i11, int i12, int i13) {
        I5.a(G5.b("vision-common"), i8, i9, j8, i10, i11, i12, i13);
    }

    public Bitmap b() {
        return this.f37125a;
    }

    public ByteBuffer c() {
        return this.f37126b;
    }

    public Matrix d() {
        return this.f37132h;
    }

    public int e() {
        return this.f37131g;
    }

    public int f() {
        return this.f37129e;
    }

    public Image g() {
        if (this.f37127c == null) {
            return null;
        }
        return this.f37127c.a();
    }

    public Image.Plane[] h() {
        if (this.f37127c == null) {
            return null;
        }
        return this.f37127c.b();
    }

    public int i() {
        return this.f37130f;
    }

    public int j() {
        return this.f37128d;
    }

    public a(Image image, int i8, int i9, int i10, Matrix matrix) {
        AbstractC3207p.k(image);
        this.f37127c = new b(image);
        this.f37128d = i8;
        this.f37129e = i9;
        k(i10);
        this.f37130f = i10;
        this.f37131g = 35;
        this.f37132h = matrix;
    }
}
