package androidx.lifecycle;

import D6.C0937q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p043e6.dT.GIGvBf;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1736t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1736t f15316a = new C1736t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f15317b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f15318c = new HashMap();

    public static final InterfaceC1730m f(Object object) {
        kotlin.jvm.internal.t.g(object, "object");
        boolean z8 = object instanceof InterfaceC1730m;
        boolean z9 = object instanceof DefaultLifecycleObserver;
        if (z8 && z9) {
            return new C1721d((DefaultLifecycleObserver) object, (InterfaceC1730m) object);
        }
        if (z9) {
            return new C1721d((DefaultLifecycleObserver) object, null);
        }
        if (z8) {
            return (InterfaceC1730m) object;
        }
        Class<?> cls = object.getClass();
        C1736t c1736t = f15316a;
        if (c1736t.d(cls) != 2) {
            return new B(object);
        }
        Object obj = f15318c.get(cls);
        kotlin.jvm.internal.t.d(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c1736t.a((Constructor) list.get(0), object);
            return new N(null);
        }
        int size = list.size();
        InterfaceC1723f[] interfaceC1723fArr = new InterfaceC1723f[size];
        for (int i8 = 0; i8 < size; i8++) {
            f15316a.a((Constructor) list.get(i8), object);
            interfaceC1723fArr[i8] = null;
        }
        return new C1720c(interfaceC1723fArr);
    }

    public final InterfaceC1723f a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.t.f(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            p063h.s.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package r8 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r8 != null ? r8.getName() : "";
            kotlin.jvm.internal.t.f(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                kotlin.jvm.internal.t.f(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.t.f(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.t.f(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + com.amazon.a.a.o.c.a.b.f16789a + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.t.e(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final int d(Class cls) {
        Map map = f15317b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    public final boolean e(Class cls) {
        return cls != null && InterfaceC1732o.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f15318c.put(cls, C0937q.e(constructorB));
            return 2;
        }
        if (C1719b.f15274c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.t.f(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f15318c.get(superclass);
            kotlin.jvm.internal.t.d(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.t.f(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.t.f(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f15318c.get(intrface);
                kotlin.jvm.internal.t.d(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f15318c.put(cls, arrayList);
        return 2;
    }

    public static final String c(String className) {
        kotlin.jvm.internal.t.g(className, "className");
        return Z6.v.D(className, ".", "_", false, 4, null) + GIGvBf.XwsGkbgk;
    }
}
