package I7;

import D6.C0937q;
import J7.InterfaceC1035f;
import P2.Lsk.mHPawN;
import W6.i;
import Z6.v;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p143q0.nKy.bGZGhbtQmA;
import u7.B;
import u7.F;
import u7.G;
import u7.InterfaceC3045e;
import u7.InterfaceC3046f;
import u7.r;
import u7.x;
import u7.y;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements F, I7.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f3806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f3807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public I7.e f3809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3045e f3812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y7.a f3813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public I7.g f3814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I7.h f3815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y7.d f3816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f3817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AbstractC0143d f3818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f3819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f3820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f3824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3825u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3826v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3829y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f3804z = new b(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final List f3803A = C0937q.e(y.HTTP_1_1);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J7.h f3831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f3832c;

        public a(int i8, J7.h hVar, long j8) {
            this.f3830a = i8;
            this.f3831b = hVar;
            this.f3832c = j8;
        }

        public final long a() {
            return this.f3832c;
        }

        public final int b() {
            return this.f3830a;
        }

        public final J7.h c() {
            return this.f3831b;
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J7.h f3834b;

        public c(int i8, J7.h data) {
            t.g(data, "data");
            this.f3833a = i8;
            this.f3834b = data;
        }

        public final J7.h a() {
            return this.f3834b;
        }

        public final int b() {
            return this.f3833a;
        }
    }

    /* JADX INFO: renamed from: I7.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class AbstractC0143d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J7.g f3836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC1035f f3837c;

        public AbstractC0143d(boolean z8, J7.g source, InterfaceC1035f sink) {
            t.g(source, "source");
            t.g(sink, "sink");
            this.f3835a = z8;
            this.f3836b = source;
            this.f3837c = sink;
        }

        public final boolean b() {
            return this.f3835a;
        }

        public final InterfaceC1035f c() {
            return this.f3837c;
        }

        public final J7.g j() {
            return this.f3836b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class e extends y7.a {
        public e() {
            super(d.this.f3817m + " writer", false, 2, null);
        }

        @Override // y7.a
        public long f() {
            try {
                return d.this.w() ? 0L : -1L;
            } catch (IOException e8) {
                d.this.p(e8, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements InterfaceC3046f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z f3840b;

        public f(z zVar) {
            this.f3840b = zVar;
        }

        @Override // u7.InterfaceC3046f
        public void a(InterfaceC3045e call, B response) throws Throwable {
            t.g(call, "call");
            t.g(response, "response");
            z7.c cVarV = response.v();
            try {
                d.this.m(response, cVarV);
                t.d(cVarV);
                AbstractC0143d abstractC0143dN = cVarV.n();
                I7.e eVarA = I7.e.f3844g.a(response.Y());
                d.this.f3809e = eVarA;
                if (!d.this.s(eVarA)) {
                    d dVar = d.this;
                    synchronized (dVar) {
                        dVar.f3820p.clear();
                        dVar.d(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    d.this.r(v7.d.f35187i + " WebSocket " + this.f3840b.j().n(), abstractC0143dN);
                    d.this.q().h(d.this, response);
                    d.this.t();
                } catch (Exception e8) {
                    d.this.p(e8, null);
                }
            } catch (IOException e9) {
                d.this.p(e9, response);
                v7.d.m(response);
                if (cVarV != null) {
                    cVarV.v();
                }
            }
        }

        @Override // u7.InterfaceC3046f
        public void b(InterfaceC3045e call, IOException e8) {
            t.g(call, "call");
            t.g(e8, "e");
            d.this.p(e8, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f3841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f3842f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, d dVar, long j8) {
            super(str, false, 2, null);
            this.f3841e = dVar;
            this.f3842f = j8;
        }

        @Override // y7.a
        public long f() {
            this.f3841e.x();
            return this.f3842f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends y7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f3843e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z8, d dVar) {
            super(str, z8);
            this.f3843e = dVar;
        }

        @Override // y7.a
        public long f() {
            this.f3843e.cancel();
            return -1L;
        }
    }

    public d(y7.e taskRunner, z originalRequest, G listener, Random random, long j8, I7.e eVar, long j9) {
        t.g(taskRunner, "taskRunner");
        t.g(originalRequest, "originalRequest");
        t.g(listener, "listener");
        t.g(random, "random");
        this.f3805a = originalRequest;
        this.f3806b = listener;
        this.f3807c = random;
        this.f3808d = j8;
        this.f3809e = eVar;
        this.f3810f = j9;
        this.f3816l = taskRunner.i();
        this.f3819o = new ArrayDeque();
        this.f3820p = new ArrayDeque();
        this.f3823s = -1;
        if (!t.c("GET", originalRequest.h())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.h()).toString());
        }
        J7.h.a aVar = J7.h.f4388d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        C6.G g8 = C6.G.f1419a;
        this.f3811g = J7.h.a.f(aVar, bArr, 0, 0, 3, null).a();
    }

    @Override // u7.F
    public boolean a(String text) {
        t.g(text, "text");
        return v(J7.h.f4388d.d(text), 1);
    }

    @Override // I7.g.a
    public void b(String text) {
        t.g(text, "text");
        this.f3806b.g(this, text);
    }

    @Override // I7.g.a
    public synchronized void c(J7.h hVar) {
        t.g(hVar, uYOhHhTXuF.bbZbsshEqTTKVH);
        this.f3828x++;
        this.f3829y = false;
    }

    @Override // u7.F
    public void cancel() {
        InterfaceC3045e interfaceC3045e = this.f3812h;
        t.d(interfaceC3045e);
        interfaceC3045e.cancel();
    }

    @Override // u7.F
    public boolean d(int i8, String str) {
        return n(i8, str, 60000L);
    }

    @Override // I7.g.a
    public synchronized void f(J7.h payload) {
        try {
            t.g(payload, "payload");
            if (!this.f3825u && (!this.f3822r || !this.f3820p.isEmpty())) {
                this.f3819o.add(payload);
                u();
                this.f3827w++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // I7.g.a
    public void g(J7.h bytes) {
        t.g(bytes, "bytes");
        this.f3806b.f(this, bytes);
    }

    public final void m(B response, z7.c cVar) throws ProtocolException {
        t.g(response, "response");
        if (response.t() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.t() + ' ' + response.i0() + '\'');
        }
        String strA = B.A(response, "Connection", null, 2, null);
        if (!v.v("Upgrade", strA, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strA + '\'');
        }
        String strA2 = B.A(response, "Upgrade", null, 2, null);
        if (!v.v("websocket", strA2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strA2 + '\'');
        }
        String strA3 = B.A(response, "Sec-WebSocket-Accept", null, 2, null);
        String strA4 = J7.h.f4388d.d(this.f3811g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").F().a();
        if (t.c(strA4, strA3)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA4 + "' but was '" + strA3 + '\'');
    }

    public final synchronized boolean n(int i8, String str, long j8) {
        J7.h hVarD;
        try {
            I7.f.f3851a.c(i8);
            if (str != null) {
                hVarD = J7.h.f4388d.d(str);
                if (hVarD.H() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                hVarD = null;
            }
            if (!this.f3825u && !this.f3822r) {
                this.f3822r = true;
                this.f3820p.add(new a(i8, hVarD, j8));
                u();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(x client) {
        t.g(client, "client");
        if (this.f3805a.d("Sec-WebSocket-Extensions") != null) {
            p(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        x xVarA = client.D().d(r.f34806b).K(f3803A).a();
        z zVarB = this.f3805a.i().c("Upgrade", "websocket").c("Connection", "Upgrade").c("Sec-WebSocket-Key", this.f3811g).c("Sec-WebSocket-Version", "13").c("Sec-WebSocket-Extensions", "permessage-deflate").b();
        z7.e eVar = new z7.e(xVarA, zVarB, true);
        this.f3812h = eVar;
        t.d(eVar);
        eVar.t(new f(zVarB));
    }

    public final void p(Exception e8, B b8) {
        t.g(e8, "e");
        synchronized (this) {
            if (this.f3825u) {
                return;
            }
            this.f3825u = true;
            AbstractC0143d abstractC0143d = this.f3818n;
            this.f3818n = null;
            I7.g gVar = this.f3814j;
            this.f3814j = null;
            I7.h hVar = this.f3815k;
            this.f3815k = null;
            this.f3816l.n();
            C6.G g8 = C6.G.f1419a;
            try {
                this.f3806b.d(this, e8, b8);
            } finally {
                if (abstractC0143d != null) {
                    v7.d.m(abstractC0143d);
                }
                if (gVar != null) {
                    v7.d.m(gVar);
                }
                if (hVar != null) {
                    v7.d.m(hVar);
                }
            }
        }
    }

    public final G q() {
        return this.f3806b;
    }

    public final boolean s(I7.e eVar) {
        if (!eVar.f3850f && eVar.f3846b == null) {
            return eVar.f3848d == null || new i(8, 15).D(eVar.f3848d.intValue());
        }
        return false;
    }

    public final void t() {
        while (this.f3823s == -1) {
            I7.g gVar = this.f3814j;
            t.d(gVar);
            gVar.b();
        }
    }

    public final void u() {
        if (!v7.d.f35186h || Thread.holdsLock(this)) {
            y7.a aVar = this.f3813i;
            if (aVar != null) {
                y7.d.j(this.f3816l, aVar, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final synchronized boolean v(J7.h hVar, int i8) {
        if (!this.f3825u && !this.f3822r) {
            if (this.f3821q + ((long) hVar.H()) > 16777216) {
                d(1001, null);
                return false;
            }
            this.f3821q += (long) hVar.H();
            this.f3820p.add(new c(i8, hVar));
            u();
            return true;
        }
        return false;
    }

    public final boolean w() {
        String str;
        I7.g gVar;
        I7.h hVar;
        int i8;
        AbstractC0143d abstractC0143d;
        synchronized (this) {
            try {
                if (this.f3825u) {
                    return false;
                }
                I7.h hVar2 = this.f3815k;
                Object objPoll = this.f3819o.poll();
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.f3820p.poll();
                    if (objPoll2 instanceof a) {
                        i8 = this.f3823s;
                        str = this.f3824t;
                        if (i8 != -1) {
                            abstractC0143d = this.f3818n;
                            this.f3818n = null;
                            gVar = this.f3814j;
                            this.f3814j = null;
                            hVar = this.f3815k;
                            this.f3815k = null;
                            this.f3816l.n();
                        } else {
                            long jA = ((a) objPoll2).a();
                            this.f3816l.i(new h(this.f3817m + " cancel", true, this), TimeUnit.MILLISECONDS.toNanos(jA));
                            abstractC0143d = null;
                            gVar = null;
                            hVar = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        gVar = null;
                        hVar = null;
                        i8 = -1;
                        abstractC0143d = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    gVar = null;
                    hVar = null;
                    i8 = -1;
                    abstractC0143d = null;
                }
                C6.G g8 = C6.G.f1419a;
                try {
                    if (objPoll != null) {
                        t.d(hVar2);
                        hVar2.t((J7.h) objPoll);
                    } else if (obj instanceof c) {
                        c cVar = (c) obj;
                        t.d(hVar2);
                        hVar2.j(cVar.b(), cVar.a());
                        synchronized (this) {
                            this.f3821q -= (long) cVar.a().H();
                        }
                    } else {
                        if (!(obj instanceof a)) {
                            throw new AssertionError();
                        }
                        a aVar = (a) obj;
                        t.d(hVar2);
                        hVar2.b(aVar.b(), aVar.c());
                        if (abstractC0143d != null) {
                            G g9 = this.f3806b;
                            t.d(str);
                            g9.a(this, i8, str);
                        }
                    }
                    if (abstractC0143d != null) {
                        v7.d.m(abstractC0143d);
                    }
                    if (gVar != null) {
                        v7.d.m(gVar);
                    }
                    if (hVar != null) {
                        v7.d.m(hVar);
                    }
                    return true;
                } catch (Throwable th) {
                    if (abstractC0143d != null) {
                        v7.d.m(abstractC0143d);
                    }
                    if (gVar != null) {
                        v7.d.m(gVar);
                    }
                    if (hVar != null) {
                        v7.d.m(hVar);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        synchronized (this) {
            try {
                if (this.f3825u) {
                    return;
                }
                I7.h hVar = this.f3815k;
                if (hVar == null) {
                    return;
                }
                int i8 = this.f3829y ? this.f3826v : -1;
                this.f3826v++;
                this.f3829y = true;
                C6.G g8 = C6.G.f1419a;
                if (i8 == -1) {
                    try {
                        hVar.o(J7.h.f4389e);
                        return;
                    } catch (IOException e8) {
                        p(e8, null);
                        return;
                    }
                }
                p(new SocketTimeoutException(GOKsbdzhLhXAMt.dfNB + this.f3808d + "ms (after " + (i8 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u7.F
    public boolean e(J7.h hVar) {
        t.g(hVar, uYOhHhTXuF.FBoJqmiBY);
        return v(hVar, 2);
    }

    @Override // I7.g.a
    public void h(int i8, String reason) {
        AbstractC0143d abstractC0143d;
        I7.g gVar;
        I7.h hVar;
        t.g(reason, "reason");
        if (i8 == -1) {
            throw new IllegalArgumentException(mHPawN.EMkEctZXHomhCOG);
        }
        synchronized (this) {
            try {
                if (this.f3823s != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f3823s = i8;
                this.f3824t = reason;
                abstractC0143d = null;
                if (this.f3822r && this.f3820p.isEmpty()) {
                    AbstractC0143d abstractC0143d2 = this.f3818n;
                    this.f3818n = null;
                    gVar = this.f3814j;
                    this.f3814j = null;
                    hVar = this.f3815k;
                    this.f3815k = null;
                    this.f3816l.n();
                    abstractC0143d = abstractC0143d2;
                } else {
                    gVar = null;
                    hVar = null;
                }
                C6.G g8 = C6.G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f3806b.b(this, i8, reason);
            if (abstractC0143d != null) {
                this.f3806b.a(this, i8, reason);
            }
        } finally {
            if (abstractC0143d != null) {
                v7.d.m(abstractC0143d);
            }
            if (gVar != null) {
                v7.d.m(gVar);
            }
            if (hVar != null) {
                v7.d.m(hVar);
            }
        }
    }

    public final void r(String str, AbstractC0143d streams) throws Throwable {
        Throwable th;
        t.g(str, bGZGhbtQmA.EGffJ);
        t.g(streams, "streams");
        I7.e eVar = this.f3809e;
        t.d(eVar);
        synchronized (this) {
            try {
                this.f3817m = str;
                this.f3818n = streams;
                this.f3815k = new I7.h(streams.b(), streams.c(), this.f3807c, eVar.f3845a, eVar.a(streams.b()), this.f3810f);
                this.f3813i = new e();
                long j8 = this.f3808d;
                if (j8 != 0) {
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j8);
                        this.f3816l.i(new g(str + " ping", this, nanos), nanos);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!this.f3820p.isEmpty()) {
                    u();
                }
                C6.G g8 = C6.G.f1419a;
                this.f3814j = new I7.g(streams.b(), streams.j(), this, eVar.f3845a, eVar.a(!streams.b()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
