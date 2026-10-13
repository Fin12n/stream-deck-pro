package s7;

import C6.C0920i;
import kotlin.jvm.internal.AbstractC2633k;
import p090k.zI.jULK;
import q7.AbstractC2849l0;

/* JADX INFO: renamed from: s7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2896c extends AbstractC2849l0 implements r7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.c f33256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.j f33257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r7.h f33258e;

    public /* synthetic */ AbstractC2896c(r7.c cVar, r7.j jVar, AbstractC2633k abstractC2633k) {
        this(cVar, jVar);
    }

    @Override // q7.O0, p7.e
    public Object A(p116m7.a deserializer) {
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        return U.d(this, deserializer);
    }

    @Override // q7.O0, p7.c
    public t7.c a() {
        return d().a();
    }

    @Override // q7.O0, p7.e
    public p7.c b(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        r7.j jVarH0 = h0();
        o7.j jVarE = descriptor.e();
        if (kotlin.jvm.internal.t.c(jVarE, o7.k.b.f31005a) ? true : jVarE instanceof o7.d) {
            r7.c cVarD = d();
            if (jVarH0 instanceof r7.d) {
                return new O(cVarD, (r7.d) jVarH0);
            }
            throw C.e(-1, "Expected " + kotlin.jvm.internal.K.b(r7.d.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.K.b(jVarH0.getClass()));
        }
        if (!kotlin.jvm.internal.t.c(jVarE, o7.k.c.f31006a)) {
            r7.c cVarD2 = d();
            if (jVarH0 instanceof r7.w) {
                return new M(cVarD2, (r7.w) jVarH0, null, null, 12, null);
            }
            throw C.e(-1, "Expected " + kotlin.jvm.internal.K.b(r7.w.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.K.b(jVarH0.getClass()));
        }
        r7.c cVarD3 = d();
        o7.f fVarA = f0.a(descriptor.i(0), cVarD3.a());
        o7.j jVarE2 = fVarA.e();
        if ((jVarE2 instanceof o7.e) || kotlin.jvm.internal.t.c(jVarE2, o7.j.b.f31003a)) {
            r7.c cVarD4 = d();
            if (jVarH0 instanceof r7.w) {
                return new Q(cVarD4, (r7.w) jVarH0);
            }
            throw C.e(-1, "Expected " + kotlin.jvm.internal.K.b(r7.w.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.K.b(jVarH0.getClass()));
        }
        if (!cVarD3.e().b()) {
            throw C.d(fVarA);
        }
        r7.c cVarD5 = d();
        if (jVarH0 instanceof r7.d) {
            return new O(cVarD5, (r7.d) jVarH0);
        }
        throw C.e(-1, "Expected " + kotlin.jvm.internal.K.b(r7.d.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.K.b(jVarH0.getClass()));
    }

    @Override // q7.AbstractC2849l0
    public String b0(String parentName, String childName) {
        kotlin.jvm.internal.t.g(parentName, "parentName");
        kotlin.jvm.internal.t.g(childName, "childName");
        return childName;
    }

    @Override // q7.O0, p7.c
    public void c(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
    }

    @Override // r7.i
    public r7.c d() {
        return this.f33256c;
    }

    public final r7.q f0(r7.y yVar, String str) {
        r7.q qVar = yVar instanceof r7.q ? (r7.q) yVar : null;
        if (qVar != null) {
            return qVar;
        }
        throw C.e(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    public abstract r7.j g0(String str);

    public final r7.j h0() {
        r7.j jVarG0;
        String str = (String) W();
        return (str == null || (jVarG0 = g0(str)) == null) ? v0() : jVarG0;
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public byte K(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        try {
            int iL = r7.k.l(u0(tag));
            Byte bValueOf = (-128 > iL || iL > 127) ? null : Byte.valueOf((byte) iL);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            w0("byte");
            throw new C0920i();
        } catch (IllegalArgumentException unused) {
            w0("byte");
            throw new C0920i();
        }
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public char L(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        try {
            return Z6.y.c1(u0(tag).c());
        } catch (IllegalArgumentException unused) {
            w0("char");
            throw new C0920i();
        }
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public double M(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        try {
            double dH = r7.k.h(u0(tag));
            if (d().e().a()) {
                return dH;
            }
            if (Double.isInfinite(dH) || Double.isNaN(dH)) {
                throw C.a(Double.valueOf(dH), tag, h0().toString());
            }
            return dH;
        } catch (IllegalArgumentException unused) {
            w0("double");
            throw new C0920i();
        }
    }

    @Override // r7.i
    public r7.j m() {
        return h0();
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public int N(String tag, o7.f enumDescriptor) {
        kotlin.jvm.internal.t.g(tag, "tag");
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        return G.j(enumDescriptor, d(), u0(tag).c(), null, 4, null);
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public float O(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        try {
            float fJ = r7.k.j(u0(tag));
            if (d().e().a()) {
                return fJ;
            }
            if (Float.isInfinite(fJ) || Float.isNaN(fJ)) {
                throw C.a(Float.valueOf(fJ), tag, h0().toString());
            }
            return fJ;
        } catch (IllegalArgumentException unused) {
            w0("float");
            throw new C0920i();
        }
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public p7.e P(String tag, o7.f inlineDescriptor) {
        kotlin.jvm.internal.t.g(tag, "tag");
        kotlin.jvm.internal.t.g(inlineDescriptor, "inlineDescriptor");
        return Z.b(inlineDescriptor) ? new C2916x(new a0(u0(tag).c()), d()) : super.P(tag, inlineDescriptor);
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public int Q(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        try {
            return r7.k.l(u0(tag));
        } catch (IllegalArgumentException unused) {
            w0("int");
            throw new C0920i();
        }
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public long R(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        try {
            return r7.k.r(u0(tag));
        } catch (IllegalArgumentException unused) {
            w0("long");
            throw new C0920i();
        }
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public boolean S(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        return g0(tag) != r7.u.INSTANCE;
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public short T(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        try {
            int iL = r7.k.l(u0(tag));
            Short shValueOf = (-32768 > iL || iL > 32767) ? null : Short.valueOf((short) iL);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            w0("short");
            throw new C0920i();
        } catch (IllegalArgumentException unused) {
            w0("short");
            throw new C0920i();
        }
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public String U(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        r7.y yVarU0 = u0(tag);
        if (d().e().p() || f0(yVarU0, "string").m()) {
            if (yVarU0 instanceof r7.u) {
                throw C.f(-1, "Unexpected 'null' value instead of string literal", h0().toString());
            }
            return yVarU0.c();
        }
        throw C.f(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", h0().toString());
    }

    public final r7.y u0(String tag) {
        kotlin.jvm.internal.t.g(tag, "tag");
        r7.j jVarG0 = g0(tag);
        r7.y yVar = jVarG0 instanceof r7.y ? (r7.y) jVarG0 : null;
        if (yVar != null) {
            return yVar;
        }
        throw C.f(-1, "Expected JsonPrimitive at " + tag + ", found " + jVarG0, h0().toString());
    }

    @Override // q7.O0, p7.e
    public boolean v() {
        return !(h0() instanceof r7.u);
    }

    public r7.j v0() {
        return this.f33257d;
    }

    @Override // q7.O0, p7.e
    public p7.e w(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return W() != null ? super.w(descriptor) : new I(d(), v0()).w(descriptor);
    }

    public final Void w0(String str) {
        throw C.f(-1, "Failed to parse literal as '" + str + "' value", h0().toString());
    }

    public AbstractC2896c(r7.c cVar, r7.j jVar) {
        this.f33256c = cVar;
        this.f33257d = jVar;
        this.f33258e = d().e();
    }

    @Override // q7.O0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public boolean J(String str) {
        kotlin.jvm.internal.t.g(str, jULK.XqqpdWpjJAYzZ);
        try {
            Boolean boolF = r7.k.f(u0(str));
            if (boolF != null) {
                return boolF.booleanValue();
            }
            w0("boolean");
            throw new C0920i();
        } catch (IllegalArgumentException unused) {
            w0("boolean");
            throw new C0920i();
        }
    }
}
