package p056g1;

import kotlin.jvm.internal.AbstractC2633k;
import p038e1.H;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: renamed from: g1.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2359x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f23667c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23668d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f23669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f23670b = l1.e(null, null, 2, null);

    /* JADX INFO: renamed from: g1.x$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public C2359x(F f8) {
        this.f23669a = f8;
    }

    public final H a() {
        return (H) this.f23670b.getValue();
    }

    public final int b(int i8) {
        return f().c(this.f23669a.k0(), this.f23669a.E(), i8);
    }

    public final int c(int i8) {
        return f().a(this.f23669a.k0(), this.f23669a.E(), i8);
    }

    public final int d(int i8) {
        return f().c(this.f23669a.k0(), this.f23669a.D(), i8);
    }

    public final int e(int i8) {
        return f().a(this.f23669a.k0(), this.f23669a.D(), i8);
    }

    public final H f() {
        H hA = a();
        if (hA != null) {
            return hA;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
    }

    public final int g(int i8) {
        return f().e(this.f23669a.k0(), this.f23669a.E(), i8);
    }

    public final int h(int i8) {
        return f().b(this.f23669a.k0(), this.f23669a.E(), i8);
    }

    public final int i(int i8) {
        return f().e(this.f23669a.k0(), this.f23669a.D(), i8);
    }

    public final int j(int i8) {
        return f().b(this.f23669a.k0(), this.f23669a.D(), i8);
    }

    public final void k(H h8) {
        this.f23670b.setValue(h8);
    }

    public final void l(H h8) {
        k(h8);
    }
}
