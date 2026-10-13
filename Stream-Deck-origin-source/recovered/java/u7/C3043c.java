package u7;

import D6.T;
import J7.C1034e;
import J7.InterfaceC1035f;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.O;

/* JADX INFO: renamed from: u7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3043c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f34569g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.d f34570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34575f;

    /* JADX INFO: renamed from: u7.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends C {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x7.d.C0844d f34576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f34578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final J7.g f34579e;

        /* JADX INFO: renamed from: u7.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0784a extends J7.k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f34580b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0784a(J7.C c8, a aVar) {
                super(c8);
                this.f34580b = aVar;
            }

            @Override // J7.k, J7.C, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f34580b.j().close();
                super.close();
            }
        }

        public a(x7.d.C0844d snapshot, String str, String str2) {
            kotlin.jvm.internal.t.g(snapshot, "snapshot");
            this.f34576b = snapshot;
            this.f34577c = str;
            this.f34578d = str2;
            this.f34579e = J7.p.d(new C0784a(snapshot.c(1), this));
        }

        @Override // u7.C
        public long b() {
            String str = this.f34578d;
            if (str != null) {
                return v7.d.W(str, -1L);
            }
            return -1L;
        }

        @Override // u7.C
        public J7.g c() {
            return this.f34579e;
        }

        public final x7.d.C0844d j() {
            return this.f34576b;
        }
    }

    /* JADX INFO: renamed from: u7.c$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final boolean a(B b8) {
            kotlin.jvm.internal.t.g(b8, "<this>");
            return d(b8.Y()).contains("*");
        }

        public final String b(u url) {
            kotlin.jvm.internal.t.g(url, "url");
            return J7.h.f4388d.d(url.toString()).A().x();
        }

        public final int c(J7.g source) throws IOException {
            kotlin.jvm.internal.t.g(source, "source");
            try {
                long jP0 = source.p0();
                String strN1 = source.n1();
                if (jP0 >= 0 && jP0 <= 2147483647L && strN1.length() <= 0) {
                    return (int) jP0;
                }
                throw new IOException("expected an int but was \"" + jP0 + strN1 + '\"');
            } catch (NumberFormatException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public final Set d(t tVar) {
            int size = tVar.size();
            TreeSet treeSet = null;
            for (int i8 = 0; i8 < size; i8++) {
                if (Z6.v.v("Vary", tVar.m(i8), true)) {
                    String strU = tVar.u(i8);
                    if (treeSet == null) {
                        treeSet = new TreeSet(Z6.v.w(O.f28784a));
                    }
                    Iterator it = Z6.w.z0(strU, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(Z6.w.W0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? T.d() : treeSet;
        }

        public final t e(t tVar, t tVar2) {
            Set setD = d(tVar2);
            if (setD.isEmpty()) {
                return v7.d.f35180b;
            }
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                String strM = tVar.m(i8);
                if (setD.contains(strM)) {
                    aVar.a(strM, tVar.u(i8));
                }
            }
            return aVar.d();
        }

        public final t f(B b8) {
            kotlin.jvm.internal.t.g(b8, "<this>");
            B bJ0 = b8.j0();
            kotlin.jvm.internal.t.d(bJ0);
            return e(bJ0.J0().f(), b8.Y());
        }

        public final boolean g(B cachedResponse, t cachedRequest, z newRequest) {
            kotlin.jvm.internal.t.g(cachedResponse, "cachedResponse");
            kotlin.jvm.internal.t.g(cachedRequest, "cachedRequest");
            kotlin.jvm.internal.t.g(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.Y());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!kotlin.jvm.internal.t.c(cachedRequest.y(str), newRequest.e(str))) {
                    return false;
                }
            }
            return true;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: u7.c$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class d implements x7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x7.d.b f34594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J7.A f34595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final J7.A f34596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f34597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C3043c f34598e;

        /* JADX INFO: renamed from: u7.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends J7.j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3043c f34599b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f34600c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3043c c3043c, d dVar, J7.A a8) {
                super(a8);
                this.f34599b = c3043c;
                this.f34600c = dVar;
            }

            @Override // J7.j, J7.A, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                C3043c c3043c = this.f34599b;
                d dVar = this.f34600c;
                synchronized (c3043c) {
                    if (dVar.d()) {
                        return;
                    }
                    dVar.e(true);
                    c3043c.z(c3043c.o() + 1);
                    super.close();
                    this.f34600c.f34594a.b();
                }
            }
        }

        public d(C3043c c3043c, x7.d.b editor) {
            kotlin.jvm.internal.t.g(editor, "editor");
            this.f34598e = c3043c;
            this.f34594a = editor;
            J7.A aF = editor.f(1);
            this.f34595b = aF;
            this.f34596c = new a(c3043c, this, aF);
        }

        @Override // x7.b
        public void a() {
            C3043c c3043c = this.f34598e;
            synchronized (c3043c) {
                if (this.f34597d) {
                    return;
                }
                this.f34597d = true;
                c3043c.y(c3043c.j() + 1);
                v7.d.m(this.f34595b);
                try {
                    this.f34594a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // x7.b
        public J7.A b() {
            return this.f34596c;
        }

        public final boolean d() {
            return this.f34597d;
        }

        public final void e(boolean z8) {
            this.f34597d = z8;
        }
    }

    public C3043c(File directory, long j8, D7.a fileSystem) {
        kotlin.jvm.internal.t.g(directory, "directory");
        kotlin.jvm.internal.t.g(fileSystem, "fileSystem");
        this.f34570a = new x7.d(fileSystem, directory, 201105, 2, j8, y7.e.f38468i);
    }

    public final synchronized void A() {
        this.f34574e++;
    }

    public final synchronized void Y(x7.c cacheStrategy) {
        try {
            kotlin.jvm.internal.t.g(cacheStrategy, "cacheStrategy");
            this.f34575f++;
            if (cacheStrategy.b() != null) {
                this.f34573d++;
            } else if (cacheStrategy.a() != null) {
                this.f34574e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(x7.d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final B c(z request) {
        kotlin.jvm.internal.t.g(request, "request");
        try {
            x7.d.C0844d c0844dW0 = this.f34570a.w0(f34569g.b(request.j()));
            if (c0844dW0 == null) {
                return null;
            }
            try {
                C0785c c0785c = new C0785c(c0844dW0.c(0));
                B bD = c0785c.d(c0844dW0);
                if (c0785c.b(request, bD)) {
                    return bD;
                }
                C cB = bD.b();
                if (cB != null) {
                    v7.d.m(cB);
                }
                return null;
            } catch (IOException unused) {
                v7.d.m(c0844dW0);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34570a.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f34570a.flush();
    }

    public final void i0(B cached, B network) throws IllegalAccessException, InvocationTargetException {
        x7.d.b bVarB;
        kotlin.jvm.internal.t.g(cached, "cached");
        kotlin.jvm.internal.t.g(network, "network");
        C0785c c0785c = new C0785c(network);
        C cB = cached.b();
        kotlin.jvm.internal.t.e(cB, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarB = ((a) cB).j().b();
            if (bVarB == null) {
                return;
            }
            try {
                c0785c.f(bVarB);
                bVarB.b();
            } catch (IOException unused) {
                b(bVarB);
            }
        } catch (IOException unused2) {
            bVarB = null;
        }
    }

    public final int j() {
        return this.f34572c;
    }

    public final int o() {
        return this.f34571b;
    }

    public final x7.b t(B response) throws IllegalAccessException, InvocationTargetException {
        x7.d.b bVarR0;
        kotlin.jvm.internal.t.g(response, "response");
        String strH = response.J0().h();
        if (A7.f.f867a.a(response.J0().h())) {
            try {
                v(response.J0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!kotlin.jvm.internal.t.c(strH, "GET")) {
            return null;
        }
        b bVar = f34569g;
        if (bVar.a(response)) {
            return null;
        }
        C0785c c0785c = new C0785c(response);
        try {
            bVarR0 = x7.d.r0(this.f34570a, bVar.b(response.J0().j()), 0L, 2, null);
            if (bVarR0 == null) {
                return null;
            }
            try {
                c0785c.f(bVarR0);
                return new d(this, bVarR0);
            } catch (IOException unused2) {
                b(bVarR0);
                return null;
            }
        } catch (IOException unused3) {
            bVarR0 = null;
        }
    }

    public final void v(z request) {
        kotlin.jvm.internal.t.g(request, "request");
        this.f34570a.k1(f34569g.b(request.j()));
    }

    public final void y(int i8) {
        this.f34572c = i8;
    }

    public final void z(int i8) {
        this.f34571b = i8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3043c(File directory, long j8) {
        this(directory, j8, D7.a.f1958b);
        kotlin.jvm.internal.t.g(directory, "directory");
    }

    /* JADX INFO: renamed from: u7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0785c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f34581k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f34582l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f34583m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f34584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f34585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y f34587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f34588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f34589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final t f34590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f34591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f34592i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f34593j;

        /* JADX INFO: renamed from: u7.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public a() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            E7.h.a aVar = E7.h.f2311a;
            sb.append(aVar.g().g());
            sb.append("-Sent-Millis");
            f34582l = sb.toString();
            f34583m = aVar.g().g() + "-Received-Millis";
        }

        public C0785c(J7.C rawSource) throws IllegalAccessException, IOException, InvocationTargetException {
            kotlin.jvm.internal.t.g(rawSource, "rawSource");
            try {
                J7.g gVarD = J7.p.d(rawSource);
                String strN1 = gVarD.n1();
                u uVarF = u.f34818k.f(strN1);
                if (uVarF == null) {
                    IOException iOException = new IOException("Cache corruption for " + strN1);
                    E7.h.f2311a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f34584a = uVarF;
                this.f34586c = gVarD.n1();
                t.a aVar = new t.a();
                int iC = C3043c.f34569g.c(gVarD);
                for (int i8 = 0; i8 < iC; i8++) {
                    aVar.b(gVarD.n1());
                }
                this.f34585b = aVar.d();
                A7.k kVarA = A7.k.f883d.a(gVarD.n1());
                this.f34587d = kVarA.f884a;
                this.f34588e = kVarA.f885b;
                this.f34589f = kVarA.f886c;
                t.a aVar2 = new t.a();
                int iC2 = C3043c.f34569g.c(gVarD);
                for (int i9 = 0; i9 < iC2; i9++) {
                    aVar2.b(gVarD.n1());
                }
                String str = f34582l;
                String strE = aVar2.e(str);
                String str2 = f34583m;
                String strE2 = aVar2.e(str2);
                aVar2.g(str);
                aVar2.g(str2);
                this.f34592i = strE != null ? Long.parseLong(strE) : 0L;
                this.f34593j = strE2 != null ? Long.parseLong(strE2) : 0L;
                this.f34590g = aVar2.d();
                if (a()) {
                    String strN2 = gVarD.n1();
                    if (strN2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strN2 + '\"');
                    }
                    this.f34591h = s.f34807e.b(!gVarD.f0() ? E.f34546b.a(gVarD.n1()) : E.SSL_3_0, i.f34692b.b(gVarD.n1()), c(gVarD), c(gVarD));
                } else {
                    this.f34591h = null;
                }
                C6.G g8 = C6.G.f1419a;
                N6.a.a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(rawSource, th);
                    throw th2;
                }
            }
        }

        public final boolean a() {
            return kotlin.jvm.internal.t.c(this.f34584a.p(), "https");
        }

        public final boolean b(z request, B response) {
            kotlin.jvm.internal.t.g(request, "request");
            kotlin.jvm.internal.t.g(response, "response");
            return kotlin.jvm.internal.t.c(this.f34584a, request.j()) && kotlin.jvm.internal.t.c(this.f34586c, request.h()) && C3043c.f34569g.g(response, this.f34585b, request);
        }

        public final List c(J7.g gVar) throws IOException {
            int iC = C3043c.f34569g.c(gVar);
            if (iC == -1) {
                return D6.r.n();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i8 = 0; i8 < iC; i8++) {
                    String strN1 = gVar.n1();
                    C1034e c1034e = new C1034e();
                    J7.h hVarA = J7.h.f4388d.a(strN1);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c1034e.R0(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(c1034e.Y1()));
                }
                return arrayList;
            } catch (CertificateException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public final B d(x7.d.C0844d snapshot) {
            kotlin.jvm.internal.t.g(snapshot, "snapshot");
            String strC = this.f34590g.c("Content-Type");
            String strC2 = this.f34590g.c("Content-Length");
            return new B.a().r(new z.a().h(this.f34584a).e(this.f34586c, null).d(this.f34585b).b()).p(this.f34587d).g(this.f34588e).m(this.f34589f).k(this.f34590g).b(new a(snapshot, strC, strC2)).i(this.f34591h).s(this.f34592i).q(this.f34593j).c();
        }

        public final void e(InterfaceC1035f interfaceC1035f, List list) throws IOException {
            try {
                interfaceC1035f.T1(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    J7.h.a aVar = J7.h.f4388d;
                    kotlin.jvm.internal.t.f(bytes, "bytes");
                    interfaceC1035f.I0(J7.h.a.f(aVar, bytes, 0, 0, 3, null).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e8) {
                throw new IOException(e8.getMessage());
            }
        }

        public final void f(x7.d.b editor) throws IllegalAccessException, IOException, InvocationTargetException {
            kotlin.jvm.internal.t.g(editor, "editor");
            InterfaceC1035f interfaceC1035fC = J7.p.c(editor.f(0));
            try {
                interfaceC1035fC.I0(this.f34584a.toString()).writeByte(10);
                interfaceC1035fC.I0(this.f34586c).writeByte(10);
                interfaceC1035fC.T1(this.f34585b.size()).writeByte(10);
                int size = this.f34585b.size();
                for (int i8 = 0; i8 < size; i8++) {
                    interfaceC1035fC.I0(this.f34585b.m(i8)).I0(": ").I0(this.f34585b.u(i8)).writeByte(10);
                }
                interfaceC1035fC.I0(new A7.k(this.f34587d, this.f34588e, this.f34589f).toString()).writeByte(10);
                interfaceC1035fC.T1(this.f34590g.size() + 2).writeByte(10);
                int size2 = this.f34590g.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    interfaceC1035fC.I0(this.f34590g.m(i9)).I0(": ").I0(this.f34590g.u(i9)).writeByte(10);
                }
                interfaceC1035fC.I0(f34582l).I0(": ").T1(this.f34592i).writeByte(10);
                interfaceC1035fC.I0(f34583m).I0(": ").T1(this.f34593j).writeByte(10);
                if (a()) {
                    interfaceC1035fC.writeByte(10);
                    s sVar = this.f34591h;
                    kotlin.jvm.internal.t.d(sVar);
                    interfaceC1035fC.I0(sVar.a().c()).writeByte(10);
                    e(interfaceC1035fC, this.f34591h.d());
                    e(interfaceC1035fC, this.f34591h.c());
                    interfaceC1035fC.I0(this.f34591h.e().b()).writeByte(10);
                }
                C6.G g8 = C6.G.f1419a;
                N6.a.a(interfaceC1035fC, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(interfaceC1035fC, th);
                    throw th2;
                }
            }
        }

        public C0785c(B response) {
            kotlin.jvm.internal.t.g(response, "response");
            this.f34584a = response.J0().j();
            this.f34585b = C3043c.f34569g.f(response);
            this.f34586c = response.J0().h();
            this.f34587d = response.A0();
            this.f34588e = response.t();
            this.f34589f = response.i0();
            this.f34590g = response.Y();
            this.f34591h = response.y();
            this.f34592i = response.L0();
            this.f34593j = response.H0();
        }
    }
}
