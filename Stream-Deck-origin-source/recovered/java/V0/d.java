package V0;

import C6.InterfaceC0916e;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.X;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f10289k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f10290l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f10296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10300j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f10302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f10306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f10307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f10308h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList f10309i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public C0286a f10310j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f10311k;

        /* JADX INFO: renamed from: V0.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0286a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f10312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public float f10313b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public float f10314c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f10315d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f10316e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public float f10317f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public float f10318g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public float f10319h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public List f10320i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public List f10321j;

            public C0286a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public final List a() {
                return this.f10321j;
            }

            public final List b() {
                return this.f10320i;
            }

            public final String c() {
                return this.f10312a;
            }

            public final float d() {
                return this.f10314c;
            }

            public final float e() {
                return this.f10315d;
            }

            public final float f() {
                return this.f10313b;
            }

            public final float g() {
                return this.f10316e;
            }

            public final float h() {
                return this.f10317f;
            }

            public final float i() {
                return this.f10318g;
            }

            public final float j() {
                return this.f10319h;
            }

            public C0286a(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List<? extends h> list, List<p> list2) {
                this.f10312a = str;
                this.f10313b = f8;
                this.f10314c = f9;
                this.f10315d = f10;
                this.f10316e = f11;
                this.f10317f = f12;
                this.f10318g = f13;
                this.f10319h = f14;
                this.f10320i = list;
                this.f10321j = list2;
            }

            public /* synthetic */ C0286a(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list, List list2, int i8, AbstractC2633k abstractC2633k) {
                this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0.0f : f8, (i8 & 4) != 0 ? 0.0f : f9, (i8 & 8) != 0 ? 0.0f : f10, (i8 & 16) != 0 ? 1.0f : f11, (i8 & 32) != 0 ? 1.0f : f12, (i8 & 64) != 0 ? 0.0f : f13, (i8 & 128) != 0 ? 0.0f : f14, (i8 & 256) != 0 ? o.e() : list, (i8 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        @InterfaceC0916e
        public /* synthetic */ a(String str, float f8, float f9, float f10, float f11, long j8, int i8, AbstractC2633k abstractC2633k) {
            this(str, f8, f9, f10, f11, j8, i8);
        }

        public static /* synthetic */ a b(a aVar, String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = "";
            }
            if ((i8 & 2) != 0) {
                f8 = 0.0f;
            }
            if ((i8 & 4) != 0) {
                f9 = 0.0f;
            }
            if ((i8 & 8) != 0) {
                f10 = 0.0f;
            }
            if ((i8 & 16) != 0) {
                f11 = 1.0f;
            }
            if ((i8 & 32) != 0) {
                f12 = 1.0f;
            }
            if ((i8 & 64) != 0) {
                f13 = 0.0f;
            }
            if ((i8 & 128) != 0) {
                f14 = 0.0f;
            }
            if ((i8 & 256) != 0) {
                list = o.e();
            }
            float f15 = f14;
            List list2 = list;
            float f16 = f13;
            float f17 = f11;
            return aVar.a(str, f8, f9, f10, f17, f12, f16, f15, list2);
        }

        public final a a(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list) {
            h();
            e.f(this.f10309i, new C0286a(str, f8, f9, f10, f11, f12, f13, f14, list, null, 512, null));
            return this;
        }

        public final a c(List list, int i8, String str, AbstractC1582d0 abstractC1582d0, float f8, AbstractC1582d0 abstractC1582d1, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14) {
            h();
            i().a().add(new r(str, list, i8, abstractC1582d0, f8, abstractC1582d1, f9, f10, i9, i10, f11, f12, f13, f14, null));
            return this;
        }

        public final n e(C0286a c0286a) {
            return new n(c0286a.c(), c0286a.f(), c0286a.d(), c0286a.e(), c0286a.g(), c0286a.h(), c0286a.i(), c0286a.j(), c0286a.b(), c0286a.a());
        }

        public final d f() {
            h();
            while (this.f10309i.size() > 1) {
                g();
            }
            d dVar = new d(this.f10301a, this.f10302b, this.f10303c, this.f10304d, this.f10305e, e(this.f10310j), this.f10306f, this.f10307g, this.f10308h, 0, 512, null);
            this.f10311k = true;
            return dVar;
        }

        public final a g() {
            h();
            i().a().add(e((C0286a) e.e(this.f10309i)));
            return this;
        }

        public final void h() {
            if (this.f10311k) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        public final C0286a i() {
            return (C0286a) e.d(this.f10309i);
        }

        public /* synthetic */ a(String str, float f8, float f9, float f10, float f11, long j8, int i8, boolean z8, AbstractC2633k abstractC2633k) {
            this(str, f8, f9, f10, f11, j8, i8, z8);
        }

        public a(String str, float f8, float f9, float f10, float f11, long j8, int i8, boolean z8) {
            this.f10301a = str;
            this.f10302b = f8;
            this.f10303c = f9;
            this.f10304d = f10;
            this.f10305e = f11;
            this.f10306f = j8;
            this.f10307g = i8;
            this.f10308h = z8;
            ArrayList arrayList = new ArrayList();
            this.f10309i = arrayList;
            C0286a c0286a = new C0286a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f10310j = c0286a;
            e.f(arrayList, c0286a);
        }

        public /* synthetic */ a(String str, float f8, float f9, float f10, float f11, long j8, int i8, boolean z8, int i9, AbstractC2633k abstractC2633k) {
            this((i9 & 1) != 0 ? "" : str, f8, f9, f10, f11, (i9 & 32) != 0 ? C1598l0.f9405b.e() : j8, (i9 & 64) != 0 ? X.f9354a.z() : i8, (i9 & 128) != 0 ? false : z8, (AbstractC2633k) null);
        }

        public /* synthetic */ a(String str, float f8, float f9, float f10, float f11, long j8, int i8, int i9, AbstractC2633k abstractC2633k) {
            this((i9 & 1) != 0 ? "" : str, f8, f9, f10, f11, (i9 & 32) != 0 ? C1598l0.f9405b.e() : j8, (i9 & 64) != 0 ? X.f9354a.z() : i8, (AbstractC2633k) null);
        }

        public a(String str, float f8, float f9, float f10, float f11, long j8, int i8) {
            this(str, f8, f9, f10, f11, j8, i8, false, (AbstractC2633k) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            int i8;
            synchronized (this) {
                i8 = d.f10290l;
                d.f10290l = i8 + 1;
            }
            return i8;
        }

        public b() {
        }
    }

    public /* synthetic */ d(String str, float f8, float f9, float f10, float f11, n nVar, long j8, int i8, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this(str, f8, f9, f10, f11, nVar, j8, i8, z8, i9);
    }

    public final boolean c() {
        return this.f10299i;
    }

    public final float d() {
        return this.f10293c;
    }

    public final float e() {
        return this.f10292b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.c(this.f10291a, dVar.f10291a) && A1.h.t(this.f10292b, dVar.f10292b) && A1.h.t(this.f10293c, dVar.f10293c) && this.f10294d == dVar.f10294d && this.f10295e == dVar.f10295e && t.c(this.f10296f, dVar.f10296f) && C1598l0.q(this.f10297g, dVar.f10297g) && X.E(this.f10298h, dVar.f10298h) && this.f10299i == dVar.f10299i;
    }

    public final int f() {
        return this.f10300j;
    }

    public final String g() {
        return this.f10291a;
    }

    public final n h() {
        return this.f10296f;
    }

    public int hashCode() {
        return (((((((((((((((this.f10291a.hashCode() * 31) + A1.h.u(this.f10292b)) * 31) + A1.h.u(this.f10293c)) * 31) + Float.hashCode(this.f10294d)) * 31) + Float.hashCode(this.f10295e)) * 31) + this.f10296f.hashCode()) * 31) + C1598l0.w(this.f10297g)) * 31) + X.F(this.f10298h)) * 31) + Boolean.hashCode(this.f10299i);
    }

    public final int i() {
        return this.f10298h;
    }

    public final long j() {
        return this.f10297g;
    }

    public final float k() {
        return this.f10295e;
    }

    public final float l() {
        return this.f10294d;
    }

    public d(String str, float f8, float f9, float f10, float f11, n nVar, long j8, int i8, boolean z8, int i9) {
        this.f10291a = str;
        this.f10292b = f8;
        this.f10293c = f9;
        this.f10294d = f10;
        this.f10295e = f11;
        this.f10296f = nVar;
        this.f10297g = j8;
        this.f10298h = i8;
        this.f10299i = z8;
        this.f10300j = i9;
    }

    public /* synthetic */ d(String str, float f8, float f9, float f10, float f11, n nVar, long j8, int i8, boolean z8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(str, f8, f9, f10, f11, nVar, j8, i8, z8, (i10 & 512) != 0 ? f10289k.a() : i9, null);
    }
}
