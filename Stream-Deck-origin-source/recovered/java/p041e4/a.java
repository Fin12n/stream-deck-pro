package p041e4;

import E4.JFpq.XRlnZWSrAFn;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p032d4.b;
import p059g4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f20754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f20755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20756h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20758b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20751c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f20752d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20753e = strA3;
        f20754f = Collections.unmodifiableSet(new HashSet(Arrays.asList(b.b("proto"), b.b("json"))));
        f20755g = new a(strA, null);
        f20756h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f20757a = str;
        this.f20758b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // p059g4.d
    public Set a() {
        return f20754f;
    }

    public String d() {
        return this.f20758b;
    }

    public String e() {
        return this.f20757a;
    }

    @Override // p059g4.c
    public byte[] getExtras() {
        return b();
    }

    @Override // p059g4.c
    public String getName() {
        return "cct";
    }

    public byte[] b() {
        String str = this.f20758b;
        if (str == null && this.f20757a == null) {
            return null;
        }
        String str2 = this.f20757a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, XRlnZWSrAFn.psp, str).getBytes(Charset.forName(cFAYKUlMj.NFGC));
    }
}
