package p043e6;

import D6.C0938s;
import D6.L;
import D6.M;
import W6.n;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f20880a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f20881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f20882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f20883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f20884e;

    static {
        Map mapG;
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods;
        int length;
        int i8;
        try {
            Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
            if (fields != null) {
                ArrayList arrayList = new ArrayList();
                for (Field field : fields) {
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                        arrayList.add(field);
                    }
                }
                mapG = new LinkedHashMap(n.d(L.d(C0938s.y(arrayList, 10)), 16));
                for (Object obj : arrayList) {
                    String name = ((Field) obj).getName();
                    t.f(name, "it.name");
                    mapG.put(name, obj);
                }
            } else {
                mapG = M.g();
            }
        } catch (Throwable unused) {
            mapG = M.g();
        }
        f20881b = mapG;
        Method method3 = null;
        try {
            try {
                Class<?> cls2 = Class.forName("java.nio.channels.SocketChannel");
                Method[] methods2 = cls2.getMethods();
                t.f(methods2, "socketChannelClass.methods");
                int length2 = methods2.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        method = null;
                        break;
                    }
                    method = methods2[i9];
                    int modifiers2 = method.getModifiers();
                    if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2) && t.c(method.getName(), "setOption") && method.getParameterTypes().length == 2 && t.c(method.getReturnType(), cls2) && t.c(method.getParameterTypes()[0], SocketOption.class) && t.c(method.getParameterTypes()[1], Object.class)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                while (true) {
                    if (i8 >= length) {
                        method2 = null;
                        break;
                    }
                    method2 = methods[i8];
                    int modifiers3 = method2.getModifiers();
                    if (Modifier.isPublic(modifiers3) && !Modifier.isStatic(modifiers3) && t.c(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && t.c(method2.getReturnType(), cls) && t.c(method2.getParameterTypes()[0], SocketOption.class) && t.c(method2.getParameterTypes()[1], Object.class)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            } catch (Throwable unused2) {
            }
            cls = Class.forName("java.nio.channels.ServerSocketChannel");
            methods = cls.getMethods();
            t.f(methods, "socketChannelClass.methods");
            length = methods.length;
            i8 = 0;
        } catch (Throwable unused3) {
        }
        f20882c = method;
        f20883d = method2;
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            t.f(methods3, "socketChannelClass.methods");
            for (Method method4 : methods3) {
                int modifiers4 = method4.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && t.c(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && t.c(method4.getReturnType(), cls3) && t.c(method4.getParameterTypes()[0], SocketOption.class) && t.c(method4.getParameterTypes()[1], Object.class)) {
                    method3 = method4;
                    break;
                }
            }
        } catch (Throwable unused4) {
        }
        f20884e = method3;
    }

    public final void a(DatagramChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(channel, "channel");
        Object objD = d("SO_REUSEPORT");
        Method method = f20884e;
        t.d(method);
        method.invoke(channel, objD, Boolean.TRUE);
    }

    public final void b(ServerSocketChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(channel, "channel");
        Object objD = d("SO_REUSEPORT");
        Method method = f20883d;
        t.d(method);
        method.invoke(channel, objD, Boolean.TRUE);
    }

    public final void c(SocketChannel channel) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(channel, "channel");
        Object objD = d("SO_REUSEPORT");
        Method method = f20882c;
        t.d(method);
        method.invoke(channel, objD, Boolean.TRUE);
    }

    public final Object d(String str) throws IOException {
        Field field = (Field) f20881b.get(str);
        Object obj = field != null ? field.get(null) : null;
        if (obj != null) {
            return obj;
        }
        throw new IOException("Socket option " + str + " is not supported");
    }
}
