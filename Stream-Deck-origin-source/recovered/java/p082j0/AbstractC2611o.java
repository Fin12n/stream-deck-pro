package p082j0;

import A1.t;
import kotlin.jvm.internal.AbstractC2633k;
import p038e1.a0;

/* JADX INFO: renamed from: j0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2611o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f28039a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2611o f28040b = a.f28043e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2611o f28041c = e.f28046e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2611o f28042d = c.f28044e;

    /* JADX INFO: renamed from: j0.o$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends AbstractC2611o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f28043e = new a();

        public a() {
            super(null);
        }

        @Override // p082j0.AbstractC2611o
        public int a(int i8, t tVar, a0 a0Var, int i9) {
            return i8 / 2;
        }
    }

    /* JADX INFO: renamed from: j0.o$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final AbstractC2611o a(L0.c.b bVar) {
            return new d(bVar);
        }

        public final AbstractC2611o b(L0.c.InterfaceC0174c interfaceC0174c) {
            return new f(interfaceC0174c);
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: j0.o$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends AbstractC2611o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f28044e = new c();

        public c() {
            super(null);
        }

        @Override // p082j0.AbstractC2611o
        public int a(int i8, t tVar, a0 a0Var, int i9) {
            if (tVar == t.Ltr) {
                return i8;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: j0.o$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends AbstractC2611o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final L0.c.b f28045e;

        public d(L0.c.b bVar) {
            super(null);
            this.f28045e = bVar;
        }

        @Override // p082j0.AbstractC2611o
        public int a(int i8, t tVar, a0 a0Var, int i9) {
            return this.f28045e.a(0, i8, tVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.t.c(this.f28045e, ((d) obj).f28045e);
        }

        public int hashCode() {
            return this.f28045e.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f28045e + ')';
        }
    }

    /* JADX INFO: renamed from: j0.o$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends AbstractC2611o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f28046e = new e();

        public e() {
            super(null);
        }

        @Override // p082j0.AbstractC2611o
        public int a(int i8, t tVar, a0 a0Var, int i9) {
            if (tVar == t.Ltr) {
                return 0;
            }
            return i8;
        }
    }

    /* JADX INFO: renamed from: j0.o$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends AbstractC2611o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final L0.c.InterfaceC0174c f28047e;

        public f(L0.c.InterfaceC0174c interfaceC0174c) {
            super(null);
            this.f28047e = interfaceC0174c;
        }

        @Override // p082j0.AbstractC2611o
        public int a(int i8, t tVar, a0 a0Var, int i9) {
            return this.f28047e.a(0, i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.t.c(this.f28047e, ((f) obj).f28047e);
        }

        public int hashCode() {
            return this.f28047e.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f28047e + ')';
        }
    }

    public /* synthetic */ AbstractC2611o(AbstractC2633k abstractC2633k) {
        this();
    }

    public abstract int a(int i8, t tVar, a0 a0Var, int i9);

    public Integer b(a0 a0Var) {
        return null;
    }

    public boolean c() {
        return false;
    }

    public AbstractC2611o() {
    }
}
