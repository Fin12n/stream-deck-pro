package com.google.protobuf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f19228a;

    static {
        char[] cArr = new char[80];
        f19228a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i8, StringBuilder sb) {
        while (i8 > 0) {
            char[] cArr = f19228a;
            int length = i8 > cArr.length ? cArr.length : i8;
            sb.append(cArr, 0, length);
            i8 -= length;
        }
    }

    public static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof AbstractC2097h) {
            return obj.equals(AbstractC2097h.f19285b);
        }
        if (obj instanceof T) {
            return obj == ((T) obj).getDefaultInstanceForType();
        }
        return (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
    }

    public static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i8 = 1; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i8, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(t0.c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2097h) {
            sb.append(": \"");
            sb.append(t0.a((AbstractC2097h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            e((GeneratedMessageLite) obj, sb, i8 + 2);
            sb.append("\n");
            a(i8, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i9 = i8 + 2;
        d(sb, i9, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        d(sb, i9, "value", entry.getValue());
        sb.append("\n");
        a(i8, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0174, please report this as an issue */
    public static void e(T t8, StringBuilder sb, int i8) {
        int i9;
        int i10;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        Object objInvokeOrDie;
        boolean zBooleanValue;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = t8.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i9 = 3;
            if (i11 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i11];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith(com.amazon.a.a.o.b.au)) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i9);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (java.lang.reflect.Method) entry.getValue()) == null) {
                i10 = i9;
            } else {
                i10 = i9;
                if (method4.getReturnType().equals(List.class)) {
                    d(sb, i8, strSubstring.substring(0, strSubstring.length() - 4), GeneratedMessageLite.invokeOrDie(method4, t8, new Object[0]));
                }
                i9 = i10;
            }
            if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (java.lang.reflect.Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey(com.amazon.a.a.o.b.au + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (java.lang.reflect.Method) entry.getValue();
                            method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method, t8, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method2, t8, new Object[0])).booleanValue();
                                } else if (b(objInvokeOrDie)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    d(sb, i8, strSubstring, objInvokeOrDie);
                                }
                            }
                        }
                    } else {
                        method = (java.lang.reflect.Method) entry.getValue();
                        method2 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method, t8, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method2, t8, new Object[0])).booleanValue();
                            } else if (b(objInvokeOrDie)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                d(sb, i8, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                }
            } else {
                d(sb, i8, strSubstring.substring(0, strSubstring.length() - 3), GeneratedMessageLite.invokeOrDie(method3, t8, new Object[0]));
            }
            i9 = i10;
        }
        if (t8 instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator itW = ((GeneratedMessageLite.ExtendableMessage) t8).extensions.w();
            while (itW.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itW.next();
                d(sb, i8, "[" + ((GeneratedMessageLite.d) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        w0 w0Var = ((GeneratedMessageLite) t8).unknownFields;
        if (w0Var != null) {
            w0Var.q(sb, i8);
        }
    }

    public static String f(T t8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(t8, sb, 0);
        return sb.toString();
    }
}
