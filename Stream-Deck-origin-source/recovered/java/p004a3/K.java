package p004a3;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f13130f;

    public K(int i8, int i9, String str, String str2, String str3) {
        this.f13125a = i8;
        this.f13126b = i9;
        this.f13127c = str;
        this.f13128d = str2;
        this.f13129e = str3;
    }

    public K a(float f8) {
        K k8 = new K((int) (this.f13125a * f8), (int) (this.f13126b * f8), this.f13127c, this.f13128d, this.f13129e);
        Bitmap bitmap = this.f13130f;
        if (bitmap != null) {
            k8.g(Bitmap.createScaledBitmap(bitmap, k8.f13125a, k8.f13126b, true));
        }
        return k8;
    }

    public Bitmap b() {
        return this.f13130f;
    }

    public String c() {
        return this.f13128d;
    }

    public int d() {
        return this.f13126b;
    }

    public String e() {
        return this.f13127c;
    }

    public int f() {
        return this.f13125a;
    }

    public void g(Bitmap bitmap) {
        this.f13130f = bitmap;
    }
}
