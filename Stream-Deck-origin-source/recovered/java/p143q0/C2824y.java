package p143q0;

import C6.InterfaceC0916e;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p176u1.A;
import p176u1.C3035t;
import p176u1.C3036u;
import p176u1.G;
import p176u1.z;

/* JADX INFO: renamed from: q0.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2824y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31957f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2824y f31958g = new C2824y(0, false, 0, 0, null, 31, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f31963e;

    /* JADX INFO: renamed from: q0.y$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C2824y a() {
            return C2824y.f31958g;
        }

        public a() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ C2824y(int i8, boolean z8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(i8, z8, i9, i10);
    }

    public static /* synthetic */ C2824y c(C2824y c2824y, int i8, boolean z8, int i9, int i10, G g8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i8 = c2824y.f31959a;
        }
        if ((i11 & 2) != 0) {
            z8 = c2824y.f31960b;
        }
        if ((i11 & 4) != 0) {
            i9 = c2824y.f31961c;
        }
        if ((i11 & 8) != 0) {
            i10 = c2824y.f31962d;
        }
        if ((i11 & 16) != 0) {
            g8 = c2824y.f31963e;
        }
        G g9 = g8;
        int i12 = i9;
        return c2824y.b(i8, z8, i12, i10, g9);
    }

    public final C2824y b(int i8, boolean z8, int i9, int i10, G g8) {
        return new C2824y(i8, z8, i9, i10, g8, (AbstractC2633k) null);
    }

    public final C3036u d(boolean z8) {
        return new C3036u(z8, this.f31959a, this.f31960b, this.f31961c, this.f31962d, this.f31963e, (AbstractC2633k) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2824y)) {
            return false;
        }
        C2824y c2824y = (C2824y) obj;
        return z.f(this.f31959a, c2824y.f31959a) && this.f31960b == c2824y.f31960b && A.k(this.f31961c, c2824y.f31961c) && C3035t.l(this.f31962d, c2824y.f31962d) && t.c(this.f31963e, c2824y.f31963e);
    }

    public int hashCode() {
        int iG = ((((((z.g(this.f31959a) * 31) + Boolean.hashCode(this.f31960b)) * 31) + A.l(this.f31961c)) * 31) + C3035t.m(this.f31962d)) * 31;
        G g8 = this.f31963e;
        return iG + (g8 != null ? g8.hashCode() : 0);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) z.h(this.f31959a)) + ", autoCorrect=" + this.f31960b + ", keyboardType=" + ((Object) A.m(this.f31961c)) + ", imeAction=" + ((Object) C3035t.n(this.f31962d)) + ", platformImeOptions=" + this.f31963e + ')';
    }

    public /* synthetic */ C2824y(int i8, boolean z8, int i9, int i10, G g8, AbstractC2633k abstractC2633k) {
        this(i8, z8, i9, i10, g8);
    }

    public C2824y(int i8, boolean z8, int i9, int i10, G g8) {
        this.f31959a = i8;
        this.f31960b = z8;
        this.f31961c = i9;
        this.f31962d = i10;
        this.f31963e = g8;
    }

    public /* synthetic */ C2824y(int i8, boolean z8, int i9, int i10, G g8, int i11, AbstractC2633k abstractC2633k) {
        this((i11 & 1) != 0 ? z.f34485a.b() : i8, (i11 & 2) != 0 ? true : z8, (i11 & 4) != 0 ? A.f34339a.h() : i9, (i11 & 8) != 0 ? C3035t.f34463b.a() : i10, (i11 & 16) != 0 ? null : g8, (AbstractC2633k) null);
    }

    public /* synthetic */ C2824y(int i8, boolean z8, int i9, int i10, int i11, AbstractC2633k abstractC2633k) {
        this((i11 & 1) != 0 ? z.f34485a.b() : i8, (i11 & 2) != 0 ? true : z8, (i11 & 4) != 0 ? A.f34339a.h() : i9, (i11 & 8) != 0 ? C3035t.f34463b.a() : i10, (AbstractC2633k) null);
    }

    public C2824y(int i8, boolean z8, int i9, int i10) {
        this(i8, z8, i9, i10, (G) null, (AbstractC2633k) null);
    }
}
