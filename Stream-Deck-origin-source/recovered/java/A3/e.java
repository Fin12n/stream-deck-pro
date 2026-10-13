package A3;

import java.util.Date;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Date f521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Date f523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Date f525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Date f526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f527h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f528i;

        public /* synthetic */ a(String str, Date date, Date date2, Date date3, boolean z8, Date date4, Date date5, boolean z9, String str2, int i8, AbstractC2633k abstractC2633k) {
            this(str, (i8 & 2) != 0 ? null : date, (i8 & 4) != 0 ? null : date2, (i8 & 8) != 0 ? null : date3, z8, (i8 & 32) != 0 ? null : date4, (i8 & 64) != 0 ? null : date5, z9, str2);
        }

        public final Date a() {
            return this.f525f;
        }

        public final Date b() {
            return this.f521b;
        }

        public final boolean c() {
            return this.f527h;
        }

        public final Date d() {
            return this.f523d;
        }

        public final Date e() {
            return this.f522c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f520a, aVar.f520a) && t.c(this.f521b, aVar.f521b) && t.c(this.f522c, aVar.f522c) && t.c(this.f523d, aVar.f523d) && this.f524e == aVar.f524e && t.c(this.f525f, aVar.f525f) && t.c(this.f526g, aVar.f526g) && this.f527h == aVar.f527h && t.c(this.f528i, aVar.f528i);
        }

        public final String f() {
            return this.f520a;
        }

        public final String g() {
            return this.f528i;
        }

        public final Date h() {
            return this.f526g;
        }

        public int hashCode() {
            int iHashCode = this.f520a.hashCode() * 31;
            Date date = this.f521b;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f522c;
            int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
            Date date3 = this.f523d;
            int iHashCode4 = (((iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31) + Boolean.hashCode(this.f524e)) * 31;
            Date date4 = this.f525f;
            int iHashCode5 = (iHashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
            Date date5 = this.f526g;
            return ((((iHashCode5 + (date5 != null ? date5.hashCode() : 0)) * 31) + Boolean.hashCode(this.f527h)) * 31) + this.f528i.hashCode();
        }

        public final boolean i() {
            return this.f524e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String productID, Date date, Date date2, Date date3, boolean z8, Date date4, Date date5, boolean z9, String storeTitle) {
            super(null);
            t.g(productID, "productID");
            t.g(storeTitle, "storeTitle");
            this.f520a = productID;
            this.f521b = date;
            this.f522c = date2;
            this.f523d = date3;
            this.f524e = z8;
            this.f525f = date4;
            this.f526g = date5;
            this.f527h = z9;
            this.f528i = storeTitle;
        }

        public String toString() {
            return "Product(productID=" + this.f520a + ", expirationDate=" + this.f521b + ", originalPurchaseDate=" + this.f522c + ", latestPurchaseDate=" + this.f523d + ", willRenew=" + this.f524e + ", billingIssueDetectedAt=" + this.f525f + ", unsubscribeDetectedAt=" + this.f526g + ", freeTrial=" + this.f527h + ", storeTitle=" + this.f528i + QhsKALGiniuQ.TnaXAG;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Date f529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f530b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Date date, String storeTitle) {
            super(null);
            t.g(storeTitle, "storeTitle");
            this.f529a = date;
            this.f530b = storeTitle;
        }

        public final Date a() {
            return this.f529a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.f529a, bVar.f529a) && t.c(this.f530b, bVar.f530b);
        }

        public int hashCode() {
            Date date = this.f529a;
            return ((date == null ? 0 : date.hashCode()) * 31) + this.f530b.hashCode();
        }

        public String toString() {
            return "Promotional(expirationDate=" + this.f529a + ", storeTitle=" + this.f530b + ")";
        }
    }

    public /* synthetic */ e(AbstractC2633k abstractC2633k) {
        this();
    }

    public e() {
    }
}
