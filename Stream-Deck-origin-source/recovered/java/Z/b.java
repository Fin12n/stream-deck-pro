package Z;

import A.AbstractC0890p0;
import H.V0;
import H.W0;
import H.X0;
import H.Z0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Z0 f12545a;

    static {
        X0.b().c(J.a.a(), new T1.a() { // from class: Z.a
            @Override // T1.a
            public final void accept(Object obj) {
                b.a((W0) obj);
            }
        });
    }

    public static /* synthetic */ void a(W0 w8) {
        f12545a = new Z0(c.a(w8));
        AbstractC0890p0.a("DeviceQuirks", "view DeviceQuirks = " + Z0.d(f12545a));
    }

    public static V0 b(Class cls) {
        return f12545a.b(cls);
    }
}
