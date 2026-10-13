package p100l0;

import A1.b;
import C6.G;
import W6.n;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f29120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f29123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f29124f;

    public z(boolean z8, C c8, int i8, int i9, x xVar, F f8) {
        this.f29119a = z8;
        this.f29120b = c8;
        this.f29121c = i8;
        this.f29122d = i9;
        this.f29123e = xVar;
        this.f29124f = f8;
    }

    public final long a(int i8, int i9) {
        int i10;
        if (i9 == 1) {
            i10 = this.f29120b.b()[i8];
        } else {
            int i11 = (i9 + i8) - 1;
            i10 = (this.f29120b.a()[i11] + this.f29120b.b()[i11]) - this.f29120b.a()[i8];
        }
        int iD = n.d(i10, 0);
        return this.f29119a ? b.f422b.e(iD) : b.f422b.d(iD);
    }

    public abstract y b(int i8, w[] wVarArr, List list, int i9);

    public final y c(int i8) {
        F.c cVarC = this.f29124f.c(i8);
        int size = cVarC.b().size();
        int i9 = (size == 0 || cVarC.a() + size == this.f29121c) ? 0 : this.f29122d;
        w[] wVarArr = new w[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iD = C2641b.d(((C2641b) cVarC.b().get(i11)).g());
            w wVarB = this.f29123e.b(cVarC.a() + i11, i9, a(i10, iD));
            i10 += iD;
            G g8 = G.f1419a;
            wVarArr[i11] = wVarB;
        }
        return b(i8, wVarArr, cVarC.b(), i9);
    }

    public final long d(int i8) {
        F f8 = this.f29124f;
        return a(0, f8.i(i8, f8.e()));
    }
}
