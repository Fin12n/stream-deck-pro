package u7;

import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC2633k;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34839e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f34840f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f34841g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f34845d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final w b(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a() {
        }

        public final w a(String str) {
            kotlin.jvm.internal.t.g(str, jULK.twsFCDXuppfCWq);
            Matcher matcher = w.f34840f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.t.f(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            kotlin.jvm.internal.t.f(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            kotlin.jvm.internal.t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            kotlin.jvm.internal.t.f(strGroup2, "typeSubtype.group(2)");
            kotlin.jvm.internal.t.f(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            kotlin.jvm.internal.t.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = w.f34841g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ZWZaxQrCHfNe.mSHhd);
                    String strSubstring = str.substring(iEnd);
                    kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (Z6.v.H(strGroup4, "'", false, 2, null) && Z6.v.u(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        kotlin.jvm.internal.t.f(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new w(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }
    }

    public /* synthetic */ w(String str, String str2, String str3, String[] strArr, AbstractC2633k abstractC2633k) {
        this(str, str2, str3, strArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && kotlin.jvm.internal.t.c(((w) obj).f34842a, this.f34842a);
    }

    public int hashCode() {
        return this.f34842a.hashCode();
    }

    public String toString() {
        return this.f34842a;
    }

    public w(String str, String str2, String str3, String[] strArr) {
        this.f34842a = str;
        this.f34843b = str2;
        this.f34844c = str3;
        this.f34845d = strArr;
    }
}
