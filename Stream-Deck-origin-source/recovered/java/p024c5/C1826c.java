package p024c5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: c5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1826c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f16224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f16225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f16228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f16229f;

    /* JADX INFO: renamed from: c5.c$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f16230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f16231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g f16234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set f16235f;

        public b b(p pVar) {
            B.c(pVar, "Null dependency");
            f(pVar.b());
            this.f16231b.add(pVar);
            return this;
        }

        public C1826c c() {
            B.d(this.f16234e != null, "Missing required property: factory.");
            return new C1826c(new HashSet(this.f16230a), new HashSet(this.f16231b), this.f16232c, this.f16233d, this.f16234e, this.f16235f);
        }

        public b d(g gVar) {
            this.f16234e = (g) B.c(gVar, "Null factory");
            return this;
        }

        public final b e() {
            this.f16233d = 1;
            return this;
        }

        public final void f(Class cls) {
            B.a(!this.f16230a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            HashSet hashSet = new HashSet();
            this.f16230a = hashSet;
            this.f16231b = new HashSet();
            this.f16232c = 0;
            this.f16233d = 0;
            this.f16235f = new HashSet();
            B.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                B.c(cls2, "Null interface");
            }
            Collections.addAll(this.f16230a, clsArr);
        }
    }

    public static b a(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b b(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b g(Class cls) {
        return a(cls).e();
    }

    public static C1826c l(Object obj, Class cls, Class... clsArr) {
        return b(cls, clsArr).d(C1825b.b(obj)).c();
    }

    public Set c() {
        return this.f16225b;
    }

    public g d() {
        return this.f16228e;
    }

    public Set e() {
        return this.f16224a;
    }

    public Set f() {
        return this.f16229f;
    }

    public boolean h() {
        return this.f16226c == 1;
    }

    public boolean i() {
        return this.f16226c == 2;
    }

    public boolean j() {
        return this.f16227d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f16224a.toArray()) + ">{" + this.f16226c + ", type=" + this.f16227d + ", deps=" + Arrays.toString(this.f16225b.toArray()) + "}";
    }

    public C1826c(Set set, Set set2, int i8, int i9, g gVar, Set set3) {
        this.f16224a = Collections.unmodifiableSet(set);
        this.f16225b = Collections.unmodifiableSet(set2);
        this.f16226c = i8;
        this.f16227d = i9;
        this.f16228e = gVar;
        this.f16229f = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object k(Object obj, d dVar) {
        return obj;
    }
}
