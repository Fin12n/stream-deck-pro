package p100l0;

import D6.z;
import java.util.List;
import java.util.Map;
import p038e1.I;
import p055g0.B;
import p064h0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v implements t, I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f29072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f29075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f29077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f29080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f29081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f29082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f29083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f29084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f29085n;

    public v(y yVar, int i8, boolean z8, float f8, I i9, boolean z9, List<w> list, int i10, int i11, int i12, boolean z10, B b8, int i13, int i14) {
        this.f29072a = yVar;
        this.f29073b = i8;
        this.f29074c = z8;
        this.f29075d = f8;
        this.f29076e = z9;
        this.f29077f = list;
        this.f29078g = i10;
        this.f29079h = i11;
        this.f29080i = i12;
        this.f29081j = z10;
        this.f29082k = b8;
        this.f29083l = i13;
        this.f29084m = i14;
        this.f29085n = i9;
    }

    @Override // p100l0.t
    public int a() {
        return this.f29080i;
    }

    @Override // p100l0.t
    public List b() {
        return this.f29077f;
    }

    @Override // p038e1.I
    public Map c() {
        return this.f29085n.c();
    }

    @Override // p038e1.I
    public void d() {
        this.f29085n.d();
    }

    public final boolean e() {
        y yVar = this.f29072a;
        return ((yVar != null ? yVar.a() : 0) == 0 && this.f29073b == 0) ? false : true;
    }

    @Override // p038e1.I
    public int f() {
        return this.f29085n.f();
    }

    @Override // p038e1.I
    public int g() {
        return this.f29085n.g();
    }

    public final boolean h() {
        return this.f29074c;
    }

    public final float i() {
        return this.f29075d;
    }

    public final y j() {
        return this.f29072a;
    }

    public final int k() {
        return this.f29073b;
    }

    public B l() {
        return this.f29082k;
    }

    public int m() {
        return this.f29079h;
    }

    public int n() {
        return this.f29078g;
    }

    public final boolean o(int i8) {
        y yVar;
        boolean z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        if (!this.f29076e && !b().isEmpty() && (yVar = this.f29072a) != null) {
            int iD = yVar.d();
            int i9 = this.f29073b - i8;
            if (i9 >= 0 && i9 < iD) {
                w wVar = (w) z.i0(b());
                w wVar2 = (w) z.t0(b());
                if (!wVar.l() && !wVar2.l() && (i8 >= 0 ? Math.min(n() - a.a(wVar, l()), m() - a.a(wVar2, l())) > i8 : Math.min((a.a(wVar, l()) + wVar.k()) - n(), (a.a(wVar2, l()) + wVar2.k()) - m()) > (-i8))) {
                    this.f29073b -= i8;
                    List listB = b();
                    int size = listB.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((w) listB.get(i10)).d(i8);
                    }
                    this.f29075d = i8;
                    z8 = true;
                    z8 = true;
                    z8 = true;
                    if (!this.f29074c && i8 > 0) {
                        this.f29074c = true;
                    }
                }
            }
        }
        return z8;
    }
}
