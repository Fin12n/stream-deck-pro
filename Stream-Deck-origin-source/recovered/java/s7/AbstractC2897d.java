package s7;

import kotlin.jvm.internal.AbstractC2633k;
import q7.AbstractC2828b;
import q7.AbstractC2851m0;
import r7.EnumC2877a;

/* JADX INFO: renamed from: s7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2897d extends AbstractC2851m0 implements r7.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.c f33259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q6.k f33260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.h f33261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33262e;

    /* JADX INFO: renamed from: s7.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {
        public a() {
            super(1);
        }

        public final void b(r7.j node) {
            kotlin.jvm.internal.t.g(node, "node");
            AbstractC2897d abstractC2897d = AbstractC2897d.this;
            abstractC2897d.z0(AbstractC2897d.h0(abstractC2897d), node);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((r7.j) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: s7.d$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends p7.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o7.f f33266c;

        public b(String str, o7.f fVar) {
            this.f33265b = str;
            this.f33266c = fVar;
        }

        @Override // p7.b, p7.f
        public void F(String value) {
            kotlin.jvm.internal.t.g(value, "value");
            AbstractC2897d.this.z0(this.f33265b, new r7.q(value, false, this.f33266c));
        }

        @Override // p7.f
        public t7.c a() {
            return AbstractC2897d.this.d().a();
        }
    }

    /* JADX INFO: renamed from: s7.d$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends p7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t7.c f33267a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33269c;

        public c(String str) {
            this.f33269c = str;
            this.f33267a = AbstractC2897d.this.d().a();
        }

        @Override // p7.b, p7.f
        public void A(int i8) {
            K(Integer.toUnsignedString(C6.y.b(i8)));
        }

        @Override // p7.b, p7.f
        public void D(long j8) {
            K(Long.toUnsignedString(C6.A.b(j8)));
        }

        public final void K(String s8) {
            kotlin.jvm.internal.t.g(s8, "s");
            AbstractC2897d.this.z0(this.f33269c, new r7.q(s8, false, null, 4, null));
        }

        @Override // p7.f
        public t7.c a() {
            return this.f33267a;
        }

        @Override // p7.b, p7.f
        public void h(short s8) {
            K(C6.D.e(C6.D.b(s8)));
        }

        @Override // p7.b, p7.f
        public void j(byte b8) {
            K(C6.w.j(C6.w.b(b8)));
        }
    }

    public /* synthetic */ AbstractC2897d(r7.c cVar, Q6.k kVar, AbstractC2633k abstractC2633k) {
        this(cVar, kVar);
    }

    public static final /* synthetic */ String h0(AbstractC2897d abstractC2897d) {
        return (String) abstractC2897d.Y();
    }

    @Override // q7.P0, p7.d
    public boolean G(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return this.f33261d.h();
    }

    @Override // q7.P0
    public void X(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        this.f33260c.invoke(v0());
    }

    @Override // q7.P0, p7.f
    public final t7.c a() {
        return this.f33259b.a();
    }

    @Override // q7.P0, p7.f
    public p7.d b(o7.f descriptor) {
        AbstractC2897d n8;
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        Q6.k aVar = Z() == null ? this.f33260c : new a();
        o7.j jVarE = descriptor.e();
        if (kotlin.jvm.internal.t.c(jVarE, o7.k.b.f31005a) ? true : jVarE instanceof o7.d) {
            n8 = new P(this.f33259b, aVar);
        } else if (kotlin.jvm.internal.t.c(jVarE, o7.k.c.f31006a)) {
            r7.c cVar = this.f33259b;
            o7.f fVarA = f0.a(descriptor.i(0), cVar.a());
            o7.j jVarE2 = fVarA.e();
            if ((jVarE2 instanceof o7.e) || kotlin.jvm.internal.t.c(jVarE2, o7.j.b.f31003a)) {
                n8 = new S(this.f33259b, aVar);
            } else {
                if (!cVar.e().b()) {
                    throw C.d(fVarA);
                }
                n8 = new P(this.f33259b, aVar);
            }
        } else {
            n8 = new N(this.f33259b, aVar);
        }
        String str = this.f33262e;
        if (str != null) {
            kotlin.jvm.internal.t.d(str);
            n8.z0(str, r7.k.c(descriptor.a()));
            this.f33262e = null;
        }
        return n8;
    }

    @Override // r7.n
    public final r7.c d() {
        return this.f33259b;
    }

    @Override // q7.AbstractC2851m0
    public String d0(String parentName, String childName) {
        kotlin.jvm.internal.t.g(parentName, "parentName");
        kotlin.jvm.internal.t.g(childName, "childName");
        return childName;
    }

    @Override // q7.AbstractC2851m0
    public String e0(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return G.g(descriptor, this.f33259b, i8);
    }

    @Override // q7.P0, p7.f
    public void f() {
        String str = (String) Z();
        if (str == null) {
            this.f33260c.invoke(r7.u.INSTANCE);
        } else {
            T(str);
        }
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void J(String tag, boolean z8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.a(Boolean.valueOf(z8)));
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void K(String tag, byte b8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.b(Byte.valueOf(b8)));
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void L(String tag, char c8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.c(String.valueOf(c8)));
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void M(String tag, double d8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.b(Double.valueOf(d8)));
        if (this.f33261d.a()) {
            return;
        }
        if (Double.isInfinite(d8) || Double.isNaN(d8)) {
            throw C.c(Double.valueOf(d8), tag, v0().toString());
        }
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void N(String tag, o7.f enumDescriptor, int i8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        z0(tag, r7.k.c(enumDescriptor.g(i8)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    @Override // q7.P0, p7.f
    public void n(p116m7.k serializer, Object obj) {
        String strC;
        kotlin.jvm.internal.t.g(serializer, "serializer");
        if (Z() == null && d0.b(f0.a(serializer.getDescriptor(), a()))) {
            new J(this.f33259b, this.f33260c).n(serializer, obj);
            return;
        }
        if (d().e().o()) {
            serializer.serialize(this, obj);
            return;
        }
        boolean z8 = serializer instanceof AbstractC2828b;
        if (!z8) {
            int i8 = U.a.f33222a[d().e().e().ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 != 3) {
                    throw new C6.m();
                }
                o7.j jVarE = serializer.getDescriptor().e();
                strC = (kotlin.jvm.internal.t.c(jVarE, o7.k.a.f31004a) || kotlin.jvm.internal.t.c(jVarE, o7.k.d.f31007a)) ? U.c(serializer.getDescriptor(), d()) : null;
            }
        } else if (d().e().e() != EnumC2877a.NONE) {
        }
        if (z8) {
            AbstractC2828b abstractC2828b = (AbstractC2828b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + serializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            p116m7.k kVarB = p116m7.f.b(abstractC2828b, this, obj);
            if (strC != null) {
                U.e(serializer, kVarB, strC);
            }
            U.b(kVarB.getDescriptor().e());
            kotlin.jvm.internal.t.e(kVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = kVarB;
        }
        if (strC != null) {
            this.f33262e = strC;
        }
        serializer.serialize(this, obj);
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void O(String tag, float f8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.b(Float.valueOf(f8)));
        if (this.f33261d.a()) {
            return;
        }
        if (Float.isInfinite(f8) || Float.isNaN(f8)) {
            throw C.c(Float.valueOf(f8), tag, v0().toString());
        }
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public p7.f P(String tag, o7.f inlineDescriptor) {
        kotlin.jvm.internal.t.g(tag, "tag");
        kotlin.jvm.internal.t.g(inlineDescriptor, "inlineDescriptor");
        if (Z.b(inlineDescriptor)) {
            return y0(tag);
        }
        return Z.a(inlineDescriptor) ? x0(tag, inlineDescriptor) : super.P(tag, inlineDescriptor);
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void Q(String tag, int i8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.b(Integer.valueOf(i8)));
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void R(String tag, long j8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.b(Long.valueOf(j8)));
    }

    @Override // q7.P0, p7.f
    public p7.f r(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return Z() != null ? super.r(descriptor) : new J(this.f33259b, this.f33260c).r(descriptor);
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void T(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.u.INSTANCE);
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void U(String tag, short s8) {
        kotlin.jvm.internal.t.g(tag, "tag");
        z0(tag, r7.k.b(Short.valueOf(s8)));
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void V(String tag, String value) {
        kotlin.jvm.internal.t.g(tag, "tag");
        kotlin.jvm.internal.t.g(value, "value");
        z0(tag, r7.k.c(value));
    }

    @Override // q7.P0
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void W(String tag, Object value) {
        kotlin.jvm.internal.t.g(tag, "tag");
        kotlin.jvm.internal.t.g(value, "value");
        z0(tag, r7.k.c(value.toString()));
    }

    public abstract r7.j v0();

    public final Q6.k w0() {
        return this.f33260c;
    }

    public final b x0(String str, o7.f fVar) {
        return new b(str, fVar);
    }

    @Override // r7.n
    public void y(r7.j element) {
        kotlin.jvm.internal.t.g(element, "element");
        n(r7.l.f32576a, element);
    }

    public final c y0(String str) {
        return new c(str);
    }

    public abstract void z0(String str, r7.j jVar);

    public AbstractC2897d(r7.c cVar, Q6.k kVar) {
        this.f33259b = cVar;
        this.f33260c = kVar;
        this.f33261d = cVar.e();
    }

    @Override // q7.P0, p7.f
    public void s() {
    }
}
