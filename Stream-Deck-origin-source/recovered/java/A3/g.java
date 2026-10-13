package A3;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f586p;

    public g(String id, String title, String str, String formattedPrice, String period, String str2, boolean z8, String packageSubtitle, boolean z9, boolean z10, boolean z11, String str3, String price, String priceCurrencyCode, String str4, String str5) {
        t.g(id, "id");
        t.g(title, "title");
        t.g(formattedPrice, "formattedPrice");
        t.g(period, "period");
        t.g(packageSubtitle, "packageSubtitle");
        t.g(price, "price");
        t.g(priceCurrencyCode, "priceCurrencyCode");
        this.f571a = id;
        this.f572b = title;
        this.f573c = str;
        this.f574d = formattedPrice;
        this.f575e = period;
        this.f576f = str2;
        this.f577g = z8;
        this.f578h = packageSubtitle;
        this.f579i = z9;
        this.f580j = z10;
        this.f581k = z11;
        this.f582l = str3;
        this.f583m = price;
        this.f584n = priceCurrencyCode;
        this.f585o = str4;
        this.f586p = str5;
    }

    public final String a() {
        return this.f574d;
    }

    public final boolean b() {
        return this.f580j;
    }

    public final String c() {
        return this.f576f;
    }

    public final String d() {
        return this.f571a;
    }

    public final String e() {
        return this.f582l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return t.c(this.f571a, gVar.f571a) && t.c(this.f572b, gVar.f572b) && t.c(this.f573c, gVar.f573c) && t.c(this.f574d, gVar.f574d) && t.c(this.f575e, gVar.f575e) && t.c(this.f576f, gVar.f576f) && this.f577g == gVar.f577g && t.c(this.f578h, gVar.f578h) && this.f579i == gVar.f579i && this.f580j == gVar.f580j && this.f581k == gVar.f581k && t.c(this.f582l, gVar.f582l) && t.c(this.f583m, gVar.f583m) && t.c(this.f584n, gVar.f584n) && t.c(this.f585o, gVar.f585o) && t.c(this.f586p, gVar.f586p);
    }

    public final String f() {
        return this.f578h;
    }

    public final String g() {
        return this.f575e;
    }

    public final String h() {
        return this.f583m;
    }

    public int hashCode() {
        int iHashCode = ((this.f571a.hashCode() * 31) + this.f572b.hashCode()) * 31;
        String str = this.f573c;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f574d.hashCode()) * 31) + this.f575e.hashCode()) * 31;
        String str2 = this.f576f;
        int iHashCode3 = (((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f577g)) * 31) + this.f578h.hashCode()) * 31) + Boolean.hashCode(this.f579i)) * 31) + Boolean.hashCode(this.f580j)) * 31) + Boolean.hashCode(this.f581k)) * 31;
        String str3 = this.f582l;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f583m.hashCode()) * 31) + this.f584n.hashCode()) * 31;
        String str4 = this.f585o;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f586p;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.f584n;
    }

    public final String j() {
        return this.f585o;
    }

    public final String k() {
        return this.f586p;
    }

    public final String l() {
        return this.f573c;
    }

    public final String m() {
        return this.f572b;
    }

    public final boolean n() {
        return this.f577g;
    }

    public final boolean o() {
        return this.f581k;
    }

    public final boolean p() {
        return this.f579i;
    }

    public String toString() {
        return "Product(id=" + this.f571a + ", title=" + this.f572b + ", subtitle=" + this.f573c + ", formattedPrice=" + this.f574d + ", period=" + this.f575e + ", hint=" + this.f576f + ", isDefaultPackage=" + this.f577g + ", packageSubtitle=" + this.f578h + ", isSubscription=" + this.f579i + ", hasFreeTrialPeriod=" + this.f580j + ", isLegacy=" + this.f581k + ", offeringIdentifier=" + this.f582l + ", price=" + this.f583m + ", priceCurrencyCode=" + this.f584n + ", subscriptionPeriod=" + this.f585o + ", subscriptionPeriodUnit=" + this.f586p + ")";
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, String str5, String str6, boolean z8, String str7, boolean z9, boolean z10, boolean z11, String str8, String str9, String str10, String str11, String str12, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, (i8 & 4) != 0 ? null : str3, str4, str5, (i8 & 32) != 0 ? null : str6, z8, str7, (i8 & 256) != 0 ? false : z9, (i8 & 512) != 0 ? false : z10, (i8 & 1024) != 0 ? false : z11, (i8 & 2048) != 0 ? null : str8, str9, str10, (i8 & 16384) != 0 ? null : str11, (i8 & 32768) != 0 ? null : str12);
    }
}
