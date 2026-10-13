package q7;

import C6.C0920i;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: q7.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2868v0 {
    public static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final p116m7.b b(X6.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "<this>");
        return c(dVar, new p116m7.b[0]);
    }

    public static final p116m7.b c(X6.d dVar, p116m7.b... args) {
        kotlin.jvm.internal.t.g(dVar, "<this>");
        kotlin.jvm.internal.t.g(args, "args");
        return d(P6.a.a(dVar), (p116m7.b[]) Arrays.copyOf(args, args.length));
    }

    public static final p116m7.b d(Class cls, p116m7.b... args) throws IllegalAccessException, InvocationTargetException {
        p116m7.b bVarI;
        kotlin.jvm.internal.t.g(cls, "<this>");
        kotlin.jvm.internal.t.g(args, "args");
        if (cls.isEnum() && l(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (bVarI = i(cls)) != null) {
            return bVarI;
        }
        p116m7.b bVarK = k(cls, (p116m7.b[]) Arrays.copyOf(args, args.length));
        if (bVarK != null) {
            return bVarK;
        }
        p116m7.b bVarH = h(cls);
        if (bVarH != null) {
            return bVarH;
        }
        p116m7.b bVarF = f(cls, (p116m7.b[]) Arrays.copyOf(args, args.length));
        if (bVarF != null) {
            return bVarF;
        }
        if (m(cls)) {
            return new p116m7.e(P6.a.c(cls));
        }
        return null;
    }

    public static final p116m7.b e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.t.f(canonicalName, "getCanonicalName(...)");
        kotlin.jvm.internal.t.e(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new F(canonicalName, (Enum[]) enumConstants);
    }

    public static final p116m7.b f(Class cls, p116m7.b... bVarArr) {
        Field field;
        p116m7.b bVarJ;
        Object objG = g(cls);
        if (objG != null && (bVarJ = j(objG, (p116m7.b[]) Arrays.copyOf(bVarArr, bVarArr.length))) != null) {
            return bVarJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            kotlin.jvm.internal.t.f(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i8 = 0;
            Class<?> cls2 = null;
            boolean z8 = false;
            while (true) {
                if (i8 >= length) {
                    if (z8) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i8];
                    if (kotlin.jvm.internal.t.c(cls3.getSimpleName(), "$serializer")) {
                        if (!z8) {
                            z8 = true;
                            cls2 = cls3;
                        }
                    }
                    i8++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof p116m7.b) {
                return (p116m7.b) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    public static final Object g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        kotlin.jvm.internal.t.f(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i8];
            if (cls2.getAnnotation(InterfaceC2847k0.class) != null) {
                break;
            }
            i8++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        kotlin.jvm.internal.t.f(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    public static final p116m7.b h(Class cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i8 = 0;
            if (!Z6.v.H(canonicalName, "java.", false, 2, null) && !Z6.v.H(canonicalName, "kotlin.", false, 2, null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                kotlin.jvm.internal.t.f(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                Field field = null;
                int i9 = 0;
                boolean z8 = false;
                while (true) {
                    if (i9 >= length) {
                        if (!z8) {
                            break;
                        }
                        break;
                    }
                    Field field2 = declaredFields[i9];
                    if (kotlin.jvm.internal.t.c(field2.getName(), "INSTANCE") && kotlin.jvm.internal.t.c(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z8) {
                            z8 = true;
                            field = field2;
                        }
                    }
                    i9++;
                    field = null;
                    break;
                }
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                kotlin.jvm.internal.t.f(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                boolean z9 = false;
                while (true) {
                    if (i8 >= length2) {
                        if (!z9) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i8];
                    if (kotlin.jvm.internal.t.c(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        kotlin.jvm.internal.t.f(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && kotlin.jvm.internal.t.c(method2.getReturnType(), p116m7.b.class)) {
                            if (!z9) {
                                method = method2;
                                z9 = true;
                            }
                        }
                    }
                    i8++;
                    method = null;
                    break;
                }
                if (method == null) {
                    return null;
                }
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof p116m7.b) {
                    return (p116m7.b) objInvoke;
                }
            }
        }
        return null;
    }

    public static final p116m7.b i(Class cls) {
        p116m7.i iVar = (p116m7.i) cls.getAnnotation(p116m7.i.class);
        if (iVar == null || kotlin.jvm.internal.t.c(kotlin.jvm.internal.K.b(iVar.with()), kotlin.jvm.internal.K.b(p116m7.e.class))) {
            return new p116m7.e(P6.a.c(cls));
        }
        return null;
    }

    public static final p116m7.b j(Object obj, p116m7.b... bVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i8 = 0; i8 < length; i8++) {
                    clsArr2[i8] = p116m7.b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (objInvoke instanceof p116m7.b) {
                return (p116m7.b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause == null) {
                throw e8;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e8.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final p116m7.b k(Class cls, p116m7.b... bVarArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return j(objA, (p116m7.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final boolean l(Class cls) {
        return cls.getAnnotation(p116m7.i.class) == null && cls.getAnnotation(p116m7.d.class) == null;
    }

    public static final boolean m(Class cls) {
        if (cls.getAnnotation(p116m7.d.class) != null) {
            return true;
        }
        p116m7.i iVar = (p116m7.i) cls.getAnnotation(p116m7.i.class);
        return iVar != null && kotlin.jvm.internal.t.c(kotlin.jvm.internal.K.b(iVar.with()), kotlin.jvm.internal.K.b(p116m7.e.class));
    }

    public static final boolean n(X6.d rootClass) {
        kotlin.jvm.internal.t.g(rootClass, "rootClass");
        return P6.a.a(rootClass).isArray();
    }

    public static final Void o(X6.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "<this>");
        AbstractC2870w0.f(dVar);
        throw new C0920i();
    }

    public static final Object[] p(ArrayList arrayList, X6.d eClass) {
        kotlin.jvm.internal.t.g(arrayList, "<this>");
        kotlin.jvm.internal.t.g(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) P6.a.a(eClass), arrayList.size());
        kotlin.jvm.internal.t.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        kotlin.jvm.internal.t.f(array, "toArray(...)");
        return array;
    }
}
