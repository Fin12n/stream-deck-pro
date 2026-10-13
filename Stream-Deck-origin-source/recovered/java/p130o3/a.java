package p130o3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p004a3.C1705k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1705k f30871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f30874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f30875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f30876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f30877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f30878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f30879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f30883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f30884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f30885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f30886p;

    public a(C1705k c1705k, Object obj, Object obj2, Interpolator interpolator, float f8, Float f9) {
        this.f30879i = -3987645.8f;
        this.f30880j = -3987645.8f;
        this.f30881k = 784923401;
        this.f30882l = 784923401;
        this.f30883m = Float.MIN_VALUE;
        this.f30884n = Float.MIN_VALUE;
        this.f30885o = null;
        this.f30886p = null;
        this.f30871a = c1705k;
        this.f30872b = obj;
        this.f30873c = obj2;
        this.f30874d = interpolator;
        this.f30875e = null;
        this.f30876f = null;
        this.f30877g = f8;
        this.f30878h = f9;
    }

    public boolean a(float f8) {
        return f8 >= f() && f8 < c();
    }

    public a b(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public float c() {
        if (this.f30871a == null) {
            return 1.0f;
        }
        if (this.f30884n == Float.MIN_VALUE) {
            if (this.f30878h == null) {
                this.f30884n = 1.0f;
            } else {
                this.f30884n = f() + ((this.f30878h.floatValue() - this.f30877g) / this.f30871a.e());
            }
        }
        return this.f30884n;
    }

    public float d() {
        if (this.f30880j == -3987645.8f) {
            this.f30880j = ((Float) this.f30873c).floatValue();
        }
        return this.f30880j;
    }

    public int e() {
        if (this.f30882l == 784923401) {
            this.f30882l = ((Integer) this.f30873c).intValue();
        }
        return this.f30882l;
    }

    public float f() {
        C1705k c1705k = this.f30871a;
        if (c1705k == null) {
            return 0.0f;
        }
        if (this.f30883m == Float.MIN_VALUE) {
            this.f30883m = (this.f30877g - c1705k.p()) / this.f30871a.e();
        }
        return this.f30883m;
    }

    public float g() {
        if (this.f30879i == -3987645.8f) {
            this.f30879i = ((Float) this.f30872b).floatValue();
        }
        return this.f30879i;
    }

    public int h() {
        if (this.f30881k == 784923401) {
            this.f30881k = ((Integer) this.f30872b).intValue();
        }
        return this.f30881k;
    }

    public boolean i() {
        return this.f30874d == null && this.f30875e == null && this.f30876f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f30872b + ", endValue=" + this.f30873c + ", startFrame=" + this.f30877g + ", endFrame=" + this.f30878h + ", interpolator=" + this.f30874d + '}';
    }

    public a(C1705k c1705k, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f8, Float f9) {
        this.f30879i = -3987645.8f;
        this.f30880j = -3987645.8f;
        this.f30881k = 784923401;
        this.f30882l = 784923401;
        this.f30883m = Float.MIN_VALUE;
        this.f30884n = Float.MIN_VALUE;
        this.f30885o = null;
        this.f30886p = null;
        this.f30871a = c1705k;
        this.f30872b = obj;
        this.f30873c = obj2;
        this.f30874d = null;
        this.f30875e = interpolator;
        this.f30876f = interpolator2;
        this.f30877g = f8;
        this.f30878h = f9;
    }

    public a(C1705k c1705k, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f8, Float f9) {
        this.f30879i = -3987645.8f;
        this.f30880j = -3987645.8f;
        this.f30881k = 784923401;
        this.f30882l = 784923401;
        this.f30883m = Float.MIN_VALUE;
        this.f30884n = Float.MIN_VALUE;
        this.f30885o = null;
        this.f30886p = null;
        this.f30871a = c1705k;
        this.f30872b = obj;
        this.f30873c = obj2;
        this.f30874d = interpolator;
        this.f30875e = interpolator2;
        this.f30876f = interpolator3;
        this.f30877g = f8;
        this.f30878h = f9;
    }

    public a(Object obj) {
        this.f30879i = -3987645.8f;
        this.f30880j = -3987645.8f;
        this.f30881k = 784923401;
        this.f30882l = 784923401;
        this.f30883m = Float.MIN_VALUE;
        this.f30884n = Float.MIN_VALUE;
        this.f30885o = null;
        this.f30886p = null;
        this.f30871a = null;
        this.f30872b = obj;
        this.f30873c = obj;
        this.f30874d = null;
        this.f30875e = null;
        this.f30876f = null;
        this.f30877g = Float.MIN_VALUE;
        this.f30878h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(Object obj, Object obj2) {
        this.f30879i = -3987645.8f;
        this.f30880j = -3987645.8f;
        this.f30881k = 784923401;
        this.f30882l = 784923401;
        this.f30883m = Float.MIN_VALUE;
        this.f30884n = Float.MIN_VALUE;
        this.f30885o = null;
        this.f30886p = null;
        this.f30871a = null;
        this.f30872b = obj;
        this.f30873c = obj2;
        this.f30874d = null;
        this.f30875e = null;
        this.f30876f = null;
        this.f30877g = Float.MIN_VALUE;
        this.f30878h = Float.valueOf(Float.MAX_VALUE);
    }
}
