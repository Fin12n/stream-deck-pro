package p176u1;

import Q0.h;
import android.view.inputmethod.CursorAnchorInfo;
import p128o1.E;

/* JADX INFO: renamed from: u1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3021e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3021e f34423a = new C3021e();

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, E e8, h hVar) {
        int iR;
        int iR2;
        if (!hVar.q() && (iR = e8.r(hVar.l())) <= (iR2 = e8.r(hVar.e()))) {
            while (true) {
                builder.addVisibleLineBounds(e8.s(iR), e8.v(iR), e8.t(iR), e8.m(iR));
                if (iR == iR2) {
                    break;
                }
                iR++;
            }
        }
        return builder;
    }
}
