package p100l0;

import C6.G;
import W6.n;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w[] f29112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f29113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f29114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29118h;

    public y(int i8, w[] wVarArr, C c8, List<C2641b> list, boolean z8, int i9) {
        this.f29111a = i8;
        this.f29112b = wVarArr;
        this.f29113c = c8;
        this.f29114d = list;
        this.f29115e = z8;
        this.f29116f = i9;
        int iMax = 0;
        for (w wVar : wVarArr) {
            iMax = Math.max(iMax, wVar.i());
        }
        this.f29117g = iMax;
        this.f29118h = n.d(iMax + this.f29116f, 0);
    }

    public final int a() {
        return this.f29111a;
    }

    public final w[] b() {
        return this.f29112b;
    }

    public final int c() {
        return this.f29117g;
    }

    public final int d() {
        return this.f29118h;
    }

    public final boolean e() {
        return this.f29112b.length == 0;
    }

    public final w[] f(int i8, int i9, int i10) {
        w[] wVarArr = this.f29112b;
        int length = wVarArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            w wVar = wVarArr[i11];
            int i14 = i12 + 1;
            int iD = C2641b.d(((C2641b) this.f29114d.get(i12)).g());
            int i15 = this.f29113c.a()[i13];
            boolean z8 = this.f29115e;
            wVar.q(i8, i15, i9, i10, z8 ? this.f29111a : i13, z8 ? i13 : this.f29111a);
            G g8 = G.f1419a;
            i13 += iD;
            i11++;
            i12 = i14;
        }
        return this.f29112b;
    }
}
