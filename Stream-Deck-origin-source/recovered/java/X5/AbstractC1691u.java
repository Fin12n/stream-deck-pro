package X5;

import D6.C0938s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X5.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1691u {
    public static final List a(InterfaceC1689s interfaceC1689s) {
        List listC;
        kotlin.jvm.internal.t.g(interfaceC1689s, "<this>");
        String strD = interfaceC1689s.a().d(C1688q.f11910a.f());
        return (strD == null || (listC = AbstractC1687p.c(strD)) == null) ? D6.r.n() : listC;
    }

    public static final Charset b(InterfaceC1689s interfaceC1689s) {
        kotlin.jvm.internal.t.g(interfaceC1689s, "<this>");
        C1674c c1674cD = d(interfaceC1689s);
        if (c1674cD != null) {
            return AbstractC1676e.a(c1674cD);
        }
        return null;
    }

    public static final Long c(InterfaceC1689s interfaceC1689s) {
        kotlin.jvm.internal.t.g(interfaceC1689s, "<this>");
        String strD = interfaceC1689s.a().d(C1688q.f11910a.i());
        if (strD != null) {
            return Long.valueOf(Long.parseLong(strD));
        }
        return null;
    }

    public static final C1674c d(InterfaceC1689s interfaceC1689s) {
        kotlin.jvm.internal.t.g(interfaceC1689s, "<this>");
        String strD = interfaceC1689s.a().d(C1688q.f11910a.j());
        if (strD != null) {
            return C1674c.f11807f.b(strD);
        }
        return null;
    }

    public static final C1674c e(InterfaceC1690t interfaceC1690t) {
        kotlin.jvm.internal.t.g(interfaceC1690t, "<this>");
        String strI = interfaceC1690t.a().i(C1688q.f11910a.j());
        if (strI != null) {
            return C1674c.f11807f.b(strI);
        }
        return null;
    }

    public static final void f(InterfaceC1690t interfaceC1690t, C1674c type) {
        kotlin.jvm.internal.t.g(interfaceC1690t, "<this>");
        kotlin.jvm.internal.t.g(type, "type");
        interfaceC1690t.a().l(C1688q.f11910a.j(), type.toString());
    }

    public static final List g(InterfaceC1689s interfaceC1689s) {
        kotlin.jvm.internal.t.g(interfaceC1689s, "<this>");
        List listC = interfaceC1689s.a().c(C1688q.f11910a.E());
        if (listC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            List listA0 = Z6.w.A0((String) it.next(), new String[]{com.amazon.a.a.o.b.f.f16777a}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList(C0938s.y(listA0, 10));
            Iterator it2 = listA0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Z6.w.W0((String) it2.next()).toString());
            }
            D6.w.E(arrayList, arrayList2);
        }
        return arrayList;
    }
}
