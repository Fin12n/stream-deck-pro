package z7;

import C7.m;
import C7.n;
import D6.C0938s;
import J7.InterfaceC1035f;
import J7.p;
import P2.Lsk.mHPawN;
import Z6.o;
import Z6.v;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import u7.B;
import u7.C3041a;
import u7.C3047g;
import u7.D;
import u7.InterfaceC3045e;
import u7.l;
import u7.r;
import u7.s;
import u7.x;
import u7.y;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends C7.f.c implements u7.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f39328t = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f39329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f39330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f39331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f39332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f39333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f39334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C7.f f39335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public J7.g f39336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC1035f f39337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f39338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39339m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39340n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f39342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f39343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f39344r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f39345s;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39346a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39346a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3047g f39347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f39348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3041a f39349c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3047g c3047g, s sVar, C3041a c3041a) {
            super(0);
            this.f39347a = c3047g;
            this.f39348b = sVar;
            this.f39349c = c3041a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            H7.c cVarD = this.f39347a.d();
            t.d(cVarD);
            return cVarD.a(this.f39348b.d(), this.f39349c.l().h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            s sVar = f.this.f39333g;
            t.d(sVar);
            List<Certificate> listD = sVar.d();
            ArrayList arrayList = new ArrayList(C0938s.y(listD, 10));
            for (Certificate certificate : listD) {
                t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I7.d.AbstractC0143d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z7.c f39351d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(J7.g gVar, InterfaceC1035f interfaceC1035f, z7.c cVar) {
            super(true, gVar, interfaceC1035f);
            this.f39351d = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f39351d.a(-1L, true, true, null);
        }
    }

    public f(g connectionPool, D route) {
        t.g(connectionPool, "connectionPool");
        t.g(route, "route");
        this.f39329c = connectionPool;
        this.f39330d = route;
        this.f39343q = 1;
        this.f39344r = new ArrayList();
        this.f39345s = Long.MAX_VALUE;
    }

    public D A() {
        return this.f39330d;
    }

    public final boolean B(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D d8 = (D) it.next();
            Proxy.Type type = d8.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f39330d.b().type() == type2 && t.c(this.f39330d.d(), d8.d())) {
                return true;
            }
        }
        return false;
    }

    public final void C(long j8) {
        this.f39345s = j8;
    }

    public final void D(boolean z8) {
        this.f39338l = z8;
    }

    public Socket E() {
        Socket socket = this.f39332f;
        t.d(socket);
        return socket;
    }

    public final void F(int i8) throws SocketException {
        Socket socket = this.f39332f;
        t.d(socket);
        J7.g gVar = this.f39336j;
        t.d(gVar);
        InterfaceC1035f interfaceC1035f = this.f39337k;
        t.d(interfaceC1035f);
        socket.setSoTimeout(0);
        C7.f fVarA = new C7.f.a(true, y7.e.f38468i).q(socket, this.f39330d.a().l().h(), gVar, interfaceC1035f).k(this).l(i8).a();
        this.f39335i = fVarA;
        this.f39343q = C7.f.f1518C.a().d();
        C7.f.f2(fVarA, false, null, 3, null);
    }

    public final boolean G(u7.u uVar) {
        s sVar;
        if (v7.d.f35186h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        u7.u uVarL = this.f39330d.a().l();
        if (uVar.l() != uVarL.l()) {
            return false;
        }
        if (t.c(uVar.h(), uVarL.h())) {
            return true;
        }
        if (!this.f39339m && (sVar = this.f39333g) != null) {
            t.d(sVar);
            if (e(uVar, sVar)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void H(z7.e call, IOException iOException) {
        try {
            t.g(call, "call");
            if (iOException instanceof n) {
                if (((n) iOException).f1665a == C7.b.REFUSED_STREAM) {
                    int i8 = this.f39342p + 1;
                    this.f39342p = i8;
                    if (i8 > 1) {
                        this.f39338l = true;
                        this.f39340n++;
                    }
                } else if (((n) iOException).f1665a != C7.b.CANCEL || !call.c()) {
                    this.f39338l = true;
                    this.f39340n++;
                }
            } else if (!v() || (iOException instanceof C7.a)) {
                this.f39338l = true;
                if (this.f39341o == 0) {
                    if (iOException != null) {
                        g(call.l(), this.f39330d, iOException);
                    }
                    this.f39340n++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // C7.f.c
    public synchronized void a(C7.f connection, m settings) {
        t.g(connection, "connection");
        t.g(settings, "settings");
        this.f39343q = settings.d();
    }

    @Override // C7.f.c
    public void b(C7.i stream) {
        t.g(stream, "stream");
        stream.d(C7.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f39331e;
        if (socket != null) {
            v7.d.n(socket);
        }
    }

    public final boolean e(u7.u uVar, s sVar) {
        List listD = sVar.d();
        if (!listD.isEmpty()) {
            H7.d dVar = H7.d.f3594a;
            String strH = uVar.h();
            Object obj = listD.get(0);
            t.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strH, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139 A[LOOP:0: B:69:0x0092->B:61:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x013f A[SYNTHETIC] */
    public final void f(int i8, int i9, int i10, int i11, boolean z8, InterfaceC3045e interfaceC3045e, r rVar) throws Throwable {
        IOException iOException;
        Socket socket;
        Socket socket2;
        InterfaceC3045e call = interfaceC3045e;
        r eventListener = rVar;
        t.g(call, "call");
        t.g(eventListener, "eventListener");
        if (this.f39334h != null) {
            throw new IllegalStateException("already connected");
        }
        List listB = this.f39330d.a().b();
        z7.b bVar = new z7.b(listB);
        if (this.f39330d.a().k() == null) {
            if (!listB.contains(l.f34768k)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strH = this.f39330d.a().l().h();
            if (!E7.h.f2311a.g().j(strH)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy"));
            }
        } else if (this.f39330d.a().f().contains(y.H2_PRIOR_KNOWLEDGE)) {
            throw new i(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        i iVar = null;
        while (true) {
            try {
                if (this.f39330d.c()) {
                    r rVar2 = eventListener;
                    InterfaceC3045e interfaceC3045e2 = call;
                    try {
                        j(i8, i9, i10, interfaceC3045e2, rVar2);
                        call = interfaceC3045e2;
                        eventListener = rVar2;
                        try {
                            if (this.f39331e != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e8) {
                            e = e8;
                            iOException = e;
                            socket = this.f39332f;
                            if (socket != null) {
                                v7.d.n(socket);
                            }
                            socket2 = this.f39331e;
                            if (socket2 != null) {
                                v7.d.n(socket2);
                            }
                            this.f39332f = null;
                            this.f39331e = null;
                            this.f39336j = null;
                            this.f39337k = null;
                            this.f39333g = null;
                            this.f39334h = null;
                            this.f39335i = null;
                            this.f39343q = 1;
                            eventListener.i(call, this.f39330d.d(), this.f39330d.b(), null, iOException);
                            if (iVar == null) {
                                iVar = new i(iOException);
                            } else {
                                iVar.a(iOException);
                            }
                            if (z8) {
                                throw iVar;
                            }
                            if (bVar.b(iOException)) {
                                throw iVar;
                            }
                            call = interfaceC3045e;
                            eventListener = rVar;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        call = interfaceC3045e2;
                        eventListener = rVar2;
                    }
                } else {
                    h(i8, i9, call, eventListener);
                }
                try {
                    m(bVar, i11, call, eventListener);
                    eventListener.h(call, this.f39330d.d(), this.f39330d.b(), this.f39334h);
                    break;
                } catch (IOException e10) {
                    e = e10;
                    iOException = e;
                    socket = this.f39332f;
                    if (socket != null) {
                        v7.d.n(socket);
                    }
                    socket2 = this.f39331e;
                    if (socket2 != null) {
                        v7.d.n(socket2);
                    }
                    this.f39332f = null;
                    this.f39331e = null;
                    this.f39336j = null;
                    this.f39337k = null;
                    this.f39333g = null;
                    this.f39334h = null;
                    this.f39335i = null;
                    this.f39343q = 1;
                    eventListener.i(call, this.f39330d.d(), this.f39330d.b(), null, iOException);
                    if (iVar == null) {
                        iVar = new i(iOException);
                    } else {
                        iVar.a(iOException);
                    }
                    if (z8) {
                        throw iVar;
                    }
                    if (bVar.b(iOException)) {
                        throw iVar;
                    }
                    call = interfaceC3045e;
                    eventListener = rVar;
                }
            } catch (IOException e11) {
                e = e11;
            }
            call = interfaceC3045e;
            eventListener = rVar;
        }
        if (this.f39330d.c() && this.f39331e == null) {
            throw new i(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f39345s = System.nanoTime();
    }

    public final void g(x client, D failedRoute, IOException failure) {
        t.g(client, "client");
        t.g(failedRoute, "failedRoute");
        t.g(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            C3041a c3041aA = failedRoute.a();
            c3041aA.i().connectFailed(c3041aA.l().q(), failedRoute.b().address(), failure);
        }
        client.w().b(failedRoute);
    }

    public final void h(int i8, int i9, InterfaceC3045e interfaceC3045e, r rVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f39330d.b();
        C3041a c3041aA = this.f39330d.a();
        Proxy.Type type = proxyB.type();
        int i10 = type == null ? -1 : b.f39346a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = c3041aA.j().createSocket();
            t.d(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.f39331e = socketCreateSocket;
        rVar.j(interfaceC3045e, this.f39330d.d(), proxyB);
        socketCreateSocket.setSoTimeout(i9);
        try {
            E7.h.f2311a.g().f(socketCreateSocket, this.f39330d.d(), i8);
            try {
                this.f39336j = p.d(p.l(socketCreateSocket));
                this.f39337k = p.c(p.h(socketCreateSocket));
            } catch (NullPointerException e8) {
                if (t.c(e8.getMessage(), "throw with null exception")) {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f39330d.d());
            connectException.initCause(e9);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(z7.b bVar) throws Throwable {
        C3041a c3041aA = this.f39330d.a();
        SSLSocketFactory sSLSocketFactoryK = c3041aA.k();
        SSLSocket sSLSocket = null;
        try {
            t.d(sSLSocketFactoryK);
            Socket socketCreateSocket = sSLSocketFactoryK.createSocket(this.f39331e, c3041aA.l().h(), c3041aA.l().l(), true);
            t.e(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                l lVarA = bVar.a(sSLSocket2);
                if (lVarA.h()) {
                    E7.h.f2311a.g().e(sSLSocket2, c3041aA.l().h(), c3041aA.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                s.a aVar = s.f34807e;
                t.f(sslSocketSession, "sslSocketSession");
                s sVarA = aVar.a(sslSocketSession);
                HostnameVerifier hostnameVerifierE = c3041aA.e();
                t.d(hostnameVerifierE);
                if (hostnameVerifierE.verify(c3041aA.l().h(), sslSocketSession)) {
                    C3047g c3047gA = c3041aA.a();
                    t.d(c3047gA);
                    this.f39333g = new s(sVarA.e(), sVarA.a(), sVarA.c(), new c(c3047gA, sVarA, c3041aA));
                    c3047gA.b(c3041aA.l().h(), new d());
                    String strH = lVarA.h() ? E7.h.f2311a.g().h(sSLSocket2) : null;
                    this.f39332f = sSLSocket2;
                    this.f39336j = p.d(p.l(sSLSocket2));
                    this.f39337k = p.c(p.h(sSLSocket2));
                    this.f39334h = strH != null ? y.f34909b.a(strH) : y.HTTP_1_1;
                    E7.h.f2311a.g().b(sSLSocket2);
                    return;
                }
                List listD = sVarA.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c3041aA.l().h() + " not verified (no certificates)");
                }
                Object obj = listD.get(0);
                t.e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                throw new SSLPeerUnverifiedException(o.h("\n              |Hostname " + c3041aA.l().h() + " not verified:\n              |    certificate: " + C3047g.f34625c.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + H7.d.f3594a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    E7.h.f2311a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    v7.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void j(int i8, int i9, int i10, InterfaceC3045e interfaceC3045e, r rVar) throws IOException {
        z zVarL = l();
        u7.u uVarJ = zVarL.j();
        for (int i11 = 0; i11 < 21; i11++) {
            h(i8, i9, interfaceC3045e, rVar);
            zVarL = k(i9, i10, zVarL, uVarJ);
            if (zVarL == null) {
                return;
            }
            Socket socket = this.f39331e;
            if (socket != null) {
                v7.d.n(socket);
            }
            this.f39331e = null;
            this.f39337k = null;
            this.f39336j = null;
            rVar.h(interfaceC3045e, this.f39330d.d(), this.f39330d.b(), null);
        }
    }

    public final z l() {
        z zVarB = new z.a().h(this.f39330d.a().l()).e("CONNECT", null).c("Host", v7.d.S(this.f39330d.a().l(), true)).c("Proxy-Connection", "Keep-Alive").c("User-Agent", "okhttp/4.12.0").b();
        z zVarA = this.f39330d.a().h().a(this.f39330d, new B.a().r(zVarB).p(y.HTTP_1_1).g(407).m("Preemptive Authenticate").b(v7.d.f35181c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return zVarA == null ? zVarB : zVarA;
    }

    public final void m(z7.b bVar, int i8, InterfaceC3045e interfaceC3045e, r rVar) throws Throwable {
        if (this.f39330d.a().k() != null) {
            rVar.C(interfaceC3045e);
            i(bVar);
            rVar.B(interfaceC3045e, this.f39333g);
            if (this.f39334h == y.HTTP_2) {
                F(i8);
                return;
            }
            return;
        }
        List listF = this.f39330d.a().f();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(yVar)) {
            this.f39332f = this.f39331e;
            this.f39334h = y.HTTP_1_1;
        } else {
            this.f39332f = this.f39331e;
            this.f39334h = yVar;
            F(i8);
        }
    }

    public final List n() {
        return this.f39344r;
    }

    public final long o() {
        return this.f39345s;
    }

    public final boolean p() {
        return this.f39338l;
    }

    public final int q() {
        return this.f39340n;
    }

    public s r() {
        return this.f39333g;
    }

    public final synchronized void s() {
        this.f39341o++;
    }

    public final boolean t(C3041a address, List list) {
        t.g(address, "address");
        if (v7.d.f35186h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f39344r.size() >= this.f39343q || this.f39338l || !this.f39330d.a().d(address)) {
            return false;
        }
        if (t.c(address.l().h(), A().a().l().h())) {
            return true;
        }
        if (this.f39335i == null || list == null || !B(list) || address.e() != H7.d.f3594a || !G(address.l())) {
            return false;
        }
        try {
            C3047g c3047gA = address.a();
            t.d(c3047gA);
            String strH = address.l().h();
            s sVarR = r();
            t.d(sVarR);
            c3047gA.a(strH, sVarR.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        Object objA;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f39330d.a().l().h());
        sb.append(':');
        sb.append(this.f39330d.a().l().l());
        sb.append(", proxy=");
        sb.append(this.f39330d.b());
        sb.append(" hostAddress=");
        sb.append(this.f39330d.d());
        sb.append(" cipherSuite=");
        s sVar = this.f39333g;
        if (sVar == null || (objA = sVar.a()) == null) {
            objA = "none";
        }
        sb.append(objA);
        sb.append(" protocol=");
        sb.append(this.f39334h);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(boolean z8) {
        long j8;
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f39331e;
        t.d(socket);
        Socket socket2 = this.f39332f;
        t.d(socket2);
        J7.g gVar = this.f39336j;
        t.d(gVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C7.f fVar = this.f39335i;
        if (fVar != null) {
            return fVar.C1(jNanoTime);
        }
        synchronized (this) {
            j8 = jNanoTime - this.f39345s;
        }
        if (j8 < 10000000000L || !z8) {
            return true;
        }
        return v7.d.G(socket2, gVar);
    }

    public final boolean v() {
        return this.f39335i != null;
    }

    public final I7.d.AbstractC0143d x(z7.c exchange) throws SocketException {
        t.g(exchange, "exchange");
        Socket socket = this.f39332f;
        t.d(socket);
        J7.g gVar = this.f39336j;
        t.d(gVar);
        InterfaceC1035f interfaceC1035f = this.f39337k;
        t.d(interfaceC1035f);
        socket.setSoTimeout(0);
        z();
        return new e(gVar, interfaceC1035f, exchange);
    }

    public final synchronized void y() {
        this.f39339m = true;
    }

    public final synchronized void z() {
        this.f39338l = true;
    }

    public final z k(int i8, int i9, z zVar, u7.u uVar) throws IOException {
        String str = "CONNECT " + v7.d.S(uVar, true) + HRHLwtyqJWz.uokfFAmJKgNBw;
        while (true) {
            J7.g gVar = this.f39336j;
            t.d(gVar);
            InterfaceC1035f interfaceC1035f = this.f39337k;
            t.d(interfaceC1035f);
            B7.b bVar = new B7.b(null, this, gVar, interfaceC1035f);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.r().g(i8, timeUnit);
            interfaceC1035f.r().g(i9, timeUnit);
            bVar.A(zVar.f(), str);
            bVar.a();
            B.a aVarC = bVar.c(false);
            t.d(aVarC);
            B bC = aVarC.r(zVar).c();
            bVar.z(bC);
            int iT = bC.t();
            if (iT == 200) {
                if (gVar.l().f0() && interfaceC1035f.l().f0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iT != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + bC.t());
            }
            z zVarA = this.f39330d.a().h().a(this.f39330d, bC);
            if (zVarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (v.v(mHPawN.XZwjnfa, B.A(bC, "Connection", null, 2, null), true)) {
                return zVarA;
            }
            zVar = zVarA;
        }
    }

    public final A7.d w(x client, A7.g gVar) throws SocketException {
        t.g(client, "client");
        t.g(gVar, uYOhHhTXuF.QgeEzNLdcfl);
        Socket socket = this.f39332f;
        t.d(socket);
        J7.g gVar2 = this.f39336j;
        t.d(gVar2);
        InterfaceC1035f interfaceC1035f = this.f39337k;
        t.d(interfaceC1035f);
        C7.f fVar = this.f39335i;
        if (fVar != null) {
            return new C7.g(client, this, gVar, fVar);
        }
        socket.setSoTimeout(gVar.k());
        J7.D dR = gVar2.r();
        long jH = gVar.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dR.g(jH, timeUnit);
        interfaceC1035f.r().g(gVar.j(), timeUnit);
        return new B7.b(client, this, gVar2, interfaceC1035f);
    }
}
