package p043e6;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f20847a;

    static {
        boolean z8;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        f20847a = z8;
    }

    public static final void a(SelectableChannel selectableChannel, r options) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(selectableChannel, "<this>");
        t.g(options, "options");
        if (selectableChannel instanceof SocketChannel) {
            if (!v.c(options.f(), v.f20887a.a())) {
                if (f20847a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.IP_TOS, Integer.valueOf(options.f() & 255));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTrafficClass(options.f() & 255);
                }
            }
            if (options.d()) {
                if (f20847a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((SocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.e()) {
                s.f20880a.c((SocketChannel) selectableChannel);
            }
            if (options instanceof r.c) {
                r.c cVar = (r.c) options;
                Integer numValueOf = Integer.valueOf(cVar.i());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (f20847a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_RCVBUF, Integer.valueOf(iIntValue));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue);
                    }
                }
                Integer numValueOf2 = Integer.valueOf(cVar.j());
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    int iIntValue2 = numValueOf2.intValue();
                    if (f20847a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_SNDBUF, Integer.valueOf(iIntValue2));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSendBufferSize(iIntValue2);
                    }
                }
            }
            if (options instanceof r.d) {
                r.d dVar = (r.d) options;
                Integer numValueOf3 = Integer.valueOf(dVar.n());
                if (numValueOf3.intValue() < 0) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    int iIntValue3 = numValueOf3.intValue();
                    if (f20847a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_LINGER, Integer.valueOf(iIntValue3));
                    } else {
                        ((SocketChannel) selectableChannel).socket().setSoLinger(true, iIntValue3);
                    }
                }
                Boolean boolM = dVar.m();
                if (boolM != null) {
                    boolean zBooleanValue = boolM.booleanValue();
                    if (f20847a) {
                        ((SocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_KEEPALIVE, boolM);
                    } else {
                        ((SocketChannel) selectableChannel).socket().setKeepAlive(zBooleanValue);
                    }
                }
                if (f20847a) {
                    ((SocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.valueOf(dVar.o()));
                } else {
                    ((SocketChannel) selectableChannel).socket().setTcpNoDelay(dVar.o());
                }
            }
        }
        if (selectableChannel instanceof ServerSocketChannel) {
            if (options.d()) {
                if (f20847a) {
                    ((ServerSocketChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((ServerSocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.e()) {
                s.f20880a.b((ServerSocketChannel) selectableChannel);
            }
        }
        if (selectableChannel instanceof DatagramChannel) {
            if (!v.c(options.f(), v.f20887a.a())) {
                if (f20847a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.IP_TOS, Integer.valueOf(options.f() & 255));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setTrafficClass(options.f() & 255);
                }
            }
            if (options.d()) {
                if (f20847a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_REUSEADDR, Boolean.TRUE);
                } else {
                    ((DatagramChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.e()) {
                s.f20880a.a((DatagramChannel) selectableChannel);
            }
            if (options instanceof r.e) {
                if (f20847a) {
                    ((DatagramChannel) selectableChannel).setOption((SocketOption<Boolean>) StandardSocketOptions.SO_BROADCAST, Boolean.valueOf(((r.e) options).m()));
                } else {
                    ((DatagramChannel) selectableChannel).socket().setBroadcast(((r.e) options).m());
                }
            }
            if (options instanceof r.c) {
                r.c cVar2 = (r.c) options;
                Integer numValueOf4 = Integer.valueOf(cVar2.i());
                if (numValueOf4.intValue() <= 0) {
                    numValueOf4 = null;
                }
                if (numValueOf4 != null) {
                    int iIntValue4 = numValueOf4.intValue();
                    if (f20847a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_RCVBUF, Integer.valueOf(iIntValue4));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue4);
                    }
                }
                Integer numValueOf5 = Integer.valueOf(cVar2.j());
                Integer num = numValueOf5.intValue() > 0 ? numValueOf5 : null;
                if (num != null) {
                    int iIntValue5 = num.intValue();
                    if (f20847a) {
                        ((DatagramChannel) selectableChannel).setOption((SocketOption<Integer>) StandardSocketOptions.SO_SNDBUF, Integer.valueOf(iIntValue5));
                    } else {
                        ((DatagramChannel) selectableChannel).socket().setSendBufferSize(iIntValue5);
                    }
                }
            }
        }
    }

    public static final boolean b() {
        return f20847a;
    }

    public static final void c(SelectableChannel selectableChannel) throws IOException {
        t.g(selectableChannel, "<this>");
        selectableChannel.configureBlocking(false);
    }
}
