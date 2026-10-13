package p056g1;

import B0.d;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f23591c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23592d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f23593a = new d(new F[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F[] f23594b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: g1.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0546a implements Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0546a f23595a = new C0546a();

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(F f8, F f9) {
                int iH = t.h(f9.J(), f8.J());
                return iH != 0 ? iH : t.h(f8.hashCode(), f9.hashCode());
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        F[] fArr;
        this.f23593a.I(a.C0546a.f23595a);
        int iS = this.f23593a.s();
        F[] fArr2 = this.f23594b;
        if (fArr2 == null || fArr2.length < iS) {
            fArr = fArr2;
            fArr = new F[Math.max(16, this.f23593a.s())];
        }
        fArr = fArr2;
        this.f23594b = null;
        for (int i8 = 0; i8 < iS; i8++) {
            fArr[i8] = this.f23593a.r()[i8];
        }
        this.f23593a.m();
        while (true) {
            iS--;
            if (-1 >= iS) {
                this.f23594b = fArr;
                return;
            }
            F f8 = fArr[iS];
            t.d(f8);
            if (f8.i0()) {
                b(f8);
            }
        }
    }

    public final void b(F f8) {
        f8.z();
        int i8 = 0;
        f8.v1(false);
        d dVarU0 = f8.u0();
        int iS = dVarU0.s();
        if (iS > 0) {
            Object[] objArrR = dVarU0.r();
            do {
                b((F) objArrR[i8]);
                i8++;
            } while (i8 < iS);
        }
    }

    public final boolean c() {
        return this.f23593a.v();
    }

    public final void d(F f8) {
        this.f23593a.d(f8);
        f8.v1(true);
    }

    public final void e(F f8) {
        this.f23593a.m();
        this.f23593a.d(f8);
        f8.v1(true);
    }
}
