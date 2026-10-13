package A0;

import D6.C0933m;
import W6.n;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p215z0.InterfaceC3149e;
import p215z0.K0;
import p215z0.W0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f408i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f409j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f411b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f413d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f417h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f410a = new d[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f412c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f414e = new Object[16];

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f420c;

        public b() {
        }

        @Override // A0.e
        public Object a(int i8) {
            return g.this.f414e[this.f420c + i8];
        }

        @Override // A0.e
        public int b(int i8) {
            return g.this.f412c[this.f419b + i8];
        }

        public final d c() {
            d dVar = g.this.f410a[this.f418a];
            t.d(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.f418a >= g.this.f411b) {
                return false;
            }
            d dVarC = c();
            this.f419b += dVarC.b();
            this.f420c += dVarC.d();
            int i8 = this.f418a + 1;
            this.f418a = i8;
            return i8 < g.this.f411b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public static g a(g gVar) {
            return gVar;
        }

        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i8, int i9) {
            int i10 = 1 << i8;
            if ((gVar.f416g & i10) == 0) {
                gVar.f416g = i10 | gVar.f416g;
                gVar.f412c[gVar.z(i8)] = i9;
            } else {
                throw new IllegalStateException((GOKsbdzhLhXAMt.QxQcFUKHfpQ + b(gVar).e(i8)).toString());
            }
        }

        public static final void d(g gVar, int i8, Object obj) {
            int i9 = 1 << i8;
            if ((gVar.f417h & i9) == 0) {
                gVar.f417h = i9 | gVar.f417h;
                gVar.f414e[gVar.A(i8)] = obj;
            } else {
                throw new IllegalStateException(("Already pushed argument " + b(gVar).f(i8)).toString());
            }
        }
    }

    public final int A(int i8) {
        return (this.f415f - v().d()) + i8;
    }

    public final void m() {
        this.f411b = 0;
        this.f413d = 0;
        C0933m.s(this.f414e, null, 0, this.f415f);
        this.f415f = 0;
    }

    public final int n(int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i8);
    }

    public final int o(int i8, int i9) {
        return n.d(i8 + n.g(i8, 1024), i9);
    }

    public final void p(int i8) {
        int[] iArr = this.f412c;
        int length = iArr.length;
        if (i8 > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, o(length, i8));
            t.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f412c = iArrCopyOf;
        }
    }

    public final void q(int i8) {
        Object[] objArr = this.f414e;
        int length = objArr.length;
        if (i8 > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, o(length, i8));
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f414e = objArrCopyOf;
        }
    }

    public final void r(InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, interfaceC3149e, w8, k8);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.f411b;
    }

    public final boolean t() {
        return s() == 0;
    }

    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return s() != 0;
    }

    public final d v() {
        d dVar = this.f410a[this.f411b - 1];
        t.d(dVar);
        return dVar;
    }

    public final void w(g gVar) {
        if (t()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        d[] dVarArr = this.f410a;
        int i8 = this.f411b - 1;
        this.f411b = i8;
        d dVar = dVarArr[i8];
        t.d(dVar);
        this.f410a[this.f411b] = null;
        gVar.y(dVar);
        int i9 = this.f415f;
        int i10 = gVar.f415f;
        int iD = dVar.d();
        for (int i11 = 0; i11 < iD; i11++) {
            i10--;
            i9--;
            Object[] objArr = gVar.f414e;
            Object[] objArr2 = this.f414e;
            objArr[i10] = objArr2[i9];
            objArr2[i9] = null;
        }
        int i12 = this.f413d;
        int i13 = gVar.f413d;
        int iB = dVar.b();
        for (int i14 = 0; i14 < iB; i14++) {
            i13--;
            i12--;
            int[] iArr = gVar.f412c;
            int[] iArr2 = this.f412c;
            iArr[i13] = iArr2[i12];
            iArr2[i12] = 0;
        }
        this.f415f -= dVar.d();
        this.f413d -= dVar.b();
    }

    public final void x(d dVar) {
        if (dVar.b() == 0 && dVar.d() == 0) {
            y(dVar);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.d() + " objects.").toString());
    }

    public final void y(d dVar) {
        this.f416g = 0;
        this.f417h = 0;
        int i8 = this.f411b;
        if (i8 == this.f410a.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f410a, this.f411b + n.g(i8, 1024));
            t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f410a = (d[]) objArrCopyOf;
        }
        p(this.f413d + dVar.b());
        q(this.f415f + dVar.d());
        d[] dVarArr = this.f410a;
        int i9 = this.f411b;
        this.f411b = i9 + 1;
        dVarArr[i9] = dVar;
        this.f413d += dVar.b();
        this.f415f += dVar.d();
    }

    public final int z(int i8) {
        return (this.f413d - v().b()) + i8;
    }
}
