package L0;

import A1.r;
import A1.s;
import A1.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4824c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4825a;

        public a(float f8) {
            this.f4825a = f8;
        }

        @Override // L0.c.b
        public int a(int i8, int i9, t tVar) {
            return S6.c.d(((i9 - i8) / 2.0f) * (1 + this.f4825a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f4825a, ((a) obj).f4825a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f4825a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f4825a + ')';
        }
    }

    public d(float f8, float f9) {
        this.f4823b = f8;
        this.f4824c = f9;
    }

    @Override // L0.c
    public long a(long j8, long j9, t tVar) {
        long jA = s.a(r.g(j9) - r.g(j8), r.f(j9) - r.f(j8));
        float f8 = 1;
        return A1.o.a(S6.c.d((r.g(jA) / 2.0f) * (this.f4823b + f8)), S6.c.d((r.f(jA) / 2.0f) * (f8 + this.f4824c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f4823b, dVar.f4823b) == 0 && Float.compare(this.f4824c, dVar.f4824c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f4823b) * 31) + Float.hashCode(this.f4824c);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f4823b + ", verticalBias=" + this.f4824c + ')';
    }
}
