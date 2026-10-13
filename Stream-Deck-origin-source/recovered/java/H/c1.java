package H;

import A.AbstractC0890p0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f2951j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f2953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f2957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0980g0 f2958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InputConfiguration f2960i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f2966f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InputConfiguration f2967g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f f2969i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f2961a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0980g0.a f2962b = new C0980g0.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f2963c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f2964d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f2965e = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f2968h = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends a {
        public static b q(u1 u1Var, Size size) {
            e eVarL = u1Var.l(null);
            if (eVarL != null) {
                b bVar = new b();
                eVarL.a(size, u1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + u1Var.F(u1Var.toString()));
        }

        public b a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC0995o abstractC0995o = (AbstractC0995o) it.next();
                this.f2962b.c(abstractC0995o);
                if (!this.f2965e.contains(abstractC0995o)) {
                    this.f2965e.add(abstractC0995o);
                }
            }
            return this;
        }

        public b b(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                f((CameraDevice.StateCallback) it.next());
            }
            return this;
        }

        public b c(Collection collection) {
            this.f2962b.a(collection);
            return this;
        }

        public b d(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k((CameraCaptureSession.StateCallback) it.next());
            }
            return this;
        }

        public b e(AbstractC0995o abstractC0995o) {
            this.f2962b.c(abstractC0995o);
            if (!this.f2965e.contains(abstractC0995o)) {
                this.f2965e.add(abstractC0995o);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f2963c.contains(stateCallback)) {
                return this;
            }
            this.f2963c.add(stateCallback);
            return this;
        }

        public b g(InterfaceC0984i0 interfaceC0984i0) {
            this.f2962b.e(interfaceC0984i0);
            return this;
        }

        public b h(AbstractC0994n0 abstractC0994n0) {
            return i(abstractC0994n0, A.J.f88d);
        }

        public b i(AbstractC0994n0 abstractC0994n0, A.J j8) {
            this.f2961a.add(f.a(abstractC0994n0).b(j8).a());
            return this;
        }

        public b j(AbstractC0995o abstractC0995o) {
            this.f2962b.c(abstractC0995o);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f2964d.contains(stateCallback)) {
                return this;
            }
            this.f2964d.add(stateCallback);
            return this;
        }

        public b l(AbstractC0994n0 abstractC0994n0) {
            return m(abstractC0994n0, A.J.f88d);
        }

        public b m(AbstractC0994n0 abstractC0994n0, A.J j8) {
            return n(abstractC0994n0, j8, null, -1);
        }

        public b n(AbstractC0994n0 abstractC0994n0, A.J j8, String str, int i8) {
            this.f2961a.add(f.a(abstractC0994n0).d(str).b(j8).c(i8).a());
            this.f2962b.f(abstractC0994n0);
            return this;
        }

        public b o(String str, Object obj) {
            this.f2962b.g(str, obj);
            return this;
        }

        public c1 p() {
            return new c1(new ArrayList(this.f2961a), new ArrayList(this.f2963c), new ArrayList(this.f2964d), new ArrayList(this.f2965e), this.f2962b.h(), this.f2966f, this.f2967g, this.f2968h, this.f2969i);
        }

        public b r(d dVar) {
            this.f2966f = dVar;
            return this;
        }

        public b s(Range range) {
            this.f2962b.o(range);
            return this;
        }

        public b t(InterfaceC0984i0 interfaceC0984i0) {
            this.f2962b.q(interfaceC0984i0);
            return this;
        }

        public b u(InputConfiguration inputConfiguration) {
            this.f2967g = inputConfiguration;
            return this;
        }

        public b v(AbstractC0994n0 abstractC0994n0) {
            this.f2969i = f.a(abstractC0994n0).a();
            return this;
        }

        public b w(int i8) {
            if (i8 != 0) {
                this.f2962b.s(i8);
            }
            return this;
        }

        public b x(int i8) {
            this.f2968h = i8;
            return this;
        }

        public b y(int i8) {
            this.f2962b.t(i8);
            return this;
        }

        public b z(int i8) {
            if (i8 != 0) {
                this.f2962b.v(i8);
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f2970a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f2971b;

        public c(d dVar) {
            this.f2971b = dVar;
        }

        @Override // H.c1.d
        public void a(c1 c1Var, g gVar) {
            if (this.f2970a.get()) {
                return;
            }
            this.f2971b.a(c1Var, gVar);
        }

        public void b() {
            this.f2970a.set(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        void a(c1 c1Var, g gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        void a(Size size, u1 u1Var, b bVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class f {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static abstract class a {
            public abstract f a();

            public abstract a b(A.J j8);

            public abstract a c(int i8);

            public abstract a d(String str);

            public abstract a e(List list);

            public abstract a f(int i8);
        }

        public static a a(AbstractC0994n0 abstractC0994n0) {
            return new C0987k.b().g(abstractC0994n0).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(A.J.f88d);
        }

        public abstract A.J b();

        public abstract int c();

        public abstract String d();

        public abstract List e();

        public abstract AbstractC0994n0 f();

        public abstract int g();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final O.g f2975j = new O.g();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2976k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public StringBuilder f2977l = new StringBuilder();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f2978m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f2979n = new ArrayList();

        public static /* synthetic */ void a(h hVar, c1 c1Var, g gVar) {
            Iterator it = hVar.f2979n.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(c1Var, gVar);
            }
        }

        public void b(c1 c1Var) {
            C0980g0 c0980g0K = c1Var.k();
            if (c0980g0K.k() != -1) {
                this.f2978m = true;
                this.f2962b.t(c1.f(c0980g0K.k(), this.f2962b.m()));
            }
            g(c0980g0K.e());
            h(c0980g0K.h());
            i(c0980g0K.l());
            this.f2962b.b(c1Var.k().j());
            this.f2963c.addAll(c1Var.c());
            this.f2964d.addAll(c1Var.l());
            this.f2962b.a(c1Var.j());
            this.f2965e.addAll(c1Var.n());
            if (c1Var.d() != null) {
                this.f2979n.add(c1Var.d());
            }
            if (c1Var.h() != null) {
                this.f2967g = c1Var.h();
            }
            this.f2961a.addAll(c1Var.i());
            this.f2962b.l().addAll(c0980g0K.i());
            if (!e().containsAll(this.f2962b.l())) {
                AbstractC0890p0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f2976k = false;
                this.f2977l.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            if (c1Var.m() != this.f2968h && c1Var.m() != 0 && this.f2968h != 0) {
                AbstractC0890p0.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f2976k = false;
                this.f2977l.append("Invalid configuration due to that two non-default session types are set");
            } else if (c1Var.m() != 0) {
                this.f2968h = c1Var.m();
            }
            if (c1Var.f2953b != null) {
                if (this.f2969i == c1Var.f2953b || this.f2969i == null) {
                    this.f2969i = c1Var.f2953b;
                } else {
                    AbstractC0890p0.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f2976k = false;
                    this.f2977l.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            this.f2962b.e(c0980g0K.g());
        }

        public c1 c() {
            if (!this.f2976k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f2961a);
            this.f2975j.c(arrayList);
            if (this.f2968h == 1) {
                new L.g().e(arrayList, this.f2962b);
            }
            return new c1(arrayList, new ArrayList(this.f2963c), new ArrayList(this.f2964d), new ArrayList(this.f2965e), this.f2962b.h(), !this.f2979n.isEmpty() ? new d() { // from class: H.d1
                @Override // H.c1.d
                public final void a(c1 c1Var, c1.g gVar) {
                    c1.h.a(this.f2985a, c1Var, gVar);
                }
            } : null, this.f2967g, this.f2968h, this.f2969i);
        }

        public String d() {
            return !this.f2978m ? "Template is not set" : this.f2977l.toString();
        }

        public final List e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f2961a) {
                arrayList.add(fVar.f());
                Iterator it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC0994n0) it.next());
                }
            }
            return arrayList;
        }

        public boolean f() {
            return this.f2978m && this.f2976k;
        }

        public final void g(Range range) {
            Range range2 = g1.f3033a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f2962b.k().equals(range2)) {
                this.f2962b.o(range);
                return;
            }
            if (this.f2962b.k().equals(range)) {
                return;
            }
            this.f2976k = false;
            String str = "Different ExpectedFrameRateRange values; current = " + this.f2962b.k() + ", new = " + range;
            AbstractC0890p0.c("ValidatingBuilder", str);
            this.f2977l.append(str);
        }

        public final void h(int i8) {
            if (i8 != 0) {
                this.f2962b.s(i8);
            }
        }

        public final void i(int i8) {
            if (i8 != 0) {
                this.f2962b.v(i8);
            }
        }
    }

    public c1(List list, List list2, List list3, List list4, C0980g0 c0980g0, d dVar, InputConfiguration inputConfiguration, int i8, f fVar) {
        this.f2952a = list;
        this.f2954c = Collections.unmodifiableList(list2);
        this.f2955d = Collections.unmodifiableList(list3);
        this.f2956e = Collections.unmodifiableList(list4);
        this.f2957f = dVar;
        this.f2958g = c0980g0;
        this.f2960i = inputConfiguration;
        this.f2959h = i8;
        this.f2953b = fVar;
    }

    public static c1 b() {
        return new c1(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C0980g0.a().h(), null, null, 0, null);
    }

    public static int f(int i8, int i9) {
        List list = f2951j;
        return list.indexOf(Integer.valueOf(i8)) >= list.indexOf(Integer.valueOf(i9)) ? i8 : i9;
    }

    public List c() {
        return this.f2954c;
    }

    public d d() {
        return this.f2957f;
    }

    public Range e() {
        return this.f2958g.e();
    }

    public InterfaceC0984i0 g() {
        return this.f2958g.g();
    }

    public InputConfiguration h() {
        return this.f2960i;
    }

    public List i() {
        return this.f2952a;
    }

    public List j() {
        return this.f2958g.c();
    }

    public C0980g0 k() {
        return this.f2958g;
    }

    public List l() {
        return this.f2955d;
    }

    public int m() {
        return this.f2959h;
    }

    public List n() {
        return this.f2956e;
    }

    public List o() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f2952a) {
            arrayList.add(fVar.f());
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC0994n0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f2958g.k();
    }
}
