package X5;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f11745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final T f11746l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O f11747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f11753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f11754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public D f11755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D f11756j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f11745k = aVar;
        f11746l = Q.d(J.a(aVar));
    }

    public I() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    public final void A(String str) {
        this.f11751e = str != null ? AbstractC1673b.m(str, false, 1, null) : null;
    }

    public final void a() {
        if (this.f11748b.length() <= 0 && !kotlin.jvm.internal.t.c(this.f11747a.e(), "file")) {
            T t8 = f11746l;
            this.f11748b = t8.g();
            if (kotlin.jvm.internal.t.c(this.f11747a, O.f11759c.c())) {
                this.f11747a = t8.l();
            }
            if (this.f11749c == 0) {
                this.f11749c = t8.m();
            }
        }
    }

    public final T b() {
        a();
        return new T(this.f11747a, this.f11748b, this.f11749c, m(), this.f11756j.build(), i(), q(), l(), this.f11750d, c());
    }

    public final String c() {
        a();
        String string = ((StringBuilder) K.d(this, new StringBuilder(256))).toString();
        kotlin.jvm.internal.t.f(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    public final String d() {
        return this.f11753g;
    }

    public final D e() {
        return this.f11755i;
    }

    public final String f() {
        return this.f11752f;
    }

    public final List g() {
        return this.f11754h;
    }

    public final String h() {
        return this.f11751e;
    }

    public final String i() {
        return AbstractC1673b.k(this.f11753g, 0, 0, false, null, 15, null);
    }

    public final String j() {
        return this.f11748b;
    }

    public final D k() {
        return this.f11756j;
    }

    public final String l() {
        String str = this.f11752f;
        if (str != null) {
            return AbstractC1673b.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final List m() {
        List list = this.f11754h;
        ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1673b.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f11749c;
    }

    public final O o() {
        return this.f11747a;
    }

    public final boolean p() {
        return this.f11750d;
    }

    public final String q() {
        String str = this.f11751e;
        if (str != null) {
            return AbstractC1673b.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void r(String str) {
        kotlin.jvm.internal.t.g(str, "<set-?>");
        this.f11753g = str;
    }

    public final void s(D value) {
        kotlin.jvm.internal.t.g(value, "value");
        this.f11755i = value;
        this.f11756j = new U(value);
    }

    public final void t(String str) {
        this.f11752f = str;
    }

    public String toString() {
        String string = ((StringBuilder) K.d(this, new StringBuilder(256))).toString();
        kotlin.jvm.internal.t.f(string, "appendTo(StringBuilder(256)).toString()");
        return string;
    }

    public final void u(List list) {
        kotlin.jvm.internal.t.g(list, "<set-?>");
        this.f11754h = list;
    }

    public final void v(String str) {
        this.f11751e = str;
    }

    public final void w(String str) {
        kotlin.jvm.internal.t.g(str, "<set-?>");
        this.f11748b = str;
    }

    public final void x(int i8) {
        this.f11749c = i8;
    }

    public final void y(O o8) {
        kotlin.jvm.internal.t.g(o8, "<set-?>");
        this.f11747a = o8;
    }

    public final void z(boolean z8) {
        this.f11750d = z8;
    }

    public I(O protocol, String host, int i8, String str, String str2, List<String> pathSegments, C parameters, String fragment, boolean z8) {
        kotlin.jvm.internal.t.g(protocol, "protocol");
        kotlin.jvm.internal.t.g(host, "host");
        kotlin.jvm.internal.t.g(pathSegments, "pathSegments");
        kotlin.jvm.internal.t.g(parameters, "parameters");
        kotlin.jvm.internal.t.g(fragment, "fragment");
        this.f11747a = protocol;
        this.f11748b = host;
        this.f11749c = i8;
        this.f11750d = z8;
        this.f11751e = str != null ? AbstractC1673b.m(str, false, 1, null) : null;
        this.f11752f = str2 != null ? AbstractC1673b.m(str2, false, 1, null) : null;
        this.f11753g = AbstractC1673b.r(fragment, false, false, null, 7, null);
        ArrayList arrayList = new ArrayList(C0938s.y(pathSegments, 10));
        Iterator<T> it = pathSegments.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1673b.p((String) it.next()));
        }
        this.f11754h = arrayList;
        D dE = V.e(parameters);
        this.f11755i = dE;
        this.f11756j = new U(dE);
    }

    public /* synthetic */ I(O o8, String str, int i8, String str2, String str3, List list, C c8, String str4, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? O.f11759c.c() : o8, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : str3, (i9 & 32) != 0 ? D6.r.n() : list, (i9 & 64) != 0 ? C.f11742b.a() : c8, (i9 & 128) != 0 ? "" : str4, (i9 & 256) != 0 ? false : z8);
    }
}
