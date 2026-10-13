package H;

import A.C0864c0;
import G.InterfaceC0950i;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f2841a = new b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements InterfaceC0950i {
        public a() {
        }

        @Override // G.InterfaceC0950i
        public Y4.a a() {
            return K.n.p(null);
        }

        @Override // G.InterfaceC0950i
        public Y4.a b() {
            return K.n.p(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        void a();

        void b(List list);
    }

    void a();

    void b(c1.b bVar);

    Y4.a c(List list, int i8, int i9);

    void d(int i8);

    default Y4.a e(int i8, int i9) {
        return K.n.p(new a());
    }

    InterfaceC0984i0 f();

    void h(InterfaceC0984i0 interfaceC0984i0);

    void i();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C0999q f2843a;

        public c(C0999q c0999q) {
            this.f2843a = c0999q;
        }

        public c(C0999q c0999q, Throwable th) {
            super(th);
            this.f2843a = c0999q;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements F {
        @Override // H.F
        public Y4.a c(List list, int i8, int i9) {
            return K.n.p(Collections.EMPTY_LIST);
        }

        @Override // H.F
        public InterfaceC0984i0 f() {
            return null;
        }

        @Override // H.F
        public void a() {
        }

        @Override // H.F
        public void i() {
        }

        @Override // H.F
        public void b(c1.b bVar) {
        }

        @Override // H.F
        public void d(int i8) {
        }

        @Override // H.F
        public void h(InterfaceC0984i0 interfaceC0984i0) {
        }
    }

    default void g(C0864c0.i iVar) {
    }
}
