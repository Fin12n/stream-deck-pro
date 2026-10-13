package F;

import A.T0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D.b f2317a;

        public a(D.b resolvedFeatureGroup) {
            t.g(resolvedFeatureGroup, "resolvedFeatureGroup");
            this.f2317a = resolvedFeatureGroup;
        }

        public final D.b a() {
            return this.f2317a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && t.c(this.f2317a, ((a) obj).f2317a);
        }

        public int hashCode() {
            return this.f2317a.hashCode();
        }

        public String toString() {
            return "Supported(resolvedFeatureGroup=" + this.f2317a + ')';
        }
    }

    /* JADX INFO: renamed from: F.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0109b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0109b f2318a = new C0109b();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T0 f2319a;

        public c(T0 unsupportedUseCase) {
            t.g(unsupportedUseCase, "unsupportedUseCase");
            this.f2319a = unsupportedUseCase;
        }

        public final T0 a() {
            return this.f2319a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && t.c(this.f2319a, ((c) obj).f2319a);
        }

        public int hashCode() {
            return this.f2319a.hashCode();
        }

        public String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.f2319a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C.b f2321b;

        public d(String requiredUseCases, C.b featureRequiring) {
            t.g(requiredUseCases, "requiredUseCases");
            t.g(featureRequiring, "featureRequiring");
            this.f2320a = requiredUseCases;
            this.f2321b = featureRequiring;
        }

        public final C.b a() {
            return this.f2321b;
        }

        public final String b() {
            return this.f2320a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return t.c(this.f2320a, dVar.f2320a) && t.c(this.f2321b, dVar.f2321b);
        }

        public int hashCode() {
            return (this.f2320a.hashCode() * 31) + this.f2321b.hashCode();
        }

        public String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.f2320a + ", featureRequiring=" + this.f2321b + ')';
        }
    }
}
