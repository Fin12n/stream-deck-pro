package p190w;

import A.AbstractC0890p0;
import H.V0;
import H.W0;
import H.X0;
import H.Z0;
import J.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Z0 f35189a;

    static {
        X0.b().c(a.a(), new T1.a() { // from class: w.d
            @Override // T1.a
            public final void accept(Object obj) {
                e.a((W0) obj);
            }
        });
    }

    public static /* synthetic */ void a(W0 w8) {
        f35189a = new Z0(f.a(w8));
        AbstractC0890p0.a("DeviceQuirks", "camera2 DeviceQuirks = " + Z0.d(f35189a));
    }

    public static V0 b(Class cls) {
        return f35189a.b(cls);
    }

    public static Z0 c() {
        return f35189a;
    }
}
