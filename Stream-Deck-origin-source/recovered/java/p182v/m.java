package p182v;

import T1.f;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    public m(int i8, Surface surface) {
        this(new OutputConfiguration(i8, surface));
    }

    public static m i(OutputConfiguration outputConfiguration) {
        return new m(outputConfiguration);
    }

    @Override // p182v.n, v.i.a
    public void a(long j8) {
        if (j8 == -1) {
            return;
        }
        ((OutputConfiguration) g()).setStreamUseCase(j8);
    }

    @Override // p182v.k, v.i.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // p182v.l, v.i.a
    public void c(long j8) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j8);
    }

    @Override // p182v.k, v.i.a
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // p182v.l, v.i.a
    public /* bridge */ /* synthetic */ void e(String str) {
        super.e(str);
    }

    @Override // p182v.n
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p182v.n, v.i.a
    public void f(int i8) {
        ((OutputConfiguration) g()).setMirrorMode(i8);
    }

    @Override // p182v.l, p182v.k, p182v.j, v.i.a
    public Object g() {
        f.a(this.f34941a instanceof OutputConfiguration);
        return this.f34941a;
    }

    @Override // p182v.j, v.i.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // p182v.n
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public m(Object obj) {
        super(obj);
    }
}
