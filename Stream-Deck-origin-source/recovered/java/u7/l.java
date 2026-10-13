package u7;

import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f34762e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i[] f34763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i[] f34764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f34765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f34766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f34767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f34768k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f34771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f34772d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f34774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f34775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f34776d;

        public a(boolean z8) {
            this.f34773a = z8;
        }

        public final l a() {
            return new l(this.f34773a, this.f34776d, this.f34774b, this.f34775c);
        }

        public final a b(String... cipherSuites) {
            kotlin.jvm.internal.t.g(cipherSuites, "cipherSuites");
            if (!this.f34773a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f34774b = (String[]) cipherSuites.clone();
            return this;
        }

        public final a c(i... cipherSuites) {
            kotlin.jvm.internal.t.g(cipherSuites, "cipherSuites");
            if (!this.f34773a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a d(boolean z8) {
            if (!this.f34773a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f34776d = z8;
            return this;
        }

        public final a e(String... tlsVersions) {
            kotlin.jvm.internal.t.g(tlsVersions, "tlsVersions");
            if (!this.f34773a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f34775c = (String[]) tlsVersions.clone();
            return this;
        }

        public final a f(E... eArr) {
            kotlin.jvm.internal.t.g(eArr, yOZfxp.RyTgub);
            if (!this.f34773a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(eArr.length);
            for (E e8 : eArr) {
                arrayList.add(e8.b());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(l connectionSpec) {
            kotlin.jvm.internal.t.g(connectionSpec, "connectionSpec");
            this.f34773a = connectionSpec.f();
            this.f34774b = connectionSpec.f34771c;
            this.f34775c = connectionSpec.f34772d;
            this.f34776d = connectionSpec.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    static {
        i iVar = i.f34733o1;
        i iVar2 = i.f34736p1;
        i iVar3 = i.f34739q1;
        i iVar4 = i.f34691a1;
        i iVar5 = i.f34703e1;
        i iVar6 = i.f34694b1;
        i iVar7 = i.f34706f1;
        i iVar8 = i.f34724l1;
        i iVar9 = i.f34721k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f34763f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.f34661L0, i.f34663M0, i.f34717j0, i.f34720k0, i.f34652H, i.f34660L, i.f34722l};
        f34764g = iVarArr2;
        a aVarC = new a(true).c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        E e8 = E.TLS_1_3;
        E e9 = E.TLS_1_2;
        f34765h = aVarC.f(e8, e9).d(true).a();
        f34766i = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(e8, e9).d(true).a();
        f34767j = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(e8, e9, E.TLS_1_1, E.TLS_1_0).d(true).a();
        f34768k = new a(false).a();
    }

    public l(boolean z8, boolean z9, String[] strArr, String[] strArr2) {
        this.f34769a = z8;
        this.f34770b = z9;
        this.f34771c = strArr;
        this.f34772d = strArr2;
    }

    public final void c(SSLSocket sslSocket, boolean z8) {
        kotlin.jvm.internal.t.g(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z8);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f34772d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f34771c);
        }
    }

    public final List d() {
        String[] strArr = this.f34771c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f34692b.b(str));
        }
        return D6.z.R0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        kotlin.jvm.internal.t.g(socket, "socket");
        if (!this.f34769a) {
            return false;
        }
        String[] strArr = this.f34772d;
        if (strArr != null && !v7.d.u(strArr, socket.getEnabledProtocols(), F6.a.b())) {
            return false;
        }
        String[] strArr2 = this.f34771c;
        return strArr2 == null || v7.d.u(strArr2, socket.getEnabledCipherSuites(), i.f34692b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z8 = this.f34769a;
        l lVar = (l) obj;
        if (z8 != lVar.f34769a) {
            return false;
        }
        return !z8 || (Arrays.equals(this.f34771c, lVar.f34771c) && Arrays.equals(this.f34772d, lVar.f34772d) && this.f34770b == lVar.f34770b);
    }

    public final boolean f() {
        return this.f34769a;
    }

    public final l g(SSLSocket sSLSocket, boolean z8) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f34771c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.t.f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = v7.d.E(enabledCipherSuites, this.f34771c, i.f34692b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f34772d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.t.f(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = v7.d.E(enabledProtocols, this.f34772d, F6.a.b());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.t.f(supportedCipherSuites, "supportedCipherSuites");
        int iX = v7.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f34692b.c());
        if (z8 && iX != -1) {
            kotlin.jvm.internal.t.f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            kotlin.jvm.internal.t.f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = v7.d.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        kotlin.jvm.internal.t.f(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarB = aVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.t.f(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarB.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final boolean h() {
        return this.f34770b;
    }

    public int hashCode() {
        if (!this.f34769a) {
            return 17;
        }
        String[] strArr = this.f34771c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f34772d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f34770b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f34772d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(E.f34546b.a(str));
        }
        return D6.z.R0(arrayList);
    }

    public String toString() {
        if (!this.f34769a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f34770b + ')';
    }
}
