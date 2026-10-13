package p168t1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3009n f34016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f34017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f34020e;

    public /* synthetic */ S(AbstractC3009n abstractC3009n, C c8, int i8, int i9, Object obj, AbstractC2633k abstractC2633k) {
        this(abstractC3009n, c8, i8, i9, obj);
    }

    public static /* synthetic */ S b(S s8, AbstractC3009n abstractC3009n, C c8, int i8, int i9, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            abstractC3009n = s8.f34016a;
        }
        if ((i10 & 2) != 0) {
            c8 = s8.f34017b;
        }
        if ((i10 & 4) != 0) {
            i8 = s8.f34018c;
        }
        if ((i10 & 8) != 0) {
            i9 = s8.f34019d;
        }
        if ((i10 & 16) != 0) {
            obj = s8.f34020e;
        }
        Object obj3 = obj;
        int i11 = i8;
        return s8.a(abstractC3009n, c8, i11, i9, obj3);
    }

    public final S a(AbstractC3009n abstractC3009n, C c8, int i8, int i9, Object obj) {
        return new S(abstractC3009n, c8, i8, i9, obj, null);
    }

    public final AbstractC3009n c() {
        return this.f34016a;
    }

    public final int d() {
        return this.f34018c;
    }

    public final int e() {
        return this.f34019d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        return t.c(this.f34016a, s8.f34016a) && t.c(this.f34017b, s8.f34017b) && y.f(this.f34018c, s8.f34018c) && z.h(this.f34019d, s8.f34019d) && t.c(this.f34020e, s8.f34020e);
    }

    public final C f() {
        return this.f34017b;
    }

    public int hashCode() {
        AbstractC3009n abstractC3009n = this.f34016a;
        int iHashCode = (((((((abstractC3009n == null ? 0 : abstractC3009n.hashCode()) * 31) + this.f34017b.hashCode()) * 31) + y.g(this.f34018c)) * 31) + z.i(this.f34019d)) * 31;
        Object obj = this.f34020e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f34016a + ", fontWeight=" + this.f34017b + ", fontStyle=" + ((Object) y.h(this.f34018c)) + ", fontSynthesis=" + ((Object) z.l(this.f34019d)) + ", resourceLoaderCacheKey=" + this.f34020e + ')';
    }

    public S(AbstractC3009n abstractC3009n, C c8, int i8, int i9, Object obj) {
        this.f34016a = abstractC3009n;
        this.f34017b = c8;
        this.f34018c = i8;
        this.f34019d = i9;
        this.f34020e = obj;
    }
}
