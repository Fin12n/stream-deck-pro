package p058g3;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f23687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f23695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f23696m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f8, a aVar, int i8, float f9, float f10, int i9, int i10, float f11, boolean z8, PointF pointF, PointF pointF2) {
        a(str, str2, f8, aVar, i8, f9, f10, i9, i10, f11, z8, pointF, pointF2);
    }

    public void a(String str, String str2, float f8, a aVar, int i8, float f9, float f10, int i9, int i10, float f11, boolean z8, PointF pointF, PointF pointF2) {
        this.f23684a = str;
        this.f23685b = str2;
        this.f23686c = f8;
        this.f23687d = aVar;
        this.f23688e = i8;
        this.f23689f = f9;
        this.f23690g = f10;
        this.f23691h = i9;
        this.f23692i = i10;
        this.f23693j = f11;
        this.f23694k = z8;
        this.f23695l = pointF;
        this.f23696m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f23684a.hashCode() * 31) + this.f23685b.hashCode()) * 31) + this.f23686c)) * 31) + this.f23687d.ordinal()) * 31) + this.f23688e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f23689f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f23691h;
    }

    public b() {
    }
}
