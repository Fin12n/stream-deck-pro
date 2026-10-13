package p176u1;

import C6.InterfaceC0916e;
import V.ocy.SVzBK;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: u1.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3036u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f34473g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3036u f34474h = new C3036u(false, 0, false, 0, 0, null, 63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G f34480f;

    /* JADX INFO: renamed from: u1.u$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C3036u a() {
            return C3036u.f34474h;
        }

        public a() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ C3036u(boolean z8, int i8, boolean z9, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(z8, i8, z9, i9, i10);
    }

    public final boolean b() {
        return this.f34477c;
    }

    public final int c() {
        return this.f34476b;
    }

    public final int d() {
        return this.f34479e;
    }

    public final int e() {
        return this.f34478d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3036u)) {
            return false;
        }
        C3036u c3036u = (C3036u) obj;
        return this.f34475a == c3036u.f34475a && z.f(this.f34476b, c3036u.f34476b) && this.f34477c == c3036u.f34477c && A.k(this.f34478d, c3036u.f34478d) && C3035t.l(this.f34479e, c3036u.f34479e) && t.c(this.f34480f, c3036u.f34480f);
    }

    public final G f() {
        return this.f34480f;
    }

    public final boolean g() {
        return this.f34475a;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f34475a) * 31) + z.g(this.f34476b)) * 31) + Boolean.hashCode(this.f34477c)) * 31) + A.l(this.f34478d)) * 31) + C3035t.m(this.f34479e)) * 31;
        G g8 = this.f34480f;
        return iHashCode + (g8 != null ? g8.hashCode() : 0);
    }

    public /* synthetic */ C3036u(boolean z8, int i8, boolean z9, int i9, int i10, G g8, AbstractC2633k abstractC2633k) {
        this(z8, i8, z9, i9, i10, g8);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f34475a + ", capitalization=" + ((Object) z.h(this.f34476b)) + SVzBK.TbxxQXPfBXgQ + this.f34477c + ", keyboardType=" + ((Object) A.m(this.f34478d)) + ", imeAction=" + ((Object) C3035t.n(this.f34479e)) + ", platformImeOptions=" + this.f34480f + ')';
    }

    public C3036u(boolean z8, int i8, boolean z9, int i9, int i10, G g8) {
        this.f34475a = z8;
        this.f34476b = i8;
        this.f34477c = z9;
        this.f34478d = i9;
        this.f34479e = i10;
        this.f34480f = g8;
    }

    public /* synthetic */ C3036u(boolean z8, int i8, boolean z9, int i9, int i10, G g8, int i11, AbstractC2633k abstractC2633k) {
        this((i11 & 1) != 0 ? false : z8, (i11 & 2) != 0 ? z.f34485a.b() : i8, (i11 & 4) != 0 ? true : z9, (i11 & 8) != 0 ? A.f34339a.h() : i9, (i11 & 16) != 0 ? C3035t.f34463b.a() : i10, (i11 & 32) != 0 ? null : g8, (AbstractC2633k) null);
    }

    public /* synthetic */ C3036u(boolean z8, int i8, boolean z9, int i9, int i10, int i11, AbstractC2633k abstractC2633k) {
        this((i11 & 1) != 0 ? false : z8, (i11 & 2) != 0 ? z.f34485a.b() : i8, (i11 & 4) != 0 ? true : z9, (i11 & 8) != 0 ? A.f34339a.h() : i9, (i11 & 16) != 0 ? C3035t.f34463b.a() : i10, (AbstractC2633k) null);
    }

    public C3036u(boolean z8, int i8, boolean z9, int i9, int i10) {
        this(z8, i8, z9, i9, i10, (G) null, (AbstractC2633k) null);
    }
}
