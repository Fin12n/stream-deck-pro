package p058g3;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f23681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f23682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f23683c;

    public a() {
        this.f23681a = new PointF();
        this.f23682b = new PointF();
        this.f23683c = new PointF();
    }

    public PointF a() {
        return this.f23681a;
    }

    public PointF b() {
        return this.f23682b;
    }

    public PointF c() {
        return this.f23683c;
    }

    public void d(float f8, float f9) {
        this.f23681a.set(f8, f9);
    }

    public void e(float f8, float f9) {
        this.f23682b.set(f8, f9);
    }

    public void f(float f8, float f9) {
        this.f23683c.set(f8, f9);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f23683c.x), Float.valueOf(this.f23683c.y), Float.valueOf(this.f23681a.x), Float.valueOf(this.f23681a.y), Float.valueOf(this.f23682b.x), Float.valueOf(this.f23682b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f23681a = pointF;
        this.f23682b = pointF2;
        this.f23683c = pointF3;
    }
}
