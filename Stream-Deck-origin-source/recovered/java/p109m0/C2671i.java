package p109m0;

import B0.d;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: renamed from: m0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2671i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f29414b = d.f896d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f29415a = new d(new a[16], 0);

    public final a a(int i8, int i9) {
        a aVar = new a(i8, i9);
        this.f29415a.d(aVar);
        return aVar;
    }

    public final int b() {
        int iA = ((a) this.f29415a.q()).a();
        d dVar = this.f29415a;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            do {
                a aVar = (a) objArrR[i8];
                if (aVar.a() > iA) {
                    iA = aVar.a();
                }
                i8++;
            } while (i8 < iS);
        }
        return iA;
    }

    public final int c() {
        int iB = ((a) this.f29415a.q()).b();
        d dVar = this.f29415a;
        int iS = dVar.s();
        if (iS > 0) {
            Object[] objArrR = dVar.r();
            int i8 = 0;
            do {
                a aVar = (a) objArrR[i8];
                if (aVar.b() < iB) {
                    iB = aVar.b();
                }
                i8++;
            } while (i8 < iS);
        }
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.f29415a.v();
    }

    public final void e(a aVar) {
        this.f29415a.z(aVar);
    }

    /* JADX INFO: renamed from: m0.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29417b;

        public final int a() {
            return this.f29417b;
        }

        public final int b() {
            return this.f29416a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29416a == aVar.f29416a && this.f29417b == aVar.f29417b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f29416a) * 31) + Integer.hashCode(this.f29417b);
        }

        public String toString() {
            return "Interval(start=" + this.f29416a + ", end=" + this.f29417b + ')';
        }

        public a(int i8, int i9) {
            this.f29416a = i8;
            this.f29417b = i9;
            if (i8 >= 0) {
                if (i9 >= i8) {
                    return;
                } else {
                    throw new IllegalArgumentException("end index greater than start");
                }
            }
            throw new IllegalArgumentException(OjEsfyJYzbPn.CvlFeXFzR);
        }
    }
}
