package X5;

import M6.eLZq.eGwOBWCdOTaKus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X5.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1687p {

    /* JADX INFO: renamed from: X5.p$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Double.valueOf(((C1680i) obj2).c()), Double.valueOf(((C1680i) obj).c()));
        }
    }

    /* JADX INFO: renamed from: X5.p$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11859a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: X5.p$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f11860a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArrayList invoke() {
            return new ArrayList();
        }
    }

    public static final boolean a(String str, int i8) {
        int i9 = i8 + 1;
        while (i9 < str.length() && str.charAt(i9) == ' ') {
            i9++;
        }
        return i9 == str.length() || str.charAt(i9) == ';';
    }

    public static final List b(String str) {
        return D6.z.J0(c(str), new a());
    }

    public static final List c(String str) {
        return d(str, false);
    }

    public static final List d(String str, boolean z8) {
        if (str == null) {
            return D6.r.n();
        }
        C6.j jVarA = C6.k.a(C6.l.NONE, b.f11859a);
        int iE = 0;
        while (iE <= Z6.w.S(str)) {
            iE = e(str, iE, jVarA, z8);
        }
        return k(jVarA);
    }

    public static final int e(String str, int i8, C6.j jVar, boolean z8) {
        C6.j jVarA = C6.k.a(C6.l.NONE, c.f11860a);
        Integer numValueOf = z8 ? Integer.valueOf(i8) : null;
        int iF = i8;
        while (iF <= Z6.w.S(str)) {
            char cCharAt = str.charAt(iF);
            if (cCharAt == ',') {
                ((ArrayList) jVar.getValue()).add(new C1680i(j(str, i8, numValueOf != null ? numValueOf.intValue() : iF), k(jVarA)));
                return iF + 1;
            }
            if (cCharAt == ';') {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(iF);
                }
                iF = f(str, iF + 1, jVarA);
            } else {
                iF = z8 ? f(str, iF, jVarA) : iF + 1;
            }
        }
        ((ArrayList) jVar.getValue()).add(new C1680i(j(str, i8, numValueOf != null ? numValueOf.intValue() : iF), k(jVarA)));
        return iF;
    }

    public static final int f(String str, int i8, C6.j jVar) {
        int i9 = i8;
        while (true) {
            int iS = Z6.w.S(str);
            String str2 = eGwOBWCdOTaKus.HWyntlX;
            if (i9 > iS) {
                g(jVar, str, i8, i9, str2);
                return i9;
            }
            char cCharAt = str.charAt(i9);
            if (cCharAt == '=') {
                C6.o oVarH = h(str, i9 + 1);
                int iIntValue = ((Number) oVarH.a()).intValue();
                g(jVar, str, i8, i9, (String) oVarH.b());
                return iIntValue;
            }
            if (cCharAt == ';' || cCharAt == ',') {
                g(jVar, str, i8, i9, str2);
                return i9;
            }
            i9++;
        }
    }

    public static final void g(C6.j jVar, String str, int i8, int i9, String str2) {
        String strJ = j(str, i8, i9);
        if (strJ.length() == 0) {
            return;
        }
        ((ArrayList) jVar.getValue()).add(new C1681j(strJ, str2));
    }

    public static final C6.o h(String str, int i8) {
        if (str.length() == i8) {
            return C6.v.a(Integer.valueOf(i8), "");
        }
        if (str.charAt(i8) == '\"') {
            return i(str, i8 + 1);
        }
        int i9 = i8;
        while (i9 <= Z6.w.S(str)) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == ';' || cCharAt == ',') {
                return C6.v.a(Integer.valueOf(i9), j(str, i8, i9));
            }
            i9++;
        }
        return C6.v.a(Integer.valueOf(i9), j(str, i8, i9));
    }

    public static final C6.o i(String str, int i8) {
        StringBuilder sb = new StringBuilder();
        while (i8 <= Z6.w.S(str)) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == '\"' && a(str, i8)) {
                Integer numValueOf = Integer.valueOf(i8 + 1);
                String string = sb.toString();
                kotlin.jvm.internal.t.f(string, "builder.toString()");
                return C6.v.a(numValueOf, string);
            }
            if (cCharAt != '\\' || i8 >= Z6.w.S(str) - 2) {
                sb.append(cCharAt);
                i8++;
            } else {
                sb.append(str.charAt(i8 + 1));
                i8 += 2;
            }
        }
        Integer numValueOf2 = Integer.valueOf(i8);
        String string2 = sb.toString();
        kotlin.jvm.internal.t.f(string2, "builder.toString()");
        return C6.v.a(numValueOf2, '\"' + string2);
    }

    public static final String j(String str, int i8, int i9) {
        String strSubstring = str.substring(i8, i9);
        kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Z6.w.W0(strSubstring).toString();
    }

    public static final List k(C6.j jVar) {
        return jVar.isInitialized() ? (List) jVar.getValue() : D6.r.n();
    }
}
