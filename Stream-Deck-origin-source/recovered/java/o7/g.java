package o7;

import C6.v;
import D6.C0934n;
import D6.C0938s;
import D6.F;
import D6.M;
import D6.z;
import W6.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import q7.AbstractC2870w0;
import q7.AbstractC2876z0;
import q7.InterfaceC2852n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements f, InterfaceC2852n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f30981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f30983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f30984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f30985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f[] f30986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f30987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f30988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f30989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f[] f30990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C6.j f30991l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(AbstractC2876z0.a(gVar, gVar.f30990k));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {
        public b() {
            super(1);
        }

        public final CharSequence b(int i8) {
            return g.this.g(i8) + ": " + g.this.i(i8).a();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    public g(String serialName, j kind, int i8, List<? extends f> typeParameters, o7.a builder) {
        t.g(serialName, "serialName");
        t.g(kind, "kind");
        t.g(typeParameters, "typeParameters");
        t.g(builder, "builder");
        this.f30980a = serialName;
        this.f30981b = kind;
        this.f30982c = i8;
        this.f30983d = builder.c();
        this.f30984e = z.P0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f30985f = strArr;
        this.f30986g = AbstractC2870w0.b(builder.e());
        this.f30987h = (List[]) builder.d().toArray(new List[0]);
        this.f30988i = z.L0(builder.g());
        Iterable<F> iterableV0 = C0934n.v0(strArr);
        ArrayList arrayList = new ArrayList(C0938s.y(iterableV0, 10));
        for (F f8 : iterableV0) {
            arrayList.add(v.a(f8.b(), Integer.valueOf(f8.a())));
        }
        this.f30989j = M.t(arrayList);
        this.f30990k = AbstractC2870w0.b(typeParameters);
        this.f30991l = C6.k.b(new a());
    }

    @Override // o7.f
    public String a() {
        return this.f30980a;
    }

    @Override // q7.InterfaceC2852n
    public Set b() {
        return this.f30984e;
    }

    @Override // o7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // o7.f
    public int d(String name) {
        t.g(name, "name");
        Integer num = (Integer) this.f30989j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // o7.f
    public j e() {
        return this.f30981b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        f fVar = (f) obj;
        if (!t.c(a(), fVar.a()) || !Arrays.equals(this.f30990k, ((g) obj).f30990k) || f() != fVar.f()) {
            return false;
        }
        int iF = f();
        for (int i8 = 0; i8 < iF; i8++) {
            if (!t.c(i(i8).a(), fVar.i(i8).a()) || !t.c(i(i8).e(), fVar.i(i8).e())) {
                return false;
            }
        }
        return true;
    }

    @Override // o7.f
    public int f() {
        return this.f30982c;
    }

    @Override // o7.f
    public String g(int i8) {
        return this.f30985f[i8];
    }

    @Override // o7.f
    public List getAnnotations() {
        return this.f30983d;
    }

    @Override // o7.f
    public List h(int i8) {
        return this.f30987h[i8];
    }

    public int hashCode() {
        return l();
    }

    @Override // o7.f
    public f i(int i8) {
        return this.f30986g[i8];
    }

    @Override // o7.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // o7.f
    public boolean j(int i8) {
        return this.f30988i[i8];
    }

    public final int l() {
        return ((Number) this.f30991l.getValue()).intValue();
    }

    public String toString() {
        return z.r0(n.v(0, f()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
