package p168t1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC3008m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f34008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.d f34010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34011e;

    public /* synthetic */ M(int i8, C c8, int i9, B.d dVar, int i10, AbstractC2633k abstractC2633k) {
        this(i8, c8, i9, dVar, i10);
    }

    @Override // p168t1.InterfaceC3008m
    public int a() {
        return this.f34011e;
    }

    @Override // p168t1.InterfaceC3008m
    public C b() {
        return this.f34008b;
    }

    @Override // p168t1.InterfaceC3008m
    public int c() {
        return this.f34009c;
    }

    public final int d() {
        return this.f34007a;
    }

    public final B.d e() {
        return this.f34010d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return this.f34007a == m8.f34007a && t.c(b(), m8.b()) && y.f(c(), m8.c()) && t.c(this.f34010d, m8.f34010d) && w.e(a(), m8.a());
    }

    public int hashCode() {
        return (((((((this.f34007a * 31) + b().hashCode()) * 31) + y.g(c())) * 31) + w.f(a())) * 31) + this.f34010d.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f34007a + ", weight=" + b() + ", style=" + ((Object) y.h(c())) + ", loadingStrategy=" + ((Object) w.g(a())) + ')';
    }

    public M(int i8, C c8, int i9, B.d dVar, int i10) {
        this.f34007a = i8;
        this.f34008b = c8;
        this.f34009c = i9;
        this.f34010d = dVar;
        this.f34011e = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ M(int i8, C c8, int i9, B.d dVar, int i10, int i11, AbstractC2633k abstractC2633k) {
        C c9 = (i11 & 2) != 0 ? C.f33980b.c() : c8;
        int iB = (i11 & 4) != 0 ? y.f34112b.b() : i9;
        this(i8, c9, iB, (i11 & 8) != 0 ? B.f33971a.a(c9, iB, new B.a[0]) : dVar, (i11 & 16) != 0 ? w.f34108a.a() : i10, null);
    }
}
