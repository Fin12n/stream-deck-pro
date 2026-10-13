package X5;

import D6.C0937q;
import D6.C0938s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p180u5.FCkZ.BpgIURjN;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11768a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public final CharSequence invoke(C6.o it) {
            kotlin.jvm.internal.t.g(it, "it");
            String str = (String) it.c();
            if (it.d() == null) {
                return str;
            }
            return str + '=' + String.valueOf(it.d());
        }
    }

    public static final I b(String urlString) {
        kotlin.jvm.internal.t.g(urlString, "urlString");
        return N.j(new I(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    public static final T c(I builder) {
        kotlin.jvm.internal.t.g(builder, "builder");
        return j(new I(null, null, 0, null, null, null, null, null, false, 511, null), builder).b();
    }

    public static final T d(String urlString) {
        kotlin.jvm.internal.t.g(urlString, "urlString");
        return b(urlString).b();
    }

    public static final void e(Appendable appendable, String encodedPath, D encodedQueryParameters, boolean z8) {
        List listE;
        kotlin.jvm.internal.t.g(appendable, "<this>");
        kotlin.jvm.internal.t.g(encodedPath, "encodedPath");
        kotlin.jvm.internal.t.g(encodedQueryParameters, "encodedQueryParameters");
        if (!Z6.w.b0(encodedPath) && !Z6.v.H(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z8) {
            appendable.append("?");
        }
        Set<Map.Entry> setA = encodedQueryParameters.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setA) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listE = C0937q.e(C6.v.a(str, null));
            } else {
                ArrayList arrayList2 = new ArrayList(C0938s.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C6.v.a(str, (String) it.next()));
                }
                listE = arrayList2;
            }
            D6.w.E(arrayList, listE);
        }
        D6.z.o0(arrayList, appendable, (124 & 2) != 0 ? ", " : "&", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : a.f11768a);
    }

    public static final void g(StringBuilder sb, String str, String str2) {
        kotlin.jvm.internal.t.g(sb, "<this>");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }

    public static final String h(T t8) throws IOException {
        kotlin.jvm.internal.t.g(t8, "<this>");
        StringBuilder sb = new StringBuilder();
        f(sb, t8.d(), t8.e(), t8.n());
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String i(T t8) {
        kotlin.jvm.internal.t.g(t8, "<this>");
        return t8.g() + ':' + t8.k();
    }

    public static final I j(I i8, I url) {
        kotlin.jvm.internal.t.g(i8, "<this>");
        kotlin.jvm.internal.t.g(url, "url");
        i8.y(url.o());
        i8.w(url.j());
        i8.x(url.n());
        i8.u(url.g());
        i8.v(url.h());
        i8.t(url.f());
        D dB = G.b(0, 1, null);
        p115m6.F.c(dB, url.e());
        i8.s(dB);
        i8.r(url.d());
        i8.z(url.p());
        return i8;
    }

    public static final I k(I i8, T url) {
        kotlin.jvm.internal.t.g(i8, "<this>");
        kotlin.jvm.internal.t.g(url, "url");
        i8.y(url.l());
        i8.w(url.g());
        i8.x(url.k());
        K.j(i8, url.d());
        i8.v(url.f());
        i8.t(url.c());
        D dB = G.b(0, 1, null);
        dB.d(H.d(url.e(), 0, 0, false, 6, null));
        i8.s(dB);
        i8.r(url.b());
        i8.z(url.n());
        return i8;
    }

    public static final I a(T t8) {
        kotlin.jvm.internal.t.g(t8, hJroAgFztiMK.xUeJZMvhADGdA);
        return k(new I(null, null, 0, null, null, null, null, null, false, 511, null), t8);
    }

    public static final void f(Appendable appendable, String encodedPath, String encodedQuery, boolean z8) throws IOException {
        kotlin.jvm.internal.t.g(appendable, "<this>");
        kotlin.jvm.internal.t.g(encodedPath, "encodedPath");
        kotlin.jvm.internal.t.g(encodedQuery, "encodedQuery");
        if (!Z6.w.b0(encodedPath) && !Z6.v.H(encodedPath, "/", false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (encodedQuery.length() > 0 || z8) {
            appendable.append(BpgIURjN.yyorK);
        }
        appendable.append(encodedQuery);
    }
}
