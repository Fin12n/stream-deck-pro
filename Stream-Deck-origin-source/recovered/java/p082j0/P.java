package p082j0;

import A1.b;
import A1.t;
import S6.c;
import W6.n;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p038e1.G;
import p038e1.InterfaceC2243n;
import p038e1.J;
import p038e1.a0;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f27879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2598b.d f27880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2598b.l f27881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f27882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f27883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC2611o f27884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f27885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0[] f27886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q[] f27887i;

    public /* synthetic */ P(C c8, C2598b.d dVar, C2598b.l lVar, float f8, V v8, AbstractC2611o abstractC2611o, List list, a0[] a0VarArr, AbstractC2633k abstractC2633k) {
        this(c8, dVar, lVar, f8, v8, abstractC2611o, list, a0VarArr);
    }

    public final int a(a0 a0Var) {
        return this.f27879a == C.Horizontal ? a0Var.h0() : a0Var.y0();
    }

    public final int b(a0 a0Var, Q q8, int i8, t tVar, int i9) {
        AbstractC2611o abstractC2611oA;
        if (q8 == null || (abstractC2611oA = q8.a()) == null) {
            abstractC2611oA = this.f27884f;
        }
        int iA = i8 - a(a0Var);
        if (this.f27879a == C.Horizontal) {
            tVar = t.Ltr;
        }
        return abstractC2611oA.a(iA, tVar, a0Var, i9);
    }

    public final int[] c(int i8, int[] iArr, int[] iArr2, J j8) {
        if (this.f27879a == C.Vertical) {
            C2598b.l lVar = this.f27881c;
            if (lVar == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column");
            }
            lVar.b(j8, i8, iArr, iArr2);
            return iArr2;
        }
        C2598b.d dVar = this.f27880b;
        if (dVar == null) {
            throw new IllegalArgumentException("null horizontalArrangement in Row");
        }
        dVar.c(j8, i8, iArr, j8.getLayoutDirection(), iArr2);
        return iArr2;
    }

    public final int d(a0 a0Var) {
        return this.f27879a == C.Horizontal ? a0Var.y0() : a0Var.h0();
    }

    public final void f(a0.a aVar, N n8, int i8, t tVar) {
        int iC = n8.c();
        for (int iF = n8.f(); iF < iC; iF++) {
            a0 a0Var = this.f27886h[iF];
            kotlin.jvm.internal.t.d(a0Var);
            int[] iArrD = n8.d();
            Object objE = ((G) this.f27885g.get(iF)).e();
            int iB = b(a0Var, objE instanceof Q ? (Q) objE : null, n8.b(), tVar, n8.a()) + i8;
            if (this.f27879a == C.Horizontal) {
                a0.a.f(aVar, a0Var, iArrD[iF - n8.f()], iB, 0.0f, 4, null);
            } else {
                a0.a.f(aVar, a0Var, iB, iArrD[iF - n8.f()], 0.0f, 4, null);
            }
        }
    }

    public P(C c8, C2598b.d dVar, C2598b.l lVar, float f8, V v8, AbstractC2611o abstractC2611o, List list, a0[] a0VarArr) {
        this.f27879a = c8;
        this.f27880b = dVar;
        this.f27881c = lVar;
        this.f27882d = f8;
        this.f27883e = v8;
        this.f27884f = abstractC2611o;
        this.f27885g = list;
        this.f27886h = a0VarArr;
        int size = list.size();
        Q[] qArr = new Q[size];
        for (int i8 = 0; i8 < size; i8++) {
            qArr[i8] = M.l((InterfaceC2243n) this.f27885g.get(i8));
        }
        this.f27887i = qArr;
    }

    public final N e(J j8, long j9, int i8, int i9) throws Throwable {
        long j10;
        String str;
        String str2;
        String str3;
        float f8;
        long j11;
        P p8;
        int i10;
        int iM;
        long j12;
        String str4;
        int i11;
        long j13;
        float f9;
        String str5;
        int i12;
        int i13;
        int iMax;
        int i14;
        float f10;
        long j14;
        long j15;
        int iMax2;
        int i15;
        long j16;
        int i16 = i9;
        long jC = H.c(j9, this.f27879a);
        long jV0 = j8.V0(this.f27882d);
        int i17 = i16 - i8;
        int i18 = i8;
        int i19 = 0;
        float f11 = 0.0f;
        int i20 = 0;
        long jD = 0;
        int i21 = 0;
        boolean z8 = false;
        while (true) {
            int iE = Integer.MAX_VALUE;
            if (i18 >= i16) {
                break;
            }
            G g8 = (G) this.f27885g.get(i18);
            Q q8 = this.f27887i[i18];
            float fM = M.m(q8);
            if (fM > 0.0f) {
                float f12 = f11 + fM;
                i15 = i19 + 1;
                i17 = i17;
                f10 = f12;
                i18 = i18;
                iMax2 = i20;
            } else {
                int iN = b.n(jC);
                a0 a0VarJ = this.f27886h[i18];
                if (a0VarJ == null) {
                    if (iN == Integer.MAX_VALUE) {
                        j16 = 0;
                    } else {
                        j16 = 0;
                        iE = (int) n.e(((long) iN) - jD, 0L);
                    }
                    f10 = f11;
                    j15 = j16;
                    jC = jC;
                    j14 = jD;
                    a0VarJ = g8.J(H.f(H.e(jC, 0, iE, 0, 0, 8, null), this.f27879a));
                } else {
                    f10 = f11;
                    j14 = jD;
                    j15 = 0;
                }
                int iMin = Math.min((int) jV0, (int) n.e((((long) iN) - j14) - ((long) d(a0VarJ)), j15));
                jD = j14 + ((long) (d(a0VarJ) + iMin));
                iMax2 = Math.max(i20, a(a0VarJ));
                z8 = z8 || M.q(q8);
                this.f27886h[i18] = a0VarJ;
                i15 = i19;
                i21 = iMin;
            }
            i18++;
            i17 = i17;
            i20 = iMax2;
            i19 = i15;
            f11 = f10;
        }
        int i22 = i19;
        float f13 = f11;
        int i23 = i17;
        long j17 = jD;
        int i24 = i20;
        if (i22 == 0) {
            j10 = jC;
            i10 = i24;
            p8 = this;
            j12 = j17 - ((long) i21);
            iM = 0;
        } else {
            int iP = (f13 <= 0.0f || b.n(jC) == Integer.MAX_VALUE) ? b.p(jC) : b.n(jC);
            long j18 = ((long) (i22 - 1)) * jV0;
            long jE = n.e((((long) iP) - j17) - j18, 0L);
            float f14 = f13 > 0.0f ? jE / f13 : 0.0f;
            int i25 = i8;
            long jD2 = jE;
            while (true) {
                j10 = jC;
                str = hJroAgFztiMK.CzB;
                str2 = GOKsbdzhLhXAMt.yVosYvTLxnJAQS;
                str3 = "fixedSpace ";
                f8 = f14;
                j11 = jE;
                if (i25 >= i16) {
                    break;
                }
                int i26 = i25;
                float fM2 = M.m(this.f27887i[i26]);
                float f15 = f8 * fM2;
                try {
                    jD2 -= (long) c.d(f15);
                    i25 = i26 + 1;
                    i16 = i9;
                    jC = j10;
                    f14 = f8;
                    jE = j11;
                } catch (IllegalArgumentException e8) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + b.n(j10) + "mainAxisMin " + b.p(j10) + "targetSpace " + iP + "arrangementSpacingPx " + jV0 + "weightChildrenCount " + i22 + "fixedSpace " + j17 + str2 + j18 + str + j11 + "totalWeight " + f13 + "weightUnitSpace " + f8 + "itemWeight " + fM2 + "weightedSize " + f15).initCause(e8);
                }
            }
            String str6 = str;
            long j19 = j17;
            float f16 = f13;
            int iMax3 = i24;
            int i27 = 0;
            int i28 = i8;
            while (i28 < i9) {
                int i29 = i27;
                if (this.f27886h[i28] == null) {
                    G g9 = (G) this.f27885g.get(i28);
                    i11 = i28;
                    Q q9 = this.f27887i[i11];
                    float fM3 = M.m(q9);
                    if (fM3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iB = c.b(jD2);
                    long j20 = j19;
                    jD2 -= (long) iB;
                    float f17 = f8 * fM3;
                    int iMax4 = Math.max(0, c.d(f17) + iB);
                    try {
                        f9 = f17;
                        try {
                            str4 = str2;
                            str5 = str3;
                            i12 = i22;
                            try {
                                a0 a0VarJ2 = g9.J(H.f(H.a((!M.k(q9) || iMax4 == Integer.MAX_VALUE) ? 0 : iMax4, iMax4, 0, b.m(j10)), this.f27879a));
                                int iD = i29 + d(a0VarJ2);
                                iMax3 = Math.max(iMax3, a(a0VarJ2));
                                boolean z9 = z8 || M.q(q9);
                                this.f27886h[i11] = a0VarJ2;
                                z8 = z9;
                                i29 = iD;
                                j13 = j20;
                                i22 = i12;
                                str3 = str5;
                            } catch (IllegalArgumentException e9) {
                                e = e9;
                                throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + b.n(j10) + "mainAxisMin " + b.p(j10) + "targetSpace " + iP + "arrangementSpacingPx " + jV0 + "weightChildrenCount " + i12 + str5 + j20 + str4 + j18 + str6 + j11 + "totalWeight " + f16 + "weightUnitSpace " + f8 + "weight " + fM3 + "weightedSize " + f9 + "remainderUnit " + iB + "childMainAxisSize " + iMax4).initCause(e);
                            }
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            str4 = str2;
                            str5 = str3;
                            i12 = i22;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + b.n(j10) + "mainAxisMin " + b.p(j10) + "targetSpace " + iP + "arrangementSpacingPx " + jV0 + "weightChildrenCount " + i12 + str5 + j20 + str4 + j18 + str6 + j11 + "totalWeight " + f16 + "weightUnitSpace " + f8 + "weight " + fM3 + "weightedSize " + f9 + "remainderUnit " + iB + "childMainAxisSize " + iMax4).initCause(e);
                        }
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        f9 = f17;
                    }
                } else {
                    str4 = str2;
                    i11 = i28;
                    j13 = j19;
                }
                f16 = f16;
                str2 = str4;
                str6 = str6;
                long j21 = j13;
                i28 = i11 + 1;
                j19 = j21;
                i27 = i29;
            }
            long j22 = j19;
            p8 = this;
            i10 = iMax3;
            iM = (int) n.m(((long) i27) + j18, 0L, ((long) b.n(j10)) - j22);
            j12 = j22;
        }
        if (z8) {
            i13 = i9;
            int iMax5 = 0;
            iMax = 0;
            for (int i30 = i8; i30 < i13; i30++) {
                a0 a0Var = p8.f27886h[i30];
                kotlin.jvm.internal.t.d(a0Var);
                AbstractC2611o abstractC2611oJ = M.j(p8.f27887i[i30]);
                Integer numB = abstractC2611oJ != null ? abstractC2611oJ.b(a0Var) : null;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = 0;
                    }
                    iMax5 = Math.max(iMax5, iIntValue);
                    int iA = p8.a(a0Var);
                    int iIntValue2 = numB.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = p8.a(a0Var);
                    }
                    iMax = Math.max(iMax, iA - iIntValue2);
                }
            }
            i14 = iMax5;
        } else {
            i13 = i9;
            iMax = 0;
            i14 = 0;
        }
        int iMax6 = Math.max((int) n.e(j12 + ((long) iM), 0L), b.p(j10));
        int iMax7 = (b.m(j10) == Integer.MAX_VALUE || p8.f27883e != V.Expand) ? Math.max(i10, Math.max(b.o(j10), iMax + i14)) : b.m(j10);
        int[] iArr = new int[i23];
        for (int i31 = 0; i31 < i23; i31++) {
            iArr[i31] = 0;
        }
        int[] iArr2 = new int[i23];
        for (int i32 = 0; i32 < i23; i32++) {
            a0 a0Var2 = p8.f27886h[i32 + i8];
            kotlin.jvm.internal.t.d(a0Var2);
            iArr2[i32] = p8.d(a0Var2);
        }
        return new N(iMax7, iMax6, i8, i13, i14, p8.c(iMax6, iArr2, iArr, j8));
    }
}
