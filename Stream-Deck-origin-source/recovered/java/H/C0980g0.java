package H;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: H.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0980g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3014i = InterfaceC0984i0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3015j = InterfaceC0984i0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC0984i0.a f3016k = InterfaceC0984i0.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0984i0 f3018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1 f3023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1014y f3024h;

    /* JADX INFO: renamed from: H.g0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a(u1 u1Var, a aVar);
    }

    public C0980g0(List list, InterfaceC0984i0 interfaceC0984i0, int i8, boolean z8, List list2, boolean z9, m1 m1Var, InterfaceC1014y interfaceC1014y) {
        this.f3017a = list;
        this.f3018b = interfaceC0984i0;
        this.f3019c = i8;
        this.f3021e = Collections.unmodifiableList(list2);
        this.f3022f = z9;
        this.f3023g = m1Var;
        this.f3024h = interfaceC1014y;
        this.f3020d = z8;
    }

    public static C0980g0 b() {
        return new a().h();
    }

    public List c() {
        return this.f3021e;
    }

    public InterfaceC1014y d() {
        return this.f3024h;
    }

    public Range e() {
        Range range = (Range) this.f3018b.f(f3016k, g1.f3033a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f3023g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public InterfaceC0984i0 g() {
        return this.f3018b;
    }

    public int h() {
        Integer num = (Integer) this.f3018b.f(u1.f3223H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List i() {
        return Collections.unmodifiableList(this.f3017a);
    }

    public m1 j() {
        return this.f3023g;
    }

    public int k() {
        return this.f3019c;
    }

    public int l() {
        Integer num = (Integer) this.f3018b.f(u1.f3224I, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f3022f;
    }

    /* JADX INFO: renamed from: H.g0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f3025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public N0 f3026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f3029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Q0 f3031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC1014y f3032h;

        public a() {
            this.f3025a = new HashSet();
            this.f3026b = O0.i0();
            this.f3027c = -1;
            this.f3028d = false;
            this.f3029e = new ArrayList();
            this.f3030f = false;
            this.f3031g = Q0.g();
        }

        public static a i(u1 u1Var) {
            b bVarH = u1Var.H(null);
            if (bVarH != null) {
                a aVar = new a();
                bVarH.a(u1Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + u1Var.F(u1Var.toString()));
        }

        public static a j(C0980g0 c0980g0) {
            return new a(c0980g0);
        }

        public void a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c((AbstractC0995o) it.next());
            }
        }

        public void b(m1 m1Var) {
            this.f3031g.f(m1Var);
        }

        public void c(AbstractC0995o abstractC0995o) {
            if (this.f3029e.contains(abstractC0995o)) {
                return;
            }
            this.f3029e.add(abstractC0995o);
        }

        public void d(InterfaceC0984i0.a aVar, Object obj) {
            this.f3026b.L(aVar, obj);
        }

        public void e(InterfaceC0984i0 interfaceC0984i0) {
            for (InterfaceC0984i0.a aVar : interfaceC0984i0.c()) {
                Object objF = this.f3026b.f(aVar, null);
                Object objH = interfaceC0984i0.h(aVar);
                if (objF instanceof M0) {
                    ((M0) objF).a(((M0) objH).c());
                } else {
                    if (objH instanceof M0) {
                        objH = ((M0) objH).clone();
                    }
                    this.f3026b.K(aVar, interfaceC0984i0.d(aVar), objH);
                }
            }
        }

        public void f(AbstractC0994n0 abstractC0994n0) {
            this.f3025a.add(abstractC0994n0);
        }

        public void g(String str, Object obj) {
            this.f3031g.i(str, obj);
        }

        public C0980g0 h() {
            return new C0980g0(new ArrayList(this.f3025a), T0.h0(this.f3026b), this.f3027c, this.f3028d, new ArrayList(this.f3029e), this.f3030f, m1.c(this.f3031g), this.f3032h);
        }

        public Range k() {
            return (Range) this.f3026b.f(C0980g0.f3016k, g1.f3033a);
        }

        public Set l() {
            return this.f3025a;
        }

        public int m() {
            return this.f3027c;
        }

        public void n(InterfaceC1014y interfaceC1014y) {
            this.f3032h = interfaceC1014y;
        }

        public void o(Range range) {
            d(C0980g0.f3016k, range);
        }

        public void p(int i8) {
            this.f3031g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i8));
        }

        public void q(InterfaceC0984i0 interfaceC0984i0) {
            this.f3026b = O0.j0(interfaceC0984i0);
        }

        public void r(boolean z8) {
            this.f3028d = z8;
        }

        public void s(int i8) {
            if (i8 != 0) {
                d(u1.f3223H, Integer.valueOf(i8));
            }
        }

        public void t(int i8) {
            this.f3027c = i8;
        }

        public void u(boolean z8) {
            this.f3030f = z8;
        }

        public void v(int i8) {
            if (i8 != 0) {
                d(u1.f3224I, Integer.valueOf(i8));
            }
        }

        public a(C0980g0 c0980g0) {
            HashSet hashSet = new HashSet();
            this.f3025a = hashSet;
            this.f3026b = O0.i0();
            this.f3027c = -1;
            this.f3028d = false;
            this.f3029e = new ArrayList();
            this.f3030f = false;
            this.f3031g = Q0.g();
            hashSet.addAll(c0980g0.f3017a);
            this.f3026b = O0.j0(c0980g0.f3018b);
            this.f3027c = c0980g0.f3019c;
            this.f3029e.addAll(c0980g0.c());
            this.f3030f = c0980g0.m();
            this.f3031g = Q0.h(c0980g0.j());
            this.f3028d = c0980g0.f3020d;
        }
    }
}
