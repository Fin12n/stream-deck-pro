package p7;

import M6.eLZq.eGwOBWCdOTaKus;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import p116m7.j;
import p116m7.k;
import q7.C2853n0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements f, d {
    @Override // p7.f
    public void A(int i8) {
        J(Integer.valueOf(i8));
    }

    @Override // p7.d
    public final void B(o7.f descriptor, int i8, char c8) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            p(c8);
        }
    }

    @Override // p7.d
    public final void C(o7.f descriptor, int i8, long j8) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            D(j8);
        }
    }

    @Override // p7.f
    public void D(long j8) {
        J(Long.valueOf(j8));
    }

    @Override // p7.f
    public d E(o7.f fVar, int i8) {
        return f.a.a(this, fVar, i8);
    }

    @Override // p7.f
    public void F(String value) {
        t.g(value, "value");
        J(value);
    }

    @Override // p7.d
    public boolean G(o7.f fVar, int i8) {
        return d.a.a(this, fVar, i8);
    }

    public boolean H(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return true;
    }

    public void I(k kVar, Object obj) {
        f.a.c(this, kVar, obj);
    }

    public void J(Object value) {
        t.g(value, "value");
        throw new j("Non-serializable " + K.b(value.getClass()) + " is not supported by " + K.b(getClass()) + " encoder");
    }

    @Override // p7.f
    public d b(o7.f descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    @Override // p7.d
    public void c(o7.f descriptor) {
        t.g(descriptor, "descriptor");
    }

    @Override // p7.d
    public final void e(o7.f descriptor, int i8, double d8) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            g(d8);
        }
    }

    @Override // p7.f
    public void f() {
        throw new j("'null' is not supported by default");
    }

    @Override // p7.f
    public void g(double d8) {
        J(Double.valueOf(d8));
    }

    @Override // p7.f
    public void h(short s8) {
        J(Short.valueOf(s8));
    }

    @Override // p7.d
    public void i(o7.f descriptor, int i8, k serializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(serializer, "serializer");
        if (H(descriptor, i8)) {
            n(serializer, obj);
        }
    }

    @Override // p7.f
    public void j(byte b8) {
        J(Byte.valueOf(b8));
    }

    @Override // p7.f
    public void k(boolean z8) {
        J(Boolean.valueOf(z8));
    }

    @Override // p7.d
    public final void l(o7.f descriptor, int i8, byte b8) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            j(b8);
        }
    }

    @Override // p7.f
    public void m(float f8) {
        J(Float.valueOf(f8));
    }

    @Override // p7.f
    public void n(k kVar, Object obj) {
        f.a.d(this, kVar, obj);
    }

    @Override // p7.f
    public void o(o7.f enumDescriptor, int i8) {
        t.g(enumDescriptor, "enumDescriptor");
        J(Integer.valueOf(i8));
    }

    @Override // p7.f
    public void p(char c8) {
        J(Character.valueOf(c8));
    }

    @Override // p7.f
    public f r(o7.f descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    @Override // p7.f
    public void s() {
        f.a.b(this);
    }

    @Override // p7.d
    public void t(o7.f descriptor, int i8, k serializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(serializer, "serializer");
        if (H(descriptor, i8)) {
            I(serializer, obj);
        }
    }

    @Override // p7.d
    public final void u(o7.f descriptor, int i8, int i9) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            A(i9);
        }
    }

    @Override // p7.d
    public final void v(o7.f descriptor, int i8, short s8) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            h(s8);
        }
    }

    @Override // p7.d
    public final void w(o7.f descriptor, int i8, boolean z8) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            k(z8);
        }
    }

    @Override // p7.d
    public final f x(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return H(descriptor, i8) ? r(descriptor.i(i8)) : C2853n0.f32126a;
    }

    @Override // p7.d
    public final void z(o7.f descriptor, int i8, float f8) {
        t.g(descriptor, "descriptor");
        if (H(descriptor, i8)) {
            m(f8);
        }
    }

    @Override // p7.d
    public final void q(o7.f fVar, int i8, String value) {
        t.g(fVar, eGwOBWCdOTaKus.qOYcHusjOqrX);
        t.g(value, "value");
        if (H(fVar, i8)) {
            F(value);
        }
    }
}
