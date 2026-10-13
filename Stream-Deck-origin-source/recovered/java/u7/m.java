package u7;

import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2633k;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f34777j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f34778k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f34779l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f34780m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f34781n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f34790i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a(String str, int i8, int i9, boolean z8) {
            while (i8 < i9) {
                char cCharAt = str.charAt(i8);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z8)) {
                    return i8;
                }
                i8++;
            }
            return i9;
        }

        public final boolean b(String str, String str2) {
            if (kotlin.jvm.internal.t.c(str, str2)) {
                return true;
            }
            return Z6.v.u(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !v7.d.i(str);
        }

        public final m c(u url, String setCookie) {
            kotlin.jvm.internal.t.g(url, "url");
            kotlin.jvm.internal.t.g(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long j8, u url, String setCookie) {
            long j9;
            kotlin.jvm.internal.t.g(url, "url");
            kotlin.jvm.internal.t.g(setCookie, "setCookie");
            int iR = v7.d.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = v7.d.r(setCookie, '=', 0, iR, 2, null);
            m mVar = null;
            if (iR2 == iR) {
                return null;
            }
            String strZ = v7.d.Z(setCookie, 0, iR2, 1, null);
            if (strZ.length() == 0 || v7.d.y(strZ) != -1) {
                return null;
            }
            String strY = v7.d.Y(setCookie, iR2 + 1, iR);
            if (v7.d.y(strY) != -1) {
                return null;
            }
            int i8 = iR + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i8 < length) {
                int iP = v7.d.p(setCookie, ';', i8, length);
                int iP2 = v7.d.p(setCookie, '=', i8, iP);
                String strY2 = v7.d.Y(setCookie, i8, iP2);
                String strY3 = iP2 < iP ? v7.d.Y(setCookie, iP2 + 1, iP) : "";
                m mVar2 = mVar;
                if (Z6.v.v(strY2, "expires", true)) {
                    try {
                        jG = g(strY3, 0, strY3.length());
                        z9 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (Z6.v.v(strY2, "max-age", true)) {
                    jH = h(strY3);
                    z9 = true;
                } else if (Z6.v.v(strY2, "domain", true)) {
                    strF = f(strY3);
                    z11 = false;
                } else if (Z6.v.v(strY2, "path", true)) {
                    str = strY3;
                } else if (Z6.v.v(strY2, "secure", true)) {
                    z10 = true;
                } else if (Z6.v.v(strY2, "httponly", true)) {
                    z8 = true;
                }
                i8 = iP + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j9 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j10 = j8 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j9 = (j10 < j8 || j10 > 253402300799999L) ? 253402300799999L : j10;
            } else {
                j9 = jG;
            }
            String strH = url.h();
            if (strF == null) {
                strF = strH;
            } else if (!b(strH, strF)) {
                return mVar3;
            }
            if (strH.length() != strF.length() && PublicSuffixDatabase.f31008e.c().c(strF) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !Z6.v.H(str, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iE0 = Z6.w.e0(strD, '/', 0, false, 6, null);
                if (iE0 != 0) {
                    strSubstring = strD.substring(0, iE0);
                    kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strZ, strY, j9, strF, str, z10, z8, z9, z11, null);
        }

        public final List e(u url, t headers) {
            kotlin.jvm.internal.t.g(url, "url");
            kotlin.jvm.internal.t.g(headers, "headers");
            List listY = headers.y("Set-Cookie");
            int size = listY.size();
            ArrayList arrayList = null;
            for (int i8 = 0; i8 < size; i8++) {
                m mVarC = c(url, (String) listY.get(i8));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return D6.r.n();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.t.f(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        public final String f(String str) {
            if (Z6.v.u(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = v7.a.e(Z6.w.q0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        public final long g(String str, int i8, int i9) {
            int iA = a(str, i8, i9, false);
            Matcher matcher = m.f34781n.matcher(str);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int iY = -1;
            int i13 = -1;
            int i14 = -1;
            while (iA < i9) {
                int iA2 = a(str, iA + 1, i9, true);
                matcher.region(iA, iA2);
                if (i11 == -1 && matcher.usePattern(m.f34781n).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.t.f(strGroup, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.t.f(strGroup2, "matcher.group(2)");
                    i13 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.t.f(strGroup3, "matcher.group(3)");
                    i14 = Integer.parseInt(strGroup3);
                } else if (i12 == -1 && matcher.usePattern(m.f34780m).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.t.f(strGroup4, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup4);
                } else if (iY == -1 && matcher.usePattern(m.f34779l).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.t.f(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.t.f(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    kotlin.jvm.internal.t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f34779l.pattern();
                    kotlin.jvm.internal.t.f(strPattern, "MONTH_PATTERN.pattern()");
                    iY = Z6.w.Y(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i10 == -1 && matcher.usePattern(m.f34778k).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.t.f(strGroup6, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i9, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iY == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i12 || i12 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(v7.d.f35184f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i10);
            gregorianCalendar.set(2, iY - 1);
            gregorianCalendar.set(5, i12);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i13);
            gregorianCalendar.set(13, i14);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final long h(String str) {
            try {
                long j8 = Long.parseLong(str);
                if (j8 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j8;
            } catch (NumberFormatException e8) {
                if (new Z6.j("-?\\d+").d(str)) {
                    return Z6.v.H(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e8;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j8, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11, AbstractC2633k abstractC2633k) {
        this(str, str2, j8, str3, str4, z8, z9, z10, z11);
    }

    public final String e() {
        return this.f34782a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.t.c(mVar.f34782a, this.f34782a) && kotlin.jvm.internal.t.c(mVar.f34783b, this.f34783b) && mVar.f34784c == this.f34784c && kotlin.jvm.internal.t.c(mVar.f34785d, this.f34785d) && kotlin.jvm.internal.t.c(mVar.f34786e, this.f34786e) && mVar.f34787f == this.f34787f && mVar.f34788g == this.f34788g && mVar.f34789h == this.f34789h && mVar.f34790i == this.f34790i;
    }

    public final String g() {
        return this.f34783b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f34782a.hashCode()) * 31) + this.f34783b.hashCode()) * 31) + Long.hashCode(this.f34784c)) * 31) + this.f34785d.hashCode()) * 31) + this.f34786e.hashCode()) * 31) + Boolean.hashCode(this.f34787f)) * 31) + Boolean.hashCode(this.f34788g)) * 31) + Boolean.hashCode(this.f34789h)) * 31) + Boolean.hashCode(this.f34790i);
    }

    public String toString() {
        return f(false);
    }

    public m(String str, String str2, long j8, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f34782a = str;
        this.f34783b = str2;
        this.f34784c = j8;
        this.f34785d = str3;
        this.f34786e = str4;
        this.f34787f = z8;
        this.f34788g = z9;
        this.f34789h = z10;
        this.f34790i = z11;
    }

    public final String f(boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34782a);
        sb.append('=');
        sb.append(this.f34783b);
        if (this.f34789h) {
            if (this.f34784c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(A7.c.b(new Date(this.f34784c)));
            }
        }
        if (!this.f34790i) {
            sb.append(yOZfxp.zUHDWdwD);
            if (z8) {
                sb.append(".");
            }
            sb.append(this.f34785d);
        }
        sb.append("; path=");
        sb.append(this.f34786e);
        if (this.f34787f) {
            sb.append("; secure");
        }
        if (this.f34788g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "toString()");
        return string;
    }
}
