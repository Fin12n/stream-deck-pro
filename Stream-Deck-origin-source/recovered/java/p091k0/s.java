package p091k0;

import D6.z;
import java.util.List;
import java.util.Map;
import p038e1.I;
import p055g0.B;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s implements q, I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f28493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f28497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B f28498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f28499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f28500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f28501o;

    public s(t tVar, int i8, boolean z8, float f8, I i9, float f9, boolean z9, List<t> list, int i10, int i11, int i12, boolean z10, B b8, int i13, int i14) {
        this.f28487a = tVar;
        this.f28488b = i8;
        this.f28489c = z8;
        this.f28490d = f8;
        this.f28491e = f9;
        this.f28492f = z9;
        this.f28493g = list;
        this.f28494h = i10;
        this.f28495i = i11;
        this.f28496j = i12;
        this.f28497k = z10;
        this.f28498l = b8;
        this.f28499m = i13;
        this.f28500n = i14;
        this.f28501o = i9;
    }

    @Override // p091k0.q
    public int a() {
        return this.f28496j;
    }

    @Override // p091k0.q
    public List b() {
        return this.f28493g;
    }

    @Override // p038e1.I
    public Map c() {
        return this.f28501o.c();
    }

    @Override // p038e1.I
    public void d() {
        this.f28501o.d();
    }

    @Override // p091k0.q
    public int e() {
        return this.f28495i;
    }

    @Override // p038e1.I
    public int f() {
        return this.f28501o.f();
    }

    @Override // p038e1.I
    public int g() {
        return this.f28501o.g();
    }

    public final boolean h() {
        t tVar = this.f28487a;
        return ((tVar != null ? tVar.getIndex() : 0) == 0 && this.f28488b == 0) ? false : true;
    }

    public final boolean i() {
        return this.f28489c;
    }

    public final float j() {
        return this.f28490d;
    }

    public final t k() {
        return this.f28487a;
    }

    public final int l() {
        return this.f28488b;
    }

    public final float m() {
        return this.f28491e;
    }

    public int n() {
        return this.f28494h;
    }

    public final boolean o(int i8, boolean z8) {
        t tVar;
        if (!this.f28492f && !b().isEmpty() && (tVar = this.f28487a) != null) {
            int iJ = tVar.j();
            int i9 = this.f28488b - i8;
            if (i9 >= 0 && i9 < iJ) {
                t tVar2 = (t) z.i0(b());
                t tVar3 = (t) z.t0(b());
                if (!tVar2.f() && !tVar3.f() && (i8 >= 0 ? Math.min(n() - tVar2.getOffset(), e() - tVar3.getOffset()) > i8 : Math.min((tVar2.getOffset() + tVar2.j()) - n(), (tVar3.getOffset() + tVar3.j()) - e()) > (-i8))) {
                    this.f28488b -= i8;
                    List listB = b();
                    int size = listB.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((t) listB.get(i10)).a(i8, z8);
                    }
                    this.f28490d = i8;
                    if (!this.f28489c && i8 > 0) {
                        this.f28489c = true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
