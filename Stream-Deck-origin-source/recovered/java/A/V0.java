package A;

import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rational f223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f225d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rational f227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f228c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f226a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f229d = 0;

        public a(Rational rational, int i8) {
            this.f227b = rational;
            this.f228c = i8;
        }

        public V0 a() {
            T1.f.h(this.f227b, "The crop aspect ratio must be set.");
            return new V0(this.f226a, this.f227b, this.f228c, this.f229d);
        }

        public a b(int i8) {
            this.f229d = i8;
            return this;
        }

        public a c(int i8) {
            this.f226a = i8;
            return this;
        }
    }

    public V0(int i8, Rational rational, int i9, int i10) {
        this.f222a = i8;
        this.f223b = rational;
        this.f224c = i9;
        this.f225d = i10;
    }

    public Rational a() {
        return this.f223b;
    }

    public int b() {
        return this.f225d;
    }

    public int c() {
        return this.f224c;
    }

    public int d() {
        return this.f222a;
    }
}
