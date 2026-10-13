package A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I f78d = new b().b(1.0f).c(0.0f, 0.0f).d(1.0f, 1.0f).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f79a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T1.e f80b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T1.e f81c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f82a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T1.e f83b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T1.e f84c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.f82a = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.f83b = T1.e.a(fValueOf2, fValueOf2);
            this.f84c = T1.e.a(fValueOf, fValueOf);
        }

        public I a() {
            return new I(this.f82a, this.f83b, this.f84c);
        }

        public b b(float f8) {
            this.f82a = f8;
            return this;
        }

        public b c(float f8, float f9) {
            this.f83b = T1.e.a(Float.valueOf(f8), Float.valueOf(f9));
            return this;
        }

        public b d(float f8, float f9) {
            this.f84c = T1.e.a(Float.valueOf(f8), Float.valueOf(f9));
            return this;
        }
    }

    public float a() {
        return this.f79a;
    }

    public T1.e b() {
        return this.f80b;
    }

    public T1.e c() {
        return this.f81c;
    }

    public I(float f8, T1.e eVar, T1.e eVar2) {
        this.f79a = f8;
        this.f80b = eVar;
        this.f81c = eVar2;
    }
}
