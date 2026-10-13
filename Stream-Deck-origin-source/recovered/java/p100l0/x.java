package p100l0;

import A1.b;
import java.util.List;
import p109m0.t;
import p109m0.v;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f29108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f29109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29110c;

    public x(n nVar, v vVar, int i8) {
        this.f29108a = nVar;
        this.f29109b = vVar;
        this.f29110c = i8;
    }

    public static /* synthetic */ w c(x xVar, int i8, int i9, long j8, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
        }
        if ((i10 & 2) != 0) {
            i9 = xVar.f29110c;
        }
        return xVar.b(i8, i9, j8);
    }

    public abstract w a(int i8, Object obj, Object obj2, int i9, int i10, List list);

    public final w b(int i8, int i9, long j8) {
        int iO;
        Object objA = this.f29108a.a(i8);
        Object objE = this.f29108a.e(i8);
        List listO0 = this.f29109b.o0(i8, j8);
        if (b.l(j8)) {
            iO = b.p(j8);
        } else {
            if (!b.k(j8)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            iO = b.o(j8);
        }
        return a(i8, objA, objE, iO, i9, listO0);
    }

    public final t d() {
        return this.f29108a.b();
    }
}
