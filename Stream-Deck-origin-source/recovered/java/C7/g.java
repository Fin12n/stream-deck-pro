package C7;

import J7.A;
import J7.C;
import J7.D;
import R0.pkXL.Oitvkwcwn;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import u7.B;
import u7.x;
import u7.y;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements A7.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1595g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f1596h = v7.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f1597i = v7.d.w("connection", Oitvkwcwn.CMJRzHwzDZjkF, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7.f f1598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A7.g f1599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f1600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f1601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f1602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f1603f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final List a(z request) {
            t.g(request, "request");
            u7.t tVarF = request.f();
            ArrayList arrayList = new ArrayList(tVarF.size() + 4);
            arrayList.add(new c(c.f1485g, request.h()));
            arrayList.add(new c(c.f1486h, A7.i.f880a.c(request.j())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new c(c.f1488j, strD));
            }
            arrayList.add(new c(c.f1487i, request.j().p()));
            int size = tVarF.size();
            for (int i8 = 0; i8 < size; i8++) {
                String strM = tVarF.m(i8);
                Locale US = Locale.US;
                t.f(US, "US");
                String lowerCase = strM.toLowerCase(US);
                t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!g.f1596h.contains(lowerCase) || (t.c(lowerCase, "te") && t.c(tVarF.u(i8), "trailers"))) {
                    arrayList.add(new c(lowerCase, tVarF.u(i8)));
                }
            }
            return arrayList;
        }

        public final B.a b(u7.t headerBlock, y protocol) throws ProtocolException {
            t.g(headerBlock, "headerBlock");
            t.g(protocol, "protocol");
            u7.t.a aVar = new u7.t.a();
            int size = headerBlock.size();
            A7.k kVarA = null;
            for (int i8 = 0; i8 < size; i8++) {
                String strM = headerBlock.m(i8);
                String strU = headerBlock.u(i8);
                if (t.c(strM, ":status")) {
                    kVarA = A7.k.f883d.a("HTTP/1.1 " + strU);
                } else if (!g.f1597i.contains(strM)) {
                    aVar.c(strM, strU);
                }
            }
            if (kVarA != null) {
                return new B.a().p(protocol).g(kVarA.f885b).m(kVarA.f886c).k(aVar.d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public g(x client, z7.f connection, A7.g chain, f http2Connection) {
        t.g(client, "client");
        t.g(connection, "connection");
        t.g(chain, "chain");
        t.g(http2Connection, "http2Connection");
        this.f1598a = connection;
        this.f1599b = chain;
        this.f1600c = http2Connection;
        List listG = client.G();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        this.f1602e = listG.contains(yVar) ? yVar : y.HTTP_2;
    }

    @Override // A7.d
    public void a() {
        i iVar = this.f1601d;
        t.d(iVar);
        iVar.n().close();
    }

    @Override // A7.d
    public A b(z request, long j8) {
        t.g(request, "request");
        i iVar = this.f1601d;
        t.d(iVar);
        return iVar.n();
    }

    @Override // A7.d
    public B.a c(boolean z8) throws IOException {
        i iVar = this.f1601d;
        if (iVar == null) {
            throw new IOException("stream wasn't created");
        }
        B.a aVarB = f1595g.b(iVar.C(), this.f1602e);
        if (z8 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // A7.d
    public void cancel() {
        this.f1603f = true;
        i iVar = this.f1601d;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override // A7.d
    public z7.f d() {
        return this.f1598a;
    }

    @Override // A7.d
    public void e(z request) throws IOException {
        t.g(request, "request");
        if (this.f1601d != null) {
            return;
        }
        this.f1601d = this.f1600c.K1(f1595g.a(request), request.a() != null);
        if (this.f1603f) {
            i iVar = this.f1601d;
            t.d(iVar);
            iVar.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        i iVar2 = this.f1601d;
        t.d(iVar2);
        D dV = iVar2.v();
        long jH = this.f1599b.h();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dV.g(jH, timeUnit);
        i iVar3 = this.f1601d;
        t.d(iVar3);
        iVar3.E().g(this.f1599b.j(), timeUnit);
    }

    @Override // A7.d
    public void f() {
        this.f1600c.flush();
    }

    @Override // A7.d
    public long g(B response) {
        t.g(response, "response");
        if (A7.e.b(response)) {
            return v7.d.v(response);
        }
        return 0L;
    }

    @Override // A7.d
    public C h(B response) {
        t.g(response, "response");
        i iVar = this.f1601d;
        t.d(iVar);
        return iVar.p();
    }
}
