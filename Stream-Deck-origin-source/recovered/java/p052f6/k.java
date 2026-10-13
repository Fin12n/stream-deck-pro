package p052f6;

import D6.C0938s;
import D6.r;
import D6.x;
import D6.z;
import H.FL.dCqzKmEghGTQ;
import X5.B;
import Z6.v;
import Z6.w;
import com.amazon.a.a.o.c.a.b;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final void c(String serverName, X509Certificate certificate) throws CertificateParsingException, A {
        t.g(serverName, "serverName");
        t.g(certificate, "certificate");
        if (B.a(serverName)) {
            d(serverName, certificate);
            return;
        }
        List listA = a(certificate);
        if (listA.isEmpty()) {
            return;
        }
        if (!listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (b(serverName, (String) it.next())) {
                    return;
                }
            }
        }
        throw new A("No server host: " + serverName + " in the server certificate. Provided in certificate: " + z.r0(listA, null, null, null, 0, null, null, 63, null), null, 2, null);
    }

    public static final void d(String ipString, X509Certificate certificate) throws CertificateParsingException, A {
        t.g(ipString, "ipString");
        t.g(certificate, "certificate");
        Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
        t.f(subjectAlternativeNames, "certificate.subjectAlternativeNames");
        ArrayList arrayList = new ArrayList();
        for (Object obj : subjectAlternativeNames) {
            Object obj2 = ((List) obj).get(0);
            t.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj2).intValue() == 7) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C0938s.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj3 = ((List) it.next()).get(1);
            t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            arrayList2.add((String) obj3);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (t.c((String) it2.next(), ipString)) {
                    return;
                }
            }
        }
        throw new A("No server host: " + ipString + " in the server certificate. The certificate was issued for: " + z.r0(arrayList2, null, null, null, 0, null, null, 63, null) + b.f16789a, null, 2, null);
    }

    public static final boolean b(String str, String certificateHost) {
        t.g(str, dCqzKmEghGTQ.roslfLPgD);
        t.g(certificateHost, "certificateHost");
        if (v.v(str, certificateHost, true)) {
            return true;
        }
        List listT = x.T(w.z0(str, new char[]{b.f16789a}, false, 0, 6, null));
        List listT2 = x.T(w.z0(certificateHost, new char[]{b.f16789a}, false, 0, 6, null));
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        while (i8 < listT.size() && i9 < listT2.size()) {
            String str2 = (String) listT.get(i8);
            if (i8 == 0 && str2.length() == 0) {
                i8++;
            } else {
                String str3 = (String) listT2.get(i9);
                if (i9 != 0 || str3.length() != 0) {
                    if (!z8 && v.v(str2, str3, true)) {
                        i10++;
                        i8++;
                    } else {
                        if (!t.c(str3, "*")) {
                            return false;
                        }
                        i8++;
                        i9++;
                        z8 = true;
                    }
                }
                i9++;
            }
        }
        return i8 == listT.size() && i9 == listT2.size() && (!z8 || i10 >= 2);
    }

    public static final List a(X509Certificate x509Certificate) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : subjectAlternativeNames) {
                Object obj2 = ((List) obj).get(0);
                t.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) obj2).intValue() == 2) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C0938s.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj3 = ((List) it.next()).get(1);
                t.e(obj3, kDsnNkYbBsI.puETpHqY);
                arrayList2.add((String) obj3);
            }
            return arrayList2;
        }
        return r.n();
    }
}
