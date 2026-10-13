package H;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: H.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0977f {
    public static AbstractC0977f a(j1 j1Var, int i8, Size size, A.J j8, List list, InterfaceC0984i0 interfaceC0984i0, int i9, Range range, boolean z8) {
        return new C0979g(j1Var, i8, size, j8, list, interfaceC0984i0, i9, range, z8);
    }

    public abstract List b();

    public abstract A.J c();

    public abstract int d();

    public abstract InterfaceC0984i0 e();

    public abstract int f();

    public abstract Size g();

    public abstract j1 h();

    public abstract Range i();

    public abstract boolean j();

    public g1 k(InterfaceC0984i0 interfaceC0984i0) {
        return g1.a(g()).g(f()).c(i()).b(c()).d(interfaceC0984i0).a();
    }
}
