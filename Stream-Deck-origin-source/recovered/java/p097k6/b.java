package p097k6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import p116m7.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final List a(h format) {
        t.g(format, "format");
        List listA = a.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            e eVarA = ((f) it.next()).a(format);
            if (eVarA != null) {
                arrayList.add(eVarA);
            }
        }
        return arrayList;
    }
}
