package H;

import android.util.Range;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range f3033a = new Range(0, 0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public abstract g1 a();

        public abstract a b(A.J j8);

        public abstract a c(Range range);

        public abstract a d(InterfaceC0984i0 interfaceC0984i0);

        public abstract a e(Size size);

        public abstract a f(Size size);

        public abstract a g(int i8);

        public abstract a h(boolean z8);
    }

    public static a a(Size size) {
        return new C0991m.b().f(size).e(size).g(0).c(f3033a).b(A.J.f88d).h(false);
    }

    public abstract A.J b();

    public abstract Range c();

    public abstract InterfaceC0984i0 d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract a i();
}
