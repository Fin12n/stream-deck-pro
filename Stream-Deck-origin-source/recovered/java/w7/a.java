package w7;

import Z6.v;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import u7.B;
import u7.C3041a;
import u7.D;
import u7.InterfaceC3042b;
import u7.h;
import u7.o;
import u7.q;
import u7.u;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements InterfaceC3042b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f37137d;

    /* JADX INFO: renamed from: w7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0821a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37138a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37138a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // u7.InterfaceC3042b
    public z a(D d8, B response) {
        Proxy proxy;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C3041a c3041aA;
        t.g(response, "response");
        List<h> listO = response.o();
        z zVarJ0 = response.J0();
        u uVarJ = zVarJ0.j();
        boolean z8 = response.t() == 407;
        if (d8 == null || (proxy = d8.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : listO) {
            if (v.v("Basic", hVar.c(), true)) {
                if (d8 == null || (c3041aA = d8.a()) == null || (qVarC = c3041aA.c()) == null) {
                    qVarC = this.f37137d;
                }
                if (z8) {
                    SocketAddress socketAddressAddress = proxy.address();
                    t.e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    t.f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, uVarJ, qVarC), inetSocketAddress.getPort(), uVarJ.p(), hVar.b(), hVar.c(), uVarJ.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarJ.h();
                    t.f(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxy, uVarJ, qVarC), uVarJ.l(), uVarJ.p(), hVar.b(), hVar.c(), uVarJ.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z8 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    t.f(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    t.f(password, "auth.password");
                    return zVarJ0.i().c(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0821a.f37138a[type.ordinal()]) == 1) {
            return (InetAddress) D6.z.i0(qVar.a(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        t.e(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        t.f(address, "address() as InetSocketAddress).address");
        return address;
    }

    public a(q defaultDns) {
        t.g(defaultDns, "defaultDns");
        this.f37137d = defaultDns;
    }

    public /* synthetic */ a(q qVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? q.f34803b : qVar);
    }
}
