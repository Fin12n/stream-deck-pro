package L0;

import A1.r;
import A1.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4827c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4828a;

        public a(float f8) {
            this.f4828a = f8;
        }

        @Override // L0.c.b
        public int a(int i8, int i9, t tVar) {
            return S6.c.d(((i9 - i8) / 2.0f) * (1 + (tVar == t.Ltr ? this.f4828a : (-1) * this.f4828a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f4828a, ((a) obj).f4828a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f4828a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f4828a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements c.InterfaceC0174c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4829a;

        public b(float f8) {
            this.f4829a = f8;
        }

        @Override // L0.c.InterfaceC0174c
        public int a(int i8, int i9) {
            return S6.c.d(((i9 - i8) / 2.0f) * (1 + this.f4829a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f4829a, ((b) obj).f4829a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f4829a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f4829a + ')';
        }
    }

    public e(float f8, float f9) {
        this.f4826b = f8;
        this.f4827c = f9;
    }

    @Override // L0.c
    public long a(long j8, long j9, t tVar) {
        float fG = (r.g(j9) - r.g(j8)) / 2.0f;
        float f8 = (r.f(j9) - r.f(j8)) / 2.0f;
        float f9 = 1;
        return A1.o.a(S6.c.d(fG * ((tVar == t.Ltr ? this.f4826b : (-1) * this.f4826b) + f9)), S6.c.d(f8 * (f9 + this.f4827c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f4826b, eVar.f4826b) == 0 && Float.compare(this.f4827c, eVar.f4827c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f4826b) * 31) + Float.hashCode(this.f4827c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f4826b + ", verticalBias=" + this.f4827c + ')';
    }
}
