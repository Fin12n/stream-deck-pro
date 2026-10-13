package p052f6;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p070h6.a;
import p070h6.g;
import p090k.zI.jULK;

/* JADX INFO: renamed from: f6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2314e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f22052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f22055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f22062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f22063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f22064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EnumC2316g f22065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f22066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f22067p;

    public C2314e(short s8, String name, String openSSLName, p exchangeType, String jdkCipherName, int i8, int i9, int i10, int i11, String macName, int i12, a hash, g signatureAlgorithm, EnumC2316g enumC2316g) {
        t.g(name, "name");
        t.g(openSSLName, "openSSLName");
        t.g(exchangeType, "exchangeType");
        t.g(jdkCipherName, "jdkCipherName");
        t.g(macName, "macName");
        t.g(hash, "hash");
        t.g(signatureAlgorithm, "signatureAlgorithm");
        t.g(enumC2316g, jULK.ssmaNjbx);
        this.f22052a = s8;
        this.f22053b = name;
        this.f22054c = openSSLName;
        this.f22055d = exchangeType;
        this.f22056e = jdkCipherName;
        this.f22057f = i8;
        this.f22058g = i9;
        this.f22059h = i10;
        this.f22060i = i11;
        this.f22061j = macName;
        this.f22062k = i12;
        this.f22063l = hash;
        this.f22064m = signatureAlgorithm;
        this.f22065n = enumC2316g;
        this.f22066o = i8 / 8;
        this.f22067p = i12 / 8;
    }

    public final int a() {
        return this.f22060i;
    }

    public final EnumC2316g b() {
        return this.f22065n;
    }

    public final short c() {
        return this.f22052a;
    }

    public final p d() {
        return this.f22055d;
    }

    public final int e() {
        return this.f22058g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2314e)) {
            return false;
        }
        C2314e c2314e = (C2314e) obj;
        return this.f22052a == c2314e.f22052a && t.c(this.f22053b, c2314e.f22053b) && t.c(this.f22054c, c2314e.f22054c) && this.f22055d == c2314e.f22055d && t.c(this.f22056e, c2314e.f22056e) && this.f22057f == c2314e.f22057f && this.f22058g == c2314e.f22058g && this.f22059h == c2314e.f22059h && this.f22060i == c2314e.f22060i && t.c(this.f22061j, c2314e.f22061j) && this.f22062k == c2314e.f22062k && this.f22063l == c2314e.f22063l && this.f22064m == c2314e.f22064m && this.f22065n == c2314e.f22065n;
    }

    public final a f() {
        return this.f22063l;
    }

    public final int g() {
        return this.f22059h;
    }

    public final String h() {
        return this.f22056e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Short.hashCode(this.f22052a) * 31) + this.f22053b.hashCode()) * 31) + this.f22054c.hashCode()) * 31) + this.f22055d.hashCode()) * 31) + this.f22056e.hashCode()) * 31) + Integer.hashCode(this.f22057f)) * 31) + Integer.hashCode(this.f22058g)) * 31) + Integer.hashCode(this.f22059h)) * 31) + Integer.hashCode(this.f22060i)) * 31) + this.f22061j.hashCode()) * 31) + Integer.hashCode(this.f22062k)) * 31) + this.f22063l.hashCode()) * 31) + this.f22064m.hashCode()) * 31) + this.f22065n.hashCode();
    }

    public final int i() {
        return this.f22057f;
    }

    public final int j() {
        return this.f22066o;
    }

    public final String k() {
        return this.f22061j;
    }

    public final int l() {
        return this.f22067p;
    }

    public final String m() {
        return this.f22053b;
    }

    public final g n() {
        return this.f22064m;
    }

    public String toString() {
        return "CipherSuite(code=" + ((int) this.f22052a) + ", name=" + this.f22053b + ", openSSLName=" + this.f22054c + ", exchangeType=" + this.f22055d + ", jdkCipherName=" + this.f22056e + ", keyStrength=" + this.f22057f + ", fixedIvLength=" + this.f22058g + ", ivLength=" + this.f22059h + ", cipherTagSizeInBytes=" + this.f22060i + ", macName=" + this.f22061j + ", macStrength=" + this.f22062k + ", hash=" + this.f22063l + ", signatureAlgorithm=" + this.f22064m + ", cipherType=" + this.f22065n + ')';
    }

    public /* synthetic */ C2314e(short s8, String str, String str2, p pVar, String str3, int i8, int i9, int i10, int i11, String str4, int i12, a aVar, g gVar, EnumC2316g enumC2316g, int i13, AbstractC2633k abstractC2633k) {
        this(s8, str, str2, pVar, str3, i8, i9, i10, i11, str4, i12, aVar, gVar, (i13 & 8192) != 0 ? EnumC2316g.GCM : enumC2316g);
    }
}
