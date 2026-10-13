package p136p1;

import android.text.Layout;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f31098a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f31099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Layout.Alignment f31100c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (t.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (t.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f31099b = alignment;
        f31100c = alignment2;
    }

    public final Layout.Alignment a(int i8) {
        if (i8 == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i8 == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (i8 == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i8 != 3) {
            return i8 != 4 ? Layout.Alignment.ALIGN_NORMAL : f31100c;
        }
        return f31099b;
    }
}
