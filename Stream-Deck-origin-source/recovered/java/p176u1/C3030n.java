package p176u1;

import R0.pkXL.Oitvkwcwn;
import kotlin.jvm.internal.AbstractC2633k;
import p128o1.C2739d;
import p128o1.G;
import p128o1.H;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: u1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3030n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34452f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34453g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f34454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34458e;

    /* JADX INFO: renamed from: u1.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C3030n(String str, long j8, AbstractC2633k abstractC2633k) {
        this(str, j8);
    }

    public final void a() {
        this.f34457d = -1;
        this.f34458e = -1;
    }

    public final void b(int i8, int i9) {
        long jB = H.b(i8, i9);
        this.f34454a.c(i8, i9, "");
        long jA = AbstractC3031o.a(H.b(this.f34455b, this.f34456c), jB);
        r(G.l(jA));
        q(G.k(jA));
        if (l()) {
            long jA2 = AbstractC3031o.a(H.b(this.f34457d, this.f34458e), jB);
            if (G.h(jA2)) {
                a();
            } else {
                this.f34457d = G.l(jA2);
                this.f34458e = G.k(jA2);
            }
        }
    }

    public final char c(int i8) {
        return this.f34454a.a(i8);
    }

    public final G d() {
        if (l()) {
            return G.b(H.b(this.f34457d, this.f34458e));
        }
        return null;
    }

    public final int e() {
        return this.f34458e;
    }

    public final int f() {
        return this.f34457d;
    }

    public final int g() {
        int i8 = this.f34455b;
        int i9 = this.f34456c;
        if (i8 == i9) {
            return i9;
        }
        return -1;
    }

    public final int h() {
        return this.f34454a.b();
    }

    public final long i() {
        return H.b(this.f34455b, this.f34456c);
    }

    public final int j() {
        return this.f34456c;
    }

    public final int k() {
        return this.f34455b;
    }

    public final boolean l() {
        return this.f34457d != -1;
    }

    public final void n(int i8, int i9) {
        if (i8 < 0 || i8 > this.f34454a.b()) {
            throw new IndexOutOfBoundsException("start (" + i8 + ") offset is outside of text region " + this.f34454a.b());
        }
        if (i9 < 0 || i9 > this.f34454a.b()) {
            throw new IndexOutOfBoundsException("end (" + i9 + ") offset is outside of text region " + this.f34454a.b());
        }
        if (i8 < i9) {
            this.f34457d = i8;
            this.f34458e = i9;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i8 + " > " + i9);
    }

    public final void o(int i8) {
        p(i8, i8);
    }

    public final void q(int i8) {
        if (i8 >= 0) {
            this.f34456c = i8;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i8).toString());
    }

    public final void r(int i8) {
        if (i8 >= 0) {
            this.f34455b = i8;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i8).toString());
    }

    public final C2739d s() {
        return new C2739d(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.f34454a.toString();
    }

    public /* synthetic */ C3030n(C2739d c2739d, long j8, AbstractC2633k abstractC2633k) {
        this(c2739d, j8);
    }

    public final void m(int i8, int i9, String str) {
        if (i8 < 0 || i8 > this.f34454a.b()) {
            throw new IndexOutOfBoundsException(Oitvkwcwn.mUROlkHG + i8 + ") offset is outside of text region " + this.f34454a.b());
        }
        if (i9 < 0 || i9 > this.f34454a.b()) {
            throw new IndexOutOfBoundsException("end (" + i9 + ") offset is outside of text region " + this.f34454a.b());
        }
        if (i8 <= i9) {
            this.f34454a.c(i8, i9, str);
            r(str.length() + i8);
            q(i8 + str.length());
            this.f34457d = -1;
            this.f34458e = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i8 + " > " + i9);
    }

    public final void p(int i8, int i9) {
        String str = kDsnNkYbBsI.UkSiFrlxHDlUVOB;
        if (i8 < 0 || i8 > this.f34454a.b()) {
            throw new IndexOutOfBoundsException("start (" + i8 + str + this.f34454a.b());
        }
        if (i9 < 0 || i9 > this.f34454a.b()) {
            throw new IndexOutOfBoundsException("end (" + i9 + str + this.f34454a.b());
        }
        if (i8 <= i9) {
            r(i8);
            q(i9);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i8 + " > " + i9);
    }

    public C3030n(C2739d c2739d, long j8) {
        this.f34454a = new E(c2739d.i());
        this.f34455b = G.l(j8);
        this.f34456c = G.k(j8);
        this.f34457d = -1;
        this.f34458e = -1;
        int iL = G.l(j8);
        int iK = G.k(j8);
        if (iL >= 0 && iL <= c2739d.length()) {
            if (iK < 0 || iK > c2739d.length()) {
                throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + c2739d.length());
            }
            if (iL <= iK) {
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
        }
        throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + c2739d.length());
    }

    public C3030n(String str, long j8) {
        this(new C2739d(str, null, null, 6, null), j8, (AbstractC2633k) null);
    }
}
