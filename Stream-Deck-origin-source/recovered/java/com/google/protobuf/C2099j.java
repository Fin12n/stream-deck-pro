package com.google.protobuf;

import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.List;
import java.util.Map;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2099j implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2098i f19334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19337d = 0;

    /* JADX INFO: renamed from: com.google.protobuf.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19338a;

        static {
            int[] iArr = new int[C0.b.values().length];
            f19338a = iArr;
            try {
                iArr[C0.b.f19074j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19338a[C0.b.f19078n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19338a[C0.b.f19067c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19338a[C0.b.f19080p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19338a[C0.b.f19073i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19338a[C0.b.f19072h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19338a[C0.b.f19068d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19338a[C0.b.f19071g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19338a[C0.b.f19069e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19338a[C0.b.f19077m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19338a[C0.b.f19081q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19338a[C0.b.f19082r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19338a[C0.b.f19083s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19338a[C0.b.f19084t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19338a[C0.b.f19075k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19338a[C0.b.f19079o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19338a[C0.b.f19070f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C2099j(AbstractC2098i abstractC2098i) {
        AbstractC2098i abstractC2098i2 = (AbstractC2098i) A.b(abstractC2098i, "input");
        this.f19334a = abstractC2098i2;
        abstractC2098i2.f19301d = this;
    }

    public static C2099j Q(AbstractC2098i abstractC2098i) {
        C2099j c2099j = abstractC2098i.f19301d;
        return c2099j != null ? c2099j : new C2099j(abstractC2098i);
    }

    @Override // com.google.protobuf.m0
    public Object A(Class cls, C2106q c2106q) throws B.a {
        Y(3);
        return U(j0.a().c(cls), c2106q);
    }

    @Override // com.google.protobuf.m0
    public int B() {
        int i8 = this.f19337d;
        if (i8 != 0) {
            this.f19335b = i8;
            this.f19337d = 0;
        } else {
            this.f19335b = this.f19334a.J();
        }
        int i9 = this.f19335b;
        if (i9 == 0 || i9 == this.f19336c) {
            return Integer.MAX_VALUE;
        }
        return C0.a(i9);
    }

    @Override // com.google.protobuf.m0
    public void C(List list) throws B.a {
        W(list, false);
    }

    @Override // com.google.protobuf.m0
    public void D(Object obj, n0 n0Var, C2106q c2106q) throws B {
        Y(2);
        S(obj, n0Var, c2106q);
    }

    @Override // com.google.protobuf.m0
    public void E(Map map, L.a aVar, C2106q c2106q) throws B.a {
        Y(2);
        int iP = this.f19334a.p(this.f19334a.K());
        Object objT = aVar.f19209b;
        Object objT2 = aVar.f19211d;
        while (true) {
            try {
                int iB = B();
                if (iB == Integer.MAX_VALUE || this.f19334a.g()) {
                    break;
                }
                String str = BpgIURjN.sZw;
                if (iB == 1) {
                    objT = T(aVar.f19208a, null, null);
                } else if (iB != 2) {
                    try {
                        if (!J()) {
                            throw new B(str);
                        }
                    } catch (B.a unused) {
                        if (!J()) {
                            throw new B(str);
                        }
                    }
                } else {
                    objT2 = T(aVar.f19210c, aVar.f19211d.getClass(), c2106q);
                }
            } catch (Throwable th) {
                this.f19334a.o(iP);
                throw th;
            }
        }
        map.put(objT, objT2);
        this.f19334a.o(iP);
    }

    @Override // com.google.protobuf.m0
    public void F(List list) throws B.a {
        W(list, true);
    }

    @Override // com.google.protobuf.m0
    public AbstractC2097h G() throws B.a {
        Y(2);
        return this.f19334a.r();
    }

    @Override // com.google.protobuf.m0
    public void H(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2112x)) {
            int iB = C0.b(this.f19335b);
            if (iB == 2) {
                int iK = this.f19334a.K();
                Z(iK);
                int iF = this.f19334a.f() + iK;
                do {
                    list.add(Float.valueOf(this.f19334a.w()));
                } while (this.f19334a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw B.e();
            }
            do {
                list.add(Float.valueOf(this.f19334a.w()));
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ = this.f19334a.J();
                }
            } while (iJ == this.f19335b);
            this.f19337d = iJ;
            return;
        }
        C2112x c2112x = (C2112x) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 2) {
            int iK2 = this.f19334a.K();
            Z(iK2);
            int iF2 = this.f19334a.f() + iK2;
            do {
                c2112x.s(this.f19334a.w());
            } while (this.f19334a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw B.e();
        }
        do {
            c2112x.s(this.f19334a.w());
            if (this.f19334a.g()) {
                return;
            } else {
                iJ2 = this.f19334a.J();
            }
        } while (iJ2 == this.f19335b);
        this.f19337d = iJ2;
    }

    @Override // com.google.protobuf.m0
    public int I() throws B.a {
        Y(0);
        return this.f19334a.y();
    }

    @Override // com.google.protobuf.m0
    public boolean J() {
        int i8;
        if (this.f19334a.g() || (i8 = this.f19335b) == this.f19336c) {
            return false;
        }
        return this.f19334a.M(i8);
    }

    @Override // com.google.protobuf.m0
    public int K() throws B.a {
        Y(5);
        return this.f19334a.D();
    }

    @Override // com.google.protobuf.m0
    public void L(List list) throws B.a {
        int iJ;
        if (C0.b(this.f19335b) != 2) {
            throw B.e();
        }
        do {
            list.add(G());
            if (this.f19334a.g()) {
                return;
            } else {
                iJ = this.f19334a.J();
            }
        } while (iJ == this.f19335b);
        this.f19337d = iJ;
    }

    @Override // com.google.protobuf.m0
    public void M(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2102m)) {
            int iB = C0.b(this.f19335b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f19334a.s()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iK = this.f19334a.K();
            a0(iK);
            int iF = this.f19334a.f() + iK;
            do {
                list.add(Double.valueOf(this.f19334a.s()));
            } while (this.f19334a.f() < iF);
            return;
        }
        C2102m c2102m = (C2102m) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 1) {
            do {
                c2102m.s(this.f19334a.s());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iK2 = this.f19334a.K();
        a0(iK2);
        int iF2 = this.f19334a.f() + iK2;
        do {
            c2102m.s(this.f19334a.s());
        } while (this.f19334a.f() < iF2);
    }

    @Override // com.google.protobuf.m0
    public long N() throws B.a {
        Y(0);
        return this.f19334a.z();
    }

    @Override // com.google.protobuf.m0
    public String O() throws B.a {
        Y(2);
        return this.f19334a.I();
    }

    @Override // com.google.protobuf.m0
    public void P(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof J)) {
            int iB = C0.b(this.f19335b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f19334a.v()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iK = this.f19334a.K();
            a0(iK);
            int iF = this.f19334a.f() + iK;
            do {
                list.add(Long.valueOf(this.f19334a.v()));
            } while (this.f19334a.f() < iF);
            return;
        }
        J j8 = (J) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 1) {
            do {
                j8.t(this.f19334a.v());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iK2 = this.f19334a.K();
        a0(iK2);
        int iF2 = this.f19334a.f() + iK2;
        do {
            j8.t(this.f19334a.v());
        } while (this.f19334a.f() < iF2);
    }

    public final void R(Object obj, n0 n0Var, C2106q c2106q) {
        int i8 = this.f19336c;
        this.f19336c = C0.c(C0.a(this.f19335b), 4);
        try {
            n0Var.e(obj, this, c2106q);
            if (this.f19335b != this.f19336c) {
                throw B.h();
            }
            this.f19336c = i8;
        } catch (Throwable th) {
            this.f19336c = i8;
            throw th;
        }
    }

    public final void S(Object obj, n0 n0Var, C2106q c2106q) throws B {
        int iK = this.f19334a.K();
        AbstractC2098i abstractC2098i = this.f19334a;
        if (abstractC2098i.f19298a >= abstractC2098i.f19299b) {
            throw B.i();
        }
        int iP = abstractC2098i.p(iK);
        this.f19334a.f19298a++;
        n0Var.e(obj, this, c2106q);
        this.f19334a.a(0);
        AbstractC2098i abstractC2098i2 = this.f19334a;
        abstractC2098i2.f19298a--;
        abstractC2098i2.o(iP);
    }

    public final Object T(C0.b bVar, Class cls, C2106q c2106q) {
        switch (a.f19338a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(k());
            case 2:
                return G();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(t());
            case 5:
                return Integer.valueOf(j());
            case 6:
                return Long.valueOf(c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(I());
            case 9:
                return Long.valueOf(N());
            case 10:
                return h(cls, c2106q);
            case 11:
                return Integer.valueOf(K());
            case 12:
                return Long.valueOf(m());
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(w());
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return Long.valueOf(x());
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return O();
            case 16:
                return Integer.valueOf(o());
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return Long.valueOf(b());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object U(n0 n0Var, C2106q c2106q) {
        Object objI = n0Var.i();
        R(objI, n0Var, c2106q);
        n0Var.c(objI);
        return objI;
    }

    public final Object V(n0 n0Var, C2106q c2106q) throws B {
        Object objI = n0Var.i();
        S(objI, n0Var, c2106q);
        n0Var.c(objI);
        return objI;
    }

    public void W(List list, boolean z8) throws B.a {
        int iJ;
        int iJ2;
        if (C0.b(this.f19335b) != 2) {
            throw B.e();
        }
        if (!(list instanceof H) || z8) {
            do {
                list.add(z8 ? O() : z());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ = this.f19334a.J();
                }
            } while (iJ == this.f19335b);
            this.f19337d = iJ;
            return;
        }
        H h8 = (H) list;
        do {
            h8.k(G());
            if (this.f19334a.g()) {
                return;
            } else {
                iJ2 = this.f19334a.J();
            }
        } while (iJ2 == this.f19335b);
        this.f19337d = iJ2;
    }

    public final void X(int i8) throws B {
        if (this.f19334a.f() != i8) {
            throw B.n();
        }
    }

    public final void Y(int i8) throws B.a {
        if (C0.b(this.f19335b) != i8) {
            throw B.e();
        }
    }

    public final void Z(int i8) throws B {
        if ((i8 & 3) != 0) {
            throw B.h();
        }
    }

    @Override // com.google.protobuf.m0
    public void a(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2114z)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19334a.F()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Integer.valueOf(this.f19334a.F()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        C2114z c2114z = (C2114z) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                c2114z.l(this.f19334a.F());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            c2114z.l(this.f19334a.F());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    public final void a0(int i8) throws B {
        if ((i8 & 7) != 0) {
            throw B.h();
        }
    }

    @Override // com.google.protobuf.m0
    public long b() throws B.a {
        Y(0);
        return this.f19334a.L();
    }

    @Override // com.google.protobuf.m0
    public long c() throws B.a {
        Y(1);
        return this.f19334a.v();
    }

    @Override // com.google.protobuf.m0
    public void d(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2114z)) {
            int iB = C0.b(this.f19335b);
            if (iB == 2) {
                int iK = this.f19334a.K();
                Z(iK);
                int iF = this.f19334a.f() + iK;
                do {
                    list.add(Integer.valueOf(this.f19334a.D()));
                } while (this.f19334a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw B.e();
            }
            do {
                list.add(Integer.valueOf(this.f19334a.D()));
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ = this.f19334a.J();
                }
            } while (iJ == this.f19335b);
            this.f19337d = iJ;
            return;
        }
        C2114z c2114z = (C2114z) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 2) {
            int iK2 = this.f19334a.K();
            Z(iK2);
            int iF2 = this.f19334a.f() + iK2;
            do {
                c2114z.l(this.f19334a.D());
            } while (this.f19334a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw B.e();
        }
        do {
            c2114z.l(this.f19334a.D());
            if (this.f19334a.g()) {
                return;
            } else {
                iJ2 = this.f19334a.J();
            }
        } while (iJ2 == this.f19335b);
        this.f19337d = iJ2;
    }

    @Override // com.google.protobuf.m0
    public void e(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof J)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f19334a.G()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Long.valueOf(this.f19334a.G()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        J j8 = (J) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                j8.t(this.f19334a.G());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            j8.t(this.f19334a.G());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    @Override // com.google.protobuf.m0
    public void f(List list, n0 n0Var, C2106q c2106q) throws B.a {
        int iJ;
        if (C0.b(this.f19335b) != 3) {
            throw B.e();
        }
        int i8 = this.f19335b;
        do {
            list.add(U(n0Var, c2106q));
            if (this.f19334a.g() || this.f19337d != 0) {
                return;
            } else {
                iJ = this.f19334a.J();
            }
        } while (iJ == i8);
        this.f19337d = iJ;
    }

    @Override // com.google.protobuf.m0
    public void g(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2114z)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19334a.K()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Integer.valueOf(this.f19334a.K()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        C2114z c2114z = (C2114z) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                c2114z.l(this.f19334a.K());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            c2114z.l(this.f19334a.K());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    @Override // com.google.protobuf.m0
    public Object h(Class cls, C2106q c2106q) throws B.a {
        Y(2);
        return V(j0.a().c(cls), c2106q);
    }

    @Override // com.google.protobuf.m0
    public void i(Object obj, n0 n0Var, C2106q c2106q) throws B.a {
        Y(3);
        R(obj, n0Var, c2106q);
    }

    @Override // com.google.protobuf.m0
    public int j() throws B.a {
        Y(5);
        return this.f19334a.u();
    }

    @Override // com.google.protobuf.m0
    public boolean k() throws B.a {
        Y(0);
        return this.f19334a.q();
    }

    @Override // com.google.protobuf.m0
    public void l(List list, n0 n0Var, C2106q c2106q) throws B.a {
        int iJ;
        if (C0.b(this.f19335b) != 2) {
            throw B.e();
        }
        int i8 = this.f19335b;
        do {
            list.add(V(n0Var, c2106q));
            if (this.f19334a.g() || this.f19337d != 0) {
                return;
            } else {
                iJ = this.f19334a.J();
            }
        } while (iJ == i8);
        this.f19337d = iJ;
    }

    @Override // com.google.protobuf.m0
    public long m() throws B.a {
        Y(1);
        return this.f19334a.E();
    }

    @Override // com.google.protobuf.m0
    public void n(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof J)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f19334a.L()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Long.valueOf(this.f19334a.L()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        J j8 = (J) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                j8.t(this.f19334a.L());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            j8.t(this.f19334a.L());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    @Override // com.google.protobuf.m0
    public int o() throws B.a {
        Y(0);
        return this.f19334a.K();
    }

    @Override // com.google.protobuf.m0
    public void p(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof J)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f19334a.z()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Long.valueOf(this.f19334a.z()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        J j8 = (J) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                j8.t(this.f19334a.z());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            j8.t(this.f19334a.z());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    @Override // com.google.protobuf.m0
    public void q(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof J)) {
            int iB = C0.b(this.f19335b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f19334a.E()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iK = this.f19334a.K();
            a0(iK);
            int iF = this.f19334a.f() + iK;
            do {
                list.add(Long.valueOf(this.f19334a.E()));
            } while (this.f19334a.f() < iF);
            return;
        }
        J j8 = (J) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 1) {
            do {
                j8.t(this.f19334a.E());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iK2 = this.f19334a.K();
        a0(iK2);
        int iF2 = this.f19334a.f() + iK2;
        do {
            j8.t(this.f19334a.E());
        } while (this.f19334a.f() < iF2);
    }

    @Override // com.google.protobuf.m0
    public void r(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2114z)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19334a.y()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Integer.valueOf(this.f19334a.y()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        C2114z c2114z = (C2114z) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                c2114z.l(this.f19334a.y());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            c2114z.l(this.f19334a.y());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    @Override // com.google.protobuf.m0
    public double readDouble() throws B.a {
        Y(1);
        return this.f19334a.s();
    }

    @Override // com.google.protobuf.m0
    public float readFloat() throws B.a {
        Y(5);
        return this.f19334a.w();
    }

    @Override // com.google.protobuf.m0
    public void s(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2114z)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f19334a.t()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Integer.valueOf(this.f19334a.t()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        C2114z c2114z = (C2114z) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                c2114z.l(this.f19334a.t());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            c2114z.l(this.f19334a.t());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    @Override // com.google.protobuf.m0
    public int t() throws B.a {
        Y(0);
        return this.f19334a.t();
    }

    @Override // com.google.protobuf.m0
    public int u() {
        return this.f19335b;
    }

    @Override // com.google.protobuf.m0
    public void v(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2114z)) {
            int iB = C0.b(this.f19335b);
            if (iB == 2) {
                int iK = this.f19334a.K();
                Z(iK);
                int iF = this.f19334a.f() + iK;
                do {
                    list.add(Integer.valueOf(this.f19334a.u()));
                } while (this.f19334a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw B.e();
            }
            do {
                list.add(Integer.valueOf(this.f19334a.u()));
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ = this.f19334a.J();
                }
            } while (iJ == this.f19335b);
            this.f19337d = iJ;
            return;
        }
        C2114z c2114z = (C2114z) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 2) {
            int iK2 = this.f19334a.K();
            Z(iK2);
            int iF2 = this.f19334a.f() + iK2;
            do {
                c2114z.l(this.f19334a.u());
            } while (this.f19334a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw B.e();
        }
        do {
            c2114z.l(this.f19334a.u());
            if (this.f19334a.g()) {
                return;
            } else {
                iJ2 = this.f19334a.J();
            }
        } while (iJ2 == this.f19335b);
        this.f19337d = iJ2;
    }

    @Override // com.google.protobuf.m0
    public int w() throws B.a {
        Y(0);
        return this.f19334a.F();
    }

    @Override // com.google.protobuf.m0
    public long x() throws B.a {
        Y(0);
        return this.f19334a.G();
    }

    @Override // com.google.protobuf.m0
    public void y(List list) throws B {
        int iJ;
        int iJ2;
        if (!(list instanceof C2095f)) {
            int iB = C0.b(this.f19335b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f19334a.q()));
                    if (this.f19334a.g()) {
                        return;
                    } else {
                        iJ = this.f19334a.J();
                    }
                } while (iJ == this.f19335b);
                this.f19337d = iJ;
                return;
            }
            if (iB != 2) {
                throw B.e();
            }
            int iF = this.f19334a.f() + this.f19334a.K();
            do {
                list.add(Boolean.valueOf(this.f19334a.q()));
            } while (this.f19334a.f() < iF);
            X(iF);
            return;
        }
        C2095f c2095f = (C2095f) list;
        int iB2 = C0.b(this.f19335b);
        if (iB2 == 0) {
            do {
                c2095f.t(this.f19334a.q());
                if (this.f19334a.g()) {
                    return;
                } else {
                    iJ2 = this.f19334a.J();
                }
            } while (iJ2 == this.f19335b);
            this.f19337d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw B.e();
        }
        int iF2 = this.f19334a.f() + this.f19334a.K();
        do {
            c2095f.t(this.f19334a.q());
        } while (this.f19334a.f() < iF2);
        X(iF2);
    }

    @Override // com.google.protobuf.m0
    public String z() throws B.a {
        Y(2);
        return this.f19334a.H();
    }
}
