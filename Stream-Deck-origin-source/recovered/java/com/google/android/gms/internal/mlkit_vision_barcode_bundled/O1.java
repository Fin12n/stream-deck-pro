package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
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
public abstract class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f17995a;

    static {
        char[] cArr = new char[80];
        f17995a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(M1 m8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(m8, sb, 0);
        return sb.toString();
    }

    public static void b(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i8, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i9 = 1; i9 < str.length(); i9++) {
                char cCharAt = str.charAt(i9);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC1945q2.a(new I0(((String) obj).getBytes(AbstractC1953s1.f18650a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof J0) {
            sb.append(": \"");
            sb.append(AbstractC1945q2.a((J0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1914k1) {
            sb.append(" {");
            d((AbstractC1914k1) obj, sb, i8 + 2);
            sb.append("\n");
            c(i8, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i10 = i8 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i10, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        b(sb, i10, "value", entry.getValue());
        sb.append("\n");
        c(i8, sb);
        sb.append("}");
    }

    public static void c(int i8, StringBuilder sb) {
        while (i8 > 0) {
            int i9 = 80;
            if (i8 <= 80) {
                i9 = i8;
            }
            sb.append(f17995a, 0, i9);
            i8 -= i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    public static void d(M1 m8, StringBuilder sb, int i8) {
        int i9;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = m8.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i9 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(com.amazon.a.a.o.b.au)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i9);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i8, strSubstring.substring(0, strSubstring.length() - 4), AbstractC1914k1.w(method2, m8, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i8, strSubstring.substring(0, strSubstring.length() - 3), AbstractC1914k1.w(method, m8, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey(com.amazon.a.a.o.b.au.concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objW = AbstractC1914k1.w(method4, m8, new Object[0]);
                    if (method5 == null) {
                        if (objW instanceof Boolean) {
                            if (((Boolean) objW).booleanValue()) {
                                b(sb, i8, strSubstring, objW);
                            }
                        } else if (objW instanceof Integer) {
                            if (((Integer) objW).intValue() != 0) {
                                b(sb, i8, strSubstring, objW);
                            }
                        } else if (objW instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objW).floatValue()) != 0) {
                                b(sb, i8, strSubstring, objW);
                            }
                        } else if (!(objW instanceof Double)) {
                            if (objW instanceof String) {
                                zEquals = objW.equals("");
                            } else if (objW instanceof J0) {
                                zEquals = objW.equals(J0.f17985b);
                            } else if (objW instanceof M1) {
                                if (objW != ((M1) objW).d()) {
                                    b(sb, i8, strSubstring, objW);
                                }
                            } else if (!(objW instanceof Enum) || ((Enum) objW).ordinal() != 0) {
                                b(sb, i8, strSubstring, objW);
                            }
                            if (!zEquals) {
                                b(sb, i8, strSubstring, objW);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objW).doubleValue()) != 0) {
                            b(sb, i8, strSubstring, objW);
                        }
                    } else if (((Boolean) AbstractC1914k1.w(method5, m8, new Object[0])).booleanValue()) {
                        b(sb, i8, strSubstring, objW);
                    }
                }
            }
            i9 = 3;
        }
        if (m8 instanceof AbstractC1899h1) {
            Iterator itF = ((AbstractC1899h1) m8).zzb.f();
            while (itF.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itF.next();
                b(sb, i8, "[" + ((C1904i1) entry2.getKey()).f18580a + "]", entry2.getValue());
            }
        }
        C1959t2 c1959t2 = ((AbstractC1914k1) m8).zzc;
        if (c1959t2 != null) {
            c1959t2.i(sb, i8);
        }
    }
}
