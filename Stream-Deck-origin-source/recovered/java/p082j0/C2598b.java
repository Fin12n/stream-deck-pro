package p082j0;

import A1.t;
import D6.C0934n;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2598b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2598b f27914a = new C2598b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f27915b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f27916c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f27917d = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f27918e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f27919f = new C0607b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f27920g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f27921h = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f27922i = new f();

    /* JADX INFO: renamed from: j0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements l {
        @Override // p082j0.C2598b.l
        public void b(A1.d dVar, int i8, int[] iArr, int[] iArr2) {
            C2598b.f27914a.j(i8, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* JADX INFO: renamed from: j0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0607b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f27923a = A1.h.m(0);

        @Override // p082j0.C2598b.d, p082j0.C2598b.l
        public float a() {
            return this.f27923a;
        }

        @Override // p082j0.C2598b.l
        public void b(A1.d dVar, int i8, int[] iArr, int[] iArr2) {
            C2598b.f27914a.h(i8, iArr, iArr2, false);
        }

        @Override // p082j0.C2598b.d
        public void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C2598b.f27914a.h(i8, iArr, iArr2, false);
            } else {
                C2598b.f27914a.h(i8, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: renamed from: j0.b$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements d {
        @Override // p082j0.C2598b.d
        public void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C2598b.f27914a.j(i8, iArr, iArr2, false);
            } else {
                C2598b.f27914a.i(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* JADX INFO: renamed from: j0.b$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        default float a() {
            return A1.h.m(0);
        }

        void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2);
    }

    /* JADX INFO: renamed from: j0.b$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e extends d, l {
    }

    /* JADX INFO: renamed from: j0.b$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f27924a = A1.h.m(0);

        @Override // p082j0.C2598b.d, p082j0.C2598b.l
        public float a() {
            return this.f27924a;
        }

        @Override // p082j0.C2598b.l
        public void b(A1.d dVar, int i8, int[] iArr, int[] iArr2) {
            C2598b.f27914a.k(i8, iArr, iArr2, false);
        }

        @Override // p082j0.C2598b.d
        public void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C2598b.f27914a.k(i8, iArr, iArr2, false);
            } else {
                C2598b.f27914a.k(i8, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* JADX INFO: renamed from: j0.b$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f27925a = A1.h.m(0);

        @Override // p082j0.C2598b.d, p082j0.C2598b.l
        public float a() {
            return this.f27925a;
        }

        @Override // p082j0.C2598b.l
        public void b(A1.d dVar, int i8, int[] iArr, int[] iArr2) {
            C2598b.f27914a.l(i8, iArr, iArr2, false);
        }

        @Override // p082j0.C2598b.d
        public void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C2598b.f27914a.l(i8, iArr, iArr2, false);
            } else {
                C2598b.f27914a.l(i8, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: renamed from: j0.b$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f27926a = A1.h.m(0);

        @Override // p082j0.C2598b.d, p082j0.C2598b.l
        public float a() {
            return this.f27926a;
        }

        @Override // p082j0.C2598b.l
        public void b(A1.d dVar, int i8, int[] iArr, int[] iArr2) {
            C2598b.f27914a.m(i8, iArr, iArr2, false);
        }

        @Override // p082j0.C2598b.d
        public void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C2598b.f27914a.m(i8, iArr, iArr2, false);
            } else {
                C2598b.f27914a.m(i8, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: renamed from: j0.b$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f27927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f27928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f27929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f27930d;

        public /* synthetic */ i(float f8, boolean z8, o oVar, AbstractC2633k abstractC2633k) {
            this(f8, z8, oVar);
        }

        @Override // p082j0.C2598b.d, p082j0.C2598b.l
        public float a() {
            return this.f27930d;
        }

        @Override // p082j0.C2598b.l
        public void b(A1.d dVar, int i8, int[] iArr, int[] iArr2) {
            c(dVar, i8, iArr, t.Ltr, iArr2);
        }

        @Override // p082j0.C2598b.d
        public void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2) {
            int i9;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iV0 = dVar.V0(this.f27927a);
            boolean z8 = this.f27928b && tVar == t.Rtl;
            C2598b c2598b = C2598b.f27914a;
            if (z8) {
                i9 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i10 = iArr[length];
                    int iMin2 = Math.min(i9, i8 - i10);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iV0, (i8 - iMin2) - i10);
                    i9 = iArr2[length] + i10 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i11 = 0;
                i9 = 0;
                iMin = 0;
                int i12 = 0;
                while (i11 < length2) {
                    int i13 = iArr[i11];
                    int iMin3 = Math.min(i9, i8 - i13);
                    iArr2[i12] = iMin3;
                    int iMin4 = Math.min(iV0, (i8 - iMin3) - i13);
                    int i14 = iArr2[i12] + i13 + iMin4;
                    i11++;
                    iMin = iMin4;
                    i9 = i14;
                    i12++;
                }
            }
            int i15 = i9 - iMin;
            o oVar = this.f27929c;
            if (oVar == null || i15 >= i8) {
                return;
            }
            int iIntValue = ((Number) oVar.invoke(Integer.valueOf(i8 - i15), tVar)).intValue();
            int length3 = iArr2.length;
            for (int i16 = 0; i16 < length3; i16++) {
                iArr2[i16] = iArr2[i16] + iIntValue;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return A1.h.t(this.f27927a, iVar.f27927a) && this.f27928b == iVar.f27928b && kotlin.jvm.internal.t.c(this.f27929c, iVar.f27929c);
        }

        public int hashCode() {
            int iU = ((A1.h.u(this.f27927a) * 31) + Boolean.hashCode(this.f27928b)) * 31;
            o oVar = this.f27929c;
            return iU + (oVar == null ? 0 : oVar.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27928b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) A1.h.v(this.f27927a));
            sb.append(", ");
            sb.append(this.f27929c);
            sb.append(')');
            return sb.toString();
        }

        public i(float f8, boolean z8, o oVar) {
            this.f27927a = f8;
            this.f27928b = z8;
            this.f27929c = oVar;
            this.f27930d = f8;
        }
    }

    /* JADX INFO: renamed from: j0.b$j */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j implements d {
        @Override // p082j0.C2598b.d
        public void c(A1.d dVar, int i8, int[] iArr, t tVar, int[] iArr2) {
            if (tVar == t.Ltr) {
                C2598b.f27914a.i(iArr, iArr2, false);
            } else {
                C2598b.f27914a.j(i8, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* JADX INFO: renamed from: j0.b$k */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k implements l {
        @Override // p082j0.C2598b.l
        public void b(A1.d dVar, int i8, int[] iArr, int[] iArr2) {
            C2598b.f27914a.i(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: renamed from: j0.b$l */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface l {
        default float a() {
            return A1.h.m(0);
        }

        void b(A1.d dVar, int i8, int[] iArr, int[] iArr2);
    }

    /* JADX INFO: renamed from: j0.b$m */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f27931a = new m();

        public m() {
            super(2);
        }

        public final Integer b(int i8, t tVar) {
            return Integer.valueOf(L0.c.f4806a.i().a(0, i8, tVar));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).intValue(), (t) obj2);
        }
    }

    public final l a() {
        return f27918e;
    }

    public final e b() {
        return f27919f;
    }

    public final d c() {
        return f27916c;
    }

    public final e d() {
        return f27922i;
    }

    public final e e() {
        return f27921h;
    }

    public final d f() {
        return f27915b;
    }

    public final l g() {
        return f27917d;
    }

    public final void h(int i8, int[] iArr, int[] iArr2, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float f8 = (i8 - i10) / 2;
        if (!z8) {
            int length = iArr.length;
            int i12 = 0;
            while (i9 < length) {
                int i13 = iArr[i9];
                iArr2[i12] = S6.c.d(f8);
                f8 += i13;
                i9++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = S6.c.d(f8);
            f8 += i14;
        }
    }

    public final void i(int[] iArr, int[] iArr2, boolean z8) {
        int i8 = 0;
        if (!z8) {
            int length = iArr.length;
            int i9 = 0;
            int i10 = 0;
            while (i8 < length) {
                int i11 = iArr[i8];
                iArr2[i9] = i10;
                i10 += i11;
                i8++;
                i9++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i12 = iArr[length2];
            iArr2[length2] = i8;
            i8 += i12;
        }
    }

    public final void j(int i8, int[] iArr, int[] iArr2, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int i12 = i8 - i10;
        if (!z8) {
            int length = iArr.length;
            int i13 = 0;
            while (i9 < length) {
                int i14 = iArr[i9];
                iArr2[i13] = i12;
                i12 += i14;
                i9++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = i12;
            i12 += i15;
        }
    }

    public final void k(int i8, int[] iArr, int[] iArr2, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float length = !(iArr.length == 0) ? (i8 - i10) / iArr.length : 0.0f;
        float f8 = length / 2;
        if (z8) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i12 = iArr[length2];
                iArr2[length2] = S6.c.d(f8);
                f8 += i12 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i13 = 0;
        while (i9 < length3) {
            int i14 = iArr[i9];
            iArr2[i13] = S6.c.d(f8);
            f8 += i14 + length;
            i9++;
            i13++;
        }
    }

    public final void l(int i8, int[] iArr, int[] iArr2, boolean z8) {
        if (iArr.length == 0) {
            return;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float fMax = (i8 - i10) / Math.max(C0934n.R(iArr), 1);
        float f8 = (z8 && iArr.length == 1) ? fMax : 0.0f;
        if (z8) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i12 = iArr[length];
                iArr2[length] = S6.c.d(f8);
                f8 += i12 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i13 = 0;
        while (i9 < length2) {
            int i14 = iArr[i9];
            iArr2[i13] = S6.c.d(f8);
            f8 += i14 + fMax;
            i9++;
            i13++;
        }
    }

    public final void m(int i8, int[] iArr, int[] iArr2, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float length = (i8 - i10) / (iArr.length + 1);
        if (z8) {
            float f8 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i12 = iArr[length2];
                iArr2[length2] = S6.c.d(f8);
                f8 += i12 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f9 = length;
        int i13 = 0;
        while (i9 < length3) {
            int i14 = iArr[i9];
            iArr2[i13] = S6.c.d(f9);
            f9 += i14 + length;
            i9++;
            i13++;
        }
    }

    public final e n(float f8) {
        return new i(f8, true, m.f27931a, null);
    }
}
