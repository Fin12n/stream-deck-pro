package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1996b0 implements O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1992a0 f18876a;

    public C1996b0(AbstractC1992a0 abstractC1992a0) {
        Charset charset = AbstractC2081y0.f19031a;
        this.f18876a = abstractC1992a0;
        abstractC1992a0.f18874a = this;
    }

    public static C1996b0 L(AbstractC1992a0 abstractC1992a0) {
        C1996b0 c1996b0 = abstractC1992a0.f18874a;
        return c1996b0 != null ? c1996b0 : new C1996b0(abstractC1992a0);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void A(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18876a.i(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).getClass();
            i10 += 8;
        }
        this.f18876a.q(i10);
        while (i9 < list.size()) {
            this.f18876a.j(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void B(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18876a.g(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).getClass();
            i10 += 4;
        }
        this.f18876a.q(i10);
        while (i9 < list.size()) {
            this.f18876a.h(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void C(int i8, int i9) {
        this.f18876a.p(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void D(int i8, long j8) {
        this.f18876a.i(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void E(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof F0)) {
            while (i9 < list.size()) {
                this.f18876a.n(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        F0 f8 = (F0) list;
        while (i9 < list.size()) {
            Object objN = f8.n(i9);
            if (objN instanceof String) {
                this.f18876a.n(i8, (String) objN);
            } else {
                this.f18876a.f(i8, (S) objN);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void F(int i8, long j8) {
        this.f18876a.r(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void G(int i8) {
        this.f18876a.o(i8, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void H(int i8) {
        this.f18876a.o(i8, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void I(int i8, Object obj, InterfaceC2017g1 interfaceC2017g1) {
        AbstractC1992a0 abstractC1992a0 = this.f18876a;
        abstractC1992a0.o(i8, 3);
        interfaceC2017g1.h((V0) obj, abstractC1992a0.f18874a);
        abstractC1992a0.o(i8, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void J(int i8, S s8) {
        this.f18876a.f(i8, s8);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void K(int i8, Object obj, InterfaceC2017g1 interfaceC2017g1) {
        V0 v8 = (V0) obj;
        X x8 = (X) this.f18876a;
        x8.q((i8 << 3) | 2);
        x8.q(((AbstractC2083z) v8).c(interfaceC2017g1));
        interfaceC2017g1.h(v8, x8.f18874a);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void a(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f18876a.f(i8, (S) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void b(int i8, String str) {
        this.f18876a.n(i8, str);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void c(int i8, int i9) {
        this.f18876a.p(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void d(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2059r0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18876a.g(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18876a.o(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            this.f18876a.q(i10);
            while (i9 < list.size()) {
                this.f18876a.h(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        if (!z8) {
            while (i9 < c2059r0.size()) {
                this.f18876a.g(i8, c2059r0.m(i9));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2059r0.size(); i13++) {
            c2059r0.m(i13);
            i12 += 4;
        }
        this.f18876a.q(i12);
        while (i9 < c2059r0.size()) {
            this.f18876a.h(c2059r0.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void e(int i8, int i9) {
        this.f18876a.g(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void f(int i8, boolean z8) {
        this.f18876a.e(i8, z8);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void g(int i8, long j8) {
        this.f18876a.r(i8, j8);
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
    @Override // com.google.android.gms.internal.play_billing.O1
    public final void h(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18876a.e(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).getClass();
            i10++;
        }
        this.f18876a.q(i10);
        while (i9 < list.size()) {
            this.f18876a.d(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void i(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2059r0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18876a.p(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18876a.o(i8, 2);
            int iW = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iW += AbstractC1992a0.w(((Integer) list.get(i10)).intValue());
            }
            this.f18876a.q(iW);
            while (i9 < list.size()) {
                this.f18876a.q(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        if (!z8) {
            while (i9 < c2059r0.size()) {
                this.f18876a.p(i8, c2059r0.m(i9));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int iW2 = 0;
        for (int i11 = 0; i11 < c2059r0.size(); i11++) {
            iW2 += AbstractC1992a0.w(c2059r0.m(i11));
        }
        this.f18876a.q(iW2);
        while (i9 < c2059r0.size()) {
            this.f18876a.q(c2059r0.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void j(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2059r0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18876a.g(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18876a.o(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).getClass();
                i10 += 4;
            }
            this.f18876a.q(i10);
            while (i9 < list.size()) {
                this.f18876a.h(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        if (!z8) {
            while (i9 < c2059r0.size()) {
                this.f18876a.g(i8, c2059r0.m(i9));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2059r0.size(); i13++) {
            c2059r0.m(i13);
            i12 += 4;
        }
        this.f18876a.q(i12);
        while (i9 < c2059r0.size()) {
            this.f18876a.h(c2059r0.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void k(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18876a.i(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            i10 += 8;
        }
        this.f18876a.q(i10);
        while (i9 < list.size()) {
            this.f18876a.j(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void l(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2059r0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18876a.k(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18876a.o(i8, 2);
            int iX = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iX += AbstractC1992a0.x(((Integer) list.get(i10)).intValue());
            }
            this.f18876a.q(iX);
            while (i9 < list.size()) {
                this.f18876a.l(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        if (!z8) {
            while (i9 < c2059r0.size()) {
                this.f18876a.k(i8, c2059r0.m(i9));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int iX2 = 0;
        for (int i11 = 0; i11 < c2059r0.size(); i11++) {
            iX2 += AbstractC1992a0.x(c2059r0.m(i11));
        }
        this.f18876a.q(iX2);
        while (i9 < c2059r0.size()) {
            this.f18876a.l(c2059r0.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void m(int i8, long j8) {
        this.f18876a.i(i8, j8);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void n(int i8, int i9) {
        this.f18876a.k(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void o(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2059r0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f18876a.k(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f18876a.o(i8, 2);
            int iX = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iX += AbstractC1992a0.x(((Integer) list.get(i10)).intValue());
            }
            this.f18876a.q(iX);
            while (i9 < list.size()) {
                this.f18876a.l(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        if (!z8) {
            while (i9 < c2059r0.size()) {
                this.f18876a.k(i8, c2059r0.m(i9));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int iX2 = 0;
        for (int i11 = 0; i11 < c2059r0.size(); i11++) {
            iX2 += AbstractC1992a0.x(c2059r0.m(i11));
        }
        this.f18876a.q(iX2);
        while (i9 < c2059r0.size()) {
            this.f18876a.l(c2059r0.m(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void p(int i8, int i9) {
        this.f18876a.k(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void q(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2059r0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    AbstractC1992a0 abstractC1992a0 = this.f18876a;
                    int iIntValue = ((Integer) list.get(i9)).intValue();
                    abstractC1992a0.p(i8, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i9++;
                }
                return;
            }
            this.f18876a.o(i8, 2);
            int iW = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int iIntValue2 = ((Integer) list.get(i10)).intValue();
                iW += AbstractC1992a0.w((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f18876a.q(iW);
            while (i9 < list.size()) {
                AbstractC1992a0 abstractC1992a1 = this.f18876a;
                int iIntValue3 = ((Integer) list.get(i9)).intValue();
                abstractC1992a1.q((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i9++;
            }
            return;
        }
        C2059r0 c2059r0 = (C2059r0) list;
        if (!z8) {
            while (i9 < c2059r0.size()) {
                AbstractC1992a0 abstractC1992a2 = this.f18876a;
                int iM = c2059r0.m(i9);
                abstractC1992a2.p(i8, (iM >> 31) ^ (iM + iM));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int iW2 = 0;
        for (int i11 = 0; i11 < c2059r0.size(); i11++) {
            int iM2 = c2059r0.m(i11);
            iW2 += AbstractC1992a0.w((iM2 >> 31) ^ (iM2 + iM2));
        }
        this.f18876a.q(iW2);
        while (i9 < c2059r0.size()) {
            AbstractC1992a0 abstractC1992a3 = this.f18876a;
            int iM3 = c2059r0.m(i9);
            abstractC1992a3.q((iM3 >> 31) ^ (iM3 + iM3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void r(int i8, double d8) {
        this.f18876a.i(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void s(int i8, long j8) {
        this.f18876a.r(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void t(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18876a.r(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int iX = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iX += AbstractC1992a0.x(((Long) list.get(i10)).longValue());
        }
        this.f18876a.q(iX);
        while (i9 < list.size()) {
            this.f18876a.s(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void u(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18876a.i(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            i10 += 8;
        }
        this.f18876a.q(i10);
        while (i9 < list.size()) {
            this.f18876a.j(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void v(int i8, float f8) {
        this.f18876a.g(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void w(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f18876a.r(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int iX = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iX += AbstractC1992a0.x(((Long) list.get(i10)).longValue());
        }
        this.f18876a.q(iX);
        while (i9 < list.size()) {
            this.f18876a.s(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void x(int i8, Object obj) {
        if (obj instanceof S) {
            X x8 = (X) this.f18876a;
            x8.q(11);
            x8.p(2, i8);
            x8.f(3, (S) obj);
            x8.q(12);
            return;
        }
        AbstractC1992a0 abstractC1992a0 = this.f18876a;
        V0 v8 = (V0) obj;
        X x9 = (X) abstractC1992a0;
        x9.q(11);
        x9.p(2, i8);
        x9.q(26);
        x9.q(v8.l());
        v8.b(abstractC1992a0);
        x9.q(12);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void y(int i8, int i9) {
        this.f18876a.g(i8, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final void z(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                AbstractC1992a0 abstractC1992a0 = this.f18876a;
                long jLongValue = ((Long) list.get(i9)).longValue();
                abstractC1992a0.r(i8, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i9++;
            }
            return;
        }
        this.f18876a.o(i8, 2);
        int iX = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jLongValue2 = ((Long) list.get(i10)).longValue();
            iX += AbstractC1992a0.x((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f18876a.q(iX);
        while (i9 < list.size()) {
            AbstractC1992a0 abstractC1992a1 = this.f18876a;
            long jLongValue3 = ((Long) list.get(i9)).longValue();
            abstractC1992a1.s((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i9++;
        }
    }
}
