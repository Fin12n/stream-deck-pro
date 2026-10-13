package X3;

import D6.C0938s;
import D6.L;
import V.ocy.SVzBK;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p201x2.vAk.hJroAgFztiMK;
import r7.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@p116m7.i(with = j.class)
public abstract class i {
    public static final b Companion = new b(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f11718a;

        public a(boolean z8) {
            super(null);
            this.f11718a = z8;
        }

        public final boolean c() {
            return this.f11718a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f11718a == ((a) obj).f11718a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f11718a);
        }

        public String toString() {
            return "BoolValue(value=" + this.f11718a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final i a(boolean z8) {
            return new a(z8);
        }

        public final i b(Map value) {
            t.g(value, "value");
            return new d(value);
        }

        public final i c(double d8) {
            return new e(d8);
        }

        public final i d(int i8) {
            return new f(i8);
        }

        public final i e(List value) {
            t.g(value, "value");
            return new g(value);
        }

        public final i f(long j8) {
            return new h(j8);
        }

        public final i g(String value) {
            t.g(value, "value");
            return new C0300i(value);
        }

        public final p116m7.b serializer() {
            return j.f11726a;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Date f11719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Date value) {
            super(null);
            t.g(value, "value");
            this.f11719a = value;
        }

        public final Date c() {
            return this.f11719a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && t.c(this.f11719a, ((c) obj).f11719a);
        }

        public int hashCode() {
            return this.f11719a.hashCode();
        }

        public String toString() {
            return "DateValue(value=" + this.f11719a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f11720a;

        public final Map c() {
            return this.f11720a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && t.c(this.f11720a, ((d) obj).f11720a);
        }

        public int hashCode() {
            return this.f11720a.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<String, ? extends i> map) {
            super(null);
            t.g(map, SVzBK.HVngxNc);
            this.f11720a = map;
        }

        public String toString() {
            return hJroAgFztiMK.YmQnZOqwizonurZ + this.f11720a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f11721a;

        public e(double d8) {
            super(null);
            this.f11721a = d8;
        }

        public final double c() {
            return this.f11721a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Double.compare(this.f11721a, ((e) obj).f11721a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f11721a);
        }

        public String toString() {
            return "DoubleValue(value=" + this.f11721a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11722a;

        public f(int i8) {
            super(null);
            this.f11722a = i8;
        }

        public final int c() {
            return this.f11722a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f11722a == ((f) obj).f11722a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f11722a);
        }

        public String toString() {
            return "IntValue(value=" + this.f11722a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f11723a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<? extends i> value) {
            super(null);
            t.g(value, "value");
            this.f11723a = value;
        }

        public final List c() {
            return this.f11723a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && t.c(this.f11723a, ((g) obj).f11723a);
        }

        public int hashCode() {
            return this.f11723a.hashCode();
        }

        public String toString() {
            return "ListValue(value=" + this.f11723a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11724a;

        public h(long j8) {
            super(null);
            this.f11724a = j8;
        }

        public final long c() {
            return this.f11724a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f11724a == ((h) obj).f11724a;
        }

        public int hashCode() {
            return Long.hashCode(this.f11724a);
        }

        public String toString() {
            return "LongValue(value=" + this.f11724a + ")";
        }
    }

    /* JADX INFO: renamed from: X3.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0300i extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11725a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0300i(String value) {
            super(null);
            t.g(value, "value");
            this.f11725a = value;
        }

        public final String c() {
            return this.f11725a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0300i) && t.c(this.f11725a, ((C0300i) obj).f11725a);
        }

        public int hashCode() {
            return this.f11725a.hashCode();
        }

        public String toString() {
            return "StringValue(value=" + this.f11725a + ")";
        }
    }

    public /* synthetic */ i(AbstractC2633k abstractC2633k) {
        this();
    }

    public final Object a() {
        if (this instanceof C0300i) {
            return ((C0300i) this).c();
        }
        if (this instanceof f) {
            return Integer.valueOf(((f) this).c());
        }
        if (this instanceof h) {
            return Long.valueOf(((h) this).c());
        }
        if (this instanceof e) {
            return Double.valueOf(((e) this).c());
        }
        if (this instanceof a) {
            return Boolean.valueOf(((a) this).c());
        }
        if (this instanceof c) {
            return Long.valueOf(((c) this).c().getTime());
        }
        if (this instanceof g) {
            List listC = ((g) this).c();
            ArrayList arrayList = new ArrayList(C0938s.y(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(((i) it.next()).a());
            }
            return arrayList;
        }
        if (!(this instanceof d)) {
            throw new C6.m();
        }
        Map mapC = ((d) this).c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(mapC.size()));
        for (Map.Entry entry : mapC.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((i) entry.getValue()).a());
        }
        return linkedHashMap;
    }

    public final r7.j b() {
        if (this instanceof C0300i) {
            return r7.k.c(((C0300i) this).c());
        }
        if (this instanceof f) {
            return r7.k.b(Integer.valueOf(((f) this).c()));
        }
        if (this instanceof h) {
            return r7.k.b(Long.valueOf(((h) this).c()));
        }
        if (this instanceof e) {
            return r7.k.b(Double.valueOf(((e) this).c()));
        }
        if (this instanceof a) {
            return r7.k.a(Boolean.valueOf(((a) this).c()));
        }
        if (this instanceof c) {
            return r7.k.b(Long.valueOf(((c) this).c().getTime()));
        }
        if (this instanceof g) {
            List listC = ((g) this).c();
            ArrayList arrayList = new ArrayList(C0938s.y(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(((i) it.next()).b());
            }
            return new r7.d(arrayList);
        }
        if (!(this instanceof d)) {
            throw new C6.m();
        }
        Map mapC = ((d) this).c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.d(mapC.size()));
        for (Map.Entry entry : mapC.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((i) entry.getValue()).b());
        }
        return new w(linkedHashMap);
    }

    public i() {
    }
}
