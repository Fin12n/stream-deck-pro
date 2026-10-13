package E7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2297i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f2298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f2299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f2300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f2301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f2302h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f2303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2305c;

        public a(List<String> protocols) {
            t.g(protocols, "protocols");
            this.f2303a = protocols;
        }

        public final String a() {
            return this.f2305c;
        }

        public final boolean b() {
            return this.f2304b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            t.g(proxy, "proxy");
            t.g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (t.c(name, "supports") && t.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (t.c(name, "unsupported") && t.c(Void.TYPE, returnType)) {
                this.f2304b = true;
                return null;
            }
            if (t.c(name, "protocols") && objArr.length == 0) {
                return this.f2303a;
            }
            if ((t.c(name, "selectProtocol") || t.c(name, "select")) && t.c(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i8 = 0;
                        while (true) {
                            Object obj2 = list.get(i8);
                            t.e(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (this.f2303a.contains(str)) {
                                this.f2305c = str;
                                return str;
                            }
                            if (i8 != size) {
                                i8++;
                            }
                        }
                    }
                    String str2 = (String) this.f2303a.get(0);
                    this.f2305c = str2;
                    return str2;
                }
            }
            if ((!t.c(name, "protocolSelected") && !t.c(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f2305c = (String) obj3;
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                t.f(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod(com.amazon.a.a.o.b.au, SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                t.f(putMethod, "putMethod");
                t.f(getMethod, "getMethod");
                t.f(removeMethod, "removeMethod");
                t.f(clientProviderClass, "clientProviderClass");
                t.f(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public b() {
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        t.g(putMethod, "putMethod");
        t.g(getMethod, "getMethod");
        t.g(removeMethod, "removeMethod");
        t.g(clientProviderClass, "clientProviderClass");
        t.g(serverProviderClass, "serverProviderClass");
        this.f2298d = putMethod;
        this.f2299e = getMethod;
        this.f2300f = removeMethod;
        this.f2301g = clientProviderClass;
        this.f2302h = serverProviderClass;
    }

    @Override // E7.h
    public void b(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        try {
            this.f2300f.invoke(null, sslSocket);
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to remove ALPN", e9);
        }
    }

    @Override // E7.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        try {
            this.f2298d.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f2301g, this.f2302h}, new a(h.f2311a.b(protocols))));
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to set ALPN", e9);
        }
    }

    @Override // E7.h
    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f2299e.invoke(null, sslSocket));
            t.e(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                h.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to get ALPN selected protocol", e9);
        }
    }
}
