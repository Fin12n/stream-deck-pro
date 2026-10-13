package H;

import android.util.Range;
import android.util.Size;

/* JADX INFO: renamed from: H.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0991m extends g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f3119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f3120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A.J f3121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range f3123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0984i0 f3124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3125h;

    /* JADX INFO: renamed from: H.m$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends g1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f3126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Size f3127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A.J f3128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f3129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Range f3130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC0984i0 f3131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f3132g;

        @Override // H.g1.a
        public g1 a() {
            String str = "";
            if (this.f3126a == null) {
                str = " resolution";
            }
            if (this.f3127b == null) {
                str = str + " originalConfiguredResolution";
            }
            if (this.f3128c == null) {
                str = str + " dynamicRange";
            }
            if (this.f3129d == null) {
                str = str + " sessionType";
            }
            if (this.f3130e == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f3132g == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C0991m(this.f3126a, this.f3127b, this.f3128c, this.f3129d.intValue(), this.f3130e, this.f3131f, this.f3132g.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // H.g1.a
        public g1.a b(A.J j8) {
            if (j8 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f3128c = j8;
            return this;
        }

        @Override // H.g1.a
        public g1.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f3130e = range;
            return this;
        }

        @Override // H.g1.a
        public g1.a d(InterfaceC0984i0 interfaceC0984i0) {
            this.f3131f = interfaceC0984i0;
            return this;
        }

        @Override // H.g1.a
        public g1.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null originalConfiguredResolution");
            }
            this.f3127b = size;
            return this;
        }

        @Override // H.g1.a
        public g1.a f(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f3126a = size;
            return this;
        }

        @Override // H.g1.a
        public g1.a g(int i8) {
            this.f3129d = Integer.valueOf(i8);
            return this;
        }

        @Override // H.g1.a
        public g1.a h(boolean z8) {
            this.f3132g = Boolean.valueOf(z8);
            return this;
        }

        public b() {
        }

        public b(g1 g1Var) {
            this.f3126a = g1Var.f();
            this.f3127b = g1Var.e();
            this.f3128c = g1Var.b();
            this.f3129d = Integer.valueOf(g1Var.g());
            this.f3130e = g1Var.c();
            this.f3131f = g1Var.d();
            this.f3132g = Boolean.valueOf(g1Var.h());
        }
    }

    @Override // H.g1
    public A.J b() {
        return this.f3121d;
    }

    @Override // H.g1
    public Range c() {
        return this.f3123f;
    }

    @Override // H.g1
    public InterfaceC0984i0 d() {
        return this.f3124g;
    }

    @Override // H.g1
    public Size e() {
        return this.f3120c;
    }

    public boolean equals(Object obj) {
        InterfaceC0984i0 interfaceC0984i0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f3119b.equals(g1Var.f()) && this.f3120c.equals(g1Var.e()) && this.f3121d.equals(g1Var.b()) && this.f3122e == g1Var.g() && this.f3123f.equals(g1Var.c()) && ((interfaceC0984i0 = this.f3124g) != null ? interfaceC0984i0.equals(g1Var.d()) : g1Var.d() == null) && this.f3125h == g1Var.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // H.g1
    public Size f() {
        return this.f3119b;
    }

    @Override // H.g1
    public int g() {
        return this.f3122e;
    }

    @Override // H.g1
    public boolean h() {
        return this.f3125h;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f3119b.hashCode() ^ 1000003) * 1000003) ^ this.f3120c.hashCode()) * 1000003) ^ this.f3121d.hashCode()) * 1000003) ^ this.f3122e) * 1000003) ^ this.f3123f.hashCode()) * 1000003;
        InterfaceC0984i0 interfaceC0984i0 = this.f3124g;
        return ((iHashCode ^ (interfaceC0984i0 == null ? 0 : interfaceC0984i0.hashCode())) * 1000003) ^ (this.f3125h ? 1231 : 1237);
    }

    @Override // H.g1
    public g1.a i() {
        return new b(this);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f3119b + ", originalConfiguredResolution=" + this.f3120c + ", dynamicRange=" + this.f3121d + ", sessionType=" + this.f3122e + ", expectedFrameRateRange=" + this.f3123f + ", implementationOptions=" + this.f3124g + ", zslDisabled=" + this.f3125h + "}";
    }

    public C0991m(Size size, Size size2, A.J j8, int i8, Range range, InterfaceC0984i0 interfaceC0984i0, boolean z8) {
        this.f3119b = size;
        this.f3120c = size2;
        this.f3121d = j8;
        this.f3122e = i8;
        this.f3123f = range;
        this.f3124g = interfaceC0984i0;
        this.f3125h = z8;
    }
}
