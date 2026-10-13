package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1719b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1719b f15274c = new C1719b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15275a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15276b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f15277a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f15278b;

        public a(Map map) {
            this.f15278b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1726i.a aVar = (AbstractC1726i.a) entry.getValue();
                List arrayList = (List) this.f15277a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f15277a.put(aVar, arrayList);
                }
                arrayList.add((C0378b) entry.getKey());
            }
        }

        public static void b(List list, InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0378b) list.get(size)).a(interfaceC1733p, aVar, obj);
                }
            }
        }

        public void a(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar, Object obj) {
            b((List) this.f15277a.get(aVar), interfaceC1733p, aVar, obj);
            b((List) this.f15277a.get(AbstractC1726i.a.ON_ANY), interfaceC1733p, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0378b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f15280b;

        public C0378b(int i8, Method method) {
            this.f15279a = i8;
            this.f15280b = method;
            method.setAccessible(true);
        }

        public void a(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar, Object obj) {
            try {
                int i8 = this.f15279a;
                if (i8 == 0) {
                    this.f15280b.invoke(obj, null);
                } else if (i8 == 1) {
                    this.f15280b.invoke(obj, interfaceC1733p);
                } else {
                    if (i8 != 2) {
                        return;
                    }
                    this.f15280b.invoke(obj, interfaceC1733p, aVar);
                }
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Failed to call observer method", e9.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0378b)) {
                return false;
            }
            C0378b c0378b = (C0378b) obj;
            return this.f15279a == c0378b.f15279a && this.f15280b.getName().equals(c0378b.f15280b.getName());
        }

        public int hashCode() {
            return (this.f15279a * 31) + this.f15280b.getName().hashCode();
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i8;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f15278b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f15278b.entrySet()) {
                e(map, (C0378b) entry.getKey(), (AbstractC1726i.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z8 = false;
        for (Method method : methodArr) {
            z zVar = (z) method.getAnnotation(z.class);
            if (zVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i8 = 0;
                } else {
                    if (!InterfaceC1733p.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i8 = 1;
                }
                AbstractC1726i.a aVarValue = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1726i.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1726i.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i8 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0378b(i8, method), aVarValue, cls);
                z8 = true;
            }
        }
        a aVar = new a(map);
        this.f15275a.put(cls, aVar);
        this.f15276b.put(cls, Boolean.valueOf(z8));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e8) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
        }
    }

    public a c(Class cls) {
        a aVar = (a) this.f15275a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f15276b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((z) method.getAnnotation(z.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f15276b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, C0378b c0378b, AbstractC1726i.a aVar, Class cls) {
        AbstractC1726i.a aVar2 = (AbstractC1726i.a) map.get(c0378b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0378b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0378b.f15280b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
