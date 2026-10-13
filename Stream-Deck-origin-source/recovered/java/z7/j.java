package z7;

import D6.C0937q;
import D6.w;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import u7.C3041a;
import u7.D;
import u7.InterfaceC3045e;
import u7.r;
import u7.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f39362i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3041a f39363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f39364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3045e f39365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f39366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f39367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f39369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f39370h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            t.g(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                t.f(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            t.f(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f39371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39372b;

        public b(List<D> routes) {
            t.g(routes, "routes");
            this.f39371a = routes;
        }

        public final List a() {
            return this.f39371a;
        }

        public final boolean b() {
            return this.f39372b < this.f39371a.size();
        }

        public final D c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f39371a;
            int i8 = this.f39372b;
            this.f39372b = i8 + 1;
            return (D) list.get(i8);
        }
    }

    public j(C3041a address, h routeDatabase, InterfaceC3045e call, r eventListener) {
        t.g(address, "address");
        t.g(routeDatabase, "routeDatabase");
        t.g(call, "call");
        t.g(eventListener, "eventListener");
        this.f39363a = address;
        this.f39364b = routeDatabase;
        this.f39365c = call;
        this.f39366d = eventListener;
        this.f39367e = D6.r.n();
        this.f39369g = D6.r.n();
        this.f39370h = new ArrayList();
        f(address.l(), address.g());
    }

    public static final List g(Proxy proxy, u uVar, j jVar) {
        if (proxy != null) {
            return C0937q.e(proxy);
        }
        URI uriQ = uVar.q();
        if (uriQ.getHost() == null) {
            return v7.d.w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = jVar.f39363a.i().select(uriQ);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return v7.d.w(Proxy.NO_PROXY);
        }
        t.f(proxiesOrNull, "proxiesOrNull");
        return v7.d.U(proxiesOrNull);
    }

    public final boolean a() {
        return b() || !this.f39370h.isEmpty();
    }

    public final boolean b() {
        return this.f39368f < this.f39367e.size();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator it = this.f39369g.iterator();
            while (it.hasNext()) {
                D d8 = new D(this.f39363a, proxyD, (InetSocketAddress) it.next());
                if (this.f39364b.c(d8)) {
                    this.f39370h.add(d8);
                } else {
                    arrayList.add(d8);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            w.E(arrayList, this.f39370h);
            this.f39370h.clear();
        }
        return new b(arrayList);
    }

    public final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f39367e;
            int i8 = this.f39368f;
            this.f39368f = i8 + 1;
            Proxy proxy = (Proxy) list.get(i8);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f39363a.l().h() + "; exhausted proxy configurations: " + this.f39367e);
    }

    public final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iL;
        List listA;
        ArrayList arrayList = new ArrayList();
        this.f39369g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f39363a.l().h();
            iL = this.f39363a.l().l();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            a aVar = f39362i;
            t.f(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strH = aVar.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        if (1 > iL || iL >= 65536) {
            throw new SocketException("No route to " + strH + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iL));
            return;
        }
        if (v7.d.i(strH)) {
            listA = C0937q.e(InetAddress.getByName(strH));
        } else {
            this.f39366d.n(this.f39365c, strH);
            listA = this.f39363a.c().a(strH);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f39363a.c() + " returned no addresses for " + strH);
            }
            this.f39366d.m(this.f39365c, strH, listA);
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iL));
        }
    }

    public final void f(u uVar, Proxy proxy) {
        this.f39366d.p(this.f39365c, uVar);
        List listG = g(proxy, uVar, this);
        this.f39367e = listG;
        this.f39368f = 0;
        this.f39366d.o(this.f39365c, uVar, listG);
    }
}
