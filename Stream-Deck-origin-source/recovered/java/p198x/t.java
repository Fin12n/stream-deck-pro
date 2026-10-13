package p198x;

import H.j1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p190w.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraCroppingQuirk f37166a;

    public t() {
        this((ExtraCroppingQuirk) e.b(ExtraCroppingQuirk.class));
    }

    public List a(j1.d dVar, List list) {
        Size sizeD;
        ExtraCroppingQuirk extraCroppingQuirk = this.f37166a;
        if (extraCroppingQuirk == null || (sizeD = extraCroppingQuirk.d(dVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeD);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!size.equals(sizeD)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public t(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f37166a = extraCroppingQuirk;
    }
}
