package H;

import A.InterfaceC0881l;
import A.InterfaceC0896t;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface J extends InterfaceC0881l, A.T0.c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2858a;

        a(boolean z8) {
            this.f2858a = z8;
        }

        public boolean b() {
            return this.f2858a;
        }
    }

    Y4.a a();

    R0 b();

    @Override // A.InterfaceC0881l
    default InterfaceC0896t c() {
        return r();
    }

    default boolean e() {
        return c().i() == 0;
    }

    F g();

    default B h() {
        return E.a();
    }

    void m(Collection collection);

    void n(Collection collection);

    default boolean p() {
        return true;
    }

    I r();

    default void o() {
    }

    default void k(B b8) {
    }

    default void l(boolean z8) {
    }

    default void q(boolean z8) {
    }
}
