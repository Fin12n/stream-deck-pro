package L3;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4967a = new a();

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 262411704;
        }

        public String toString() {
            return "NoUpdateAvailable";
        }
    }

    /* JADX INFO: renamed from: L3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0176b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4968a;

        public C0176b(int i8) {
            super(null);
            this.f4968a = i8;
        }

        public final int a() {
            return this.f4968a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0176b) && this.f4968a == ((C0176b) obj).f4968a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f4968a);
        }

        public String toString() {
            return "UnsupportedSDKVersion(minimumRequiredSDKVersion=" + this.f4968a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f4969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i maximumAvailableAppVersion) {
            super(null);
            t.g(maximumAvailableAppVersion, "maximumAvailableAppVersion");
            this.f4969a = maximumAvailableAppVersion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && t.c(this.f4969a, ((c) obj).f4969a);
        }

        public int hashCode() {
            return this.f4969a.hashCode();
        }

        public String toString() {
            return "UpdateAvailable(maximumAvailableAppVersion=" + this.f4969a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f4970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i minimumRequiredAppVersion) {
            super(null);
            t.g(minimumRequiredAppVersion, "minimumRequiredAppVersion");
            this.f4970a = minimumRequiredAppVersion;
        }

        public final i a() {
            return this.f4970a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && t.c(this.f4970a, ((d) obj).f4970a);
        }

        public int hashCode() {
            return this.f4970a.hashCode();
        }

        public String toString() {
            return "UpdateRequired(minimumRequiredAppVersion=" + this.f4970a + ")";
        }
    }

    public /* synthetic */ b(AbstractC2633k abstractC2633k) {
        this();
    }

    public b() {
    }
}
