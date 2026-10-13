package H7;

import D6.r;
import D6.z;
import J7.E;
import P2.Lsk.mHPawN;
import Z6.v;
import Z6.w;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3594a = new d();

    public final List a(X509Certificate certificate) {
        t.g(certificate, "certificate");
        return z.B0(c(certificate, 7), c(certificate, 2));
    }

    public final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale US = Locale.US;
        t.f(US, "US");
        String lowerCase = str.toLowerCase(US);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List c(X509Certificate x509Certificate, int i8) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return r.n();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && t.c(list.get(0), Integer.valueOf(i8)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return r.n();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) E.b(str, 0, 0, 3, null));
    }

    public final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !v.H(str, ".", false, 2, null) && !v.u(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !v.H(str2, ".", false, 2, null) && !v.u(str2, "..", false, 2, null)) {
            if (!v.u(str, ".", false, 2, null)) {
                str = str + com.amazon.a.a.o.c.a.b.f16789a;
            }
            String str3 = str;
            if (!v.u(str2, ".", false, 2, null)) {
                str2 = str2 + com.amazon.a.a.o.c.a.b.f16789a;
            }
            String strB = b(str2);
            if (!w.M(strB, "*", false, 2, null)) {
                return t.c(str3, strB);
            }
            if (!v.H(strB, "*.", false, 2, null) || w.X(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || t.c("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!v.u(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || w.e0(str3, com.amazon.a.a.o.c.a.b.f16789a, length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List listC = c(x509Certificate, 2);
        if (listC != null && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (f3594a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String strE = v7.a.e(str);
        List listC = c(x509Certificate, 7);
        if (listC != null && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (t.c(strE, v7.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        t.g(host, "host");
        t.g(session, "session");
        if (!d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean e(String str, X509Certificate certificate) {
        t.g(str, mHPawN.madcxnKcVlvfknS);
        t.g(certificate, "certificate");
        return v7.d.i(str) ? h(str, certificate) : g(str, certificate);
    }
}
