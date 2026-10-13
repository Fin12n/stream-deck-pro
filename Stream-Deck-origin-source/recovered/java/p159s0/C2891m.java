package p159s0;

import p128o1.E;
import p216z1.i;

/* JADX INFO: renamed from: s0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2891m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f32790g = E.f30750g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E f32796f;

    public C2891m(long j8, int i8, int i9, int i10, int i11, E e8) {
        this.f32791a = j8;
        this.f32792b = i8;
        this.f32793c = i9;
        this.f32794d = i10;
        this.f32795e = i11;
        this.f32796f = e8;
    }

    public final C2892n.a a(int i8) {
        return new C2892n.a(A.b(this.f32796f, i8), i8, this.f32791a);
    }

    public final i b() {
        return A.b(this.f32796f, this.f32794d);
    }

    public final String c() {
        return this.f32796f.l().j().i();
    }

    public final EnumC2883e d() {
        int i8 = this.f32793c;
        int i9 = this.f32794d;
        if (i8 < i9) {
            return EnumC2883e.f32771b;
        }
        return i8 > i9 ? EnumC2883e.CROSSED : EnumC2883e.COLLAPSED;
    }

    public final int e() {
        return this.f32794d;
    }

    public final int f() {
        return this.f32795e;
    }

    public final int g() {
        return this.f32793c;
    }

    public final long h() {
        return this.f32791a;
    }

    public final int i() {
        return this.f32792b;
    }

    public final i j() {
        return A.b(this.f32796f, this.f32793c);
    }

    public final E k() {
        return this.f32796f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(C2891m c2891m) {
        return (this.f32791a == c2891m.f32791a && this.f32793c == c2891m.f32793c && this.f32794d == c2891m.f32794d) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f32791a + ", range=(" + this.f32793c + '-' + j() + ',' + this.f32794d + '-' + b() + "), prevOffset=" + this.f32795e + ')';
    }
}
