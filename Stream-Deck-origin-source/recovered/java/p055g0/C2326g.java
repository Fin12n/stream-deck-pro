package p055g0;

import A1.d;
import A1.h;
import Q0.f;
import java.util.List;
import p011b1.C1766n;
import p011b1.z;

/* JADX INFO: renamed from: g0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2326g implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2326g f23137a = new C2326g();

    @Override // p055g0.F
    public long a(d dVar, C1766n c1766n, long j8) {
        List listC = c1766n.c();
        f fVarD = f.d(f.f9082b.c());
        int size = listC.size();
        for (int i8 = 0; i8 < size; i8++) {
            fVarD = f.d(f.t(fVarD.x(), ((z) listC.get(i8)).n()));
        }
        return f.u(fVarD.x(), -dVar.E0(h.m(64)));
    }
}
