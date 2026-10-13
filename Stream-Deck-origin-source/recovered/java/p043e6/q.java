package p043e6;

import C6.r;
import H6.c;
import I6.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p034d6.f;
import p034d6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends m implements n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SocketChannel f20863m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20865b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20867d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20865b = obj;
            this.f20867d |= Integer.MIN_VALUE;
            return q.this.Q0(null, this);
        }
    }

    public /* synthetic */ q(SocketChannel socketChannel, i iVar, r.d dVar, int i8, AbstractC2633k abstractC2633k) {
        this(socketChannel, iVar, (i8 & 4) != 0 ? null : dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(SocketAddress socketAddress, G6.d dVar) throws IOException {
        a aVar;
        q qVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f20867d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f20867d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f20865b;
        Object objF = c.f();
        int i9 = aVar.f20867d;
        if (i9 == 0) {
            r.b(obj);
            if (e().connect(socketAddress)) {
                return this;
            }
            i1(true);
            i iVarH0 = H0();
            f fVar = f.CONNECT;
            aVar.f20864a = this;
            aVar.f20867d = 1;
            if (iVarH0.S(this, fVar, aVar) != objF) {
                qVar = this;
            }
            return objF;
        }
        if (i9 != 1 && i9 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar = (q) aVar.f20864a;
        r.b(obj);
        while (true) {
            if (!qVar.e().finishConnect()) {
                qVar.i1(true);
                i iVarH1 = qVar.H0();
                f fVar2 = f.CONNECT;
                aVar.f20864a = qVar;
                aVar.f20867d = 2;
                if (iVarH1.S(qVar, fVar2, aVar) == objF) {
                    break;
                }
            } else {
                if (!qVar.a1()) {
                    qVar.i1(false);
                    return qVar;
                }
                if (l.b()) {
                    qVar.e().close();
                } else {
                    qVar.e().socket().close();
                }
            }
        }
        return objF;
    }

    @Override // p043e6.m, p034d6.h, p034d6.g
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public SocketChannel e() {
        return this.f20863m;
    }

    public final boolean a1() {
        InetAddress address;
        InetAddress address2;
        InetAddress address3;
        SocketAddress localAddress = l.b() ? e().getLocalAddress() : e().socket().getLocalSocketAddress();
        SocketAddress remoteAddress = l.b() ? e().getRemoteAddress() : e().socket().getRemoteSocketAddress();
        if (localAddress == null || remoteAddress == null) {
            throw new IllegalStateException("localAddress and remoteAddress should not be null.");
        }
        InetSocketAddress inetSocketAddress = localAddress instanceof InetSocketAddress ? (InetSocketAddress) localAddress : null;
        InetSocketAddress inetSocketAddress2 = remoteAddress instanceof InetSocketAddress ? (InetSocketAddress) remoteAddress : null;
        String hostAddress = (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null) ? null : address3.getHostAddress();
        if (hostAddress == null) {
            hostAddress = "";
        }
        String hostAddress2 = (inetSocketAddress2 == null || (address2 = inetSocketAddress2.getAddress()) == null) ? null : address2.getHostAddress();
        return t.c(inetSocketAddress != null ? Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? Integer.valueOf(inetSocketAddress2.getPort()) : null) && (((inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress()) || t.c(hostAddress, hostAddress2 != null ? hostAddress2 : ""));
    }

    public final void i1(boolean z8) {
        n0(f.CONNECT, z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SocketChannel channel, i selector, r.d dVar) {
        super(channel, selector, null, dVar);
        t.g(channel, "channel");
        t.g(selector, "selector");
        this.f20863m = channel;
        if (e().isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }
}
