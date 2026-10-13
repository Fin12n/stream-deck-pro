package p209y2;

import A2.g;
import C6.InterfaceC0916e;
import D6.T;
import Z6.v;
import Z6.w;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p193w2.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f38238e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f38240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f38241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f38242d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e a(g database, String tableName) {
            t.g(database, "database");
            t.g(tableName, "tableName");
            return f.f(database, tableName);
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f38252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f38253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f38254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f38255e;

        public c(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            t.g(referenceTable, "referenceTable");
            t.g(onDelete, "onDelete");
            t.g(onUpdate, "onUpdate");
            t.g(columnNames, "columnNames");
            t.g(referenceColumnNames, "referenceColumnNames");
            this.f38251a = referenceTable;
            this.f38252b = onDelete;
            this.f38253c = onUpdate;
            this.f38254d = columnNames;
            this.f38255e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (t.c(this.f38251a, cVar.f38251a) && t.c(this.f38252b, cVar.f38252b) && t.c(this.f38253c, cVar.f38253c) && t.c(this.f38254d, cVar.f38254d)) {
                return t.c(this.f38255e, cVar.f38255e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f38251a.hashCode() * 31) + this.f38252b.hashCode()) * 31) + this.f38253c.hashCode()) * 31) + this.f38254d.hashCode()) * 31) + this.f38255e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f38251a + SZCvugJaXc.sKDERVCpvMYe + this.f38252b + " +', onUpdate='" + this.f38253c + "', columnNames=" + this.f38254d + ", referenceColumnNames=" + this.f38255e + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f38258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f38259d;

        public d(int i8, int i9, String from, String to) {
            t.g(from, "from");
            t.g(to, "to");
            this.f38256a = i8;
            this.f38257b = i9;
            this.f38258c = from;
            this.f38259d = to;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            t.g(other, "other");
            int i8 = this.f38256a - other.f38256a;
            return i8 == 0 ? this.f38257b - other.f38257b : i8;
        }

        public final String b() {
            return this.f38258c;
        }

        public final int c() {
            return this.f38256a;
        }

        public final String d() {
            return this.f38259d;
        }
    }

    public e(String name, Map<String, a> columns, Set<c> foreignKeys, Set<C0846e> set) {
        t.g(name, "name");
        t.g(columns, "columns");
        t.g(foreignKeys, "foreignKeys");
        this.f38239a = name;
        this.f38240b = columns;
        this.f38241c = foreignKeys;
        this.f38242d = set;
    }

    public static final e a(g gVar, String str) {
        return f38238e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!t.c(this.f38239a, eVar.f38239a) || !t.c(this.f38240b, eVar.f38240b) || !t.c(this.f38241c, eVar.f38241c)) {
            return false;
        }
        Set set2 = this.f38242d;
        if (set2 == null || (set = eVar.f38242d) == null) {
            return true;
        }
        return t.c(set2, set);
    }

    public int hashCode() {
        return (((this.f38239a.hashCode() * 31) + this.f38240b.hashCode()) * 31) + this.f38241c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f38239a + "', columns=" + this.f38240b + ", foreignKeys=" + this.f38241c + ", indices=" + this.f38242d + '}';
    }

    public /* synthetic */ e(String str, Map map, Set set, Set set2, int i8, AbstractC2633k abstractC2633k) {
        this(str, map, set, (i8 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str, Map<String, a> columns, Set<c> foreignKeys) {
        this(str, columns, foreignKeys, T.d());
        t.g(str, ajyWhveMDgQ.lKMMRZr);
        t.g(columns, "columns");
        t.g(foreignKeys, "foreignKeys");
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0845a f38243h = new C0845a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f38245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f38246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f38247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f38248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f38249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f38250g;

        /* JADX INFO: renamed from: y2.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0845a {
            public /* synthetic */ C0845a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i8 < str.length()) {
                    char cCharAt = str.charAt(i8);
                    int i11 = i10 + 1;
                    if (i10 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i9++;
                    } else if (cCharAt == ')' && (i9 = i9 - 1) == 0 && i10 != str.length() - 1) {
                        return false;
                    }
                    i8++;
                    i10 = i11;
                }
                return i9 == 0;
            }

            public final boolean b(String current, String str) {
                t.g(current, "current");
                if (t.c(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return t.c(w.W0(strSubstring).toString(), str);
            }

            public C0845a() {
            }
        }

        public a(String name, String type, boolean z8, int i8, String str, int i9) {
            t.g(name, "name");
            t.g(type, "type");
            this.f38244a = name;
            this.f38245b = type;
            this.f38246c = z8;
            this.f38247d = i8;
            this.f38248e = str;
            this.f38249f = i9;
            this.f38250g = a(type);
        }

        public final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            t.f(US, "US");
            String upperCase = str.toUpperCase(US);
            t.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (w.M(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (w.M(upperCase, "CHAR", false, 2, null) || w.M(upperCase, "CLOB", false, 2, null) || w.M(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (w.M(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (w.M(upperCase, "REAL", false, 2, null) || w.M(upperCase, "FLOA", false, 2, null) || w.M(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f38247d != ((a) obj).f38247d) {
                return false;
            }
            a aVar = (a) obj;
            if (!t.c(this.f38244a, aVar.f38244a) || this.f38246c != aVar.f38246c) {
                return false;
            }
            if (this.f38249f == 1 && aVar.f38249f == 2 && (str3 = this.f38248e) != null && !f38243h.b(str3, aVar.f38248e)) {
                return false;
            }
            if (this.f38249f == 2 && aVar.f38249f == 1 && (str2 = aVar.f38248e) != null && !f38243h.b(str2, this.f38248e)) {
                return false;
            }
            int i8 = this.f38249f;
            return (i8 == 0 || i8 != aVar.f38249f || ((str = this.f38248e) == null ? aVar.f38248e == null : f38243h.b(str, aVar.f38248e))) && this.f38250g == aVar.f38250g;
        }

        public int hashCode() {
            return (((((this.f38244a.hashCode() * 31) + this.f38250g) * 31) + (this.f38246c ? 1231 : 1237)) * 31) + this.f38247d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f38244a);
            sb.append("', type='");
            sb.append(this.f38245b);
            sb.append("', affinity='");
            sb.append(this.f38250g);
            sb.append("', notNull=");
            sb.append(this.f38246c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f38247d);
            sb.append(", defaultValue='");
            String str = this.f38248e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC0916e
        public a(String name, String type, boolean z8, int i8) {
            this(name, type, z8, i8, null, 0);
            t.g(name, "name");
            t.g(type, "type");
        }
    }

    /* JADX INFO: renamed from: y2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0846e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f38260e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f38262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f38263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f38264d;

        /* JADX INFO: renamed from: y2.e$e$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public C0846e(String name, boolean z8, List<String> columns, List<String> orders) {
            t.g(name, "name");
            t.g(columns, "columns");
            t.g(orders, "orders");
            this.f38261a = name;
            this.f38262b = z8;
            this.f38263c = columns;
            this.f38264d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList<>(size);
                for (int i8 = 0; i8 < size; i8++) {
                    orders.add(k.ASC.name());
                }
            }
            this.f38264d = orders;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0846e)) {
                return false;
            }
            C0846e c0846e = (C0846e) obj;
            if (this.f38262b == c0846e.f38262b && t.c(this.f38263c, c0846e.f38263c) && t.c(this.f38264d, c0846e.f38264d)) {
                return v.H(this.f38261a, "index_", false, 2, null) ? v.H(c0846e.f38261a, "index_", false, 2, null) : t.c(this.f38261a, c0846e.f38261a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((v.H(this.f38261a, "index_", false, 2, null) ? -1184239155 : this.f38261a.hashCode()) * 31) + (this.f38262b ? 1 : 0)) * 31) + this.f38263c.hashCode()) * 31) + this.f38264d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f38261a + "', unique=" + this.f38262b + ", columns=" + this.f38263c + ", orders=" + this.f38264d + "'}";
        }

        @InterfaceC0916e
        public C0846e(String name, boolean z8, List<String> columns) {
            t.g(name, "name");
            t.g(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(k.ASC.name());
            }
            this(name, z8, columns, arrayList);
        }
    }
}
