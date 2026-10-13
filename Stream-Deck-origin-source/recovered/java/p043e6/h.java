package p043e6;

import C6.m;
import C6.r;
import H6.c;
import I6.d;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolFamily;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import kotlin.jvm.internal.t;
import p034d6.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f20841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20842d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20841c = obj;
            this.f20842d |= Integer.MIN_VALUE;
            return h.a(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(i iVar, o oVar, r.d dVar, G6.d dVar2) throws Throwable {
        a aVar;
        Closeable closeable;
        if (dVar2 instanceof a) {
            aVar = (a) dVar2;
            int i8 = aVar.f20842d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f20842d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar2);
            }
        } else {
            aVar = new a(dVar2);
        }
        Object obj = aVar.f20841c;
        Object objF = c.f();
        int i9 = aVar.f20842d;
        if (i9 == 0) {
            r.b(obj);
            SocketChannel connect$lambda$2 = b(iVar.Z(), oVar);
            try {
                if (oVar instanceof j) {
                    t.f(connect$lambda$2, "connect$lambda$2");
                    l.a(connect$lambda$2, dVar);
                }
                t.f(connect$lambda$2, "connect$lambda$2");
                l.c(connect$lambda$2);
                q qVar = new q(connect$lambda$2, iVar, dVar);
                SocketAddress socketAddressA = k.a(oVar);
                aVar.f20839a = connect$lambda$2;
                aVar.f20840b = qVar;
                aVar.f20842d = 1;
                return qVar.Q0(socketAddressA, aVar) == objF ? objF : qVar;
            } catch (Throwable th) {
                th = th;
                closeable = connect$lambda$2;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q qVar2 = (q) aVar.f20840b;
            closeable = (Closeable) aVar.f20839a;
            try {
                r.b(obj);
                return qVar2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        closeable.close();
        throw th;
    }

    public static final SocketChannel b(SelectorProvider selectorProvider, o address) throws IllegalAccessException, InvocationTargetException {
        t.g(selectorProvider, "<this>");
        t.g(address, "address");
        if (address instanceof j) {
            return selectorProvider.openSocketChannel();
        }
        if (!(address instanceof w)) {
            throw new m();
        }
        Object objInvoke = SelectorProvider.class.getMethod("openSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        t.e(objInvoke, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
        return (SocketChannel) objInvoke;
    }
}
