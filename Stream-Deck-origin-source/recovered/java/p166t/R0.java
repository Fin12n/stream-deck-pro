package p166t;

import H.C0980g0;
import H.InterfaceC0984i0;
import H.InterfaceC1017z0;
import H.O0;
import H.T0;
import H.c1;
import H.u1;
import H.v1;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class R0 implements v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2963o1 f33428b;

    public R0(Context context) {
        this.f33428b = C2963o1.c(context);
    }

    @Override // H.v1
    public InterfaceC0984i0 a(v1.b bVar, int i8) {
        O0 o0I0 = O0.i0();
        c1.b bVar2 = new c1.b();
        bVar2.y(e2.b(bVar, i8));
        o0I0.L(u1.f3227w, bVar2.p());
        o0I0.L(u1.f3229y, Q0.f33421a);
        C0980g0.a aVar = new C0980g0.a();
        aVar.t(e2.a(bVar, i8));
        o0I0.L(u1.f3228x, aVar.h());
        o0I0.L(u1.f3230z, bVar == v1.b.IMAGE_CAPTURE ? E1.f33330c : C2920a0.f33608a);
        if (bVar == v1.b.PREVIEW) {
            o0I0.L(InterfaceC1017z0.f3292s, this.f33428b.f());
        }
        o0I0.L(InterfaceC1017z0.f3287n, Integer.valueOf(this.f33428b.d(true).getRotation()));
        if (bVar == v1.b.VIDEO_CAPTURE || bVar == v1.b.STREAM_SHARING) {
            o0I0.L(u1.f3220E, Boolean.TRUE);
        }
        return T0.h0(o0I0);
    }
}
