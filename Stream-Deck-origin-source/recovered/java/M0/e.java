package M0;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f5070a = new e();

    public final int a(ViewStructure viewStructure, int i8) {
        return viewStructure.addChildCount(i8);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i8) {
        return viewStructure.newChild(i8);
    }

    public final void c(ViewStructure viewStructure, int i8, int i9, int i10, int i11, int i12, int i13) {
        viewStructure.setDimens(i8, i9, i10, i11, i12, i13);
    }

    public final void d(ViewStructure viewStructure, int i8, String str, String str2, String str3) {
        viewStructure.setId(i8, str, str2, str3);
    }
}
