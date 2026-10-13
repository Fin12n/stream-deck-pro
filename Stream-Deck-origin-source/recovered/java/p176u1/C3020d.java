package p176u1;

import Q0.h;
import R0.M0;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: renamed from: u1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3020d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3020d f34422a = new C3020d();

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, h hVar) {
        return builder.setEditorBoundsInfo(AbstractC3019c.a().setEditorBounds(M0.a(hVar)).setHandwritingBounds(M0.a(hVar)).build());
    }
}
