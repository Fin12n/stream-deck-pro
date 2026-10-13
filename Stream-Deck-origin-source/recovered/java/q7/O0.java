package q7;

import M6.eLZq.eGwOBWCdOTaKus;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O0 implements p7.e, p7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32046a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32047b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p116m7.a f32049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f32050c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p116m7.a aVar, Object obj) {
            super(0);
            this.f32049b = aVar;
            this.f32050c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            O0 o8 = O0.this;
            p116m7.a aVar = this.f32049b;
            return (aVar.getDescriptor().c() || o8.v()) ? o8.I(aVar, this.f32050c) : o8.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p116m7.a f32052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f32053c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p116m7.a aVar, Object obj) {
            super(0);
            this.f32052b = aVar;
            this.f32053c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return O0.this.I(this.f32052b, this.f32053c);
        }
    }

    @Override // p7.e
    public Object A(p116m7.a aVar) {
        return p7.e.a.a(this, aVar);
    }

    @Override // p7.c
    public final double B(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return M(X(descriptor, i8));
    }

    @Override // p7.e
    public final byte C() {
        return K(Y());
    }

    @Override // p7.c
    public final long D(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return R(X(descriptor, i8));
    }

    @Override // p7.e
    public final short F() {
        return T(Y());
    }

    @Override // p7.e
    public final float G() {
        return O(Y());
    }

    @Override // p7.e
    public final double H() {
        return M(Y());
    }

    public Object I(p116m7.a deserializer, Object obj) {
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        return A(deserializer);
    }

    public boolean J(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objV).booleanValue();
    }

    public byte K(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objV).byteValue();
    }

    public char L(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objV).charValue();
    }

    public double M(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objV).doubleValue();
    }

    public int N(Object obj, o7.f enumDescriptor) {
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objV).intValue();
    }

    public p7.e P(Object obj, o7.f inlineDescriptor) {
        kotlin.jvm.internal.t.g(inlineDescriptor, "inlineDescriptor");
        Z(obj);
        return this;
    }

    public int Q(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objV).intValue();
    }

    public long R(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objV).longValue();
    }

    public boolean S(Object obj) {
        return true;
    }

    public short T(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objV).shortValue();
    }

    public String U(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, "null cannot be cast to non-null type kotlin.String");
        return (String) objV;
    }

    public Object V(Object obj) {
        throw new p116m7.j(kotlin.jvm.internal.K.b(getClass()) + " can't retrieve untyped values");
    }

    public final Object W() {
        return D6.z.u0(this.f32046a);
    }

    public abstract Object X(o7.f fVar, int i8);

    public final Object Y() {
        ArrayList arrayList = this.f32046a;
        Object objRemove = arrayList.remove(D6.r.p(arrayList));
        this.f32047b = true;
        return objRemove;
    }

    public final void Z(Object obj) {
        this.f32046a.add(obj);
    }

    @Override // p7.c
    public t7.c a() {
        return t7.d.a();
    }

    public final Object a0(Object obj, Function0 function0) {
        Z(obj);
        Object objInvoke = function0.invoke();
        if (!this.f32047b) {
            Y();
        }
        this.f32047b = false;
        return objInvoke;
    }

    @Override // p7.e
    public p7.c b(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return this;
    }

    @Override // p7.c
    public void c(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
    }

    @Override // p7.c
    public final boolean e(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return J(X(descriptor, i8));
    }

    @Override // p7.c
    public final String f(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return U(X(descriptor, i8));
    }

    @Override // p7.c
    public final byte g(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return K(X(descriptor, i8));
    }

    @Override // p7.c
    public final char h(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return L(X(descriptor, i8));
    }

    @Override // p7.e
    public final boolean i() {
        return J(Y());
    }

    @Override // p7.c
    public final short j(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return T(X(descriptor, i8));
    }

    @Override // p7.e
    public final char k() {
        return L(Y());
    }

    @Override // p7.c
    public final float l(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return O(X(descriptor, i8));
    }

    @Override // p7.c
    public final int n(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return Q(X(descriptor, i8));
    }

    @Override // p7.e
    public final int o() {
        return Q(Y());
    }

    @Override // p7.c
    public final p7.e p(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return P(X(descriptor, i8), descriptor.i(i8));
    }

    @Override // p7.e
    public final Void q() {
        return null;
    }

    @Override // p7.c
    public int r(o7.f fVar) {
        return p7.c.a.a(this, fVar);
    }

    @Override // p7.e
    public final String s() {
        return U(Y());
    }

    @Override // p7.e
    public final long t() {
        return R(Y());
    }

    @Override // p7.c
    public final Object u(o7.f descriptor, int i8, p116m7.a deserializer, Object obj) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        return a0(X(descriptor, i8), new b(deserializer, obj));
    }

    @Override // p7.e
    public boolean v() {
        Object objW = W();
        if (objW == null) {
            return false;
        }
        return S(objW);
    }

    @Override // p7.e
    public p7.e w(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return P(Y(), descriptor);
    }

    @Override // p7.c
    public boolean x() {
        return p7.c.a.b(this);
    }

    @Override // p7.e
    public final int y(o7.f enumDescriptor) {
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        return N(Y(), enumDescriptor);
    }

    @Override // p7.c
    public final Object z(o7.f descriptor, int i8, p116m7.a deserializer, Object obj) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        return a0(X(descriptor, i8), new a(deserializer, obj));
    }

    public float O(Object obj) {
        Object objV = V(obj);
        kotlin.jvm.internal.t.e(objV, eGwOBWCdOTaKus.aOmYKuhaErmKJFB);
        return ((Float) objV).floatValue();
    }
}
