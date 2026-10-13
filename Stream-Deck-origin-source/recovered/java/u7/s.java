package u7;

import D6.C0938s;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f34807e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f34808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f34809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f34810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6.j f34811d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: u7.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0788a extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f34812a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0788a(List list) {
                super(0);
                this.f34812a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List invoke() {
                return this.f34812a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f34813a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f34813a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List invoke() {
                return this.f34813a;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final s a(SSLSession sSLSession) throws IOException {
            List listN;
            kotlin.jvm.internal.t.g(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (kotlin.jvm.internal.t.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : kotlin.jvm.internal.t.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            i iVarB = i.f34692b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (kotlin.jvm.internal.t.c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            E eA = E.f34546b.a(protocol);
            try {
                listN = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listN = D6.r.n();
            }
            return new s(eA, iVarB, c(sSLSession.getLocalCertificates()), new b(listN));
        }

        public final s b(E tlsVersion, i cipherSuite, List peerCertificates, List localCertificates) {
            kotlin.jvm.internal.t.g(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.t.g(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.t.g(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.t.g(localCertificates, "localCertificates");
            return new s(tlsVersion, cipherSuite, v7.d.U(localCertificates), new C0788a(v7.d.U(peerCertificates)));
        }

        public final List c(Certificate[] certificateArr) {
            return certificateArr != null ? v7.d.w(Arrays.copyOf(certificateArr, certificateArr.length)) : D6.r.n();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f34814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0) {
            super(0);
            this.f34814a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            try {
                return (List) this.f34814a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return D6.r.n();
            }
        }
    }

    public s(E tlsVersion, i cipherSuite, List<? extends Certificate> localCertificates, Function0 peerCertificatesFn) {
        kotlin.jvm.internal.t.g(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.t.g(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.t.g(localCertificates, "localCertificates");
        kotlin.jvm.internal.t.g(peerCertificatesFn, "peerCertificatesFn");
        this.f34808a = tlsVersion;
        this.f34809b = cipherSuite;
        this.f34810c = localCertificates;
        this.f34811d = C6.k.b(new b(peerCertificatesFn));
    }

    public final i a() {
        return this.f34809b;
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.t.f(type, "type");
        return type;
    }

    public final List c() {
        return this.f34810c;
    }

    public final List d() {
        return (List) this.f34811d.getValue();
    }

    public final E e() {
        return this.f34808a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f34808a == this.f34808a && kotlin.jvm.internal.t.c(sVar.f34809b, this.f34809b) && kotlin.jvm.internal.t.c(sVar.d(), d()) && kotlin.jvm.internal.t.c(sVar.f34810c, this.f34810c);
    }

    public int hashCode() {
        return ((((((527 + this.f34808a.hashCode()) * 31) + this.f34809b.hashCode()) * 31) + d().hashCode()) * 31) + this.f34810c.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(C0938s.y(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f34808a);
        sb.append(" cipherSuite=");
        sb.append(this.f34809b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f34810c;
        ArrayList arrayList2 = new ArrayList(C0938s.y(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
