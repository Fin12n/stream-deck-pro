package A5;

import D6.C0934n;
import D6.I;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f854a = new n();

    public final boolean a(Type left, Type right) {
        t.g(left, "left");
        t.g(right, "right");
        if (!t.c(left.getClass(), right.getClass())) {
            return false;
        }
        if (left instanceof Class) {
            return t.c(left, right);
        }
        if (left instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) right;
            ParameterizedType parameterizedType2 = (ParameterizedType) left;
            Type rawType = parameterizedType2.getRawType();
            t.f(rawType, "getRawType(...)");
            Type rawType2 = parameterizedType.getRawType();
            t.f(rawType2, "getRawType(...)");
            if (a(rawType, rawType2)) {
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                t.f(actualTypeArguments, "getActualTypeArguments(...)");
                Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                t.f(actualTypeArguments2, "getActualTypeArguments(...)");
                if (b(actualTypeArguments, actualTypeArguments2)) {
                    return true;
                }
            }
            return false;
        }
        if (!(left instanceof WildcardType)) {
            if (left instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) left).getGenericComponentType();
                t.f(genericComponentType, "getGenericComponentType(...)");
                Type genericComponentType2 = ((GenericArrayType) right).getGenericComponentType();
                t.f(genericComponentType2, "getGenericComponentType(...)");
                return a(genericComponentType, genericComponentType2);
            }
            if (!(left instanceof TypeVariable)) {
                return t.c(left, right);
            }
            Type[] bounds = ((TypeVariable) left).getBounds();
            t.f(bounds, "getBounds(...)");
            Type[] bounds2 = ((TypeVariable) right).getBounds();
            t.f(bounds2, "getBounds(...)");
            return b(bounds, bounds2);
        }
        WildcardType wildcardType = (WildcardType) right;
        WildcardType wildcardType2 = (WildcardType) left;
        Type[] lowerBounds = wildcardType2.getLowerBounds();
        t.f(lowerBounds, "getLowerBounds(...)");
        Type[] lowerBounds2 = wildcardType.getLowerBounds();
        t.f(lowerBounds2, "getLowerBounds(...)");
        if (b(lowerBounds, lowerBounds2)) {
            Type[] upperBounds = wildcardType2.getUpperBounds();
            t.f(upperBounds, "getUpperBounds(...)");
            Type[] upperBounds2 = wildcardType.getUpperBounds();
            t.f(upperBounds2, "getUpperBounds(...)");
            if (b(upperBounds, upperBounds2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        Iterable iterableQ = C0934n.Q(typeArr);
        if ((iterableQ instanceof Collection) && ((Collection) iterableQ).isEmpty()) {
            return true;
        }
        Iterator it = iterableQ.iterator();
        while (it.hasNext()) {
            int iNextInt = ((I) it).nextInt();
            if (!f854a.a(typeArr[iNextInt], typeArr2[iNextInt])) {
                return false;
            }
        }
        return true;
    }

    public final int c(Class cls, Object obj) {
        t.g(cls, "cls");
        return (cls.hashCode() * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final int d(Type type) {
        t.g(type, "type");
        if (type instanceof Class) {
            return type.hashCode();
        }
        int i8 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            t.f(rawType, "getRawType(...)");
            int iD = d(rawType);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            t.f(actualTypeArguments, "getActualTypeArguments(...)");
            int length = actualTypeArguments.length;
            while (i8 < length) {
                Type type2 = actualTypeArguments[i8];
                t.d(type2);
                iD = (iD * 31) + d(type2);
                i8++;
            }
            return iD;
        }
        if (!(type instanceof WildcardType)) {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                t.f(genericComponentType, "getGenericComponentType(...)");
                return d(genericComponentType) + 53;
            }
            if (!(type instanceof TypeVariable)) {
                return type.hashCode();
            }
            Type[] bounds = ((TypeVariable) type).getBounds();
            t.f(bounds, "getBounds(...)");
            int length2 = bounds.length;
            int iD2 = 0;
            while (i8 < length2) {
                Type type3 = bounds[i8];
                t.d(type3);
                iD2 = (iD2 * 29) + d(type3);
                i8++;
            }
            return iD2;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        t.f(upperBounds, "getUpperBounds(...)");
        int iD3 = 0;
        for (Type type4 : upperBounds) {
            t.d(type4);
            iD3 = (iD3 * 19) + d(type4);
        }
        Type[] lowerBounds = wildcardType.getLowerBounds();
        t.f(lowerBounds, "getLowerBounds(...)");
        int length3 = lowerBounds.length;
        while (i8 < length3) {
            Type type5 = lowerBounds[i8];
            t.d(type5);
            iD3 = (iD3 * 17) + d(type5);
            i8++;
        }
        return iD3;
    }
}
