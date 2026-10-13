package p166t;

import H.AbstractC0995o;
import H.AbstractC0997p;
import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: t.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2924b1 {
    public static CameraCaptureSession.CaptureCallback a(AbstractC0995o abstractC0995o) {
        if (abstractC0995o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(abstractC0995o, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : Z.a(arrayList);
    }

    public static void b(AbstractC0995o abstractC0995o, List list) {
        if (abstractC0995o instanceof AbstractC0997p.a) {
            Iterator it = ((AbstractC0997p.a) abstractC0995o).e().iterator();
            while (it.hasNext()) {
                b((AbstractC0995o) it.next(), list);
            }
        } else if (abstractC0995o instanceof C2921a1) {
            list.add(((C2921a1) abstractC0995o).f());
        } else {
            list.add(new Z0(abstractC0995o));
        }
    }
}
