package u7;

import D6.C0938s;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.P;

/* JADX INFO: renamed from: u7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3047g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f34625c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3047g f34626d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f34627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H7.c f34628b;

    /* JADX INFO: renamed from: u7.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f34629a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final C3047g a() {
            return new C3047g(D6.z.W0(this.f34629a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: u7.g$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final String a(Certificate certificate) {
            kotlin.jvm.internal.t.g(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).a();
        }

        public final J7.h b(X509Certificate x509Certificate) {
            kotlin.jvm.internal.t.g(x509Certificate, "<this>");
            J7.h.a aVar = J7.h.f4388d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.t.f(encoded, "publicKey.encoded");
            return J7.h.a.f(aVar, encoded, 0, 0, 3, null).F();
        }

        public final J7.h c(X509Certificate x509Certificate) {
            kotlin.jvm.internal.t.g(x509Certificate, "<this>");
            J7.h.a aVar = J7.h.f4388d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.t.f(encoded, "publicKey.encoded");
            return J7.h.a.f(aVar, encoded, 0, 0, 3, null).G();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: u7.g$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f34631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final J7.h f34632c;

        /* JADX WARN: Code duplicated, block: B:16:0x004e  */
        /* JADX WARN: Code duplicated, block: B:18:0x005c  */
        /* JADX WARN: Code duplicated, block: B:20:0x0070  */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:24:0x0088  */
        /* JADX WARN: Code duplicated, block: B:26:0x0090  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x0073, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x00a7, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x00bc, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00d3, please report this as an issue */
        public c(String pattern, String pin) {
            String str;
            String strE;
            J7.h hVarA;
            J7.h hVarA2;
            kotlin.jvm.internal.t.g(pattern, "pattern");
            kotlin.jvm.internal.t.g(pin, "pin");
            if (Z6.v.H(pattern, "*.", false, 2, null)) {
                str = pattern;
                if (Z6.w.Y(str, "*", 1, false, 4, null) != -1) {
                }
                strE = v7.a.e(str);
                if (strE != null) {
                    throw new IllegalArgumentException("Invalid pattern: " + str);
                }
                this.f34630a = strE;
                if (Z6.v.H(pin, "sha1/", false, 2, null)) {
                    this.f34631b = "sha1";
                    J7.h.a aVar = J7.h.f4388d;
                    String strSubstring = pin.substring(5);
                    kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                    hVarA2 = aVar.a(strSubstring);
                    if (hVarA2 != null) {
                        this.f34632c = hVarA2;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + pin);
                }
                if (Z6.v.H(pin, "sha256/", false, 2, null)) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
                }
                this.f34631b = SigningManager.POST_PARAMS_ALGORITHM;
                J7.h.a aVar2 = J7.h.f4388d;
                String strSubstring2 = pin.substring(7);
                kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                hVarA = aVar2.a(strSubstring2);
                if (hVarA != null) {
                    this.f34632c = hVarA;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            str = pattern;
            if ((!Z6.v.H(str, "**.", false, 2, null) || Z6.w.Y(str, "*", 2, false, 4, null) != -1) && Z6.w.Y(str, "*", 0, false, 6, null) != -1) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            strE = v7.a.e(str);
            if (strE != null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.f34630a = strE;
            if (Z6.v.H(pin, "sha1/", false, 2, null)) {
                this.f34631b = "sha1";
                J7.h.a aVar3 = J7.h.f4388d;
                String strSubstring3 = pin.substring(5);
                kotlin.jvm.internal.t.f(strSubstring3, "this as java.lang.String).substring(startIndex)");
                hVarA2 = aVar3.a(strSubstring3);
                if (hVarA2 != null) {
                    this.f34632c = hVarA2;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            if (Z6.v.H(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.f34631b = SigningManager.POST_PARAMS_ALGORITHM;
            J7.h.a aVar4 = J7.h.f4388d;
            String strSubstring4 = pin.substring(7);
            kotlin.jvm.internal.t.f(strSubstring4, "this as java.lang.String).substring(startIndex)");
            hVarA = aVar4.a(strSubstring4);
            if (hVarA != null) {
                this.f34632c = hVarA;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + pin);
        }

        public final J7.h a() {
            return this.f34632c;
        }

        public final String b() {
            return this.f34631b;
        }

        public final boolean c(String hostname) {
            kotlin.jvm.internal.t.g(hostname, "hostname");
            if (Z6.v.H(this.f34630a, "**.", false, 2, null)) {
                int length = this.f34630a.length() - 3;
                int length2 = hostname.length() - length;
                return Z6.v.y(hostname, hostname.length() - length, this.f34630a, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!Z6.v.H(this.f34630a, "*.", false, 2, null)) {
                return kotlin.jvm.internal.t.c(hostname, this.f34630a);
            }
            int length3 = this.f34630a.length() - 1;
            return Z6.v.y(hostname, hostname.length() - length3, this.f34630a, 1, length3, false, 16, null) && Z6.w.e0(hostname, com.amazon.a.a.o.c.a.b.f16789a, (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.t.c(this.f34630a, cVar.f34630a) && kotlin.jvm.internal.t.c(this.f34631b, cVar.f34631b) && kotlin.jvm.internal.t.c(this.f34632c, cVar.f34632c);
        }

        public int hashCode() {
            return (((this.f34630a.hashCode() * 31) + this.f34631b.hashCode()) * 31) + this.f34632c.hashCode();
        }

        public String toString() {
            return this.f34631b + '/' + this.f34632c.a();
        }
    }

    /* JADX INFO: renamed from: u7.g$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f34634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f34635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, String str) {
            super(0);
            this.f34634b = list;
            this.f34635c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            List<Certificate> listA;
            H7.c cVarD = C3047g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f34634b, this.f34635c)) == null) {
                listA = this.f34634b;
            }
            ArrayList arrayList = new ArrayList(C0938s.y(listA, 10));
            for (Certificate certificate : listA) {
                kotlin.jvm.internal.t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C3047g(Set<c> pins, H7.c cVar) {
        kotlin.jvm.internal.t.g(pins, "pins");
        this.f34627a = pins;
        this.f34628b = cVar;
    }

    public final void a(String hostname, List peerCertificates) {
        kotlin.jvm.internal.t.g(hostname, "hostname");
        kotlin.jvm.internal.t.g(peerCertificates, "peerCertificates");
        b(hostname, new d(peerCertificates, hostname));
    }

    public final void b(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.t.g(hostname, "hostname");
        kotlin.jvm.internal.t.g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            J7.h hVarC = null;
            J7.h hVarB = null;
            for (c cVar : listC) {
                String strB = cVar.b();
                if (kotlin.jvm.internal.t.c(strB, SigningManager.POST_PARAMS_ALGORITHM)) {
                    if (hVarC == null) {
                        hVarC = f34625c.c(x509Certificate);
                    }
                    if (kotlin.jvm.internal.t.c(cVar.a(), hVarC)) {
                        return;
                    }
                } else {
                    if (!kotlin.jvm.internal.t.c(strB, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                    }
                    if (hVarB == null) {
                        hVarB = f34625c.b(x509Certificate);
                    }
                    if (kotlin.jvm.internal.t.c(cVar.a(), hVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f34625c.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        for (c cVar2 : listC) {
            sb.append("\n    ");
            sb.append(cVar2);
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String hostname) {
        kotlin.jvm.internal.t.g(hostname, "hostname");
        Set set = this.f34627a;
        List listN = D6.r.n();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (listN.isEmpty()) {
                    listN = new ArrayList();
                }
                kotlin.jvm.internal.t.e(listN, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                P.c(listN).add(obj);
            }
        }
        return listN;
    }

    public final H7.c d() {
        return this.f34628b;
    }

    public final C3047g e(H7.c certificateChainCleaner) {
        kotlin.jvm.internal.t.g(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.t.c(this.f34628b, certificateChainCleaner) ? this : new C3047g(this.f34627a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3047g)) {
            return false;
        }
        C3047g c3047g = (C3047g) obj;
        return kotlin.jvm.internal.t.c(c3047g.f34627a, this.f34627a) && kotlin.jvm.internal.t.c(c3047g.f34628b, this.f34628b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f34627a.hashCode()) * 41;
        H7.c cVar = this.f34628b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C3047g(Set set, H7.c cVar, int i8, AbstractC2633k abstractC2633k) {
        this(set, (i8 & 2) != 0 ? null : cVar);
    }
}
