package kotlin.jvm.internal;

import D6.C0938s;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: kotlin.jvm.internal.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2631i implements X6.d, InterfaceC2630h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28805b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f28806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f28807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f28808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f28809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f28810g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f28811a;

    /* JADX INFO: renamed from: kotlin.jvm.internal.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            t.g(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C2631i.f28809f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C2631i.f28809f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class jClass) {
            String str;
            t.g(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) C2631i.f28810g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C2631i.f28810g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                t.d(simpleName);
                String strM0 = Z6.w.M0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strM0 != null) {
                    return strM0;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                t.d(simpleName);
                return Z6.w.L0(simpleName, '$', null, 2, null);
            }
            t.d(simpleName);
            return Z6.w.M0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class jClass) {
            t.g(jClass, "jClass");
            Map map = C2631i.f28806c;
            t.e(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return P.k(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = P6.a.b(P6.a.c(jClass));
            }
            return jClass.isInstance(obj);
        }

        public a() {
        }
    }

    public C2631i(Class<?> jClass) {
        t.g(jClass, "jClass");
        this.f28811a = jClass;
    }

    @Override // X6.d
    public String b() {
        return f28805b.a(h());
    }

    @Override // X6.d
    public String d() {
        return f28805b.b(h());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2631i) && t.c(P6.a.b(this), P6.a.b((X6.d) obj));
    }

    @Override // X6.d
    public boolean g(Object obj) {
        return f28805b.c(obj, h());
    }

    @Override // kotlin.jvm.internal.InterfaceC2630h
    public Class h() {
        return this.f28811a;
    }

    public int hashCode() {
        return P6.a.b(this).hashCode();
    }

    public String toString() {
        return h().toString() + " (Kotlin reflection is not available)";
    }

    static {
        List listQ = D6.r.q(Function0.class, Q6.k.class, Q6.o.class, Q6.p.class, Q6.q.class, Q6.r.class, Q6.s.class, Q6.t.class, Q6.u.class, Q6.v.class, Q6.a.class, Q6.b.class, Q6.c.class, Q6.d.class, Q6.e.class, Q6.f.class, Q6.g.class, Q6.h.class, Q6.i.class, Q6.j.class, Q6.l.class, Q6.m.class, Q6.n.class);
        ArrayList arrayList = new ArrayList(C0938s.y(listQ, 10));
        int i8 = 0;
        for (Object obj : listQ) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                D6.r.x();
            }
            arrayList.add(C6.v.a((Class) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        f28806c = D6.M.t(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        String str = kDsnNkYbBsI.bzEltDGYJAsijMx;
        map.put("float", str);
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f28807d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", str);
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f28808e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        t.f(collectionValues, "<get-values>(...)");
        for (String str2 : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            t.d(str2);
            sb.append(Z6.w.O0(str2, com.amazon.a.a.o.c.a.b.f16789a, null, 2, null));
            sb.append("CompanionObject");
            C6.o oVarA = C6.v.a(sb.toString(), str2 + ".Companion");
            map3.put(oVarA.c(), oVarA.d());
        }
        for (Map.Entry entry : f28806c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f28809f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(D6.L.d(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), Z6.w.O0((String) entry2.getValue(), com.amazon.a.a.o.c.a.b.f16789a, null, 2, null));
        }
        f28810g = linkedHashMap;
    }
}
