package p166t;

import A.InterfaceC0896t;
import I.c;
import T1.f;
import android.hardware.camera2.CameraCharacteristics;
import p174u.n;
import p174u.t;
import p214z.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class M0 implements InterfaceC0896t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f33394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f33395c = new h(this);

    public M0(String str, t tVar) {
        this.f33393a = str;
        this.f33394b = tVar.c(str);
    }

    @Override // A.InterfaceC0896t
    public int d() {
        return l(0);
    }

    public String e() {
        return this.f33393a;
    }

    @Override // A.InterfaceC0896t
    public int i() {
        Integer num = (Integer) this.f33394b.a(CameraCharacteristics.LENS_FACING);
        f.b(num != null, "Unable to get the lens facing of the camera.");
        return F1.a(num.intValue());
    }

    @Override // A.InterfaceC0896t
    public int l(int i8) {
        return c.a(c.b(i8), u(), 1 == i());
    }

    public h t() {
        return this.f33395c;
    }

    public int u() {
        Integer num = (Integer) this.f33394b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        f.g(num);
        return num.intValue();
    }
}
