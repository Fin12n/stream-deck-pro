package Z6;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p179u4.eubL.OjEsfyJYzbPn;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12982a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.t.g(line, "line");
            return line;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12983a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f12983a = str;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.t.g(line, "line");
            return this.f12983a + line;
        }
    }

    public static final Q6.k b(String str) {
        return str.length() == 0 ? a.f12982a : new b(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    public static final int c(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            if (!C1694a.c(str.charAt(i8))) {
                if (i8 == -1) {
                    return str.length();
                }
                return i8;
            }
            i8++;
        }
        i8 = -1;
        if (i8 == -1) {
            return str.length();
        }
        return i8;
    }

    public static final String e(String str, String newIndent, String marginPrefix) {
        String str2;
        String str3;
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(newIndent, "newIndent");
        kotlin.jvm.internal.t.g(marginPrefix, "marginPrefix");
        if (w.b0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listI0 = w.i0(str);
        int length = str.length() + (newIndent.length() * listI0.size());
        Q6.k kVarB = b(newIndent);
        int iP = D6.r.p(listI0);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (Object obj : listI0) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                D6.r.x();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i8 == 0 || i8 == iP) && w.b0(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!C1694a.c(str4.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i11 = i10;
                    str2 = marginPrefix;
                    if (v.G(str4, str2, i11, false, 4, null)) {
                        int length3 = str2.length() + i11;
                        kotlin.jvm.internal.t.e(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str3 = (String) kVarB.invoke(strSubstring)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i8 = i9;
            marginPrefix = str2;
        }
        String string = ((StringBuilder) D6.z.o0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    public static String f(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return d(str, "");
    }

    public static /* synthetic */ String h(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = com.amazon.a.a.o.b.f.f16779c;
        }
        return g(str, str2);
    }

    public static final String d(String str, String newIndent) {
        String str2;
        kotlin.jvm.internal.t.g(str, BpgIURjN.nlVEfzVTUmpaDM);
        kotlin.jvm.internal.t.g(newIndent, "newIndent");
        List listI0 = w.i0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (!w.b0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C0938s.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) D6.z.x0(arrayList2);
        int i8 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listI0.size());
        Q6.k kVarB = b(newIndent);
        int iP = D6.r.p(listI0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listI0) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                D6.r.x();
            }
            String str3 = (String) obj2;
            if ((i8 == 0 || i8 == iP) && w.b0(str3)) {
                str3 = null;
            } else {
                String strY0 = y.Y0(str3, iIntValue);
                if (strY0 != null && (str2 = (String) kVarB.invoke(strY0)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i8 = i9;
        }
        String string = ((StringBuilder) D6.z.o0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.t.f(string, "toString(...)");
        return string;
    }

    public static final String g(String str, String marginPrefix) {
        kotlin.jvm.internal.t.g(str, OjEsfyJYzbPn.bFECPhtUBHBMJp);
        kotlin.jvm.internal.t.g(marginPrefix, "marginPrefix");
        return e(str, "", marginPrefix);
    }
}
