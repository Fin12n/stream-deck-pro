package X5;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f11769q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f11770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f11773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f11774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f11778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C6.j f11780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C6.j f11781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C6.j f11782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C6.j f11783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C6.j f11784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C6.j f11785p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            int iX = Z6.w.X(T.this.f11779j, '#', 0, false, 6, null) + 1;
            if (iX == 0) {
                return "";
            }
            String strSubstring = T.this.f11779j.substring(iX);
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            if (T.this.i() == null) {
                return null;
            }
            if (T.this.i().length() == 0) {
                return "";
            }
            String strSubstring = T.this.f11779j.substring(Z6.w.X(T.this.f11779j, ':', T.this.l().e().length() + 3, false, 4, null) + 1, Z6.w.X(T.this.f11779j, '@', 0, false, 6, null));
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            int iX;
            boolean zIsEmpty = T.this.j().isEmpty();
            String str = jULK.htrExE;
            if (zIsEmpty || (iX = Z6.w.X(T.this.f11779j, '/', T.this.l().e().length() + 3, false, 4, null)) == -1) {
                return str;
            }
            int iA0 = Z6.w.a0(T.this.f11779j, new char[]{'?', '#'}, iX, false, 4, null);
            if (iA0 == -1) {
                String strSubstring = T.this.f11779j.substring(iX);
                kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
            String strSubstring2 = T.this.f11779j.substring(iX, iA0);
            kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends kotlin.jvm.internal.u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            int iX = Z6.w.X(T.this.f11779j, '/', T.this.l().e().length() + 3, false, 4, null);
            if (iX == -1) {
                return "";
            }
            int iX2 = Z6.w.X(T.this.f11779j, '#', iX, false, 4, null);
            if (iX2 == -1) {
                String strSubstring = T.this.f11779j.substring(iX);
                kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
            String strSubstring2 = T.this.f11779j.substring(iX, iX2);
            kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends kotlin.jvm.internal.u implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            int iX = Z6.w.X(T.this.f11779j, '?', 0, false, 6, null) + 1;
            if (iX == 0) {
                return "";
            }
            int iX2 = Z6.w.X(T.this.f11779j, '#', iX, false, 4, null);
            if (iX2 == -1) {
                String strSubstring = T.this.f11779j.substring(iX);
                kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
            String strSubstring2 = T.this.f11779j.substring(iX, iX2);
            kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends kotlin.jvm.internal.u implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            if (T.this.o() == null) {
                return null;
            }
            if (T.this.o().length() == 0) {
                return "";
            }
            int length = T.this.l().e().length() + 3;
            String strSubstring = T.this.f11779j.substring(length, Z6.w.a0(T.this.f11779j, new char[]{':', '@'}, length, false, 4, null));
            kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
    }

    public T(O protocol, String host, int i8, List<String> pathSegments, C parameters, String fragment, String str, String str2, boolean z8, String urlString) {
        kotlin.jvm.internal.t.g(protocol, "protocol");
        kotlin.jvm.internal.t.g(host, "host");
        kotlin.jvm.internal.t.g(pathSegments, "pathSegments");
        kotlin.jvm.internal.t.g(parameters, "parameters");
        kotlin.jvm.internal.t.g(fragment, "fragment");
        kotlin.jvm.internal.t.g(urlString, "urlString");
        this.f11770a = protocol;
        this.f11771b = host;
        this.f11772c = i8;
        this.f11773d = pathSegments;
        this.f11774e = parameters;
        this.f11775f = fragment;
        this.f11776g = str;
        this.f11777h = str2;
        this.f11778i = z8;
        this.f11779j = urlString;
        if ((i8 < 0 || i8 >= 65536) && i8 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.f11780k = C6.k.b(new d());
        this.f11781l = C6.k.b(new f());
        this.f11782m = C6.k.b(new e());
        this.f11783n = C6.k.b(new g());
        this.f11784o = C6.k.b(new c());
        this.f11785p = C6.k.b(new b());
    }

    public final String b() {
        return (String) this.f11785p.getValue();
    }

    public final String c() {
        return (String) this.f11784o.getValue();
    }

    public final String d() {
        return (String) this.f11780k.getValue();
    }

    public final String e() {
        return (String) this.f11781l.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && T.class == obj.getClass() && kotlin.jvm.internal.t.c(this.f11779j, ((T) obj).f11779j);
    }

    public final String f() {
        return (String) this.f11783n.getValue();
    }

    public final String g() {
        return this.f11771b;
    }

    public final C h() {
        return this.f11774e;
    }

    public int hashCode() {
        return this.f11779j.hashCode();
    }

    public final String i() {
        return this.f11777h;
    }

    public final List j() {
        return this.f11773d;
    }

    public final int k() {
        Integer numValueOf = Integer.valueOf(this.f11772c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f11770a.d();
    }

    public final O l() {
        return this.f11770a;
    }

    public final int m() {
        return this.f11772c;
    }

    public final boolean n() {
        return this.f11778i;
    }

    public final String o() {
        return this.f11776g;
    }

    public String toString() {
        return this.f11779j;
    }
}
