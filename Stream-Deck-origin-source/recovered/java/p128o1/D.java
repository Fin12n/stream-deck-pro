package p128o1;

import A1.b;
import A1.d;
import A1.t;
import C6.InterfaceC0916e;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p168t1.AbstractC3006k;
import p168t1.AbstractC3009n;
import p168t1.InterfaceC3008m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2739d f30739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f30740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f30741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f30745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f30746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC3009n.b f30747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f30748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC3008m.a f30749k;

    @InterfaceC0916e
    public /* synthetic */ D(C2739d c2739d, I i8, List list, int i9, boolean z8, int i10, d dVar, t tVar, InterfaceC3008m.a aVar, long j8, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, list, i9, z8, i10, dVar, tVar, aVar, j8);
    }

    public final long a() {
        return this.f30748j;
    }

    public final d b() {
        return this.f30745g;
    }

    public final AbstractC3009n.b c() {
        return this.f30747i;
    }

    public final t d() {
        return this.f30746h;
    }

    public final int e() {
        return this.f30742d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        return kotlin.jvm.internal.t.c(this.f30739a, d8.f30739a) && kotlin.jvm.internal.t.c(this.f30740b, d8.f30740b) && kotlin.jvm.internal.t.c(this.f30741c, d8.f30741c) && this.f30742d == d8.f30742d && this.f30743e == d8.f30743e && p216z1.t.e(this.f30744f, d8.f30744f) && kotlin.jvm.internal.t.c(this.f30745g, d8.f30745g) && this.f30746h == d8.f30746h && kotlin.jvm.internal.t.c(this.f30747i, d8.f30747i) && b.g(this.f30748j, d8.f30748j);
    }

    public final int f() {
        return this.f30744f;
    }

    public final List g() {
        return this.f30741c;
    }

    public final boolean h() {
        return this.f30743e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f30739a.hashCode() * 31) + this.f30740b.hashCode()) * 31) + this.f30741c.hashCode()) * 31) + this.f30742d) * 31) + Boolean.hashCode(this.f30743e)) * 31) + p216z1.t.f(this.f30744f)) * 31) + this.f30745g.hashCode()) * 31) + this.f30746h.hashCode()) * 31) + this.f30747i.hashCode()) * 31) + b.q(this.f30748j);
    }

    public final I i() {
        return this.f30740b;
    }

    public final C2739d j() {
        return this.f30739a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f30739a) + ", style=" + this.f30740b + ", placeholders=" + this.f30741c + ", maxLines=" + this.f30742d + ", softWrap=" + this.f30743e + ", overflow=" + ((Object) p216z1.t.g(this.f30744f)) + ", density=" + this.f30745g + ", layoutDirection=" + this.f30746h + ", fontFamilyResolver=" + this.f30747i + ", constraints=" + ((Object) b.r(this.f30748j)) + ')';
    }

    public /* synthetic */ D(C2739d c2739d, I i8, List list, int i9, boolean z8, int i10, d dVar, t tVar, AbstractC3009n.b bVar, long j8, AbstractC2633k abstractC2633k) {
        this(c2739d, i8, list, i9, z8, i10, dVar, tVar, bVar, j8);
    }

    public D(C2739d c2739d, I i8, List list, int i9, boolean z8, int i10, d dVar, t tVar, InterfaceC3008m.a aVar, AbstractC3009n.b bVar, long j8) {
        this.f30739a = c2739d;
        this.f30740b = i8;
        this.f30741c = list;
        this.f30742d = i9;
        this.f30743e = z8;
        this.f30744f = i10;
        this.f30745g = dVar;
        this.f30746h = tVar;
        this.f30747i = bVar;
        this.f30748j = j8;
        this.f30749k = aVar;
    }

    public D(C2739d c2739d, I i8, List list, int i9, boolean z8, int i10, d dVar, t tVar, InterfaceC3008m.a aVar, long j8) {
        this(c2739d, i8, list, i9, z8, i10, dVar, tVar, aVar, AbstractC3006k.a(aVar), j8);
    }

    public D(C2739d c2739d, I i8, List list, int i9, boolean z8, int i10, d dVar, t tVar, AbstractC3009n.b bVar, long j8) {
        this(c2739d, i8, list, i9, z8, i10, dVar, tVar, (InterfaceC3008m.a) null, bVar, j8);
    }
}
