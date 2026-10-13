package p166t;

import A.C0886n0;
import A.C0900v;
import A.C0904x;
import A.InterfaceC0896t;
import H.I;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p174u.e;
import p174u.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {
    public static String a(t tVar, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) tVar.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) tVar.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static List b(C2990y c2990y, C0900v c0900v, List list) throws C0886n0 {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            if (c0900v == null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strA = a(c2990y.a(), c0900v.d(), list);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!str.equals(strA)) {
                        arrayList2.add(c2990y.h(str));
                    }
                }
                Iterator it3 = c0900v.b(arrayList2).iterator();
                while (it3.hasNext()) {
                    arrayList.add(((I) ((InterfaceC0896t) it3.next())).e());
                }
            }
            return arrayList;
        } catch (C0904x e8) {
            throw new C0886n0(e8);
        } catch (e e9) {
            throw new C0886n0(Y0.a(e9));
        }
    }
}
