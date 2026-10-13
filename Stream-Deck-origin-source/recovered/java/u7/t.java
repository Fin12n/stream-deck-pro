package u7;

import E4.JFpq.XRlnZWSrAFn;
import R0.pkXL.Oitvkwcwn;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC2625c;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Iterable, R6.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f34815b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f34816a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f34817a = new ArrayList(20);

        public final a b(String line) {
            kotlin.jvm.internal.t.g(line, "line");
            int iX = Z6.w.X(line, ':', 1, false, 4, null);
            if (iX != -1) {
                String strSubstring = line.substring(0, iX);
                kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iX + 1);
                kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            kotlin.jvm.internal.t.f(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
            return this;
        }

        public final a c(String name, String value) {
            kotlin.jvm.internal.t.g(name, "name");
            kotlin.jvm.internal.t.g(value, "value");
            this.f34817a.add(name);
            this.f34817a.add(Z6.w.W0(value).toString());
            return this;
        }

        public final t d() {
            return new t((String[]) this.f34817a.toArray(new String[0]), null);
        }

        public final String e(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            int size = this.f34817a.size() - 2;
            int iC = K6.c.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (!Z6.v.v(name, (String) this.f34817a.get(size), true)) {
                if (size == iC) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.f34817a.get(size + 1);
        }

        public final List f() {
            return this.f34817a;
        }

        public final a g(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            int i8 = 0;
            while (i8 < this.f34817a.size()) {
                if (Z6.v.v(name, (String) this.f34817a.get(i8), true)) {
                    this.f34817a.remove(i8);
                    this.f34817a.remove(i8);
                    i8 -= 2;
                }
                i8 += 2;
            }
            return this;
        }

        public final a h(String name, String value) {
            kotlin.jvm.internal.t.g(name, "name");
            kotlin.jvm.internal.t.g(value, "value");
            b bVar = t.f34815b;
            bVar.d(name);
            bVar.e(value, name);
            g(name);
            c(name, value);
            return this;
        }

        public final a a(String str, String value) {
            kotlin.jvm.internal.t.g(str, XRlnZWSrAFn.lCY);
            kotlin.jvm.internal.t.g(value, "value");
            b bVar = t.f34815b;
            bVar.d(str);
            bVar.e(value, str);
            c(str, value);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final void d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                char cCharAt = str.charAt(i8);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(v7.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i8), str).toString());
                }
            }
        }

        public final void e(String str, String str2) {
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                char cCharAt = str.charAt(i8);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(v7.d.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i8), str2));
                    sb.append(v7.d.H(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public final String f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iC = K6.c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!Z6.v.v(str, strArr[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        public b() {
        }

        public final t g(String... strArr) {
            kotlin.jvm.internal.t.g(strArr, Oitvkwcwn.anckpGFJNIoNWpC);
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                String str = strArr2[i9];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i9] = Z6.w.W0(str).toString();
            }
            int iC = K6.c.c(0, strArr2.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr2[i8];
                    String str3 = strArr2[i8 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i8 == iC) {
                        break;
                    }
                    i8 += 2;
                }
            }
            return new t(strArr2, null);
        }
    }

    public /* synthetic */ t(String[] strArr, AbstractC2633k abstractC2633k) {
        this(strArr);
    }

    public final String c(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        return f34815b.f(this.f34816a, name);
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f34816a, ((t) obj).f34816a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f34816a);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        C6.o[] oVarArr = new C6.o[size];
        for (int i8 = 0; i8 < size; i8++) {
            oVarArr[i8] = C6.v.a(m(i8), u(i8));
        }
        return AbstractC2625c.a(oVarArr);
    }

    public final String m(int i8) {
        return this.f34816a[i8 * 2];
    }

    public final Set o() {
        TreeSet treeSet = new TreeSet(Z6.v.w(O.f28784a));
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            treeSet.add(m(i8));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        kotlin.jvm.internal.t.f(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final a s() {
        a aVar = new a();
        D6.w.F(aVar.f(), this.f34816a);
        return aVar;
    }

    public final int size() {
        return this.f34816a.length / 2;
    }

    public final Map t() {
        TreeMap treeMap = new TreeMap(Z6.v.w(O.f28784a));
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            String strM = m(i8);
            Locale US = Locale.US;
            kotlin.jvm.internal.t.f(US, "US");
            String lowerCase = strM.toLowerCase(US);
            kotlin.jvm.internal.t.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(u(i8));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            String strM = m(i8);
            String strU = u(i8);
            sb.append(strM);
            sb.append(": ");
            if (v7.d.H(strM)) {
                strU = "██";
            }
            sb.append(strU);
            sb.append("\n");
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String u(int i8) {
        return this.f34816a[(i8 * 2) + 1];
    }

    public t(String[] strArr) {
        this.f34816a = strArr;
    }

    public final List y(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            if (Z6.v.v(name, m(i8), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(u(i8));
            }
        }
        if (arrayList == null) {
            return D6.r.n();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.t.f(listUnmodifiableList, WaYxBuDSBD.oni);
        return listUnmodifiableList;
    }
}
