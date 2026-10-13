package p143q0;

import A1.c;
import A1.d;
import D6.r;
import Z6.v;
import p128o1.I;
import p128o1.n;
import p128o1.s;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31424a = v.z("H", 10);

    public static final long a(I i8, d dVar, AbstractC3009n.b bVar, String str, int i9) {
        n nVarA = s.a(str, i8, c.b(0, 0, 0, 0, 15, null), dVar, bVar, (64 & 32) != 0 ? r.n() : r.n(), (64 & 64) != 0 ? r.n() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i9, (64 & 256) != 0 ? false : false);
        return A1.s.a(F.a(nVarA.c()), F.a(nVarA.f()));
    }

    public static /* synthetic */ long b(I i8, d dVar, AbstractC3009n.b bVar, String str, int i9, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = f31424a;
        }
        if ((i10 & 16) != 0) {
            i9 = 1;
        }
        return a(i8, dVar, bVar, str, i9);
    }

    public static final String c() {
        return f31424a;
    }
}
