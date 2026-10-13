package com.google.android.gms.internal.play_billing;

import M6.eLZq.eGwOBWCdOTaKus;
import P2.Lsk.mHPawN;
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
public abstract class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f18832a;

    static {
        char[] cArr = new char[80];
        f18832a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(V0 v8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(v8, sb, 0);
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
            sb.append(AbstractC2070u1.a(new O(((String) obj).getBytes(AbstractC2081y0.f19032b))));
            sb.append('\"');
            return;
        }
        if (obj instanceof S) {
            sb.append(": \"");
            sb.append(AbstractC2070u1.a((S) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2056q0) {
            sb.append(" {");
            d((AbstractC2056q0) obj, sb, i8 + 2);
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
            sb.append(f18832a, 0, i9);
            i8 -= i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    public static void d(V0 v8, StringBuilder sb, int i8) {
        String str;
        int i9;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v8.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            str = mHPawN.crIzzPso;
            i9 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith(str)) {
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
            String str2 = eGwOBWCdOTaKus.djvTBvFZsNuM;
            if (strSubstring.endsWith(str2) && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals(str2) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i8, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2056q0.q(method2, v8, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i8, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2056q0.q(method, v8, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey(com.amazon.a.a.o.b.au.concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get(str.concat(strSubstring));
                if (method4 != null) {
                    Object objQ = AbstractC2056q0.q(method4, v8, new Object[0]);
                    if (method5 == null) {
                        if (objQ instanceof Boolean) {
                            if (((Boolean) objQ).booleanValue()) {
                                b(sb, i8, strSubstring, objQ);
                            }
                        } else if (objQ instanceof Integer) {
                            if (((Integer) objQ).intValue() != 0) {
                                b(sb, i8, strSubstring, objQ);
                            }
                        } else if (objQ instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objQ).floatValue()) != 0) {
                                b(sb, i8, strSubstring, objQ);
                            }
                        } else if (!(objQ instanceof Double)) {
                            if (objQ instanceof String) {
                                zEquals = objQ.equals("");
                            } else if (objQ instanceof S) {
                                zEquals = objQ.equals(S.f18819b);
                            } else if (objQ instanceof V0) {
                                if (objQ != ((V0) objQ).d()) {
                                    b(sb, i8, strSubstring, objQ);
                                }
                            } else if (!(objQ instanceof Enum) || ((Enum) objQ).ordinal() != 0) {
                                b(sb, i8, strSubstring, objQ);
                            }
                            if (!zEquals) {
                                b(sb, i8, strSubstring, objQ);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objQ).doubleValue()) != 0) {
                            b(sb, i8, strSubstring, objQ);
                        }
                    } else if (((Boolean) AbstractC2056q0.q(method5, v8, new Object[0])).booleanValue()) {
                        b(sb, i8, strSubstring, objQ);
                    }
                }
            }
            i9 = 3;
        }
        if (v8 instanceof AbstractC2048o0) {
            Iterator itE = ((AbstractC2048o0) v8).zzb.e();
            if (itE.hasNext()) {
                p063h.s.a(((Map.Entry) itE.next()).getKey());
                throw null;
            }
        }
        C2079x1 c2079x1 = ((AbstractC2056q0) v8).zzc;
        if (c2079x1 != null) {
            c2079x1.i(sb, i8);
        }
    }
}
