package p166t;

import H.C0980g0;
import H.C1013x0;
import H.u1;
import p158s.a;
import p198x.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E1 extends C2920a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E1 f33330c = new E1(new j());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f33331b;

    public E1(j jVar) {
        this.f33331b = jVar;
    }

    @Override // p166t.C2920a0, H.C0980g0.b
    public void a(u1 u1Var, C0980g0.a aVar) {
        super.a(u1Var, aVar);
        if (!(u1Var instanceof C1013x0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C1013x0 c1013x0 = (C1013x0) u1Var;
        a.C0723a c0723a = new a.C0723a();
        if (c1013x0.m0()) {
            this.f33331b.a(c1013x0.g0(), c0723a);
        }
        aVar.e(c0723a.c());
    }
}
