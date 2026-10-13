package p176u1;

import A1.r;
import Q0.h;
import W6.n;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import p128o1.E;
import p128o1.G;
import p128o1.H;
import p216z1.i;

/* JADX INFO: renamed from: u1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3022f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i8, int i9, D d8, E e8, h hVar) {
        ?? r8;
        int iB = d8.b(i8);
        int iB2 = d8.b(i9);
        float[] fArr = new float[(iB2 - iB) * 4];
        e8.w().a(H.b(iB, iB2), fArr, 0);
        for (int i10 = i8; i10 < i9; i10++) {
            int iB3 = d8.b(i10);
            int i11 = (iB3 - iB) * 4;
            h hVar2 = new h(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]);
            boolean zR = hVar.r(hVar2);
            if (!c(hVar, hVar2.i(), hVar2.l()) || !c(hVar, hVar2.j(), hVar2.e())) {
                r8 = zR;
                r8 = (zR ? 1 : 0) | 2;
            }
            r8 = zR;
            if (e8.c(iB3) == i.Rtl) {
                r8 = (r8 == true ? 1 : 0) | 4;
            }
            builder.addCharacterBounds(i10, hVar2.i(), hVar2.l(), hVar2.j(), hVar2.e(), r8 == true ? 1 : 0);
        }
        return builder;
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, M m8, D d8, E e8, Matrix matrix, h hVar, h hVar2, boolean z8, boolean z9, boolean z10, boolean z11) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = G.l(m8.g());
        builder.setSelectionRange(iL, G.k(m8.g()));
        if (z8) {
            d(builder, iL, d8, e8, hVar);
        }
        if (z9) {
            G gF = m8.f();
            int iL2 = gF != null ? G.l(gF.r()) : -1;
            G gF2 = m8.f();
            int iK = gF2 != null ? G.k(gF2.r()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, m8.h().subSequence(iL2, iK));
                a(builder, iL2, iK, d8, e8, hVar);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33 && z10) {
            C3020d.a(builder, hVar2);
        }
        if (i8 >= 34 && z11) {
            C3021e.a(builder, e8, hVar);
        }
        return builder.build();
    }

    public static final boolean c(h hVar, float f8, float f9) {
        float fI = hVar.i();
        if (f8 > hVar.j() || fI > f8) {
            return false;
        }
        return f9 <= hVar.e() && hVar.l() <= f9;
    }

    public static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i8, D d8, E e8, h hVar) {
        if (i8 < 0) {
            return builder;
        }
        int iB = d8.b(i8);
        h hVarE = e8.e(iB);
        float fJ = n.j(hVarE.i(), 0.0f, r.g(e8.B()));
        boolean zC = c(hVar, fJ, hVarE.l());
        boolean zC2 = c(hVar, fJ, hVarE.e());
        boolean z8 = e8.c(iB) == i.Rtl;
        int i9 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i9 |= 2;
        }
        if (z8) {
            i9 |= 4;
        }
        builder.setInsertionMarkerLocation(fJ, hVarE.l(), hVarE.e(), hVarE.e(), i9);
        return builder;
    }
}
