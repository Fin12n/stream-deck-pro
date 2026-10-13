package q7;

import com.google.mlkit.common.internal.ckI.WqXA;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class P0 implements p7.f, p7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32055a = new ArrayList();

    private final boolean H(o7.f fVar, int i8) {
        c0(a0(fVar, i8));
        return true;
    }

    @Override // p7.f
    public final void A(int i8) {
        Q(b0(), i8);
    }

    @Override // p7.d
    public final void C(o7.f descriptor, int i8, long j8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        R(a0(descriptor, i8), j8);
    }

    @Override // p7.f
    public final void D(long j8) {
        R(b0(), j8);
    }

    @Override // p7.f
    public p7.d E(o7.f fVar, int i8) {
        return p7.f.a.a(this, fVar, i8);
    }

    @Override // p7.f
    public final void F(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        V(b0(), value);
    }

    @Override // p7.d
    public boolean G(o7.f fVar, int i8) {
        return p7.d.a.a(this, fVar, i8);
    }

    public void I(p116m7.k kVar, Object obj) {
        p7.f.a.c(this, kVar, obj);
    }

    public void J(Object obj, boolean z8) {
        W(obj, Boolean.valueOf(z8));
    }

    public void K(Object obj, byte b8) {
        W(obj, Byte.valueOf(b8));
    }

    public void L(Object obj, char c8) {
        W(obj, Character.valueOf(c8));
    }

    public void M(Object obj, double d8) {
        W(obj, Double.valueOf(d8));
    }

    public void N(Object obj, o7.f enumDescriptor, int i8) {
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        W(obj, Integer.valueOf(i8));
    }

    public void O(Object obj, float f8) {
        W(obj, Float.valueOf(f8));
    }

    public p7.f P(Object obj, o7.f inlineDescriptor) {
        kotlin.jvm.internal.t.g(inlineDescriptor, "inlineDescriptor");
        c0(obj);
        return this;
    }

    public void Q(Object obj, int i8) {
        W(obj, Integer.valueOf(i8));
    }

    public void R(Object obj, long j8) {
        W(obj, Long.valueOf(j8));
    }

    public void S(Object obj) {
    }

    public void T(Object obj) {
        throw new p116m7.j("null is not supported");
    }

    public void U(Object obj, short s8) {
        W(obj, Short.valueOf(s8));
    }

    public void V(Object obj, String value) {
        kotlin.jvm.internal.t.g(value, "value");
        W(obj, value);
    }

    public void W(Object obj, Object value) {
        kotlin.jvm.internal.t.g(value, "value");
        throw new p116m7.j("Non-serializable " + kotlin.jvm.internal.K.b(value.getClass()) + " is not supported by " + kotlin.jvm.internal.K.b(getClass()) + " encoder");
    }

    public void X(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
    }

    public final Object Y() {
        return D6.z.t0(this.f32055a);
    }

    public final Object Z() {
        return D6.z.u0(this.f32055a);
    }

    @Override // p7.f
    public t7.c a() {
        return t7.d.a();
    }

    public abstract Object a0(o7.f fVar, int i8);

    @Override // p7.f
    public p7.d b(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return this;
    }

    public final Object b0() {
        if (this.f32055a.isEmpty()) {
            throw new p116m7.j("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f32055a;
        return arrayList.remove(D6.r.p(arrayList));
    }

    @Override // p7.d
    public final void c(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        if (!this.f32055a.isEmpty()) {
            b0();
        }
        X(descriptor);
    }

    public final void c0(Object obj) {
        this.f32055a.add(obj);
    }

    @Override // p7.d
    public final void e(o7.f descriptor, int i8, double d8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        M(a0(descriptor, i8), d8);
    }

    @Override // p7.f
    public void f() {
        T(b0());
    }

    @Override // p7.f
    public final void g(double d8) {
        M(b0(), d8);
    }

    @Override // p7.f
    public final void h(short s8) {
        U(b0(), s8);
    }

    @Override // p7.d
    public void i(o7.f descriptor, int i8, p116m7.k serializer, Object obj) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(serializer, "serializer");
        if (H(descriptor, i8)) {
            n(serializer, obj);
        }
    }

    @Override // p7.f
    public final void j(byte b8) {
        K(b0(), b8);
    }

    @Override // p7.f
    public final void k(boolean z8) {
        J(b0(), z8);
    }

    @Override // p7.d
    public final void l(o7.f descriptor, int i8, byte b8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        K(a0(descriptor, i8), b8);
    }

    @Override // p7.f
    public final void m(float f8) {
        O(b0(), f8);
    }

    @Override // p7.f
    public void n(p116m7.k kVar, Object obj) {
        p7.f.a.d(this, kVar, obj);
    }

    @Override // p7.f
    public final void o(o7.f enumDescriptor, int i8) {
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        N(b0(), enumDescriptor, i8);
    }

    @Override // p7.f
    public final void p(char c8) {
        L(b0(), c8);
    }

    @Override // p7.d
    public final void q(o7.f descriptor, int i8, String value) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(value, "value");
        V(a0(descriptor, i8), value);
    }

    @Override // p7.f
    public p7.f r(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return P(b0(), descriptor);
    }

    @Override // p7.f
    public void s() {
        S(Y());
    }

    @Override // p7.d
    public void t(o7.f descriptor, int i8, p116m7.k serializer, Object obj) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(serializer, "serializer");
        if (H(descriptor, i8)) {
            I(serializer, obj);
        }
    }

    @Override // p7.d
    public final void u(o7.f descriptor, int i8, int i9) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        Q(a0(descriptor, i8), i9);
    }

    @Override // p7.d
    public final void v(o7.f descriptor, int i8, short s8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        U(a0(descriptor, i8), s8);
    }

    @Override // p7.d
    public final void w(o7.f descriptor, int i8, boolean z8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        J(a0(descriptor, i8), z8);
    }

    @Override // p7.d
    public final p7.f x(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return P(a0(descriptor, i8), descriptor.i(i8));
    }

    @Override // p7.d
    public final void z(o7.f descriptor, int i8, float f8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        O(a0(descriptor, i8), f8);
    }

    @Override // p7.d
    public final void B(o7.f fVar, int i8, char c8) {
        kotlin.jvm.internal.t.g(fVar, WqXA.iUmNPKmBcuy);
        L(a0(fVar, i8), c8);
    }
}
