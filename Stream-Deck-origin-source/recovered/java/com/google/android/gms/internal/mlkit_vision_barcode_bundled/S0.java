package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S0 implements I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0 f18017a;

    public S0(R0 r8) {
        Charset charset = AbstractC1953s1.f18650a;
        this.f18017a = r8;
        r8.f18016a = this;
    }

    public static S0 L(R0 r8) {
        S0 s8 = r8.f18016a;
        return s8 != null ? s8 : new S0(r8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void A(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18017a.l(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).getClass();
            i10 += 8;
        }
        this.f18017a.w(i10);
        while (i9 < list.size()) {
            this.f18017a.m(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void B(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C1874c1)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18017a.j(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                    i9++;
                }
                return;
            }
            this.f18017a.u(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Float) list.get(i11)).getClass();
                i10 += 4;
            }
            this.f18017a.w(i10);
            while (i9 < list.size()) {
                this.f18017a.k(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        C1874c1 c1874c1 = (C1874c1) list;
        if (!z8) {
            while (i9 < c1874c1.size()) {
                this.f18017a.j(i8, Float.floatToRawIntBits(c1874c1.m(i9)));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c1874c1.size(); i13++) {
            c1874c1.m(i13);
            i12 += 4;
        }
        this.f18017a.w(i12);
        while (i9 < c1874c1.size()) {
            this.f18017a.k(Float.floatToRawIntBits(c1874c1.m(i9)));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void C(int i8, int i9) {
        this.f18017a.v(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void D(int i8, long j8) {
        this.f18017a.l(i8, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void E(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f18017a.t(i8, (String) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void F(int i8, long j8) {
        this.f18017a.x(i8, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void G(int i8) {
        this.f18017a.u(i8, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void H(int i8) {
        this.f18017a.u(i8, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void I(int i8, Object obj, InterfaceC1890f2 interfaceC1890f2) {
        this.f18017a.q(i8, (M1) obj, interfaceC1890f2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void J(int i8, J0 j8) {
        this.f18017a.i(i8, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void K(int i8, Object obj, InterfaceC1890f2 interfaceC1890f2) {
        R0 r8 = this.f18017a;
        r8.u(i8, 3);
        interfaceC1890f2.i((M1) obj, r8.f18016a);
        r8.u(i8, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void a(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f18017a.i(i8, (J0) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void b(int i8, String str) {
        this.f18017a.t(i8, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void c(int i8, int i9) {
        this.f18017a.v(i8, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void d(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C1919l1)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18017a.j(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18017a.u(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            this.f18017a.w(i10);
            while (i9 < list.size()) {
                this.f18017a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        if (!z8) {
            while (i9 < c1919l1.size()) {
                this.f18017a.j(i8, c1919l1.m(i9));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c1919l1.size(); i13++) {
            c1919l1.m(i13);
            i12 += 4;
        }
        this.f18017a.w(i12);
        while (i9 < c1919l1.size()) {
            this.f18017a.k(c1919l1.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void e(int i8, int i9) {
        this.f18017a.j(i8, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void f(int i8, boolean z8) {
        this.f18017a.h(i8, z8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void g(int i8, long j8) {
        this.f18017a.x(i8, j8);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void h(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18017a.h(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).getClass();
            i10++;
        }
        this.f18017a.w(i10);
        while (i9 < list.size()) {
            this.f18017a.g(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void i(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C1919l1)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18017a.v(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18017a.u(i8, 2);
            int iA = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iA += R0.a(((Integer) list.get(i10)).intValue());
            }
            this.f18017a.w(iA);
            while (i9 < list.size()) {
                this.f18017a.w(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        if (!z8) {
            while (i9 < c1919l1.size()) {
                this.f18017a.v(i8, c1919l1.m(i9));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int iA2 = 0;
        for (int i11 = 0; i11 < c1919l1.size(); i11++) {
            iA2 += R0.a(c1919l1.m(i11));
        }
        this.f18017a.w(iA2);
        while (i9 < c1919l1.size()) {
            this.f18017a.w(c1919l1.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void j(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C1919l1)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18017a.j(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18017a.u(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            this.f18017a.w(i10);
            while (i9 < list.size()) {
                this.f18017a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        if (!z8) {
            while (i9 < c1919l1.size()) {
                this.f18017a.j(i8, c1919l1.m(i9));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c1919l1.size(); i13++) {
            c1919l1.m(i13);
            i12 += 4;
        }
        this.f18017a.w(i12);
        while (i9 < c1919l1.size()) {
            this.f18017a.k(c1919l1.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void k(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18017a.l(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            i10 += 8;
        }
        this.f18017a.w(i10);
        while (i9 < list.size()) {
            this.f18017a.m(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void l(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C1919l1)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18017a.n(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18017a.u(i8, 2);
            int iB = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iB += R0.b(((Integer) list.get(i10)).intValue());
            }
            this.f18017a.w(iB);
            while (i9 < list.size()) {
                this.f18017a.o(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        if (!z8) {
            while (i9 < c1919l1.size()) {
                this.f18017a.n(i8, c1919l1.m(i9));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int iB2 = 0;
        for (int i11 = 0; i11 < c1919l1.size(); i11++) {
            iB2 += R0.b(c1919l1.m(i11));
        }
        this.f18017a.w(iB2);
        while (i9 < c1919l1.size()) {
            this.f18017a.o(c1919l1.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void m(int i8, long j8) {
        this.f18017a.l(i8, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void n(int i8, int i9) {
        this.f18017a.n(i8, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void o(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C1919l1)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18017a.n(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18017a.u(i8, 2);
            int iB = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iB += R0.b(((Integer) list.get(i10)).intValue());
            }
            this.f18017a.w(iB);
            while (i9 < list.size()) {
                this.f18017a.o(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        if (!z8) {
            while (i9 < c1919l1.size()) {
                this.f18017a.n(i8, c1919l1.m(i9));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int iB2 = 0;
        for (int i11 = 0; i11 < c1919l1.size(); i11++) {
            iB2 += R0.b(c1919l1.m(i11));
        }
        this.f18017a.w(iB2);
        while (i9 < c1919l1.size()) {
            this.f18017a.o(c1919l1.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void p(int i8, int i9) {
        this.f18017a.n(i8, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void q(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C1919l1)) {
            if (!z8) {
                while (i9 < list.size()) {
                    R0 r8 = this.f18017a;
                    int iIntValue = ((Integer) list.get(i9)).intValue();
                    r8.v(i8, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i9++;
                }
                return;
            }
            this.f18017a.u(i8, 2);
            int iA = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int iIntValue2 = ((Integer) list.get(i10)).intValue();
                iA += R0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f18017a.w(iA);
            while (i9 < list.size()) {
                R0 r9 = this.f18017a;
                int iIntValue3 = ((Integer) list.get(i9)).intValue();
                r9.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i9++;
            }
            return;
        }
        C1919l1 c1919l1 = (C1919l1) list;
        if (!z8) {
            while (i9 < c1919l1.size()) {
                R0 r10 = this.f18017a;
                int iM = c1919l1.m(i9);
                r10.v(i8, (iM >> 31) ^ (iM + iM));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int iA2 = 0;
        for (int i11 = 0; i11 < c1919l1.size(); i11++) {
            int iM2 = c1919l1.m(i11);
            iA2 += R0.a((iM2 >> 31) ^ (iM2 + iM2));
        }
        this.f18017a.w(iA2);
        while (i9 < c1919l1.size()) {
            R0 r11 = this.f18017a;
            int iM3 = c1919l1.m(i9);
            r11.w((iM3 >> 31) ^ (iM3 + iM3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void r(int i8, double d8) {
        this.f18017a.l(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void s(int i8, long j8) {
        this.f18017a.x(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void t(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18017a.x(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int iB = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iB += R0.b(((Long) list.get(i10)).longValue());
        }
        this.f18017a.w(iB);
        while (i9 < list.size()) {
            this.f18017a.y(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void u(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18017a.l(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            i10 += 8;
        }
        this.f18017a.w(i10);
        while (i9 < list.size()) {
            this.f18017a.m(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void v(int i8, float f8) {
        this.f18017a.j(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void w(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18017a.x(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int iB = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iB += R0.b(((Long) list.get(i10)).longValue());
        }
        this.f18017a.w(iB);
        while (i9 < list.size()) {
            this.f18017a.y(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void x(int i8, Object obj) {
        if (obj instanceof J0) {
            this.f18017a.s(i8, (J0) obj);
        } else {
            this.f18017a.r(i8, (M1) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void y(int i8, int i9) {
        this.f18017a.j(i8, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2
    public final void z(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                R0 r8 = this.f18017a;
                long jLongValue = ((Long) list.get(i9)).longValue();
                r8.x(i8, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i9++;
            }
            return;
        }
        this.f18017a.u(i8, 2);
        int iB = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jLongValue2 = ((Long) list.get(i10)).longValue();
            iB += R0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f18017a.w(iB);
        while (i9 < list.size()) {
            R0 r9 = this.f18017a;
            long jLongValue3 = ((Long) list.get(i9)).longValue();
            r9.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i9++;
        }
    }
}
