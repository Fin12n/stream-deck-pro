package p168t1;

import D6.w;
import D6.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f33971a = new B();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        boolean a();

        float b(A1.d dVar);

        String c();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f33973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f33974c;

        public b(String str, float f8) {
            this.f33972a = str;
            this.f33973b = f8;
        }

        @Override // t1.B.a
        public boolean a() {
            return this.f33974c;
        }

        @Override // t1.B.a
        public float b(A1.d dVar) {
            return this.f33973b;
        }

        @Override // t1.B.a
        public String c() {
            return this.f33972a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(c(), bVar.c()) && this.f33973b == bVar.f33973b;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + Float.hashCode(this.f33973b);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f33973b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f33977c;

        public c(String str, int i8) {
            this.f33975a = str;
            this.f33976b = i8;
        }

        @Override // t1.B.a
        public boolean a() {
            return this.f33977c;
        }

        @Override // t1.B.a
        public float b(A1.d dVar) {
            return this.f33976b;
        }

        @Override // t1.B.a
        public String c() {
            return this.f33975a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return t.c(c(), cVar.c()) && this.f33976b == cVar.f33976b;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + this.f33976b;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + c() + "', value=" + this.f33976b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f33978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f33979b;

        public d(a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z8 = false;
            for (a aVar : aVarArr) {
                String strC = aVar.c();
                Object arrayList = linkedHashMap.get(strC);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strC, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + z.r0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
                }
                w.E(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f33978a = arrayList3;
            int size = arrayList3.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (((a) arrayList3.get(i8)).a()) {
                    z8 = true;
                    break;
                }
            }
            this.f33979b = z8;
        }

        public final List a() {
            return this.f33978a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && t.c(this.f33978a, ((d) obj).f33978a);
        }

        public int hashCode() {
            return this.f33978a.hashCode();
        }
    }

    public final d a(C c8, int i8, a... aVarArr) {
        N n8 = new N(3);
        n8.a(c(c8.s()));
        n8.a(b(i8));
        n8.b(aVarArr);
        return new d((a[]) n8.d(new a[n8.c()]));
    }

    public final a b(float f8) {
        if (0.0f <= f8 && f8 <= 1.0f) {
            return new b("ital", f8);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f8).toString());
    }

    public final a c(int i8) {
        if (1 <= i8 && i8 < 1001) {
            return new c("wght", i8);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i8).toString());
    }
}
