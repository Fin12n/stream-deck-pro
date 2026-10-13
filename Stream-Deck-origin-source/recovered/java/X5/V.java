package X5;

import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V {
    public static final void b(p115m6.C c8, p115m6.C c9) {
        for (String str : c9.names()) {
            List listC = c9.c(str);
            if (listC == null) {
                listC = D6.r.n();
            }
            String strK = AbstractC1673b.k(str, 0, 0, false, null, 15, null);
            ArrayList arrayList = new ArrayList(C0938s.y(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1673b.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            c8.e(strK, arrayList);
        }
    }

    public static final void c(p115m6.C c8, p115m6.B b8) {
        for (String str : b8.names()) {
            List listC = b8.c(str);
            if (listC == null) {
                listC = D6.r.n();
            }
            String strM = AbstractC1673b.m(str, false, 1, null);
            ArrayList arrayList = new ArrayList(C0938s.y(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1673b.n((String) it.next()));
            }
            c8.e(strM, arrayList);
        }
    }

    public static final C d(p115m6.C parameters) {
        kotlin.jvm.internal.t.g(parameters, "parameters");
        D dB = G.b(0, 1, null);
        b(dB, parameters);
        return dB.build();
    }

    public static final D e(p115m6.B parameters) {
        kotlin.jvm.internal.t.g(parameters, "parameters");
        D dB = G.b(0, 1, null);
        c(dB, parameters);
        return dB;
    }
}
