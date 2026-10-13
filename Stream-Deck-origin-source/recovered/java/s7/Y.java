package s7;

import q7.AbstractC2828b;
import r7.EnumC2877a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y extends p7.b implements r7.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2907n f33239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.c f33240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f33241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.n[] f33242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t7.c f33243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r7.h f33244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33246h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33247a;

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
            f33247a = iArr;
        }
    }

    public Y(C2907n composer, r7.c json, e0 mode, r7.n[] nVarArr) {
        kotlin.jvm.internal.t.g(composer, "composer");
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(mode, "mode");
        this.f33239a = composer;
        this.f33240b = json;
        this.f33241c = mode;
        this.f33242d = nVarArr;
        this.f33243e = d().a();
        this.f33244f = d().e();
        int iOrdinal = mode.ordinal();
        if (nVarArr != null) {
            r7.n nVar = nVarArr[iOrdinal];
            if (nVar == null && nVar == this) {
                return;
            }
            nVarArr[iOrdinal] = this;
        }
    }

    @Override // p7.b, p7.f
    public void A(int i8) {
        if (this.f33245g) {
            F(String.valueOf(i8));
        } else {
            this.f33239a.i(i8);
        }
    }

    @Override // p7.b, p7.f
    public void D(long j8) {
        if (this.f33245g) {
            F(String.valueOf(j8));
        } else {
            this.f33239a.j(j8);
        }
    }

    @Override // p7.b, p7.f
    public void F(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        this.f33239a.n(value);
    }

    @Override // p7.b, p7.d
    public boolean G(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return this.f33244f.h();
    }

    @Override // p7.b
    public boolean H(o7.f descriptor, int i8) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        int i9 = a.f33247a[this.f33241c.ordinal()];
        if (i9 != 1) {
            boolean z8 = false;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (!this.f33239a.a()) {
                        this.f33239a.f(',');
                    }
                    this.f33239a.c();
                    F(G.g(descriptor, d(), i8));
                    this.f33239a.f(':');
                    this.f33239a.p();
                } else {
                    if (i8 == 0) {
                        this.f33245g = true;
                    }
                    if (i8 == 1) {
                        this.f33239a.f(',');
                        this.f33239a.p();
                        this.f33245g = false;
                    }
                }
            } else if (this.f33239a.a()) {
                this.f33245g = true;
                this.f33239a.c();
            } else {
                if (i8 % 2 == 0) {
                    this.f33239a.f(',');
                    this.f33239a.c();
                    z8 = true;
                } else {
                    this.f33239a.f(':');
                    this.f33239a.p();
                }
                this.f33245g = z8;
            }
        } else {
            if (!this.f33239a.a()) {
                this.f33239a.f(',');
            }
            this.f33239a.c();
        }
        return true;
    }

    public final void K(o7.f fVar) {
        this.f33239a.c();
        String str = this.f33246h;
        kotlin.jvm.internal.t.d(str);
        F(str);
        this.f33239a.f(':');
        this.f33239a.p();
        F(fVar.a());
    }

    @Override // p7.f
    public t7.c a() {
        return this.f33243e;
    }

    @Override // p7.b, p7.f
    public p7.d b(o7.f descriptor) {
        r7.n nVar;
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        e0 e0VarB = f0.b(d(), descriptor);
        char c8 = e0VarB.f33279a;
        if (c8 != 0) {
            this.f33239a.f(c8);
            this.f33239a.b();
        }
        if (this.f33246h != null) {
            K(descriptor);
            this.f33246h = null;
        }
        if (this.f33241c == e0VarB) {
            return this;
        }
        r7.n[] nVarArr = this.f33242d;
        return (nVarArr == null || (nVar = nVarArr[e0VarB.ordinal()]) == null) ? new Y(this.f33239a, d(), e0VarB, this.f33242d) : nVar;
    }

    @Override // p7.b, p7.d
    public void c(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        if (this.f33241c.f33280b != 0) {
            this.f33239a.q();
            this.f33239a.d();
            this.f33239a.f(this.f33241c.f33280b);
        }
    }

    @Override // r7.n
    public r7.c d() {
        return this.f33240b;
    }

    @Override // p7.b, p7.f
    public void f() {
        this.f33239a.k("null");
    }

    @Override // p7.b, p7.f
    public void g(double d8) {
        if (this.f33245g) {
            F(String.valueOf(d8));
        } else {
            this.f33239a.g(d8);
        }
        if (this.f33244f.a()) {
            return;
        }
        if (Double.isInfinite(d8) || Double.isNaN(d8)) {
            throw C.b(Double.valueOf(d8), this.f33239a.f33298a.toString());
        }
    }

    @Override // p7.b, p7.f
    public void h(short s8) {
        if (this.f33245g) {
            F(String.valueOf((int) s8));
        } else {
            this.f33239a.l(s8);
        }
    }

    @Override // p7.b, p7.f
    public void j(byte b8) {
        if (this.f33245g) {
            F(String.valueOf((int) b8));
        } else {
            this.f33239a.e(b8);
        }
    }

    @Override // p7.b, p7.f
    public void k(boolean z8) {
        if (this.f33245g) {
            F(String.valueOf(z8));
        } else {
            this.f33239a.m(z8);
        }
    }

    @Override // p7.b, p7.f
    public void m(float f8) {
        if (this.f33245g) {
            F(String.valueOf(f8));
        } else {
            this.f33239a.h(f8);
        }
        if (this.f33244f.a()) {
            return;
        }
        if (Float.isInfinite(f8) || Float.isNaN(f8)) {
            throw C.b(Float.valueOf(f8), this.f33239a.f33298a.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    @Override // p7.b, p7.f
    public void n(p116m7.k serializer, Object obj) {
        String strC;
        kotlin.jvm.internal.t.g(serializer, "serializer");
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
            this.f33246h = strC;
        }
        serializer.serialize(this, obj);
    }

    @Override // p7.b, p7.f
    public void o(o7.f enumDescriptor, int i8) {
        kotlin.jvm.internal.t.g(enumDescriptor, "enumDescriptor");
        F(enumDescriptor.g(i8));
    }

    @Override // p7.b, p7.f
    public void p(char c8) {
        F(String.valueOf(c8));
    }

    @Override // p7.b, p7.f
    public p7.f r(o7.f descriptor) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        if (Z.b(descriptor)) {
            C2907n c2909p = this.f33239a;
            if (!(c2909p instanceof C2909p)) {
                c2909p = new C2909p(c2909p.f33298a, this.f33245g);
            }
            return new Y(c2909p, d(), this.f33241c, (r7.n[]) null);
        }
        if (!Z.a(descriptor)) {
            return super.r(descriptor);
        }
        C2907n c2908o = this.f33239a;
        if (!(c2908o instanceof C2908o)) {
            c2908o = new C2908o(c2908o.f33298a, this.f33245g);
        }
        return new Y(c2908o, d(), this.f33241c, (r7.n[]) null);
    }

    @Override // p7.b, p7.d
    public void t(o7.f descriptor, int i8, p116m7.k serializer, Object obj) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(serializer, "serializer");
        if (obj != null || this.f33244f.i()) {
            super.t(descriptor, i8, serializer, obj);
        }
    }

    @Override // r7.n
    public void y(r7.j element) {
        kotlin.jvm.internal.t.g(element, "element");
        n(r7.l.f32576a, element);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC2914v output, r7.c json, e0 mode, r7.n[] modeReuseCache) {
        this(r.a(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.t.g(output, "output");
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(mode, "mode");
        kotlin.jvm.internal.t.g(modeReuseCache, "modeReuseCache");
    }
}
