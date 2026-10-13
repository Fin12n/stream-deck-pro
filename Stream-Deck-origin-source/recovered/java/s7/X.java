package s7;

import C6.C0920i;
import q7.AbstractC2828b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class X extends p7.a implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.c f33229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f33230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2894a f33231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t7.c f33232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f33234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r7.h f33235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2918z f33236h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33237a;

        public a(String str) {
            this.f33237a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33238a;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33238a = iArr;
        }
    }

    public X(r7.c json, e0 mode, AbstractC2894a lexer, o7.f descriptor, a aVar) {
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(mode, "mode");
        kotlin.jvm.internal.t.g(lexer, "lexer");
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        this.f33229a = json;
        this.f33230b = mode;
        this.f33231c = lexer;
        this.f33232d = json.a();
        this.f33233e = -1;
        this.f33234f = aVar;
        r7.h hVarE = json.e();
        this.f33235g = hVarE;
        this.f33236h = hVarE.i() ? null : new C2918z(descriptor);
    }

    @Override // p7.a, p7.e
    public Object A(p116m7.a deserializer) {
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC2828b) && !this.f33229a.e().o()) {
                String strC = U.c(deserializer.getDescriptor(), this.f33229a);
                String strG = this.f33231c.G(strC, this.f33235g.p());
                if (strG == null) {
                    return U.d(this, deserializer);
                }
                try {
                    p116m7.a aVarA = p116m7.f.a((AbstractC2828b) deserializer, this, strG);
                    kotlin.jvm.internal.t.e(aVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f33234f = new a(strC);
                    return aVarA.deserialize(this);
                } catch (p116m7.j e8) {
                    String message = e8.getMessage();
                    kotlin.jvm.internal.t.d(message);
                    String strR0 = Z6.w.r0(Z6.w.R0(message, '\n', null, 2, null), ".");
                    String message2 = e8.getMessage();
                    kotlin.jvm.internal.t.d(message2);
                    AbstractC2894a.x(this.f33231c, strR0, 0, Z6.w.J0(message2, '\n', ""), 2, null);
                    throw new C0920i();
                }
            }
            return deserializer.deserialize(this);
        } catch (p116m7.c e9) {
            String message3 = e9.getMessage();
            kotlin.jvm.internal.t.d(message3);
            if (Z6.w.M(message3, "at path", false, 2, null)) {
                throw e9;
            }
            throw new p116m7.c(e9.a(), e9.getMessage() + " at path: " + this.f33231c.f33250b.a(), e9);
        }
    }

    @Override // p7.a, p7.e
    public byte C() {
        long jM = this.f33231c.m();
        byte b8 = (byte) jM;
        if (jM == b8) {
            return b8;
        }
        AbstractC2894a.x(this.f33231c, "Failed to parse byte for input '" + jM + '\'', 0, null, 6, null);
        throw new C0920i();
    }

    @Override // p7.c
    public int E(o7.f descriptor) {
        int iN;
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        int i8 = b.f33238a[this.f33230b.ordinal()];
        if (i8 != 2) {
            iN = i8 != 4 ? M() : O(descriptor);
        } else {
            iN = N();
        }
        if (this.f33230b != e0.MAP) {
            this.f33231c.f33250b.g(iN);
        }
        return iN;
    }

    @Override // p7.a, p7.e
    public short F() {
        long jM = this.f33231c.m();
        short s8 = (short) jM;
        if (jM == s8) {
            return s8;
        }
        AbstractC2894a.x(this.f33231c, "Failed to parse short for input '" + jM + '\'', 0, null, 6, null);
        throw new C0920i();
    }

    @Override // p7.a, p7.e
    public float G() {
        AbstractC2894a abstractC2894a = this.f33231c;
        String strQ = abstractC2894a.q();
        try {
            float f8 = Float.parseFloat(strQ);
            if (this.f33229a.e().a()) {
                return f8;
            }
            if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
                return f8;
            }
            C.l(this.f33231c, Float.valueOf(f8));
            throw new C0920i();
        } catch (IllegalArgumentException unused) {
            AbstractC2894a.x(abstractC2894a, "Failed to parse type 'float' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C0920i();
        }
    }

    @Override // p7.a, p7.e
    public double H() {
        AbstractC2894a abstractC2894a = this.f33231c;
        String strQ = abstractC2894a.q();
        try {
            double d8 = Double.parseDouble(strQ);
            if (this.f33229a.e().a()) {
                return d8;
            }
            if (!Double.isInfinite(d8) && !Double.isNaN(d8)) {
                return d8;
            }
            C.l(this.f33231c, Double.valueOf(d8));
            throw new C0920i();
        } catch (IllegalArgumentException unused) {
            AbstractC2894a.x(abstractC2894a, "Failed to parse type 'double' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C0920i();
        }
    }

    public final void K() {
        if (this.f33231c.H() != 4) {
            return;
        }
        AbstractC2894a.x(this.f33231c, "Unexpected leading comma", 0, null, 6, null);
        throw new C0920i();
    }

    public final boolean L(o7.f fVar, int i8) {
        String strI;
        r7.c cVar = this.f33229a;
        if (!fVar.j(i8)) {
            return false;
        }
        o7.f fVarI = fVar.i(i8);
        if (!fVarI.c() && this.f33231c.P(true)) {
            return true;
        }
        if (!kotlin.jvm.internal.t.c(fVarI.e(), o7.j.b.f31003a) || ((fVarI.c() && this.f33231c.P(false)) || (strI = this.f33231c.I(this.f33235g.p())) == null || G.h(fVarI, cVar, strI) != -3)) {
            return false;
        }
        this.f33231c.o();
        return true;
    }

    public final int M() {
        boolean zO = this.f33231c.O();
        if (!this.f33231c.e()) {
            if (!zO || this.f33229a.e().c()) {
                return -1;
            }
            C.h(this.f33231c, "array");
            throw new C0920i();
        }
        int i8 = this.f33233e;
        if (i8 != -1 && !zO) {
            AbstractC2894a.x(this.f33231c, "Expected end of the array or comma", 0, null, 6, null);
            throw new C0920i();
        }
        int i9 = i8 + 1;
        this.f33233e = i9;
        return i9;
    }

    public final int N() {
        int i8 = this.f33233e;
        boolean zO = false;
        boolean z8 = i8 % 2 != 0;
        if (!z8) {
            this.f33231c.l(':');
        } else if (i8 != -1) {
            zO = this.f33231c.O();
        }
        if (!this.f33231c.e()) {
            if (!zO || this.f33229a.e().c()) {
                return -1;
            }
            C.i(this.f33231c, null, 1, null);
            throw new C0920i();
        }
        if (z8) {
            if (this.f33233e == -1) {
                AbstractC2894a abstractC2894a = this.f33231c;
                int i9 = abstractC2894a.f33249a;
                if (zO) {
                    AbstractC2894a.x(abstractC2894a, "Unexpected leading comma", i9, null, 4, null);
                    throw new C0920i();
                }
            } else {
                AbstractC2894a abstractC2894a2 = this.f33231c;
                boolean z9 = zO;
                int i10 = abstractC2894a2.f33249a;
                if (!z9) {
                    AbstractC2894a.x(abstractC2894a2, "Expected comma after the key-value pair", i10, null, 4, null);
                    throw new C0920i();
                }
            }
        }
        int i11 = this.f33233e + 1;
        this.f33233e = i11;
        return i11;
    }

    public final int O(o7.f fVar) {
        boolean zO;
        boolean zO2 = this.f33231c.O();
        while (true) {
            boolean z8 = true;
            if (!this.f33231c.e()) {
                if (zO2 && !this.f33229a.e().c()) {
                    C.i(this.f33231c, null, 1, null);
                    throw new C0920i();
                }
                C2918z c2918z = this.f33236h;
                if (c2918z != null) {
                    return c2918z.d();
                }
                return -1;
            }
            String strP = P();
            this.f33231c.l(':');
            int iH = G.h(fVar, this.f33229a, strP);
            if (iH == -3) {
                zO = false;
            } else {
                if (!this.f33235g.f() || !L(fVar, iH)) {
                    C2918z c2918z2 = this.f33236h;
                    if (c2918z2 != null) {
                        c2918z2.c(iH);
                    }
                    return iH;
                }
                zO = this.f33231c.O();
                z8 = false;
            }
            zO2 = z8 ? Q(strP) : zO;
        }
    }

    public final String P() {
        return this.f33235g.p() ? this.f33231c.r() : this.f33231c.i();
    }

    public final boolean Q(String str) {
        if (this.f33235g.j() || S(this.f33234f, str)) {
            this.f33231c.K(this.f33235g.p());
        } else {
            this.f33231c.A(str);
        }
        return this.f33231c.O();
    }

    public final void R(o7.f fVar) {
        while (E(fVar) != -1) {
        }
    }

    public final boolean S(a aVar, String str) {
        if (aVar == null || !kotlin.jvm.internal.t.c(aVar.f33237a, str)) {
            return false;
        }
        aVar.f33237a = null;
        return true;
    }

    @Override // p7.c
    public t7.c a() {
        return this.f33232d;
    }

    @Override // p7.a, p7.e
    public p7.c b(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        e0 e0VarB = f0.b(this.f33229a, descriptor);
        this.f33231c.f33250b.c(descriptor);
        this.f33231c.l(e0VarB.f33279a);
        K();
        int i8 = b.f33238a[e0VarB.ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            return new X(this.f33229a, e0VarB, this.f33231c, descriptor, this.f33234f);
        }
        return (this.f33230b == e0VarB && this.f33229a.e().i()) ? this : new X(this.f33229a, e0VarB, this.f33231c, descriptor, this.f33234f);
    }

    @Override // p7.a, p7.c
    public void c(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        if (this.f33229a.e().j() && descriptor.f() == 0) {
            R(descriptor);
        }
        if (this.f33231c.O() && !this.f33229a.e().c()) {
            C.h(this.f33231c, "");
            throw new C0920i();
        }
        this.f33231c.l(this.f33230b.f33280b);
        this.f33231c.f33250b.b();
    }

    @Override // r7.i
    public final r7.c d() {
        return this.f33229a;
    }

    @Override // p7.a, p7.e
    public boolean i() {
        return this.f33231c.g();
    }

    @Override // p7.a, p7.e
    public char k() {
        String strQ = this.f33231c.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        AbstractC2894a.x(this.f33231c, "Expected single char, but got '" + strQ + '\'', 0, null, 6, null);
        throw new C0920i();
    }

    @Override // r7.i
    public r7.j m() {
        return new T(this.f33229a.e(), this.f33231c).e();
    }

    @Override // p7.a, p7.e
    public int o() {
        long jM = this.f33231c.m();
        int i8 = (int) jM;
        if (jM == i8) {
            return i8;
        }
        AbstractC2894a.x(this.f33231c, "Failed to parse int for input '" + jM + '\'', 0, null, 6, null);
        throw new C0920i();
    }

    @Override // p7.a, p7.e
    public Void q() {
        return null;
    }

    @Override // p7.a, p7.e
    public String s() {
        return this.f33235g.p() ? this.f33231c.r() : this.f33231c.o();
    }

    @Override // p7.a, p7.e
    public long t() {
        return this.f33231c.m();
    }

    @Override // p7.a, p7.c
    public Object u(o7.f descriptor, int i8, p116m7.a deserializer, Object obj) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(deserializer, "deserializer");
        boolean z8 = this.f33230b == e0.MAP && (i8 & 1) == 0;
        if (z8) {
            this.f33231c.f33250b.d();
        }
        Object objU = super.u(descriptor, i8, deserializer, obj);
        if (z8) {
            this.f33231c.f33250b.f(objU);
        }
        return objU;
    }

    @Override // p7.a, p7.e
    public boolean v() {
        C2918z c2918z = this.f33236h;
        return ((c2918z != null ? c2918z.b() : false) || AbstractC2894a.Q(this.f33231c, false, 1, null)) ? false : true;
    }

    @Override // p7.a, p7.e
    public p7.e w(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return Z.b(descriptor) ? new C2916x(this.f33231c, this.f33229a) : super.w(descriptor);
    }

    @Override // p7.a, p7.e
    public int y(o7.f enumDescriptor) {
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        return G.i(enumDescriptor, this.f33229a, s(), " at path " + this.f33231c.f33250b.a());
    }
}
