package p7;

import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import p116m7.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e, c {
    @Override // p7.e
    public Object A(p116m7.a aVar) {
        return e.a.a(this, aVar);
    }

    @Override // p7.c
    public final double B(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return H();
    }

    @Override // p7.e
    public byte C() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objJ).byteValue();
    }

    @Override // p7.c
    public final long D(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return t();
    }

    @Override // p7.e
    public short F() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objJ).shortValue();
    }

    @Override // p7.e
    public float G() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // p7.e
    public double H() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    public Object I(p116m7.a deserializer, Object obj) {
        t.g(deserializer, "deserializer");
        return A(deserializer);
    }

    public Object J() {
        throw new j(K.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // p7.e
    public c b(o7.f descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    @Override // p7.c
    public void c(o7.f descriptor) {
        t.g(descriptor, "descriptor");
    }

    @Override // p7.c
    public final boolean e(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return i();
    }

    @Override // p7.c
    public final String f(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return s();
    }

    @Override // p7.c
    public final byte g(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return C();
    }

    @Override // p7.c
    public final char h(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return k();
    }

    @Override // p7.e
    public boolean i() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // p7.c
    public final short j(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return F();
    }

    @Override // p7.e
    public char k() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // p7.c
    public final float l(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return G();
    }

    @Override // p7.c
    public final int n(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return o();
    }

    @Override // p7.e
    public int o() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // p7.c
    public e p(o7.f descriptor, int i8) {
        t.g(descriptor, "descriptor");
        return w(descriptor.i(i8));
    }

    @Override // p7.e
    public Void q() {
        return null;
    }

    @Override // p7.c
    public int r(o7.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // p7.e
    public String s() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // p7.e
    public long t() {
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objJ).longValue();
    }

    @Override // p7.c
    public Object u(o7.f descriptor, int i8, p116m7.a deserializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    @Override // p7.e
    public boolean v() {
        return true;
    }

    @Override // p7.e
    public e w(o7.f descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    @Override // p7.c
    public boolean x() {
        return c.a.b(this);
    }

    @Override // p7.e
    public int y(o7.f enumDescriptor) {
        t.g(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        t.e(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // p7.c
    public final Object z(o7.f descriptor, int i8, p116m7.a deserializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(deserializer, "deserializer");
        return (deserializer.getDescriptor().c() || v()) ? I(deserializer, obj) : q();
    }
}
