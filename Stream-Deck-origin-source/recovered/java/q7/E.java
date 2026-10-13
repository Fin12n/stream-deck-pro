package q7;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E extends C2874y0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o7.j f32014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C6.j f32015n;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f32018c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, String str, E e8) {
            super(0);
            this.f32016a = i8;
            this.f32017b = str;
            this.f32018c = e8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o7.f[] invoke() {
            int i8 = this.f32016a;
            o7.f[] fVarArr = new o7.f[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                fVarArr[i9] = o7.i.e(this.f32017b + com.amazon.a.a.o.c.a.b.f16789a + this.f32018c.g(i9), o7.k.d.f31007a, new o7.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String name, int i8) {
        super(name, null, i8, 2, null);
        kotlin.jvm.internal.t.g(name, "name");
        this.f32014m = o7.j.b.f31003a;
        this.f32015n = C6.k.b(new a(i8, name, this));
    }

    @Override // q7.C2874y0, o7.f
    public o7.j e() {
        return this.f32014m;
    }

    @Override // q7.C2874y0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o7.f)) {
            return false;
        }
        o7.f fVar = (o7.f) obj;
        return fVar.e() == o7.j.b.f31003a && kotlin.jvm.internal.t.c(a(), fVar.a()) && kotlin.jvm.internal.t.c(AbstractC2870w0.a(this), AbstractC2870w0.a(fVar));
    }

    @Override // q7.C2874y0
    public int hashCode() {
        int iHashCode = a().hashCode();
        int iHashCode2 = 1;
        for (String str : o7.h.b(this)) {
            int i8 = iHashCode2 * 31;
            iHashCode2 = i8 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // q7.C2874y0, o7.f
    public o7.f i(int i8) {
        return r()[i8];
    }

    public final o7.f[] r() {
        return (o7.f[]) this.f32015n.getValue();
    }

    @Override // q7.C2874y0
    public String toString() {
        return D6.z.r0(o7.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
