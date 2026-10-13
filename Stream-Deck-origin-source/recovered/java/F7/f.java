package F7;

import Z6.v;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class f implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j.a f2435g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f2437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f2438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f2439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f2440e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: F7.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0116a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f2441a;

            public C0116a(String str) {
                this.f2441a = str;
            }

            @Override // F7.j.a
            public boolean a(SSLSocket sslSocket) {
                t.g(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                t.f(name, "sslSocket.javaClass.name");
                return v.H(name, this.f2441a + com.amazon.a.a.o.c.a.b.f16789a, false, 2, null);
            }

            @Override // F7.j.a
            public k b(SSLSocket sslSocket) {
                t.g(sslSocket, "sslSocket");
                return f.f2434f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final f b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !t.c(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            t.d(superclass);
            return new f(superclass);
        }

        public final j.a c(String packageName) {
            t.g(packageName, "packageName");
            return new C0116a(packageName);
        }

        public final j.a d() {
            return f.f2435g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f2434f = aVar;
        f2435g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    @Override // F7.k
    public boolean a(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return this.f2436a.isInstance(sslSocket);
    }

    @Override // F7.k
    public boolean b() {
        return E7.b.f2284f.b();
    }

    @Override // F7.k
    public String c(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f2439d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Z6.c.f12941b);
            }
            return null;
        } catch (IllegalAccessException e8) {
            throw new AssertionError(e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if ((cause instanceof NullPointerException) && t.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e9);
        }
    }

    @Override // F7.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f2437b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f2438c.invoke(sslSocket, str);
                }
                this.f2440e.invoke(sslSocket, E7.h.f2311a.c(protocols));
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
    }

    public f(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        t.g(sslSocketClass, "sslSocketClass");
        this.f2436a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        t.f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f2437b = declaredMethod;
        this.f2438c = sslSocketClass.getMethod("setHostname", String.class);
        this.f2439d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f2440e = sslSocketClass.getMethod(yOZfxp.tgvgUhPUouikI, byte[].class);
    }
}
