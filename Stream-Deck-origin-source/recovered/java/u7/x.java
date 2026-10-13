package u7;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2633k;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class x implements Cloneable, F.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final b f34846E = new b(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final List f34847F = v7.d.w(y.HTTP_2, y.HTTP_1_1);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final List f34848G = v7.d.w(l.f34766i, l.f34768k);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f34849A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f34850B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f34851C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final z7.h f34852D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f34853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f34854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f34855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f34856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r.c f34857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3042b f34859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f34861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f34862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3043c f34863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f34864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Proxy f34865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProxySelector f34866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC3042b f34867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SocketFactory f34868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f34869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X509TrustManager f34870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f34871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f34872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HostnameVerifier f34873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C3047g f34874v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final H7.c f34875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f34876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f34877y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f34878z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final List a() {
            return x.f34848G;
        }

        public final List b() {
            return x.f34847F;
        }

        public b() {
        }
    }

    public x(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorC;
        kotlin.jvm.internal.t.g(builder, "builder");
        this.f34853a = builder.p();
        this.f34854b = builder.m();
        this.f34855c = v7.d.U(builder.v());
        this.f34856d = v7.d.U(builder.x());
        this.f34857e = builder.r();
        this.f34858f = builder.E();
        this.f34859g = builder.g();
        this.f34860h = builder.s();
        this.f34861i = builder.t();
        this.f34862j = builder.o();
        this.f34863k = builder.h();
        this.f34864l = builder.q();
        this.f34865m = builder.A();
        if (builder.A() != null) {
            proxySelectorC = G7.a.f2824a;
        } else {
            proxySelectorC = builder.C();
            proxySelectorC = proxySelectorC == null ? ProxySelector.getDefault() : proxySelectorC;
            if (proxySelectorC == null) {
                proxySelectorC = G7.a.f2824a;
            }
        }
        this.f34866n = proxySelectorC;
        this.f34867o = builder.B();
        this.f34868p = builder.G();
        List listN = builder.n();
        this.f34871s = listN;
        this.f34872t = builder.z();
        this.f34873u = builder.u();
        this.f34876x = builder.i();
        this.f34877y = builder.l();
        this.f34878z = builder.D();
        this.f34849A = builder.I();
        this.f34850B = builder.y();
        this.f34851C = builder.w();
        z7.h hVarF = builder.F();
        this.f34852D = hVarF == null ? new z7.h() : hVarF;
        if (listN == null || !listN.isEmpty()) {
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (builder.H() != null) {
                        this.f34869q = builder.H();
                        H7.c cVarJ = builder.j();
                        kotlin.jvm.internal.t.d(cVarJ);
                        this.f34875w = cVarJ;
                        X509TrustManager x509TrustManagerJ = builder.J();
                        kotlin.jvm.internal.t.d(x509TrustManagerJ);
                        this.f34870r = x509TrustManagerJ;
                        C3047g c3047gK = builder.k();
                        kotlin.jvm.internal.t.d(cVarJ);
                        this.f34874v = c3047gK.e(cVarJ);
                    } else {
                        E7.h.a aVar = E7.h.f2311a;
                        X509TrustManager x509TrustManagerP = aVar.g().p();
                        this.f34870r = x509TrustManagerP;
                        E7.h hVarG = aVar.g();
                        kotlin.jvm.internal.t.d(x509TrustManagerP);
                        this.f34869q = hVarG.o(x509TrustManagerP);
                        H7.c.a aVar2 = H7.c.f3593a;
                        kotlin.jvm.internal.t.d(x509TrustManagerP);
                        H7.c cVarA = aVar2.a(x509TrustManagerP);
                        this.f34875w = cVarA;
                        C3047g c3047gK2 = builder.k();
                        kotlin.jvm.internal.t.d(cVarA);
                        this.f34874v = c3047gK2.e(cVarA);
                    }
                }
            }
            this.f34869q = null;
            this.f34875w = null;
            this.f34870r = null;
            this.f34874v = C3047g.f34626d;
        } else {
            this.f34869q = null;
            this.f34875w = null;
            this.f34870r = null;
            this.f34874v = C3047g.f34626d;
        }
        O();
    }

    public final long B() {
        return this.f34851C;
    }

    public final List C() {
        return this.f34856d;
    }

    public a D() {
        return new a(this);
    }

    public InterfaceC3045e E(z request) {
        kotlin.jvm.internal.t.g(request, "request");
        return new z7.e(this, request, false);
    }

    public final int F() {
        return this.f34850B;
    }

    public final List G() {
        return this.f34872t;
    }

    public final Proxy H() {
        return this.f34865m;
    }

    public final InterfaceC3042b I() {
        return this.f34867o;
    }

    public final ProxySelector J() {
        return this.f34866n;
    }

    public final int K() {
        return this.f34878z;
    }

    public final boolean L() {
        return this.f34858f;
    }

    public final SocketFactory M() {
        return this.f34868p;
    }

    public final SSLSocketFactory N() {
        SSLSocketFactory sSLSocketFactory = this.f34869q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int P() {
        return this.f34849A;
    }

    public final X509TrustManager Q() {
        return this.f34870r;
    }

    @Override // u7.F.a
    public F a(z request, G listener) {
        kotlin.jvm.internal.t.g(request, "request");
        kotlin.jvm.internal.t.g(listener, "listener");
        I7.d dVar = new I7.d(y7.e.f38468i, request, listener, new Random(), this.f34850B, null, this.f34851C);
        dVar.o(this);
        return dVar;
    }

    public Object clone() {
        return super.clone();
    }

    public final InterfaceC3042b f() {
        return this.f34859g;
    }

    public final C3043c g() {
        return this.f34863k;
    }

    public final int h() {
        return this.f34876x;
    }

    public final H7.c i() {
        return this.f34875w;
    }

    public final C3047g k() {
        return this.f34874v;
    }

    public final int l() {
        return this.f34877y;
    }

    public final k m() {
        return this.f34854b;
    }

    public final List n() {
        return this.f34871s;
    }

    public final n p() {
        return this.f34862j;
    }

    public final p q() {
        return this.f34853a;
    }

    public final q r() {
        return this.f34864l;
    }

    public final r.c s() {
        return this.f34857e;
    }

    public final boolean u() {
        return this.f34860h;
    }

    public final boolean v() {
        return this.f34861i;
    }

    public final z7.h w() {
        return this.f34852D;
    }

    public final HostnameVerifier x() {
        return this.f34873u;
    }

    public final List z() {
        return this.f34855c;
    }

    public final void O() {
        List list = this.f34855c;
        kotlin.jvm.internal.t.e(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f34855c).toString());
        }
        List list2 = this.f34856d;
        kotlin.jvm.internal.t.e(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f34856d).toString());
        }
        List list3 = this.f34871s;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).f()) {
                    if (this.f34869q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f34875w == null) {
                        throw new IllegalStateException(bGZGhbtQmA.vUbYomQTlPg);
                    }
                    if (this.f34870r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f34869q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f34875w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f34870r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.t.c(this.f34874v, C3047g.f34626d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f34879A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f34880B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public long f34881C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public z7.h f34882D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f34883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f34884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f34885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f34886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r.c f34887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f34888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC3042b f34889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f34890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f34891i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public n f34892j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public C3043c f34893k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public q f34894l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Proxy f34895m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ProxySelector f34896n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public InterfaceC3042b f34897o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public SocketFactory f34898p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public SSLSocketFactory f34899q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public X509TrustManager f34900r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f34901s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List f34902t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public HostnameVerifier f34903u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public C3047g f34904v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public H7.c f34905w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f34906x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f34907y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f34908z;

        public a() {
            this.f34883a = new p();
            this.f34884b = new k();
            this.f34885c = new ArrayList();
            this.f34886d = new ArrayList();
            this.f34887e = v7.d.g(r.f34806b);
            this.f34888f = true;
            InterfaceC3042b interfaceC3042b = InterfaceC3042b.f34566b;
            this.f34889g = interfaceC3042b;
            this.f34890h = true;
            this.f34891i = true;
            this.f34892j = n.f34792b;
            this.f34894l = q.f34803b;
            this.f34897o = interfaceC3042b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.t.f(socketFactory, "getDefault()");
            this.f34898p = socketFactory;
            b bVar = x.f34846E;
            this.f34901s = bVar.a();
            this.f34902t = bVar.b();
            this.f34903u = H7.d.f3594a;
            this.f34904v = C3047g.f34626d;
            this.f34907y = ModuleDescriptor.MODULE_VERSION;
            this.f34908z = ModuleDescriptor.MODULE_VERSION;
            this.f34879A = ModuleDescriptor.MODULE_VERSION;
            this.f34881C = 1024L;
        }

        public final Proxy A() {
            return this.f34895m;
        }

        public final InterfaceC3042b B() {
            return this.f34897o;
        }

        public final ProxySelector C() {
            return this.f34896n;
        }

        public final int D() {
            return this.f34908z;
        }

        public final boolean E() {
            return this.f34888f;
        }

        public final z7.h F() {
            return this.f34882D;
        }

        public final SocketFactory G() {
            return this.f34898p;
        }

        public final SSLSocketFactory H() {
            return this.f34899q;
        }

        public final int I() {
            return this.f34879A;
        }

        public final X509TrustManager J() {
            return this.f34900r;
        }

        public final a K(List protocols) {
            kotlin.jvm.internal.t.g(protocols, "protocols");
            List listU0 = D6.z.U0(protocols);
            y yVar = y.H2_PRIOR_KNOWLEDGE;
            if (!listU0.contains(yVar) && !listU0.contains(y.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listU0).toString());
            }
            if (listU0.contains(yVar) && listU0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listU0).toString());
            }
            if (listU0.contains(y.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listU0).toString());
            }
            kotlin.jvm.internal.t.e(listU0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (listU0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listU0.remove(y.SPDY_3);
            if (!kotlin.jvm.internal.t.c(listU0, this.f34902t)) {
                this.f34882D = null;
            }
            List listUnmodifiableList = Collections.unmodifiableList(listU0);
            kotlin.jvm.internal.t.f(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f34902t = listUnmodifiableList;
            return this;
        }

        public final a L(Proxy proxy) {
            if (!kotlin.jvm.internal.t.c(proxy, this.f34895m)) {
                this.f34882D = null;
            }
            this.f34895m = proxy;
            return this;
        }

        public final a M(long j8, TimeUnit unit) {
            kotlin.jvm.internal.t.g(unit, "unit");
            this.f34908z = v7.d.k("timeout", j8, unit);
            return this;
        }

        public final a N(boolean z8) {
            this.f34888f = z8;
            return this;
        }

        public final a O(long j8, TimeUnit unit) {
            kotlin.jvm.internal.t.g(unit, "unit");
            this.f34879A = v7.d.k("timeout", j8, unit);
            return this;
        }

        public final x a() {
            return new x(this);
        }

        public final a b(long j8, TimeUnit unit) {
            kotlin.jvm.internal.t.g(unit, "unit");
            this.f34907y = v7.d.k("timeout", j8, unit);
            return this;
        }

        public final a c(p dispatcher) {
            kotlin.jvm.internal.t.g(dispatcher, "dispatcher");
            this.f34883a = dispatcher;
            return this;
        }

        public final a d(r eventListener) {
            kotlin.jvm.internal.t.g(eventListener, "eventListener");
            this.f34887e = v7.d.g(eventListener);
            return this;
        }

        public final a e(boolean z8) {
            this.f34890h = z8;
            return this;
        }

        public final a f(boolean z8) {
            this.f34891i = z8;
            return this;
        }

        public final InterfaceC3042b g() {
            return this.f34889g;
        }

        public final C3043c h() {
            return this.f34893k;
        }

        public final int i() {
            return this.f34906x;
        }

        public final H7.c j() {
            return this.f34905w;
        }

        public final C3047g k() {
            return this.f34904v;
        }

        public final int l() {
            return this.f34907y;
        }

        public final k m() {
            return this.f34884b;
        }

        public final List n() {
            return this.f34901s;
        }

        public final n o() {
            return this.f34892j;
        }

        public final p p() {
            return this.f34883a;
        }

        public final q q() {
            return this.f34894l;
        }

        public final r.c r() {
            return this.f34887e;
        }

        public final boolean s() {
            return this.f34890h;
        }

        public final boolean t() {
            return this.f34891i;
        }

        public final HostnameVerifier u() {
            return this.f34903u;
        }

        public final List v() {
            return this.f34885c;
        }

        public final long w() {
            return this.f34881C;
        }

        public final List x() {
            return this.f34886d;
        }

        public final int y() {
            return this.f34880B;
        }

        public final List z() {
            return this.f34902t;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(x okHttpClient) {
            this();
            kotlin.jvm.internal.t.g(okHttpClient, "okHttpClient");
            this.f34883a = okHttpClient.q();
            this.f34884b = okHttpClient.m();
            D6.w.E(this.f34885c, okHttpClient.z());
            D6.w.E(this.f34886d, okHttpClient.C());
            this.f34887e = okHttpClient.s();
            this.f34888f = okHttpClient.L();
            this.f34889g = okHttpClient.f();
            this.f34890h = okHttpClient.u();
            this.f34891i = okHttpClient.v();
            this.f34892j = okHttpClient.p();
            this.f34893k = okHttpClient.g();
            this.f34894l = okHttpClient.r();
            this.f34895m = okHttpClient.H();
            this.f34896n = okHttpClient.J();
            this.f34897o = okHttpClient.I();
            this.f34898p = okHttpClient.M();
            this.f34899q = okHttpClient.f34869q;
            this.f34900r = okHttpClient.Q();
            this.f34901s = okHttpClient.n();
            this.f34902t = okHttpClient.G();
            this.f34903u = okHttpClient.x();
            this.f34904v = okHttpClient.k();
            this.f34905w = okHttpClient.i();
            this.f34906x = okHttpClient.h();
            this.f34907y = okHttpClient.l();
            this.f34908z = okHttpClient.K();
            this.f34879A = okHttpClient.P();
            this.f34880B = okHttpClient.F();
            this.f34881C = okHttpClient.B();
            this.f34882D = okHttpClient.w();
        }
    }

    public x() {
        this(new a());
    }
}
