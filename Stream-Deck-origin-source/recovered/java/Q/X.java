package Q;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {
    public static String a(int i8) {
        ArrayList arrayList = new ArrayList();
        if ((i8 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i8 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i8 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join(com.amazon.a.a.o.b.f.f16779c, arrayList);
    }

    public static boolean b(int i8, int i9) {
        return (i8 & i9) == i9;
    }
}
