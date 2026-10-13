package X5;

import P2.Lsk.mHPawN;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: X5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1674c extends AbstractC1682k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11807f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1674c f11808g = new C1674c("*", "*", null, 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11810e;

    /* JADX INFO: renamed from: X5.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C1674c f11817g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1674c f11824n;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final C1674c f11831u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11811a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1674c f11812b = new C1674c("application", "*", null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1674c f11813c = new C1674c("application", "atom+xml", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1674c f11814d = new C1674c("application", "cbor", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C1674c f11815e = new C1674c("application", "json", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C1674c f11816f = new C1674c("application", "hal+json", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C1674c f11818h = new C1674c("application", "octet-stream", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C1674c f11819i = new C1674c("application", "rss+xml", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C1674c f11820j = new C1674c("application", "xml", null, 4, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final C1674c f11821k = new C1674c("application", "xml-dtd", null, 4, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final C1674c f11822l = new C1674c("application", "zip", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final C1674c f11823m = new C1674c("application", "gzip", null, 4, null);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final C1674c f11825o = new C1674c("application", "pdf", null, 4, null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final C1674c f11826p = new C1674c("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final C1674c f11827q = new C1674c("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C1674c f11828r = new C1674c("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final C1674c f11829s = new C1674c("application", "protobuf", null, 4, 0 == true ? 1 : 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C1674c f11830t = new C1674c("application", "wasm", null, 4, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final C1674c f11832v = new C1674c("application", "problem+xml", null, 4, null);

        /* JADX WARN: Multi-variable type inference failed */
        static {
            AbstractC2633k abstractC2633k = null;
            f11817g = new C1674c("application", "javascript", null, 4, abstractC2633k);
            f11824n = new C1674c("application", "x-www-form-urlencoded", null, 4, abstractC2633k);
            f11831u = new C1674c("application", "problem+json", null, 4, abstractC2633k);
        }

        public final C1674c a() {
            return f11815e;
        }

        public final C1674c b() {
            return f11818h;
        }
    }

    /* JADX INFO: renamed from: X5.c$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C1674c a() {
            return C1674c.f11808g;
        }

        public final C1674c b(String value) throws C1672a {
            kotlin.jvm.internal.t.g(value, "value");
            if (Z6.w.b0(value)) {
                return a();
            }
            AbstractC1682k.a aVar = AbstractC1682k.f11852c;
            C1680i c1680i = (C1680i) D6.z.t0(AbstractC1687p.c(value));
            String strD = c1680i.d();
            List listB = c1680i.b();
            int iX = Z6.w.X(strD, '/', 0, false, 6, null);
            if (iX == -1) {
                if (kotlin.jvm.internal.t.c(Z6.w.W0(strD).toString(), "*")) {
                    return C1674c.f11807f.a();
                }
                throw new C1672a(value);
            }
            String strSubstring = strD.substring(0, iX);
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = Z6.w.W0(strSubstring).toString();
            if (string.length() == 0) {
                throw new C1672a(value);
            }
            String strSubstring2 = strD.substring(iX + 1);
            kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String string2 = Z6.w.W0(strSubstring2).toString();
            if (Z6.w.L(string, ' ', false, 2, null) || Z6.w.L(string2, ' ', false, 2, null)) {
                throw new C1672a(value);
            }
            if (string2.length() == 0 || Z6.w.L(string2, '/', false, 2, null)) {
                throw new C1672a(value);
            }
            return new C1674c(string, string2, listB);
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: X5.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0302c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0302c f11833a = new C0302c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1674c f11834b = new C1674c("text", "*", null, 4, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1674c f11835c = new C1674c("text", "plain", null, 4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1674c f11836d = new C1674c("text", "css", null, 4, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C1674c f11837e = new C1674c("text", "csv", null, 4, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C1674c f11838f = new C1674c("text", "html", null, 4, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C1674c f11839g = new C1674c("text", "javascript", null, 4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C1674c f11840h = new C1674c("text", "vcard", null, 4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C1674c f11841i = new C1674c("text", "xml", null, 4, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C1674c f11842j = new C1674c("text", "event-stream", null, 4, null);

        public final C1674c a() {
            return f11835c;
        }
    }

    public C1674c(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f11809d = str;
        this.f11810e = str2;
    }

    public final String e() {
        return this.f11809d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1674c)) {
            return false;
        }
        C1674c c1674c = (C1674c) obj;
        return Z6.v.v(this.f11809d, c1674c.f11809d, true) && Z6.v.v(this.f11810e, c1674c.f11810e, true) && kotlin.jvm.internal.t.c(b(), c1674c.b());
    }

    public final boolean f(String str, String str2) {
        int size = b().size();
        if (size != 0) {
            if (size != 1) {
                List<C1681j> listB = b();
                if (listB != null && listB.isEmpty()) {
                    return false;
                }
                for (C1681j c1681j : listB) {
                    if (Z6.v.v(c1681j.c(), str, true) && Z6.v.v(c1681j.d(), str2, true)) {
                        return true;
                    }
                }
                return false;
            }
            C1681j c1681j2 = (C1681j) b().get(0);
            if (Z6.v.v(c1681j2.c(), str, true) && Z6.v.v(c1681j2.d(), str2, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(C1674c pattern) {
        boolean zV;
        kotlin.jvm.internal.t.g(pattern, "pattern");
        if (!kotlin.jvm.internal.t.c(pattern.f11809d, "*") && !Z6.v.v(pattern.f11809d, this.f11809d, true)) {
            return false;
        }
        if (!kotlin.jvm.internal.t.c(pattern.f11810e, "*") && !Z6.v.v(pattern.f11810e, this.f11810e, true)) {
            return false;
        }
        for (C1681j c1681j : pattern.b()) {
            String strA = c1681j.a();
            String strB = c1681j.b();
            if (!kotlin.jvm.internal.t.c(strA, "*")) {
                String strC = c(strA);
                zV = kotlin.jvm.internal.t.c(strB, "*") ? strC != null : Z6.v.v(strC, strB, true);
            } else if (!kotlin.jvm.internal.t.c(strB, "*")) {
                List listB = b();
                if (listB == null || !listB.isEmpty()) {
                    Iterator it = listB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Z6.v.v(((C1681j) it.next()).d(), strB, true)) {
                            }
                        }
                    }
                }
            }
            if (!zV) {
                return false;
            }
        }
        return true;
    }

    public final C1674c h(String name, String value) {
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(value, "value");
        return f(name, value) ? this : new C1674c(this.f11809d, this.f11810e, a(), D6.z.C0(b(), new C1681j(name, value)));
    }

    public final C1674c i() {
        if (b().isEmpty()) {
            return this;
        }
        return new C1674c(this.f11809d, this.f11810e, null, 4, null);
    }

    public int hashCode() {
        String str = this.f11809d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String str2 = mHPawN.auwdQb;
        kotlin.jvm.internal.t.f(lowerCase, str2);
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f11810e.toLowerCase(locale);
        kotlin.jvm.internal.t.f(lowerCase2, str2);
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }

    public /* synthetic */ C1674c(String str, String str2, List list, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, (i8 & 4) != 0 ? D6.r.n() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1674c(String contentType, String contentSubtype, List<C1681j> parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        kotlin.jvm.internal.t.g(contentType, "contentType");
        kotlin.jvm.internal.t.g(contentSubtype, "contentSubtype");
        kotlin.jvm.internal.t.g(parameters, "parameters");
    }
}
