package q7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: q7.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2874y0 implements o7.f, InterfaceC2852n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f32164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f32167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f32168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f32169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f32170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f32171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C6.j f32172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C6.j f32173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C6.j f32174l;

    /* JADX INFO: renamed from: q7.y0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            C2874y0 c2874y0 = C2874y0.this;
            return Integer.valueOf(AbstractC2876z0.a(c2874y0, c2874y0.p()));
        }
    }

    /* JADX INFO: renamed from: q7.y0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p116m7.b[] invoke() {
            p116m7.b[] bVarArrChildSerializers;
            K k8 = C2874y0.this.f32164b;
            return (k8 == null || (bVarArrChildSerializers = k8.childSerializers()) == null) ? A0.f32001a : bVarArrChildSerializers;
        }
    }

    /* JADX INFO: renamed from: q7.y0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {
        public c() {
            super(1);
        }

        public final CharSequence b(int i8) {
            return C2874y0.this.g(i8) + ": " + C2874y0.this.i(i8).a();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: q7.y0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o7.f[] invoke() {
            ArrayList arrayList;
            p116m7.b[] bVarArrTypeParametersSerializers;
            K k8 = C2874y0.this.f32164b;
            if (k8 == null || (bVarArrTypeParametersSerializers = k8.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
                for (p116m7.b bVar : bVarArrTypeParametersSerializers) {
                    arrayList.add(bVar.getDescriptor());
                }
            }
            return AbstractC2870w0.b(arrayList);
        }
    }

    public C2874y0(String serialName, K k8, int i8) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        this.f32163a = serialName;
        this.f32164b = k8;
        this.f32165c = i8;
        this.f32166d = -1;
        String[] strArr = new String[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f32167e = strArr;
        int i10 = this.f32165c;
        this.f32168f = new List[i10];
        this.f32170h = new boolean[i10];
        this.f32171i = D6.M.g();
        C6.l lVar = C6.l.PUBLICATION;
        this.f32172j = C6.k.a(lVar, new b());
        this.f32173k = C6.k.a(lVar, new d());
        this.f32174l = C6.k.a(lVar, new a());
    }

    public static /* synthetic */ void m(C2874y0 c2874y0, String str, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        c2874y0.l(str, z8);
    }

    private final int q() {
        return ((Number) this.f32174l.getValue()).intValue();
    }

    @Override // o7.f
    public String a() {
        return this.f32163a;
    }

    @Override // q7.InterfaceC2852n
    public Set b() {
        return this.f32171i.keySet();
    }

    @Override // o7.f
    public boolean c() {
        return o7.f.a.c(this);
    }

    @Override // o7.f
    public int d(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        Integer num = (Integer) this.f32171i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // o7.f
    public o7.j e() {
        return o7.k.a.f31004a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2874y0)) {
            return false;
        }
        o7.f fVar = (o7.f) obj;
        if (!kotlin.jvm.internal.t.c(a(), fVar.a()) || !Arrays.equals(p(), ((C2874y0) obj).p()) || f() != fVar.f()) {
            return false;
        }
        int iF = f();
        for (int i8 = 0; i8 < iF; i8++) {
            if (!kotlin.jvm.internal.t.c(i(i8).a(), fVar.i(i8).a()) || !kotlin.jvm.internal.t.c(i(i8).e(), fVar.i(i8).e())) {
                return false;
            }
        }
        return true;
    }

    @Override // o7.f
    public final int f() {
        return this.f32165c;
    }

    @Override // o7.f
    public String g(int i8) {
        return this.f32167e[i8];
    }

    @Override // o7.f
    public List getAnnotations() {
        List list = this.f32169g;
        return list == null ? D6.r.n() : list;
    }

    @Override // o7.f
    public List h(int i8) {
        List list = this.f32168f[i8];
        return list == null ? D6.r.n() : list;
    }

    public int hashCode() {
        return q();
    }

    @Override // o7.f
    public o7.f i(int i8) {
        return o()[i8].getDescriptor();
    }

    @Override // o7.f
    public boolean isInline() {
        return o7.f.a.b(this);
    }

    @Override // o7.f
    public boolean j(int i8) {
        return this.f32170h[i8];
    }

    public final void l(String name, boolean z8) {
        kotlin.jvm.internal.t.g(name, "name");
        String[] strArr = this.f32167e;
        int i8 = this.f32166d + 1;
        this.f32166d = i8;
        strArr[i8] = name;
        this.f32170h[i8] = z8;
        this.f32168f[i8] = null;
        if (i8 == this.f32165c - 1) {
            this.f32171i = n();
        }
    }

    public final Map n() {
        HashMap map = new HashMap();
        int length = this.f32167e.length;
        for (int i8 = 0; i8 < length; i8++) {
            map.put(this.f32167e[i8], Integer.valueOf(i8));
        }
        return map;
    }

    public final p116m7.b[] o() {
        return (p116m7.b[]) this.f32172j.getValue();
    }

    public final o7.f[] p() {
        return (o7.f[]) this.f32173k.getValue();
    }

    public String toString() {
        return D6.z.r0(W6.n.v(0, this.f32165c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ C2874y0(String str, K k8, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(str, (i9 & 2) != 0 ? null : k8, i8);
    }
}
