package p214z;

import A.InterfaceC0896t;
import H.C0973d;
import H.I;
import T1.f;
import p166t.M0;
import p166t.Y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y f38495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M0 f38496b;

    public h(Y y8) {
        this.f38495a = y8;
    }

    public static h a(InterfaceC0896t interfaceC0896t) {
        if (interfaceC0896t instanceof M0) {
            return ((M0) interfaceC0896t).t();
        }
        I iG = ((I) interfaceC0896t).g();
        f.b(iG instanceof Y, "CameraInfo doesn't contain Camera2 implementation.");
        h hVarT = ((Y) iG).t();
        if (interfaceC0896t instanceof C0973d) {
            ((C0973d) interfaceC0896t).v();
        }
        return hVarT;
    }

    public String b() {
        M0 m8 = this.f38496b;
        return m8 != null ? m8.e() : this.f38495a.e();
    }

    public h(M0 m8) {
        this.f38496b = m8;
    }
}
