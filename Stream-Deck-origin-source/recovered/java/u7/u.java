package u7;

import D6.C0938s;
import H.FL.dCqzKmEghGTQ;
import J7.C1034e;
import V.ocy.SVzBK;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p181u6.GfRt.QhsKALGiniuQ;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f34818k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f34819l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f34825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f34826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f34827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f34828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f34829j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0789a f34830i = new C0789a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f34832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f34834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f34835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f34836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f34837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f34838h;

        /* JADX INFO: renamed from: u7.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0789a {
            public /* synthetic */ C0789a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final int e(String str, int i8, int i9) {
                try {
                    int i10 = Integer.parseInt(b.b(u.f34818k, str, i8, i9, "", false, false, false, false, null, 248, null));
                    if (1 > i10 || i10 >= 65536) {
                        return -1;
                    }
                    return i10;
                } catch (NumberFormatException unused) {
                }
            }

            public final int f(String str, int i8, int i9) {
                while (i8 < i9) {
                    char cCharAt = str.charAt(i8);
                    if (cCharAt == '[') {
                        do {
                            i8++;
                            if (i8 >= i9) {
                                break;
                            }
                        } while (str.charAt(i8) != ']');
                    } else if (cCharAt == ':') {
                        return i8;
                    }
                    i8++;
                }
                return i9;
            }

            public final int g(String str, int i8, int i9) {
                if (i9 - i8 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i8);
                if ((kotlin.jvm.internal.t.h(cCharAt, 97) >= 0 && kotlin.jvm.internal.t.h(cCharAt, 122) <= 0) || (kotlin.jvm.internal.t.h(cCharAt, 65) >= 0 && kotlin.jvm.internal.t.h(cCharAt, 90) <= 0)) {
                    while (true) {
                        i8++;
                        if (i8 >= i9) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i8);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            public final int h(String str, int i8, int i9) {
                int i10 = 0;
                while (i8 < i9) {
                    char cCharAt = str.charAt(i8);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i10++;
                    i8++;
                }
                return i10;
            }

            public C0789a() {
            }
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f34831a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f34818k;
            String strH = b.h(bVar, this.f34832b, 0, 0, false, 7, null);
            String strH2 = b.h(bVar, this.f34833c, 0, 0, false, 7, null);
            String str2 = this.f34834d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f34836f;
            ArrayList arrayList2 = new ArrayList(C0938s.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.h(u.f34818k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f34837g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(C0938s.y(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.h(u.f34818k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f34838h;
            return new u(str, strH, strH2, str2, iB, arrayList2, arrayList, str4 != null ? b.h(u.f34818k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final int b() {
            int i8 = this.f34835e;
            if (i8 != -1) {
                return i8;
            }
            b bVar = u.f34818k;
            String str = this.f34831a;
            kotlin.jvm.internal.t.d(str);
            return bVar.c(str);
        }

        public final a c(String str) {
            b bVar;
            String strB;
            this.f34837g = (str == null || (strB = b.b((bVar = u.f34818k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.j(strB);
            return this;
        }

        public final List d() {
            return this.f34836f;
        }

        public final a e(String host) {
            kotlin.jvm.internal.t.g(host, "host");
            String strE = v7.a.e(b.h(u.f34818k, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f34834d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final boolean f(String str) {
            return kotlin.jvm.internal.t.c(str, ".") || Z6.v.v(str, "%2e", true);
        }

        public final a h(u uVar, String str) {
            String str2;
            int iQ;
            int i8;
            boolean z8;
            int i9;
            int i10;
            int i11;
            char c8;
            int i12;
            String input = str;
            kotlin.jvm.internal.t.g(input, "input");
            int iA = v7.d.A(input, 0, 0, 3, null);
            int iC = v7.d.C(input, iA, 0, 2, null);
            C0789a c0789a = f34830i;
            int iG = c0789a.g(input, iA, iC);
            String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z9 = true;
            int i13 = -1;
            if (iG != -1) {
                if (Z6.v.E(input, "https:", iA, true)) {
                    this.f34831a = "https";
                    iA += 6;
                } else {
                    if (!Z6.v.E(input, "http:", iA, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f34831a = "http";
                    iA += 5;
                }
            } else {
                if (uVar == null) {
                    if (input.length() > 6) {
                        str2 = Z6.y.d1(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f34831a = uVar.p();
            }
            int iH = c0789a.h(input, iA, iC);
            int i14 = 63;
            int i15 = 35;
            if (iH >= 2 || uVar == null || !kotlin.jvm.internal.t.c(uVar.p(), this.f34831a)) {
                int i16 = iA + iH;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iQ = v7.d.q(input, "@/\\?#", i16, iC);
                    int iCharAt = iQ != iC ? input.charAt(iQ) : i13;
                    if (iCharAt == i13 || iCharAt == i15 || iCharAt == 47 || iCharAt == 92 || iCharAt == i14) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z10) {
                            z8 = z9;
                            i9 = i13;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f34833c);
                            sb2.append("%40");
                            input = str;
                            i10 = iQ;
                            sb2.append(b.b(u.f34818k, input, i16, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f34833c = sb2.toString();
                        } else {
                            int iP = v7.d.p(input, ':', i16, iQ);
                            b bVar = u.f34818k;
                            i9 = i13;
                            z8 = z9;
                            String strB = b.b(bVar, input, i16, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z11) {
                                strB = this.f34832b + "%40" + strB;
                            }
                            this.f34832b = strB;
                            if (iP != iQ) {
                                i11 = iQ;
                                this.f34833c = b.b(bVar, str, iP + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z10 = z8;
                            } else {
                                i11 = iQ;
                            }
                            input = str;
                            i10 = i11;
                            z11 = z8;
                        }
                        i16 = i10 + 1;
                        i13 = i9;
                        iC = iC;
                        str3 = str3;
                        z9 = z8;
                        i14 = 63;
                        i15 = 35;
                    }
                }
                i8 = iC;
                String str4 = str3;
                int i17 = i13;
                C0789a c0789a2 = f34830i;
                int iF = c0789a2.f(input, i16, iQ);
                int i18 = iF + 1;
                if (i18 < iQ) {
                    this.f34834d = v7.a.e(b.h(u.f34818k, input, i16, iF, false, 4, null));
                    int iE = c0789a2.e(input, i18, iQ);
                    this.f34835e = iE;
                    if (iE == i17) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i18, iQ);
                        kotlin.jvm.internal.t.f(strSubstring2, str4);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    b bVar2 = u.f34818k;
                    this.f34834d = v7.a.e(b.h(bVar2, input, i16, iF, false, 4, null));
                    String str5 = this.f34831a;
                    kotlin.jvm.internal.t.d(str5);
                    this.f34835e = bVar2.c(str5);
                }
                if (this.f34834d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i16, iF);
                    kotlin.jvm.internal.t.f(strSubstring3, str4);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iA = iQ;
            } else {
                this.f34832b = uVar.g();
                this.f34833c = uVar.c();
                this.f34834d = uVar.h();
                this.f34835e = uVar.l();
                this.f34836f.clear();
                this.f34836f.addAll(uVar.e());
                if (iA == iC || input.charAt(iA) == '#') {
                    c(uVar.f());
                }
                i8 = iC;
            }
            int i19 = i8;
            int iQ2 = v7.d.q(input, "?#", iA, i19);
            n(input, iA, iQ2);
            if (iQ2 >= i19 || input.charAt(iQ2) != '?') {
                c8 = '#';
                i12 = iQ2;
            } else {
                c8 = '#';
                int iP2 = v7.d.p(input, '#', iQ2, i19);
                b bVar3 = u.f34818k;
                this.f34837g = bVar3.j(b.b(bVar3, input, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, 208, null));
                i12 = iP2;
            }
            if (i12 < i19 && input.charAt(i12) == c8) {
                this.f34838h = b.b(u.f34818k, input, i12 + 1, i19, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String password) {
            kotlin.jvm.internal.t.g(password, "password");
            this.f34833c = b.b(u.f34818k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final void j() {
            List list = this.f34836f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f34836f.isEmpty()) {
                this.f34836f.add("");
            } else {
                List list2 = this.f34836f;
                list2.set(list2.size() - 1, "");
            }
        }

        public final a k(int i8) {
            if (1 <= i8 && i8 < 65536) {
                this.f34835e = i8;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i8).toString());
        }

        public final void l(String str, int i8, int i9, boolean z8, boolean z9) {
            String strB = b.b(u.f34818k, str, i8, i9, " \"<>^`{}|/\\?#", z9, false, false, false, null, 240, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                j();
                return;
            }
            List list = this.f34836f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f34836f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f34836f.add(strB);
            }
            if (z8) {
                this.f34836f.add("");
            }
        }

        public final a m() {
            String str = this.f34834d;
            this.f34834d = str != null ? new Z6.j("[\"<>^`{|}]").f(str, "") : null;
            int size = this.f34836f.size();
            for (int i8 = 0; i8 < size; i8++) {
                List list = this.f34836f;
                list.set(i8, b.b(u.f34818k, (String) list.get(i8), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f34837g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    String str2 = (String) list2.get(i9);
                    list2.set(i9, str2 != null ? b.b(u.f34818k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f34838h;
            this.f34838h = str3 != null ? b.b(u.f34818k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final void n(String str, int i8, int i9) {
            if (i8 == i9) {
                return;
            }
            char cCharAt = str.charAt(i8);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f34836f.clear();
                this.f34836f.add("");
                i8++;
            } else {
                List list = this.f34836f;
                list.set(list.size() - 1, "");
            }
            int i10 = i8;
            while (i10 < i9) {
                int iQ = v7.d.q(str, "/\\", i10, i9);
                boolean z8 = iQ < i9;
                str = str;
                l(str, i10, iQ, z8, true);
                i10 = z8 ? iQ + 1 : iQ;
            }
        }

        public final void p(String str) {
            this.f34838h = str;
        }

        public final void q(String str) {
            kotlin.jvm.internal.t.g(str, "<set-?>");
            this.f34833c = str;
        }

        public final void r(String str) {
            kotlin.jvm.internal.t.g(str, "<set-?>");
            this.f34832b = str;
        }

        public final void s(String str) {
            this.f34834d = str;
        }

        public final void t(int i8) {
            this.f34835e = i8;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f34831a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f34832b.length() > 0 || this.f34833c.length() > 0) {
                sb.append(this.f34832b);
                if (this.f34833c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f34833c);
                }
                sb.append('@');
            }
            String str2 = this.f34834d;
            if (str2 != null) {
                kotlin.jvm.internal.t.d(str2);
                if (Z6.w.L(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f34834d);
                    sb.append(']');
                } else {
                    sb.append(this.f34834d);
                }
            }
            if (this.f34835e != -1 || this.f34831a != null) {
                int iB = b();
                String str3 = this.f34831a;
                if (str3 != null) {
                    b bVar = u.f34818k;
                    kotlin.jvm.internal.t.d(str3);
                    if (iB != bVar.c(str3)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                } else {
                    sb.append(':');
                    sb.append(iB);
                }
            }
            b bVar2 = u.f34818k;
            bVar2.i(this.f34836f, sb);
            if (this.f34837g != null) {
                sb.append('?');
                List list = this.f34837g;
                kotlin.jvm.internal.t.d(list);
                bVar2.k(list, sb);
            }
            if (this.f34838h != null) {
                sb.append('#');
                sb.append(this.f34838h);
            }
            String string = sb.toString();
            kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(String str) {
            this.f34831a = str;
        }

        public final a v(String username) {
            kotlin.jvm.internal.t.g(username, "username");
            this.f34832b = b.b(u.f34818k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final boolean g(String str) {
            return kotlin.jvm.internal.t.c(str, "..") || Z6.v.v(str, "%2e.", true) || Z6.v.v(str, dCqzKmEghGTQ.guvhGCZbiC, true) || Z6.v.v(str, "%2e%2e", true);
        }

        public final a o(String scheme) {
            kotlin.jvm.internal.t.g(scheme, "scheme");
            if (Z6.v.v(scheme, "http", true)) {
                this.f34831a = "http";
                return this;
            }
            String str = QhsKALGiniuQ.wZHhpbBHPYCmQg;
            if (Z6.v.v(scheme, str, true)) {
                this.f34831a = str;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public a() {
            String str = QhsKALGiniuQ.zrafbfd;
            this.f34832b = str;
            this.f34833c = str;
            this.f34835e = -1;
            ArrayList arrayList = new ArrayList();
            this.f34836f = arrayList;
            arrayList.add(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = str.length();
            }
            if ((i10 & 8) != 0) {
                z8 = false;
            }
            if ((i10 & 16) != 0) {
                z9 = false;
            }
            if ((i10 & 32) != 0) {
                z10 = false;
            }
            if ((i10 & 64) != 0) {
                z11 = false;
            }
            if ((i10 & 128) != 0) {
                charset = null;
            }
            return bVar.a(str, i8, i9, str2, z8, z9, z10, z11, charset);
        }

        public static /* synthetic */ String h(b bVar, String str, int i8, int i9, boolean z8, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = str.length();
            }
            if ((i10 & 4) != 0) {
                z8 = false;
            }
            return bVar.g(str, i8, i9, z8);
        }

        public final String a(String str, int i8, int i9, String encodeSet, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) throws EOFException {
            kotlin.jvm.internal.t.g(str, "<this>");
            kotlin.jvm.internal.t.g(encodeSet, "encodeSet");
            int iCharCount = i8;
            while (iCharCount < i9) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z11) || Z6.w.L(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z8 || (z9 && !e(str, iCharCount, i9)))) || (iCodePointAt == 43 && z10)))) {
                    C1034e c1034e = new C1034e();
                    c1034e.b1(str, i8, iCharCount);
                    l(c1034e, str, iCharCount, i9, encodeSet, z8, z9, z10, z11, charset);
                    return c1034e.o1();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i8, i9);
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final u d(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            return new a().h(null, str).a();
        }

        public final boolean e(String str, int i8, int i9) {
            int i10 = i8 + 2;
            return i10 < i9 && str.charAt(i8) == '%' && v7.d.I(str.charAt(i8 + 1)) != -1 && v7.d.I(str.charAt(i10)) != -1;
        }

        public final u f(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i8, int i9, boolean z8) {
            kotlin.jvm.internal.t.g(str, "<this>");
            for (int i10 = i8; i10 < i9; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '%' || (cCharAt == '+' && z8)) {
                    C1034e c1034e = new C1034e();
                    c1034e.b1(str, i8, i10);
                    m(c1034e, str, i10, i9, z8);
                    return c1034e.o1();
                }
            }
            String strSubstring = str.substring(i8, i9);
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List list, StringBuilder out) {
            kotlin.jvm.internal.t.g(list, "<this>");
            kotlin.jvm.internal.t.g(out, "out");
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                out.append('/');
                out.append((String) list.get(i8));
            }
        }

        public final List j(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            while (i8 <= str.length()) {
                String str2 = str;
                int iX = Z6.w.X(str2, '&', i8, false, 4, null);
                if (iX == -1) {
                    iX = str2.length();
                }
                int iX2 = Z6.w.X(str2, '=', i8, false, 4, null);
                if (iX2 == -1 || iX2 > iX) {
                    String strSubstring = str2.substring(i8, iX);
                    kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i8, iX2);
                    kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iX2 + 1, iX);
                    kotlin.jvm.internal.t.f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i8 = iX + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder out) {
            kotlin.jvm.internal.t.g(list, "<this>");
            kotlin.jvm.internal.t.g(out, "out");
            W6.g gVarT = W6.n.t(W6.n.v(0, list.size()), 2);
            int iS = gVarT.s();
            int iT = gVarT.t();
            int iU = gVarT.u();
            if ((iU <= 0 || iS > iT) && (iU >= 0 || iT > iS)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iS);
                String str2 = (String) list.get(iS + 1);
                if (iS > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iS == iT) {
                    return;
                } else {
                    iS += iU;
                }
            }
        }

        public final void l(C1034e c1034e, String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) throws EOFException {
            int iCharCount = i8;
            C1034e c1034e2 = null;
            while (iCharCount < i9) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z8 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z10) {
                        c1034e.I0(z8 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z11)) {
                            if (!Z6.w.L(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z8 && (!z9 || e(str, iCharCount, i9))))) {
                                c1034e.e2(iCodePointAt);
                            }
                        }
                        if (c1034e2 == null) {
                            c1034e2 = new C1034e();
                        }
                        if (charset == null || kotlin.jvm.internal.t.c(charset, StandardCharsets.UTF_8)) {
                            c1034e2.e2(iCodePointAt);
                        } else {
                            c1034e2.b2(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c1034e2.f0()) {
                            byte b8 = c1034e2.readByte();
                            c1034e.writeByte(37);
                            c1034e.writeByte(u.f34819l[((b8 & 255) >> 4) & 15]);
                            c1034e.writeByte(u.f34819l[b8 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        public final void m(C1034e c1034e, String str, int i8, int i9, boolean z8) {
            int i10;
            while (i8 < i9) {
                int iCodePointAt = str.codePointAt(i8);
                if (iCodePointAt == 37 && (i10 = i8 + 2) < i9) {
                    int I8 = v7.d.I(str.charAt(i8 + 1));
                    int I9 = v7.d.I(str.charAt(i10));
                    if (I8 == -1 || I9 == -1) {
                        c1034e.e2(iCodePointAt);
                        i8 += Character.charCount(iCodePointAt);
                    } else {
                        c1034e.writeByte((I8 << 4) + I9);
                        i8 = Character.charCount(iCodePointAt) + i10;
                    }
                } else if (iCodePointAt == 43 && z8) {
                    c1034e.writeByte(32);
                    i8++;
                } else {
                    c1034e.e2(iCodePointAt);
                    i8 += Character.charCount(iCodePointAt);
                }
            }
        }

        public b() {
        }

        public final int c(String str) {
            kotlin.jvm.internal.t.g(str, RaiWHuj.MUtxTKbkkBp);
            if (kotlin.jvm.internal.t.c(str, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.t.c(str, "https") ? 443 : -1;
        }
    }

    public u(String scheme, String username, String password, String host, int i8, List<String> pathSegments, List<String> list, String str, String url) {
        kotlin.jvm.internal.t.g(scheme, "scheme");
        kotlin.jvm.internal.t.g(username, "username");
        kotlin.jvm.internal.t.g(password, "password");
        kotlin.jvm.internal.t.g(host, "host");
        kotlin.jvm.internal.t.g(pathSegments, "pathSegments");
        kotlin.jvm.internal.t.g(url, "url");
        this.f34820a = scheme;
        this.f34821b = username;
        this.f34822c = password;
        this.f34823d = host;
        this.f34824e = i8;
        this.f34825f = pathSegments;
        this.f34826g = list;
        this.f34827h = str;
        this.f34828i = url;
        this.f34829j = kotlin.jvm.internal.t.c(scheme, "https");
    }

    public final String b() {
        if (this.f34827h == null) {
            return null;
        }
        String strSubstring = this.f34828i.substring(Z6.w.X(this.f34828i, '#', 0, false, 6, null) + 1);
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f34822c.length() == 0) {
            return "";
        }
        String strSubstring = this.f34828i.substring(Z6.w.X(this.f34828i, ':', this.f34820a.length() + 3, false, 4, null) + 1, Z6.w.X(this.f34828i, '@', 0, false, 6, null));
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iX = Z6.w.X(this.f34828i, '/', this.f34820a.length() + 3, false, 4, null);
        String str = this.f34828i;
        String strSubstring = this.f34828i.substring(iX, v7.d.q(str, "?#", iX, str.length()));
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iX = Z6.w.X(this.f34828i, '/', this.f34820a.length() + 3, false, 4, null);
        String str = this.f34828i;
        int iQ = v7.d.q(str, "?#", iX, str.length());
        ArrayList arrayList = new ArrayList();
        while (iX < iQ) {
            int i8 = iX + 1;
            int iP = v7.d.p(this.f34828i, '/', i8, iQ);
            String strSubstring = this.f34828i.substring(i8, iP);
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iX = iP;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && kotlin.jvm.internal.t.c(((u) obj).f34828i, this.f34828i);
    }

    public final String f() {
        if (this.f34826g == null) {
            return null;
        }
        int iX = Z6.w.X(this.f34828i, '?', 0, false, 6, null) + 1;
        String str = this.f34828i;
        String strSubstring = this.f34828i.substring(iX, v7.d.p(str, '#', iX, str.length()));
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f34821b.length() == 0) {
            return "";
        }
        int length = this.f34820a.length() + 3;
        String str = this.f34828i;
        String strSubstring = this.f34828i.substring(length, v7.d.q(str, ":@", length, str.length()));
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f34823d;
    }

    public int hashCode() {
        return this.f34828i.hashCode();
    }

    public final boolean i() {
        return this.f34829j;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f34820a);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f34823d);
        aVar.t(this.f34824e != f34818k.c(this.f34820a) ? this.f34824e : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String link) {
        kotlin.jvm.internal.t.g(link, "link");
        try {
            return new a().h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f34824e;
    }

    public final String m() {
        if (this.f34826g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f34818k.k(this.f34826g, sb);
        return sb.toString();
    }

    public final String n() {
        a aVarK = k("/...");
        kotlin.jvm.internal.t.d(aVarK);
        return aVarK.v("").i("").a().toString();
    }

    public final u o(String link) {
        kotlin.jvm.internal.t.g(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String p() {
        return this.f34820a;
    }

    public final URL r() {
        try {
            return new URL(this.f34828i);
        } catch (MalformedURLException e8) {
            throw new RuntimeException(e8);
        }
    }

    public String toString() {
        return this.f34828i;
    }

    public final URI q() {
        String string = j().m().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e8) {
            try {
                URI uriCreate = URI.create(new Z6.j(SVzBK.BUm).f(string, ""));
                kotlin.jvm.internal.t.f(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }
}
