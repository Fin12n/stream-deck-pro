package H;

import android.util.Size;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 {
    public static k1 a(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4, Map map5, Map map6) {
        return new C0993n(size, map, size2, map2, size3, map3, map4, map5, map6);
    }

    public abstract Size b();

    public Size c(int i8) {
        return (Size) h().get(Integer.valueOf(i8));
    }

    public abstract Map d();

    public Size e(int i8) {
        return (Size) h().get(Integer.valueOf(i8));
    }

    public abstract Map f();

    public Size g(int i8) {
        return (Size) h().get(Integer.valueOf(i8));
    }

    public abstract Map h();

    public abstract Size i();

    public abstract Size j();

    public Size k(int i8) {
        return (Size) l().get(Integer.valueOf(i8));
    }

    public abstract Map l();

    public Size m(int i8) {
        return (Size) n().get(Integer.valueOf(i8));
    }

    public abstract Map n();

    public Size o(int i8) {
        return (Size) p().get(Integer.valueOf(i8));
    }

    public abstract Map p();
}
