package p128o1;

import A1.r;
import Q0.h;
import R0.H0;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p216z1.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30750g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f30751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2744i f30752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f30755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f30756f;

    public /* synthetic */ E(D d8, C2744i c2744i, long j8, AbstractC2633k abstractC2633k) {
        this(d8, c2744i, j8);
    }

    public static /* synthetic */ E b(E e8, D d8, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            d8 = e8.f30751a;
        }
        if ((i8 & 2) != 0) {
            j8 = e8.f30753c;
        }
        return e8.a(d8, j8);
    }

    public static /* synthetic */ int p(E e8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return e8.o(i8, z8);
    }

    public final List A() {
        return this.f30756f;
    }

    public final long B() {
        return this.f30753c;
    }

    public final long C(int i8) {
        return this.f30752b.A(i8);
    }

    public final boolean D(int i8) {
        return this.f30752b.B(i8);
    }

    public final E a(D d8, long j8) {
        return new E(d8, this.f30752b, j8, null);
    }

    public final i c(int i8) {
        return this.f30752b.c(i8);
    }

    public final h d(int i8) {
        return this.f30752b.d(i8);
    }

    public final h e(int i8) {
        return this.f30752b.e(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e8 = (E) obj;
        return t.c(this.f30751a, e8.f30751a) && t.c(this.f30752b, e8.f30752b) && r.e(this.f30753c, e8.f30753c) && this.f30754d == e8.f30754d && this.f30755e == e8.f30755e && t.c(this.f30756f, e8.f30756f);
    }

    public final boolean f() {
        return this.f30752b.f() || ((float) r.f(this.f30753c)) < this.f30752b.h();
    }

    public final boolean g() {
        return ((float) r.g(this.f30753c)) < this.f30752b.z();
    }

    public final float h() {
        return this.f30754d;
    }

    public int hashCode() {
        return (((((((((this.f30751a.hashCode() * 31) + this.f30752b.hashCode()) * 31) + r.h(this.f30753c)) * 31) + Float.hashCode(this.f30754d)) * 31) + Float.hashCode(this.f30755e)) * 31) + this.f30756f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i8, boolean z8) {
        return this.f30752b.i(i8, z8);
    }

    public final float k() {
        return this.f30755e;
    }

    public final D l() {
        return this.f30751a;
    }

    public final float m(int i8) {
        return this.f30752b.l(i8);
    }

    public final int n() {
        return this.f30752b.m();
    }

    public final int o(int i8, boolean z8) {
        return this.f30752b.n(i8, z8);
    }

    public final int q(int i8) {
        return this.f30752b.o(i8);
    }

    public final int r(float f8) {
        return this.f30752b.p(f8);
    }

    public final float s(int i8) {
        return this.f30752b.q(i8);
    }

    public final float t(int i8) {
        return this.f30752b.r(i8);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f30751a + ", multiParagraph=" + this.f30752b + ", size=" + ((Object) r.i(this.f30753c)) + ", firstBaseline=" + this.f30754d + ", lastBaseline=" + this.f30755e + ", placeholderRects=" + this.f30756f + ')';
    }

    public final int u(int i8) {
        return this.f30752b.s(i8);
    }

    public final float v(int i8) {
        return this.f30752b.t(i8);
    }

    public final C2744i w() {
        return this.f30752b;
    }

    public final int x(long j8) {
        return this.f30752b.u(j8);
    }

    public final i y(int i8) {
        return this.f30752b.v(i8);
    }

    public final H0 z(int i8, int i9) {
        return this.f30752b.x(i8, i9);
    }

    public E(D d8, C2744i c2744i, long j8) {
        this.f30751a = d8;
        this.f30752b = c2744i;
        this.f30753c = j8;
        this.f30754d = c2744i.g();
        this.f30755e = c2744i.k();
        this.f30756f = c2744i.y();
    }
}
