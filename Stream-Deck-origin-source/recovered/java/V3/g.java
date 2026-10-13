package V3;

import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10673a = new b(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V3.b f10674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f10677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map f10678f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V3.b level, String str, String str2, String str3, Map<String, ? extends Object> map) {
            super(null);
            t.g(level, "level");
            this.f10674b = level;
            this.f10675c = str;
            this.f10676d = str2;
            this.f10677e = str3;
            this.f10678f = map;
        }

        public final String a() {
            return this.f10677e;
        }

        public final Map b() {
            return this.f10678f;
        }

        public final V3.b c() {
            return this.f10674b;
        }

        public final String d() {
            return this.f10675c;
        }

        public final String e() {
            return this.f10676d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10674b == aVar.f10674b && t.c(this.f10675c, aVar.f10675c) && t.c(this.f10676d, aVar.f10676d) && t.c(this.f10677e, aVar.f10677e) && t.c(this.f10678f, aVar.f10678f);
        }

        public int hashCode() {
            int iHashCode = this.f10674b.hashCode() * 31;
            String str = this.f10675c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f10676d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f10677e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map map = this.f10678f;
            return iHashCode4 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "Breadcrumb(level=" + this.f10674b + ", message=" + this.f10675c + ", type=" + this.f10676d + ", category=" + this.f10677e + ", data=" + this.f10678f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f10679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable throwable) {
            super(null);
            t.g(throwable, "throwable");
            this.f10679b = throwable;
        }

        public final Throwable a() {
            return this.f10679b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && t.c(this.f10679b, ((c) obj).f10679b);
        }

        public int hashCode() {
            return this.f10679b.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f10679b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10680b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String value) {
            super(null);
            t.g(value, "value");
            this.f10680b = value;
        }

        public final String a() {
            return this.f10680b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && t.c(this.f10680b, ((d) obj).f10680b);
        }

        public int hashCode() {
            return this.f10680b.hashCode();
        }

        public String toString() {
            return "SetUserId(value=" + this.f10680b + ")";
        }
    }

    public /* synthetic */ g(AbstractC2633k abstractC2633k) {
        this();
    }

    public g() {
    }
}
